package androidx.media;

import java.lang.reflect.InvocationTargetException;
import v3.AbstractC4298a;
import v3.c;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC4298a abstractC4298a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVarH = audioAttributesCompat.f18707a;
        if (abstractC4298a.e(1)) {
            cVarH = abstractC4298a.h();
        }
        audioAttributesCompat.f18707a = (AudioAttributesImpl) cVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC4298a abstractC4298a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC4298a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f18707a;
        abstractC4298a.i(1);
        abstractC4298a.l(audioAttributesImpl);
    }
}
