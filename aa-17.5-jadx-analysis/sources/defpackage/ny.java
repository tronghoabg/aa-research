package defpackage;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import android.view.Window;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhoneWelcomeActivity;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final /* synthetic */ class ny implements epy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ny(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.epy
    public final void a(eqa eqaVar, epr eprVar) {
        Window window;
        View viewPeekDecorView;
        View view;
        int iNextIndex;
        switch (this.b) {
            case 0:
                if (eprVar == epr.ON_STOP && (window = ((ob) this.a).getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                if (eprVar == epr.ON_STOP && (view = ((Fragment) this.a).mView) != null) {
                    view.cancelPendingInputEvents();
                    break;
                }
                break;
            case 2:
                if (eprVar == epr.ON_DESTROY) {
                    ob obVar = (ob) this.a;
                    obVar.g.b();
                    if (!obVar.isChangingConfigurations()) {
                        obVar.getViewModelStore().a();
                    }
                    nz nzVar = obVar.l;
                    ob obVar2 = nzVar.b;
                    obVar2.getWindow().getDecorView().removeCallbacks(nzVar);
                    obVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(nzVar);
                    break;
                }
                break;
            case 3:
                Object obj = this.a;
                ((ob) obj).v();
                ((cs) obj).f.d(this);
                break;
            case 4:
                if (eprVar == epr.ON_DESTROY) {
                    ((czd) this.a).e();
                    break;
                }
                break;
            case 5:
                int iOrdinal = eprVar.ordinal();
                if (iOrdinal == 0) {
                    ao aoVar = (ao) eqaVar;
                    Iterable iterable = (Iterable) ((evp) this.a).f().d.b();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            if (affa.f(((euq) it.next()).c, aoVar.getTag())) {
                                break;
                            }
                        }
                    }
                    aoVar.c();
                    break;
                } else {
                    Object obj2 = null;
                    if (iOrdinal == 2) {
                        ao aoVar2 = (ao) eqaVar;
                        evp evpVar = (evp) this.a;
                        for (Object obj3 : (Iterable) evpVar.f().e.b()) {
                            if (affa.f(((euq) obj3).c, aoVar2.getTag())) {
                                obj2 = obj3;
                            }
                        }
                        euq euqVar = (euq) obj2;
                        if (euqVar != null) {
                            evpVar.f().c(euqVar);
                            break;
                        }
                    } else if (iOrdinal == 4) {
                        ao aoVar3 = (ao) eqaVar;
                        if (!aoVar3.b().isShowing()) {
                            Object obj4 = this.a;
                            List list = (List) ((evp) obj4).f().d.b();
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (!listIterator.hasPrevious()) {
                                    iNextIndex = -1;
                                } else if (affa.f(((euq) listIterator.previous()).c, aoVar3.getTag())) {
                                    iNextIndex = listIterator.nextIndex();
                                }
                            }
                            euq euqVar2 = (euq) woy.bI(list, iNextIndex);
                            if (!affa.f(woy.bL(list), euqVar2)) {
                                Log.i("DialogFragmentNavigator", a.bm(aoVar3, "Dialog ", " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"));
                            }
                            if (euqVar2 != null) {
                                ((ewb) obj4).k(iNextIndex, euqVar2, false);
                                break;
                            }
                        }
                    } else if (iOrdinal == 5) {
                        ao aoVar4 = (ao) eqaVar;
                        evp evpVar2 = (evp) this.a;
                        for (Object obj5 : (Iterable) evpVar2.f().e.b()) {
                            if (affa.f(((euq) obj5).c, aoVar4.getTag())) {
                                obj2 = obj5;
                            }
                        }
                        euq euqVar3 = (euq) obj2;
                        if (euqVar3 != null) {
                            evpVar2.f().c(euqVar3);
                        }
                        aoVar4.getLifecycle().d(this);
                        break;
                    }
                }
                break;
            case 6:
                Object obj6 = this.a;
                if (eprVar == epr.ON_START) {
                    ((fbj) obj6).e = true;
                    break;
                } else if (eprVar == epr.ON_STOP) {
                    ((fbj) obj6).e = false;
                    break;
                }
                break;
            default:
                Object obj7 = this.a;
                if (eprVar == epr.ON_RESUME) {
                    acvh acvhVar = acvh.a;
                    if (acvhVar.gu().x()) {
                        PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity = (PreflightPhoneWelcomeActivity) obj7;
                        preflightPhoneWelcomeActivity.sendBroadcast(new Intent("com.google.android.apps.auto.components.preflight.phone.RESTORE_PHONE_NOTIFICATION").setPackage(preflightPhoneWelcomeActivity.getPackageName()));
                    }
                    int iD = (int) acvhVar.gu().d();
                    if (iD > 0) {
                        PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity2 = (PreflightPhoneWelcomeActivity) obj7;
                        preflightPhoneWelcomeActivity2.p.postDelayed(preflightPhoneWelcomeActivity2.s, iD);
                        break;
                    }
                } else if (eprVar == epr.ON_PAUSE) {
                    PreflightPhoneWelcomeActivity preflightPhoneWelcomeActivity3 = (PreflightPhoneWelcomeActivity) obj7;
                    preflightPhoneWelcomeActivity3.p.removeCallbacks(preflightPhoneWelcomeActivity3.s);
                    break;
                }
                break;
        }
    }

    public ny(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
