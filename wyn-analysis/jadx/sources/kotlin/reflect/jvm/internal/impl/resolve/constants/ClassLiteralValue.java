package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public final class ClassLiteralValue {
    private final int arrayNestedness;

    @NotNull
    private final ClassId classId;

    public ClassLiteralValue(@NotNull ClassId classId, int i5) {
        AbstractC3340k.e(classId, "classId");
        this.classId = classId;
        this.arrayNestedness = i5;
    }

    @NotNull
    public final ClassId component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassLiteralValue)) {
            return false;
        }
        ClassLiteralValue classLiteralValue = (ClassLiteralValue) obj;
        return AbstractC3340k.a(this.classId, classLiteralValue.classId) && this.arrayNestedness == classLiteralValue.arrayNestedness;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    @NotNull
    public final ClassId getClassId() {
        return this.classId;
    }

    public int hashCode() {
        return (this.classId.hashCode() * 31) + this.arrayNestedness;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i5 = this.arrayNestedness;
        for (int i10 = 0; i10 < i5; i10++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.classId);
        int i11 = this.arrayNestedness;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }
}
