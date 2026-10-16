package y1;

import Va.X7;
import ba.C1521a;
import java.util.ArrayList;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4523d extends tg.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N8.b f47920g;

    public C4523d(N8.b bVar) {
        this.f47920g = bVar;
    }

    @Override // tg.b
    public final void J(Throwable th) {
        ((C4526g) this.f47920g.f8597a).d(th);
    }

    @Override // tg.b
    public final void K(X7 x72) {
        N8.b bVar = this.f47920g;
        bVar.f8599c = x72;
        bVar.f8598b = new C1521a((X7) bVar.f8599c, new ad.r(), ((C4526g) bVar.f8597a).f47930h, 28);
        C4526g c4526g = (C4526g) bVar.f8597a;
        c4526g.getClass();
        ArrayList arrayList = new ArrayList();
        c4526g.f47923a.writeLock().lock();
        try {
            c4526g.f47925c = 1;
            arrayList.addAll(c4526g.f47924b);
            c4526g.f47924b.clear();
            c4526g.f47923a.writeLock().unlock();
            c4526g.f47926d.post(new R3.c(arrayList, c4526g.f47925c, (Throwable) null));
        } catch (Throwable th) {
            c4526g.f47923a.writeLock().unlock();
            throw th;
        }
    }
}
