package G5;

import E5.T;
import com.bytedance.sdk.openadsdk.TTAdConstant;

/* renamed from: G5.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC0533n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0535p f4428b;

    public /* synthetic */ RunnableC0533n(C0535p c0535p, int i5, long j8, long j10) {
        this.f4427a = 7;
        this.f4428b = c0535p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0535p c0535p = this.f4428b;
        int i5 = this.f4427a;
        c0535p.getClass();
        switch (i5) {
            case 0:
                int i10 = u6.v.f46721a;
                F5.f fVar = c0535p.f4434c.f3030a.f3098r;
                fVar.O(fVar.N(), TTAdConstant.IMAGE_MODE_1012, new F5.b(7));
                break;
            case 1:
                int i11 = u6.v.f46721a;
                F5.f fVar2 = c0535p.f4434c.f3030a.f3098r;
                fVar2.O(fVar2.N(), 1008, new A5.f(21));
                break;
            case 2:
                int i12 = u6.v.f46721a;
                F5.f fVar3 = c0535p.f4434c.f3030a.f3098r;
                fVar3.O(fVar3.N(), 1029, new F5.d(3));
                break;
            case 3:
                int i13 = u6.v.f46721a;
                F5.f fVar4 = c0535p.f4434c.f3030a.f3098r;
                fVar4.O(fVar4.N(), TTAdConstant.IMAGE_MODE_1010, new F5.b(9));
                break;
            case 4:
                int i14 = u6.v.f46721a;
                E5.I i15 = c0535p.f4434c.f3030a;
                i15.getClass();
                F5.f fVar5 = i15.f3098r;
                fVar5.O(fVar5.N(), 1007, new F5.b(16));
                break;
            case 5:
                int i16 = u6.v.f46721a;
                E5.I i17 = c0535p.f4434c.f3030a;
                i17.getClass();
                F5.f fVar6 = i17.f3098r;
                fVar6.O(fVar6.N(), 1009, new F5.d(5));
                break;
            case 6:
                int i18 = u6.v.f46721a;
                F5.f fVar7 = c0535p.f4434c.f3030a.f3098r;
                fVar7.O(fVar7.N(), 1014, new F5.b(14));
                break;
            default:
                int i19 = u6.v.f46721a;
                F5.f fVar8 = c0535p.f4434c.f3030a.f3098r;
                fVar8.O(fVar8.N(), TTAdConstant.IMAGE_MODE_1011, new F5.b(26));
                break;
        }
    }

    public /* synthetic */ RunnableC0533n(C0535p c0535p, long j8) {
        this.f4427a = 3;
        this.f4428b = c0535p;
    }

    public /* synthetic */ RunnableC0533n(C0535p c0535p, T t10, H5.i iVar) {
        this.f4427a = 5;
        this.f4428b = c0535p;
    }

    public /* synthetic */ RunnableC0533n(C0535p c0535p, Object obj, int i5) {
        this.f4427a = i5;
        this.f4428b = c0535p;
    }

    public /* synthetic */ RunnableC0533n(C0535p c0535p, String str, long j8, long j10) {
        this.f4427a = 1;
        this.f4428b = c0535p;
    }
}
