package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class tei {
    public final Executor a;
    public final Level b;
    public final yph c;
    public final int d;

    public tei(int i, Executor executor, Level level, yph yphVar) {
        if (i == 0) {
            throw null;
        }
        executor.getClass();
        level.getClass();
        yphVar.getClass();
        this.d = i;
        this.a = executor;
        this.b = level;
        this.c = yphVar;
        if (tel.b.contains(level)) {
            throw new IllegalArgumentException("Log level " + level + " is not supported.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tei)) {
            return false;
        }
        tei teiVar = (tei) obj;
        return this.d == teiVar.d && affa.f(this.a, teiVar.a) && affa.f(this.b, teiVar.b) && affa.f(this.c, teiVar.c);
    }

    public final int hashCode() {
        return (((((this.d * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Config(selfTransitionBehavior=");
        sb.append((Object) (this.d != 1 ? "NOOP" : "NORMAL"));
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
    public tei() {
        this(0, (Level) null, (yph) (0 == true ? 1 : 0), 15);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ tei(int i, Level level, yph yphVar, int i2) {
        zfq zfqVar = (i2 & 2) != 0 ? zfq.a : null;
        if ((i2 & 4) != 0) {
            level = Level.FINEST;
            level.getClass();
        }
        if ((i2 & 8) != 0) {
            yphVar = tel.a;
            yphVar.getClass();
        }
        this(1 == (i2 & 1) ? 1 : i, zfqVar, level, yphVar);
    }
}
