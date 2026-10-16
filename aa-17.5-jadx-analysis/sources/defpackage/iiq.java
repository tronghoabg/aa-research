package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class iiq implements ihi {
    public final List a;
    private float b;
    private float c;
    private iir d;
    private boolean e;
    private boolean f;
    private int g;
    private boolean h;

    public iiq(ihh ihhVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = -1;
        if (ihhVar == null) {
            return;
        }
        ihhVar.e(this);
        if (this.h) {
            this.d.a((iir) arrayList.get(this.g));
            arrayList.set(this.g, this.d);
            this.h = false;
        }
        iir iirVar = this.d;
        if (iirVar != null) {
            arrayList.add(iirVar);
        }
    }

    @Override // defpackage.ihi
    public final void b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.e = true;
        this.f = false;
        iir iirVar = this.d;
        ija.c(iirVar.a, iirVar.b, f, f2, f3, z, z2, f4, f5, this);
        this.f = true;
        this.h = false;
    }

    @Override // defpackage.ihi
    public final void c() {
        this.a.add(this.d);
        f(this.b, this.c);
        this.h = true;
    }

    @Override // defpackage.ihi
    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.f || this.e) {
            this.d.b(f, f2);
            this.a.add(this.d);
            this.e = false;
        }
        this.d = new iir(f5, f6, f5 - f3, f6 - f4);
        this.h = false;
    }

    @Override // defpackage.ihi
    public final void f(float f, float f2) {
        this.d.b(f, f2);
        this.a.add(this.d);
        iir iirVar = this.d;
        this.d = new iir(f, f2, f - iirVar.a, f2 - iirVar.b);
        this.h = false;
    }

    @Override // defpackage.ihi
    public final void g(float f, float f2) {
        if (this.h) {
            iir iirVar = this.d;
            List list = this.a;
            iirVar.a((iir) list.get(this.g));
            list.set(this.g, this.d);
            this.h = false;
        }
        iir iirVar2 = this.d;
        if (iirVar2 != null) {
            this.a.add(iirVar2);
        }
        this.b = f;
        this.c = f2;
        this.d = new iir(f, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.g = this.a.size();
    }

    @Override // defpackage.ihi
    public final void h(float f, float f2, float f3, float f4) {
        this.d.b(f, f2);
        this.a.add(this.d);
        this.d = new iir(f3, f4, f3 - f, f4 - f2);
        this.h = false;
    }
}
