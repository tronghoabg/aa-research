package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class waj {
    public final boolean a;
    public final boolean b;

    public waj(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public static defpackage.wai a() {
        defpackage.wai waiVar = new defpackage.wai();
        waiVar.b(false);
        waiVar.a = true;
        waiVar.b = (byte) (waiVar.b | 2);
        return waiVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.waj) {
            defpackage.waj wajVar = (defpackage.waj) obj;
            if (this.a == wajVar.a && this.b == wajVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        return "PerfgateMetricTransmitterConfigurations{useEventNamePostfix=" + this.a + ", includeEventNameTag=" + this.b + "}";
    }

    public waj() {
        throw null;
    }
}
