package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import j$.util.Objects;

/* loaded from: classes3.dex */
final class upj implements upw {
    public final upy[] a;
    private final Bitmap[] b;
    private final upy c;
    private final tmb d;
    private final int e;
    private final boolean f;
    private final upg g;

    public upj(upy upyVar, int i, int i2, tmb tmbVar, boolean z, upg upgVar) {
        this.c = upyVar;
        this.d = tmbVar;
        this.e = i;
        this.b = new Bitmap[i2];
        this.a = new upy[i2];
        this.f = z;
        this.g = upgVar;
    }

    @Override // defpackage.upw
    public final synchronized void a(upy upyVar) {
        upy upyVar2 = this.c;
        if (upyVar2.a() == 0) {
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                upy[] upyVarArr = this.a;
                if (i2 >= upyVarArr.length) {
                    break;
                }
                if (Objects.equals(upyVarArr[i2], upyVar)) {
                    this.b[i2] = upyVar.c();
                    i = i2;
                }
                if (this.b[i2] != null) {
                    i3++;
                }
                i2++;
            }
            Bitmap[] bitmapArr = this.b;
            if (bitmapArr[i] == null) {
                upyVar2.k(2);
                upyVar2.j(this.d.f().toEpochMilli());
                upyVar2.g(false);
                upyVar2.f();
            }
            if (i3 == this.e) {
                Rect rect = this.f ? new Rect() : null;
                upg upgVar = this.g;
                pke pkeVar = (pke) upgVar.a.l.a();
                yob yobVar = upq.a;
                Bitmap bitmapA = pkeVar.a(new upq(upgVar.b, woy.al(upgVar.c), upgVar.d, upgVar.e, upgVar.f, true, upgVar.g, upgVar.h), bitmapArr, rect);
                if (bitmapA != null) {
                    upyVar2.i(bitmapA);
                    upyVar2.k(3);
                    if (rect != null) {
                        upyVar2.h(rect);
                    }
                } else {
                    upyVar2.k(2);
                }
                upyVar2.j(this.d.f().toEpochMilli());
                upyVar2.g(false);
                upyVar2.f();
            }
        }
    }
}
