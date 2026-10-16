package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class rzq {
    public final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public rzq(boolean z, int i, int i2, int i3, int i4) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static int a(java.lang.Object obj, java.lang.String str) {
        java.lang.Object objC = defpackage.rox.c(obj.getClass(), str, obj, new java.lang.Object[0], new java.lang.Class[0]);
        if (objC != null) {
            return ((java.lang.Integer) objC).intValue();
        }
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.rzq) {
            defpackage.rzq rzqVar = (defpackage.rzq) obj;
            if (this.a == rzqVar.a && this.b == rzqVar.b && this.c == rzqVar.c && this.d == rzqVar.d && this.e == rzqVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ (((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final java.lang.String toString() {
        return "UsbPortStatus{connected=" + this.a + ", currentDataRole=" + this.b + ", currentPowerRole=" + this.c + ", supportedRoleCombinations=" + this.d + ", currentMode=" + this.e + "}";
    }

    public rzq() {
        throw null;
    }
}
