package android.support.v7.widget;

import android.util.SparseIntArray;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gs implements gu {

    /* renamed from: a, reason: collision with root package name */
    final dr f1589a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gt f1590b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseIntArray f1591c = new SparseIntArray(1);

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f1592d = new SparseIntArray(1);

    gs(gt gtVar, dr drVar) {
        this.f1590b = gtVar;
        this.f1589a = drVar;
    }

    @Override // android.support.v7.widget.gu
    public final int a(int i2) {
        SparseIntArray sparseIntArray = this.f1592d;
        int iIndexOfKey = sparseIntArray.indexOfKey(i2);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        throw new IllegalStateException("requested global type " + i2 + " does not belong to the adapter:" + this.f1589a.f1369a);
    }

    @Override // android.support.v7.widget.gu
    public final int b(int i2) {
        SparseIntArray sparseIntArray = this.f1591c;
        int iIndexOfKey = sparseIntArray.indexOfKey(i2);
        if (iIndexOfKey >= 0) {
            return sparseIntArray.valueAt(iIndexOfKey);
        }
        gt gtVar = this.f1590b;
        dr drVar = this.f1589a;
        int i3 = gtVar.f1594b;
        gtVar.f1594b = i3 + 1;
        gtVar.f1593a.put(i3, drVar);
        sparseIntArray.put(i2, i3);
        this.f1592d.put(i3, i2);
        return i3;
    }
}
