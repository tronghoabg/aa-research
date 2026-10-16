package defpackage;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.car.app.model.CarIcon;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class usw {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public usw(lth lthVar) {
        this.g = lthVar;
        aitx aitxVarB = ahni.b(affa.v(new aiwh(null), mkm.a.e().i()));
        this.h = aitxVarB;
        ltn ltnVar = (ltn) lthVar;
        this.a = ltnVar.g;
        this.i = tby.d(ltnVar.j, lthVar.a(aitxVarB, true), new jmz(4));
        ltn ltnVar2 = (ltn) lthVar;
        this.d = tby.d(ltnVar2.u, ltnVar2.e, new jmz(5));
        ltn ltnVar3 = (ltn) lthVar;
        this.b = tby.d(ltnVar3.m, ltnVar3.e, new jmz(6));
        ltn ltnVar4 = (ltn) lthVar;
        this.f = tby.d(ltnVar4.n, ltnVar4.e, new jmz(7));
        ltn ltnVar5 = (ltn) lthVar;
        this.c = tby.d(ltnVar5.o, ltnVar5.e, new jmz(8));
        this.e = ((ltn) lthVar).x;
    }

    public static final gex e(ltg ltgVar, ljx ljxVar) throws Exception {
        CarIcon carIconI;
        Resources resources;
        boolean zP = acsx.P();
        GhIcon ghIcon = ltgVar.a;
        if (zP && ghIcon.b == 2 && ljxVar != null && affa.f(ljxVar.b, ghIcon.s()) && (resources = ljxVar.g) != null) {
            String str = String.format(Locale.US, "Failed to get icon res %d from package %s resources", Arrays.copyOf(new Object[]{Integer.valueOf(ghIcon.a()), ghIcon.s()}, 2));
            str.getClass();
            carIconI = i(str, new hgl(resources, ghIcon, 15));
        } else {
            String str2 = String.format(Locale.US, "Failed to get icon %s from application context", Arrays.copyOf(new Object[]{ghIcon}, 1));
            str2.getClass();
            carIconI = i(str2, new jtw(ghIcon, 11));
        }
        return new gex(carIconI, ltgVar.b, ltgVar.c);
    }

    private static final CarIcon i(String str, afdr afdrVar) throws Exception {
        try {
            return (CarIcon) afdrVar.invoke();
        } catch (Exception e) {
            if (!(e instanceof IllegalArgumentException) && !(e instanceof IllegalStateException) && !(e instanceof Resources.NotFoundException) && !(e instanceof PackageManager.NameNotFoundException)) {
                throw e;
            }
            ((ype) ((ype) jxd.a.h()).p(e)).y("%s", str);
            CarIcon carIcon = CarIcon.ERROR;
            carIcon.getClass();
            return carIcon;
        }
    }

    public final eqj a() {
        return ((ltn) this.g).v;
    }

    public final eqj b() {
        return eqy.b(((ltn) this.g).d, new jxa(4));
    }

    public final eqj c() {
        return ((ltn) this.g).w;
    }

    public final eqj d() {
        jmz jmzVar = new jmz(3);
        ltn ltnVar = (ltn) this.g;
        return tby.d(ltnVar.h, ltnVar.s, jmzVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aezr, java.lang.Object] */
    public final SurfaceTexture f() {
        return (SurfaceTexture) this.g.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aezr, java.lang.Object] */
    public final Surface g() {
        return (Surface) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aezr, java.lang.Object] */
    public final iph h() {
        return (iph) this.f.a();
    }

    public usw(String str, List list, ajmd ajmdVar, afdr afdrVar) {
        this.c = str;
        this.d = list;
        this.i = ajmdVar;
        this.h = afdrVar;
        this.g = woy.dG(new grl(11));
        this.a = woy.dG(new gzm(this, 13));
        this.b = new ArrayList();
        this.e = new ipe(this, 1);
        this.f = woy.dG(new gzm(this, 14));
    }

    public usw() {
        this.a = "b";
        this.b = "c";
        this.c = "d";
        this.d = "e";
        this.e = "f";
        this.f = "g";
        this.g = "h";
        this.h = "i";
        this.i = "j";
    }
}
