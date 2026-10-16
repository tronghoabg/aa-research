package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t {
    public int a;
    public int b;
    public int c;
    public int d;
    public java.util.ArrayList e = new java.util.ArrayList();

    public t(defpackage.p pVar) {
        this.a = pVar.w;
        this.b = pVar.x;
        this.c = pVar.h();
        this.d = pVar.d();
        java.util.ArrayList arrayList = pVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new defpackage.s((defpackage.o) arrayList.get(i)));
        }
    }
}
