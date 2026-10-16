package defpackage;

/* loaded from: classes2.dex */
public final class sbe {
    public final boolean a;
    public final boolean b;
    public final xxh c;
    public final xxh d;
    public final xxh e;
    public final xxh f;
    private final xxh g;

    public sbe(boolean z, boolean z2, xxh xxhVar, xxh xxhVar2, xxh xxhVar3, xxh xxhVar4, xxh xxhVar5) {
        this.a = z;
        this.b = z2;
        this.c = xxhVar;
        this.d = xxhVar2;
        this.e = xxhVar3;
        this.f = xxhVar4;
        this.g = xxhVar5;
    }

    static sbd a() {
        sbd sbdVar = new sbd();
        sbdVar.c(false);
        sbdVar.b(false);
        return sbdVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbe) {
            sbe sbeVar = (sbe) obj;
            if (this.a == sbeVar.a && this.b == sbeVar.b && this.c.equals(sbeVar.c) && this.d.equals(sbeVar.d) && this.e.equals(sbeVar.e) && this.f.equals(sbeVar.f) && this.g.equals(sbeVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f.hashCode() ^ (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        xxh xxhVar = this.g;
        xxh xxhVar2 = this.f;
        xxh xxhVar3 = this.e;
        xxh xxhVar4 = this.d;
        return "Notification{showNotification=" + this.a + ", dismissNotification=" + this.b + ", title=" + String.valueOf(this.c) + ", text=" + String.valueOf(xxhVar4) + ", priority=" + String.valueOf(xxhVar3) + ", action=" + String.valueOf(xxhVar2) + ", pendingIntent=" + String.valueOf(xxhVar) + "}";
    }

    public sbe() {
        throw null;
    }
}
