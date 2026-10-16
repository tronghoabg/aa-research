package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vsq {
    public final java.lang.String a;
    public final boolean b;
    public final ajht c;
    public final ajfx d;
    public final java.lang.String e;
    public final defpackage.vzf f;
    public final boolean g;
    public final vut h;
    public final boolean i;
    public final int j;
    public final vqj k;
    public final int l;
    public final int m;
    private final java.util.function.Predicate n;

    public vsq(java.lang.String str, boolean z, ajht ajhtVar, ajfx ajfxVar, java.lang.String str2, defpackage.vzf vzfVar, boolean z2, int i, vut vutVar, boolean z3, int i2, java.util.function.Predicate predicate, vqj vqjVar, int i3) {
        this.a = str;
        this.b = z;
        this.c = ajhtVar;
        this.d = ajfxVar;
        this.e = str2;
        this.f = vzfVar;
        this.g = z2;
        this.m = i;
        this.h = vutVar;
        this.i = z3;
        this.j = i2;
        this.n = predicate;
        this.k = vqjVar;
        this.l = i3;
    }

    public static defpackage.vsp a() {
        defpackage.vsp vspVar = new defpackage.vsp();
        vspVar.d(false);
        vspVar.e(false);
        vspVar.c(0);
        vspVar.i(false);
        vspVar.f(Integer.MAX_VALUE);
        vspVar.f = new defpackage.iux(8);
        return vspVar;
    }

    public final boolean equals(java.lang.Object obj) {
        ajfx ajfxVar;
        java.lang.String str;
        defpackage.vzf vzfVar;
        int i;
        vqj vqjVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.vsq) {
            defpackage.vsq vsqVar = (defpackage.vsq) obj;
            java.lang.String str2 = this.a;
            if (str2 != null ? str2.equals(vsqVar.a) : vsqVar.a == null) {
                if (this.b == vsqVar.b && this.c.equals(vsqVar.c) && ((ajfxVar = this.d) != null ? ajfxVar.equals(vsqVar.d) : vsqVar.d == null) && ((str = this.e) != null ? str.equals(vsqVar.e) : vsqVar.e == null) && ((vzfVar = this.f) != null ? vzfVar.equals(vsqVar.f) : vsqVar.f == null) && this.g == vsqVar.g && ((i = this.m) != 0 ? i == vsqVar.m : vsqVar.m == 0)) {
                    if (this.h != null) {
                        vut vutVar = vsqVar.h;
                        throw null;
                    }
                    if (vsqVar.h == null && this.i == vsqVar.i && this.j == vsqVar.j && ll$.ExternalSyntheticApiModelOutline0.m(this.n, vsqVar.n) && ((vqjVar = this.k) != null ? vqjVar.equals(vsqVar.k) : vsqVar.k == null) && this.l == vsqVar.l) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        ajfx ajfxVar = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (ajfxVar == null ? 0 : ajfxVar.hashCode())) * 1000003;
        java.lang.String str2 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        defpackage.vzf vzfVar = this.f;
        int iHashCode4 = (((iHashCode3 ^ (vzfVar == null ? 0 : vzfVar.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        int i = this.m;
        if (i == 0) {
            i = 0;
        }
        int i2 = iHashCode4 ^ i;
        if (this.h != null) {
            throw null;
        }
        int iM = ((((((i2 * (-721379959)) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ ll$.ExternalSyntheticApiModelOutline0.m(this.n)) * 1000003;
        vqj vqjVar = this.k;
        return this.l ^ ((iM ^ (vqjVar != null ? vqjVar.hashCode() : 0)) * 1000003);
    }

    public final java.lang.String toString() {
        int i = this.m;
        java.lang.String strValueOf = java.lang.String.valueOf(this.c);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.d);
        java.lang.String strValueOf3 = java.lang.String.valueOf(this.f);
        java.lang.String string = i != 0 ? java.lang.Integer.toString(i - 1) : "null";
        vut vutVar = this.h;
        java.util.function.Predicate predicate = this.n;
        vqj vqjVar = this.k;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + strValueOf + ", metricExtension=" + strValueOf2 + ", accountableComponentName=" + this.e + ", samplingRate=" + strValueOf3 + ", isUnsampled=" + this.g + ", samplingStrategy=" + string + ", activeCuiId=" + java.lang.String.valueOf(vutVar) + ", shouldAttachActiveTraces=" + this.i + ", maxActiveTraces=" + this.j + ", activeTracePredicate=" + java.lang.String.valueOf(predicate) + ", debugLogsTime=" + java.lang.String.valueOf(vqjVar) + ", debugLogsSize=" + this.l + "}";
    }

    public vsq() {
        throw null;
    }
}
