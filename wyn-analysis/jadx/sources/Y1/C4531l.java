package y1;

import android.util.SparseArray;

/* renamed from: y1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4531l {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f47949a;

    /* renamed from: b, reason: collision with root package name */
    public C4528i f47950b;

    public C4531l(int i5) {
        this.f47949a = new SparseArray(i5);
    }

    public final void a(C4528i c4528i, int i5, int i10) {
        int iA = c4528i.a(i5);
        SparseArray sparseArray = this.f47949a;
        C4531l c4531l = sparseArray == null ? null : (C4531l) sparseArray.get(iA);
        if (c4531l == null) {
            c4531l = new C4531l(1);
            sparseArray.put(c4528i.a(i5), c4531l);
        }
        if (i10 > i5) {
            c4531l.a(c4528i, i5 + 1, i10);
        } else {
            c4531l.f47950b = c4528i;
        }
    }
}
