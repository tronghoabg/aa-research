package kotlinx.coroutines;

import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c extends bv {

    /* renamed from: a, reason: collision with root package name */
    public ax f51781a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f51782b;

    /* renamed from: d, reason: collision with root package name */
    private final k f51783d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.a.d f51784e = h.e.b.h(null);

    public c(e eVar, k kVar) {
        this.f51782b = eVar;
        this.f51783d = kVar;
    }

    @Override // kotlinx.coroutines.bv
    public final void a(Throwable th) {
        if (th != null) {
            k kVar = this.f51783d;
            Object objA = kVar.a(th);
            if (objA != null) {
                kVar.b(objA);
                d dVar = (d) this.f51784e.b();
                if (dVar != null) {
                    dVar.a();
                    return;
                }
                return;
            }
            return;
        }
        e eVar = this.f51782b;
        if (eVar.f51851b.a() == 0) {
            k kVar2 = this.f51783d;
            am[] amVarArr = eVar.f51850a;
            ArrayList arrayList = new ArrayList(amVarArr.length);
            for (am amVar : amVarArr) {
                arrayList.add(amVar.e());
            }
            kVar2.resumeWith(arrayList);
        }
    }

    public final void b(d dVar) {
        this.f51784e.d(dVar);
    }

    @Override // kotlinx.coroutines.bv
    public final boolean c() {
        return false;
    }
}
