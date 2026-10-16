package v6;

import E5.I;
import E5.T;
import G5.C0535p;
import f6.C2613z;
import u6.v;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0535p f46897b;

    public /* synthetic */ n(C0535p c0535p, int i5, long j8) {
        this.f46896a = 0;
        this.f46897b = c0535p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i5 = 2;
        C0535p c0535p = this.f46897b;
        int i10 = this.f46896a;
        c0535p.getClass();
        switch (i10) {
            case 0:
                int i11 = v.f46721a;
                F5.f fVar = c0535p.f4434c.f3030a.f3098r;
                fVar.O(fVar.L((C2613z) fVar.f3894d.f1848e), 1018, new F5.b(11));
                break;
            case 1:
                int i12 = v.f46721a;
                F5.f fVar2 = c0535p.f4434c.f3030a.f3098r;
                fVar2.O(fVar2.N(), 1019, new F5.b(23));
                break;
            case 2:
                int i13 = v.f46721a;
                F5.f fVar3 = c0535p.f4434c.f3030a.f3098r;
                fVar3.O(fVar3.N(), 1030, new F5.d(i5));
                break;
            case 3:
                int i14 = v.f46721a;
                F5.f fVar4 = c0535p.f4434c.f3030a.f3098r;
                fVar4.O(fVar4.N(), 1016, new F5.b(4));
                break;
            case 4:
                int i15 = v.f46721a;
                I i16 = c0535p.f4434c.f3030a;
                i16.getClass();
                F5.f fVar5 = i16.f3098r;
                fVar5.O(fVar5.N(), 1015, new F5.b(2));
                break;
            case 5:
                int i17 = v.f46721a;
                I i18 = c0535p.f4434c.f3030a;
                i18.getClass();
                F5.f fVar6 = i18.f3098r;
                fVar6.O(fVar6.N(), 1017, new F5.b(1));
                break;
            default:
                int i19 = v.f46721a;
                F5.f fVar7 = c0535p.f4434c.f3030a.f3098r;
                fVar7.O(fVar7.L((C2613z) fVar7.f3894d.f1848e), 1021, new F5.b(15));
                break;
        }
    }

    public /* synthetic */ n(C0535p c0535p, long j8, int i5) {
        this.f46896a = 6;
        this.f46897b = c0535p;
    }

    public /* synthetic */ n(C0535p c0535p, T t10, H5.i iVar) {
        this.f46896a = 5;
        this.f46897b = c0535p;
    }

    public /* synthetic */ n(C0535p c0535p, Object obj, int i5) {
        this.f46896a = i5;
        this.f46897b = c0535p;
    }

    public /* synthetic */ n(C0535p c0535p, String str, long j8, long j10) {
        this.f46896a = 3;
        this.f46897b = c0535p;
    }
}
