package Y1;

import Va.M6;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final long f16351a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16352b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16353c;

    /* renamed from: d, reason: collision with root package name */
    public int f16354d;

    public j(String str, long j8, long j10) {
        this.f16353c = str == null ? "" : str;
        this.f16351a = j8;
        this.f16352b = j10;
    }

    public final j a(j jVar, String str) {
        j jVar2;
        String strT = Q1.k.t(str, this.f16353c);
        if (jVar == null || !strT.equals(Q1.k.t(str, jVar.f16353c))) {
            return null;
        }
        long j8 = this.f16352b;
        long j10 = jVar.f16352b;
        if (j8 != -1) {
            long j11 = this.f16351a;
            jVar2 = null;
            if (j11 + j8 == jVar.f16351a) {
                return new j(strT, j11, j10 != -1 ? j8 + j10 : -1L);
            }
        } else {
            jVar2 = null;
        }
        if (j10 == -1) {
            return jVar2;
        }
        long j12 = jVar.f16351a;
        if (j12 + j10 == this.f16351a) {
            return new j(strT, j12, j8 != -1 ? j10 + j8 : -1L);
        }
        return jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f16351a == jVar.f16351a && this.f16352b == jVar.f16352b && this.f16353c.equals(jVar.f16353c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f16354d == 0) {
            this.f16354d = this.f16353c.hashCode() + ((((527 + ((int) this.f16351a)) * 31) + ((int) this.f16352b)) * 31);
        }
        return this.f16354d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RangedUri(referenceUri=");
        sb2.append(this.f16353c);
        sb2.append(", start=");
        sb2.append(this.f16351a);
        sb2.append(", length=");
        return M6.s(sb2, this.f16352b, ")");
    }
}
