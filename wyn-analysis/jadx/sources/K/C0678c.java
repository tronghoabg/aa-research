package K;

import N.C0718d;
import N.C0725g0;
import N.C0740o;
import N.V;
import a.AbstractC1304a;
import e0.C2465q;
import ef.C2515C;
import kotlin.jvm.internal.AbstractC3343n;
import r0.InterfaceC3903h;
import t0.InterfaceC4044I;

/* renamed from: K.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678c extends AbstractC3343n implements tf.p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6224i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6225j;
    public final /* synthetic */ int k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6226l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f6227m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0678c(int i5, int i10, Object obj, Object obj2, Object obj3) {
        super(2);
        this.f6224i = i10;
        this.f6226l = obj;
        this.f6227m = obj2;
        this.f6225j = obj3;
        this.k = i5;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2515C c2515c = C2515C.f34653a;
        Object obj3 = this.f6225j;
        Object obj4 = this.f6227m;
        Object obj5 = this.f6226l;
        int i5 = this.k;
        int i10 = 1;
        switch (this.f6224i) {
            case 0:
                C0740o c0740o = (C0740o) obj;
                if ((((Number) obj2).intValue() & 11) != 2 || !c0740o.x()) {
                    C0718d.a(new C0725g0[]{AbstractC0683h.f6261a.a(Float.valueOf(C2465q.c(((C2465q) ((V) obj5).getValue()).f34382a)))}, V.e.b(c0740o, -1699085201, new C0677b((E.F) obj4, (V.d) obj3, i5, i10)), c0740o, 56);
                    break;
                } else {
                    c0740o.I();
                    break;
                }
            case 1:
                ((Number) obj2).intValue();
                ((V.d) obj3).d(obj5, obj4, (C0740o) obj, C0718d.Q(i5) | 1);
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC1304a.e((Z.k) obj5, (Y3.n) obj4, (InterfaceC3903h) obj3, (C0740o) obj, i5 | 1);
                break;
            case 3:
                ((Number) obj2).intValue();
                com.moloco.sdk.internal.publisher.H.G((h4.h) obj5, (Z.k) obj4, (InterfaceC3903h) obj3, (C0740o) obj, i5 | 1);
                break;
            default:
                ((Number) obj2).intValue();
                u0.M.a((InterfaceC4044I) obj5, (u0.D) obj4, (V.d) obj3, (C0740o) obj, i5 | 1);
                break;
        }
        return c2515c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0678c(V.d dVar, Object obj, Object obj2, int i5) {
        super(2);
        this.f6224i = 1;
        this.f6225j = dVar;
        this.f6226l = obj;
        this.f6227m = obj2;
        this.k = i5;
    }
}
