package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import java.lang.reflect.InvocationTargetException;
import v3.AbstractC4298a;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC4298a abstractC4298a) {
        return androidx.media.AudioAttributesCompatParcelizer.read(abstractC4298a);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC4298a abstractC4298a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, abstractC4298a);
    }
}
