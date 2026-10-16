package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tvf extends tur {
    private static final float e;
    private static final float f;

    static {
        float radians = (float) Math.toRadians(5.0d);
        e = radians;
        f = radians + radians;
    }

    @Override // defpackage.tur
    protected final void b(tvc tvcVar) {
        this.a.k(tvcVar);
    }

    @Override // defpackage.tur
    protected final boolean c(tvc tvcVar) {
        return this.a.q(tvcVar);
    }

    @Override // defpackage.tur
    protected final boolean g(tvc tvcVar) {
        return this.a.p(tvcVar);
    }

    @Override // defpackage.tur
    public final int h(long j, Deque deque, List list) {
        tuw tuwVar;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((tur) list.get(i)).e()) {
                return 1;
            }
        }
        if (deque.size() < 3) {
            return 2;
        }
        Iterator it = deque.iterator();
        while (true) {
            if (!it.hasNext()) {
                tuwVar = null;
                break;
            }
            tuwVar = (tuw) it.next();
            if (tuwVar.d > 1) {
                break;
            }
        }
        tuw tuwVar2 = (tuw) deque.getLast();
        if (tuwVar == null || tuwVar2.d <= 1) {
            return 1;
        }
        float f2 = list.isEmpty() ? e : f;
        float fAbs = Math.abs(a.I(tuwVar.a, tuwVar2.a));
        if (fAbs < f2) {
            return 1;
        }
        float f3 = (this.c + this.d) * 0.5f;
        float f4 = tuwVar2.b / f3;
        if (f4 < 0.75f) {
            return 1;
        }
        float fAbs2 = Math.abs(f4 - (tuwVar.b / f3));
        if (fAbs2 != BitmapDescriptorFactory.HUE_RED) {
            float f5 = fAbs / fAbs2;
            if (f5 < 0.5f) {
                return 1;
            }
            if (f5 < 0.9f) {
                return 2;
            }
        }
        return 3;
    }
}
