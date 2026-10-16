package e.a;

import androidx.core.app.NotificationCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bn {

    /* renamed from: a, reason: collision with root package name */
    private static final bn f46491a = new bn(null, ee.f47401a, false);

    /* renamed from: b, reason: collision with root package name */
    private final bq f46492b;

    /* renamed from: c, reason: collision with root package name */
    private final ee f46493c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f46494d;

    /* renamed from: e, reason: collision with root package name */
    private final dt f46495e = null;

    private bn(bq bqVar, ee eeVar, boolean z) {
        this.f46492b = bqVar;
        com.google.d.b.an.C(eeVar, NotificationCompat.CATEGORY_STATUS);
        this.f46493c = eeVar;
        this.f46494d = z;
    }

    public static bn a(ee eeVar) {
        com.google.d.b.an.m(!eeVar.l(), "drop status shouldn't be OK");
        return new bn(null, eeVar, true);
    }

    public static bn b(ee eeVar) {
        com.google.d.b.an.m(!eeVar.l(), "error status shouldn't be OK");
        return new bn(null, eeVar, false);
    }

    public static bn c() {
        return f46491a;
    }

    public static bn d(bq bqVar) {
        return new bn(bqVar, ee.f47401a, false);
    }

    public final bq e() {
        return this.f46492b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        if (Objects.equals(this.f46492b, bnVar.f46492b) && Objects.equals(this.f46493c, bnVar.f46493c)) {
            dt dtVar = bnVar.f46495e;
            if (Objects.equals(null, null) && this.f46494d == bnVar.f46494d) {
                return true;
            }
        }
        return false;
    }

    public final ee f() {
        return this.f46493c;
    }

    public final boolean g() {
        return (this.f46492b == null && this.f46493c.l()) ? false : true;
    }

    public final boolean h() {
        return this.f46494d;
    }

    public final int hashCode() {
        return Objects.hash(this.f46492b, this.f46493c, null, Boolean.valueOf(this.f46494d));
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("subchannel", this.f46492b);
        zVarH.d("streamTracerFactory", null);
        zVarH.d(NotificationCompat.CATEGORY_STATUS, this.f46493c);
        zVarH.e("drop", this.f46494d);
        zVarH.d("authority-override", null);
        return zVarH.toString();
    }
}
