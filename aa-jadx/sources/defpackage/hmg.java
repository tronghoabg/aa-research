package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hmg extends defpackage.iey {
    private final java.util.function.Consumer a;

    public hmg(int i, int i2, java.util.function.Consumer consumer) {
        super(i, i2);
        this.a = consumer;
    }

    @Override // defpackage.ifd
    public final void a(android.graphics.drawable.Drawable drawable) {
        this.a.accept(drawable);
    }

    @Override // defpackage.iey, defpackage.ifd
    public final void b(android.graphics.drawable.Drawable drawable) {
        this.a.accept(drawable);
    }

    @Override // defpackage.ifd
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, defpackage.ifm ifmVar) {
        this.a.accept((android.graphics.drawable.Drawable) obj);
    }
}
