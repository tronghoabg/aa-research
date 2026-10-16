package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sop extends defpackage.soq {
    final /* synthetic */ android.content.Intent a;
    final /* synthetic */ defpackage.snl b;

    public sop(android.content.Intent intent, defpackage.snl snlVar) {
        this.a = intent;
        this.b = snlVar;
    }

    @Override // defpackage.soq
    public final void a() {
        android.content.Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
