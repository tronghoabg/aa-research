package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class ugl {
    private static final int[] a = new int[0];
    public int f;
    public final float g;
    public final ugk h;
    protected final Map b = new HashMap();
    public final List c = new ArrayList();
    protected final List d = new ArrayList();
    protected int e = 0;
    private final Set i = new HashSet();
    private final float[] j = new float[3];

    public ugl(float f, int i, boolean z) {
        this.g = f;
        this.f = i;
        this.h = z ? new ugh() : new ugj();
    }

    @ResultIgnorabilityUnspecified
    public final int c(ukf ukfVar, ukf ukfVar2) {
        Integer num = (Integer) this.b.get(ukfVar);
        if (num == null) {
            int i = this.e;
            this.e = i + 1;
            Integer numValueOf = Integer.valueOf(i);
            numValueOf.getClass();
            g(i, ukfVar, ukfVar2);
            num = numValueOf;
        }
        return num.intValue();
    }

    public final int d(ujf ujfVar) {
        return this.h.b(ujfVar);
    }

    public final int e() {
        int size = this.e;
        if (size == 0) {
            size = this.c.size();
        }
        return uzg.c(size * 5, 1);
    }

    public final uke f(ujf ujfVar, int i) {
        return this.h.c(ujfVar, i);
    }

    public final void g(int i, ukf ukfVar, ukf ukfVar2) {
        this.b.put(ukfVar, Integer.valueOf(i));
        while (true) {
            List list = this.c;
            if (i < list.size()) {
                list.set(i, ukfVar);
                this.d.set(i, ukfVar2);
                return;
            } else {
                list.add(null);
                this.d.add(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[LOOP:3: B:21:0x0068->B:22:0x006a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] h() {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ugl.h():byte[]");
    }
}
