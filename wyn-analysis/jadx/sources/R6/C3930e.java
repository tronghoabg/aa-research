package r6;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: r6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3930e extends q {

    /* renamed from: A, reason: collision with root package name */
    public boolean f44400A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f44401B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f44402C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f44403D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f44404E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f44405F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f44406G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f44407H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f44408I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f44409J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f44410K;
    public boolean L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f44411M;

    /* renamed from: N, reason: collision with root package name */
    public final SparseArray f44412N;

    /* renamed from: O, reason: collision with root package name */
    public final SparseBooleanArray f44413O;

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3930e(android.content.Context r10) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.C3930e.<init>(android.content.Context):void");
    }

    @Override // r6.q
    public final q c(int i5, int i10) {
        super.c(i5, i10);
        return this;
    }

    public final void d() {
        this.f44400A = true;
        this.f44401B = false;
        this.f44402C = true;
        this.f44403D = false;
        this.f44404E = true;
        this.f44405F = false;
        this.f44406G = false;
        this.f44407H = false;
        this.f44408I = false;
        this.f44409J = true;
        this.f44410K = true;
        this.L = false;
        this.f44411M = true;
    }

    public final void e(int i5) {
        this.f44492z.remove(Integer.valueOf(i5));
    }

    public C3930e(f fVar) {
        b(fVar);
        this.f44400A = fVar.f44415A;
        this.f44401B = fVar.f44416B;
        this.f44402C = fVar.f44417C;
        this.f44403D = fVar.f44418D;
        this.f44404E = fVar.f44419E;
        this.f44405F = fVar.f44420F;
        this.f44406G = fVar.f44421G;
        this.f44407H = fVar.f44422H;
        this.f44408I = fVar.f44423I;
        this.f44409J = fVar.f44424J;
        this.f44410K = fVar.f44425K;
        this.L = fVar.L;
        this.f44411M = fVar.f44426M;
        SparseArray sparseArray = new SparseArray();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray2 = fVar.f44427N;
            if (i5 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i5), new HashMap((Map) sparseArray2.valueAt(i5)));
                i5++;
            } else {
                this.f44412N = sparseArray;
                this.f44413O = fVar.f44428O.clone();
                return;
            }
        }
    }

    public C3930e() {
        this.f44412N = new SparseArray();
        this.f44413O = new SparseBooleanArray();
        d();
    }
}
