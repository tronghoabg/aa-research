package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import Va.M6;
import ff.m;
import ff.n;
import ff.o;
import ff.v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public abstract class BinaryVersion {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int major;
    private final int minor;

    @NotNull
    private final int[] numbers;
    private final int patch;

    @NotNull
    private final List<Integer> rest;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BinaryVersion(@NotNull int... numbers) {
        List<Integer> listS0;
        AbstractC3340k.e(numbers, "numbers");
        this.numbers = numbers;
        Integer numW0 = m.w0(0, numbers);
        this.major = numW0 != null ? numW0.intValue() : -1;
        Integer numW02 = m.w0(1, numbers);
        this.minor = numW02 != null ? numW02.intValue() : -1;
        Integer numW03 = m.w0(2, numbers);
        this.patch = numW03 != null ? numW03.intValue() : -1;
        if (numbers.length <= 3) {
            listS0 = v.f35432a;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(M6.r(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, '.'));
            }
            listS0 = o.S0(new n(numbers).subList(3, numbers.length));
        }
        this.rest = listS0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.major == binaryVersion.major && this.minor == binaryVersion.minor && this.patch == binaryVersion.patch && AbstractC3340k.a(this.rest, binaryVersion.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i5 = this.major;
        int i10 = (i5 * 31) + this.minor + i5;
        int i11 = (i10 * 31) + this.patch + i10;
        return this.rest.hashCode() + (i11 * 31) + i11;
    }

    public final boolean isAtLeast(@NotNull BinaryVersion version) {
        AbstractC3340k.e(version, "version");
        return isAtLeast(version.major, version.minor, version.patch);
    }

    public final boolean isAtMost(int i5, int i10, int i11) {
        int i12 = this.major;
        if (i12 < i5) {
            return true;
        }
        if (i12 > i5) {
            return false;
        }
        int i13 = this.minor;
        if (i13 < i10) {
            return true;
        }
        return i13 <= i10 && this.patch <= i11;
    }

    public final boolean isCompatibleTo(@NotNull BinaryVersion ourVersion) {
        AbstractC3340k.e(ourVersion, "ourVersion");
        int i5 = this.major;
        return i5 == 0 ? ourVersion.major == 0 && this.minor == ourVersion.minor : i5 == ourVersion.major && this.minor <= ourVersion.minor;
    }

    @NotNull
    public final int[] toArray() {
        return this.numbers;
    }

    @NotNull
    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i5 : array) {
            if (i5 == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i5));
        }
        return arrayList.isEmpty() ? "unknown" : o.w0(arrayList, ".", null, null, null, 62);
    }

    public final boolean isAtLeast(int i5, int i10, int i11) {
        int i12 = this.major;
        if (i12 > i5) {
            return true;
        }
        if (i12 < i5) {
            return false;
        }
        int i13 = this.minor;
        if (i13 > i10) {
            return true;
        }
        return i13 >= i10 && this.patch >= i11;
    }
}
