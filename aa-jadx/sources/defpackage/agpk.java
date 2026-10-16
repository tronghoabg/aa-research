package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agpk {
    private final java.util.List<defpackage.agns> annotations;
    private int flags;

    public agpk(int i) {
        this.flags = i;
        this.annotations = new java.util.ArrayList(0);
    }

    public final java.util.List<defpackage.agns> getAnnotations() {
        return this.annotations;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public agpk() {
        this(0);
    }
}
