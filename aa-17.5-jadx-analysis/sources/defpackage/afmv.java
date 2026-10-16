package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class afmv {
    private final boolean containsInheritedStatics;
    private final boolean containsPackagePrivate;
    private final Map<afms<afmp>, afue<?>> members;

    /* JADX WARN: Multi-variable type inference failed */
    public afmv(Map<afms<afmp>, ? extends afue<?>> map, boolean z, boolean z2) {
        map.getClass();
        this.members = map;
        this.containsInheritedStatics = z;
        this.containsPackagePrivate = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afmv)) {
            return false;
        }
        afmv afmvVar = (afmv) obj;
        return affa.f(this.members, afmvVar.members) && this.containsInheritedStatics == afmvVar.containsInheritedStatics && this.containsPackagePrivate == afmvVar.containsPackagePrivate;
    }

    public final boolean getContainsInheritedStatics() {
        return this.containsInheritedStatics;
    }

    public final boolean getContainsPackagePrivate() {
        return this.containsPackagePrivate;
    }

    public final Map<afms<afmp>, afue<?>> getMembers() {
        return this.members;
    }

    public int hashCode() {
        return (((this.members.hashCode() * 31) + afmu.m(this.containsInheritedStatics)) * 31) + afmu.m(this.containsPackagePrivate);
    }

    public String toString() {
        return "FakeOverrideMembers(members=" + this.members + ", containsInheritedStatics=" + this.containsInheritedStatics + ", containsPackagePrivate=" + this.containsPackagePrivate + ')';
    }
}
