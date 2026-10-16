package defpackage;

/* loaded from: classes.dex */
public final class afcz implements afck {
    public static final afcz a = new afcz();

    @Override // defpackage.afck
    public final afco hH() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }

    @Override // defpackage.afck
    public final void w(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }
}
