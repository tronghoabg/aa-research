package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface jdc {
    public static final defpackage.jdc a;
    public static final defpackage.jdc b;
    public static final defpackage.jdb c;

    static {
        final int i = 1;
        a = new defpackage.jdc() { // from class: jda
            @Override // defpackage.jdc
            public final int a(int i2) {
                return i != 0 ? 1 : 2;
            }
        };
        final int i2 = 0;
        b = new defpackage.jdc() { // from class: jda
            @Override // defpackage.jdc
            public final int a(int i3) {
                return i2 != 0 ? 1 : 2;
            }
        };
        c = new defpackage.jdn(i);
    }

    int a(int i);
}
