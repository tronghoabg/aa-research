package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes3.dex */
public final class afkd extends aful {
    private final afun<?> property;

    public afkd(afun<?> afunVar) {
        afunVar.getClass();
        this.property = afunVar;
    }

    @Override // defpackage.aful, defpackage.afhc
    public List<Annotation> getAnnotations() {
        return afbe.a;
    }

    @Override // defpackage.aful
    public afue<?> getCallable() {
        afun<?> afunVar = this.property;
        afunVar.getClass();
        afhi setter = ((afhp) afunVar).getSetter();
        setter.getClass();
        return (afue) setter;
    }

    @Override // defpackage.aful
    public boolean getDeclaresDefaultValue() {
        return false;
    }

    @Override // defpackage.afhr
    public int getIndex() {
        return 0;
    }

    @Override // defpackage.afhr
    public afhq getKind() {
        return afhq.d;
    }

    @Override // defpackage.afhr
    public String getName() {
        return null;
    }

    @Override // defpackage.afhr
    public afib getType() {
        return this.property.getReturnType();
    }

    @Override // defpackage.afhr
    public boolean isOptional() {
        return false;
    }

    @Override // defpackage.afhr
    public boolean isVararg() {
        return false;
    }
}
