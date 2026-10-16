package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class aglf extends agli implements agzw {
    private final Collection<agzf> annotations;
    private final boolean isDeprecatedInJavaDoc;
    private final Class<?> reflectType;

    public aglf(Class<?> cls) {
        cls.getClass();
        this.reflectType = cls;
        this.annotations = afbe.a;
    }

    @Override // defpackage.agzh
    public Collection<agzf> getAnnotations() {
        return this.annotations;
    }

    public afyi getType() {
        if (affa.f(getReflectType(), Void.TYPE)) {
            return null;
        }
        return ahwe.get(getReflectType().getName()).getPrimitiveType();
    }

    @Override // defpackage.agzh
    public boolean isDeprecatedInJavaDoc() {
        return this.isDeprecatedInJavaDoc;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agli
    public Class<?> getReflectType() {
        return this.reflectType;
    }
}
