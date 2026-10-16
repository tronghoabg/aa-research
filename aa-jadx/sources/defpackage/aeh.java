package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aeh {
    public final defpackage.aek a;
    public final int b;

    public aeh(defpackage.aek aekVar, int i) {
        this.a = aekVar;
        this.b = i;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AnimationResult(endReason=");
        sb.append((java.lang.Object) (this.b != 1 ? "Finished" : "BoundReached"));
        sb.append(", endState=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
