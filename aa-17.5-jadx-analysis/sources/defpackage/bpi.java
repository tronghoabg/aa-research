package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class bpi implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bpi(String str, int i) {
        this.c = i;
        this.b = "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?";
        this.a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [cfy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [aivh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v45, types: [aixy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v25, types: [dnt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [awo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [bym, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) throws Exception {
        WindowInsets windowInsetsE;
        lValueOf = null;
        Long lValueOf = null;
        boolean z = false;
        switch (this.c) {
            case 0:
                ((btc) this.a).a.b(new aua(this.b, (awo) obj));
                return afak.a;
            case 1:
                cmd cmdVar = (cmd) obj;
                float fEA = cmdVar.eA(2.0f);
                ?? r8 = this.b;
                float f = fEA / 2.0f;
                czz.aH(cmdVar, ((cjv) r8.a()).a, cmdVar.eA(10.0f) - f, 0L, new cmg(fEA, BitmapDescriptorFactory.HUE_RED, 0, 0, 30), 108);
                ?? r11 = this.a;
                if (dlj.a(((dlj) r11.a()).a, BitmapDescriptorFactory.HUE_RED) > 0) {
                    czz.aH(cmdVar, ((cjv) r8.a()).a, cmdVar.eA(((dlj) r11.a()).a) - f, 0L, cmf.a, 108);
                }
                return afak.a;
            case 2:
                ((cun) obj).r((cuo) this.a, 0, 0, ((cgd) this.b).a);
                return afak.a;
            case 3:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                Object obj2 = this.a;
                if (actionMasked == 0) {
                    ((cqx) this.b).d = true != ((Boolean) ((cra) obj2).d().invoke(motionEvent)).booleanValue() ? 3 : 2;
                } else {
                    ((cra) obj2).d().invoke(motionEvent);
                }
                return afak.a;
            case 4:
                ddu dduVar = (ddu) obj;
                hig higVar = (hig) ((zh) this.a).a(dduVar.c);
                if (higVar != null && higVar.a) {
                    z = true;
                }
                return Boolean.valueOf(dan.h(dduVar, (Resources) this.b, z));
            case 5:
                return new rhi((bip) this.b, new cxm(this.a, 4));
            case 6:
                Object obj3 = this.b;
                Object obj4 = this.a;
                dmg.b((View) obj4, (cxb) obj3);
                dme dmeVar = (dme) obj4;
                dmeVar.c.H();
                View view = dmeVar.b;
                int[] iArr = dmeVar.m;
                int i = iArr[0];
                int i2 = iArr[1];
                view.getLocationOnScreen(iArr);
                long j = dmeVar.n;
                long jH = ((cst) obj).h();
                dmeVar.n = jH;
                ecy ecyVar = dmeVar.o;
                if (ecyVar != null && ((i != iArr[0] || i2 != iArr[1] || !a.j(j, jH)) && (windowInsetsE = dmeVar.k(ecyVar).e()) != null)) {
                    view.dispatchApplyWindowInsets(windowInsetsE);
                }
                return afak.a;
            case 7:
                ((cxb) this.a).ae(((cfy) obj).a(this.b));
                return afak.a;
            case 8:
                cym cymVar = (cym) obj;
                czq czqVar = cymVar instanceof czq ? (czq) cymVar : null;
                Object obj5 = this.a;
                if (czqVar != null) {
                    Object obj6 = this.b;
                    dal dalVarO = czqVar.O();
                    dalVarO.getClass();
                    dalVarO.a.put(obj5, obj6);
                    View view2 = (View) obj5;
                    dalVarO.addView(view2);
                    dalVarO.b.put(obj6, obj5);
                    ((dme) obj5).setImportantForAccessibility(1);
                    czo czoVar = new czo(czqVar, (cxb) obj6, czqVar, dalVarO);
                    ebm.r(view2);
                    view2.setAccessibilityDelegate(czoVar.C);
                }
                dme dmeVar2 = (dme) obj5;
                View view3 = dmeVar2.b;
                if (view3.getParent() != obj5) {
                    dmeVar2.addView(view3);
                }
                return afak.a;
            case 9:
                dmg.b((View) this.a, (cxb) this.b);
                return afak.a;
            case 10:
                ?? r12 = this.a;
                dnq dnqVar = (dnq) this.b;
                dnqVar.d = r12;
                dnqVar.n();
                return new eny(1);
            case 11:
                if (affa.f((String) obj, ((File) this.b).getName())) {
                    aikz.a(this.a, afak.a);
                }
                return afak.a;
            case 12:
                ese eseVar = (ese) obj;
                eseVar.getClass();
                erh erhVar = (erh) this.b;
                eseVar.b(erg.a, erhVar.a);
                eseVar.b(erg.b, erhVar.b);
                eseVar.b(ers.a, this.a);
                Bundle bundle = erhVar.c;
                if (bundle != null) {
                    eseVar.b(erg.c, bundle);
                }
                return afak.a;
            case 13:
                evf evfVar = (evf) obj;
                evfVar.getClass();
                dmw dmwVar = new dmw(13);
                etz etzVar = new etz();
                dmwVar.invoke(etzVar);
                int i3 = etzVar.a;
                evd evdVar = evfVar.a;
                evdVar.c = i3;
                evdVar.d = etzVar.b;
                evdVar.e = -1;
                evdVar.f = -1;
                Object obj7 = this.a;
                if (obj7 instanceof eva) {
                    Iterator itA = ebf.h((euz) obj7).a();
                    while (true) {
                        Object obj8 = this.b;
                        if (itA.hasNext()) {
                            euz euzVar = (euz) itA.next();
                            euz euzVarB = ((euu) obj8).b();
                            if (affa.f(euzVar, euzVarB != null ? euzVarB.e : null)) {
                            }
                        } else {
                            ewp ewpVar = ((euu) obj8).b;
                            int i4 = eva.b;
                            int iC = ((euz) afrg.i(ebf.g(ewpVar.f()))).c();
                            dmw dmwVar2 = new dmw(14);
                            evfVar.d = iC;
                            urf urfVar = new urf();
                            dmwVar2.invoke(urfVar);
                            evfVar.e = urfVar.a;
                        }
                    }
                }
                return afak.a;
            case 14:
                euq euqVar = (euq) obj;
                euqVar.getClass();
                euz euzVar2 = euqVar.a;
                if (true != (euzVar2 instanceof euz)) {
                    euzVar2 = null;
                }
                if (euzVar2 == null) {
                    return null;
                }
                Object obj9 = this.b;
                evp evpVar = (evp) this.a;
                euz euzVarC = evpVar.c(euzVar2, euqVar.a(), (eve) obj9);
                if (euzVarC == null) {
                    return null;
                }
                return affa.f(euzVarC, euzVar2) ? euqVar : evpVar.f().a(euzVarC, euzVarC.d(euqVar.a()));
            case 15:
                this.b.s(null);
                ((aixm) this.a).j((flq) obj);
                return afak.a;
            case 16:
                return sx.m((String) this.b, (String) this.a, (fca) obj);
            case 17:
                fca fcaVar = (fca) obj;
                fcaVar.getClass();
                ((fnm) this.a).a.c(fcaVar, this.b);
                return afak.a;
            case 18:
                return Boolean.valueOf(sx.q((String) this.b, (String) this.a, (fca) obj));
            case 19:
                fca fcaVar2 = (fca) obj;
                fcaVar2.getClass();
                ((fnq) this.a).a.c(fcaVar2, this.b);
                return afak.a;
            default:
                fca fcaVar3 = (fca) obj;
                fcaVar3.getClass();
                fbk fbkVarA = fcaVar3.a((String) this.b);
                try {
                    fbkVarA.h(1, (String) this.a);
                    if (fbkVarA.k() && !fbkVarA.j(0)) {
                        lValueOf = Long.valueOf(fbkVarA.b(0));
                    }
                    return lValueOf;
                } finally {
                    fbkVarA.close();
                }
        }
    }

    public /* synthetic */ bpi(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ bpi(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bpi(String str, int i, byte[] bArr) {
        this.c = i;
        this.b = "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)";
        this.a = str;
    }

    public /* synthetic */ bpi(String str, int i, char[] cArr) {
        this.c = i;
        this.b = "SELECT long_value FROM Preference where `key`=?";
        this.a = str;
    }
}
