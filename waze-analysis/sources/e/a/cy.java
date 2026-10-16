package e.a;

import androidx.core.app.NotificationCompat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cy {

    /* renamed from: a, reason: collision with root package name */
    private final ee f46582a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f46583b;

    private cy(ee eeVar) {
        this.f46583b = null;
        com.google.d.b.an.C(eeVar, NotificationCompat.CATEGORY_STATUS);
        this.f46582a = eeVar;
        com.google.d.b.an.q(!eeVar.l(), "cannot use OK status: %s", eeVar);
    }

    public static cy a(Object obj) {
        return new cy(obj);
    }

    public static cy b(ee eeVar) {
        return new cy(eeVar);
    }

    public final ee c() {
        return this.f46582a;
    }

    public final Object d() {
        return this.f46583b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            cy cyVar = (cy) obj;
            if (Objects.equals(this.f46582a, cyVar.f46582a) && Objects.equals(this.f46583b, cyVar.f46583b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f46582a, this.f46583b);
    }

    public final String toString() {
        Object obj = this.f46583b;
        if (obj != null) {
            com.google.d.b.z zVarH = com.google.d.b.an.H(this);
            zVarH.d("config", obj);
            return zVarH.toString();
        }
        com.google.d.b.z zVarH2 = com.google.d.b.an.H(this);
        zVarH2.d("error", this.f46582a);
        return zVarH2.toString();
    }

    private cy(Object obj) {
        this.f46583b = obj;
        this.f46582a = null;
    }
}
