package T3;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K3.q f11402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ UUID f11403d;

    public b(K3.q qVar, UUID uuid) {
        this.f11402c = qVar;
        this.f11403d = uuid;
    }

    @Override // T3.d
    public final void d() {
        K3.q qVar = this.f11402c;
        WorkDatabase workDatabase = qVar.f6503c;
        workDatabase.c();
        try {
            d.a(qVar, this.f11403d.toString());
            workDatabase.n();
            workDatabase.j();
            K3.i.a(qVar.f6502b, qVar.f6503c, qVar.f6505e);
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
