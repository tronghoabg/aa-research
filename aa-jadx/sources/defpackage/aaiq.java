package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aaiq {
    public static final java.lang.String a = "aaiq";
    public volatile android.opengl.GLSurfaceView b = null;

    protected abstract void a();

    public final void b(java.lang.String str) {
        java.lang.String str2 = a;
        if (defpackage.zsr.e(str2, 3)) {
            android.util.Log.d(str2, java.lang.String.format("requestFrame(%s)", str));
        }
        a();
    }
}
