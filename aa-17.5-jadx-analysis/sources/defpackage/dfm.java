package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dfm implements deq {
    public final dkx a;
    public final long b;
    public final die c;
    public final dhx d;
    public final dhy e;
    public final dhs f;
    public final String g;
    public final long h;
    public final dkm i;
    public final dky j;
    public final dkd k;
    public final long l;
    public final dku m;
    public final cku n;
    public final dfk o;
    public final czz p;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ dfm(long j, long j2, die dieVar, dhx dhxVar, dhy dhyVar, dhs dhsVar, String str, long j3, dkm dkmVar, dky dkyVar, long j4, dku dkuVar, cku ckuVar, int i) {
        long j5;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        long j6;
        if ((i & 1) != 0) {
            float[] fArr = clj.a;
            j5 = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        } else {
            j5 = j;
        }
        if ((i & 2) != 0) {
            dlu[] dluVarArr = dlt.a;
            jFloatToRawIntBits = Float.floatToRawIntBits(Float.NaN) & 4294967295L;
        } else {
            jFloatToRawIntBits = j2;
        }
        die dieVar2 = (i & 4) != 0 ? null : dieVar;
        dhx dhxVar2 = (i & 8) != 0 ? null : dhxVar;
        dhy dhyVar2 = (i & 16) != 0 ? null : dhyVar;
        dhs dhsVar2 = (i & 32) != 0 ? null : dhsVar;
        String str2 = (i & 64) != 0 ? null : str;
        if ((i & 128) != 0) {
            dlu[] dluVarArr2 = dlt.a;
            jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.NaN) & 4294967295L;
        } else {
            jFloatToRawIntBits2 = j3;
        }
        dkm dkmVar2 = (i & 256) != 0 ? null : dkmVar;
        dky dkyVar2 = (i & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : dkyVar;
        if ((i & 2048) != 0) {
            float[] fArr2 = clj.a;
            j6 = cjn.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, clj.u);
        } else {
            j6 = j4;
        }
        this(j5, jFloatToRawIntBits, dieVar2, dhxVar2, dhyVar2, dhsVar2, str2, jFloatToRawIntBits2, dkmVar2, dkyVar2, j6, (i & 4096) != 0 ? null : dkuVar, (i & 8192) != 0 ? null : ckuVar);
    }

    public static /* synthetic */ dfm f(dfm dfmVar, long j, int i) {
        long jB = (i & 1) != 0 ? dfmVar.b() : j;
        long j2 = (i & 2) != 0 ? dfmVar.b : 0L;
        die dieVar = (i & 4) != 0 ? dfmVar.c : null;
        dhx dhxVar = (i & 8) != 0 ? dfmVar.d : null;
        dhy dhyVar = (i & 16) != 0 ? dfmVar.e : null;
        dhs dhsVar = (i & 32) != 0 ? dfmVar.f : null;
        String str = dfmVar.g;
        long j3 = dfmVar.h;
        dkm dkmVar = dfmVar.i;
        dky dkyVar = dfmVar.j;
        dkd dkdVar = dfmVar.k;
        long j4 = jB;
        long j5 = dfmVar.l;
        dku dkuVar = dfmVar.m;
        cku ckuVar = dfmVar.n;
        dfk dfkVar = dfmVar.o;
        return new dfm(j4 == dfmVar.b() ? dfmVar.a : dlf.x(j4), j2, dieVar, dhxVar, dhyVar, dhsVar, str, j3, dkmVar, dkyVar, dkdVar, j5, dkuVar, ckuVar, dfmVar.p);
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final dfm c(dfm dfmVar) {
        if (dfmVar == null) {
            return this;
        }
        dkx dkxVar = dfmVar.a;
        long jB = dkxVar.b();
        dkxVar.e();
        dkxVar.a();
        return dfn.a(this, jB, dfmVar.b, dfmVar.c, dfmVar.d, dfmVar.e, dfmVar.f, dfmVar.g, dfmVar.h, dfmVar.i, dfmVar.j, dfmVar.k, dfmVar.l, dfmVar.m, dfmVar.n, dfmVar.p);
    }

    public final boolean d(dfm dfmVar) {
        if (this == dfmVar) {
            return true;
        }
        long j = this.b;
        long j2 = dfmVar.b;
        dlu[] dluVarArr = dlt.a;
        if (j != j2 || !affa.f(this.c, dfmVar.c) || !affa.f(this.d, dfmVar.d) || !affa.f(this.e, dfmVar.e) || !affa.f(this.f, dfmVar.f) || !affa.f(this.g, dfmVar.g) || this.h != dfmVar.h || !affa.f(this.i, dfmVar.i) || !affa.f(this.j, dfmVar.j) || !affa.f(this.k, dfmVar.k) || this.l != dfmVar.l) {
            return false;
        }
        dfk dfkVar = dfmVar.o;
        return true;
    }

    public final boolean e(dfm dfmVar) {
        return affa.f(this.a, dfmVar.a) && affa.f(this.m, dfmVar.m) && affa.f(this.n, dfmVar.n) && affa.f(this.p, dfmVar.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfm)) {
            return false;
        }
        dfm dfmVar = (dfm) obj;
        return d(dfmVar) && e(dfmVar);
    }

    public final void g() {
        this.a.e();
    }

    public final int hashCode() {
        long jB = b();
        g();
        int iFloatToIntBits = (((int) (jB ^ (jB >>> 32))) * 961) + Float.floatToIntBits(a());
        dlu[] dluVarArr = dlt.a;
        die dieVar = this.c;
        int i = dieVar != null ? dieVar.o : 0;
        long j = this.b;
        long j2 = j >>> 32;
        int i2 = iFloatToIntBits * 31;
        dhx dhxVar = this.d;
        int i3 = (((((i2 + ((int) (j ^ j2))) * 31) + i) * 31) + (dhxVar != null ? dhxVar.a : 0)) * 31;
        dhy dhyVar = this.e;
        int i4 = (i3 + (dhyVar != null ? dhyVar.a : 0)) * 31;
        dhs dhsVar = this.f;
        int iHashCode = (i4 + (dhsVar != null ? dhsVar.hashCode() : 0)) * 31;
        String str = this.g;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        long j3 = this.h;
        int i5 = (((iHashCode + iHashCode2) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        dkm dkmVar = this.i;
        int iFloatToIntBits2 = (i5 + (dkmVar != null ? Float.floatToIntBits(dkmVar.a) : 0)) * 31;
        dky dkyVar = this.j;
        int iHashCode3 = (iFloatToIntBits2 + (dkyVar != null ? dkyVar.hashCode() : 0)) * 31;
        dkd dkdVar = this.k;
        int iHashCode4 = dkdVar != null ? dkdVar.hashCode() : 0;
        long j4 = this.l;
        int i6 = (((iHashCode3 + iHashCode4) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31;
        dku dkuVar = this.m;
        int i7 = (i6 + (dkuVar != null ? dkuVar.d : 0)) * 31;
        cku ckuVar = this.n;
        int iHashCode5 = (i7 + (ckuVar != null ? ckuVar.hashCode() : 0)) * 961;
        czz czzVar = this.p;
        return iHashCode5 + (czzVar != null ? czzVar.hashCode() : 0);
    }

    public final String toString() {
        String strG = cjv.g(b());
        g();
        long j = this.l;
        long j2 = this.h;
        long j3 = this.b;
        return "SpanStyle(color=" + strG + ", brush=null, alpha=" + a() + ", fontSize=" + dlt.c(j3) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + dlt.c(j2) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + cjv.g(j) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=null, drawStyle=" + this.p + ")";
    }

    public dfm(long j, long j2, die dieVar, dhx dhxVar, dhy dhyVar, dhs dhsVar, String str, long j3, dkm dkmVar, dky dkyVar, long j4, dku dkuVar, cku ckuVar) {
        this(dlf.x(j), j2, dieVar, dhxVar, dhyVar, dhsVar, str, j3, dkmVar, dkyVar, null, j4, dkuVar, ckuVar, null);
    }

    public dfm(dkx dkxVar, long j, die dieVar, dhx dhxVar, dhy dhyVar, dhs dhsVar, String str, long j2, dkm dkmVar, dky dkyVar, dkd dkdVar, long j3, dku dkuVar, cku ckuVar, czz czzVar) {
        this.a = dkxVar;
        this.b = j;
        this.c = dieVar;
        this.d = dhxVar;
        this.e = dhyVar;
        this.f = dhsVar;
        this.g = str;
        this.h = j2;
        this.i = dkmVar;
        this.j = dkyVar;
        this.k = dkdVar;
        this.l = j3;
        this.m = dkuVar;
        this.n = ckuVar;
        this.o = null;
        this.p = czzVar;
    }
}
