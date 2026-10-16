package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
final class uwe {
    public final ArrayList a;
    boolean b;
    public int c;
    public int d;

    public uwe() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = true;
        this.c = 0;
        this.d = 0;
        arrayList.add(new aewk(16));
    }

    public final void a(uwi uwiVar) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((aewk) arrayList.get(i)).remove(uwiVar);
            i++;
        }
    }
}
