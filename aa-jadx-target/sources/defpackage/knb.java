package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class knb {
    public final java.lang.Object a;

    public knb(android.content.Context context) {
        this.a = ((defpackage.lbn) defpackage.mkp.a.i(defpackage.lbn.class)).a(context, "gearhead_config");
    }

    public static android.content.SharedPreferences a(android.content.Context context) {
        defpackage.ysr.bk(defpackage.jrm.a() == defpackage.jrm.PROJECTION, "Can only be used in the projection process");
        return context.getSharedPreferences(java.lang.String.valueOf(context.getPackageName()).concat("_preferences"), 0);
    }

    public static defpackage.knb b() {
        return (defpackage.knb) defpackage.mkp.a.i(defpackage.knb.class);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void c(java.lang.String str, boolean z) {
        this.a.edit().putBoolean(str, z).apply();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean d(java.lang.String str) {
        return this.a.getBoolean(str, false);
    }

    public final android.support.v4.media.MediaMetadataCompat e() {
        return new android.support.v4.media.MediaMetadataCompat((android.os.Bundle) this.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(java.lang.String str, android.graphics.Bitmap bitmap) {
        defpackage.zd zdVar = android.support.v4.media.MediaMetadataCompat.a;
        if (zdVar.containsKey(str) && ((java.lang.Integer) zdVar.get(str)).intValue() != 2) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "The ", " key cannot be used to put a Bitmap"));
        }
        ((android.os.Bundle) this.a).putParcelable(str, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(java.lang.String str, long j) {
        defpackage.zd zdVar = android.support.v4.media.MediaMetadataCompat.a;
        if (zdVar.containsKey(str) && ((java.lang.Integer) zdVar.get(str)).intValue() != 0) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "The ", " key cannot be used to put a long"));
        }
        ((android.os.Bundle) this.a).putLong(str, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(java.lang.String str, java.lang.String str2) {
        defpackage.zd zdVar = android.support.v4.media.MediaMetadataCompat.a;
        if (zdVar.containsKey(str) && ((java.lang.Integer) zdVar.get(str)).intValue() != 1) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bp(str, "The ", " key cannot be used to put a String"));
        }
        ((android.os.Bundle) this.a).putCharSequence(str, str2);
    }

    public knb() {
        this.a = new android.os.Bundle();
    }
}
