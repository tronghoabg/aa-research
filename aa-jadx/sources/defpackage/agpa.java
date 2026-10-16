package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agpa {
    private defpackage.agov constantValue;
    private int flags;
    private defpackage.agpl isInstanceType;
    private java.lang.Integer parameterIndex;
    private final java.util.List<defpackage.agpa> andArguments = new java.util.ArrayList(0);
    private final java.util.List<defpackage.agpa> orArguments = new java.util.ArrayList(0);

    public final java.util.List<defpackage.agpa> getAndArguments() {
        return this.andArguments;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final java.util.List<defpackage.agpa> getOrArguments() {
        return this.orArguments;
    }

    public final void setConstantValue(defpackage.agov agovVar) {
        this.constantValue = agovVar;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setInstanceType(defpackage.agpl agplVar) {
        this.isInstanceType = agplVar;
    }

    public final void setParameterIndex(java.lang.Integer num) {
        this.parameterIndex = num;
    }
}
