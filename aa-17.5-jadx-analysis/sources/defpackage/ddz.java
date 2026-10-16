package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class ddz implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ddz(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v20, types: [cwd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v30, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v57, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        dal dalVar;
        int i = 17;
        Rect rect = null;
        switch (this.b) {
            case 0:
                ((List) obj).add(this.a.invoke());
                return true;
            case 1:
                Object obj2 = this.a;
                deb debVar = ddx.a;
                List listSingletonList = Collections.singletonList(obj2);
                listSingletonList.getClass();
                ((dec) obj).a(debVar, listSingletonList);
                return afak.a;
            case 2:
                ((dme) this.a).p = (afec) obj;
                return afak.a;
            case 3:
                ((cxb) this.a).ab((dlg) obj);
                return afak.a;
            case 4:
                cym cymVar = (cym) obj;
                czqVar = cymVar instanceof czq ? (czq) cymVar : 0;
                Object obj3 = this.a;
                if (czqVar != 0 && (dalVar = czqVar.y) != null) {
                    dalVar.removeViewInLayout((View) obj3);
                    Object objRemove = dalVar.a.remove(obj3);
                    HashMap map = dalVar.b;
                    affz.i(map);
                    map.remove(objRemove);
                    ((dme) obj3).setImportantForAccessibility(0);
                }
                ((dme) obj3).removeAllViewsInLayout();
                return afak.a;
            case 5:
                cjb cjbVar = (cjb) obj;
                Object obj4 = this.a;
                cfx cfxVar = (cfx) obj4;
                if (cfxVar.A) {
                    ahnc.d(cfxVar.N(), null, 0, new bns((dml) obj4, cjbVar, (afck) null, 17), 3);
                }
                return afak.a;
            case 6:
                ?? r10 = this.a;
                cho choVar = (cho) obj;
                View viewG = vs.g((cfx) r10);
                if (!viewG.isFocused() && !viewG.hasFocus()) {
                    cic cicVar = ((czq) bzi.s(r10)).J;
                    View viewC = tt.c(r10);
                    Integer numD = chw.d(choVar.a);
                    int[] iArr = new int[2];
                    viewC.getLocationOnScreen(iArr);
                    int[] iArr2 = new int[2];
                    viewG.getLocationOnScreen(iArr2);
                    cjb cjbVarC = cicVar.c();
                    if (cjbVarC != null) {
                        int i2 = iArr[0];
                        int i3 = ((int) cjbVarC.b) + i2;
                        int i4 = iArr2[0];
                        int i5 = iArr[1];
                        int i6 = ((int) cjbVarC.c) + i5;
                        int i7 = iArr2[1];
                        rect = new Rect(i3 - i4, i6 - i7, (((int) cjbVarC.d) + i2) - i4, (((int) cjbVarC.e) + i5) - i7);
                    }
                    if (!chw.e(viewG, numD, rect)) {
                        choVar.a();
                    }
                }
                return afak.a;
            case 7:
                vs.g((cfx) this.a);
                return afak.a;
            case 8:
                Object obj5 = this.a;
                ((dnm) obj5).show();
                return new dmt(obj5, 0);
            case 9:
                return a.ag(this.a, (cun) obj);
            case 10:
                cst cstVarQ = ((cst) obj).q();
                cstVarQ.getClass();
                dnq dnqVar = (dnq) this.a;
                dnqVar.g.b(cstVarQ);
                dnqVar.m();
                return afak.a;
            case 11:
                dnq dnqVar2 = (dnq) this.a;
                dnqVar2.f.b((dlq) obj);
                dnqVar2.n();
                return afak.a;
            case 12:
                ((dnm) this.a).a.invoke();
                return afak.a;
            case 13:
                afdr afdrVar = (afdr) obj;
                dnq dnqVar3 = (dnq) this.a;
                Handler handler = dnqVar3.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    afdrVar.invoke();
                } else {
                    Handler handler2 = dnqVar3.getHandler();
                    if (handler2 != null) {
                        handler2.post(new lh(afdrVar, 16, czqVar));
                    }
                }
                return afak.a;
            case 14:
                cks cksVar = (cks) obj;
                dqa dqaVar = (dqa) this.a;
                if (!Float.isNaN(dqaVar.f) || !Float.isNaN(dqaVar.g)) {
                    cksVar.E(roc.aA(Float.isNaN(dqaVar.f) ? 0.5f : dqaVar.f, Float.isNaN(dqaVar.g) ? 0.5f : dqaVar.g));
                }
                if (!Float.isNaN(dqaVar.h)) {
                    cksVar.w(dqaVar.h);
                }
                if (!Float.isNaN(dqaVar.i)) {
                    cksVar.x(dqaVar.i);
                }
                if (!Float.isNaN(dqaVar.j)) {
                    cksVar.y(dqaVar.j);
                }
                if (!Float.isNaN(dqaVar.k)) {
                    cksVar.F(dqaVar.k);
                }
                if (!Float.isNaN(dqaVar.l)) {
                    cksVar.G(dqaVar.l);
                }
                if (!Float.isNaN(dqaVar.m)) {
                    cksVar.B(dqaVar.m);
                }
                if (!Float.isNaN(dqaVar.n) || !Float.isNaN(dqaVar.o)) {
                    cksVar.z(Float.isNaN(dqaVar.n) ? 1.0f : dqaVar.n);
                    cksVar.A(Float.isNaN(dqaVar.o) ? 1.0f : dqaVar.o);
                }
                if (!Float.isNaN(dqaVar.p)) {
                    cksVar.o(dqaVar.p);
                }
                return afak.a;
            case 15:
                afdr afdrVar2 = (afdr) obj;
                if (affa.f(Looper.myLooper(), Looper.getMainLooper())) {
                    afdrVar2.invoke();
                } else {
                    dor dorVar = (dor) this.a;
                    Handler handler3 = dorVar.a;
                    if (handler3 == null) {
                        handler3 = new Handler(Looper.getMainLooper());
                        dorVar.a = handler3;
                    }
                    handler3.post(new lh(afdrVar2, i, czqVar));
                }
                return afak.a;
            case 16:
                ((dor) this.a).c = true;
                return afak.a;
            case 17:
                File file = (File) obj;
                file.getClass();
                return new egt(dsz.i(this.a), file);
            case 18:
                ((eqj) this.a).m(obj);
                return afak.a;
            case 19:
                Object obj6 = this.a;
                aisp aispVar = euw.a;
                ((String) obj).getClass();
                return Boolean.valueOf(!fbb.f((Bundle) obj6, r11));
            default:
                aezu aezuVar = (aezu) obj;
                aezuVar.getClass();
                return Boolean.valueOf(affa.f(aezuVar.a, this.a));
        }
    }
}
