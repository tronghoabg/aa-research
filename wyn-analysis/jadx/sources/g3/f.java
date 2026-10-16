package G3;

import android.graphics.Rect;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import ff.v;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f4205b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f4206a;

    public f() {
        AbstractC3256n.m(3, "verificationMode");
        this.f4206a = 3;
    }

    public static boolean a(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (AbstractC3340k.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return AbstractC3340k.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean b(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() == list2.size()) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (a((SidecarDisplayFeature) list.get(i5), (SidecarDisplayFeature) list2.get(i5))) {
                }
            }
            return true;
        }
        return false;
    }

    public final D3.k c(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (sidecarWindowLayoutInfo == null) {
            return new D3.k(v.f35432a);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a.d(sidecarDeviceState2, a.b(sidecarDeviceState));
        return new D3.k(d(a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList d(List list, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            D3.c cVarE = e((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (cVarE != null) {
                arrayList.add(cVarE);
            }
        }
        return arrayList;
    }

    public final D3.c e(SidecarDisplayFeature feature, SidecarDeviceState sidecarDeviceState) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        D3.b bVar;
        D3.b bVar2;
        AbstractC3340k.e(feature, "feature");
        A3.a aVar = A3.a.f278a;
        int i5 = this.f4206a;
        AbstractC3256n.m(i5, "verificationMode");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) new A3.g(feature, i5, aVar).I("Type must be either TYPE_FOLD or TYPE_HINGE", b.f4201i).I("Feature bounds must not be 0", c.f4202i).I("TYPE_FOLD must have 0 area", d.f4203i).I("Feature be pinned to either left or top", e.f4204i).m();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            bVar = D3.b.f2293g;
        } else {
            if (type != 2) {
                return null;
            }
            bVar = D3.b.f2294h;
        }
        int iB = a.b(sidecarDeviceState);
        if (iB == 0 || iB == 1) {
            return null;
        }
        if (iB != 2) {
            bVar2 = D3.b.f2291e;
            if (iB != 3 && iB == 4) {
                return null;
            }
        } else {
            bVar2 = D3.b.f2292f;
        }
        Rect rect = feature.getRect();
        AbstractC3340k.d(rect, "feature.rect");
        return new D3.c(new A3.b(rect), bVar, bVar2);
    }
}
