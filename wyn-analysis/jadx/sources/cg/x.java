package cg;

import ff.AbstractC2651f;
import java.util.RandomAccess;

/* loaded from: classes5.dex */
public final class x extends AbstractC2651f implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final C1621j[] f19935a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f19936b;

    public x(C1621j[] c1621jArr, int[] iArr) {
        this.f19935a = c1621jArr;
        this.f19936b = iArr;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1621j) {
            return super.contains((C1621j) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        return this.f19935a[i5];
    }

    @Override // ff.AbstractC2646a
    public final int getSize() {
        return this.f19935a.length;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1621j) {
            return super.indexOf((C1621j) obj);
        }
        return -1;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1621j) {
            return super.lastIndexOf((C1621j) obj);
        }
        return -1;
    }
}
