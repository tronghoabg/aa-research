package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.Optional;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
final class ioz extends ioc {
    public static final /* synthetic */ int f = 0;

    @Override // defpackage.ioc
    protected final ing a(final inz inzVar, final iob iobVar, int i, boolean z) {
        List list = this.e;
        if (!list.isEmpty()) {
            return (ing) list.get(0);
        }
        CarRegionId carRegionId = inzVar.i;
        jkk jkkVarJ = iobVar.j(carRegionId.h);
        final ComponentName componentName = inzVar.b;
        return new ipb(iobVar, this, i, jkkVarJ, carRegionId, inzVar, (componentName == null || Build.VERSION.SDK_INT < 33) ? iow.a : new iow() { // from class: ioy
            @Override // defpackage.iow
            public final Optional a() {
                int i2 = ioz.f;
                inz inzVar2 = inzVar;
                ComponentName component = inzVar2.c.getComponent();
                CarDisplayId carDisplayId = inzVar2.i.h;
                iob iobVar2 = iobVar;
                int iD = iobVar2.j(carDisplayId).d();
                Rect rect = inzVar2.j;
                int iWidth = rect.width();
                int iHeight = rect.height();
                Context context = iobVar2.d;
                context.getClass();
                component.getClass();
                jmi jmiVarF = jme.a.a(context).f(dlz.D());
                Objects.toString(component);
                return Optional.of(new ipk(context, componentName, component, new iph(iWidth, iHeight, iD, 1, jmiVarF, false, "GhostActivityDisplay:".concat(component.toString()), false, null)));
            }
        }, new ilk(iobVar, 7));
    }
}
