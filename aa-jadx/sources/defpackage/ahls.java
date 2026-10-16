package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class ahls extends defpackage.affy implements defpackage.affc {
    public static final defpackage.ahls INSTANCE = new defpackage.ahls();

    public ahls() {
        super(1, defpackage.ahlr.class, "registerAllExtensions", "registerAllExtensions(Lorg/jetbrains/kotlin/protobuf/ExtensionRegistryLite;)V", 0);
    }

    @Override // defpackage.affc
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((defpackage.ahpg) obj);
        return defpackage.afbk.a;
    }

    public final void invoke(defpackage.ahpg ahpgVar) {
        defpackage.ahlr.registerAllExtensions(ahpgVar);
    }
}
