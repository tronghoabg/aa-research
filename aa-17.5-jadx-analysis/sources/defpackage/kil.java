package defpackage;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public final class kil extends ReentrantReadWriteLock {
    private final kik a = new kik(readLock());
    private final kik b = new kik(writeLock());

    public final kik a() {
        kik kikVar = this.a;
        kikVar.a();
        return kikVar;
    }

    public final kik b() {
        kik kikVar = this.b;
        kikVar.a();
        return kikVar;
    }
}
