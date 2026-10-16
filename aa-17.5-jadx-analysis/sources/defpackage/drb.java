package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class drb implements dqz {
    public final drj d;
    public int e;
    public int f;
    public dqz a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    drc h = null;
    public boolean i = false;
    public final List j = new ArrayList();
    final List k = new ArrayList();

    public drb(drj drjVar) {
        this.d = drjVar;
    }

    public final void a(dqz dqzVar) {
        this.j.add(dqzVar);
        if (this.i) {
            dqzVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        Iterator it = this.j.iterator();
        while (it.hasNext()) {
            ((dqz) it.next()).f();
        }
    }

    @Override // defpackage.dqz
    public final void f() {
        List<drb> list = this.k;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((drb) it.next()).i) {
                return;
            }
        }
        this.c = true;
        dqz dqzVar = this.a;
        if (dqzVar != null) {
            dqzVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        int i = 0;
        drb drbVar = null;
        for (drb drbVar2 : list) {
            if (!(drbVar2 instanceof drc)) {
                i++;
                drbVar = drbVar2;
            }
        }
        if (drbVar != null && i == 1 && drbVar.i) {
            drc drcVar = this.h;
            if (drcVar != null) {
                if (!drcVar.i) {
                    return;
                } else {
                    this.e = this.g * drcVar.f;
                }
            }
            c(drbVar.f + this.e);
        }
        dqz dqzVar2 = this.a;
        if (dqzVar2 != null) {
            dqzVar2.f();
        }
    }

    public final String toString() {
        String str;
        String str2 = this.d.d.as;
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        String strValueOf = this.i ? Integer.valueOf(this.f) : "unresolved";
        List list = this.k;
        List list2 = this.j;
        return str2 + ":" + str + "(" + strValueOf.toString() + ") <t=" + list.size() + ":d=" + list2.size() + ">";
    }
}
