package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class soo extends defpackage.soq {
    final /* synthetic */ android.content.Intent a;
    final /* synthetic */ android.app.Activity b;
    final /* synthetic */ int c;

    public soo(android.content.Intent intent, android.app.Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // defpackage.soq
    public final void a() {
        android.content.Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
