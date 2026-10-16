package defpackage;

import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import com.google.android.gms.car.display.CarRegionId;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class rcc {
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    public boolean a = true;
    private boolean d = false;

    public final ProjectionWindowAnimationChoreography a() {
        if (!this.a) {
            woy.aa(!this.d, "Can't cast insets after animations for batched insets");
        }
        return new ProjectionWindowAnimationChoreography(this.b, this.c, this.a, this.d);
    }

    public final void b(CarRegionId carRegionId, int i) {
        this.b.put(carRegionId, Integer.valueOf(i));
    }

    public final void c(CarRegionId carRegionId, ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        this.c.put(carRegionId, projectionWindowAnimationParams);
    }

    public final void d() {
        this.d = true;
    }

    public final void e(Map map) {
        Map map2 = this.b;
        map2.clear();
        map2.putAll(map);
    }

    public final void f(Map map) {
        Map map2 = this.c;
        map2.clear();
        map2.putAll(map);
    }
}
