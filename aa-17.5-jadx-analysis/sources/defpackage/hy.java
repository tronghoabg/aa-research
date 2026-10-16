package defpackage;

import android.graphics.Region;
import android.view.AttachedSurfaceControl;
import android.view.View;
import android.view.ViewTreeObserver;
import android.window.InputTransferToken;

/* loaded from: classes2.dex */
public final class hy implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.b;
        if (i == 0 || i == 1) {
            return;
        }
        if (i != 2) {
            if (i == 3) {
                view.getClass();
                ((mwu) this.a).d = ahni.c();
                return;
            }
            if (i == 4) {
                view.getViewTreeObserver().addOnWindowFocusChangeListener(((nwf) this.a).f);
                return;
            }
            if (i != 5) {
                ((wxa) this.a).e();
                return;
            }
            view.getClass();
            rou rouVar = (rou) this.a;
            rrd.d(3, "CAR.PROJECTION.SCVH", null, "[%s] decorView attached, setting empty touchable region", rouVar.a);
            AttachedSurfaceControl rootSurfaceControl = view.getRootSurfaceControl();
            if (rootSurfaceControl != null) {
                rootSurfaceControl.setTouchableRegion(new Region());
            }
            view.removeOnAttachStateChangeListener(this);
            rouVar.c = null;
            return;
        }
        view.getClass();
        yph yphVar = jja.a;
        ype ypeVar = (ype) yphVar.f();
        jja jjaVar = (jja) this.a;
        int i2 = jjaVar.b;
        ypeVar.w("onViewAttachedToWindow for window %d", i2);
        AttachedSurfaceControl rootSurfaceControl2 = jjaVar.getRootSurfaceControl();
        InputTransferToken inputTransferToken = rootSurfaceControl2 != null ? rootSurfaceControl2.getInputTransferToken() : null;
        if (inputTransferToken == null) {
            ((ype) yphVar.g()).w("Host token is null for window %d on attachment", i2);
            return;
        }
        jjf jjfVar = jjaVar.c;
        yph yphVar2 = jjd.a;
        ((ype) yphVar2.f()).D("Received host token for window %d: %s", i2, inputTransferToken);
        jjd jjdVar = (jjd) jjfVar;
        iph iphVar = jjdVar.b;
        if (iphVar == null) {
            ((ype) yphVar2.h()).u("Host token received but virtual display is torn down");
            return;
        }
        int displayId = iphVar.c().getDisplayId();
        if (displayId == -1) {
            throw new IllegalStateException("Virtual display ID must be valid");
        }
        ina inaVar = (ina) jjdVar.c.a;
        if (!inaVar.i) {
            throw new IllegalStateException("Host token dispatched but Strato feature is disabled");
        }
        yph yphVar3 = ina.a;
        ((ype) ((ype) yphVar3.f()).ai(532)).B("onHostTokenAvailable windowId: %d, virtualDisplayId: %d", i2, displayId);
        ims imsVar = inaVar.s;
        if (imsVar == null) {
            ((ype) ((ype) yphVar3.h()).ai((char) 533)).u("Composition handler is null, cannot deliver host token");
        } else {
            imsVar.d(i2, inputTransferToken, displayId);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.b;
        if (i == 0) {
            hz hzVar = (hz) this.a;
            ViewTreeObserver viewTreeObserver = hzVar.d;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    hzVar.d = view.getViewTreeObserver();
                }
                hzVar.d.removeGlobalOnLayoutListener(hzVar.b);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i == 1) {
            ha haVar = (ha) this.a;
            ViewTreeObserver viewTreeObserver2 = haVar.e;
            if (viewTreeObserver2 != null) {
                if (!viewTreeObserver2.isAlive()) {
                    haVar.e = view.getViewTreeObserver();
                }
                haVar.e.removeGlobalOnLayoutListener(haVar.c);
            }
            view.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i == 2) {
            view.getClass();
            ((ype) jja.a.f()).w("onViewDetachedFromWindow for window %d", ((jja) this.a).b);
            return;
        }
        if (i == 3) {
            view.getClass();
            aitx aitxVar = ((mwu) this.a).d;
            if (aitxVar == null) {
                affa.d("gestureCoroutineScope");
                aitxVar = null;
            }
            ahni.e(aitxVar, null);
            return;
        }
        if (i == 4) {
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(((nwf) this.a).f);
        } else if (i != 5) {
            ((wxa) this.a).i();
        } else {
            view.getClass();
        }
    }
}
