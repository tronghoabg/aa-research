package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nfb extends defpackage.mdl {
    @Override // defpackage.mdl
    protected final defpackage.vlu a() {
        return new defpackage.vlu("TemperatureUnitReceiver");
    }

    @Override // defpackage.mdl
    public final void b(android.content.Context context, android.content.Intent intent) {
        if (defpackage.afga.f("android.intent.action.LOCALE_CHANGED", intent != null ? intent.getAction() : null)) {
            defpackage.ool.a().i();
        }
    }

    public final void c(android.content.Context context) {
        defpackage.duw.e(context, this, new android.content.IntentFilter("android.intent.action.LOCALE_CHANGED"), null, 2);
    }
}
