package defpackage;

/* loaded from: classes3.dex */
final class afzo extends afye {
    public static final afzn Companion = new afzn(null);
    private static final afye Instance = new afzo();

    private afzo() {
        super(new aidz("FallbackBuiltIns"));
        createBuiltInsModule(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afye
    public agfz getPlatformDependentDeclarationFilter() {
        return agfz.INSTANCE;
    }
}
