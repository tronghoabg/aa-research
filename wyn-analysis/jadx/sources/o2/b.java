package o2;

import f6.C2613z;
import k2.H;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import t6.C4136d;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f41273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f41274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f41275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f41276e;

    public /* synthetic */ b(Object obj, int i5, long j8, long j10, int i10) {
        this.f41272a = i10;
        this.f41276e = obj;
        this.f41273b = i5;
        this.f41274c = j8;
        this.f41275d = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f41272a) {
            case 0:
                V1.d dVar = ((c) this.f41276e).f41278b;
                C6.l lVar = dVar.f12902d;
                V1.a aVarI = dVar.I(((AbstractC3409K) lVar.f1845b).isEmpty() ? null : (H) AbstractC3437s.j((AbstractC3409K) lVar.f1845b));
                dVar.L(aVarI, 1006, new F5.e(aVarI, this.f41273b, this.f41274c, this.f41275d, 2));
                break;
            default:
                F5.f fVar = ((C4136d) this.f41276e).f45860b;
                C6.l lVar2 = fVar.f3894d;
                F5.a aVarL = fVar.L(((AbstractC3409K) lVar2.f1845b).isEmpty() ? null : (C2613z) AbstractC3437s.j((AbstractC3409K) lVar2.f1845b));
                fVar.O(aVarL, 1006, new F5.e(aVarL, this.f41273b, this.f41274c, this.f41275d, 0));
                break;
        }
    }
}
