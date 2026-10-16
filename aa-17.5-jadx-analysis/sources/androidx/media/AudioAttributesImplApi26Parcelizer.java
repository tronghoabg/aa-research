package androidx.media;

import android.media.AudioAttributes;
import defpackage.fhw;

/* loaded from: classes2.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(fhw fhwVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) fhwVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = fhwVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, fhw fhwVar) {
        fhwVar.i(audioAttributesImplApi26.a, 1);
        fhwVar.h(audioAttributesImplApi26.b, 2);
    }
}
