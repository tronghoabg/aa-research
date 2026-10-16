package defpackage;

import android.net.NetworkRequest;
import java.util.Set;

/* loaded from: classes2.dex */
public final class fja {
    public static final fja a = new fja();
    public final Cfor b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;
    public final int j;

    public fja(fja fjaVar) {
        fjaVar.getClass();
        this.c = fjaVar.c;
        this.d = fjaVar.d;
        this.b = fjaVar.b;
        this.j = fjaVar.j;
        this.e = fjaVar.e;
        this.f = fjaVar.f;
        this.i = fjaVar.i;
        this.g = fjaVar.g;
        this.h = fjaVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.b;
    }

    public final boolean b() {
        return !this.i.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !affa.f(getClass(), obj.getClass())) {
            return false;
        }
        fja fjaVar = (fja) obj;
        if (this.c == fjaVar.c && this.d == fjaVar.d && this.e == fjaVar.e && this.f == fjaVar.f && this.g == fjaVar.g && this.h == fjaVar.h && affa.f(a(), fjaVar.a()) && this.j == fjaVar.j) {
            return affa.f(this.i, fjaVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.j * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31;
        long j = this.h;
        long j2 = this.g;
        int iHashCode = ((((((((i + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.i.hashCode();
        NetworkRequest networkRequestA = a();
        return (iHashCode * 31) + (networkRequestA != null ? networkRequestA.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + ((Object) dsu.h(this.j)) + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }

    public fja(Cfor cfor, int i, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.b = cfor;
        this.j = i;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j;
        this.h = j2;
        this.i = set;
    }

    public fja() {
        afbg afbgVar = afbg.a;
        this.b = new Cfor(null);
        this.j = 1;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = afbgVar;
    }
}
