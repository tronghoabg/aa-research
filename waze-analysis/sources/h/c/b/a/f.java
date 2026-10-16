package h.c.b.a;

import h.g.b.ar;
import h.g.b.s;
import h.g.b.w;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class f extends e implements s {
    private final int arity;

    public f(int i2, h.c.e<Object> eVar) {
        super(eVar);
        this.arity = i2;
    }

    @Override // h.g.b.s
    public int getArity() {
        return this.arity;
    }

    @Override // h.c.b.a.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        int i2 = ar.f48106a;
        String strA = w.a(this);
        x.e(strA, "renderLambdaToString(...)");
        return strA;
    }

    public f(int i2) {
        this(i2, null);
    }
}
