package defpackage;

/* loaded from: classes3.dex */
public final class afvn {
    private static final boolean loadMetadataDirectly;
    private static boolean newFakeOverridesImplementation;
    private static boolean useK1Implementation;

    static {
        Object objDE;
        Object objDE2;
        Object objDE3;
        try {
            objDE = System.getProperty("kotlin.reflect.jvm.useK1Implementation");
        } catch (Throwable th) {
            objDE = woy.dE(th);
        }
        if (true == (objDE instanceof aezv)) {
            objDE = null;
        }
        String str = (String) objDE;
        useK1Implementation = str != null && Boolean.parseBoolean(str);
        try {
            objDE2 = System.getProperty("kotlin.reflect.jvm.newFakeOverridesImplementation");
        } catch (Throwable th2) {
            objDE2 = woy.dE(th2);
        }
        if (true == (objDE2 instanceof aezv)) {
            objDE2 = null;
        }
        String str2 = (String) objDE2;
        newFakeOverridesImplementation = str2 != null && Boolean.parseBoolean(str2);
        try {
            objDE3 = System.getProperty("kotlin.reflect.jvm.loadMetadataDirectly");
        } catch (Throwable th3) {
            objDE3 = woy.dE(th3);
        }
        String str3 = (String) (true != (objDE3 instanceof aezv) ? objDE3 : null);
        loadMetadataDirectly = str3 != null && Boolean.parseBoolean(str3);
    }

    public static final boolean getLoadMetadataDirectly() {
        return loadMetadataDirectly;
    }

    public static final boolean getNewFakeOverridesImplementation() {
        return newFakeOverridesImplementation;
    }

    public static final boolean getUseK1Implementation() {
        return useK1Implementation;
    }
}
