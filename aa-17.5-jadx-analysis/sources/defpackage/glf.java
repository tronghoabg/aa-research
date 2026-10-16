package defpackage;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import androidx.car.app.model.ClickableSpan;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class glf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ glf(geu geuVar, ClickableSpan clickableSpan) {
        this.a = geuVar;
        this.b = clickableSpan;
    }

    public final void a() {
        ((Handler) ((kzt) this.b).c).removeMessages(((gnk) this.a).ordinal());
    }

    public final void b(dez dezVar) {
        dezVar.getClass();
        gca.e((geu) this.a, ((ClickableSpan) this.b).getOnClickDelegate());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aixy, java.lang.Object] */
    public final void c(Object obj) {
        fmq fmqVar = (fmq) this.b;
        this.a.j(fmqVar.e(obj) ? new fmh(fmqVar.d()) : fmg.a);
    }

    public final void d(Fragment fragment, boolean z) {
        Object obj;
        Object objPrevious;
        fragment.getClass();
        evr evrVar = (evr) this.b;
        List listBY = woy.bY((Collection) evrVar.d.b(), (Iterable) evrVar.e.b());
        ListIterator listIterator = listBY.listIterator(listBY.size());
        while (true) {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (affa.f(((euq) objPrevious).c, fragment.getTag())) {
                    break;
                }
            }
        }
        euq euqVar = (euq) objPrevious;
        boolean z2 = z && ((ewh) this.a).c.isEmpty() && fragment.isRemoving();
        List list = ((ewh) this.a).c;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (affa.f(((aezu) next).a, fragment.getTag())) {
                obj = next;
                break;
            }
        }
        aezu aezuVar = (aezu) obj;
        if (aezuVar != null) {
            list.remove(aezuVar);
        }
        if (!z2 && ewh.k()) {
            Log.v("FragmentNavigator", a.bt(euqVar, fragment, "OnBackStackChangedCommitted for fragment ", " associated with entry "));
        }
        boolean z3 = aezuVar != null && ((Boolean) aezuVar.b).booleanValue();
        if (!z && !z3 && euqVar == null) {
            throw new IllegalArgumentException(a.bm(fragment, "The fragment ", " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
        }
        if (euqVar != null) {
            ewh.l(fragment, evrVar);
            if (z2) {
                if (ewh.k()) {
                    Log.v("FragmentNavigator", a.bw(euqVar, fragment, "OnBackStackChangedCommitted for fragment ", " popping associated entry ", " via system back"));
                }
                evrVar.g(euqVar, false);
            }
        }
    }

    public final void e(Fragment fragment, boolean z) {
        Object objPrevious;
        fragment.getClass();
        if (z) {
            Object obj = this.b;
            evr evrVar = (evr) obj;
            List list = (List) evrVar.d.b();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (affa.f(((euq) objPrevious).c, fragment.getTag())) {
                        break;
                    }
                }
            }
            euq euqVar = (euq) objPrevious;
            if (ewh.k()) {
                Log.v("FragmentNavigator", a.bt(euqVar, fragment, "OnBackStackChangedStarted for fragment ", " associated with entry "));
            }
            if (euqVar != null) {
                ajab ajabVar = evrVar.g;
                ajabVar.d(woy.aT((Set) ajabVar.b(), euqVar));
                if (!((eur) obj).b.b.e.contains(euqVar)) {
                    throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                euqVar.b(eps.d);
            }
        }
    }

    public glf(Object obj, Object obj2) {
        this.a = obj2;
        this.b = obj;
    }

    public glf(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }
}
