package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
final class txb {
    private final Set a = new HashSet();
    private yfg b;
    private boolean c;
    private final xwx d;

    public txb(xwx xwxVar) {
        int i = yfq.d;
        this.b = yls.a;
        this.c = true;
        this.d = xwxVar;
    }

    @ResultIgnorabilityUnspecified
    public final synchronized yfg a() {
        if (this.c) {
            this.b = (yfg) this.d.a(this.a);
            this.c = false;
        }
        return this.b;
    }

    public final synchronized boolean b(Object obj) {
        boolean zAdd;
        zAdd = this.a.add(obj);
        this.c |= zAdd;
        return zAdd;
    }

    public final synchronized boolean c(Object obj) {
        boolean zRemove;
        zRemove = this.a.remove(obj);
        this.c |= zRemove;
        return zRemove;
    }
}
