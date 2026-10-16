package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tfe {
    public final java.util.concurrent.Executor a;
    public final java.util.logging.Level b;
    public final defpackage.yqm c;
    public final int d;

    public tfe(int i, java.util.concurrent.Executor executor, java.util.logging.Level level, defpackage.yqm yqmVar) {
        if (i == 0) {
            throw null;
        }
        executor.getClass();
        level.getClass();
        yqmVar.getClass();
        this.d = i;
        this.a = executor;
        this.b = level;
        this.c = yqmVar;
        if (defpackage.tfh.b.contains(level)) {
            throw new java.lang.IllegalArgumentException("Log level " + level + " is not supported.");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.tfe)) {
            return false;
        }
        defpackage.tfe tfeVar = (defpackage.tfe) obj;
        return this.d == tfeVar.d && defpackage.afga.f(this.a, tfeVar.a) && defpackage.afga.f(this.b, tfeVar.b) && defpackage.afga.f(this.c, tfeVar.c);
    }

    public final int hashCode() {
        return (((((this.d * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Config(selfTransitionBehavior=");
        sb.append((java.lang.Object) (this.d != 1 ? "NOOP" : "NORMAL"));
        sb.append(", callbackExecutor=");
        sb.append(this.a);
        sb.append(", logLevel=");
        sb.append(this.b);
        sb.append(", logger=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public tfe() {
        this(0, (java.util.logging.Level) null, (defpackage.yqm) (0 == true ? 1 : 0), 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ tfe(int i, java.util.logging.Level level, defpackage.yqm yqmVar, int i2) {
        defpackage.zgt zgtVar = (i2 & 2) != 0 ? defpackage.zgt.INSTANCE : null;
        if ((i2 & 4) != 0) {
            level = java.util.logging.Level.FINEST;
            level.getClass();
        }
        if ((i2 & 8) != 0) {
            yqmVar = defpackage.tfh.a;
            yqmVar.getClass();
        }
        this(1 == (i2 & 1) ? 1 : i, zgtVar, level, yqmVar);
    }
}
