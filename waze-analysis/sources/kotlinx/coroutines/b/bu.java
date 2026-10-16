package kotlinx.coroutines.b;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class bu {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.e.ak f51616a = new kotlinx.coroutines.e.ak("NO_VALUE");

    public static final /* synthetic */ Object a(Object[] objArr, long j2) {
        return objArr[((int) j2) & (objArr.length - 1)];
    }

    public static final k b(bq bqVar, h.c.j jVar, int i2, kotlinx.coroutines.a.a aVar) {
        return ((i2 == 0 || i2 == -3) && aVar == kotlinx.coroutines.a.a.f51271a) ? bqVar : new kotlinx.coroutines.b.a.h(bqVar, jVar, i2, aVar);
    }

    public static final bm c(int i2, int i3, kotlinx.coroutines.a.a aVar) {
        if (i3 < 0) {
            throw new IllegalArgumentException("extraBufferCapacity cannot be negative, but was " + i3);
        }
        if (i2 <= 0 && i3 <= 0 && aVar != kotlinx.coroutines.a.a.f51271a) {
            Objects.toString(aVar);
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(String.valueOf(aVar)));
        }
        int i4 = i3 + i2;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new bt(i2, i4, aVar);
    }

    public static final /* synthetic */ void d(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static /* synthetic */ bm e(int i2, int i3, kotlinx.coroutines.a.a aVar, int i4) {
        if ((i4 & 4) != 0) {
            aVar = kotlinx.coroutines.a.a.f51271a;
        }
        int i5 = i4 & 2;
        int i6 = i4 & 1;
        if (i5 != 0) {
            i3 = 0;
        }
        if (1 == i6) {
            i2 = 0;
        }
        return c(i2, i3, aVar);
    }
}
