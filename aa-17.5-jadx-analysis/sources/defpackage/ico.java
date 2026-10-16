package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class ico extends icf implements hwu {
    public ico(icm icmVar) {
        super(icmVar);
    }

    @Override // defpackage.hwx
    public final int a() {
        icr icrVar = ((icm) this.a).a.a;
        hte hteVar = (hte) icrVar.a;
        return hteVar.a.limit() + hteVar.c.length + (hteVar.d.length * 4) + icrVar.j;
    }

    @Override // defpackage.hwx
    public final Class b() {
        return icm.class;
    }

    @Override // defpackage.icf, defpackage.hwu
    public final void d() {
        ((icm) this.a).a().prepareToDraw();
    }

    @Override // defpackage.hwx
    public final void e() {
        Object obj;
        icm icmVar = (icm) this.a;
        icmVar.stop();
        icmVar.b = true;
        icr icrVar = icmVar.a.a;
        icrVar.b.clear();
        icrVar.d();
        icrVar.f();
        icq icqVar = icrVar.e;
        if (icqVar != null) {
            icrVar.c.i(icqVar);
            icrVar.e = null;
        }
        icq icqVar2 = icrVar.g;
        if (icqVar2 != null) {
            icrVar.c.i(icqVar2);
            icrVar.g = null;
        }
        icq icqVar3 = icrVar.i;
        if (icqVar3 != null) {
            icrVar.c.i(icqVar3);
            icrVar.i = null;
        }
        hte hteVar = (hte) icrVar.a;
        hteVar.f = null;
        byte[] bArr = hteVar.c;
        if (bArr != null) {
            hteVar.j.h(bArr);
        }
        int[] iArr = hteVar.d;
        if (iArr != null && (obj = hteVar.j.a) != null) {
            ((hxl) obj).c(iArr);
        }
        Bitmap bitmap = hteVar.g;
        if (bitmap != null) {
            hteVar.j.g(bitmap);
        }
        hteVar.g = null;
        hteVar.a = null;
        hteVar.h = null;
        byte[] bArr2 = hteVar.b;
        if (bArr2 != null) {
            hteVar.j.h(bArr2);
        }
        icrVar.f = true;
    }
}
