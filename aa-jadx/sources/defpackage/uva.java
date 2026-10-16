package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uva {
    public static final defpackage.uva a = new defpackage.uva(0);
    final int d;
    defpackage.uva b = null;
    defpackage.uva c = null;
    int e = 0;
    int f = 0;
    boolean g = false;
    boolean h = false;

    public uva(int i) {
        this.d = i;
    }

    final void a(defpackage.uva uvaVar, defpackage.uva uvaVar2) {
        if (uvaVar != null) {
            uvaVar.c = this;
        }
        if (uvaVar2 != null) {
            uvaVar2.b = this;
        }
        this.b = uvaVar;
        this.c = uvaVar2;
        this.g = true;
    }

    public final boolean b() {
        return this.d != 0 && this.g;
    }
}
