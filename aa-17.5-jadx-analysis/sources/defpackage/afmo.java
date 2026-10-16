package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class afmo extends afrj {
    public static final afmo INSTANCE = new afmo();

    private afmo() {
    }

    private final Void fail() {
        throw new aftw("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    @Override // defpackage.afrj
    public Collection<agbh> getConstructorDescriptors() {
        fail();
        throw new aezp();
    }

    @Override // defpackage.afrj
    public Collection<agnw> getConstructorsMetadata() {
        fail();
        throw new aezp();
    }

    @Override // defpackage.afrj
    public Collection<agcj> getFunctions(ahnj ahnjVar) {
        ahnjVar.getClass();
        fail();
        throw new aezp();
    }

    @Override // defpackage.afer
    public Class<?> getJClass() {
        fail();
        throw new aezp();
    }

    @Override // defpackage.afrj
    public agdn getLocalPropertyDescriptor(int i) {
        return null;
    }

    @Override // defpackage.afrj
    public agoj getLocalPropertyMetadata(int i) {
        return null;
    }

    public Collection<afhd<?>> getMembers() {
        fail();
        throw new aezp();
    }

    @Override // defpackage.afrj
    public Collection<agdn> getProperties(ahnj ahnjVar) {
        ahnjVar.getClass();
        fail();
        throw new aezp();
    }
}
