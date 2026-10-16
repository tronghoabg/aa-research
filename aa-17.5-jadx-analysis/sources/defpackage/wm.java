package defpackage;

/* loaded from: classes2.dex */
public final class wm {
    public static final wm a;
    public final int b;
    public final int c;

    static {
        etz etzVar = new etz(null);
        etzVar.a = 4;
        etzVar.b();
        a = new wm(etzVar);
        etz etzVar2 = new etz(null);
        etzVar2.a = 5;
        etzVar2.b();
    }

    public wm(etz etzVar) {
        this.b = etzVar.a;
        this.c = etzVar.b;
    }
}
