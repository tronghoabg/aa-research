package androidx.media;

import android.media.AudioAttributes;
import defpackage.fhw;

/* loaded from: classes2.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(fhw fhwVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) fhwVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = fhwVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, fhw fhwVar) {
        fhwVar.i(audioAttributesImplApi21.a, 1);
        fhwVar.h(audioAttributesImplApi21.b, 2);
    }
}
