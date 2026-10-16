package defpackage;

/* loaded from: classes.dex */
public final class djv {
    public final deu a;
    public final long b;
    public final dfv c;

    public djv(deu deuVar, long j, dfv dfvVar) {
        this.a = deuVar;
        this.b = czz.u(j, a().length());
        this.c = dfvVar != null ? new dfv(czz.u(dfvVar.b, a().length())) : null;
    }

    public static /* synthetic */ djv b(djv djvVar, deu deuVar, long j, int i) {
        if ((i & 1) != 0) {
            deuVar = djvVar.a;
        }
        if ((i & 2) != 0) {
            j = djvVar.b;
        }
        return new djv(deuVar, j, (i & 4) != 0 ? djvVar.c : null);
    }

    public final String a() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djv)) {
            return false;
        }
        long j = this.b;
        djv djvVar = (djv) obj;
        long j2 = djvVar.b;
        long j3 = dfv.a;
        return j == j2 && affa.f(this.c, djvVar.c) && affa.f(this.a, djvVar.a);
    }

    public final int hashCode() {
        int i;
        int iHashCode = this.a.hashCode() * 31;
        long j = dfv.a;
        dfv dfvVar = this.c;
        if (dfvVar != null) {
            long j2 = dfvVar.b;
            i = (int) (j2 ^ (j2 >>> 32));
        } else {
            i = 0;
        }
        long j3 = this.b;
        return ((iHashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + dfv.f(this.b) + ", composition=" + this.c + ")";
    }

    public /* synthetic */ djv(String str, long j, int i) {
        this(new deu(1 == (i & 1) ? "" : str), (i & 2) != 0 ? dfv.a : j, (dfv) null);
    }
}
