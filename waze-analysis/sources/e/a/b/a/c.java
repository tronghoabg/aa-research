package e.a.b.a;

import com.google.d.m.a.ay;
import e.a.da;
import e.a.db;
import e.a.dt;
import e.a.ee;
import e.a.eg;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c implements ay {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f46365a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f46366b;

    c(e eVar, int i2, byte[] bArr) {
        this.f46366b = i2;
        Objects.requireNonNull(eVar);
        this.f46365a = eVar;
    }

    @Override // com.google.d.m.a.ay
    public final void onFailure(Throwable th) {
        int i2 = this.f46366b;
        if (i2 == 0) {
            ((e) this.f46365a).M(th);
            return;
        }
        if (i2 == 1) {
            ((e) this.f46365a).M(th);
            return;
        }
        da daVarC = db.c();
        daVarC.b(eg.b(ee.e(th)));
        ((dt) this.f46365a).c(daVarC.a());
    }

    @Override // com.google.d.m.a.ay
    public final /* synthetic */ void onSuccess(Object obj) {
        int i2 = this.f46366b;
        if (i2 == 0) {
            ((e) this.f46365a).L((ee) obj);
        } else if (i2 != 1) {
            ((dt) this.f46365a).c((db) obj);
        } else {
            ((e) this.f46365a).N((ee) obj);
        }
    }

    c(e eVar, int i2) {
        this.f46366b = i2;
        Objects.requireNonNull(eVar);
        this.f46365a = eVar;
    }

    c(y yVar, dt dtVar, int i2) {
        this.f46366b = i2;
        this.f46365a = dtVar;
        Objects.requireNonNull(yVar);
    }
}
