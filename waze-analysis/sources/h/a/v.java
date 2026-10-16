package h.a;

import java.util.RandomAccess;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class v extends g implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int[] f48020a;

    v(int[] iArr) {
        this.f48020a = iArr;
    }

    @Override // h.a.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return c.ah(this.f48020a, ((Number) obj).intValue());
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return Integer.valueOf(this.f48020a[i2]);
    }

    @Override // h.a.g, h.a.a
    public final int getSize() {
        return this.f48020a.length;
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return c.B(this.f48020a, ((Number) obj).intValue());
    }

    @Override // h.a.a, java.util.Collection
    public final boolean isEmpty() {
        return this.f48020a.length == 0;
    }

    @Override // h.a.g, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f48020a;
        h.g.b.x.f(iArr, "<this>");
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i2 = length - 1;
            if (iIntValue == iArr[length]) {
                return length;
            }
            if (i2 < 0) {
                return -1;
            }
            length = i2;
        }
    }
}
