package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class xqq {
    public final xqu a;
    public final xqw b;
    public final xqx c;
    public final xqy d;
    public final xrb e;
    public final xqm f;
    public final xqm g;
    public final xqz h;
    public final xqn i;
    public final xqv j;

    public /* synthetic */ xqq(byte[] bArr) {
        this(new xqu(), new xqw(null), new xqx(null), null, null, null, null, null, null, null);
    }

    public final Map a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        xqu xquVar = this.a;
        Float f = xquVar.c;
        if (f != null) {
            float fFloatValue = f.floatValue();
            xsn xsnVar = xsw.a;
            float f2 = xquVar.e;
            float[] fArr = xquVar.g;
            linkedHashMap.put(xsw.c, Float.valueOf(wpq.H(f2, xta.c(fArr) + fFloatValue + xta.d(fArr), fFloatValue, ((double) f2) < 0.5d ? xta.c(fArr) : xta.d(fArr))));
            linkedHashMap.put(xsw.f, Float.valueOf(Math.max(fFloatValue, xquVar.j ? 0.0f : xquVar.m)));
        }
        Float f3 = xquVar.b;
        if (f3 != null) {
            float fFloatValue2 = f3.floatValue();
            xsn xsnVar2 = xsw.a;
            float f4 = xquVar.f;
            float[] fArr2 = xquVar.g;
            linkedHashMap.put(xsw.d, Float.valueOf(wpq.H(f4, xta.e(fArr2) + fFloatValue2 + xta.a(fArr2), fFloatValue2, ((double) f4) < 0.5d ? xta.e(fArr2) : xta.a(fArr2))));
            linkedHashMap.put(xsw.e, Float.valueOf(Math.max(fFloatValue2, xquVar.j ? 0.0f : xquVar.l)));
        }
        xsn xsnVar3 = xsw.a;
        linkedHashMap.put(xsw.g, xquVar.d);
        linkedHashMap.put(xsw.h, xquVar.g);
        linkedHashMap.put(xsw.i, Float.valueOf(xquVar.k));
        xqw xqwVar = this.b;
        if (xqwVar != null) {
            linkedHashMap.put(xsw.k, Float.valueOf(xqwVar.a));
            linkedHashMap.put(xsw.l, Float.valueOf(xqwVar.b));
            linkedHashMap.put(xsw.m, Integer.valueOf(xqwVar.c));
            linkedHashMap.put(xsw.j, Float.valueOf(xqwVar.d));
        }
        xqx xqxVar = this.c;
        if (xqxVar != null) {
            linkedHashMap.put(xsw.p, Float.valueOf(xqxVar.a));
            linkedHashMap.put(xsw.n, Integer.valueOf(xqxVar.b));
            linkedHashMap.put(xsw.o, Float.valueOf(xqxVar.c));
            linkedHashMap.put(xsw.q, Integer.valueOf(xqxVar.d));
            linkedHashMap.put(xsw.r, Integer.valueOf(xqxVar.e));
        }
        xqy xqyVar = this.d;
        if (xqyVar != null) {
            xsk xskVar = xsw.t;
            Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            linkedHashMap.put(xskVar, fValueOf);
            linkedHashMap.put(xsw.u, Float.valueOf(xqyVar.a));
            linkedHashMap.put(xsw.x, fValueOf);
            linkedHashMap.put(xsw.w, fValueOf);
            linkedHashMap.put(xsw.v, fValueOf);
            linkedHashMap.put(xsw.s, Float.valueOf(xqyVar.c));
            linkedHashMap.put(xsw.y, Float.valueOf(xqyVar.b));
        }
        xrb xrbVar = this.e;
        if (xrbVar != null) {
            linkedHashMap.put(xsw.A, Float.valueOf(xrbVar.a));
            linkedHashMap.put(xsw.B, Float.valueOf(xrbVar.b));
            linkedHashMap.put(xsw.z, Float.valueOf(xrbVar.c));
        }
        xqm xqmVar = this.f;
        if (xqmVar != null) {
            wpq.aj(xqmVar, linkedHashMap);
        }
        xqm xqmVar2 = this.g;
        if (xqmVar2 != null) {
            wpq.aj(xqmVar2, linkedHashMap);
        }
        xqz xqzVar = this.h;
        if (xqzVar != null) {
            linkedHashMap.put(xsw.I, Float.valueOf(xqzVar.a));
            linkedHashMap.put(xsw.J, Float.valueOf(xqzVar.b));
            linkedHashMap.put(xsw.K, Float.valueOf(xqzVar.c));
            linkedHashMap.put(xsw.L, Float.valueOf(xqzVar.d));
            linkedHashMap.put(xsw.M, Float.valueOf(xqzVar.e));
            linkedHashMap.put(xsw.N, Integer.valueOf(xqzVar.g));
            linkedHashMap.put(xsw.O, Float.valueOf(xqzVar.f));
        }
        xqn xqnVar = this.i;
        if (xqnVar != null) {
            linkedHashMap.put(xsw.af, Float.valueOf(xqnVar.b));
            linkedHashMap.put(xsw.ag, Integer.valueOf(xqnVar.c));
            linkedHashMap.put(xsw.ah, Float.valueOf(xqnVar.d));
            linkedHashMap.put(xsw.ac, Float.valueOf(xqnVar.e));
            linkedHashMap.put(xsw.ad, Float.valueOf(xqnVar.f));
            linkedHashMap.put(xsw.ae, Float.valueOf(xqnVar.g));
            linkedHashMap.put(xsw.aa, Float.valueOf(xqnVar.h));
            linkedHashMap.put(xsw.ab, Float.valueOf(xqnVar.i));
            linkedHashMap.put(xsw.X, Float.valueOf(xqnVar.j));
            linkedHashMap.put(xsw.U, Float.valueOf(xqnVar.k));
            linkedHashMap.put(xsw.V, Float.valueOf(xqnVar.l));
            xqs xqsVar = xqnVar.m;
            linkedHashMap.put(xsw.W, Float.valueOf(xqsVar.c));
            linkedHashMap.put(xsw.Y, Float.valueOf(xqsVar.d));
            linkedHashMap.put(xsw.R, new float[]{xqsVar.e, xqsVar.f});
            linkedHashMap.put(xsw.P, new float[]{xqsVar.g, xqsVar.h});
            linkedHashMap.put(xsw.Q, new float[]{xqsVar.i, xqsVar.j, xqsVar.k});
            linkedHashMap.put(xsw.S, Float.valueOf(-0.75f));
            linkedHashMap.put(xsw.T, Float.valueOf(1.0f));
            linkedHashMap.put(xsw.Z, Float.valueOf(0.1f));
            linkedHashMap.put(xsw.ai, Float.valueOf(0.00277f));
            linkedHashMap.put(xsw.aj, Float.valueOf(0.35f));
        }
        xqv xqvVar = this.j;
        if (xqvVar != null) {
            linkedHashMap.put(xsw.ap, Float.valueOf(xqvVar.k));
            linkedHashMap.put(xsw.aq, Float.valueOf(xqvVar.l));
            linkedHashMap.put(xsw.an, Float.valueOf(xqvVar.h));
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqq)) {
            return false;
        }
        xqq xqqVar = (xqq) obj;
        return affa.f(this.a, xqqVar.a) && affa.f(this.b, xqqVar.b) && affa.f(this.c, xqqVar.c) && affa.f(this.d, xqqVar.d) && affa.f(this.e, xqqVar.e) && affa.f(this.f, xqqVar.f) && affa.f(this.g, xqqVar.g) && affa.f(this.h, xqqVar.h) && affa.f(this.i, xqqVar.i) && affa.f(this.j, xqqVar.j);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        xqw xqwVar = this.b;
        int iHashCode2 = (iHashCode + (xqwVar == null ? 0 : xqwVar.hashCode())) * 31;
        xqx xqxVar = this.c;
        int iHashCode3 = (iHashCode2 + (xqxVar == null ? 0 : xqxVar.hashCode())) * 31;
        xqy xqyVar = this.d;
        int iHashCode4 = (iHashCode3 + (xqyVar == null ? 0 : xqyVar.hashCode())) * 31;
        xrb xrbVar = this.e;
        int iHashCode5 = (iHashCode4 + (xrbVar == null ? 0 : xrbVar.hashCode())) * 31;
        xqm xqmVar = this.f;
        int iHashCode6 = (iHashCode5 + (xqmVar == null ? 0 : xqmVar.hashCode())) * 31;
        xqm xqmVar2 = this.g;
        int iHashCode7 = (iHashCode6 + (xqmVar2 == null ? 0 : xqmVar2.hashCode())) * 31;
        xqz xqzVar = this.h;
        int iHashCode8 = (iHashCode7 + (xqzVar == null ? 0 : xqzVar.hashCode())) * 31;
        xqn xqnVar = this.i;
        int iHashCode9 = (iHashCode8 + (xqnVar == null ? 0 : xqnVar.hashCode())) * 31;
        xqv xqvVar = this.j;
        return iHashCode9 + (xqvVar != null ? xqvVar.hashCode() : 0);
    }

    public final String toString() {
        return "EnergyShaderConfig(layout=" + this.a + ", panel=" + this.b + ", radialGradient=" + this.c + ", rimLight=" + this.d + ", spotLight=" + this.e + ", borderLight=" + this.f + ", borderLight2=" + this.g + ", rippleLight=" + this.h + ", dots=" + this.i + ", loader=" + this.j + ")";
    }

    public xqq(xqu xquVar, xqw xqwVar, xqx xqxVar, xqy xqyVar, xrb xrbVar, xqm xqmVar, xqm xqmVar2, xqz xqzVar, xqn xqnVar, xqv xqvVar) {
        xquVar.getClass();
        this.a = xquVar;
        this.b = xqwVar;
        this.c = xqxVar;
        this.d = xqyVar;
        this.e = xrbVar;
        this.f = xqmVar;
        this.g = xqmVar2;
        this.h = xqzVar;
        this.i = xqnVar;
        this.j = xqvVar;
    }

    public xqq() {
        this(null);
    }
}
