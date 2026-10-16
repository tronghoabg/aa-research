package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class agle extends agkx implements agzu {
    private final ahnf fqName;

    public agle(ahnf ahnfVar) {
        ahnfVar.getClass();
        this.fqName = ahnfVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof agle) && affa.f(getFqName(), ((agle) obj).getFqName());
    }

    @Override // defpackage.agzh
    public agzf findAnnotation(ahnf ahnfVar) {
        ahnfVar.getClass();
        return null;
    }

    @Override // defpackage.agzu
    public Collection<agzj> getClasses(afec<? super ahnj, Boolean> afecVar) {
        afecVar.getClass();
        return afbe.a;
    }

    @Override // defpackage.agzu
    public ahnf getFqName() {
        return this.fqName;
    }

    @Override // defpackage.agzu
    public Collection<agzu> getSubPackages() {
        return afbe.a;
    }

    public int hashCode() {
        return getFqName().hashCode();
    }

    @Override // defpackage.agzh
    public boolean isDeprecatedInJavaDoc() {
        return false;
    }

    public String toString() {
        return getClass().getName() + ": " + getFqName();
    }

    @Override // defpackage.agzh
    public List<agzf> getAnnotations() {
        return afbe.a;
    }
}
