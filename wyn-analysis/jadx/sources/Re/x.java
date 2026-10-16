package Re;

import java.util.ArrayList;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class x extends AbstractC0806a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10768c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(He.c cVar, Object obj, int i5) {
        super(cVar);
        this.f10768c = i5;
        this.f10769d = obj;
    }

    @Override // He.c
    public final void e(He.f fVar) {
        switch (this.f10768c) {
            case 0:
                boolean z2 = fVar instanceof Oe.a;
                Le.d dVar = (Le.d) this.f10769d;
                He.c cVar = this.f10702b;
                if (!z2) {
                    cVar.d(new w(fVar, dVar));
                    break;
                } else {
                    cVar.d(new v((Oe.a) fVar, dVar, 0));
                    break;
                }
            case 1:
                boolean z10 = fVar instanceof Oe.a;
                Y9.c cVar2 = (Y9.c) this.f10769d;
                He.c cVar3 = this.f10702b;
                if (!z10) {
                    cVar3.d(new H(fVar, cVar2));
                    break;
                } else {
                    cVar3.d(new v((Oe.a) fVar, cVar2, 1));
                    break;
                }
            default:
                try {
                    ((Ze.a) this.f10769d).getClass();
                    ArrayList arrayList = new ArrayList();
                    T t10 = new T(fVar);
                    t10.f16792b = arrayList;
                    this.f10702b.d(t10);
                    break;
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    Ye.d.b(th, fVar);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(B b5) {
        super(b5);
        this.f10768c = 2;
        Ze.a aVar = Ze.a.f17083a;
        this.f10769d = aVar;
    }
}
