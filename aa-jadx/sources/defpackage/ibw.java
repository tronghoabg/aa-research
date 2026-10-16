package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ibw implements defpackage.hxg, defpackage.hxd {
    private final /* synthetic */ int a;
    private final java.lang.Object b;
    private final java.lang.Object c;

    public ibw(android.graphics.Bitmap bitmap, defpackage.hxn hxnVar, int i) {
        this.a = i;
        defpackage.a.ak(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        defpackage.a.ak(hxnVar, "BitmapPool must not be null");
        this.c = hxnVar;
    }

    public static defpackage.hxg f(android.content.res.Resources resources, defpackage.hxg hxgVar) {
        if (hxgVar == null) {
            return null;
        }
        return new defpackage.ibw(resources, hxgVar, 0);
    }

    public static defpackage.ibw g(android.graphics.Bitmap bitmap, defpackage.hxn hxnVar) {
        if (bitmap == null) {
            return null;
        }
        return new defpackage.ibw(bitmap, hxnVar, 1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hxg, java.lang.Object] */
    @Override // defpackage.hxg
    public final int a() {
        return this.a != 0 ? defpackage.igg.a((android.graphics.Bitmap) this.b) : this.c.a();
    }

    @Override // defpackage.hxg
    public final java.lang.Class b() {
        return this.a != 0 ? android.graphics.Bitmap.class : android.graphics.drawable.BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hxg, java.lang.Object] */
    @Override // defpackage.hxg
    public final /* synthetic */ java.lang.Object c() {
        if (this.a != 0) {
            return this.b;
        }
        return new android.graphics.drawable.BitmapDrawable((android.content.res.Resources) this.b, (android.graphics.Bitmap) this.c.c());
    }

    @Override // defpackage.hxd
    public final void d() {
        if (this.a != 0) {
            ((android.graphics.Bitmap) this.b).prepareToDraw();
            return;
        }
        java.lang.Object obj = this.c;
        if (obj instanceof defpackage.hxd) {
            ((defpackage.hxd) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hxg, hxn, java.lang.Object] */
    @Override // defpackage.hxg
    public final void e() {
        int i = this.a;
        ?? r1 = this.c;
        if (i != 0) {
            r1.d((android.graphics.Bitmap) this.b);
        } else {
            r1.e();
        }
    }

    private ibw(android.content.res.Resources resources, defpackage.hxg hxgVar, int i) {
        this.a = i;
        defpackage.a.ak(resources, "Argument must not be null");
        this.b = resources;
        this.c = hxgVar;
    }
}
