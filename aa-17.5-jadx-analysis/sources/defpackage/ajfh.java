package defpackage;

/* loaded from: classes2.dex */
public final class ajfh extends abnv implements abox {
    public static final ajfh a;
    public aboh b;
    public aboh c;
    private byte d = 2;

    static {
        ajfh ajfhVar = new ajfh();
        a = ajfhVar;
        abnv.P(ajfh.class, ajfhVar);
    }

    private ajfh() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new Object[]{"b", ajfg.class, "c", ajfj.class});
        }
        if (i2 == 3) {
            return new ajfh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajfh.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        aboh abohVar = this.b;
        if (abohVar.c()) {
            return;
        }
        this.b = abnv.I(abohVar);
    }
}
