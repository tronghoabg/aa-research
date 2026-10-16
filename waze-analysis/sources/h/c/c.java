package h.c;

import h.g.b.x;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class c implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final j[] f48055a;

    public c(j[] jVarArr) {
        x.f(jVarArr, "elements");
        this.f48055a = jVarArr;
    }

    private final Object readResolve() {
        j jVarPlus = k.f48060a;
        int i2 = 0;
        while (true) {
            j[] jVarArr = this.f48055a;
            if (i2 >= jVarArr.length) {
                return jVarPlus;
            }
            jVarPlus = jVarPlus.plus(jVarArr[i2]);
            i2++;
        }
    }
}
