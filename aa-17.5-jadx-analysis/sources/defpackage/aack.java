package defpackage;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import androidx.car.app.model.Alert;
import com.google.android.libraries.maps.model.LatLng;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
final class aack implements aaci {
    private static final AtomicInteger l = new AtomicInteger();
    public final aaco d;
    public final zwv e;
    public final ztt f;
    public final aach g;
    public volatile boolean h;
    public boolean i;
    public boolean j;
    public final xyc k;
    private final aabi m;
    private final float n;
    private final boolean o;
    private boolean p;
    private final trk q;
    private tsc r;
    private final piv s;

    public aack(aaco aacoVar, zwv zwvVar, ztt zttVar, trk trkVar, piv pivVar, xyc xycVar, float f, boolean z) {
        aabi aabiVar = new aabi(trkVar, pivVar, zwvVar, aacoVar);
        aach aachVar = aacoVar.d;
        this.h = false;
        this.d = aacoVar;
        this.e = zwvVar;
        zkt.n(zttVar, "cameraManager");
        this.f = zttVar;
        zkt.n(trkVar, "mapController");
        this.q = trkVar;
        zkt.n(pivVar, "compositePickHandler");
        this.s = pivVar;
        this.m = aabiVar;
        zkt.n(aachVar, "dragHandler");
        this.g = aachVar;
        this.k = xycVar;
        this.n = f;
        this.o = z;
    }

    private final int m(Bitmap bitmap) {
        boolean z = this.o;
        zwv zwvVar = this.e;
        if (!z) {
            return Math.round(zwvVar.b() * bitmap.getWidth()) * (-8);
        }
        return -Math.round(((zwvVar.b() * 8.0f) * bitmap.getWidth()) / this.n);
    }

    private final int n(Bitmap bitmap) {
        boolean z = this.o;
        zwv zwvVar = this.e;
        if (!z) {
            return Math.round(zwvVar.c() * bitmap.getHeight()) * (-8);
        }
        return -Math.round(((zwvVar.c() * 8.0f) * bitmap.getHeight()) / this.n);
    }

    private final void o() {
        tsc tscVar = this.r;
        zkt.n(tscVar, "pointLabel");
        if (this.e.v()) {
            tscVar.d();
            return;
        }
        tscVar.b();
        if (this.h) {
            j();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, tsb, tsc] */
    private final void p() {
        ?? r0 = this.r;
        zkt.m(r0);
        r0.a(new tsa(null, Float.valueOf(this.e.a()), null, null, null, null));
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, ymf] */
    private final void q() {
        twi twiVarH;
        twi twiVarH2;
        if (this.h) {
            aabi aabiVar = this.m;
            if (aabiVar.d()) {
                tsc tscVar = aabiVar.c;
                zkt.m(tscVar);
                tsc tscVar2 = this.r;
                zkt.m(tscVar2);
                zwv zwvVar = this.e;
                float fD = zwvVar.d();
                float f = zwvVar.f();
                synchronized (tscVar) {
                    uqt uqtVar = ((urh) tscVar).b;
                    twiVarH = uqtVar != null ? uqtVar.h() : null;
                }
                synchronized (tscVar2) {
                    uqt uqtVar2 = ((urh) tscVar2).b;
                    twiVarH2 = uqtVar2 != null ? uqtVar2.h() : null;
                }
                if (twiVarH != null && twiVarH2 != null) {
                    boolean zEquals = twiVarH.equals(twiVarH2);
                    txe txeVar = twiVarH.e;
                    if (zEquals) {
                        ((ynz) ((ynz) txe.a.g()).ai((char) 9173)).u("attempting to anchor a label to itself; doing nothing.");
                    } else {
                        qsb qsbVar = txeVar.m;
                        txd txdVar = new txd(twiVarH, twiVarH2, fD, f);
                        ?? r6 = qsbVar.a;
                        synchronized (r6) {
                            r6.t(twiVarH2, txdVar);
                        }
                    }
                    txeVar.n.l();
                    return;
                }
                if (twiVarH == null && twiVarH2 == null) {
                    synchronized (tscVar) {
                        uqt uqtVar3 = ((urh) tscVar).b;
                        if (uqtVar3 != null) {
                            abnp abnpVarN = abdo.a.n();
                            long j = ((urh) tscVar2).a.a;
                            abnpVarN.t();
                            abdo abdoVar = (abdo) abnpVarN.b;
                            abdoVar.c = 2;
                            abdoVar.d = Long.valueOf(j);
                            abnpVarN.t();
                            abdo abdoVar2 = (abdo) abnpVarN.b;
                            abdoVar2.b |= 1;
                            abdoVar2.e = fD;
                            abnpVarN.t();
                            abdo abdoVar3 = (abdo) abnpVarN.b;
                            abdoVar3.b |= 2;
                            abdoVar3.f = f;
                            uqtVar3.g((abdo) abnpVarN.q());
                        }
                    }
                    synchronized (tscVar2) {
                        uqt uqtVar4 = ((urh) tscVar2).b;
                        if (uqtVar4 != null) {
                            abnp abnpVarN2 = abdo.a.n();
                            abnpVarN2.t();
                            abdo abdoVar4 = (abdo) abnpVarN2.b;
                            abdoVar4.c = 1;
                            abdoVar4.d = true;
                            uqtVar4.g((abdo) abnpVarN2.q());
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, tsb, tsc] */
    private final void r() {
        Float fValueOf;
        Float fValueOf2;
        zwv zwvVar = this.e;
        if (zwvVar.t()) {
            fValueOf2 = Float.valueOf(zwvVar.g());
            fValueOf = null;
        } else {
            fValueOf = Float.valueOf(zwvVar.g());
            fValueOf2 = null;
        }
        ?? r10 = this.r;
        zkt.m(r10);
        r10.a(new tsa(null, null, fValueOf2, fValueOf, null, null));
    }

    @Override // defpackage.zwu
    public final Rect a() {
        zwv zwvVar = this.e;
        Bitmap bitmapJ = zwvVar.j();
        float fB = zwvVar.b() * bitmapJ.getWidth();
        float fC = zwvVar.c() * bitmapJ.getHeight();
        Point pointA = this.f.e().a(zwvVar.getPosition());
        int i = (int) fB;
        int i2 = (int) fC;
        Point point = new Point(pointA.x - i, pointA.y - i2);
        Point point2 = new Point(pointA.x + (bitmapJ.getWidth() - i), pointA.y + (bitmapJ.getHeight() - i2));
        return new Rect(point.x, point.y, point2.x, point2.y);
    }

    @Override // defpackage.zwu
    public final void b() {
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", "add");
        }
        if (this.j) {
            return;
        }
        if (l()) {
            aaco aacoVar = this.d;
            if (addm.d()) {
                aacoVar.j.put(this.e.a, this);
            } else {
                aacoVar.i.put(this.e.a, this);
            }
        }
        this.h = true;
    }

    @Override // defpackage.zwu
    public final void c() {
        zkt.g(this.h, "marker is not added.");
        zrt.a.a();
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", "handleDraggingOnEnd");
        }
        if (this.p) {
            this.p = false;
            l();
        }
    }

    @Override // defpackage.zwu
    public final void d() {
        zkt.g(this.h, "marker is not added.");
        zrt.a.a();
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", "handleDraggingOnStart");
        }
        if (this.p) {
            return;
        }
        this.p = true;
        l();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, tsb, tsc] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, tsb, tsc] */
    @Override // defpackage.zwu
    public final void e(int i) {
        zkt.g(this.h, "marker is not added.");
        zrt.a.a();
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", a.bp(i, "notifyPropertyUpdated: "));
        }
        if (this.j) {
            return;
        }
        switch (i) {
            case 0:
                LatLng latLngL = this.e.l();
                if (latLngL != null) {
                    ?? r9 = this.r;
                    zkt.m(r9);
                    r9.a(new tsa(aaaw.a(latLngL), null, null, null, null, null));
                    return;
                }
                return;
            case 1:
            case 3:
            case 11:
                l();
                return;
            case 2:
                Bitmap bitmapJ = this.e.j();
                if (bitmapJ != null) {
                    ?? r0 = this.r;
                    zkt.m(r0);
                    r0.a(new tsa(null, null, null, null, Integer.valueOf(m(bitmapJ)), Integer.valueOf(n(bitmapJ))));
                    return;
                }
                return;
            case 4:
                r();
                return;
            case 5:
                return;
            case 6:
                o();
                return;
            case 7:
            case 8:
                if (g()) {
                    this.d.n(this.m);
                    q();
                    return;
                }
                return;
            case 9:
                q();
                return;
            case 10:
                p();
                return;
            case 12:
                int iW = this.e.w();
                int i2 = iW - 1;
                if (iW == 0) {
                    throw null;
                }
                if (i2 == 0) {
                    j();
                    return;
                } else if (i2 == 1) {
                    k(true);
                    return;
                } else {
                    if (i2 != 2) {
                        return;
                    }
                    k(false);
                    return;
                }
            default:
                throw new IllegalArgumentException(a.bn(i, "Invalid notifyPropertyUpdated(", ")"));
        }
    }

    @Override // defpackage.zwu
    public final void f() {
        zkt.g(this.h, "marker is not added.");
        zrt.a.a();
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", "remove");
        }
        if (this.j) {
            return;
        }
        j();
        aach aachVar = this.g;
        zwv zwvVar = this.e;
        aachVar.b.a();
        if (a.C(zwvVar, aachVar.d)) {
            aachVar.d = null;
        }
        tsc tscVar = this.r;
        if (tscVar != null) {
            tscVar.b();
            tscVar.c();
            this.s.a(tscVar);
            this.r = null;
        }
        this.j = true;
        aaco aacoVar = this.d;
        if (addm.d()) {
            aacoVar.j.remove(zwvVar.a);
        } else {
            aacoVar.i.remove(zwvVar.a);
        }
    }

    @Override // defpackage.zwu
    public final boolean g() {
        zrt.a.a();
        return this.d.o(this.m);
    }

    @Override // defpackage.aaci
    public final int h() {
        return this.f.e().a(this.e.getPosition()).y;
    }

    @Override // defpackage.aaci
    public final zwv i() {
        return this.e;
    }

    public final void j() {
        zkt.g(this.h, "marker is not added.");
        zrt.a.a();
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", "hideInfoWindow");
        }
        if (g()) {
            this.d.m(this.m, this);
        }
    }

    public final void k(boolean z) {
        aabi aabiVar;
        aaci aaciVar;
        zkt.g(this.h, "marker is not added.");
        zrt.a.a();
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", a.bR(z, "showInfoWindow, programmatic: "));
        }
        if (this.e.isVisible()) {
            if (z && g()) {
                this.d.n(this.m);
            } else {
                aaco aacoVar = this.d;
                aabi aabiVar2 = this.m;
                synchronized (aacoVar) {
                    aabiVar = aacoVar.n;
                    aaciVar = aacoVar.m;
                }
                if (aabiVar != null && aabiVar.d()) {
                    aacoVar.m(aabiVar, aaciVar);
                }
                synchronized (aacoVar) {
                    aacoVar.n = aabiVar2;
                    aacoVar.m = this;
                }
                View view = aacoVar.c;
                aabiVar2.a(view.getWidth(), view.getHeight());
                zkt.g(this.h, "marker is not added.");
                zrt.a.a();
                if (zrn.e("MarkerRendererV3", 3)) {
                    Log.d("MarkerRendererV3", "select");
                }
                if (!this.i) {
                    this.i = true;
                    l();
                }
                aabiVar2.c();
            }
            q();
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, tsc] */
    final boolean l() {
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", "regenerateMarker");
        }
        zwv zwvVar = this.e;
        Bitmap bitmapJ = zwvVar.j();
        if (bitmapJ == null) {
            return false;
        }
        tsc tscVar = this.r;
        if (zrn.e("MarkerRendererV3", 3)) {
            Log.d("MarkerRendererV3", "buildPointLabel");
        }
        int iM = m(bitmapJ);
        int iN = n(bitmapJ);
        abnp abnpVarN = abcv.a.n();
        abnpVarN.t();
        abcv abcvVar = (abcv) abnpVarN.b;
        abcvVar.b |= 256;
        abcvVar.i = Alert.DURATION_SHOW_INDEFINITELY;
        abnpVarN.t();
        abcv abcvVar2 = (abcv) abnpVarN.b;
        abcvVar2.b |= 4096;
        abcvVar2.m = iM;
        abnpVarN.t();
        abcv abcvVar3 = (abcv) abnpVarN.b;
        abcvVar3.b |= 8192;
        abcvVar3.n = iN;
        if (zwvVar.t()) {
            abnpVarN.t();
            abcv abcvVar4 = (abcv) abnpVarN.b;
            abcvVar4.k = 2;
            abcvVar4.b |= 1024;
        }
        abnr abnrVar = (abnr) abdr.a.n();
        abnr abnrVar2 = (abnr) abcf.a.n();
        abnrVar2.t();
        abcf abcfVar = (abcf) abnrVar2.b;
        abcfVar.b |= 1;
        abcfVar.c = 0;
        abcv abcvVar5 = (abcv) abnpVarN.q();
        abnrVar2.t();
        abcf abcfVar2 = (abcf) abnrVar2.b;
        abcvVar5.getClass();
        abcfVar2.e = abcvVar5;
        abcfVar2.b |= 4;
        abnrVar.bj(abnrVar2);
        uqk uqkVar = new uqk((abdr) abnrVar.q());
        rjg rjgVarO = this.q.o();
        ajnt ajntVarA = Ctry.a();
        ajntVarA.b = abfi.WORLD_ENCODING_LAT_LNG_E7;
        kex kexVarK = rjgVarO.k(uqkVar, ajntVarA.h());
        Object obj = kexVarK.a;
        abnp abnpVar = (abnp) obj;
        abnpVar.t();
        abnr abnrVar3 = (abnr) obj;
        abcs abcsVar = (abcs) abnrVar3.b;
        abcs abcsVar2 = abcs.a;
        abcsVar.b |= 128;
        abcsVar.i = 32767;
        abnr abnrVar4 = (abnr) abco.a.n();
        abnrVar4.bd((abcn) kexVarK.l(tss.e(bitmapJ)).q());
        abnpVar.t();
        abcs abcsVar3 = (abcs) abnrVar3.b;
        abco abcoVar = (abco) abnrVar4.q();
        abcoVar.getClass();
        abcsVar3.c = abcoVar;
        abcsVar3.b |= 1;
        int i = zwvVar.i();
        if (i == 1) {
            abnpVar.t();
            abcs abcsVar4 = (abcs) abnrVar3.b;
            abcsVar4.b |= 64;
            abcsVar4.h = 9;
        } else if (i != 2) {
            abnpVar.t();
            abcs abcsVar5 = (abcs) abnrVar3.b;
            abcsVar5.b |= 64;
            abcsVar5.h = 11;
        } else {
            abnpVar.t();
            abcs abcsVar6 = (abcs) abnrVar3.b;
            abcsVar6.b |= 64;
            abcsVar6.h = 8;
        }
        if (this.p) {
            int i2 = 3 | ((abcs) abnrVar3.b).h;
            abnpVar.t();
            abcs abcsVar7 = (abcs) abnrVar3.b;
            abcsVar7.b |= 64;
            abcsVar7.h = i2;
        }
        if (this.i || this.p) {
            abnpVar.t();
            abcs abcsVar8 = (abcs) abnrVar3.b;
            abcsVar8.b |= 16384;
            abcsVar8.n = 2147483646;
        } else {
            abnpVar.t();
            abcs abcsVar9 = (abcs) abnrVar3.b;
            abcsVar9.b |= 16384;
            abcsVar9.n = 2147483645;
        }
        int iE = aaaw.e(zwvVar.h()) ^ Integer.MIN_VALUE;
        abnpVar.t();
        abcs abcsVar10 = (abcs) abnrVar3.b;
        abcsVar10.b |= 32768;
        abcsVar10.o = iE;
        abki abkiVar = c;
        int i3 = uxa.a;
        abnrVar3.bc(abbf.M, abkiVar);
        abnp abnpVarN2 = abdp.a.n();
        String str = zwvVar.a;
        abnpVarN2.t();
        abdp abdpVar = (abdp) abnpVarN2.b;
        str.getClass();
        abdpVar.b |= 1;
        abdpVar.c = str;
        abdp abdpVar2 = (abdp) abnpVarN2.q();
        abnrVar3.bc(abhx.d, Integer.valueOf(l.getAndIncrement()));
        abnrVar3.bc(abhx.a, zwvVar.t() ? b : a);
        abnrVar3.bc(abbf.U, abdpVar2);
        abnrVar3.bc(abhx.f, true);
        boolean z = this.o;
        if (z && zwvVar.a() != 1.0f) {
            abnh abnhVar = abhx.g;
            abnp abnpVarN3 = abij.a.n();
            float fA = zwvVar.a();
            abnpVarN3.t();
            abij abijVar = (abij) abnpVarN3.b;
            abijVar.b |= 1;
            abijVar.c = fA;
            abnrVar3.bc(abnhVar, (abij) abnpVarN3.q());
        }
        abnr abnrVar5 = (abnr) abdl.a.n();
        abnrVar5.bc(abdn.v, abdpVar2);
        abnh abnhVar2 = aaez.a;
        abnp abnpVarN4 = aaey.a.n();
        int i4 = ((abcs) abnrVar3.b).n;
        abnpVarN4.t();
        aaey aaeyVar = (aaey) abnpVarN4.b;
        aaeyVar.b |= 1;
        aaeyVar.c = i4;
        int i5 = ((abcs) abnrVar3.b).o;
        abnpVarN4.t();
        aaey aaeyVar2 = (aaey) abnpVarN4.b;
        aaeyVar2.b |= 2;
        aaeyVar2.d = i5;
        abnrVar5.bc(abnhVar2, (aaey) abnpVarN4.q());
        abnpVar.t();
        abcs abcsVar11 = (abcs) abnrVar3.b;
        abdl abdlVar = (abdl) abnrVar5.q();
        abdlVar.getClass();
        abcsVar11.u = abdlVar;
        abcsVar11.b |= 65536;
        LatLng latLngL = zwvVar.l();
        zkt.m(latLngL);
        abnp abnpVarN5 = abag.a.n();
        abah abahVarF = tss.f(too.l(latLngL.latitude, latLngL.longitude));
        abnpVarN5.t();
        abag abagVar = (abag) abnpVarN5.b;
        abahVarF.getClass();
        abagVar.c = abahVarF;
        abagVar.b |= 1;
        abaf abafVar = abaf.BOTTOM_RIGHT;
        abnpVarN5.t();
        abag abagVar2 = (abag) abnpVarN5.b;
        abagVar2.d = abafVar.j;
        abagVar2.b |= 2;
        if (z) {
            if (zwvVar.t()) {
                abnpVarN5.t();
                abag abagVar3 = (abag) abnpVarN5.b;
                abagVar3.b |= 4;
                abagVar3.e = (int) (zwvVar.g() * 10.0d);
                abnpVarN5.t();
                abag abagVar4 = (abag) abnpVarN5.b;
                abagVar4.f = 1;
                abagVar4.b |= 8;
            } else {
                abnpVarN5.t();
                abag abagVar5 = (abag) abnpVarN5.b;
                abagVar5.b |= 4;
                abagVar5.e = (int) (zwvVar.g() * 10.0d);
                abnpVarN5.t();
                abag abagVar6 = (abag) abnpVarN5.b;
                abagVar6.f = 2;
                abagVar6.b |= 8;
            }
        }
        abnpVar.t();
        abcs abcsVar12 = (abcs) abnrVar3.b;
        abag abagVar7 = (abag) abnpVarN5.q();
        abagVar7.getClass();
        abcsVar12.e = abagVar7;
        abcsVar12.b |= 8;
        this.r = kexVarK.k();
        if (!z) {
            r();
            p();
        }
        q();
        piv pivVar = this.s;
        tsc tscVar2 = this.r;
        zkt.m(tscVar2);
        pivVar.b(tscVar2, new aacj(this, 0));
        o();
        if (tscVar != null) {
            tscVar.b();
            tscVar.c();
            pivVar.a(tscVar);
        }
        return true;
    }
}
