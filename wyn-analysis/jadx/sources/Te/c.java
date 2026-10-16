package Te;

import A7.C0237b0;
import J9.T;
import J9.U;

/* loaded from: classes5.dex */
public final class c extends a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11839b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11840c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(He.i iVar, Object obj, int i5) {
        super(iVar);
        this.f11839b = i5;
        this.f11840c = obj;
    }

    @Override // He.i
    public final void d(He.j jVar) {
        switch (this.f11839b) {
            case 0:
                this.f11833a.c(new b(jVar, (Ne.a) this.f11840c, 0));
                break;
            case 1:
                this.f11833a.c(new f(jVar, (T) this.f11840c, 0));
                break;
            case 2:
                this.f11833a.c(new j(jVar, (U) this.f11840c));
                break;
            case 3:
                this.f11833a.c(new f(jVar, (Le.c) this.f11840c, 1));
                break;
            default:
                C0237b0 c0237b0 = new C0237b0(jVar, (n) this.f11840c);
                jVar.a((Je.c) c0237b0.f815e);
                this.f11833a.c(c0237b0);
                break;
        }
    }
}
