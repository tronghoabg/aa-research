package defpackage;

import java.util.Deque;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class tvk extends tur {
    private final float e;

    public tvk(tuy tuyVar, float f, float f2, float f3) {
        super(tuyVar, f, f2);
        this.e = f3 * f3;
    }

    @Override // defpackage.tur
    protected final void b(tvc tvcVar) {
        this.a.l(tvcVar, true);
    }

    @Override // defpackage.tur
    protected final boolean c(tvc tvcVar) {
        return this.a.s(tvcVar, true);
    }

    @Override // defpackage.tur
    public final boolean d() {
        return true;
    }

    @Override // defpackage.tur
    public final boolean e() {
        return true;
    }

    @Override // defpackage.tur
    public final boolean f() {
        return true;
    }

    @Override // defpackage.tur
    protected final boolean g(tvc tvcVar) {
        return this.a.r(tvcVar, true);
    }

    @Override // defpackage.tur
    public final int h(long j, Deque deque, List list) {
        tuw tuwVar;
        tuw tuwVar2;
        Iterator it = deque.iterator();
        while (true) {
            tuwVar = null;
            if (!it.hasNext()) {
                tuwVar2 = null;
                break;
            }
            tuwVar2 = (tuw) it.next();
            if (tuwVar2.d == 2) {
                break;
            }
        }
        Iterator itDescendingIterator = deque.descendingIterator();
        while (true) {
            if (!itDescendingIterator.hasNext()) {
                break;
            }
            tuw tuwVar3 = (tuw) itDescendingIterator.next();
            if (tuwVar3.d == 2) {
                tuwVar = tuwVar3;
                break;
            }
        }
        if (tuwVar2 == null || tuwVar == null || tuwVar.c - j > 300) {
            return 1;
        }
        float fB = tuwVar.b(0) - tuwVar2.b(0);
        float fC = tuwVar.c(0) - tuwVar2.c(0);
        float fB2 = tuwVar.b(1) - tuwVar2.b(1);
        float fC2 = tuwVar.c(1) - tuwVar2.c(1);
        return Math.max((fB * fB) + (fC * fC), (fB2 * fB2) + (fC2 * fC2)) > this.e ? 1 : 3;
    }
}
