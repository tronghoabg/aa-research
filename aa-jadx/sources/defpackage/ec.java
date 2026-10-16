package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ec implements java.lang.Runnable {
    final int a;
    final android.os.Bundle b;
    final /* synthetic */ android.support.v4.os.ResultReceiver c;

    public ec(android.support.v4.os.ResultReceiver resultReceiver, int i, android.os.Bundle bundle) {
        this.c = resultReceiver;
        this.a = i;
        this.b = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a(this.a, this.b);
    }
}
