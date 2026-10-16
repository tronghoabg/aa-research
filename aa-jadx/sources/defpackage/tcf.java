package defpackage;

/* JADX INFO: loaded from: classes.dex */
final class tcf extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.tcg a;

    public tcf(defpackage.tcg tcgVar) {
        this.a = tcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.a.m(intent);
    }
}
