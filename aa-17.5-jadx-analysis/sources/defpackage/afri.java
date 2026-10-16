package defpackage;

/* loaded from: classes.dex */
public class afri {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(afri.class, "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;", 0)};
    private final afup moduleData$delegate;
    final /* synthetic */ afrj this$0;

    public afri(afrj afrjVar) {
        this.this$0 = afrjVar;
        this.moduleData$delegate = afus.lazySoft(new afrh(afrjVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agjq moduleData_delegate$lambda$0(afrj afrjVar) {
        return afud.getOrCreateModule(afrjVar.getJClass());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final agjq getModuleData() {
        T value = this.moduleData$delegate.getValue(this, $$delegatedProperties[0]);
        value.getClass();
        return (agjq) value;
    }
}
