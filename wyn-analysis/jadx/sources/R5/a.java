package R5;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a extends H5.a {

    /* renamed from: c, reason: collision with root package name */
    public final long f10256c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10257d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f10258e;

    public a(int i5, long j8) {
        super(i5, 2);
        this.f10256c = j8;
        this.f10257d = new ArrayList();
        this.f10258e = new ArrayList();
    }

    public final a o(int i5) {
        ArrayList arrayList = this.f10258e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            if (aVar.f4893b == i5) {
                return aVar;
            }
        }
        return null;
    }

    public final b q(int i5) {
        ArrayList arrayList = this.f10257d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.f4893b == i5) {
                return bVar;
            }
        }
        return null;
    }

    @Override // H5.a
    public final String toString() {
        return H5.a.e(this.f4893b) + " leaves: " + Arrays.toString(this.f10257d.toArray()) + " containers: " + Arrays.toString(this.f10258e.toArray());
    }
}
