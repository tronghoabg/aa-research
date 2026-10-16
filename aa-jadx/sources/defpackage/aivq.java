package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class aivq implements defpackage.aiwc {
    public final boolean a;

    public aivq(boolean z) {
        this.a = z;
    }

    @Override // defpackage.aiwc
    public final defpackage.aiwr a() {
        return null;
    }

    @Override // defpackage.aiwc
    public final boolean gL() {
        return this.a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append("}");
        return sb.toString();
    }
}
