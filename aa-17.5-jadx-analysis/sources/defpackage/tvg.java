package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tvg extends tur {
    private static final float e = (float) Math.toRadians(10.0d);

    @Override // defpackage.tur
    protected final void b(tvc tvcVar) {
        this.a.l(tvcVar, false);
    }

    @Override // defpackage.tur
    protected final boolean c(tvc tvcVar) {
        return this.a.s(tvcVar, false);
    }

    @Override // defpackage.tur
    public final boolean e() {
        return true;
    }

    @Override // defpackage.tur
    protected final boolean g(tvc tvcVar) {
        return this.a.r(tvcVar, false);
    }

    @Override // defpackage.tur
    public final int h(long j, Deque deque, List list) {
        if (deque.size() < 3) {
            return 2;
        }
        tuw tuwVar = (tuw) deque.getLast();
        float f = tuwVar.a;
        Iterator itDescendingIterator = deque.descendingIterator();
        tuw tuwVar2 = tuwVar;
        while (itDescendingIterator.hasNext()) {
            tuw tuwVar3 = (tuw) itDescendingIterator.next();
            if (tuwVar3.d != tuwVar.d) {
                break;
            }
            if (Math.abs(a.I(f, tuwVar3.a)) > e) {
                return 1;
            }
            tuwVar2 = tuwVar3;
        }
        if (e < BitmapDescriptorFactory.HUE_RED) {
            return 1;
        }
        return Math.abs(tuwVar2.b - tuwVar.b) / ((this.c + this.d) * 0.5f) < (true != list.isEmpty() ? 0.2f : 0.1f) ? 2 : 3;
    }
}
