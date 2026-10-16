package defpackage;

/* loaded from: classes.dex */
public final class aea {
    public final aed a;
    public final int b;

    public aea(aed aedVar, int i) {
        this.a = aedVar;
        this.b = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        sb.append((Object) (this.b != 1 ? "Finished" : "BoundReached"));
        sb.append(", endState=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
