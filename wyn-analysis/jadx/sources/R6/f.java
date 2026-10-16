package r6;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import f6.a0;
import java.util.Map;
import u6.v;

/* loaded from: classes3.dex */
public final class f extends r {

    /* renamed from: P, reason: collision with root package name */
    public static final /* synthetic */ int f44414P = 0;

    /* renamed from: A, reason: collision with root package name */
    public final boolean f44415A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f44416B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f44417C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f44418D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f44419E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f44420F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f44421G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f44422H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f44423I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f44424J;

    /* renamed from: K, reason: collision with root package name */
    public final boolean f44425K;
    public final boolean L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f44426M;

    /* renamed from: N, reason: collision with root package name */
    public final SparseArray f44427N;

    /* renamed from: O, reason: collision with root package name */
    public final SparseBooleanArray f44428O;

    static {
        new f(new C3930e());
    }

    public f(C3930e c3930e) {
        super(c3930e);
        this.f44415A = c3930e.f44400A;
        this.f44416B = c3930e.f44401B;
        this.f44417C = c3930e.f44402C;
        this.f44418D = c3930e.f44403D;
        this.f44419E = c3930e.f44404E;
        this.f44420F = c3930e.f44405F;
        this.f44421G = c3930e.f44406G;
        this.f44422H = c3930e.f44407H;
        this.f44423I = c3930e.f44408I;
        this.f44424J = c3930e.f44409J;
        this.f44425K = c3930e.f44410K;
        this.L = c3930e.L;
        this.f44426M = c3930e.f44411M;
        this.f44427N = c3930e.f44412N;
        this.f44428O = c3930e.f44413O;
    }

    @Override // r6.r
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (super.equals(fVar) && this.f44415A == fVar.f44415A && this.f44416B == fVar.f44416B && this.f44417C == fVar.f44417C && this.f44418D == fVar.f44418D && this.f44419E == fVar.f44419E && this.f44420F == fVar.f44420F && this.f44421G == fVar.f44421G && this.f44422H == fVar.f44422H && this.f44423I == fVar.f44423I && this.f44424J == fVar.f44424J && this.f44425K == fVar.f44425K && this.L == fVar.L && this.f44426M == fVar.f44426M) {
                SparseBooleanArray sparseBooleanArray = this.f44428O;
                int size = sparseBooleanArray.size();
                SparseBooleanArray sparseBooleanArray2 = fVar.f44428O;
                if (sparseBooleanArray2.size() == size) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            SparseArray sparseArray = this.f44427N;
                            int size2 = sparseArray.size();
                            SparseArray sparseArray2 = fVar.f44427N;
                            if (sparseArray2.size() == size2) {
                                for (int i10 = 0; i10 < size2; i10++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i10);
                                        Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                a0 a0Var = (a0) entry.getKey();
                                                if (!map2.containsKey(a0Var) || !v.a(entry.getValue(), map2.get(a0Var))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i5)) < 0) {
                                break;
                            }
                            i5++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // r6.r
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f44415A ? 1 : 0)) * 31) + (this.f44416B ? 1 : 0)) * 31) + (this.f44417C ? 1 : 0)) * 31) + (this.f44418D ? 1 : 0)) * 31) + (this.f44419E ? 1 : 0)) * 31) + (this.f44420F ? 1 : 0)) * 31) + (this.f44421G ? 1 : 0)) * 31) + (this.f44422H ? 1 : 0)) * 31) + (this.f44423I ? 1 : 0)) * 31) + (this.f44424J ? 1 : 0)) * 31) + (this.f44425K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.f44426M ? 1 : 0);
    }
}
