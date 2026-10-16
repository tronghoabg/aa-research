package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iam implements defpackage.huz {
    private final defpackage.hxn a;
    private final defpackage.huz b;

    public iam(defpackage.hxn hxnVar, defpackage.huz huzVar) {
        this.a = hxnVar;
        this.b = huzVar;
    }

    @Override // defpackage.huj
    public final /* bridge */ /* synthetic */ boolean a(java.lang.Object obj, java.io.File file, defpackage.huw huwVar) {
        return this.b.a(new defpackage.ibw(((android.graphics.drawable.BitmapDrawable) ((defpackage.hxg) obj).c()).getBitmap(), this.a, 1), file, huwVar);
    }

    @Override // defpackage.huz
    public final int b() {
        return 2;
    }
}
