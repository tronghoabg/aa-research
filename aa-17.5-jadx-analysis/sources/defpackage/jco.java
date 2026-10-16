package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class jco implements jcp {
    public static final jcn a = new jcn(ByteBuffer.allocateDirect(0), null, false);
    public static final jcn b = new jcn(ByteBuffer.allocate(0), null, false);
    public final yfq c;
    public final boolean d;
    public final boolean e;
    public final yws f;
    public final yph g;

    private jco(yfq yfqVar, boolean z, boolean z2, yws ywsVar) {
        this.c = yfqVar;
        this.d = z;
        this.f = ywsVar;
        this.e = z2;
        yph yphVar = new yph(yqn.d("CAR.".concat(String.valueOf(ywsVar.name()))));
        this.g = yphVar;
        ((ype) ((ype) yphVar.f()).ai(1886)).M("Initializing %s buffer pools with %s buffers", true != yfqVar.isEmpty() ? "managed" : "unmanaged", true != z ? "heap" : "direct");
    }

    public static synchronized jco a(List list, boolean z, boolean z2, yws ywsVar, jcq jcqVar) {
        yfl yflVar;
        yflVar = new yfl(4);
        int i = 0;
        while (i < list.size()) {
            wub.aE(i);
            if (i >= 31) {
                throw new ArithmeticException(a.bn(i, "overflow: checkedPow(2, ", ")"));
            }
            boolean z3 = z;
            yws ywsVar2 = ywsVar;
            jcq jcqVar2 = jcqVar;
            yflVar.i(new jcl(1 << i, ((Integer) list.get(i)).intValue(), z3, ywsVar2, jcqVar2));
            i++;
            z = z3;
            ywsVar = ywsVar2;
            jcqVar = jcqVar2;
        }
        return new jco(yflVar.g(), z, z2, ywsVar);
    }
}
