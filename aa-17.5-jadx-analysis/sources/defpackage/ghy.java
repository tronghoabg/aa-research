package defpackage;

/* loaded from: classes2.dex */
public final class ghy {
    public static final ghy a;
    public static final ghy b;
    public static final ghy c;
    public static final ghy d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final ghw j;

    static {
        new ghx();
        ghx ghxVar = new ghx();
        ghxVar.d = 0;
        ghxVar.e = false;
        ghxVar.c = 1;
        ghxVar.a = true;
        ghxVar.b = false;
        a = new ghy(ghxVar);
        ghx ghxVar2 = new ghx();
        ghxVar2.d = 2;
        ghxVar2.e = true;
        ghxVar2.c = 2;
        ghxVar2.b = true;
        ghxVar2.a = false;
        b = new ghy(ghxVar2);
        ghx ghxVar3 = new ghx();
        ghxVar3.d = 0;
        ghxVar3.e = true;
        ghxVar3.c = 2;
        ghxVar3.b = true;
        ghxVar3.a = true;
        c = new ghy(ghxVar3);
        ghx ghxVar4 = new ghx();
        ghxVar4.d = 0;
        ghxVar4.e = true;
        ghxVar4.b = true;
        ghxVar4.a = true;
        d = new ghy(ghxVar4);
    }

    public ghy(ghx ghxVar) {
        this.i = ghxVar.a;
        this.e = ghxVar.c;
        this.f = ghxVar.d;
        this.h = ghxVar.b;
        this.g = ghxVar.e;
        this.j = (ghw) ghxVar.f;
    }
}
