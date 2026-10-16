package e.a;

import androidx.core.app.NotificationCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class eg {

    /* renamed from: a, reason: collision with root package name */
    private final ee f47415a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f47416b;

    private eg(ee eeVar, Object obj) {
        this.f47415a = eeVar;
        this.f47416b = obj;
    }

    public static eg b(ee eeVar) {
        com.google.d.b.an.C(eeVar, NotificationCompat.CATEGORY_STATUS);
        eg egVar = new eg(eeVar, null);
        com.google.d.b.an.q(!eeVar.l(), "cannot use OK status: %s", eeVar);
        return egVar;
    }

    public static eg c(Object obj) {
        return new eg(null, obj);
    }

    public final ee a() {
        ee eeVar = this.f47415a;
        return eeVar == null ? ee.f47401a : eeVar;
    }

    public final Object d() {
        if (this.f47415a == null) {
            return this.f47416b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean e() {
        return this.f47415a == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eg)) {
            return false;
        }
        eg egVar = (eg) obj;
        if (e() == egVar.e()) {
            return e() ? Objects.equals(this.f47416b, egVar.f47416b) : Objects.equals(this.f47415a, egVar.f47415a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f47415a, this.f47416b);
    }

    public final String toString() {
        ee eeVar = this.f47415a;
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        if (eeVar == null) {
            zVarH.d("value", this.f47416b);
        } else {
            zVarH.d("error", eeVar);
        }
        return zVarH.toString();
    }
}
