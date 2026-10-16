package defpackage;

import android.content.Context;
import com.google.android.gms.car.CarCall;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class the implements tgy {
    public static final yph a = yph.c("CallClientAdapterImpl");
    public qqe e;
    public Context f;
    public final List b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public thc d = new thc(this);
    public final thb g = new thb(this);

    public the(List list) {
        if (list instanceof yfq) {
            return;
        }
        yfq.o(list);
    }

    public static List b(CarCall carCall, thc thcVar) {
        ArrayList arrayList = new ArrayList();
        for (CarCall carCall2 : thcVar.c) {
            CarCall carCall3 = carCall2.b;
            if (carCall3 != null && carCall3.equals(carCall)) {
                arrayList.add(carCall2);
            }
        }
        return arrayList;
    }

    public static boolean d(Object obj, Object obj2) {
        return !Objects.equals(obj, obj2);
    }

    public static final void e(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            CarCall carCall = (CarCall) it.next();
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((qrv) it2.next()).c(carCall);
            }
            mjv.y(thd.g, carCall);
            if (carCall.e == 2) {
                mjv.y(thd.h, carCall);
            }
        }
    }

    @Override // defpackage.tgy
    public final List a() {
        synchronized (this.c) {
            thc thcVar = this.d;
            if (thcVar != null && thcVar.b()) {
                return yfq.o(thcVar.c);
            }
            int i = yfq.d;
            return yls.a;
        }
    }

    public final void c(CarCall carCall, List list) {
        thc thcVar = new thc(this);
        thcVar.a = list;
        thcVar.b = carCall;
        qqe qqeVar = this.e;
        if (qqeVar != null) {
            qqeVar.d().n(new kmp(thcVar, 3));
            qqe qqeVar2 = this.e;
            qqeVar2.getClass();
            qqeVar2.e().n(new kmp(thcVar, 4));
            qqe qqeVar3 = this.e;
            qqeVar3.getClass();
            qqeVar3.c().n(new kmp(thcVar, 5));
            qqe qqeVar4 = this.e;
            qqeVar4.getClass();
            qqeVar4.f().n(new kmp(thcVar, 6));
        }
    }
}
