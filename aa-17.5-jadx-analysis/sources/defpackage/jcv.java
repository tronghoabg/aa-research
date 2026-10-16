package defpackage;

/* loaded from: classes.dex */
public interface jcv {
    public static final jcv a;
    public static final jcv b;
    public static final jcu c;

    static {
        final int i = 1;
        a = new jcv() { // from class: jct
            @Override // defpackage.jcv
            public final int a(int i2) {
                return i != 0 ? 1 : 2;
            }
        };
        final int i2 = 0;
        b = new jcv() { // from class: jct
            @Override // defpackage.jcv
            public final int a(int i22) {
                return i2 != 0 ? 1 : 2;
            }
        };
        c = new jdg(i);
    }

    int a(int i);
}
