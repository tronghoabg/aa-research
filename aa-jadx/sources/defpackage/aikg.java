package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum aikg {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);

    private static final /* synthetic */ defpackage.afef $ENTRIES = defpackage.afga.p(values());
    private final boolean allowsInPosition;
    private final boolean allowsOutPosition;
    private final java.lang.String label;
    private final int superpositionFactor;

    aikg(java.lang.String str, boolean z, boolean z2, int i) {
        this.label = str;
        this.allowsInPosition = z;
        this.allowsOutPosition = z2;
        this.superpositionFactor = i;
    }

    public final boolean getAllowsOutPosition() {
        return this.allowsOutPosition;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.label;
    }
}
