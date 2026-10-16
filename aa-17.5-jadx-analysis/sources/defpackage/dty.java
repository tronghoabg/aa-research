package defpackage;

import android.app.Notification;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dty {
    static Notification.ProgressStyle.Point a(dtz dtzVar) {
        return dtx.a(dtzVar).setSemanticStyle(dtzVar.d);
    }

    static Notification.ProgressStyle.Segment b(dua duaVar) {
        return dtx.b(duaVar).setSemanticStyle(duaVar.d);
    }

    static void c(Notification.ProgressStyle progressStyle, List<dtz> list) {
        Iterator<dtz> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressPoint(a(it.next()));
        }
    }

    static void d(Notification.ProgressStyle progressStyle, List<dua> list) {
        Iterator<dua> it = list.iterator();
        while (it.hasNext()) {
            progressStyle.addProgressSegment(b(it.next()));
        }
    }

    public static final dwl[] e(List list) {
        return (dwl[]) list.get(0);
    }

    public static final epv f(eqa eqaVar) {
        return g(eqaVar.getLifecycle());
    }

    public static final epv g(ept eptVar) {
        AtomicReference atomicReference;
        epv epvVar;
        aivr aivrVar;
        eptVar.getClass();
        do {
            atomicReference = (AtomicReference) eptVar.a.a;
            epv epvVar2 = (epv) atomicReference.get();
            if (epvVar2 != null) {
                return epvVar2;
            }
            aiwh aiwhVar = new aiwh(null);
            aitu aituVar = aium.a;
            aivrVar = ajct.a;
            epvVar = new epv(eptVar, affa.v(aiwhVar, aivrVar.i()));
        } while (!a.p(atomicReference, epvVar));
        ahnc.d(epvVar, aivrVar.i(), 0, new dxp(epvVar, (afck) null, 4), 2);
        return epvVar;
    }
}
