package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum agbw {
    DECLARATION,
    FAKE_OVERRIDE,
    DELEGATION,
    SYNTHESIZED;

    public boolean isReal() {
        return this != FAKE_OVERRIDE;
    }
}
