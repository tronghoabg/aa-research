package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;

@Deprecated
/* loaded from: classes.dex */
public final class kmu {
    public final Object a;

    public kmu(Context context) {
        this.a = ((lbi) mki.a.i(lbi.class)).a(context, "gearhead_config");
    }

    public static SharedPreferences a(Context context) {
        woy.aa(jrl.a() == jrl.PROJECTION, "Can only be used in the projection process");
        return context.getSharedPreferences(String.valueOf(context.getPackageName()).concat("_preferences"), 0);
    }

    public static kmu b() {
        return (kmu) mki.a.i(kmu.class);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void c(String str, boolean z) {
        this.a.edit().putBoolean(str, z).apply();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean d(String str) {
        return this.a.getBoolean(str, false);
    }

    public final MediaMetadataCompat e() {
        return new MediaMetadataCompat((Bundle) this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(String str, Bitmap bitmap) {
        yw ywVar = MediaMetadataCompat.a;
        if (ywVar.containsKey(str) && ((Integer) ywVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a.bq(str, "The ", " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.a).putParcelable(str, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(String str, long j) {
        yw ywVar = MediaMetadataCompat.a;
        if (ywVar.containsKey(str) && ((Integer) ywVar.get(str)).intValue() != 0) {
            throw new IllegalArgumentException(a.bq(str, "The ", " key cannot be used to put a long"));
        }
        ((Bundle) this.a).putLong(str, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(String str, String str2) {
        yw ywVar = MediaMetadataCompat.a;
        if (ywVar.containsKey(str) && ((Integer) ywVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a.bq(str, "The ", " key cannot be used to put a String"));
        }
        ((Bundle) this.a).putCharSequence(str, str2);
    }

    public kmu() {
        this.a = new Bundle();
    }
}
