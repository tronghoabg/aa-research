package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final class mqc {
    public final mqb a;
    public final mpz b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ mqc(ComponentName componentName, mpz mpzVar, boolean z, int i) {
        this(componentName, (i & 2) != 0 ? mpz.a : mpzVar, ((i & 4) == 0) & z, false, false);
    }

    public final ComponentName a() {
        return this.a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqc)) {
            return false;
        }
        mqc mqcVar = (mqc) obj;
        return affa.f(this.a, mqcVar.a) && this.b == mqcVar.b && this.c == mqcVar.c && this.d == mqcVar.d && this.e == mqcVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        boolean z = this.e;
        return (((((iHashCode * 31) + a.f(this.c)) * 31) + a.f(this.d)) * 31) + a.f(z);
    }

    public final String toString() {
        return "ProjectionApp(appKey=" + this.a + ", appCategory=" + this.b + ", isParkedOnly=" + this.c + ", isImmersiveApp=" + this.d + ", isNativeApp=" + this.e + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqc(ComponentName componentName) {
        this(componentName, null, false, 30);
        componentName.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqc(ComponentName componentName, mpz mpzVar) {
        this(componentName, mpzVar, false, 28);
        componentName.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqc(ComponentName componentName, mpz mpzVar, byte[] bArr) {
        this(componentName, mpzVar, true, 24);
        componentName.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqc(ComponentName componentName, mpz mpzVar, boolean z, boolean z2, boolean z3) {
        this(new mqb(componentName, (byte[]) null), mpzVar, z, z2, z3);
        componentName.getClass();
        mpzVar.getClass();
    }

    public mqc(mqb mqbVar, mpz mpzVar, boolean z, boolean z2, boolean z3) {
        this.a = mqbVar;
        this.b = mpzVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
