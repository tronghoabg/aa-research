package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bsn extends java.lang.Throwable {
    private final java.lang.String a;

    public bsn(boolean z, boolean z2, defpackage.ank ankVar, java.lang.Object obj) {
        this.a = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + z + ",didLookahead=" + z2 + ",anchors=" + ankVar + ",targetValue=" + obj;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return this.a;
    }
}
