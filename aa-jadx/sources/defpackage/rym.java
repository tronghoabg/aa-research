package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class rym extends defpackage.rip {
    final /* synthetic */ defpackage.ryn a;

    public rym(defpackage.ryn rynVar) {
        this.a = rynVar;
    }

    @Override // defpackage.rip
    public final void a(android.content.Intent intent) {
        if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            this.a.g(defpackage.ryn.h(intent));
        }
    }
}
