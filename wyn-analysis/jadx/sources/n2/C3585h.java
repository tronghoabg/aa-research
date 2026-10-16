package n2;

import N1.S;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: n2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3585h extends S {

    /* renamed from: r, reason: collision with root package name */
    public boolean f40838r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f40839s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f40840t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f40841u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f40842v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f40843w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f40844x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseArray f40845y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f40846z;

    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3585h(android.content.Context r9) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C3585h.<init>(android.content.Context):void");
    }

    @Override // N1.S
    public final S b(int i5, int i10) {
        super.b(i5, i10);
        return this;
    }

    public final void c() {
        this.f40838r = true;
        this.f40839s = true;
        this.f40840t = true;
        this.f40841u = true;
        this.f40842v = true;
        this.f40843w = true;
        this.f40844x = true;
    }

    public C3585h(C3586i c3586i) {
        a(c3586i);
        this.f40838r = c3586i.f40848r;
        this.f40839s = c3586i.f40849s;
        this.f40840t = c3586i.f40850t;
        this.f40841u = c3586i.f40851u;
        this.f40842v = c3586i.f40852v;
        this.f40843w = c3586i.f40853w;
        this.f40844x = c3586i.f40854x;
        SparseArray sparseArray = new SparseArray();
        int i5 = 0;
        while (true) {
            SparseArray sparseArray2 = c3586i.f40855y;
            if (i5 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i5), new HashMap((Map) sparseArray2.valueAt(i5)));
                i5++;
            } else {
                this.f40845y = sparseArray;
                this.f40846z = c3586i.f40856z.clone();
                return;
            }
        }
    }

    public C3585h() {
        this.f40845y = new SparseArray();
        this.f40846z = new SparseBooleanArray();
        c();
    }
}
