package defpackage;

/* loaded from: classes3.dex */
public final class vma {
    public final String a;
    public final vmb b;
    public final String c;
    public final ajgu d;
    public final vkr e;
    public final long f;

    public vma(String str, vmb vmbVar, String str2, ajgu ajguVar, vkr vkrVar, long j) {
        this.a = str;
        this.b = vmbVar;
        this.c = str2;
        this.d = ajguVar;
        this.e = vkrVar;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vma) {
            vma vmaVar = (vma) obj;
            if (this.a.equals(vmaVar.a) && this.b.equals(vmaVar.b) && this.c.equals(vmaVar.c) && this.d.equals(vmaVar.d) && this.e.equals(vmaVar.e) && this.f == vmaVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        long j = this.f;
        return ((int) (j ^ (j >>> 32))) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        vkr vkrVar = this.e;
        ajgu ajguVar = this.d;
        return "DatabaseEntry{name=" + this.a + ", eventType=" + String.valueOf(this.b) + ", message=" + this.c + ", systemHealthMetric=" + String.valueOf(ajguVar) + ", clientTracingEvent=" + String.valueOf(vkrVar) + ", timeCreatedMs=" + this.f + "}";
    }

    public vma() {
        throw null;
    }
}
