package defpackage;

/* loaded from: classes2.dex */
public final class ryv {
    public final boolean a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public ryv(boolean z, int i, int i2, int i3, int i4) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static int a(Object obj, String str) {
        Object objF = roc.f(obj.getClass(), str, obj, new Object[0], new Class[0]);
        if (objF != null) {
            return ((Integer) objF).intValue();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ryv) {
            ryv ryvVar = (ryv) obj;
            if (this.a == ryvVar.a && this.b == ryvVar.b && this.c == ryvVar.c && this.d == ryvVar.d && this.e == ryvVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e ^ (((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "UsbPortStatus{connected=" + this.a + ", currentDataRole=" + this.b + ", currentPowerRole=" + this.c + ", supportedRoleCombinations=" + this.d + ", currentMode=" + this.e + "}";
    }

    public ryv() {
        throw null;
    }
}
