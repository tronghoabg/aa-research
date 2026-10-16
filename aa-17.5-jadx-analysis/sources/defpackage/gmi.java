package defpackage;

import android.location.Location;
import androidx.car.app.model.CarLocation;
import com.google.android.apps.auto.components.apphost.view.widgets.maps.MapViewContainerImpl;
import com.google.android.libraries.maps.LocationSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class gmi implements gef {
    private CarLocation a;
    private List b;
    private final List c;
    private final gjv d;
    private final ajmd e;

    public gmi(gjv gjvVar, ajmd ajmdVar) {
        int i = yfq.d;
        this.b = yls.a;
        this.c = new ArrayList();
        this.d = gjvVar;
        this.e = ajmdVar;
    }

    @Override // defpackage.gef
    public final CarLocation a() {
        return this.a;
    }

    @Override // defpackage.gef
    public final List b() {
        return this.b;
    }

    @Override // defpackage.gef
    public final void c(Location location) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            LocationSource.OnLocationChangedListener onLocationChangedListener = ((MapViewContainerImpl) ((ajmd) it.next()).a).d;
            if (onLocationChangedListener != null) {
                onLocationChangedListener.onLocationChanged(location);
            }
        }
    }

    @Override // defpackage.gef
    public final void d(CarLocation carLocation) {
        this.a = carLocation;
    }

    @Override // defpackage.gef
    public final void e(List list) {
        gev.b();
        if (yrm.W(this.b, list)) {
            return;
        }
        this.b = list;
        this.d.a(12);
    }

    @Override // defpackage.gef
    public final void f(ajmd ajmdVar) {
        List list = this.c;
        if (list.isEmpty()) {
            this.e.F(true);
        }
        list.add(ajmdVar);
    }

    @Override // defpackage.gef
    public final void g(ajmd ajmdVar) {
        List list = this.c;
        list.remove(ajmdVar);
        if (list.isEmpty()) {
            this.e.F(false);
        }
    }
}
