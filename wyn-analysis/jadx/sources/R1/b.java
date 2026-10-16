package R1;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends H5.a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10094c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10095d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10096e;

    public b(int i5, long j8) {
        super(i5, 1);
        this.f10094c = j8;
        this.f10095d = new ArrayList();
        this.f10096e = new ArrayList();
    }

    public final b o(int i5) {
        ArrayList arrayList = this.f10096e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f4893b == i5) {
                return bVar;
            }
        }
        return null;
    }

    public final c q(int i5) {
        ArrayList arrayList = this.f10095d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = (c) arrayList.get(i10);
            if (cVar.f4893b == i5) {
                return cVar;
            }
        }
        return null;
    }

    @Override // H5.a
    public final String toString() {
        return H5.a.f(this.f4893b) + " leaves: " + Arrays.toString(this.f10095d.toArray()) + " containers: " + Arrays.toString(this.f10096e.toArray());
    }
}
