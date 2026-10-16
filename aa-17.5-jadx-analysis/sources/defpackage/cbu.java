package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;

/* loaded from: classes.dex */
public class cbu<K, V> extends afas<K, V> implements Map<K, V>, cbg {
    public static final cbu a = new cbu(cce.a, 0);
    public final cce b;
    public final int c;

    public cbu(cce cceVar, int i) {
        this.b = cceVar;
        this.c = i;
    }

    @Override // defpackage.afas
    public final int a() {
        return this.c;
    }

    public final cbu b(Object obj, Object obj2) {
        ccd ccdVarD = this.b.d(obj != null ? obj.hashCode() : 0, obj, obj2, 0);
        return ccdVarD == null ? this : new cbu(ccdVarD.a, a() + ccdVarD.b);
    }

    @Override // defpackage.afas
    public final /* synthetic */ Collection c() {
        return new ccc(this);
    }

    @Override // defpackage.afas, java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.l(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // defpackage.afas
    public final Set d() {
        return new ccb(this, 1);
    }

    @Override // defpackage.afas
    public final /* synthetic */ Set e() {
        return new ccb(this, 0);
    }

    @Override // defpackage.afas, java.util.Map
    public V get(Object obj) {
        return (V) this.b.k(obj != null ? obj.hashCode() : 0, obj, 0);
    }
}
