package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class hwl {
    final iel a;
    final Executor b;

    public hwl(iel ielVar, Executor executor) {
        this.a = ielVar;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hwl) {
            return this.a.equals(((hwl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
