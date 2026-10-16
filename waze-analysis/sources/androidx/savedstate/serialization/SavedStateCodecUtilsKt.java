package androidx.savedstate.serialization;

import h.g.b.ar;
import h.g.b.at;
import h.g.b.g;
import h.g.b.k;
import h.g.b.m;
import h.g.b.p;
import h.g.b.v;
import h.g.b.z;
import kotlinx.b.a.b;
import kotlinx.b.a.q;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class SavedStateCodecUtilsKt {
    private static final q stringArrayDescriptor;
    private static final q intListDescriptor = b.i(b.r(v.f48128a)).getDescriptor();
    private static final q stringListDescriptor = b.i(b.u(at.f48108a)).getDescriptor();
    private static final q booleanListDescriptor = b.i(b.m(g.f48119a)).getDescriptor();
    private static final q longListDescriptor = b.i(b.s(z.f48129a)).getDescriptor();
    private static final q floatListDescriptor = b.i(b.q(h.g.b.q.f48127a)).getDescriptor();
    private static final q doubleListDescriptor = b.i(b.p(p.f48126a)).getDescriptor();
    private static final q charListDescriptor = b.i(b.o(k.f48122a)).getDescriptor();
    private static final q booleanArrayDescriptor = b.d().getDescriptor();
    private static final q charArrayDescriptor = b.e().getDescriptor();
    private static final q doubleArrayDescriptor = b.f().getDescriptor();
    private static final q floatArrayDescriptor = b.g().getDescriptor();
    private static final q intArrayDescriptor = b.h().getDescriptor();
    private static final q longArrayDescriptor = b.j().getDescriptor();

    static {
        kotlinx.b.b bVarU = b.u(at.f48108a);
        int i2 = ar.f48106a;
        stringArrayDescriptor = b.c(new m(String.class), bVarU).getDescriptor();
    }

    public static final q getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    public static final q getBooleanListDescriptor() {
        return booleanListDescriptor;
    }

    public static final q getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    public static final q getCharListDescriptor() {
        return charListDescriptor;
    }

    public static final q getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    public static final q getDoubleListDescriptor() {
        return doubleListDescriptor;
    }

    public static final q getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    public static final q getFloatListDescriptor() {
        return floatListDescriptor;
    }

    public static final q getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    public static final q getIntListDescriptor() {
        return intListDescriptor;
    }

    public static final q getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    public static final q getLongListDescriptor() {
        return longListDescriptor;
    }

    public static final q getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }

    public static /* synthetic */ void getStringArrayDescriptor$annotations() {
    }

    public static final q getStringListDescriptor() {
        return stringListDescriptor;
    }
}
