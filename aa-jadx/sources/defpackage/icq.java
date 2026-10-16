package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class icq extends defpackage.ico {
    static defpackage.hxg g(android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            return new defpackage.icq(drawable);
        }
        return null;
    }

    @Override // defpackage.hxg
    public final int a() {
        android.graphics.drawable.Drawable drawable = this.a;
        return java.lang.Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.hxg
    public final java.lang.Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.hxg
    public final void e() {
    }
}
