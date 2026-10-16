package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class dri {
    static int a;
    public final int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public dri(int i) {
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(doy doyVar, int i) {
        int iO;
        int iO2;
        ArrayList arrayList = this.b;
        if (arrayList.size() == 0) {
            return 0;
        }
        dqo dqoVar = (dqo) ((dqn) arrayList.get(0)).ae;
        doyVar.k();
        dqoVar.a(doyVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((dqn) arrayList.get(i2)).a(doyVar, false);
        }
        if (i == 0 && dqoVar.h > 0) {
            dsg.v(dqoVar, doyVar, arrayList, 0);
        }
        if (i == 1 && dqoVar.i > 0) {
            dsg.v(dqoVar, doyVar, arrayList, 1);
        }
        try {
            doyVar.j();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new cdj((dqn) arrayList.get(i3)));
        }
        if (i == 0) {
            iO = doy.o(dqoVar.T);
            iO2 = doy.o(dqoVar.V);
            doyVar.k();
        } else {
            iO = doy.o(dqoVar.U);
            iO2 = doy.o(dqoVar.W);
            doyVar.k();
        }
        return iO2 - iO;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                dri driVar = (dri) arrayList.get(i);
                if (this.f == driVar.c) {
                    c(this.d, driVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, dri driVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            dqn dqnVar = (dqn) arrayList.get(i2);
            driVar.d(dqnVar);
            if (i == 0) {
                dqnVar.ay = driVar.c;
            } else {
                dqnVar.az = driVar.c;
            }
        }
        this.f = driVar.c;
    }

    public final boolean d(dqn dqnVar) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(dqnVar)) {
            return false;
        }
        arrayList.add(dqnVar);
        return true;
    }

    public final String toString() {
        int i = this.d;
        String str = i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both";
        String str2 = str + " [" + this.c + "] <";
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            str2 = str2 + " " + ((dqn) arrayList.get(i2)).as;
        }
        return str2.concat(" >");
    }
}
