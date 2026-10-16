package defpackage;

/* loaded from: classes3.dex */
final /* synthetic */ class ahks extends afey implements afec {
    public static final ahks INSTANCE = new ahks();

    public ahks() {
        super(1, ahkr.class, "registerAllExtensions", "registerAllExtensions(Lorg/jetbrains/kotlin/protobuf/ExtensionRegistryLite;)V", 0);
    }

    @Override // defpackage.afec
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ahog) obj);
        return afak.a;
    }

    public final void invoke(ahog ahogVar) {
        ahkr.registerAllExtensions(ahogVar);
    }
}
