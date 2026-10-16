package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class cep implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cep(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        cma cmaVarR;
        long jA;
        final boolean z = true;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                synchronized (((ces) obj2).e) {
                    cer cerVar = ((ces) obj2).f;
                    cerVar.getClass();
                    Object obj3 = cerVar.b;
                    obj3.getClass();
                    int i = cerVar.c;
                    aae aaeVar = cerVar.g;
                    if (aaeVar == null) {
                        aaeVar = new aae(6);
                        cerVar.g = aaeVar;
                        cerVar.d().m(obj3, aaeVar);
                    }
                    cerVar.f(obj, i, obj3, aaeVar);
                }
                return afak.a;
            case 1:
                return Boolean.valueOf(((List) obj).retainAll(this.a));
            case 2:
                ((cun) obj).x((cuo) this.a, 0, 0);
                return afak.a;
            case 3:
                Object obj4 = this.a;
                Object obj5 = ((czq) bzi.s(((cfx) obj4).q)).J.a;
                czq czqVar = (czq) obj5;
                if (!czqVar.J.l().a()) {
                    czqVar.focusableViewAvailable((View) obj5);
                }
                dek dekVar = ((ciu) obj4).e;
                if (dekVar != null) {
                    dekVar.b();
                }
                return afak.a;
            case 4:
                cks cksVar = (cks) obj;
                ckw ckwVar = (ckw) this.a;
                cksVar.z(ckwVar.a);
                cksVar.A(ckwVar.b);
                cksVar.o(ckwVar.c);
                cksVar.F(BitmapDescriptorFactory.HUE_RED);
                cksVar.G(BitmapDescriptorFactory.HUE_RED);
                cksVar.B(ckwVar.d);
                cksVar.w(BitmapDescriptorFactory.HUE_RED);
                cksVar.x(BitmapDescriptorFactory.HUE_RED);
                cksVar.y(ckwVar.e);
                cksVar.r(ckwVar.f);
                cksVar.E(ckwVar.g);
                cksVar.C(ckwVar.h);
                cksVar.s(ckwVar.i);
                cksVar.v(null);
                cksVar.p(ckwVar.j);
                cksVar.D(ckwVar.k);
                cksVar.t(ckwVar.l);
                cksVar.q(ckwVar.m);
                cksVar.u(ckwVar.n);
                return afak.a;
            case 5:
                return Double.valueOf(afpt.a(((clv) this.a).k.a(((Double) obj).doubleValue()), r0.e, r0.f));
            case 6:
                double dDoubleValue = ((Double) obj).doubleValue();
                return Double.valueOf(((clv) this.a).n.a(afpt.a(dDoubleValue, r0.e, r0.f)));
            case 7:
                Object obj6 = this.a;
                cmd cmdVar = (cmd) obj;
                cmi cmiVar = (cmi) obj6;
                cjm cjmVar = cmiVar.v;
                if (cmiVar.h && cmiVar.t && cjmVar != null) {
                    cmaVarR = cmdVar.r();
                    jA = cmaVarR.a();
                    cmaVarR.b().g();
                    try {
                        cmaVarR.c.m(cjmVar);
                        ((cmi) obj6).f(cmdVar);
                    } finally {
                    }
                } else {
                    cmiVar.f(cmdVar);
                }
                return afak.a;
            case 8:
                cod codVar = (cod) obj;
                cnd cndVar = (cnd) this.a;
                cndVar.e(codVar);
                afec afecVar = cndVar.d;
                if (afecVar != null) {
                    afecVar.invoke(codVar);
                }
                return afak.a;
            case 9:
                cof cofVar = (cof) this.a;
                cofVar.c = true;
                cofVar.d.invoke();
                return afak.a;
            case 10:
                cmd cmdVar2 = (cmd) obj;
                cof cofVar2 = (cof) this.a;
                float f = cofVar2.g;
                float f2 = cofVar2.h;
                cmaVarR = cmdVar2.r();
                jA = cmaVarR.a();
                cmaVarR.b().g();
                cnd cndVar2 = cofVar2.a;
                try {
                    cmaVarR.c.k(f, f2, 0L);
                    cndVar2.c(cmdVar2);
                    cmaVarR.b().e();
                    cmaVarR.h(jA);
                    return afak.a;
                } finally {
                }
            case 11:
                ((cun) obj).y((cuo) this.a, 0, 0, cup.a);
                return afak.a;
            case 12:
                ((aag) this.a).p((cfw) obj);
                return true;
            case 13:
                afdr afdrVar = (afdr) obj;
                czq czqVar2 = (czq) this.a;
                Handler handler = czqVar2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    afdrVar.invoke();
                } else {
                    Handler handler2 = czqVar2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new lh(afdrVar, 11, null));
                    }
                }
                return afak.a;
            case 14:
                ((czq) this.a).J.i(((chr) obj).a, false);
                return afak.a;
            case 15:
                cxi cxiVar = (cxi) obj;
                czn cznVar = (czn) this.a;
                cso csoVarL = cznVar.l();
                byd bydVar = csoVarL != null ? csoVarL.c : null;
                if (bydVar != null && bydVar.e() > 0) {
                    zh zhVar = cvl.a;
                    long jH = cxiVar.n().h();
                    cso csoVarL2 = cznVar.l();
                    aan aanVar = csoVarL2 != null ? csoVarL2.a : null;
                    aanVar.getClass();
                    long j = jH >> 32;
                    long j2 = jH & 4294967295L;
                    cvj[] cvjVarArr = cvl.b;
                    int length = cvjVarArr.length;
                    for (int i2 = 0; i2 < 9; i2++) {
                        int i3 = (int) j2;
                        int i4 = (int) j;
                        cvj cvjVar = cvjVarArr[i2];
                        Object objA = aanVar.a(cvjVar);
                        objA.getClass();
                        cvm cvmVar = (cvm) objA;
                        cvl.a(cxiVar, cvjVar.a(), cvmVar.c, i4, i3);
                        if (cvmVar.f()) {
                            cvl.a(cxiVar, cvmVar.a, cvmVar.e, i4, i3);
                            cvl.a(cxiVar, cvmVar.b, cvmVar.f, i4, i3);
                        }
                        cvl.a(cxiVar, cvjVar.b(), cvmVar.d, i4, i3);
                    }
                    cso csoVarL3 = cznVar.l();
                    aag aagVar = csoVarL3 != null ? csoVarL3.d : null;
                    aagVar.getClass();
                    if (aagVar.g()) {
                        cso csoVarL4 = cznVar.l();
                        SnapshotStateList snapshotStateList = csoVarL4 != null ? csoVarL4.b : null;
                        snapshotStateList.getClass();
                        Object[] objArr = aagVar.a;
                        int i5 = aagVar.b;
                        for (int i6 = 0; i6 < i5; i6++) {
                            Rect rect = (Rect) ((bwq) objArr[i6]).a();
                            cuq cuqVar = (cuq) snapshotStateList.get(i6);
                            float f3 = rect.left;
                            float f4 = rect.top;
                            float f5 = rect.right;
                            float f6 = rect.bottom;
                            cxiVar.o(cuqVar.c(), f3);
                            cxiVar.o(cuqVar.b(), f4);
                            cxiVar.o(cuqVar.d(), f5);
                            cxiVar.o(cuqVar.a(), f6);
                        }
                    }
                }
                return afak.a;
            case 16:
                ((cun) obj).r((cuo) this.a, 0, 0, BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 17:
                czq czqVar3 = ((czy) this.a).b;
                return Boolean.valueOf(czqVar3.getParent().requestSendAccessibilityEvent(czqVar3, (AccessibilityEvent) obj));
            case 18:
                ((czy) this.a).v((dby) obj);
                return afak.a;
            case 19:
                day dayVar = (day) this.a;
                dbz dbzVar = dayVar.n;
                if (dbzVar != null) {
                    return dbzVar;
                }
                dad dadVar = new dad(dayVar.a);
                dayVar.n = dadVar;
                return dadVar;
            default:
                LinkedHashMap linkedHashMap = null;
                Object obj7 = this.a;
                czq czqVar4 = (czq) obj7;
                dbe dbeVar = czqVar4.g;
                if (dbeVar != null) {
                    return dbeVar;
                }
                fbg fbgVarD = czqVar4.P().d();
                int i7 = dbg.a;
                Object parent = ((View) obj7).getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                final fbe savedStateRegistry = fbgVarD.getSavedStateRegistry();
                final String strConcat = "SaveableStateRegistry:".concat(String.valueOf(strValueOf));
                Bundle bundleA = savedStateRegistry.a(strConcat);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                cdq cdqVar = new cdq(linkedHashMap, new cyo(6));
                if (savedStateRegistry.b(strConcat) != null) {
                    z = false;
                } else {
                    try {
                        savedStateRegistry.c(strConcat, new bi(cdqVar, 4));
                    } catch (IllegalArgumentException unused) {
                    }
                }
                dbe dbeVar2 = new dbe(cdqVar, new afdr() { // from class: dbf
                    @Override // defpackage.afdr
                    public final Object invoke() {
                        int i8 = dbg.a;
                        boolean z2 = z;
                        String str2 = strConcat;
                        if (z2) {
                            Object obj8 = savedStateRegistry.a;
                            synchronized (((fbj) obj8).g) {
                            }
                        }
                        return afak.a;
                    }
                });
                czqVar4.g = dbeVar2;
                return dbeVar2;
        }
    }
}
