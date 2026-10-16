package e.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    private final h f46496a;

    /* renamed from: b, reason: collision with root package name */
    private final cm f46497b;

    /* renamed from: c, reason: collision with root package name */
    private final cq f46498c;

    /* renamed from: d, reason: collision with root package name */
    private final bm f46499d;

    public bo(cq cqVar, cm cmVar, h hVar, bm bmVar) {
        com.google.d.b.an.C(cqVar, "method");
        this.f46498c = cqVar;
        com.google.d.b.an.C(cmVar, "headers");
        this.f46497b = cmVar;
        com.google.d.b.an.C(hVar, "callOptions");
        this.f46496a = hVar;
        com.google.d.b.an.C(bmVar, "pickDetailsConsumer");
        this.f46499d = bmVar;
    }

    public final h a() {
        return this.f46496a;
    }

    public final cm b() {
        return this.f46497b;
    }

    public final cq c() {
        return this.f46498c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bo boVar = (bo) obj;
            if (Objects.equals(this.f46496a, boVar.f46496a) && Objects.equals(this.f46497b, boVar.f46497b) && Objects.equals(this.f46498c, boVar.f46498c) && Objects.equals(this.f46499d, boVar.f46499d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f46496a, this.f46497b, this.f46498c, this.f46499d);
    }

    public final String toString() {
        h hVar = this.f46496a;
        cm cmVar = this.f46497b;
        return "[method=" + String.valueOf(this.f46498c) + " headers=" + String.valueOf(cmVar) + " callOptions=" + String.valueOf(hVar) + "]";
    }

    public bo() {
        throw null;
    }
}
