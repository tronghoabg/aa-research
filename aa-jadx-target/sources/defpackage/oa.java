package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class oa implements defpackage.eqe {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ oa(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        android.view.Window window;
        android.view.View viewPeekDecorView;
        android.view.View view;
        int iNextIndex;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                if (epwVar != defpackage.epw.ON_STOP || (window = ((defpackage.od) this.a).getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
                    return;
                }
                viewPeekDecorView.cancelPendingInputEvents();
                return;
            case 1:
                if (epwVar != defpackage.epw.ON_STOP || (view = ((android.support.v4.app.Fragment) this.a).mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                if (epwVar == defpackage.epw.ON_DESTROY) {
                    defpackage.od odVar = (defpackage.od) this.a;
                    odVar.g.b();
                    if (!odVar.isChangingConfigurations()) {
                        odVar.getViewModelStore().a();
                    }
                    defpackage.ob obVar = odVar.l;
                    defpackage.od odVar2 = obVar.b;
                    odVar2.getWindow().getDecorView().removeCallbacks(obVar);
                    odVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(obVar);
                    return;
                }
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj = this.a;
                ((defpackage.od) obj).v();
                ((defpackage.cs) obj).f.d(this);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                if (epwVar == defpackage.epw.ON_DESTROY) {
                    ((defpackage.czl) this.a).e();
                    return;
                }
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                if (epwVar != defpackage.epw.ON_CREATE) {
                    java.util.Objects.toString(epwVar);
                    throw new java.lang.IllegalStateException("Next event must be ON_CREATE, it was ".concat(epwVar.toString()));
                }
                eqgVar.getLifecycle().d(this);
                ((defpackage.erj) ((defpackage.afgv) this.a).a).c();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int iOrdinal = epwVar.ordinal();
                if (iOrdinal == 0) {
                    defpackage.ao aoVar = (defpackage.ao) eqgVar;
                    java.lang.Iterable iterable = (java.lang.Iterable) ((defpackage.evv) this.a).f().d.b();
                    if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
                        java.util.Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (defpackage.afga.f(((defpackage.euw) it.next()).c, aoVar.getTag())) {
                                return;
                            }
                        }
                    }
                    aoVar.c();
                    return;
                }
                java.lang.Object obj2 = null;
                if (iOrdinal == 2) {
                    defpackage.ao aoVar2 = (defpackage.ao) eqgVar;
                    defpackage.evv evvVar = (defpackage.evv) this.a;
                    for (java.lang.Object obj3 : (java.lang.Iterable) evvVar.f().e.b()) {
                        if (defpackage.afga.f(((defpackage.euw) obj3).c, aoVar2.getTag())) {
                            obj2 = obj3;
                        }
                    }
                    defpackage.euw euwVar = (defpackage.euw) obj2;
                    if (euwVar != null) {
                        evvVar.f().c(euwVar);
                        return;
                    }
                    return;
                }
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        return;
                    }
                    defpackage.ao aoVar3 = (defpackage.ao) eqgVar;
                    defpackage.evv evvVar2 = (defpackage.evv) this.a;
                    for (java.lang.Object obj4 : (java.lang.Iterable) evvVar2.f().e.b()) {
                        if (defpackage.afga.f(((defpackage.euw) obj4).c, aoVar3.getTag())) {
                            obj2 = obj4;
                        }
                    }
                    defpackage.euw euwVar2 = (defpackage.euw) obj2;
                    if (euwVar2 != null) {
                        evvVar2.f().c(euwVar2);
                    }
                    aoVar3.getLifecycle().d(this);
                    return;
                }
                defpackage.ao aoVar4 = (defpackage.ao) eqgVar;
                if (aoVar4.b().isShowing()) {
                    return;
                }
                java.lang.Object obj5 = this.a;
                java.util.List list = (java.util.List) ((defpackage.evv) obj5).f().d.b();
                java.util.ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (defpackage.afga.f(((defpackage.euw) listIterator.previous()).c, aoVar4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                defpackage.euw euwVar3 = (defpackage.euw) defpackage.afga.aC(list, iNextIndex);
                if (!defpackage.afga.f(defpackage.afga.aF(list), euwVar3)) {
                    android.util.Log.i("DialogFragmentNavigator", defpackage.a.bl(aoVar4, "Dialog ", " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"));
                }
                if (euwVar3 != null) {
                    ((defpackage.ewh) obj5).k(iNextIndex, euwVar3, false);
                    return;
                }
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                java.lang.Object obj6 = this.a;
                if (epwVar == defpackage.epw.ON_START) {
                    ((defpackage.fbq) obj6).e = true;
                    return;
                } else {
                    if (epwVar == defpackage.epw.ON_STOP) {
                        ((defpackage.fbq) obj6).e = false;
                        return;
                    }
                    return;
                }
            default:
                java.lang.Object obj7 = this.a;
                if (epwVar != defpackage.epw.ON_RESUME) {
                    if (epwVar == defpackage.epw.ON_PAUSE) {
                        com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity = (com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity) obj7;
                        preflightPhoneWelcomeActivity.p.removeCallbacks(preflightPhoneWelcomeActivity.s);
                        return;
                    }
                    return;
                }
                defpackage.acwj acwjVar = defpackage.acwj.a;
                if (acwjVar.fF().x()) {
                    com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity2 = (com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity) obj7;
                    preflightPhoneWelcomeActivity2.sendBroadcast(new android.content.Intent("com.google.android.apps.auto.components.preflight.phone.RESTORE_PHONE_NOTIFICATION").setPackage(preflightPhoneWelcomeActivity2.getPackageName()));
                }
                int iD = (int) acwjVar.fF().d();
                if (iD > 0) {
                    com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity3 = (com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity) obj7;
                    preflightPhoneWelcomeActivity3.p.postDelayed(preflightPhoneWelcomeActivity3.s, iD);
                    return;
                }
                return;
        }
    }

    public oa(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
