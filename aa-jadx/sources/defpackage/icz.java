package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class icz extends defpackage.iey {
    final int a;
    public android.graphics.Bitmap b;
    private final android.os.Handler d;
    private final long e;

    public icz(android.os.Handler handler, int i, long j) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.ifd
    public final void a(android.graphics.drawable.Drawable drawable) {
        this.b = null;
    }

    @Override // defpackage.ifd
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, defpackage.ifm ifmVar) {
        this.b = (android.graphics.Bitmap) obj;
        android.os.Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.e);
    }
}
