package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class ahkv {
    public static final ahku Companion = new ahku(null);
    private final int major;
    private final int minor;
    private final int[] numbers;
    private final int patch;
    private final List<Integer> rest;

    public ahkv(int... iArr) {
        List<Integer> listCf;
        iArr.getClass();
        this.numbers = iArr;
        Integer numCR = woy.cR(iArr, 0);
        this.major = numCR != null ? numCR.intValue() : -1;
        Integer numCR2 = woy.cR(iArr, 1);
        this.minor = numCR2 != null ? numCR2.intValue() : -1;
        Integer numCR3 = woy.cR(iArr, 2);
        this.patch = numCR3 != null ? numCR3.intValue() : -1;
        int length = iArr.length;
        if (length <= 3) {
            listCf = afbe.a;
        } else {
            if (length > 1024) {
                throw new IllegalArgumentException("BinaryVersion with length more than 1024 are not supported. Provided length " + iArr.length + '.');
            }
            iArr.getClass();
            listCf = woy.cf(new afaq(new afba(iArr), 3, length));
        }
        this.rest = listCf;
    }

    public boolean equals(Object obj) {
        if (obj == null || !affa.f(getClass(), obj.getClass())) {
            return false;
        }
        ahkv ahkvVar = (ahkv) obj;
        return this.major == ahkvVar.major && this.minor == ahkvVar.minor && this.patch == ahkvVar.patch && affa.f(this.rest, ahkvVar.rest);
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public int hashCode() {
        int i = this.major;
        List<Integer> list = this.rest;
        int i2 = i + (i * 31) + this.minor;
        int i3 = i2 + (i2 * 31) + this.patch;
        return i3 + (i3 * 31) + list.hashCode();
    }

    public final boolean isAtLeast(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.patch >= i3;
    }

    public final boolean isAtMost(int i, int i2, int i3) {
        int i4 = this.major;
        if (i4 < i) {
            return true;
        }
        if (i4 > i) {
            return false;
        }
        int i5 = this.minor;
        if (i5 < i2) {
            return true;
        }
        return i5 <= i2 && this.patch <= i3;
    }

    protected final boolean isCompatibleTo(ahkv ahkvVar) {
        ahkvVar.getClass();
        int i = this.major;
        return i == 0 ? ahkvVar.major == 0 && this.minor == ahkvVar.minor : i == ahkvVar.major && this.minor <= ahkvVar.minor;
    }

    public final int[] toArray() {
        return this.numbers;
    }

    public String toString() {
        int[] array = toArray();
        ArrayList arrayList = new ArrayList();
        for (int i : array) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : woy.cu(arrayList, ".", null, null, null, 62);
    }

    public final boolean isAtLeast(ahkv ahkvVar) {
        ahkvVar.getClass();
        return isAtLeast(ahkvVar.major, ahkvVar.minor, ahkvVar.patch);
    }
}
