package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class keq extends qjm {
    final /* synthetic */ ker a;

    public keq(ker kerVar) {
        this.a = kerVar;
    }

    @Override // defpackage.qjm
    public final void a(String str, int i) {
        str.getClass();
        this.a.b.d(new hmj(2, str, i, 8));
    }

    @Override // defpackage.qjm
    public final void b(String str, int i, Bitmap bitmap) {
        str.getClass();
        this.a.b.d(new hmj(2, str, i, bitmap));
    }

    @Override // defpackage.qjm
    public final void c() {
        this.a.b.d(new hmj(1, (String) null, 0, 14));
    }

    @Override // defpackage.qjm
    public final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (str.length() <= 0) {
            str = str2;
        }
        int length = str.length();
        ker kerVar = this.a;
        if (length == 0) {
            kerVar.b.d(null);
        } else {
            kerVar.b.d(new hmj(2, str, 0, 12));
        }
    }

    @Override // defpackage.qjm
    public final void e(String str) {
        str.getClass();
        this.a.b.d(new hmj(2, str, 0, 12));
    }

    @Override // defpackage.qjm
    public final void f() {
        this.a.b.d(new hmj(3, (String) null, 0, 14));
    }
}
