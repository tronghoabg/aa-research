package defpackage;

import android.os.SystemClock;
import android.telecom.Call;
import android.view.KeyEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dah implements afec {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public dah(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.Object, zgp] */
    /* JADX WARN: Type inference failed for: r7v35, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v37, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v38, types: [java.lang.Object, wb] */
    /* JADX WARN: Type inference failed for: r7v41, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v42, types: [java.lang.Object, wb] */
    /* JADX WARN: Type inference failed for: r7v45, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.Object, wb] */
    /* JADX WARN: Type inference failed for: r7v53, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [djq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.Choreographer$FrameCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32, types: [aitx, java.lang.Object] */
    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        boolean zA = false;
        switch (this.c) {
            case 0:
                ((daj) this.a).a.removeFrameCallback(this.b);
                return afak.a;
            case 1:
                Object obj2 = this.a;
                synchronized (((rhi) obj2).e) {
                    ((rhi) obj2).a = true;
                    Object obj3 = ((rhi) obj2).b;
                    Object[] objArr = ((byw) obj3).a;
                    int i = ((byw) obj3).b;
                    for (int i2 = 0; i2 < i; i2++) {
                        djh djhVar = (djh) ((czc) objArr[i2]).get();
                        if (djhVar != null) {
                            djhVar.b();
                        }
                    }
                    ((byw) obj3).g();
                }
                fbf fbfVar = ((dac) this.b).d;
                ((AtomicReference) fbfVar.a).set(null);
                fbfVar.b.f();
                return afak.a;
            case 2:
                ((rz) ((aabf) this.a).a).l((Call.Callback) this.b);
                return afak.a;
            case 3:
                ((rz) ((aabf) this.a).a).l((Call.Callback) this.b);
                return afak.a;
            case 4:
                ((afak) obj).getClass();
                ahnc.d(((dxj) this.b).d, null, 0, new dxi((aitf) this.a, (afck) null, 0), 3);
                return afak.a;
            case 5:
                ahnc.d(((dyr) this.b).c, null, 0, new dxa((aitf) this.a, (dyy) obj, (afck) null, 2), 3);
                return afak.a;
            case 6:
                ((afak) obj).getClass();
                ahnc.d(((dyt) this.b).c, null, 0, new dxi((aitf) this.a, (afck) null, 2, (byte[]) null), 3);
                return afak.a;
            case 7:
                Throwable th = (Throwable) obj;
                if (th instanceof fls) {
                    ((fjn) this.b).g(((fls) th).a);
                }
                this.a.cancel(false);
                return afak.a;
            case 8:
                KeyEvent keyEvent = ((cpo) obj).a;
                keyEvent.getClass();
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 23) {
                    this.a.invoke(new gih(keyEvent, SystemClock.elapsedRealtime()));
                } else {
                    this.a.invoke(new gig(keyEvent, SystemClock.elapsedRealtime()));
                }
                this.b.b(true);
                return false;
            case 9:
                wb wbVar = (wb) obj;
                if (((Boolean) this.a.invoke(wbVar)).booleanValue()) {
                    return new ghr(true, true);
                }
                Map map = ghs.a;
                return ghs.a(this.b.invoke(wbVar));
            case 10:
                wb wbVar2 = (wb) obj;
                if (((Boolean) this.a.invoke(wbVar2)).booleanValue()) {
                    return new ghr(true, true);
                }
                Map map2 = ghs.a;
                return ghs.a(this.b.invoke(wbVar2));
            case 11:
                wb wbVar3 = (wb) obj;
                if (((Boolean) this.a.invoke(wbVar3)).booleanValue()) {
                    return new ghr(true, true);
                }
                Map map3 = ghs.a;
                return ghs.a(this.b.invoke(wbVar3));
            case 12:
                cis cisVar = (cis) obj;
                cisVar.getClass();
                if (cisVar.b()) {
                    ahnc.d(this.a, null, 0, new gfw((bca) this.b, (afck) null, 9, (byte[]) null), 3);
                }
                return afak.a;
            case 13:
                cie cieVar = (cie) obj;
                cieVar.getClass();
                cieVar.a((((Boolean) this.a.a()).booleanValue() || ((Boolean) this.b.a()).booleanValue()) ? false : true);
                return afak.a;
            case 14:
                doi doiVar = (doi) obj;
                doiVar.getClass();
                doiVar.i.k(((doj) this.a).g, BitmapDescriptorFactory.HUE_RED);
                doiVar.j.k(((doj) this.b).d, BitmapDescriptorFactory.HUE_RED);
                doj dojVar = doiVar.c;
                doiVar.e.j(dojVar.b, BitmapDescriptorFactory.HUE_RED);
                doiVar.g.j(dojVar.e, BitmapDescriptorFactory.HUE_RED);
                return afak.a;
            case 15:
                doi doiVar2 = (doi) obj;
                doiVar2.getClass();
                doiVar2.i.k(this.a != null ? ((doj) this.b).g : doiVar2.c.d, BitmapDescriptorFactory.HUE_RED);
                sx sxVar = doiVar2.f;
                doj dojVar2 = doiVar2.c;
                sxVar.j(dojVar2.c, BitmapDescriptorFactory.HUE_RED);
                doiVar2.h.j(dojVar2.f, BitmapDescriptorFactory.HUE_RED);
                doiVar2.c(new ncp("spread"));
                return afak.a;
            case 16:
                giz gizVar = (giz) obj;
                gizVar.getClass();
                int iOrdinal = gizVar.ordinal();
                if (iOrdinal == 0) {
                    zA = ((cil) this.b).a(7);
                } else if (iOrdinal == 3) {
                    zA = ((cil) this.a).a(7);
                }
                return Boolean.valueOf(zA);
            default:
                eqj eqjVar = (eqj) this.b;
                Object objE = eqjVar.e();
                affq affqVar = (affq) this.a;
                if (affqVar.a || ((objE == null && obj != null) || (objE != null && !affa.f(objE, obj)))) {
                    affqVar.a = false;
                    eqjVar.m(obj);
                }
                return afak.a;
        }
    }

    public dah(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
