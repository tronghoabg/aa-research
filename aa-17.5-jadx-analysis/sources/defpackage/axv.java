package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class axv implements azu, apr {
    final /* synthetic */ Object a;
    private final /* synthetic */ apr b;
    private final /* synthetic */ int c;

    public axv(apr aprVar, Object obj, int i) {
        this.c = i;
        this.a = obj;
        this.b = aprVar;
    }

    @Override // defpackage.apr
    public final float a(float f) {
        int i = this.c;
        if (i == 0) {
            return this.b.a(f);
        }
        apr aprVar = this.b;
        return i != 1 ? aprVar.a(f) : aprVar.a(f);
    }

    @Override // defpackage.azu
    public final int b() {
        int i = this.c;
        if (i == 0) {
            return ((axz) this.a).b();
        }
        Object obj = this.a;
        return i != 1 ? ((bbt) obj).f : ((axr) obj).b();
    }

    @Override // defpackage.azu
    public final int c() {
        int i = this.c;
        if (i == 0) {
            return ((axz) this.a).c();
        }
        Object obj = this.a;
        return i != 1 ? ((bbt) obj).g : ((axr) obj).c();
    }

    @Override // defpackage.azu
    public final int d() {
        int i = this.c;
        if (i != 0) {
            Object obj = this.a;
            return i != 1 ? ((bbt) obj).b() : ((axr) obj).l().m;
        }
        ((axz) this.a).d();
        return 0;
    }

    @Override // defpackage.azu
    public final int e() {
        int i = this.c;
        if (i == 0) {
            axt axtVar = (axt) woy.bL(((axz) this.a).d().b);
            if (axtVar != null) {
                return axtVar.a();
            }
            return 0;
        }
        Object obj = this.a;
        if (i != 1) {
            return ((bav) woy.bK(((bbt) obj).x().a)).a;
        }
        axk axkVar = (axk) woy.bL(((axr) obj).l().j);
        if (axkVar != null) {
            return axkVar.a;
        }
        return 0;
    }

    @Override // defpackage.azu
    public final int f(int i) {
        Object obj;
        int i2 = this.c;
        if (i2 == 0) {
            List list = ((axz) this.a).d().b;
            return 0;
        }
        Object obj2 = this.a;
        if (i2 != 1) {
            bbt bbtVar = (bbt) obj2;
            return (int) (afpt.j(afp.T(bbtVar) + afgi.k((((i - bbtVar.j()) * bbtVar.l()) - (bbtVar.c() * bbtVar.l())) + BitmapDescriptorFactory.HUE_RED), bbtVar.i, bbtVar.h) - afp.T(bbtVar));
        }
        axj axjVarL = ((axr) obj2).l();
        List list2 = axjVarL.j;
        if (list2.isEmpty()) {
            return 0;
        }
        int iB = b();
        if (i > e() || iB > i) {
            return (awx.h(axjVarL) * (i - b())) - c();
        }
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i3);
            if (((axk) obj).a == i) {
                break;
            }
            i3++;
        }
        axk axkVar = (axk) obj;
        if (axkVar != null) {
            return axkVar.h;
        }
        return 0;
    }

    @Override // defpackage.azu
    public final void g(int i) {
        int i2 = this.c;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (i2 != 0) {
            Object obj = this.a;
            if (i2 == 1) {
                ((axr) obj).k(i, 0, true);
                return;
            }
            bbt bbtVar = (bbt) obj;
            float fL = bbtVar.l();
            if (fL != BitmapDescriptorFactory.HUE_RED) {
                f = BitmapDescriptorFactory.HUE_RED / fL;
            }
            bbtVar.u(i, f, true);
            return;
        }
        axz axzVar = (axz) this.a;
        nfh nfhVar = axzVar.g;
        if (nfhVar.A() != i || nfhVar.B() != 0) {
            axzVar.d.c();
        }
        if (i < BitmapDescriptorFactory.HUE_RED) {
            asl.c("Index should be non-negative");
        }
        ((byd) nfhVar.b).h(i);
        ((azo) nfhVar.a).c(i);
        ((byd) nfhVar.c).h(0);
    }
}
