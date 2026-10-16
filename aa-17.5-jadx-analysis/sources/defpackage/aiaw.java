package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class aiaw implements agfk {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(aiaw.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};
    private final aiec annotations$delegate;

    public aiaw(aiei aieiVar, afdr<? extends List<? extends agfc>> afdrVar) {
        aieiVar.getClass();
        afdrVar.getClass();
        this.annotations$delegate = aieiVar.createLazyValue(afdrVar);
    }

    private final List<agfc> getAnnotations() {
        return (List) aieh.getValue(this.annotations$delegate, this, $$delegatedProperties[0]);
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
        return getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<agfc> iterator() {
        return getAnnotations().iterator();
    }
}
