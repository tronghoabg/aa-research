package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.car.CarWindowLayoutParams;
import com.google.android.gms.car.KeyEventCompleteData;
import com.google.android.gms.car.TouchEventCompleteData;
import com.google.android.gms.car.animation.ProjectionWindowAnimationParams;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class qyy extends ijo implements qyz {
    private final WeakReference a;

    public qyy(jgy jgyVar) {
        super("com.google.android.gms.car.ICarWindow");
        this.a = new WeakReference(jgyVar);
    }

    private final String a() {
        jgt jgtVar = (jgt) this.a.get();
        return jgtVar != null ? jgtVar.a() : "(null)";
    }

    private final void b(KeyEventCompleteData keyEventCompleteData) {
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new ino(jgyVar, keyEventCompleteData, 12));
        } else {
            ((ype) ((ype) jgy.a.h()).ai((char) 2049)).u("onKeyEventCompleteInternal unable to run, window no longer exists");
        }
    }

    private final void c(TouchEventCompleteData touchEventCompleteData) {
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new ino(jgyVar, touchEventCompleteData, 16));
        } else {
            ((ype) ((ype) jgy.a.h()).ai((char) 2052)).u("unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void e(boolean z) {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai(2042)).N("Binder:%s.hideWindow(%b)", a(), z);
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new jgv(jgyVar, z, 2));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2043)).u("hideWindow unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void f(ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai(2044)).M("Binder:%s.hideWindow(%s)", a(), projectionWindowAnimationParams);
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new ino(jgyVar, projectionWindowAnimationParams, 15));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2045)).u("hideWindowWithAnimation unable to run, window no longer exists");
        }
    }

    @Override // defpackage.ijo
    protected final boolean fm(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        boolean z;
        switch (i) {
            case 1:
                j();
                break;
            case 2:
                int i2 = parcel.readInt();
                ijp.d(parcel);
                yph yphVar = jgy.a;
                a();
                c(new TouchEventCompleteData(i2, null, -1));
                break;
            case 3:
                ClassLoader classLoader = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                yph yphVar2 = jgy.a;
                a();
                b(new KeyEventCompleteData(z, null));
                break;
            case 4:
                k();
                break;
            case 5:
                i();
                break;
            case 6:
                TouchEventCompleteData touchEventCompleteData = (TouchEventCompleteData) ijp.a(parcel, TouchEventCompleteData.CREATOR);
                ijp.d(parcel);
                h(touchEventCompleteData);
                break;
            case 7:
                CarWindowLayoutParams carWindowLayoutParams = (CarWindowLayoutParams) ijp.a(parcel, CarWindowLayoutParams.CREATOR);
                ijp.d(parcel);
                yph yphVar3 = jgy.a;
                ((ype) yphVar3.l().ai(2075)).M("Binder:%s.updateLayoutParams(%s)", a(), carWindowLayoutParams);
                jgy jgyVar = (jgy) this.a.get();
                if (jgyVar == null) {
                    ((ype) ((ype) yphVar3.h()).ai((char) 2076)).u("updateLayoutParams unable to run, window no longer exists");
                    break;
                } else {
                    new sss(Looper.getMainLooper()).post(new ino(jgyVar, carWindowLayoutParams, 13));
                    break;
                }
            case 8:
                m();
                break;
            case 9:
                Rect rect = (Rect) ijp.a(parcel, Rect.CREATOR);
                ijp.d(parcel);
                t(rect);
                break;
            case 10:
                ClassLoader classLoader2 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                e(z);
                break;
            case 11:
                ClassLoader classLoader3 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                q(z);
                break;
            case 12:
                ProjectionWindowAnimationParams projectionWindowAnimationParams = (ProjectionWindowAnimationParams) ijp.a(parcel, ProjectionWindowAnimationParams.CREATOR);
                ijp.d(parcel);
                f(projectionWindowAnimationParams);
                break;
            case 13:
                KeyEventCompleteData keyEventCompleteData = (KeyEventCompleteData) ijp.a(parcel, KeyEventCompleteData.CREATOR);
                ijp.d(parcel);
                g(keyEventCompleteData);
                break;
            case 14:
                ProjectionWindowAnimationParams projectionWindowAnimationParams2 = (ProjectionWindowAnimationParams) ijp.a(parcel, ProjectionWindowAnimationParams.CREATOR);
                ijp.d(parcel);
                r(projectionWindowAnimationParams2);
                break;
            case 15:
                ClassLoader classLoader4 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                s(z);
                break;
            case 16:
                int i3 = parcel.readInt();
                ClassLoader classLoader5 = ijp.a;
                z = parcel.readInt() != 0;
                ProjectionWindowAnimationParams projectionWindowAnimationParams3 = (ProjectionWindowAnimationParams) ijp.a(parcel, ProjectionWindowAnimationParams.CREATOR);
                ijp.d(parcel);
                l(i3, z, projectionWindowAnimationParams3);
                break;
            case 17:
                Bundle bundle = (Bundle) ijp.a(parcel, Bundle.CREATOR);
                ijp.d(parcel);
                o(bundle);
                break;
            case 18:
                p();
                break;
            case 19:
                ClassLoader classLoader6 = ijp.a;
                z = parcel.readInt() != 0;
                ijp.d(parcel);
                n(z);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.qyz
    public final void g(KeyEventCompleteData keyEventCompleteData) throws RemoteException {
        yph yphVar = jgy.a;
        a();
        b(keyEventCompleteData);
    }

    @Override // defpackage.qyz
    public final void h(TouchEventCompleteData touchEventCompleteData) throws RemoteException {
        yph yphVar = jgy.a;
        a();
        c(touchEventCompleteData);
    }

    @Override // defpackage.qyz
    public final void i() throws RemoteException {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai((char) 2053)).y("Binder:%s.onSurfaceReleased()", a());
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            jgyVar.h.aT();
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2054)).u("onSurfaceReleased unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void j() throws RemoteException {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai((char) 2055)).y("Binder:%s.onWindowAttachComplete()", a());
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 2056)).u("onWindowAttachComplete unable to run, window no longer exists");
        } else {
            new sss(Looper.getMainLooper()).post(new jgw(jgyVar, 0));
        }
    }

    @Override // defpackage.qyz
    public final void k() throws RemoteException {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai((char) 2057)).y("Binder:%s.removeWindow()", a());
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new jgu(jgyVar, 4));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2058)).u("removeWindow unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void l(int i, boolean z, ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai(2059)).S("Binder:%s.requestDragChange(%s, %s, %s)", a(), Integer.valueOf(i), Boolean.valueOf(z), projectionWindowAnimationParams);
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new rak(jgyVar, i, z, projectionWindowAnimationParams, 1));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2060)).u("requestDragChange unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void m() {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai((char) 2061)).y("Binder: %s.requestFocus()", a());
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new jgu(jgyVar, 2));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2062)).u("requestFocus unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void n(boolean z) {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai(2063)).N("Binder:%s.setOverlayVisible(%s)", a(), z);
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new jgv(jgyVar, z, 4));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2064)).u("setOverlayVisible unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void o(Bundle bundle) throws RemoteException {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai((char) 2065)).y("Binder:%s.setSurfacePackage()", a());
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 2066)).u("setSurfacePackage unable to run, window no longer exists");
        } else {
            rbe.h(new ino(jgyVar, bundle, 18, null));
        }
    }

    @Override // defpackage.qyz
    public final void p() {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai((char) 2067)).y("Binder:%s.showTransient()", a());
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new jgu(jgyVar, 3));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2068)).u("showTransient unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void q(boolean z) {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai(2069)).N("Binder:%s.showWindow(%b)", a(), z);
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new jgv(jgyVar, z, 0));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2070)).u("showWindow unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void r(ProjectionWindowAnimationParams projectionWindowAnimationParams) {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai(2071)).M("Binder:%s.showWindow(%s)", a(), projectionWindowAnimationParams);
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new ino(jgyVar, projectionWindowAnimationParams, 17));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2072)).u("showWindowWithAnimation unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void s(boolean z) {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai(2073)).N("Binder:%s.updateCriticalUiState(%s)", a(), z);
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new jgv(jgyVar, z, 3));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2074)).u("updateCriticalUiState unable to run, window no longer exists");
        }
    }

    @Override // defpackage.qyz
    public final void t(Rect rect) {
        yph yphVar = jgy.a;
        ((ype) yphVar.l().ai(2077)).M("Binder:%s.updateWindowInsets(%s)", a(), rect);
        jgy jgyVar = (jgy) this.a.get();
        if (jgyVar != null) {
            rbe.h(new ino(jgyVar, rect, 14, null));
        } else {
            ((ype) ((ype) yphVar.h()).ai((char) 2078)).u("updateWindowInsets unable to run, window no longer exists");
        }
    }
}
