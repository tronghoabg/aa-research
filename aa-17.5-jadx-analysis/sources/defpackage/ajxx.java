package defpackage;

import java.util.concurrent.locks.Condition;

@Deprecated
/* loaded from: classes2.dex */
public final class ajxx {
    public final Condition a;
    public Thread b;
    public boolean c;

    public ajxx(Condition condition) {
        ahgm.e(condition, "Condition");
        this.a = condition;
    }

    public final void a() {
        this.c = true;
        this.a.signalAll();
    }

    public final void b() {
        if (this.b == null) {
            throw new IllegalStateException("Nobody waiting on this object.");
        }
        this.a.signalAll();
    }
}
