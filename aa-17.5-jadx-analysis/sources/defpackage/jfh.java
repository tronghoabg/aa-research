package defpackage;

import android.content.Context;
import android.graphics.Rect;
import com.google.android.gms.car.CarFacet;
import com.google.android.gms.car.CarUiInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class jfh implements jfg {
    public static final yph a = yph.c("CAR.ANALYTICS");
    public final xyc b;
    public final ikw c;
    public final rpz d;
    public final Context e;
    public CarFacet g;
    public long h;
    private final rqe j = new rqe();
    public final List f = new CopyOnWriteArrayList();
    public int i = -1;

    public jfh(xyc xycVar, ijx ijxVar, ikw ikwVar, ikz ikzVar, Context context) {
        if (ikzVar == null) {
            throw new IllegalArgumentException("args must not be null");
        }
        this.b = xycVar;
        this.c = ikwVar;
        this.e = context;
        rpz rpzVarA = rpz.a(context.getApplicationContext());
        rpzVarA.f(new jfi(ijxVar));
        this.d = rpzVarA;
    }

    public static yxr j(CarUiInfo carUiInfo) {
        abnp abnpVarN = yxr.a.n();
        boolean z = carUiInfo.a;
        abnpVarN.t();
        yxr yxrVar = (yxr) abnpVarN.b;
        int i = 1;
        yxrVar.b |= 1;
        yxrVar.c = z;
        boolean z2 = carUiInfo.b;
        abnpVarN.t();
        yxr yxrVar2 = (yxr) abnpVarN.b;
        yxrVar2.b |= 2;
        yxrVar2.d = z2;
        int i2 = carUiInfo.g;
        if (i2 == 2) {
            i = 2;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 == 4) {
            i = 4;
        }
        abnpVarN.t();
        yxr yxrVar3 = (yxr) abnpVarN.b;
        yxrVar3.b = 4 | yxrVar3.b;
        yxrVar3.e = i - 1;
        boolean z3 = carUiInfo.d;
        abnpVarN.t();
        yxr yxrVar4 = (yxr) abnpVarN.b;
        yxrVar4.b |= 8;
        yxrVar4.f = z3;
        boolean z4 = carUiInfo.f;
        abnpVarN.t();
        yxr yxrVar5 = (yxr) abnpVarN.b;
        yxrVar5.b |= 16;
        yxrVar5.g = z4;
        boolean z5 = carUiInfo.h;
        abnpVarN.t();
        yxr yxrVar6 = (yxr) abnpVarN.b;
        yxrVar6.b |= 32;
        yxrVar6.h = z5;
        boolean z6 = carUiInfo.c;
        abnpVarN.t();
        yxr yxrVar7 = (yxr) abnpVarN.b;
        yxrVar7.b |= 64;
        yxrVar7.i = z6;
        return (yxr) abnpVarN.q();
    }

    public static List k(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xpd xpdVar = (xpd) it.next();
            abnp abnpVarN = yxp.a.n();
            Rect rectB = iux.b(xpdVar);
            xpc xpcVarB = xpc.b(xpdVar.c);
            if (xpcVarB == null) {
                xpcVarB = xpc.VIDEO_800x480;
            }
            abnpVarN.t();
            yxp yxpVar = (yxp) abnpVarN.b;
            yxpVar.b |= 4;
            yxpVar.e = xpcVarB.j;
            int iWidth = rectB.width();
            abnpVarN.t();
            yxp yxpVar2 = (yxp) abnpVarN.b;
            yxpVar2.b |= 2;
            yxpVar2.d = iWidth;
            int iHeight = rectB.height();
            abnpVarN.t();
            yxp yxpVar3 = (yxp) abnpVarN.b;
            yxpVar3.b |= 1;
            yxpVar3.c = iHeight;
            if ((xpdVar.b & 16) != 0) {
                int i = xpdVar.g;
                abnpVarN.t();
                yxp yxpVar4 = (yxp) abnpVarN.b;
                yxpVar4.b |= 8;
                yxpVar4.f = i;
            }
            int iZ = wpq.z(xpdVar.d);
            int i2 = iZ != 0 ? iZ : 1;
            abnpVarN.t();
            yxp yxpVar5 = (yxp) abnpVarN.b;
            yxpVar5.b |= 16;
            yxpVar5.g = i2;
            if ((xpdVar.b & 128) != 0) {
                int i3 = xpdVar.i;
                abnpVarN.t();
                yxp yxpVar6 = (yxp) abnpVarN.b;
                yxpVar6.b |= 32;
                yxpVar6.h = i3;
            }
            if ((xpdVar.b & 256) != 0) {
                int i4 = xpdVar.j;
                abnpVarN.t();
                yxp yxpVar7 = (yxp) abnpVarN.b;
                yxpVar7.b |= 64;
                yxpVar7.i = i4;
            }
            if ((xpdVar.b & 32) != 0) {
                int i5 = xpdVar.h;
                abnpVarN.t();
                yxp yxpVar8 = (yxp) abnpVarN.b;
                yxpVar8.b |= 128;
                yxpVar8.j = i5;
            }
            arrayList.add((yxp) abnpVarN.q());
        }
        return arrayList;
    }

    public static yxc l(int i, boolean z) {
        int i2 = i - 1;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? yxc.UNKNOWN_EVENT_TYPE : z ? yxc.FACET_HOME_END : yxc.FACET_HOME_START : z ? yxc.FACET_OEM_END : yxc.FACET_OEM_START : z ? yxc.FACET_MUSIC_END : yxc.FACET_MUSIC_START : z ? yxc.FACET_PHONE_END : yxc.FACET_PHONE_START : z ? yxc.FACET_NAVIGATION_END : yxc.FACET_NAVIGATION_START;
    }

    @Override // defpackage.jfg
    public final void a(yxh yxhVar) {
        abnp abnpVarN = yxb.a.n();
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        yxhVar.getClass();
        yxbVar.n = yxhVar;
        yxbVar.b |= 2048;
        yxc yxcVar = yxc.COMPONENT_INTERACTION_EVENT;
        int i = yfq.d;
        m(abnpVarN, yxcVar, yls.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jfg
    public final void b(rqy rqyVar) {
        yfl yflVar = new yfl(4);
        yno it = rqyVar.d().iterator();
        while (it.hasNext()) {
            yflVar.i(Integer.valueOf(((acai) it.next()).a()));
        }
        m(rqyVar.g(), rqyVar.e(), yflVar.g());
    }

    @Override // defpackage.jfg
    public final void c(yyt yytVar) {
        abnp abnpVarN = yxb.a.n();
        abnpVarN.t();
        yxb yxbVar = (yxb) abnpVarN.b;
        yytVar.getClass();
        yxbVar.aj = yytVar;
        yxbVar.d |= 1024;
        yxc yxcVar = yxc.MEDIA_STATS;
        int i = yfq.d;
        m(abnpVarN, yxcVar, yls.a);
    }

    @Override // defpackage.jfg
    public final void d(yze yzeVar, yzf yzfVar, long j, long j2) {
        yzeVar.getClass();
        yzfVar.getClass();
        abnp abnpVarN = yzg.a.n();
        abnpVarN.t();
        yzg yzgVar = (yzg) abnpVarN.b;
        yzgVar.b |= 1;
        yzgVar.c = yzeVar.D;
        abnpVarN.t();
        yzg yzgVar2 = (yzg) abnpVarN.b;
        yzgVar2.b |= 2;
        yzgVar2.d = yzfVar.az;
        abnpVarN.t();
        yzg yzgVar3 = (yzg) abnpVarN.b;
        yzgVar3.b |= 4;
        yzgVar3.e = j;
        abnpVarN.t();
        yzg yzgVar4 = (yzg) abnpVarN.b;
        yzgVar4.b |= 8;
        yzgVar4.f = j2;
        yzg yzgVar5 = (yzg) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yzgVar5.getClass();
        yxbVar.s = yzgVar5;
        yxbVar.b |= 65536;
        yxc yxcVar = yxc.OUT_OF_CAR_LIFECYCLE_ERROR;
        int i = yfq.d;
        m(abnpVarN2, yxcVar, yls.a);
    }

    @Override // defpackage.jfg
    public final void e(yzz yzzVar, yzy yzyVar) {
        abnp abnpVarN = zab.a.n();
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        zabVar.b |= 1;
        zabVar.d = yzzVar.he;
        int iA = yzyVar.a();
        abnpVarN.t();
        zab zabVar2 = (zab) abnpVarN.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        zab zabVar3 = (zab) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        zabVar3.getClass();
        yxbVar.o = zabVar3;
        yxbVar.b |= 4096;
        yxc yxcVar = yxc.UI;
        int i = yfq.d;
        m(abnpVarN2, yxcVar, yls.a);
    }

    @Override // defpackage.jfg
    public final void f(yzz yzzVar, yzy yzyVar, long j) {
        abnp abnpVarN = zab.a.n();
        abnpVarN.t();
        zab zabVar = (zab) abnpVarN.b;
        zabVar.b |= 1;
        zabVar.d = yzzVar.he;
        int iA = yzyVar.a();
        abnpVarN.t();
        zab zabVar2 = (zab) abnpVarN.b;
        zabVar2.b |= 2;
        zabVar2.e = iA;
        abnpVarN.t();
        zab zabVar3 = (zab) abnpVarN.b;
        zabVar3.b |= 4;
        zabVar3.f = j;
        zab zabVar4 = (zab) abnpVarN.q();
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        zabVar4.getClass();
        yxbVar.o = zabVar4;
        yxbVar.b |= 4096;
        yxc yxcVar = yxc.UI;
        int i = yfq.d;
        m(abnpVarN2, yxcVar, yls.a);
    }

    @Override // defpackage.jfg
    public final void g(int i) {
        this.i = i;
        for (ecw ecwVar : this.f) {
            inh.l.a();
        }
    }

    @Override // defpackage.jfg
    public final boolean h() {
        return this.i != -1;
    }

    @Override // defpackage.jfg
    public final void i(yyv yyvVar, yyw yywVar, String str) {
        abnp abnpVarN = yyz.a.n();
        abnpVarN.t();
        yyz yyzVar = (yyz) abnpVarN.b;
        yyzVar.b |= 1;
        yyzVar.c = 27;
        abnpVarN.t();
        yyz yyzVar2 = (yyz) abnpVarN.b;
        yyzVar2.b |= 2;
        yyzVar2.d = yyvVar.fI;
        abnpVarN.t();
        yyz yyzVar3 = (yyz) abnpVarN.b;
        yyzVar3.b |= 256;
        yyzVar3.i = yywVar.y;
        abnpVarN.t();
        yyz yyzVar4 = (yyz) abnpVarN.b;
        str.getClass();
        yyzVar4.b |= 128;
        yyzVar4.h = str;
        yyz yyzVar5 = (yyz) abnpVarN.q();
        yyzVar5.getClass();
        woy.aa(1 == (yyzVar5.b & 1), "nonUiEvent.hasContext() is false");
        woy.aa((yyzVar5.b & 2) != 0, "nonUiEvent.hasAction() is false");
        abnp abnpVarN2 = yxb.a.n();
        abnpVarN2.t();
        yxb yxbVar = (yxb) abnpVarN2.b;
        yxbVar.p = yyzVar5;
        yxbVar.b |= 8192;
        yxc yxcVar = yxc.NON_UI;
        int i = yfq.d;
        m(abnpVarN2, yxcVar, yls.a);
    }

    @Deprecated
    public final void m(abnp abnpVar, yxc yxcVar, List list) {
        if ((((yxb) abnpVar.b).b & 8388608) == 0) {
            int i = this.i;
            abnpVar.t();
            yxb yxbVar = (yxb) abnpVar.b;
            yxbVar.b = 8388608 | yxbVar.b;
            yxbVar.x = i;
        }
        this.d.e(yxcVar, (yxb) abnpVar.q(), list);
        this.j.a(yxcVar, (yxb) abnpVar.q());
    }
}
