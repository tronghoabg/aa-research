package defpackage;

import java.util.ServiceLoader;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;

/* loaded from: classes3.dex */
public final class afxq {
    public static final /* synthetic */ afxq $$INSTANCE = new afxq();
    private static final aezr<BuiltInsLoader> Instance$delegate = woy.dH(2, afxp.INSTANCE);

    private afxq() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuiltInsLoader Instance_delegate$lambda$0() {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(BuiltInsLoader.class, BuiltInsLoader.class.getClassLoader());
        serviceLoaderLoad.getClass();
        BuiltInsLoader builtInsLoader = (BuiltInsLoader) woy.bG(serviceLoaderLoad);
        if (builtInsLoader != null) {
            return builtInsLoader;
        }
        throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
    }

    public final BuiltInsLoader getInstance() {
        return (BuiltInsLoader) Instance$delegate.a();
    }
}
