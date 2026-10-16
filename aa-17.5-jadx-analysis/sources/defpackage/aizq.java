package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class aizq {
    public static final ajcz a = new ajcz("NO_VALUE");

    public static final Object a(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void b(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final aiyk c(aizm aizmVar, afco afcoVar, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? aizmVar : new ajan(aizmVar, afcoVar, i, i2);
    }

    public static final aizk d(int i, int i2, int i3) {
        if (i > 0 || i2 > 0 || i3 == 1) {
            return new aizp(i, i2 + i, i3);
        }
        Objects.toString(affz.n(i3));
        throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(affz.n(i3)));
    }

    public static /* synthetic */ aizk e(int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return d(i & ((i4 & 1) ^ 1), i2, i3);
    }
}
