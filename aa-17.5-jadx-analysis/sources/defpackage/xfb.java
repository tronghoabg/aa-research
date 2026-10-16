package defpackage;

import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.system.GhLifecycleService;

/* loaded from: classes.dex */
public final /* synthetic */ class xfb implements kix {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ xfb(GhLifecycleService ghLifecycleService, CarDisplayId carDisplayId, int i) {
        this.c = i;
        this.a = ghLifecycleService;
        this.b = carDisplayId;
    }

    @Override // defpackage.kix
    public final Object a() {
        if (this.c != 0) {
            mki.a.g();
            return ((raz) this.a).a.t((CarDisplayId) ((nrd) this.b).b).b();
        }
        lds ldsVar = ((rbb) this.a).f;
        ldsVar.getClass();
        return ldsVar.h(((CarDisplayId) this.b).b).b();
    }

    public /* synthetic */ xfb(nrd nrdVar, qrn qrnVar, int i) {
        this.c = i;
        this.b = nrdVar;
        this.a = qrnVar;
    }
}
