package ff;

import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class n extends AbstractC2651f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int[] f35430a;

    public n(int[] iArr) {
        this.f35430a = iArr;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f35430a;
        int length = iArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            }
            if (iIntValue == iArr[i5]) {
                break;
            }
            i5++;
        }
        return i5 >= 0;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        return Integer.valueOf(this.f35430a[i5]);
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        return this.f35430a.length;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f35430a;
        int length = iArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            if (iIntValue == iArr[i5]) {
                return i5;
            }
        }
        return -1;
    }

    @Override // ff.AbstractC2646a, java.util.Collection
    public final boolean isEmpty() {
        return this.f35430a.length == 0;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f35430a;
        AbstractC3340k.e(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i5 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i5 < 0) {
                    break;
                }
                length = i5;
            }
        }
        return -1;
    }
}
