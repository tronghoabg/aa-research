package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class aivt extends afcg implements aivh {
    public static final aivt a = new aivt();

    private aivt() {
        super(aivh.d);
    }

    @Override // defpackage.aivh
    public final aivh hO() {
        return null;
    }

    @Override // defpackage.aivh
    public final aitk hP(aivo aivoVar) {
        return aivu.a;
    }

    @Override // defpackage.aivh
    public final Object n(afck afckVar) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.aivh
    public final CancellationException o() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.aivh
    public final aiuo p(afec afecVar) {
        return aivu.a;
    }

    @Override // defpackage.aivh
    public final aiuo q(boolean z, boolean z2, afec afecVar) {
        return aivu.a;
    }

    @Override // defpackage.aivh
    public final boolean t() {
        return true;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.aivh
    public final boolean v() {
        return false;
    }

    @Override // defpackage.aivh
    public final boolean x() {
        throw null;
    }

    @Override // defpackage.aivh
    public final void z() {
    }

    @Override // defpackage.aivh
    public final void s(CancellationException cancellationException) {
    }
}
