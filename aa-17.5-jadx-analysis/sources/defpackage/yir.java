package defpackage;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
class yir extends yed implements Serializable {
    private static final long serialVersionUID = 3;
    final yje a;
    final yje b;
    final xww c;
    final int d;
    transient ConcurrentMap e;

    public yir(yje yjeVar, yje yjeVar2, xww xwwVar, int i, ConcurrentMap concurrentMap) {
        this.a = yjeVar;
        this.b = yjeVar2;
        this.c = xwwVar;
        this.d = i;
        this.e = concurrentMap;
    }

    @Override // defpackage.yed, defpackage.yei
    protected final /* synthetic */ Map a() {
        return this.e;
    }

    @Override // defpackage.yed
    protected final ConcurrentMap c() {
        return this.e;
    }

    @Override // defpackage.yel
    protected final /* synthetic */ Object d() {
        return this.e;
    }
}
