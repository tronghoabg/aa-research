package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* loaded from: classes3.dex */
public final class afnd extends aful {
    private final afue<?> callable;
    private final afib type;

    public afnd(afue<?> afueVar, afhe<?> afheVar) {
        afueVar.getClass();
        afheVar.getClass();
        this.callable = afueVar;
        this.type = afir.b(afheVar);
    }

    @Override // defpackage.aful, defpackage.afhc
    public List<Annotation> getAnnotations() {
        return afbe.a;
    }

    @Override // defpackage.aful
    public afue<?> getCallable() {
        return this.callable;
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
        return afhq.a;
    }

    @Override // defpackage.afhr
    public String getName() {
        return null;
    }

    @Override // defpackage.afhr
    public afib getType() {
        return this.type;
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
