package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class cj extends defpackage.ck {
    private static boolean A(android.transition.Transition transition) {
        return (x(transition.getTargetIds()) && x(transition.getTargetNames()) && x(transition.getTargetTypes())) ? false : true;
    }

    @Override // defpackage.ck
    public final java.lang.Object a(java.lang.Object obj) {
        if (obj != null) {
            return ((android.transition.Transition) obj).clone();
        }
        return null;
    }

    @Override // defpackage.ck
    public final java.lang.Object b(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.transition.Transition ordering = (android.transition.Transition) obj;
        android.transition.Transition transition = (android.transition.Transition) obj2;
        android.transition.Transition transition2 = (android.transition.Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new android.transition.TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // defpackage.ck
    public final java.lang.Object c(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        transitionSet.addTransition((android.transition.Transition) obj);
        return transitionSet;
    }

    @Override // defpackage.ck
    public final void d(java.lang.Object obj, android.view.View view) {
        ((android.transition.Transition) obj).addTarget(view);
    }

    @Override // defpackage.ck
    public final void e(java.lang.Object obj, java.util.ArrayList arrayList) {
        android.transition.Transition transition = (android.transition.Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                e(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (A(transition) || !x(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((android.view.View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.ck
    public final void f(android.view.ViewGroup viewGroup, java.lang.Object obj) {
        android.transition.TransitionManager.beginDelayedTransition(viewGroup, (android.transition.Transition) obj);
    }

    public final void g(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        java.util.List<android.view.View> targets;
        android.transition.Transition transition = (android.transition.Transition) obj;
        int i = 0;
        if (transition instanceof android.transition.TransitionSet) {
            android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                g(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((android.view.View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((android.view.View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.ck
    public final void h(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        ((android.transition.Transition) obj).addListener(new defpackage.cf(view, arrayList));
    }

    @Override // defpackage.ck
    public final void i(java.lang.Object obj, android.graphics.Rect rect) {
        ((android.transition.Transition) obj).setEpicenterCallback(new defpackage.ci(rect));
    }

    @Override // defpackage.ck
    public final void j(java.lang.Object obj, android.view.View view) {
        if (view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            y(view, rect);
            ((android.transition.Transition) obj).setEpicenterCallback(new defpackage.ce(rect));
        }
    }

    @Override // defpackage.ck
    public final void k(java.lang.Object obj, android.view.View view, java.util.ArrayList arrayList) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        java.util.List<android.view.View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(targets, (android.view.View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        e(transitionSet, arrayList);
    }

    @Override // defpackage.ck
    public final void l(java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        android.transition.TransitionSet transitionSet = (android.transition.TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            g(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // defpackage.ck
    public final boolean m(java.lang.Object obj) {
        return obj instanceof android.transition.Transition;
    }

    @Override // defpackage.ck
    public final boolean n() {
        if (!defpackage.bt.ac(4)) {
            return false;
        }
        android.util.Log.i("FragmentManager", "Predictive back not available using Framework Transitions. Please switch to AndroidX Transition 1.5.0 or higher to enable seeking.");
        return false;
    }

    @Override // defpackage.ck
    public final boolean o(java.lang.Object obj) {
        if (!defpackage.bt.ac(2)) {
            return false;
        }
        android.util.Log.v("FragmentManager", defpackage.a.bl(obj, "Predictive back not available for framework transition ", ". Please switch to AndroidX Transition 1.5.0 or higher to enable seeking."));
        return false;
    }

    @Override // defpackage.ck
    public final java.lang.Object p(java.lang.Object obj, java.lang.Object obj2) {
        android.transition.TransitionSet transitionSet = new android.transition.TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((android.transition.Transition) obj);
        }
        transitionSet.addTransition((android.transition.Transition) obj2);
        return transitionSet;
    }

    @Override // defpackage.ck
    public final void q(java.lang.Object obj, java.lang.Object obj2, java.util.ArrayList arrayList, java.lang.Object obj3, java.util.ArrayList arrayList2) {
        ((android.transition.Transition) obj).addListener(new defpackage.cg(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.ck
    public final void r(java.lang.Object obj, defpackage.dwd dwdVar, java.lang.Runnable runnable) {
        ((android.transition.Transition) obj).addListener(new defpackage.ch(runnable));
    }
}
