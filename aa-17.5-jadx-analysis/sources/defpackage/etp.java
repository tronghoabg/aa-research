package defpackage;

import java.util.Objects;

@Deprecated
/* loaded from: classes2.dex */
public class etp {
    public final Object e;
    public boolean f;
    public boolean g;
    public int h;

    public etp(Object obj) {
        this.e = obj;
    }

    public final void b(Object obj) {
        if (this.f || this.g) {
            Object obj2 = this.e;
            Objects.toString(obj2);
            throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: ".concat(String.valueOf(obj2)));
        }
        this.f = true;
        a(obj);
    }

    public final boolean c() {
        return this.f || this.g;
    }

    public void a(Object obj) {
    }
}
