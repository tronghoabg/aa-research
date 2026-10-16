package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ygc extends yhg {
    private final yfy a;

    public ygc(yfy yfyVar) {
        this.a = yfyVar;
    }

    @Override // defpackage.yfg, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.yhg, defpackage.ygr, defpackage.yfg
    /* renamed from: e */
    public final yno iterator() {
        return this.a.gS();
    }

    @Override // defpackage.yfg
    public final boolean f() {
        return true;
    }

    @Override // defpackage.yhg
    public final Object h(int i) {
        return ((Map.Entry) this.a.entrySet().d().get(i)).getKey();
    }

    @Override // defpackage.yhg, defpackage.ygr, defpackage.yfg, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.yhg, defpackage.ygr, defpackage.yfg
    public Object writeReplace() {
        return new ygb(this.a);
    }
}
