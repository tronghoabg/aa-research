package defpackage;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.text.DecimalFormat;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class geg extends GestureDetector.SimpleOnGestureListener {
    public final geu a;
    public final long b;
    public long c;
    private final DecimalFormat d = new DecimalFormat("#.##");
    private final Deque e = new ArrayDeque();
    private long f;
    private float g;
    private float h;
    private boolean i;
    private boolean j;

    public geg(geu geuVar, long j) {
        this.a = geuVar;
        this.b = j;
    }

    private final void c(String str) {
        Deque deque = this.e;
        if (deque.size() >= 3) {
            deque.removeFirst();
        }
        deque.addLast(str);
        StringBuilder sb = new StringBuilder();
        Iterator it = deque.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append("\n");
        }
        sb.setLength(sb.length() - 1);
        this.a.e().b("Gesture", sb.toString());
    }

    public final void a(gep gepVar) {
        if (gepVar.h) {
            float f = gepVar.a;
            float f2 = gepVar.b;
            float f3 = 1.0f;
            if (gepVar.a()) {
                boolean z = true;
                if (!gepVar.o ? gepVar.e <= gepVar.f : gepVar.e >= gepVar.f) {
                    z = false;
                }
                float fAbs = Math.abs(1.0f - (gepVar.e / gepVar.f)) * 0.5f;
                if (gepVar.f > gepVar.i) {
                    f3 = z ? 1.0f + fAbs : 1.0f - fAbs;
                }
            } else {
                float f4 = gepVar.f;
                if (f4 > BitmapDescriptorFactory.HUE_RED) {
                    f3 = gepVar.e / f4;
                }
            }
            geu geuVar = this.a;
            geuVar.h().c(f, f2, f3);
            if (((gdy) geuVar.e()).l) {
                DecimalFormat decimalFormat = this.d;
                c("scale focus [X: " + decimalFormat.format(f) + ", Y: " + decimalFormat.format(f2) + "], factor [" + decimalFormat.format(f3) + "]");
            }
        }
    }

    public final void b(gep gepVar) {
        a(gepVar);
        this.i = true;
        this.a.k().d(gnr.a(18));
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        geu geuVar = this.a;
        ges gesVarH = geuVar.h();
        if (!gesVarH.e()) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getSource() == 1048584) {
            Object obj = geuVar.C().b;
            if (obj != null) {
                Rect rect = (Rect) obj;
                x = rect.centerX();
                y = rect.centerY();
            } else {
                x = -1.0f;
                y = -1.0f;
            }
        }
        gesVarH.c(x, y, 2.0f);
        if (((gdy) geuVar.e()).l) {
            DecimalFormat decimalFormat = this.d;
            c("scale focus [X: " + decimalFormat.format(x) + ", Y: " + decimalFormat.format(y) + "], factor [2.0]");
        }
        geuVar.k().d(gnr.a(18));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        gks.b("CarApp.H.Tem", "Down touch event detected");
        this.j = false;
        this.g = BitmapDescriptorFactory.HUE_RED;
        this.h = BitmapDescriptorFactory.HUE_RED;
        return super.onDown(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.i) {
            this.i = false;
            return true;
        }
        geu geuVar = this.a;
        geuVar.h().b(f, f2);
        if (((gdy) geuVar.e()).l) {
            DecimalFormat decimalFormat = this.d;
            c("fling velocity [X: " + decimalFormat.format(f) + ", Y: " + decimalFormat.format(f2) + "]");
        }
        geuVar.k().d(gnr.a(17));
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (!this.j) {
            geu geuVar = this.a;
            if (!geuVar.h().e()) {
                this.g = BitmapDescriptorFactory.HUE_RED;
                this.h = BitmapDescriptorFactory.HUE_RED;
                return true;
            }
            this.j = true;
            geuVar.k().d(gnr.a(15));
        }
        this.g += f;
        this.h += f2;
        if (jUptimeMillis - this.f > this.b) {
            geu geuVar2 = this.a;
            geuVar2.h().d(this.g, this.h);
            this.f = jUptimeMillis;
            this.g = BitmapDescriptorFactory.HUE_RED;
            this.h = BitmapDescriptorFactory.HUE_RED;
            if (((gdy) geuVar2.e()).l) {
                DecimalFormat decimalFormat = this.d;
                c("scroll distance [X: " + decimalFormat.format(f) + ", Y: " + decimalFormat.format(f2) + "]");
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        geu geuVar = this.a;
        ges gesVarH = geuVar.h();
        if (!gesVarH.e()) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        gesVarH.a(x, y);
        if (!((gdy) geuVar.e()).l) {
            return true;
        }
        DecimalFormat decimalFormat = this.d;
        double d = y;
        c("click [X: " + decimalFormat.format(x) + ", Y: " + decimalFormat.format(d) + "]");
        return true;
    }
}
