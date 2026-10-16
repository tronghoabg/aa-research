package defpackage;

import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.system.GhLifecycleService;

/* loaded from: classes.dex */
public final /* synthetic */ class xfc implements rzb {
    public final /* synthetic */ GhLifecycleService a;
    private final /* synthetic */ int b;

    public /* synthetic */ xfc(GhLifecycleService ghLifecycleService, int i) {
        this.b = i;
        this.a = ghLifecycleService;
    }

    @Override // defpackage.rzb
    public final Object a(CarDisplayId carDisplayId) {
        if (this.b != 0) {
            return this.a.k(carDisplayId);
        }
        throw null;
    }
}
