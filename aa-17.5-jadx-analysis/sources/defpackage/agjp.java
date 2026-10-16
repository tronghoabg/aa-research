package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class agjp {
    private agjp() {
    }

    public final agjq create(ClassLoader classLoader) {
        classLoader.getClass();
        agjl agjlVar = new agjl(classLoader);
        aheh ahehVar = ahei.Companion;
        ClassLoader classLoader2 = afak.class.getClassLoader();
        classLoader2.getClass();
        agjl agjlVar2 = new agjl(classLoader2);
        agjh agjhVar = new agjh(classLoader);
        Objects.toString(classLoader);
        aheg ahegVarCreateModuleData = ahehVar.createModuleData(agjlVar, agjlVar2, agjhVar, "runtime module for ".concat(classLoader.toString()), agjo.INSTANCE, agjs.INSTANCE);
        return new agjq(ahegVarCreateModuleData.getDeserializationComponentsForJava().getComponents(), new agje(ahegVarCreateModuleData.getDeserializedDescriptorResolver(), agjlVar), null);
    }

    public /* synthetic */ agjp(afeu afeuVar) {
        this();
    }
}
