package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kjj extends kjl {
    public final List a;
    private final int b;
    private final List d;
    private final boolean c = true;
    private final int e = 0;

    public kjj(int i, List list, List list2) {
        this.b = i;
        this.a = list;
        this.d = list2;
    }

    @Override // defpackage.kjl
    public final int a() {
        return 0;
    }

    @Override // defpackage.kjl
    public final List b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjj)) {
            return false;
        }
        kjj kjjVar = (kjj) obj;
        if (this.b != kjjVar.b || !affa.f(this.a, kjjVar.a)) {
            return false;
        }
        boolean z = kjjVar.c;
        if (!affa.f(this.d, kjjVar.d)) {
            return false;
        }
        int i = kjjVar.e;
        return true;
    }

    public final int hashCode() {
        return ((((((this.b * 31) + this.a.hashCode()) * 31) + 1231) * 31) + 1) * 31;
    }

    public final String toString() {
        return "CarControlGroup(id=" + this.b + ", controls=" + this.a + ", enabled=true, metadata=" + this.d + ", sideAffinity=0)";
    }
}
