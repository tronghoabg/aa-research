package zg;

import android.util.SparseIntArray;
import r9.RunnableC3954k;

/* renamed from: zg.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4672k implements InterfaceC4667f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f48625a;

    /* renamed from: b, reason: collision with root package name */
    public final Cloneable f48626b;

    public C4672k(C4673l c4673l, InterfaceC4667f interfaceC4667f) {
        this.f48626b = c4673l;
        this.f48625a = interfaceC4667f;
    }

    public static int a(int i5, int i10) {
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i5; i13++) {
            i11++;
            if (i11 == i10) {
                i12++;
                i11 = 0;
            } else if (i11 > i10) {
                i12++;
                i11 = 1;
            }
        }
        return i11 + 1 > i10 ? i12 + 1 : i12;
    }

    public void b() {
        ((SparseIntArray) this.f48625a).clear();
    }

    @Override // zg.InterfaceC4667f
    public void onFailure(InterfaceC4664c interfaceC4664c, Throwable th) {
        ((C4673l) this.f48626b).f48627a.execute(new RunnableC3954k(this, (InterfaceC4667f) this.f48625a, th, 7));
    }

    @Override // zg.InterfaceC4667f
    public void onResponse(InterfaceC4664c interfaceC4664c, Q q4) {
        ((C4673l) this.f48626b).f48627a.execute(new RunnableC3954k(this, (InterfaceC4667f) this.f48625a, q4, 6));
    }

    public C4672k() {
        this.f48625a = new SparseIntArray();
        this.f48626b = new SparseIntArray();
    }
}
