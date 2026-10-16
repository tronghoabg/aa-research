package defpackage;

import java.util.List;
import java.util.ServiceLoader;

/* loaded from: classes3.dex */
public final class agqe {
    static final /* synthetic */ agqe $$INSTANCE = new agqe();
    private static final aezr<List<agqf>> INSTANCES$delegate = woy.dG(agqd.INSTANCE);

    private agqe() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List INSTANCES_delegate$lambda$0() {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(agqf.class, agqf.class.getClassLoader());
        serviceLoaderLoad.getClass();
        List listCf = woy.cf(serviceLoaderLoad);
        if (listCf.isEmpty()) {
            throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return listCf;
    }

    public final List<agqf> getINSTANCES$org_jetbrains_kotlin_kotlin_metadata() {
        return (List) INSTANCES$delegate.a();
    }
}
