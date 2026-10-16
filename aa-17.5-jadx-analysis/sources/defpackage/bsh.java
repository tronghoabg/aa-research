package defpackage;

import android.net.ConnectivityManager;
import android.telecom.Call;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.car.app.model.Action;
import androidx.work.impl.WorkDatabase;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class bsh implements afdr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bsh(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [cwc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, uq] */
    /* JADX WARN: Type inference failed for: r10v1, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v45, types: [cst, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [aixl, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        List listBY;
        Object obj;
        cxb cxbVar;
        cjb cjbVar;
        int i = 12;
        cfj cfjVar = null;
        boolean z = false;
        switch (this.c) {
            case 0:
                this.a.j(this.b);
                return afak.a;
            case 1:
                return new sx((bqr) this.b, (afec) this.a);
            case 2:
                this.a.j(this.b);
                return afak.a;
            case 3:
                bji bjiVar = new bji(this.a, i);
                bvv bvvVar = (bvv) ((cff) this.b).b;
                bzg bzgVar = bvvVar.c;
                bzf bzfVarE = bzgVar.e();
                int i2 = 0;
                while (true) {
                    try {
                        if (i2 < bzgVar.b) {
                            if (bzfVarE.B(i2) && ((Boolean) bjiVar.invoke(bzfVarE.o(i2))).booleanValue()) {
                                cfj cfjVar2 = new cfj(i2, null);
                                bzfVarE.r();
                                cfjVar = cfjVar2;
                            } else {
                                int[] iArr = bzfVarE.b;
                                int i3 = i2 + 1;
                                int iD = (i3 < bzfVarE.c ? iArr[(i3 * 5) + 4] : bzfVarE.d) - bzi.d(iArr, i2);
                                for (int i4 = 0; i4 < iD; i4++) {
                                    if (((Boolean) bjiVar.invoke(bzfVarE.l(i2, i4))).booleanValue()) {
                                        cfjVar = new cfj(i2, Integer.valueOf(i4));
                                    }
                                }
                                i2 = i3;
                            }
                        }
                    } finally {
                    }
                }
                if (cfjVar != null) {
                    bzg bzgVar2 = bvvVar.c;
                    int i5 = cfjVar.a;
                    Integer num = cfjVar.b;
                    bzf bzfVarE2 = bzgVar2.e();
                    try {
                        List listC = vh.c(bzfVarE2, i5, num);
                        bzfVarE2.r();
                        listBY = woy.bY(listC, bvvVar.T());
                    } finally {
                    }
                } else {
                    listBY = afbe.a;
                }
                return new admq(listBY, bvvVar.k);
            case 4:
                ((affv) this.a).a = ((ciu) this.b).b();
                return afak.a;
            case 5:
                ((cqe) this.a).c((cfx) this.b);
                return afak.a;
            case 6:
                return Boolean.valueOf(czq.X((czq) this.a, (KeyEvent) this.b));
            case 7:
                return Boolean.valueOf(czq.Z((czq) this.a, (MotionEvent) this.b));
            case 8:
                dby dbyVar = (dby) this.a;
                ddp ddpVar = dbyVar.d;
                ddp ddpVar2 = dbyVar.e;
                Float f = dbyVar.b;
                Float f2 = dbyVar.c;
                float fFloatValue = (ddpVar == null || f == null) ? 0.0f : ((Number) ddpVar.a.invoke()).floatValue() - f.floatValue();
                float fFloatValue2 = (ddpVar2 == null || f2 == null) ? 0.0f : ((Number) ddpVar2.a.invoke()).floatValue() - f2.floatValue();
                if (fFloatValue != BitmapDescriptorFactory.HUE_RED || fFloatValue2 != BitmapDescriptorFactory.HUE_RED) {
                    Object obj2 = this.b;
                    czy czyVar = (czy) obj2;
                    int iM = czyVar.m(dbyVar.a);
                    hig higVar = (hig) czyVar.q().a(czyVar.d);
                    if (higVar != null) {
                        try {
                            edg edgVar = ((czy) obj2).f;
                            if (edgVar != null) {
                                edgVar.o(((czy) obj2).M(higVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    hig higVar2 = (hig) czyVar.q().a(czyVar.e);
                    if (higVar2 != null) {
                        try {
                            edg edgVar2 = ((czy) obj2).g;
                            if (edgVar2 != null) {
                                edgVar2.o(((czy) obj2).M(higVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    czyVar.b.invalidate();
                    hig higVar3 = (hig) czyVar.q().a(iM);
                    if (higVar3 != null && (obj = higVar3.b) != null && (cxbVar = ((ddu) obj).a) != null) {
                        if (ddpVar != null) {
                            czyVar.t.g(iM, ddpVar);
                        }
                        if (ddpVar2 != null) {
                            czyVar.u.g(iM, ddpVar2);
                        }
                        czyVar.u(cxbVar);
                    }
                }
                if (ddpVar != null) {
                    dbyVar.b = (Float) ddpVar.a.invoke();
                }
                if (ddpVar2 != null) {
                    dbyVar.c = (Float) ddpVar2.a.invoke();
                }
                return afak.a;
            case 9:
                ?? r0 = this.a;
                if (r0 != 0 && (cjbVar = (cjb) r0.invoke()) != null) {
                    return cjbVar;
                }
                ?? r10 = this.b;
                boolean zT = r10.t();
                cst cstVar = r10;
                if (true != zT) {
                    cstVar = null;
                }
                if (cstVar != null) {
                    return byx.E(0L, dln.k(cstVar.h()));
                }
                return null;
            case 10:
                byd bydVar = (byd) this.b;
                bydVar.h((bydVar.e() + 1) % ((Object[]) this.a).length);
                return afak.a;
            case 11:
                ((affv) this.a).a = bzi.x(this.b, cum.a);
                return afak.a;
            case 12:
                ((Call) ((rz) this.a).a).unregisterCallback((Call.Callback) this.b);
                return afak.a;
            case 13:
                ajab ajabVar = ((evr) this.a).g;
                ajabVar.d(woy.aR((Set) ajabVar.b(), this.b));
                return afak.a;
            case 14:
                Object obj3 = this.a;
                ebl eblVar = ((evr) obj3).h;
                Object obj4 = this.b;
                synchronized (eblVar) {
                    ajab ajabVar2 = ((evr) obj3).f;
                    Iterable iterable = (Iterable) ajabVar2.b();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : iterable) {
                        if (affa.f((euq) obj5, obj4)) {
                            ajabVar2.d(arrayList);
                        } else {
                            arrayList.add(obj5);
                        }
                    }
                    ajabVar2.d(arrayList);
                }
                return afak.a;
            case 15:
                evr evrVar = (evr) this.a;
                for (euq euqVar : (Iterable) evrVar.e.b()) {
                    if (ewh.k()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + euqVar + " due to fragment " + this.b + " viewmodel being cleared");
                    }
                    evrVar.c(euqVar);
                }
                return afak.a;
            case 16:
                Object obj6 = this.b;
                Object obj7 = this.a;
                synchronized (fmm.b) {
                    Map map = fmm.c;
                    map.remove(obj7);
                    if (map.isEmpty()) {
                        fjo.a().c(fmp.a, "NetworkRequestConstraintController unregister shared callback");
                        ((ConnectivityManager) obj6).unregisterNetworkCallback(fmm.a);
                        fmm.f = null;
                        fmm.d = null;
                        fmm.e = false;
                    }
                }
                return afak.a;
            case 17:
                fnc fncVar = ((fmq) this.a).a;
                Object obj8 = this.b;
                synchronized (fncVar.b) {
                    LinkedHashSet linkedHashSet = fncVar.c;
                    if (linkedHashSet.remove(obj8) && linkedHashSet.isEmpty()) {
                        fncVar.e();
                    }
                }
                return afak.a;
            case 18:
                Object obj9 = this.b;
                flo floVar = (flo) obj9;
                WorkDatabase workDatabase = floVar.d;
                workDatabase.getClass();
                workDatabase.m(new esx(obj9, this.a, i, (byte[]) (z ? 1 : 0)));
                fkq.a(floVar.c, floVar.d, floVar.e);
                return afak.a;
            case 19:
                uq onClickDelegate = ((Action) this.b).getOnClickDelegate();
                if (onClickDelegate != null) {
                    gca.e((geu) this.a, onClickDelegate);
                }
                return afak.a;
            default:
                return a.ad((geu) this.a, this.b);
        }
    }

    public /* synthetic */ bsh(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
