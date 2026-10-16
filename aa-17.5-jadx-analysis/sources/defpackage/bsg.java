package defpackage;

/* loaded from: classes2.dex */
public final class bsg extends Throwable {
    private final String a;

    public bsg(boolean z, boolean z2, anf anfVar, Object obj) {
        this.a = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + z + ",didLookahead=" + z2 + ",anchors=" + anfVar + ",targetValue=" + obj;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
