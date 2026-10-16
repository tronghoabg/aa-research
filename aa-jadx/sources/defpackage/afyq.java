package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afyq {
    public static final /* synthetic */ defpackage.afyq $$INSTANCE = new defpackage.afyq();
    private static final defpackage.afar<kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader> Instance$delegate = defpackage.afga.cB(2, defpackage.afyp.INSTANCE);

    private afyq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader Instance_delegate$lambda$0() {
        java.util.ServiceLoader serviceLoaderLoad = java.util.ServiceLoader.load(kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.class, kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader.class.getClassLoader());
        serviceLoaderLoad.getClass();
        kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader builtInsLoader = (kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader) defpackage.afga.aA(serviceLoaderLoad);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new java.lang.IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }

    public final kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader getInstance() {
        return (kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader) Instance$delegate.a();
    }
}
