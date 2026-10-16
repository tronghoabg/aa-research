package defpackage;

import java.io.Serializable;
import java.util.EnumMap;

/* loaded from: classes3.dex */
public final class yfh implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object a;

    public yfh(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static yfh a(aazu aazuVar) {
        int i = yfq.d;
        yfl yflVar = new yfl(4);
        if (aazuVar != null) {
            int size = aazuVar.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                tzy tzyVarA = tzy.a((aazt) aazuVar.b.get(i2));
                if (tzyVarA != null) {
                    yflVar.i(tzyVarA);
                }
            }
        }
        return new yfh(yflVar.g());
    }

    Object readResolve() {
        return new yfi((EnumMap) this.a);
    }
}
