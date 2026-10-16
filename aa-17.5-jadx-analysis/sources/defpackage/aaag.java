package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.maps.model.RuntimeRemoteException;

/* loaded from: classes3.dex */
public final class aaag extends GestureDetector.SimpleOnGestureListener implements zze {
    private final aaac a;
    private final aaah b;
    private final aaaf c;

    public aaag(aaac aaacVar, aaah aaahVar, aaaf aaafVar) {
        this.a = aaacVar;
        this.b = aaahVar;
        this.c = aaafVar;
    }

    @Override // defpackage.zze
    public final boolean c(zzg zzgVar) {
        return false;
    }

    @Override // defpackage.zze
    public final boolean d(zzi zziVar) {
        return false;
    }

    @Override // defpackage.zze
    public final boolean e(zzl zzlVar) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        vgs vgsVar;
        aaah aaahVar = this.b;
        if (aaahVar.q(motionEvent.getX(), motionEvent.getY())) {
            zwv zwvVar = aaahVar.e;
            zwvVar.b.h(zwvVar);
            return;
        }
        aaac aaacVar = this.a;
        aaao aaaoVar = aaacVar.d;
        if (aaaoVar == null || (vgsVar = aaacVar.f) == null) {
            return;
        }
        try {
            vgsVar.e(aaaoVar.b(new Point((int) motionEvent.getX(), (int) motionEvent.getY())));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        zxa zxaVar;
        aaah aaahVar = this.b;
        if (aaahVar.q(motionEvent.getX(), motionEvent.getY())) {
            zwv zwvVar = aaahVar.e;
            zwvVar.b.f(zwvVar);
            return true;
        }
        aaahVar.k();
        aaaf aaafVar = this.c;
        if (aaafVar.a && aaafVar.c != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (aaafVar.g != null && Math.pow(x - r4.x, 2.0d) + Math.pow(y - aaafVar.g.y, 2.0d) < Math.pow(aaafVar.h + 10.0f, 2.0d) && (zxaVar = aaafVar.f) != null && zxaVar.g()) {
                return true;
            }
        }
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        zwv zwvVarA = aaahVar.d.a(aaahVar.b, x2, y2);
        if (zwvVarA != null && zwvVarA.isVisible()) {
            Rect rectK = zwvVarA.k();
            Rect rect = new Rect(rectK.left - 10, rectK.top - 10, rectK.right + 10, rectK.bottom + 10);
            if (x2 >= rect.left && x2 <= rect.right && y2 >= rect.top && y2 <= rect.bottom) {
                zwvVarA.b.r(zwvVarA);
                return true;
            }
        }
        if (aaahVar.o(x2, y2)) {
            return true;
        }
        return this.a.ab(motionEvent);
    }

    @Override // defpackage.zze
    public final void a() {
    }

    @Override // defpackage.zze
    public final void b() {
    }

    @Override // defpackage.zze
    public final void f() {
    }
}
