package T3;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11404c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K3.q f11405d;

    public /* synthetic */ c(K3.q qVar, int i5) {
        this.f11404c = i5;
        this.f11405d = qVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // T3.d
    public final void d() {
        switch (this.f11404c) {
            case 0:
                K3.q qVar = this.f11405d;
                WorkDatabase workDatabase = qVar.f6503c;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.u().g().iterator();
                    while (it.hasNext()) {
                        d.a(qVar, (String) it.next());
                    }
                    workDatabase.n();
                    workDatabase.j();
                    K3.i.a(qVar.f6502b, qVar.f6503c, qVar.f6505e);
                    return;
                } catch (Throwable th) {
                    workDatabase.j();
                    throw th;
                }
            default:
                K3.q qVar2 = this.f11405d;
                WorkDatabase workDatabase2 = qVar2.f6503c;
                workDatabase2.c();
                try {
                    Iterator it2 = workDatabase2.u().f().iterator();
                    while (it2.hasNext()) {
                        d.a(qVar2, (String) it2.next());
                    }
                    workDatabase2.n();
                    workDatabase2.j();
                    return;
                } catch (Throwable th2) {
                    workDatabase2.j();
                    throw th2;
                }
        }
    }
}
