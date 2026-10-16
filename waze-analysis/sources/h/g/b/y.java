package h.g.b;

import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class y<R> implements Serializable, s {
    private final int arity;

    public y(int i2) {
        this.arity = i2;
    }

    @Override // h.g.b.s
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        int i2 = ar.f48106a;
        String strA = w.a(this);
        x.e(strA, "renderLambdaToString(...)");
        return strA;
    }
}
