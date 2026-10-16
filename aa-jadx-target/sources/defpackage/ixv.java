package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ixv implements defpackage.ixu {
    private static final defpackage.yqm d = defpackage.yqm.c("CAR.POWER");
    public final android.os.PowerManager a;
    public java.lang.reflect.Method b;
    public volatile int c;

    public ixv(android.content.Context context) {
        this.c = 0;
        this.a = (android.os.PowerManager) context.getSystemService("power");
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            this.b = android.os.PowerManager.class.getMethod("userActivity", java.lang.Long.TYPE, cls, cls);
        } catch (java.lang.NoSuchMethodException unused) {
            ((defpackage.yqj) ((defpackage.yqj) d.h()).ai((char) 1524)).u("PowerManager.userActivity not found");
            this.b = null;
            this.c = -1;
        }
    }

    @Override // defpackage.ixu
    public final boolean a() {
        return this.a.isPowerSaveMode();
    }
}
