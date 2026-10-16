package defpackage;

/* loaded from: classes.dex */
public final class dfq {
    public static final dfr a;
    public static final dfr b;

    static {
        final int i = 1;
        a = new dfr() { // from class: dfp
            @Override // defpackage.dfr
            public final boolean a(cjb cjbVar, cjb cjbVar2) {
                return i != 0 ? cjbVar.i(cjbVar2) : cjbVar2.g(cjbVar.a());
            }
        };
        final int i2 = 0;
        b = new dfr() { // from class: dfp
            @Override // defpackage.dfr
            public final boolean a(cjb cjbVar, cjb cjbVar2) {
                return i2 != 0 ? cjbVar.i(cjbVar2) : cjbVar2.g(cjbVar.a());
            }
        };
    }
}
