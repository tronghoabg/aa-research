package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ahp implements afdr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ahp(agg aggVar, int i) {
        this.b = i;
        this.a = aggVar;
    }

    /* JADX WARN: Type inference failed for: r9v22, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v38, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v41, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v44, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v47, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v50, types: [cwk, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        afdr afdrVar;
        bvd bvdVar;
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                aen aenVar = boz.a;
                float fFloatValue = ((Number) this.a.invoke()).floatValue();
                if (fFloatValue < BitmapDescriptorFactory.HUE_RED) {
                    fFloatValue = 0.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                break;
            case 7:
                bqj bqjVar = (bqj) this.a;
                if (!bqjVar.k() && (afdrVar = bqjVar.a) != null) {
                    afdrVar.invoke();
                }
                break;
            case 8:
                break;
            case 9:
                ?? r9 = this.a;
                aec aecVar = bsc.a;
                break;
            case 10:
                ?? r92 = this.a;
                aec aecVar2 = bsc.a;
                break;
            case 11:
                ?? r93 = this.a;
                aec aecVar3 = bsc.a;
                break;
            case 12:
                ?? r94 = this.a;
                aec aecVar4 = bsc.a;
                break;
            case 13:
                cjn.w(this.a);
                break;
            case 14:
                ((ciu) this.a).b();
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                ctc ctcVar = (ctc) this.a;
                if (!ctcVar.a() && (bvdVar = ctcVar.g) != null) {
                    bvdVar.n();
                }
                break;
            case 18:
                cvq cvqVar = (cvq) this.a;
                cvqVar.a = false;
                HashSet hashSet = new HashSet();
                aag aagVar = cvqVar.d;
                if (aagVar != null) {
                    Object[] objArr = aagVar.a;
                    int i = aagVar.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        cxb cxbVar = (cxb) objArr[i2];
                        bzi bziVar = (bzi) cvqVar.d().c(i2);
                        cfx cfxVar = cxbVar.v.f;
                        if (cfxVar.A) {
                            cvq.e(cfxVar, bziVar, hashSet);
                        }
                    }
                    aagVar.k();
                    aag aagVar2 = cvqVar.e;
                    if (aagVar2 != null) {
                        aagVar2.k();
                    }
                }
                aag aagVar3 = cvqVar.b;
                if (aagVar3 != null) {
                    Object[] objArr2 = aagVar3.a;
                    int i3 = aagVar3.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        cvy cvyVar = (cvy) objArr2[i4];
                        bzi bziVar2 = (bzi) cvqVar.c().c(i4);
                        if (cvyVar.A) {
                            cvq.e(cvyVar, bziVar2, hashSet);
                        }
                    }
                    aagVar3.k();
                    aag aagVar4 = cvqVar.c;
                    if (aagVar4 != null) {
                        aagVar4.k();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((cvy) it.next()).v();
                }
                break;
            case 19:
                ((cvy) this.a).v();
                break;
            default:
                cfw cfwVar = ((cvy) this.a).a;
                cfwVar.getClass();
                ((cvp) cfwVar).d();
                break;
        }
        return afak.a;
    }

    public /* synthetic */ ahp(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
