package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class kag extends qjm {
    private final ieb a;

    public kag(ieb iebVar) {
        this.a = iebVar;
    }

    @Override // defpackage.qjm
    public final void c() {
        this.a.r();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aizk, java.lang.Object] */
    @Override // defpackage.qjm
    public final void d(String str, String str2) {
        if (str == null) {
            return;
        }
        ieb iebVar = this.a;
        iebVar.b.c(new hjq(1, str));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [aizk, java.lang.Object] */
    @Override // defpackage.qjm
    public final void e(String str) {
        ieb iebVar = this.a;
        if (str == null) {
            iebVar.r();
        } else {
            iebVar.b.c(new hjq(2, str));
        }
    }

    @Override // defpackage.qjm
    public final void f() {
    }

    @Override // defpackage.qjm
    public final void a(String str, int i) {
    }

    @Override // defpackage.qjm
    public final void b(String str, int i, Bitmap bitmap) {
    }
}
