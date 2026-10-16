package e.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    private final eg f47321a;

    /* renamed from: b, reason: collision with root package name */
    private final c f47322b;

    /* renamed from: c, reason: collision with root package name */
    private final cy f47323c;

    db(eg egVar, c cVar, cy cyVar) {
        this.f47321a = egVar;
        com.google.d.b.an.C(cVar, "attributes");
        this.f47322b = cVar;
        this.f47323c = cyVar;
    }

    public static da c() {
        return new da();
    }

    public final c a() {
        return this.f47322b;
    }

    public final cy b() {
        return this.f47323c;
    }

    public final eg d() {
        return this.f47321a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof db)) {
            return false;
        }
        db dbVar = (db) obj;
        return Objects.equals(this.f47321a, dbVar.f47321a) && Objects.equals(this.f47322b, dbVar.f47322b) && Objects.equals(this.f47323c, dbVar.f47323c);
    }

    public final int hashCode() {
        return Objects.hash(this.f47321a, this.f47322b, this.f47323c);
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("addressesOrError", this.f47321a.toString());
        zVarH.d("attributes", this.f47322b);
        zVarH.d("serviceConfigOrError", this.f47323c);
        return zVarH.toString();
    }
}
