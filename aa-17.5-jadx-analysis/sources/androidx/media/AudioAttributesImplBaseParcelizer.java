package androidx.media;

import defpackage.fhw;

/* loaded from: classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(fhw fhwVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = fhwVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = fhwVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = fhwVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = fhwVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, fhw fhwVar) {
        fhwVar.h(audioAttributesImplBase.a, 1);
        fhwVar.h(audioAttributesImplBase.b, 2);
        fhwVar.h(audioAttributesImplBase.c, 3);
        fhwVar.h(audioAttributesImplBase.d, 4);
    }
}
