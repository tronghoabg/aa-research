package defpackage;

/* loaded from: classes.dex */
public final class lrv<T, V> implements afgl {
    private final /* synthetic */ int c;
    public static final lrv b = new lrv(1);
    public static final lrv a = new lrv(0);

    public lrv(int i) {
        this.c = i;
    }

    @Override // defpackage.afgl
    public final Object getValue(Object obj, afia afiaVar) {
        return this.c != 0 ? mki.a.i(lec.class) : mki.a.i(lrw.class);
    }
}
