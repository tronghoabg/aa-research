package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dfw {
    public static final dfw a = new dfw(0, 0, null, null, 0, 0, 0, 16777215);
    public final dfm b;
    public final dfg c;
    public final dfl d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dfw(long j, long j2, die dieVar, dhs dhsVar, long j3, int i, long j4, int i2) {
        long j5;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long j6;
        long jFloatToRawIntBits3;
        if ((i2 & 1) != 0) {
            float[] fArr = clj.a;
            j5 = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            dlu[] dluVarArr = dlt.a;
            jFloatToRawIntBits = Float.floatToRawIntBits(Float.NaN) & 4294967295L;
        } else {
            jFloatToRawIntBits = j2;
        }
        die dieVar2 = (i2 & 4) != 0 ? null : dieVar;
        dhs dhsVar2 = (i2 & 32) != 0 ? null : dhsVar;
        if ((i2 & 128) != 0) {
            dlu[] dluVarArr2 = dlt.a;
            jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN) & 4294967295L;
        } else {
            jFloatToRawIntBits2 = j3;
        }
        if ((i2 & 2048) != 0) {
            float[] fArr2 = clj.a;
            j6 = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        } else {
            j6 = 0;
        }
        long j7 = j6;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        if ((i2 & 131072) != 0) {
            dlu[] dluVarArr3 = dlt.a;
            jFloatToRawIntBits3 = 4294967295L & Float.floatToRawIntBits(Float.NaN);
        } else {
            jFloatToRawIntBits3 = j4;
        }
        this(new dfm(j5, jFloatToRawIntBits, dieVar2, null, null, dhsVar2, null, jFloatToRawIntBits2, null, null, j7, null, null), new dfg(i3, 0, jFloatToRawIntBits3, null, null, null, 0, 0, null), null);
    }

    public static /* synthetic */ dfw v(dfw dfwVar, long j, long j2, die dieVar, dhx dhxVar, dhs dhsVar, String str, long j3, cku ckuVar, int i, int i2, long j4, dfl dflVar, dks dksVar, int i3) {
        int i4;
        int i5;
        int i6;
        czz czzVar;
        long j5;
        long j6;
        dkz dkzVar;
        dkz dkzVar2;
        dks dksVar2;
        long jB = (i3 & 1) != 0 ? dfwVar.b.b() : j;
        long j7 = (i3 & 2) != 0 ? dfwVar.b.b : j2;
        die dieVar2 = (i3 & 4) != 0 ? dfwVar.b.c : dieVar;
        dhx dhxVar2 = (i3 & 8) != 0 ? dfwVar.b.d : dhxVar;
        dhy dhyVar = (i3 & 16) != 0 ? dfwVar.b.e : null;
        dhs dhsVar2 = (i3 & 32) != 0 ? dfwVar.b.f : dhsVar;
        String str2 = (i3 & 64) != 0 ? dfwVar.b.g : str;
        long j8 = (i3 & 128) != 0 ? dfwVar.b.h : j3;
        dkm dkmVar = (i3 & 256) != 0 ? dfwVar.b.i : null;
        dky dkyVar = (i3 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? dfwVar.b.j : null;
        dkd dkdVar = (i3 & 1024) != 0 ? dfwVar.b.k : null;
        long j9 = jB;
        long j10 = (i3 & 2048) != 0 ? dfwVar.b.l : 0L;
        dku dkuVar = (i3 & 4096) != 0 ? dfwVar.b.m : null;
        cku ckuVar2 = (i3 & 8192) != 0 ? dfwVar.b.n : ckuVar;
        dku dkuVar2 = dkuVar;
        czz czzVar2 = (i3 & 16384) != 0 ? dfwVar.b.p : null;
        int i7 = (i3 & 32768) != 0 ? dfwVar.c.a : i;
        if ((i3 & 65536) != 0) {
            i4 = i7;
            i5 = dfwVar.c.b;
        } else {
            i4 = i7;
            i5 = i2;
        }
        if ((i3 & 131072) != 0) {
            i6 = i5;
            czzVar = czzVar2;
            j5 = dfwVar.c.c;
        } else {
            i6 = i5;
            czzVar = czzVar2;
            j5 = j4;
        }
        if ((i3 & 262144) != 0) {
            j6 = j5;
            dkzVar = dfwVar.c.d;
        } else {
            j6 = j5;
            dkzVar = null;
        }
        dfl dflVar2 = (i3 & 524288) != 0 ? dfwVar.d : dflVar;
        if ((i3 & 1048576) != 0) {
            dkzVar2 = dkzVar;
            dksVar2 = dfwVar.c.f;
        } else {
            dkzVar2 = dkzVar;
            dksVar2 = dksVar;
        }
        dfg dfgVar = dfwVar.c;
        cku ckuVar3 = ckuVar2;
        int i8 = dfgVar.g;
        int i9 = dfgVar.h;
        dla dlaVar = dfgVar.i;
        dfm dfmVar = dfwVar.b;
        return new dfw(new dfm(j9 == dfmVar.b() ? dfmVar.a : dlf.x(j9), j7, dieVar2, dhxVar2, dhyVar, dhsVar2, str2, j8, dkmVar, dkyVar, dkdVar, j10, dkuVar2, ckuVar3, czzVar), new dfg(i4, i6, j6, dkzVar2, dflVar2 != null ? dflVar2.b : null, dksVar2, i8, i9, dlaVar), dflVar2);
    }

    public static /* synthetic */ dfw w(dfw dfwVar, long j, long j2, die dieVar, long j3, dku dkuVar, int i, long j4, int i2) {
        long j5;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long j6;
        long jFloatToRawIntBits3;
        if ((i2 & 1) != 0) {
            float[] fArr = clj.a;
            j5 = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            dlu[] dluVarArr = dlt.a;
            jFloatToRawIntBits = Float.floatToRawIntBits(Float.NaN) & 4294967295L;
        } else {
            jFloatToRawIntBits = j2;
        }
        die dieVar2 = (i2 & 4) != 0 ? null : dieVar;
        if ((i2 & 128) != 0) {
            dlu[] dluVarArr2 = dlt.a;
            jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN) & 4294967295L;
        } else {
            jFloatToRawIntBits2 = j3;
        }
        if ((i2 & 2048) != 0) {
            float[] fArr2 = clj.a;
            j6 = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        } else {
            j6 = 0;
        }
        long j7 = j6;
        dku dkuVar2 = (i2 & 4096) != 0 ? null : dkuVar;
        int i3 = (32768 & i2) != 0 ? 0 : i;
        if ((i2 & 131072) != 0) {
            dlu[] dluVarArr3 = dlt.a;
            jFloatToRawIntBits3 = 4294967295L & Float.floatToRawIntBits(Float.NaN);
        } else {
            jFloatToRawIntBits3 = j4;
        }
        dfm dfmVar = dfwVar.b;
        dfm dfmVarA = dfn.a(dfmVar, j5, jFloatToRawIntBits, dieVar2, null, null, null, null, jFloatToRawIntBits2, null, null, null, j7, dkuVar2, null, null);
        dfg dfgVar = dfwVar.c;
        dfg dfgVarA = dfh.a(dfgVar, i3, 0, jFloatToRawIntBits3, null, null, null, 0, 0, null);
        return (dfmVar == dfmVarA && dfgVar == dfgVarA) ? dfwVar : new dfw(dfmVarA, dfgVarA);
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfw)) {
            return false;
        }
        dfw dfwVar = (dfw) obj;
        return affa.f(this.b, dfwVar.b) && affa.f(this.c, dfwVar.c) && affa.f(this.d, dfwVar.d);
    }

    public final long f() {
        return this.b.b;
    }

    public final long g() {
        return this.b.h;
    }

    public final long h() {
        return this.c.c;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + (this.d != null ? 38347 : 0);
    }

    public final cku i() {
        return this.b.n;
    }

    public final dfw j(dfw dfwVar) {
        if (affa.f(dfwVar, a)) {
            return this;
        }
        return new dfw(this.b.c(dfwVar.b), this.c.a(dfwVar.c));
    }

    public final dhs k() {
        return this.b.f;
    }

    public final dhx l() {
        return this.b.d;
    }

    public final dhy m() {
        return this.b.e;
    }

    public final die n() {
        return this.b.c;
    }

    public final dkd o() {
        return this.b.k;
    }

    public final dks p() {
        return this.c.f;
    }

    public final dku q() {
        return this.b.m;
    }

    public final dkz r() {
        return this.c.d;
    }

    public final dla s() {
        return this.c.i;
    }

    public final boolean t(dfw dfwVar) {
        return this == dfwVar || this.b.e(dfwVar.b);
    }

    public final String toString() {
        String strG = cjv.g(e());
        x();
        float fA = a();
        String strC = dlt.c(f());
        die dieVarN = n();
        dhx dhxVarL = l();
        dhy dhyVarM = m();
        dhs dhsVarK = k();
        String strC2 = dlt.c(g());
        dkd dkdVarO = o();
        dfm dfmVar = this.b;
        String strG2 = cjv.g(dfmVar.l);
        dku dkuVarQ = q();
        cku ckuVarI = i();
        czz czzVarY = y();
        String strA = dkt.a(c());
        String strA2 = dkv.a(d());
        String strC3 = dlt.c(h());
        dkz dkzVarR = r();
        dks dksVarP = p();
        String strA3 = dkq.a(b());
        dla dlaVarS = s();
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(strG);
        sb.append(", brush=null, alpha=");
        sb.append(fA);
        sb.append(", fontSize=");
        sb.append(strC);
        sb.append(", fontWeight=");
        sb.append(dieVarN);
        sb.append(", fontStyle=");
        sb.append(dhxVarL);
        sb.append(", fontSynthesis=");
        sb.append(dhyVarM);
        sb.append(", fontFamily=");
        sb.append(dhsVarK);
        sb.append(", fontFeatureSettings=");
        sb.append(dfmVar.g);
        sb.append(", letterSpacing=");
        sb.append(strC2);
        sb.append(", baselineShift=");
        sb.append(dfmVar.i);
        sb.append(", textGeometricTransform=");
        sb.append(dfmVar.j);
        sb.append(", localeList=");
        sb.append(dkdVarO);
        sb.append(", background=");
        sb.append(strG2);
        sb.append(", textDecoration=");
        sb.append(dkuVarQ);
        sb.append(", shadow=");
        sb.append(ckuVarI);
        sb.append(", drawStyle=");
        sb.append(czzVarY);
        sb.append(", textAlign=");
        sb.append(strA);
        sb.append(", textDirection=");
        sb.append(strA2);
        sb.append(", lineHeight=");
        sb.append(strC3);
        sb.append(", textIndent=");
        sb.append(dkzVarR);
        dfg dfgVar = this.c;
        dfl dflVar = this.d;
        sb.append(", platformStyle=");
        sb.append(dflVar);
        sb.append(", lineHeightStyle=");
        sb.append(dksVarP);
        sb.append(", lineBreak=");
        sb.append(strA3);
        sb.append(", hyphens=");
        sb.append(dkp.a(dfgVar.h));
        sb.append(", textMotion=");
        sb.append(dlaVarS);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u(dfw dfwVar) {
        if (this != dfwVar) {
            return affa.f(this.c, dfwVar.c) && this.b.d(dfwVar.b);
        }
        return true;
    }

    public final void x() {
        this.b.g();
    }

    public final czz y() {
        return this.b.p;
    }

    public dfw(dfm dfmVar, dfg dfgVar, dfl dflVar) {
        this.b = dfmVar;
        this.c = dfgVar;
        this.d = dflVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public dfw(dfm dfmVar, dfg dfgVar) {
        dfj dfjVar = dfgVar.e;
        this(dfmVar, dfgVar, dfjVar == null ? null : new dfl(dfjVar));
    }
}
