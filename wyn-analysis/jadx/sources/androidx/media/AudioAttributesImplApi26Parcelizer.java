package androidx.media;

import android.media.AudioAttributes;
import v3.AbstractC4298a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC4298a abstractC4298a) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f18708a = (AudioAttributes) abstractC4298a.g(audioAttributesImplApi26.f18708a, 1);
        audioAttributesImplApi26.f18709b = abstractC4298a.f(audioAttributesImplApi26.f18709b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC4298a abstractC4298a) {
        abstractC4298a.getClass();
        abstractC4298a.k(audioAttributesImplApi26.f18708a, 1);
        abstractC4298a.j(audioAttributesImplApi26.f18709b, 2);
    }
}
