package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dvg {
    public abstract void a(int i);

    public abstract void b(android.graphics.Typeface typeface);

    public final void c(int i) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.irj(this, i, 1));
    }

    public final void d(android.graphics.Typeface typeface) {
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new defpackage.aq(this, typeface, 6));
    }
}
