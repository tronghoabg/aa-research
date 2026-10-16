package defpackage;

/* loaded from: classes3.dex */
public final class xlk extends abnv implements abox {
    public static final xlk a;
    public aboh b;
    public aboh c;

    static {
        xlk xlkVar = new xlk();
        a = xlkVar;
        abnv.P(xlk.class, xlkVar);
    }

    private xlk() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", xlr.class, "c", xlb.class});
        }
        if (i2 == 3) {
            return new xlk();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(xlk.class);
    }

    public final void b() {
        aboh abohVar = this.c;
        if (abohVar.c()) {
            return;
        }
        this.c = abnv.I(abohVar);
    }
}
