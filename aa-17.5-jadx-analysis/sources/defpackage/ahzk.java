package defpackage;

/* loaded from: classes3.dex */
public final class ahzk<T> {
    private final T actualVersion;
    private final T compilerVersion;
    private final T expectedVersion;
    private final String filePath;
    private final T languageVersion;

    public ahzk(T t, T t2, T t3, T t4, String str) {
        str.getClass();
        this.actualVersion = t;
        this.compilerVersion = t2;
        this.languageVersion = t3;
        this.expectedVersion = t4;
        this.filePath = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahzk)) {
            return false;
        }
        ahzk ahzkVar = (ahzk) obj;
        return affa.f(this.actualVersion, ahzkVar.actualVersion) && affa.f(this.compilerVersion, ahzkVar.compilerVersion) && affa.f(this.languageVersion, ahzkVar.languageVersion) && affa.f(this.expectedVersion, ahzkVar.expectedVersion) && affa.f(this.filePath, ahzkVar.filePath);
    }

    public int hashCode() {
        T t = this.actualVersion;
        int iHashCode = t == null ? 0 : t.hashCode();
        T t2 = this.compilerVersion;
        int iHashCode2 = t2 == null ? 0 : t2.hashCode();
        int i = iHashCode * 31;
        T t3 = this.languageVersion;
        int iHashCode3 = (((i + iHashCode2) * 31) + (t3 == null ? 0 : t3.hashCode())) * 31;
        T t4 = this.expectedVersion;
        return ((iHashCode3 + (t4 != null ? t4.hashCode() : 0)) * 31) + this.filePath.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.actualVersion + ", compilerVersion=" + this.compilerVersion + ", languageVersion=" + this.languageVersion + ", expectedVersion=" + this.expectedVersion + ", filePath=" + this.filePath + ')';
    }
}
