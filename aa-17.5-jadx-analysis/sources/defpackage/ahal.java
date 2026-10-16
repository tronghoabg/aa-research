package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class ahal implements agfk {
    private final ahnf fqNameToMatch;

    public ahal(ahnf ahnfVar) {
        ahnfVar.getClass();
        this.fqNameToMatch = ahnfVar;
    }

    @Override // defpackage.agfk
    public ahak findAnnotation(ahnf ahnfVar) {
        ahnfVar.getClass();
        if (affa.f(ahnfVar, this.fqNameToMatch)) {
            return ahak.INSTANCE;
        }
        return null;
    }

    @Override // defpackage.agfk
    public /* bridge */ boolean hasAnnotation(ahnf ahnfVar) {
        return agfj.hasAnnotation(this, ahnfVar);
    }

    @Override // defpackage.agfk
    public boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<agfc> iterator() {
        return afbd.a;
    }
}
