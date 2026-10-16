package p9;

import java.util.Iterator;
import ka.C1;

/* renamed from: p9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3780a extends C3789j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f43338d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3780a(s9.j jVar, EnumC3788i enumC3788i, C1 c12, int i5) {
        super(jVar, enumC3788i, c12);
        this.f43338d = i5;
    }

    @Override // p9.C3789j, p9.k
    public final boolean d(s9.k kVar) {
        C1 c1F;
        switch (this.f43338d) {
            case 0:
                C1 c1F2 = kVar.f45384e.f(this.f43373c);
                if (s9.p.f(c1F2)) {
                    Iterator it = c1F2.m().getValuesList().iterator();
                    while (it.hasNext()) {
                        if (s9.p.d(this.f43372b.m(), (C1) it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            case 1:
                C1 c1F3 = kVar.f45384e.f(this.f43373c);
                if (!s9.p.f(c1F3) || !s9.p.d(c1F3.m(), this.f43372b)) {
                }
                break;
            default:
                C1 c12 = this.f43372b;
                if (!s9.p.d(c12.m(), s9.p.f45392b) && (c1F = kVar.f45384e.f(this.f43373c)) != null && !s9.p.d(c12.m(), c1F)) {
                }
                break;
        }
        return false;
    }
}
