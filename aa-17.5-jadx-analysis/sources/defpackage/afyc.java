package defpackage;

/* loaded from: classes3.dex */
final class afyc implements afdr {
    final /* synthetic */ afye this$0;
    final /* synthetic */ agic val$module;

    public afyc(afye afyeVar, agic agicVar) {
        this.this$0 = afyeVar;
        this.val$module = agicVar;
    }

    @Override // defpackage.afdr
    public Void invoke() {
        agic agicVar = this.this$0.builtInsModule;
        afye afyeVar = this.this$0;
        if (agicVar == null) {
            afyeVar.builtInsModule = this.val$module;
            return null;
        }
        throw new AssertionError("Built-ins module is already set: " + afyeVar.builtInsModule + " (attempting to reset to " + this.val$module + ")");
    }

    @Override // defpackage.afdr
    public /* bridge */ /* synthetic */ Object invoke() {
        invoke();
        return null;
    }
}
