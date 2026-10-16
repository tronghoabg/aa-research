package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jir extends defpackage.rce {
    public final defpackage.yfd a;
    final /* synthetic */ defpackage.jit b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jir(defpackage.jit jitVar, android.os.Looper looper) {
        super(null, looper);
        this.b = jitVar;
        this.a = new defpackage.yfd(10);
    }

    public final void a(long j) {
        sendMessageDelayed(obtainMessage(1), j);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        this.a.add(android.util.Pair.create(java.lang.Integer.valueOf(message.what), java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        int i = message.what;
        if (i == 1) {
            this.b.B();
        } else {
            if (i != 2) {
                return;
            }
            this.b.C((defpackage.jhl) message.obj);
        }
    }
}
