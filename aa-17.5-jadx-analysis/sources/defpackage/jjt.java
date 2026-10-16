package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.RemoteException;
import com.google.android.gms.car.GestureDirection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class jjt implements jjs {
    private static final yph a = yph.c("CAR.EdgeGestDetect");
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private int c;
    private int d;
    private long e;
    private int f;
    private GestureDirection g;
    private iuw h;

    private final int e() {
        iuw iuwVar = this.h;
        if (iuwVar != null) {
            return (int) dlz.F(100, iuwVar.i);
        }
        return 100;
    }

    private final int f() {
        iuw iuwVar = this.h;
        if (iuwVar != null) {
            return (int) dlz.F(30, iuwVar.i);
        }
        return 30;
    }

    private final int g(Point point) {
        return point.x - this.c;
    }

    private final int h(Point point) {
        return point.y - this.d;
    }

    private static final boolean i(int i, int i2) {
        return (i & i2) != 0;
    }

    @Override // defpackage.jjs
    public final void a(iuw iuwVar) {
        this.h = iuwVar;
    }

    @Override // defpackage.jjs
    public final void b(long j, int i, List list) {
        iuw iuwVar;
        list.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList.isEmpty() || list.isEmpty() || (iuwVar = this.h) == null) {
            return;
        }
        if (i == 0 || this.f != 0) {
            int i2 = 0;
            iyd iydVar = (iyd) list.get(0);
            int i3 = iydVar.e;
            Rect rect = iuwVar.n;
            Point point = new Point(i3 - rect.left, iydVar.f - rect.top);
            GestureDirection gestureDirection = null;
            if (i == 0) {
                this.c = point.x;
                this.d = point.y;
                this.e = j;
                this.g = null;
                if (point.y < e()) {
                    i2 = 4;
                } else {
                    int i4 = point.y;
                    iuw iuwVar2 = this.h;
                    if (iuwVar2 != null) {
                        int i5 = iuwVar2.f;
                        Rect rect2 = iuwVar2.n;
                        if (i4 > ((i5 - rect2.top) - rect2.bottom) - e()) {
                            i2 = 16;
                        }
                    }
                }
                if (point.x < e()) {
                    i2 |= 2;
                } else {
                    int i6 = point.x;
                    iuw iuwVar3 = this.h;
                    if (iuwVar3 != null) {
                        int i7 = iuwVar3.e;
                        Rect rect3 = iuwVar3.n;
                        if (i6 > ((i7 - rect3.right) - rect3.left) - e()) {
                            i2 |= 8;
                        }
                    }
                }
                this.f = i2;
                return;
            }
            if (i != 2) {
                return;
            }
            if (j - this.e > 500) {
                this.f = 0;
                return;
            }
            if (i(this.f, 16) && (-h(point)) > f()) {
                gestureDirection = GestureDirection.c;
            } else if (i(this.f, 4) && h(point) > f()) {
                gestureDirection = GestureDirection.d;
            } else if (i(this.f, 8) && (-g(point)) > f()) {
                gestureDirection = GestureDirection.a;
            } else if (i(this.f, 2) && g(point) > f()) {
                gestureDirection = GestureDirection.b;
            }
            if (gestureDirection == null || affa.f(gestureDirection, this.g)) {
                return;
            }
            this.g = gestureDirection;
            a.l().y("Sending swipe %s to listeners", gestureDirection);
            Iterator it = copyOnWriteArrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                qwo qwoVar = (qwo) next;
                try {
                    qwoVar.e(gestureDirection);
                } catch (RemoteException unused) {
                    this.b.remove(qwoVar);
                }
            }
        }
    }

    @Override // defpackage.jjs
    public final void c(qwo qwoVar) {
        qwoVar.getClass();
        yph yphVar = a;
        yphVar.l().y("Registering gesture listener %s", qwoVar);
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        if (copyOnWriteArrayList.isEmpty()) {
            ((ype) yphVar.f()).u("Starting to watch for gestures");
        }
        copyOnWriteArrayList.add(qwoVar);
    }

    @Override // defpackage.jjs
    public final void d(qwo qwoVar) {
        qwo qwoVar2;
        qwoVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                qwoVar2 = null;
                break;
            }
            Object next = it.next();
            next.getClass();
            qwoVar2 = (qwo) next;
            if (qwoVar2.asBinder().equals(qwoVar.asBinder())) {
                break;
            }
        }
        if (qwoVar2 != null) {
            a.l().y("Unregistering gesture listener %s", qwoVar2);
            copyOnWriteArrayList.remove(qwoVar2);
        }
        if (copyOnWriteArrayList.isEmpty()) {
            ((ype) a.f()).u("Stop watching for gestures");
        }
    }
}
