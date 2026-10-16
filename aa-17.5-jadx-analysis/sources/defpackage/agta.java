package defpackage;

/* loaded from: classes3.dex */
public final class agta {
    public static final agsz Companion = new agsz(null);
    private static final agta DEFAULT = new agta(agtq.STRICT, null, null, 6, null);
    private final agtq reportLevelAfter;
    private final agtq reportLevelBefore;
    private final aezq sinceVersion;

    public /* synthetic */ agta(agtq agtqVar, aezq aezqVar, agtq agtqVar2, int i, afeu afeuVar) {
        this(agtqVar, (i & 2) != 0 ? new aezq(1, 0) : aezqVar, (i & 4) != 0 ? agtqVar : agtqVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agta)) {
            return false;
        }
        agta agtaVar = (agta) obj;
        return this.reportLevelBefore == agtaVar.reportLevelBefore && affa.f(this.sinceVersion, agtaVar.sinceVersion) && this.reportLevelAfter == agtaVar.reportLevelAfter;
    }

    public final agtq getReportLevelAfter() {
        return this.reportLevelAfter;
    }

    public final agtq getReportLevelBefore() {
        return this.reportLevelBefore;
    }

    public final aezq getSinceVersion() {
        return this.sinceVersion;
    }

    public int hashCode() {
        int iHashCode = this.reportLevelBefore.hashCode() * 31;
        aezq aezqVar = this.sinceVersion;
        return ((iHashCode + (aezqVar == null ? 0 : aezqVar.a)) * 31) + this.reportLevelAfter.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.reportLevelBefore + ", sinceVersion=" + this.sinceVersion + ", reportLevelAfter=" + this.reportLevelAfter + ')';
    }

    public agta(agtq agtqVar, aezq aezqVar, agtq agtqVar2) {
        agtqVar.getClass();
        agtqVar2.getClass();
        this.reportLevelBefore = agtqVar;
        this.sinceVersion = aezqVar;
        this.reportLevelAfter = agtqVar2;
    }
}
