package androidx.media;

import v3.AbstractC4298a;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC4298a abstractC4298a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f18710a = abstractC4298a.f(audioAttributesImplBase.f18710a, 1);
        audioAttributesImplBase.f18711b = abstractC4298a.f(audioAttributesImplBase.f18711b, 2);
        audioAttributesImplBase.f18712c = abstractC4298a.f(audioAttributesImplBase.f18712c, 3);
        audioAttributesImplBase.f18713d = abstractC4298a.f(audioAttributesImplBase.f18713d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC4298a abstractC4298a) {
        abstractC4298a.getClass();
        abstractC4298a.j(audioAttributesImplBase.f18710a, 1);
        abstractC4298a.j(audioAttributesImplBase.f18711b, 2);
        abstractC4298a.j(audioAttributesImplBase.f18712c, 3);
        abstractC4298a.j(audioAttributesImplBase.f18713d, 4);
    }
}
