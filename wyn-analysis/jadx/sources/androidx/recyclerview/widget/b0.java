package androidx.recyclerview.widget;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f18830a;

    /* renamed from: b, reason: collision with root package name */
    public int f18831b;

    public final C1463a0 a(int i5) {
        SparseArray sparseArray = this.f18830a;
        C1463a0 c1463a0 = (C1463a0) sparseArray.get(i5);
        if (c1463a0 != null) {
            return c1463a0;
        }
        C1463a0 c1463a02 = new C1463a0();
        sparseArray.put(i5, c1463a02);
        return c1463a02;
    }
}
