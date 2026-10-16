package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import N0.a;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class IncompatibleVersionErrorData<T> {
    private final T actualVersion;

    @NotNull
    private final ClassId classId;
    private final T compilerVersion;
    private final T expectedVersion;

    @NotNull
    private final String filePath;
    private final T languageVersion;

    public IncompatibleVersionErrorData(T t10, T t11, T t12, T t13, @NotNull String filePath, @NotNull ClassId classId) {
        AbstractC3340k.e(filePath, "filePath");
        AbstractC3340k.e(classId, "classId");
        this.actualVersion = t10;
        this.compilerVersion = t11;
        this.languageVersion = t12;
        this.expectedVersion = t13;
        this.filePath = filePath;
        this.classId = classId;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IncompatibleVersionErrorData)) {
            return false;
        }
        IncompatibleVersionErrorData incompatibleVersionErrorData = (IncompatibleVersionErrorData) obj;
        return AbstractC3340k.a(this.actualVersion, incompatibleVersionErrorData.actualVersion) && AbstractC3340k.a(this.compilerVersion, incompatibleVersionErrorData.compilerVersion) && AbstractC3340k.a(this.languageVersion, incompatibleVersionErrorData.languageVersion) && AbstractC3340k.a(this.expectedVersion, incompatibleVersionErrorData.expectedVersion) && AbstractC3340k.a(this.filePath, incompatibleVersionErrorData.filePath) && AbstractC3340k.a(this.classId, incompatibleVersionErrorData.classId);
    }

    public int hashCode() {
        T t10 = this.actualVersion;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.compilerVersion;
        int iHashCode2 = (iHashCode + (t11 == null ? 0 : t11.hashCode())) * 31;
        T t12 = this.languageVersion;
        int iHashCode3 = (iHashCode2 + (t12 == null ? 0 : t12.hashCode())) * 31;
        T t13 = this.expectedVersion;
        return this.classId.hashCode() + a.c((iHashCode3 + (t13 != null ? t13.hashCode() : 0)) * 31, 31, this.filePath);
    }

    @NotNull
    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.actualVersion + ", compilerVersion=" + this.compilerVersion + ", languageVersion=" + this.languageVersion + ", expectedVersion=" + this.expectedVersion + ", filePath=" + this.filePath + ", classId=" + this.classId + ')';
    }
}
