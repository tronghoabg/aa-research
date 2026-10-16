package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class aabg implements tqb {
    public static final int[] a = {0, 10, 30};
    public final aaco b;
    final List c;
    private final Executor d;
    private boolean e;
    private boolean f;
    private Set g;

    public aabg(aaco aacoVar) {
        zrz.b();
        this.e = false;
        this.f = false;
        this.g = new HashSet();
        this.c = new ArrayList();
        this.b = aacoVar;
        this.d = zrz.b();
    }

    private static Map g(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abss abssVar = (abss) it.next();
            map.put(abssVar.c, abssVar.d);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00be A[PHI: r6
  0x00be: PHI (r6v2 boolean) = (r6v1 boolean), (r6v1 boolean), (r6v1 boolean), (r6v1 boolean), (r6v9 boolean) binds: [B:15:0x003d, B:17:0x0049, B:19:0x004f, B:21:0x005b, B:81:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.tqb
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.tqr a(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aabg.a(java.util.List):tqr");
    }

    final synchronized ygr b() {
        return ygr.n(this.g);
    }

    final synchronized void c() {
        this.c.clear();
    }

    final synchronized void d() {
        this.g.clear();
    }

    public final synchronized void e(boolean z) {
        this.f = z;
    }

    public final synchronized void f(boolean z) {
        this.e = z;
    }
}
