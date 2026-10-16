package defpackage;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class agfh implements agfk {
    /* renamed from: findAnnotation, reason: collision with other method in class */
    public Void m78findAnnotation(ahnf ahnfVar) {
        ahnfVar.getClass();
        return null;
    }

    @Override // defpackage.agfk
    public /* bridge */ boolean hasAnnotation(ahnf ahnfVar) {
        return agfj.hasAnnotation(this, ahnfVar);
    }

    @Override // defpackage.agfk
    public boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<agfc> iterator() {
        return afbd.a;
    }

    public String toString() {
        return "EMPTY";
    }

    @Override // defpackage.agfk
    public /* bridge */ /* synthetic */ agfc findAnnotation(ahnf ahnfVar) {
        m78findAnnotation(ahnfVar);
        return null;
    }
}
