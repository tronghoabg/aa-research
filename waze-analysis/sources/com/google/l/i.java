package com.google.l;

import com.google.l.b.ac;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class i {
    @Deprecated
    public i() {
    }

    public int a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final g e() {
        if (this instanceof g) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: ".concat(toString()));
    }

    public final n f() {
        if (this instanceof n) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(toString()));
    }

    public final String toString() {
        try {
            StringBuilder sb = new StringBuilder();
            com.google.l.d.c cVar = new com.google.l.d.c(ac.c(sb));
            cVar.r(s.f12462a);
            ac.d(this, cVar);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
