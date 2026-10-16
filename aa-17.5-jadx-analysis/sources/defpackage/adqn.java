package defpackage;

import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class adqn {
    public Object a;
    public Object b;

    public adqn(adis adisVar) {
        this.a = adisVar;
    }

    public final adis a() {
        if (this.b != null) {
            this.a = new adis((IdentityHashMap) this.b);
            this.b = null;
        }
        return (adis) this.a;
    }

    public final IdentityHashMap b(int i) {
        if (this.b == null) {
            Object obj = this.a;
            adis adisVar = adis.a;
            IdentityHashMap identityHashMap = new IdentityHashMap(((adis) obj).b.size() + i);
            this.b = identityHashMap;
            identityHashMap.putAll(((adis) this.a).b);
            this.a = null;
        }
        return (IdentityHashMap) this.b;
    }

    public final void c(adir adirVar, Object obj) {
        b(1).put(adirVar, obj);
    }
}
