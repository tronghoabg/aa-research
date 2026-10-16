package Qe;

import He.g;
import Se.i;

/* loaded from: classes5.dex */
public final class f extends He.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10000a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10001b;

    /* renamed from: c, reason: collision with root package name */
    public final Le.c f10002c;

    public /* synthetic */ f(Object obj, Le.c cVar, int i5) {
        this.f10000a = i5;
        this.f10001b = obj;
        this.f10002c = cVar;
    }

    @Override // He.a
    public final void e(He.b bVar) {
        switch (this.f10000a) {
            case 0:
                Je.b cVar = new Je.c(1);
                bVar.a(cVar);
                ((e) this.f10001b).d(new Dd.c(this, bVar, cVar, 11));
                break;
            default:
                i iVar = new i(0, bVar, this.f10002c);
                bVar.a(iVar);
                ((g) this.f10001b).b(iVar);
                break;
        }
    }
}
