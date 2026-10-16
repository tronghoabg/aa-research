package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agfl implements agfk {
    private final List<agfc> annotations;

    /* JADX WARN: Multi-variable type inference failed */
    public agfl(List<? extends agfc> list) {
        list.getClass();
        this.annotations = list;
    }

    @Override // defpackage.agfk
    public /* bridge */ agfc findAnnotation(ahnf ahnfVar) {
        return agfj.findAnnotation(this, ahnfVar);
    }

    @Override // defpackage.agfk
    public /* bridge */ boolean hasAnnotation(ahnf ahnfVar) {
        return agfj.hasAnnotation(this, ahnfVar);
    }

    @Override // defpackage.agfk
    public boolean isEmpty() {
        return this.annotations.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<agfc> iterator() {
        return this.annotations.iterator();
    }

    public String toString() {
        return this.annotations.toString();
    }
}
