package defpackage;

/* loaded from: classes3.dex */
public enum agaw {
    DECLARATION,
    FAKE_OVERRIDE,
    DELEGATION,
    SYNTHESIZED;

    public boolean isReal() {
        return this != FAKE_OVERRIDE;
    }
}
