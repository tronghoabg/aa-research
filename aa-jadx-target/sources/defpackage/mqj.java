package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mqj {
    public final defpackage.mqi a;
    public final defpackage.mqg b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public /* synthetic */ mqj(android.content.ComponentName componentName, defpackage.mqg mqgVar, boolean z, int i) {
        this(componentName, (i & 2) != 0 ? defpackage.mqg.OTHER : mqgVar, ((i & 4) == 0) & z, false, false);
    }

    public final android.content.ComponentName a() {
        return this.a.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.mqj)) {
            return false;
        }
        defpackage.mqj mqjVar = (defpackage.mqj) obj;
        return defpackage.afga.f(this.a, mqjVar.a) && this.b == mqjVar.b && this.c == mqjVar.c && this.d == mqjVar.d && this.e == mqjVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        boolean z = this.e;
        return (((((iHashCode * 31) + defpackage.a.e(this.c)) * 31) + defpackage.a.e(this.d)) * 31) + defpackage.a.e(z);
    }

    public final java.lang.String toString() {
        return "ProjectionApp(appKey=" + this.a + ", appCategory=" + this.b + ", isParkedOnly=" + this.c + ", isImmersiveApp=" + this.d + ", isNativeApp=" + this.e + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqj(android.content.ComponentName componentName) {
        this(componentName, null, false, 30);
        componentName.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqj(android.content.ComponentName componentName, defpackage.mqg mqgVar) {
        this(componentName, mqgVar, false, 28);
        componentName.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqj(android.content.ComponentName componentName, defpackage.mqg mqgVar, byte[] bArr) {
        this(componentName, mqgVar, true, 24);
        componentName.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mqj(android.content.ComponentName componentName, defpackage.mqg mqgVar, boolean z, boolean z2, boolean z3) {
        this(new defpackage.mqi(componentName, (byte[]) null), mqgVar, z, z2, z3);
        componentName.getClass();
        mqgVar.getClass();
    }

    public mqj(defpackage.mqi mqiVar, defpackage.mqg mqgVar, boolean z, boolean z2, boolean z3) {
        this.a = mqiVar;
        this.b = mqgVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }
}
