package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class jku extends android.app.Presentation {
    public android.view.View a;
    final /* synthetic */ defpackage.jkv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jku(defpackage.jkv jkvVar, android.content.Context context, android.view.Display display) {
        super(context, display);
        this.b = jkvVar;
    }

    @Override // android.app.Dialog
    public final void onCreate(android.os.Bundle bundle) {
        android.content.Context context = getContext();
        context.getClass();
        defpackage.jkt jktVar = new defpackage.jkt(this, context);
        this.a = jktVar;
        jktVar.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        setContentView(this.a);
    }
}
