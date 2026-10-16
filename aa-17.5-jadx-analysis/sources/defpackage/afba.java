package defpackage;

import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class afba extends afar implements RandomAccess {
    final /* synthetic */ int[] a;

    public afba(int[] iArr) {
        this.a = iArr;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.afam, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return woy.dl(this.a, ((Number) obj).intValue());
    }

    @Override // defpackage.afar, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(this.a[i]);
    }

    @Override // defpackage.afar, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return woy.cO(this.a, ((Number) obj).intValue());
    }

    @Override // defpackage.afam, java.util.Collection
    public final boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override // defpackage.afar, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.a;
        int length = iArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i = length - 1;
            if (iIntValue == iArr[length]) {
                return length;
            }
            if (i < 0) {
                return -1;
            }
            length = i;
        }
    }
}
