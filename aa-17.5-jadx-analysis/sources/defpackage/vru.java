package defpackage;

import androidx.car.app.model.Alert;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final class vru {
    public final String a;
    public final boolean b;
    public final ajgu c;
    public final ajey d;
    public final String e;
    public final vyk f;
    public final boolean g;
    public final vtx h;
    public final boolean i;
    public final int j;
    public final vpn k;
    public final int l;
    public final int m;
    private final Predicate n;

    public vru(String str, boolean z, ajgu ajguVar, ajey ajeyVar, String str2, vyk vykVar, boolean z2, int i, vtx vtxVar, boolean z3, int i2, Predicate predicate, vpn vpnVar, int i3) {
        this.a = str;
        this.b = z;
        this.c = ajguVar;
        this.d = ajeyVar;
        this.e = str2;
        this.f = vykVar;
        this.g = z2;
        this.m = i;
        this.h = vtxVar;
        this.i = z3;
        this.j = i2;
        this.n = predicate;
        this.k = vpnVar;
        this.l = i3;
    }

    public static vrt a() {
        vrt vrtVar = new vrt();
        vrtVar.d(false);
        vrtVar.e(false);
        vrtVar.c(0);
        vrtVar.i(false);
        vrtVar.f(Alert.DURATION_SHOW_INDEFINITELY);
        vrtVar.f = new iup(9);
        return vrtVar;
    }

    public final boolean equals(Object obj) {
        ajey ajeyVar;
        String str;
        vyk vykVar;
        int i;
        vpn vpnVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof vru) {
            vru vruVar = (vru) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(vruVar.a) : vruVar.a == null) {
                if (this.b == vruVar.b && this.c.equals(vruVar.c) && ((ajeyVar = this.d) != null ? ajeyVar.equals(vruVar.d) : vruVar.d == null) && ((str = this.e) != null ? str.equals(vruVar.e) : vruVar.e == null) && ((vykVar = this.f) != null ? vykVar.equals(vruVar.f) : vruVar.f == null) && this.g == vruVar.g && ((i = this.m) != 0 ? i == vruVar.m : vruVar.m == 0)) {
                    if (this.h != null) {
                        vtx vtxVar = vruVar.h;
                        throw null;
                    }
                    if (vruVar.h == null && this.i == vruVar.i && this.j == vruVar.j && this.n.equals(vruVar.n) && ((vpnVar = this.k) != null ? vpnVar.equals(vruVar.k) : vruVar.k == null) && this.l == vruVar.l) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        ajey ajeyVar = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (ajeyVar == null ? 0 : ajeyVar.hashCode())) * 1000003;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        vyk vykVar = this.f;
        int iHashCode4 = (((iHashCode3 ^ (vykVar == null ? 0 : vykVar.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        int i = this.m;
        if (i == 0) {
            i = 0;
        }
        int i2 = iHashCode4 ^ i;
        if (this.h != null) {
            throw null;
        }
        int iHashCode5 = ((((((i2 * (-721379959)) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ this.n.hashCode()) * 1000003;
        vpn vpnVar = this.k;
        return this.l ^ ((iHashCode5 ^ (vpnVar != null ? vpnVar.hashCode() : 0)) * 1000003);
    }

    public final String toString() {
        int i = this.m;
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String strValueOf3 = String.valueOf(this.f);
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        vtx vtxVar = this.h;
        Predicate predicate = this.n;
        vpn vpnVar = this.k;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + strValueOf + ", metricExtension=" + strValueOf2 + ", accountableComponentName=" + this.e + ", samplingRate=" + strValueOf3 + ", isUnsampled=" + this.g + ", samplingStrategy=" + string + ", activeCuiId=" + String.valueOf(vtxVar) + ", shouldAttachActiveTraces=" + this.i + ", maxActiveTraces=" + this.j + ", activeTracePredicate=" + String.valueOf(predicate) + ", debugLogsTime=" + String.valueOf(vpnVar) + ", debugLogsSize=" + this.l + "}";
    }

    public vru() {
        throw null;
    }
}
