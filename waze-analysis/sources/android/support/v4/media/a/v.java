package android.support.v4.media.a;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import androidx.media.AudioAttributesCompat;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class v {
    v(int i2) {
        AudioAttributesCompat.Builder builder = new AudioAttributesCompat.Builder();
        builder.setLegacyStreamType(i2);
        builder.build();
    }

    public static Bundle a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        b(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static void b(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(v.class.getClassLoader());
        }
    }
}
