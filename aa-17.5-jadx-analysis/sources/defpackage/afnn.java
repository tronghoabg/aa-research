package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
public final class afnn extends aful {
    private final afnl callable;
    private final int index;
    private final Method method;
    private final aezr type$delegate;

    public afnn(afnl afnlVar, Method method, int i) {
        afnlVar.getClass();
        method.getClass();
        this.callable = afnlVar;
        this.method = method;
        this.index = i;
        this.type$delegate = woy.dH(2, new afnm(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib type_delegate$lambda$0(afnn afnnVar) {
        Type genericReturnType = afnnVar.method.getGenericReturnType();
        genericReturnType.getClass();
        return afjs.toKType$default(genericReturnType, afbf.a, afvo.NOT_NULL, true, false, null, 24, null);
    }

    @Override // defpackage.aful, defpackage.afhc
    public List<Annotation> getAnnotations() {
        return afbe.a;
    }

    @Override // defpackage.aful
    public boolean getDeclaresDefaultValue() {
        return isOptional();
    }

    @Override // defpackage.afhr
    public int getIndex() {
        return this.index;
    }

    @Override // defpackage.afhr
    public afhq getKind() {
        return afhq.d;
    }

    @Override // defpackage.afhr
    public String getName() {
        String name = this.method.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.afhr
    public afib getType() {
        return (afib) this.type$delegate.a();
    }

    @Override // defpackage.afhr
    public boolean isOptional() {
        return this.method.getDefaultValue() != null;
    }

    @Override // defpackage.afhr
    public boolean isVararg() {
        return affa.f(getName(), "value") && this.method.getReturnType().isArray();
    }

    @Override // defpackage.aful
    public afnl getCallable() {
        return this.callable;
    }
}
