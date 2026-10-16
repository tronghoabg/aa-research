package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class afcq implements afck, afdb {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(afcq.class, Object.class, "result");
    private final afck b;
    private volatile Object result;

    public afcq(afck afckVar, Object obj) {
        this.b = afckVar;
        this.result = obj;
    }

    @Override // defpackage.afdb
    public final StackTraceElement ea() {
        return null;
    }

    @Override // defpackage.afdb
    public final afdb eb() {
        afck afckVar = this.b;
        if (afckVar instanceof afdb) {
            return (afdb) afckVar;
        }
        return null;
    }

    @Override // defpackage.afck
    public final afco hH() {
        return this.b.hH();
    }

    public final String toString() {
        afck afckVar = this.b;
        Objects.toString(afckVar);
        return "SafeContinuation for ".concat(afckVar.toString());
    }

    @Override // defpackage.afck
    public final void w(Object obj) {
        while (true) {
            Object obj2 = this.result;
            afcr afcrVar = afcr.b;
            if (obj2 != afcrVar) {
                afcr afcrVar2 = afcr.a;
                if (obj2 != afcrVar2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (a.i(a, this, afcrVar2, afcr.c)) {
                    this.b.w(obj);
                    return;
                }
            } else if (a.i(a, this, afcrVar, obj)) {
                return;
            }
        }
    }
}
