package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agre {
    static final /* synthetic */ defpackage.agre $$INSTANCE = new defpackage.agre();
    private static final defpackage.afar<java.util.List<defpackage.agrf>> INSTANCES$delegate = defpackage.afga.cA(defpackage.agrd.INSTANCE);

    private agre() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List INSTANCES_delegate$lambda$0() {
        java.util.ServiceLoader serviceLoaderLoad = java.util.ServiceLoader.load(defpackage.agrf.class, defpackage.agrf.class.getClassLoader());
        serviceLoaderLoad.getClass();
        java.util.List listAZ = defpackage.afga.aZ(serviceLoaderLoad);
        if (listAZ.isEmpty()) {
            throw new java.lang.IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return listAZ;
    }

    public final java.util.List<defpackage.agrf> getINSTANCES$org_jetbrains_kotlin_kotlin_metadata() {
        return (java.util.List) INSTANCES$delegate.a();
    }
}
