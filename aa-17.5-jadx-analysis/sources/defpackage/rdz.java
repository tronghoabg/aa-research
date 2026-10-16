package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import com.google.android.gms.car.control.CarProperty;
import com.google.android.gms.car.control.CarPropertySetError;
import com.google.android.libraries.geo.mapcore.internal.label.jni.SharedLabelerJni;
import com.google.android.libraries.maps.model.Tile;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class rdz implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public rdz(adzp adzpVar, smn smnVar, int i) {
        this.d = i;
        this.b = smnVar;
        this.a = "ConnectionlessLifecycleHelper";
        this.c = adzpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object, uoq] */
    /* JADX WARN: Type inference failed for: r0v16, types: [afck, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [dzg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, ttv] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v97, types: [com.google.android.libraries.maps.model.TileProvider, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v99, types: [java.lang.Object, uoq] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, uoq] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, uda] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, tqc] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, tqc] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.Object, xyc] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, uda] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, uda] */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, ucf] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, tqr] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.lang.Object, uko] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, uoq] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, xyc] */
    @Override // java.lang.Runnable
    public final void run() {
        long j;
        Tile tile;
        boolean zS;
        boolean zS2;
        int iAt;
        boolean z = false;
        switch (this.d) {
            case 0:
                Object obj = this.b;
                Object obj2 = this.a;
                ((ype) nss.a.l().ai((char) 5415)).M("%s insets changed to %s", obj2, obj);
                wer.c();
                sgk sgkVar = (sgk) this.c;
                nso nsoVar = ((nss) sgkVar.b).b;
                if (Objects.equals(nsoVar.o, obj2)) {
                    yfu yfuVar = new yfu(4);
                    Map map = nsoVar.g;
                    for (Map.Entry entry : map.entrySet()) {
                        yfuVar.e((nsn) entry.getKey(), new Rect(((nsm) entry.getValue()).e));
                    }
                    Object obj3 = sgkVar.a;
                    yfy yfyVarD = yfuVar.d(true);
                    nsoVar.z((Rect) obj);
                    woy.aa(yfyVarD.keySet().equals(map.keySet()), "Number of windows changed during an inset-only change");
                    kgq.d(new mja(nsoVar, yfyVarD, (qrn) obj3, 5), "GH.DisplayLayout", yzz.DISPLAY_LAYOUT, yzy.rK, "Car not connected during display change", new Object[0]);
                    return;
                }
                return;
            case 1:
                ((qmd) this.b).a.y((String) this.a);
                this.c.run();
                return;
            case 2:
                this.b.getClass();
                Object obj4 = this.c;
                obj4.getClass();
                ((rir) this.a).a.a.w(new aezw(woy.dE(new kkb((CarPropertySetError) obj4))));
                return;
            case 3:
                ((rzj) this.c).k(this.a, this.b);
                return;
            case 4:
                adzp adzpVar = (adzp) this.c;
                if (adzpVar.b > 0) {
                    Object obj5 = this.b;
                    Object obj6 = adzpVar.c;
                    ((smn) obj5).d(obj6 != null ? ((Bundle) obj6).getBundle((String) this.a) : null);
                }
                if (adzpVar.b >= 2) {
                    ((smn) this.b).i();
                }
                if (adzpVar.b >= 3) {
                    ((smb) this.b).k();
                }
                if (adzpVar.b >= 4) {
                    ((smn) this.b).j();
                    return;
                }
                return;
            case 5:
                ((tnq) this.b).q((String) this.a, (ufj) this.c);
                return;
            case 6:
                ((tnq) this.b).c().c(this.c, this.a);
                return;
            case 7:
                this.c.G(this.b, (rfe) this.a);
                return;
            case 8:
                pzw pzwVar = new pzw(zcf.LONG_PRESS);
                qaa qaaVarC = qaa.c(abws.a);
                vaq.d();
                uqi uqiVar = ((twm) this.a).k;
                qau qauVar = uqiVar.b;
                if (uqiVar.a != null || zcf.AUTOMATED.equals(pzwVar.a)) {
                    woy.ad(qaaVarC.b(), "Invalid UE3 params: %s", qaaVarC);
                    abwo abwoVar = qaaVarC.f;
                    if (abwoVar != null) {
                        woy.ad(true, "logUiInteraction is called with Request Type: %s. Use logRequest instead.", abwoVar);
                    } else {
                        ((ynz) ((ynz) ((ynz) qau.a.g()).q(ypd.FULL)).ai(6983)).u("Attempted to log interaction without VE type.");
                    }
                    qas qasVarF = qauVar.f(qauVar.n, null);
                    List list = qauVar.h;
                    synchronized (list) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((qac) it.next()).a();
                        }
                    }
                    qauVar.f.execute(new xx(qauVar, pzwVar, qaaVarC, qasVarF, 17));
                }
                this.c.b((too) this.b);
                return;
            case 9:
                this.c.a(this.a, (too) this.b);
                return;
            case 10:
                Object obj7 = this.b;
                ((tvl) obj7).m();
                ((txe) this.c).k.e((abcs) this.a, (twi) obj7);
                return;
            case 11:
                Object obj8 = this.c;
                uel uelVar = (uel) obj8;
                Map map2 = uelVar.m;
                Object obj9 = this.b;
                if (map2.containsKey(obj9)) {
                    ((ynz) ((ynz) uel.a.g()).ai(9275)).x("[Labeler thread] The same labeling hint id %d is added twice.", ((trt) obj9).a);
                } else {
                    Object obj10 = this.a;
                    SharedLabelerJni sharedLabelerJni = uelVar.i;
                    sharedLabelerJni.getClass();
                    map2.put(obj9, Long.valueOf(sharedLabelerJni.nativeAddLabelingHint(sharedLabelerJni.b, ((abmd) obj10).h())));
                    ((ynz) ((ynz) uel.a.e()).ai(9274)).x("[Labeler thread] executed addLabelingHint[%d] from pending work queue", ((trt) obj9).a);
                }
                synchronized (obj8) {
                    ((uel) obj8).u--;
                }
                return;
            case 12:
                ?? r0 = this.b;
                Object obj11 = this.a;
                Object obj12 = this.c;
                synchronized (obj12) {
                    if (!((ufs) obj12).x) {
                        abgl abglVar = ((ufs) obj12).b;
                        xuv xuvVarD = xuw.d("TileOverlay.startEarlyTileFetching() ", abglVar);
                        try {
                            usy usyVar = new usy((usy) obj11);
                            List list2 = ((ufs) obj12).C;
                            long jA = r0.a(usyVar, list2);
                            if (((ufs) obj12).t != jA && !list2.isEmpty()) {
                                z = true;
                            }
                            if (abglVar == abgl.GMM_VECTOR_BASE) {
                                ((ufs) obj12).D.p(jA);
                            }
                            if (z) {
                                if (((ufs) obj12).A) {
                                    j = jA;
                                    if (((ufs) obj12).e.u(usyVar.l(), list2, null, usyVar.n().c, 0, false, true, uqw.c())) {
                                    }
                                } else {
                                    j = jA;
                                }
                                ((ufs) obj12).t = j;
                                ((ufs) obj12).r = true;
                            }
                            xuvVarD.close();
                        } finally {
                        }
                    }
                }
                return;
            case 13:
                vaq.d();
                Object obj13 = this.b;
                Object obj14 = this.c;
                if (((rhj) obj14).c.add(obj13)) {
                    Object obj15 = ((rhj) obj14).a;
                    int i = ((ukp) obj13).b;
                    int i2 = ((ukp) obj13).c;
                    int i3 = ((ukp) obj13).a;
                    try {
                        tile = ((aaau) obj15).b.getTile(i, i2, i3);
                    } catch (RuntimeException e) {
                        zrn.c(String.format(Locale.US, "Failed to get tile (%d, %d, %d) from TileProvider", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)), e);
                        tile = null;
                    }
                    byte[] bArr = tile != null ? tile.equalsNoTile() ? new byte[0] : tile.data : null;
                    ((rhj) obj14).c.remove(obj13);
                    Object obj16 = this.a;
                    if (bArr != null) {
                        Object obj17 = ((whk) obj16).c;
                        ((umx) obj17).j(((umx) obj17).g, new saq((whk) obj16, (ukp) ((whk) obj16).a, (uoq) ((whk) obj16).b, bArr, 6));
                        return;
                    } else {
                        Object obj18 = ((whk) obj16).c;
                        ((umx) obj18).j(((umx) obj18).g, new rdz(obj16, (ukp) ((whk) obj16).a, (uoq) ((whk) obj16).b, 15));
                        return;
                    }
                }
                return;
            case 14:
                ?? r02 = this.a;
                Object obj19 = this.b;
                Object obj20 = this.c;
                rdz rdzVar = new rdz(obj20, (ukp) obj19, (uoq) r02, 16);
                umx umxVar = (umx) obj20;
                umxVar.j(umxVar.g, rdzVar);
                return;
            case 15:
                ynz ynzVar = (ynz) ((ynz) umx.a.f()).ai(9431);
                String strName = umx.b.name();
                Object obj21 = this.b;
                ynzVar.M("Error encountered in fetching tile: %s TileStore type: %s", obj21, strName);
                Object obj22 = ((whk) this.c).c;
                umx umxVar2 = (umx) obj22;
                uof uofVar = umxVar2.e;
                uofVar.a((ukp) obj21);
                uoe uoeVar = (uoe) uofVar.b.get(obj21);
                long j2 = uoeVar == null ? 0L : uoeVar.c;
                if (j2 <= 0) {
                    return;
                }
                umxVar2.h.schedule(new rdz(obj22, obj21, this.a, 14, (char[]) null), j2 + 50, TimeUnit.MILLISECONDS);
                return;
            case 16:
                ((umx) this.c).e((ukp) this.b, this.a, uop.NETWORK_ERROR, null);
                return;
            case 17:
                yob yobVar = unb.a;
                unv unvVar = (unv) this.c;
                uoq uoqVar = unvVar.c;
                if (uoqVar != 0) {
                    uoqVar.a(unvVar.b, (uop) this.a, this.b);
                    return;
                }
                return;
            case 18:
                vaq.d();
                Object obj23 = this.b;
                Object obj24 = this.a;
                Object obj25 = ((urg) this.c).a;
                synchronized (((unb) obj25).b) {
                    ((unb) obj25).l((unv) obj24, (pwu) obj23);
                }
                return;
            case 19:
                Object obj26 = this.a;
                unp unpVar = (unp) this.b;
                yig yigVar = unpVar.e;
                synchronized (yigVar) {
                    zS = yigVar.s(obj26);
                }
                yig yigVar2 = unpVar.f;
                synchronized (yigVar2) {
                    zS2 = yigVar2.s(obj26);
                }
                if (((upy) this.c).l()) {
                    return;
                }
                if (zS || zS2) {
                    ((ynz) ((ynz) unp.a.h()).ai((char) 9465)).u("(non-prefetch) Style table fetching incomplete after 60s");
                    return;
                }
                return;
            default:
                url urlVar = (url) this.b;
                tsd tsdVarA = urlVar.a();
                urlVar.c();
                zqr zqrVar = (zqr) this.a;
                zqu zquVar = zqrVar.c;
                if (zquVar == null) {
                    zquVar = zqu.a;
                }
                kex kexVar = (kex) this.c;
                if (!((Boolean) kexVar.c.gu()).booleanValue() || (iAt = a.at(zquVar.d)) == 0 || iAt != 2) {
                    int iAt2 = a.at(zquVar.b);
                    int i4 = iAt2 != 0 ? iAt2 : 1;
                    if (i4 != 4 && i4 != 2) {
                        zqv zqvVar = zquVar.c;
                        if (zqvVar == null) {
                            zqvVar = zqv.a;
                        }
                        int i5 = zqvVar.b;
                    }
                }
                tse tseVar = new tse();
                tseVar.a();
                tseVar.b();
                int i6 = zqrVar.d;
                ((Boolean) kexVar.b.gu()).booleanValue();
                tseVar.b();
                if ((zqrVar.b & 4) != 0) {
                    long j3 = zqrVar.e;
                }
                tseVar.a();
                if (tseVar.a != 3) {
                    throw new IllegalStateException();
                }
                tsdVarA.a();
                return;
        }
    }

    public /* synthetic */ rdz(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ rdz(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public /* synthetic */ rdz(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ rdz(Object obj, String str, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = str;
        this.c = obj2;
    }

    public rdz(Object obj, ukp ukpVar, uoq uoqVar, int i) {
        this.d = i;
        this.b = ukpVar;
        this.a = uoqVar;
        this.c = obj;
    }

    public rdz(qmd qmdVar, String str, Runnable runnable, int i) {
        this.d = i;
        this.a = str;
        this.c = runnable;
        this.b = qmdVar;
    }

    public /* synthetic */ rdz(rir rirVar, CarProperty carProperty, CarPropertySetError carPropertySetError, int i) {
        this.d = i;
        this.a = rirVar;
        this.b = carProperty;
        this.c = carPropertySetError;
    }

    public /* synthetic */ rdz(twm twmVar, tqc tqcVar, too tooVar, int i) {
        this.d = i;
        this.a = twmVar;
        this.c = tqcVar;
        this.b = tooVar;
    }
}
