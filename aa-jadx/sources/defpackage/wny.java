package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class wny implements defpackage.wnz {
    private java.lang.Long a;

    @Override // defpackage.wnz
    public final boolean a() {
        java.lang.Long l = this.a;
        if (l == null) {
            try {
                java.lang.reflect.Method declaredMethod = android.os.Build.class.getDeclaredMethod("getLong", java.lang.String.class);
                declaredMethod.setAccessible(true);
                l = (java.lang.Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.a = l;
            } catch (java.lang.Exception unused) {
                l = -1L;
                this.a = l;
            }
        }
        return l.longValue() >= 40100;
    }
}
