package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.internal.SynchronizedObject;
import e.c.d.a;
import h.a.ac;
import h.a.i;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class NavigatorState {
    private final bn<List<NavBackStackEntry>> _backStack;
    private final bn<Set<NavBackStackEntry>> _transitionsInProgress;
    private final ch<List<NavBackStackEntry>> backStack;
    private final SynchronizedObject backStackLock = new SynchronizedObject();
    private boolean isNavigating;
    private final ch<Set<NavBackStackEntry>> transitionsInProgress;

    public NavigatorState() {
        bn<List<NavBackStackEntry>> bnVarB = ck.b(ac.f47967a);
        this._backStack = bnVarB;
        bn<Set<NavBackStackEntry>> bnVarB2 = ck.b(a.p());
        this._transitionsInProgress = bnVarB2;
        this.backStack = ai.U(bnVarB);
        this.transitionsInProgress = ai.U(bnVarB2);
    }

    public abstract NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle);

    public final ch<List<NavBackStackEntry>> getBackStack() {
        return this.backStack;
    }

    public final ch<Set<NavBackStackEntry>> getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    public final boolean isNavigating() {
        return this.isNavigating;
    }

    public void markTransitionComplete(NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "entry");
        this._transitionsInProgress.e(a.u((Set) this._transitionsInProgress.d(), navBackStackEntry));
    }

    public void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        int iNextIndex;
        x.f(navBackStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            List listAq = i.aq((Collection) getBackStack().d());
            ListIterator listIterator = listAq.listIterator(listAq.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (x.n(((NavBackStackEntry) listIterator.previous()).getId(), navBackStackEntry.getId())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listAq.set(iNextIndex, navBackStackEntry);
            this._backStack.e(listAq);
        }
    }

    public void onLaunchSingleTopWithTransition(NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "backStackEntry");
        List list = (List) this.backStack.d();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) listIterator.previous();
            if (x.n(navBackStackEntry2.getId(), navBackStackEntry.getId())) {
                bn<Set<NavBackStackEntry>> bnVar = this._transitionsInProgress;
                bnVar.e(a.w(a.w((Set) bnVar.d(), navBackStackEntry2), navBackStackEntry));
                onLaunchSingleTop(navBackStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(NavBackStackEntry navBackStackEntry, boolean z) {
        x.f(navBackStackEntry, "popUpTo");
        synchronized (this.backStackLock) {
            bn bnVar = this._backStack;
            Iterable iterable = (Iterable) this._backStack.d();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (x.n((NavBackStackEntry) obj, navBackStackEntry)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            bnVar.e(arrayList);
        }
    }

    public void popWithTransition(NavBackStackEntry navBackStackEntry, boolean z) {
        Object objPrevious;
        x.f(navBackStackEntry, "popUpTo");
        Iterable iterable = (Iterable) this._transitionsInProgress.d();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    Iterable iterable2 = (Iterable) this.backStack.d();
                    if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                        return;
                    }
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                        }
                    }
                    return;
                }
            }
        }
        bn<Set<NavBackStackEntry>> bnVar = this._transitionsInProgress;
        bnVar.e(a.w((Set) bnVar.d(), navBackStackEntry));
        List list = (List) this.backStack.d();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) objPrevious;
            if (!x.n(navBackStackEntry2, navBackStackEntry) && ((List) this.backStack.d()).lastIndexOf(navBackStackEntry2) < ((List) this.backStack.d()).lastIndexOf(navBackStackEntry)) {
                break;
            }
        }
        NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) objPrevious;
        if (navBackStackEntry3 != null) {
            bn<Set<NavBackStackEntry>> bnVar2 = this._transitionsInProgress;
            bnVar2.e(a.w((Set) bnVar2.d(), navBackStackEntry3));
        }
        pop(navBackStackEntry, z);
    }

    public void prepareForTransition(NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "entry");
        this._transitionsInProgress.e(a.w((Set) this._transitionsInProgress.d(), navBackStackEntry));
    }

    public void push(NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "backStackEntry");
        synchronized (this.backStackLock) {
            this._backStack.e(i.ag((Collection) this._backStack.d(), navBackStackEntry));
        }
    }

    public void pushWithTransition(NavBackStackEntry navBackStackEntry) {
        x.f(navBackStackEntry, "backStackEntry");
        Iterable iterable = (Iterable) this._transitionsInProgress.d();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((NavBackStackEntry) it.next()) == navBackStackEntry) {
                    Iterable iterable2 = (Iterable) this.backStack.d();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((NavBackStackEntry) it2.next()) == navBackStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) i.U((List) this.backStack.d());
        if (navBackStackEntry2 != null) {
            bn<Set<NavBackStackEntry>> bnVar = this._transitionsInProgress;
            bnVar.e(a.w((Set) bnVar.d(), navBackStackEntry2));
        }
        bn<Set<NavBackStackEntry>> bnVar2 = this._transitionsInProgress;
        bnVar2.e(a.w((Set) bnVar2.d(), navBackStackEntry));
        push(navBackStackEntry);
    }

    public final void setNavigating(boolean z) {
        this.isNavigating = z;
    }
}
