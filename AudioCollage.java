import edu.princeton.cs.algs4.StdAudio;

public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha){
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = alpha * a[i];
        }

        return b;
    }
    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a){
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++){
            b[i] = a[a.length - i - 1];
        };

        return b;
    }
    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b){
        double[] c = new double[a.length + b.length];

        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }

        for (int i = 0; i < b.length; i++){
            c[i + a.length] = b[i];
        }

        return c;
    }
    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b){
        int maxLength = Math.max(a.length, b.length);
        double[] c = new double[maxLength];
    
        for (int i = 0; i < a.length; i++) {
            c[i] += a[i];
        }
    
        for (int i = 0; i < b.length; i++) {
            c[i] += b[i];
        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha){
        int N = (int) (a.length / alpha);
        double[] c = new double[N];

        for (int i = 0; i < N; i++){
            int index = (int) (i * alpha);
            c[i] = a[index]; 
        }

        return c;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args){
        // Read WAV files and extract samples
        double[] sound1 = StdAudio.read("beatbox.wav");
        double[] sound2 = StdAudio.read("chimes.wav");
        double[] sound3 = StdAudio.read("buzzer.wav");
        double[] sound4 = StdAudio.read("cow.wav");
        double[] sound5 = StdAudio.read("harp.wav");
        // Apply audio effects
        double[] amplifiedSound1 = amplify(sound1, 1.5);
        double[] reversedSound2 = reverse(sound2);
        double[] mergedSounds = merge(sound3, sound4);
        double[] mixedSounds = mix(sound4, sound5);
        double[] spedUpSound1 = changeSpeed(sound1, 2.0);
        // Combine effects to create an audio collage
        double[] collage = mix(amplifiedSound1, reversedSound2);
        collage = merge(collage, mergedSounds);
        collage = mix(collage, mixedSounds);
        collage = merge(collage, spedUpSound1);
        // Play the resulting audio collage
        StdAudio.play(collage);
    }
}