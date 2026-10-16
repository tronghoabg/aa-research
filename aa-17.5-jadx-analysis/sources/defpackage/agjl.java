package defpackage;

import java.io.InputStream;

/* loaded from: classes3.dex */
public final class agjl implements ahfc {
    private final aiav builtInsResourceLoader;
    private final ClassLoader classLoader;

    public agjl(ClassLoader classLoader) {
        classLoader.getClass();
        this.classLoader = classLoader;
        this.builtInsResourceLoader = new aiav();
    }

    private final ahfb findKotlinClass(String str) {
        agjk agjkVarCreate;
        Class<?> clsTryLoadClass = agji.tryLoadClass(this.classLoader, str);
        if (clsTryLoadClass == null || (agjkVarCreate = agjk.Factory.create(clsTryLoadClass)) == null) {
            return null;
        }
        return new ahfa(agjkVarCreate, null, 2, null);
    }

    @Override // defpackage.ahzm
    public InputStream findBuiltInsData(ahnf ahnfVar) {
        ahnfVar.getClass();
        if (ahnfVar.startsWith(afyo.BUILT_INS_PACKAGE_NAME)) {
            return this.builtInsResourceLoader.loadResource(aiar.INSTANCE.getBuiltInsFilePath(ahnfVar));
        }
        return null;
    }

    @Override // defpackage.ahfc
    public ahfb findKotlinClassOrContent(agzj agzjVar, ahlc ahlcVar) {
        String strAsString;
        agzjVar.getClass();
        ahlcVar.getClass();
        ahnf fqName = agzjVar.getFqName();
        if (fqName == null || (strAsString = fqName.asString()) == null) {
            return null;
        }
        return findKotlinClass(strAsString);
    }

    @Override // defpackage.ahfc
    public ahfb findKotlinClassOrContent(ahnd ahndVar, ahlc ahlcVar) {
        ahndVar.getClass();
        ahlcVar.getClass();
        return findKotlinClass(agjm.toRuntimeFqName(ahndVar));
    }
}
