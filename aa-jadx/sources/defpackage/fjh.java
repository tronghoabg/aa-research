package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fjh {
    public static final defpackage.fjh a = new defpackage.fjh();
    public final defpackage.foz b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final java.util.Set i;
    public final int j;

    public fjh(defpackage.fjh fjhVar) {
        fjhVar.getClass();
        this.c = fjhVar.c;
        this.d = fjhVar.d;
        this.b = fjhVar.b;
        this.j = fjhVar.j;
        this.e = fjhVar.e;
        this.f = fjhVar.f;
        this.i = fjhVar.i;
        this.g = fjhVar.g;
        this.h = fjhVar.h;
    }

    public final android.net.NetworkRequest a() {
        return (android.net.NetworkRequest) this.b.b;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !defpackage.afga.f(getClass(), obj.getClass())) {
            return false;
        }
        defpackage.fjh fjhVar = (defpackage.fjh) obj;
        if (this.c == fjhVar.c && this.d == fjhVar.d && this.e == fjhVar.e && this.f == fjhVar.f && this.g == fjhVar.g && this.h == fjhVar.h && defpackage.afga.f(a(), fjhVar.a()) && this.j == fjhVar.j) {
            return defpackage.afga.f(this.i, fjhVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.j * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        long j = this.h;
        long j2 = this.g;
        int iHashCode = ((((((((i + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode();
        android.net.NetworkRequest networkRequestA = a();
        return (iHashCode * 31) + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "Constraints{requiredNetworkType=" + ((java.lang.Object) defpackage.dsx.e(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public fjh(defpackage.foz fozVar, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, java.util.Set set) {
        this.b = fozVar;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }

    public fjh() {
        defpackage.afcg afcgVar = defpackage.afcg.a;
        this.b = new defpackage.foz(null);
        this.j = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = afcgVar;
    }
}
