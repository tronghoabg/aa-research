package defpackage;

import android.graphics.Point;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;
import com.google.android.libraries.maps.model.LatLng;
import com.google.android.libraries.maps.model.LatLngBounds;
import com.google.android.libraries.maps.model.VisibleRegion;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class aaet {
    private static final ThreadLocal b = new aaeq();
    private static final ThreadLocal c = new aaer();
    private static final ThreadLocal d = new aaes();
    public final double a;
    private final zsb e;
    private aaep f;
    private zsb g;
    private aadu h;
    private aadu i;
    private boolean j;
    private Float k;
    private final usy l;

    public aaet(usy usyVar, int i, int i2, double d2) {
        zrq zrqVar = new zrq(i, i2);
        zkt.n(usyVar, "gmmCamera");
        this.l = usyVar;
        this.e = zrqVar;
        this.a = d2;
        this.f = aaep.a;
        this.j = false;
        synchronized (this) {
            this.h = null;
        }
    }

    private final synchronized CameraPosition y(CameraPosition cameraPosition, double d2, double d3) {
        too tooVar;
        float fSqrt;
        ttl ttlVar;
        too tooVar2 = (too) b.get();
        tooVar2.s(0, 0, 0);
        trp trpVarA = ttn.a(aaaw.b(cameraPosition, null));
        float f = trpVarA.h;
        usy usyVar = this.l;
        float fB = usyVar.b();
        float fC = usyVar.c();
        int iJ = usyVar.j();
        float fA = tsw.a(f, fB, iJ, usyVar.f());
        float f2 = trpVarA.d;
        float f3 = trpVarA.e;
        toi toiVar = trpVarA.a;
        float f4 = fA / (fC * iJ);
        too tooVarD = tsw.d(f2 + 90.0f);
        too tooVarD2 = tsw.d(f2);
        too tooVarK = too.k(toiVar);
        float fSin = (-((float) d3)) * f4;
        if (f3 > BitmapDescriptorFactory.HUE_RED) {
            double dAtan2 = Math.atan2(fSin, fA);
            tooVar = tooVarK;
            fSin = fA * ((float) (Math.sin(dAtan2) / Math.cos((f3 * 0.017453292519943295d) + dAtan2)));
            fSqrt = ((float) Math.sqrt(((fA * fA) + (fSin * fSin)) - (((fA + fA) * fSin) * Math.cos((f3 + 90.0f) * 0.017453292519943295d)))) / fA;
        } else {
            tooVar = tooVarK;
            fSqrt = 1.0f;
        }
        too.q(tooVarD, (-(((float) d2) * f4)) * fSqrt, tooVarD);
        too.q(tooVarD2, -fSin, tooVarD2);
        too.n(tooVar.h(tooVarD), tooVarD2, tooVar2);
        ttlVar = new ttl(aaaw.b(cameraPosition, null));
        ttlVar.e(tooVar2);
        return aaaw.c(ttlVar.a());
    }

    private static CameraPosition z(usy usyVar, CameraPosition cameraPosition, double d2, double d3) {
        return aaaw.c(tsw.k(usyVar, aaaw.b(cameraPosition, null), (float) d2, (float) d3));
    }

    public final synchronized double a() {
        return this.l.b();
    }

    public final synchronized float b() {
        Float f;
        f = this.k;
        return f != null ? f.floatValue() : this.l.o().l;
    }

    public final synchronized tto c() {
        return this.l.o().o;
    }

    public final synchronized CameraPosition d() throws Throwable {
        try {
            try {
                aadu aaduVarN = n();
                return y(g(), -aaduVarN.a, -aaduVarN.b);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized CameraPosition e(CameraPosition cameraPosition, float f, aadu aaduVar) {
        usy usyVar;
        double d2;
        double d3;
        CameraPosition cameraPositionBuild;
        usyVar = new usy(this.l);
        double dK = usyVar.k();
        double dJ = usyVar.j();
        d2 = aaduVar.a - (dK / 2.0d);
        d3 = aaduVar.b - (dJ / 2.0d);
        CameraPosition cameraPositionZ = z(usyVar, cameraPosition, d2, d3);
        CameraPosition.Builder builder = CameraPosition.builder(cameraPositionZ);
        builder.bearing(cameraPositionZ.bearing + f);
        cameraPositionBuild = builder.build();
        usyVar.t(aaaw.b(cameraPositionBuild, null));
        return z(usyVar, cameraPositionBuild, -d2, -d3);
    }

    public final synchronized CameraPosition f(CameraPosition cameraPosition, float f, aadu aaduVar, aacz aaczVar) {
        usy usyVar;
        double d2;
        double d3;
        CameraPosition cameraPositionBuild;
        zkt.n(cameraPosition, "startPosition");
        zkt.n(aaczVar, "sanitizer");
        usyVar = new usy(this.l);
        double dK = usyVar.k();
        double dJ = usyVar.j();
        float fA = aaczVar.a(cameraPosition.zoom + f, cameraPosition.target, this);
        d2 = aaduVar.a - (dK / 2.0d);
        d3 = aaduVar.b - (dJ / 2.0d);
        CameraPosition.Builder builder = CameraPosition.builder(z(usyVar, cameraPosition, d2, d3));
        builder.zoom(fA);
        cameraPositionBuild = builder.build();
        usyVar.t(aaaw.b(cameraPositionBuild, null));
        return z(usyVar, cameraPositionBuild, -d2, -d3);
    }

    public final synchronized CameraPosition g() {
        return aaaw.c(this.l.o());
    }

    public final synchronized CameraPosition h(CameraPosition cameraPosition) throws Throwable {
        try {
            try {
                aadu aaduVarN = n();
                return y(cameraPosition, aaduVarN.a, aaduVarN.b);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized LatLng i(float f, float f2, boolean z) {
        float f3;
        float f4;
        if (z) {
            aadu aaduVarO = o();
            f4 = (float) aaduVarO.a;
            f3 = (float) aaduVarO.b;
        } else {
            float f5 = ((zrq) k()).a;
            f3 = ((zrq) r6).b / 2.0f;
            f4 = f5 / 2.0f;
        }
        toi toiVarA = new tye(new usy(this.l)).a(new Point(Math.round(f4 + f), Math.round(f3 + f2)));
        if (toiVarA == null) {
            return null;
        }
        return aaaw.d(toiVarA);
    }

    public final synchronized zsb j(zsb zsbVar) {
        aaep aaepVar;
        if (((zrq) zsbVar).a <= 0 || ((zrq) zsbVar).b <= 0) {
            zsbVar = k();
        }
        aaepVar = this.f;
        return new zrq((((zrq) zsbVar).a - aaepVar.b) - aaepVar.d, (((zrq) zsbVar).b - aaepVar.c) - aaepVar.e);
    }

    public final synchronized zsb k() {
        usy usyVar = this.l;
        int iK = usyVar.k();
        int iJ = usyVar.j();
        if (iK > 0 && iJ > 0) {
            zsb zsbVar = this.g;
            if (zsbVar == null || ((zrq) zsbVar).a != iK || ((zrq) zsbVar).b != iJ) {
                this.g = new zrq(iK, iJ);
            }
            return this.g;
        }
        return this.e;
    }

    public final synchronized aacs l() {
        return m(k());
    }

    public final synchronized aacs m(zsb zsbVar) {
        usy usyVar;
        toi toiVar;
        toi toiVar2;
        toi toiVar3;
        toi toiVar4;
        tok tokVar;
        usy usyVar2 = this.l;
        usyVar = new usy(usyVar2);
        int i = ((zrq) zsbVar).b;
        usyVar.u(((zrq) zsbVar).a, i);
        float[] fArr = (float[]) c.get();
        Arrays.fill(fArr, BitmapDescriptorFactory.HUE_RED);
        aaep aaepVar = this.f;
        toe toeVarH = tsw.h(usyVar, aaepVar.b, r4 - aaepVar.d, aaepVar.c, i - aaepVar.e, fArr);
        Object[] objArr = {usyVar2.o()};
        if (toeVarH == null) {
            throw new NullPointerException(String.format("Frustum is null at %s", objArr));
        }
        too[] tooVarArr = (too[]) d.get();
        Arrays.fill(tooVarArr, (Object) null);
        tooVarArr[0] = toeVarH.e(0);
        tooVarArr[1] = toeVarH.e(1);
        tooVarArr[2] = toeVarH.e(2);
        tooVarArr[3] = toeVarH.e(3);
        tpj tpjVar = new tpj(tooVarArr);
        too[] tooVarArr2 = tpjVar.a;
        toi toiVarP = tmo.p(tooVarArr2[0]);
        toi toiVarP2 = tmo.p(tooVarArr2[1]);
        toi toiVarP3 = tmo.p(tooVarArr2[3]);
        toi toiVarP4 = tmo.p(tooVarArr2[2]);
        tpk tpkVar = tpjVar.c;
        toj tojVar = new toj();
        tojVar.b(tmo.p(tpkVar.c));
        tojVar.b(tmo.p(tpkVar.b));
        woy.aa(!tojVar.a(), "No points included");
        tpi tpiVar = new tpi(toiVarP, toiVarP2, toiVarP3, toiVarP4, new tok(new toi(tojVar.a, tojVar.c), new toi(tojVar.b, tojVar.d)));
        toiVar = tpiVar.a;
        toiVar2 = tpiVar.b;
        toiVar3 = tpiVar.c;
        toiVar4 = tpiVar.d;
        tokVar = tpiVar.e;
        return new aacs(new tye(usyVar), new VisibleRegion(aaaw.d(toiVar), aaaw.d(toiVar2), aaaw.d(toiVar3), aaaw.d(toiVar4), new LatLngBounds(aaaw.d(tokVar.a), aaaw.d(tokVar.b))));
    }

    public final synchronized aadu n() {
        aaep aaepVar = this.f;
        int i = aaepVar.b - aaepVar.d;
        double d2 = aaepVar.c - aaepVar.e;
        double d3 = i / 2.0d;
        double d4 = d2 / 2.0d;
        aadu aaduVar = this.i;
        if (aaduVar == null || aaduVar.a != d3 || aaduVar.b != d4) {
            this.i = new aadu(d3, d4);
        }
        return this.i;
    }

    public final synchronized aadu o() {
        zsb zsbVarK = k();
        aaep aaepVar = this.f;
        int i = aaepVar.b;
        double d2 = i;
        int i2 = (((zrq) zsbVarK).a - i) - aaepVar.d;
        double d3 = d2 + (i2 / 2.0d);
        double d4 = aaepVar.c + (((((zrq) zsbVarK).b - r2) - aaepVar.e) / 2.0d);
        aadu aaduVar = this.h;
        if (aaduVar == null || aaduVar.a != d3 || aaduVar.b != d4) {
            this.h = new aadu(d3, d4);
        }
        return this.h;
    }

    public final synchronized aaep p() {
        return this.f;
    }

    public final synchronized void q(aaet aaetVar) {
        synchronized (aaetVar) {
            zkt.n(aaetVar, "other");
            zsb zsbVarK = aaetVar.k();
            w(((zrq) zsbVarK).a, ((zrq) zsbVarK).b);
            u(aaetVar.g(), aaetVar.c());
        }
    }

    public final synchronized void r(aaep aaepVar) {
        zkt.n(aaepVar, "Cannot set null WindowPadding.");
        if (a.C(this.f, aaepVar)) {
            return;
        }
        this.f = aaepVar;
    }

    public final synchronized void s() {
        this.j = true;
    }

    public final synchronized void t(CameraPosition cameraPosition) {
        this.l.t(aaaw.b(cameraPosition, null));
    }

    public final synchronized void u(CameraPosition cameraPosition, tto ttoVar) {
        this.l.t(aaaw.b(cameraPosition, ttoVar));
    }

    public final synchronized void v(Float f) {
        this.k = f;
    }

    public final synchronized void w(int i, int i2) {
        this.l.u(i, i2);
    }

    public final synchronized boolean x() {
        return this.j;
    }
}
