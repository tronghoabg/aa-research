package androidx.media;

import android.media.AudioAttributes;
import v3.AbstractC4298a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC4298a abstractC4298a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f18708a = (AudioAttributes) abstractC4298a.g(audioAttributesImplApi21.f18708a, 1);
        audioAttributesImplApi21.f18709b = abstractC4298a.f(audioAttributesImplApi21.f18709b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC4298a abstractC4298a) {
        abstractC4298a.getClass();
        abstractC4298a.k(audioAttributesImplApi21.f18708a, 1);
        abstractC4298a.j(audioAttributesImplApi21.f18709b, 2);
    }
}
