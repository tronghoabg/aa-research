package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum tgs {
    COLD("Cold"),
    WARM("Warm");

    public final defpackage.vlu c;

    tgs(java.lang.String str) {
        this.c = new defpackage.vlu(str);
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.c.a;
    }
}
