package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class wkd extends bx {
    public final List e;
    public final Integer f;
    public final whc g;
    private yfy h;

    public wkd(bt btVar, abyn abynVar, Integer num, boolean z, boolean z2, whc whcVar, int i) {
        super(btVar);
        ArrayList arrayList = new ArrayList(abynVar.g.size());
        for (abyt abytVar : abynVar.g) {
            int iAx = a.ax(abytVar.i);
            int i2 = (iAx == 0 ? 1 : iAx) - 2;
            if (i2 == 1) {
                arrayList.add(new wjn(abytVar));
            } else if (i2 == 2) {
                arrayList.add(new wij(abytVar));
            } else if (i2 == 3) {
                arrayList.add(new wjc(abytVar));
            } else if (i2 == 4) {
                arrayList.add(new wir(abytVar));
            }
        }
        wox woxVar = wia.c;
        if (!wia.c(adic.c(wia.b))) {
            abxu abxuVar = abynVar.d;
            arrayList.add(new wkg(abxuVar == null ? abxu.b : abxuVar));
        } else if (whcVar == whc.a) {
            abxu abxuVar2 = abynVar.d;
            arrayList.add(new wkg(abxuVar2 == null ? abxu.b : abxuVar2));
        }
        this.e = arrayList;
        int i3 = 0;
        if (z && !arrayList.isEmpty()) {
            arrayList.remove(0);
            i--;
        }
        if (wia.a() && i > 0) {
            arrayList.subList(0, i).clear();
        }
        if (z2 && !arrayList.isEmpty()) {
            arrayList.subList(0, arrayList.size() - 1).clear();
        }
        yfu yfuVar = new yfu(4);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int i4 = ((wjz) it.next()).b;
            if (i4 == 0) {
                throw null;
            }
            if (i4 != 5) {
                yfuVar.e(Integer.valueOf(r10.a.e - 1), Integer.valueOf(i3));
                i3++;
            }
        }
        this.h = yfuVar.d(true);
        if (this.e.isEmpty()) {
            throw new NullPointerException("Questions were missing!");
        }
        this.f = num;
        this.g = whcVar;
    }

    public static int g(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        if (arguments != null) {
            return arguments.getInt("QuestionIndex", -1);
        }
        return -1;
    }

    @Override // defpackage.fhy
    public final int e() {
        return this.e.size();
    }

    public final int h(int i) {
        return ((Integer) this.h.get(Integer.valueOf(i))).intValue();
    }

    public final abyt i(int i) {
        return ((wjz) this.e.get(i)).a;
    }
}
