package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class t {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public t(p pVar) {
        this.a = pVar.w;
        this.b = pVar.x;
        this.c = pVar.h();
        this.d = pVar.d();
        ArrayList arrayList = pVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new s((o) arrayList.get(i)));
        }
    }
}
