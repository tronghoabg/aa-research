package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ph {
    public android.content.Intent a;
    private final android.content.IntentSender b;
    private int c;
    private int d;

    public ph(android.content.IntentSender intentSender) {
        intentSender.getClass();
        this.b = intentSender;
    }

    public final androidx.activity.result.IntentSenderRequest a() {
        return new androidx.activity.result.IntentSenderRequest(this.b, this.a, this.c, this.d);
    }

    public final void b(int i, int i2) {
        this.d = i;
        this.c = i2;
    }
}
