package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gie {
    public static final defpackage.gie a;
    public static final defpackage.gie b;
    public static final defpackage.gie c;
    public static final defpackage.gie d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final defpackage.gic j;

    static {
        new defpackage.gid();
        defpackage.gid gidVar = new defpackage.gid();
        gidVar.d = 0;
        gidVar.e = false;
        gidVar.c = 1;
        gidVar.a = true;
        gidVar.b = false;
        a = new defpackage.gie(gidVar);
        defpackage.gid gidVar2 = new defpackage.gid();
        gidVar2.d = 2;
        gidVar2.e = true;
        gidVar2.c = 2;
        gidVar2.b = true;
        gidVar2.a = false;
        b = new defpackage.gie(gidVar2);
        defpackage.gid gidVar3 = new defpackage.gid();
        gidVar3.d = 0;
        gidVar3.e = true;
        gidVar3.c = 2;
        gidVar3.b = true;
        gidVar3.a = true;
        c = new defpackage.gie(gidVar3);
        defpackage.gid gidVar4 = new defpackage.gid();
        gidVar4.d = 0;
        gidVar4.e = true;
        gidVar4.b = true;
        gidVar4.a = true;
        d = new defpackage.gie(gidVar4);
    }

    public gie(defpackage.gid gidVar) {
        this.i = gidVar.a;
        this.e = gidVar.c;
        this.f = gidVar.d;
        this.h = gidVar.b;
        this.g = gidVar.e;
        this.j = (defpackage.gic) gidVar.f;
    }
}
