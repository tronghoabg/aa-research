package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lvx implements defpackage.lud {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.ConversationUpdater");
    private final android.os.Handler b = new android.os.Handler(android.os.Looper.getMainLooper());
    private boolean c;

    public static void f(lxg lxgVar) {
        defpackage.wfp.c();
        defpackage.lxy.o().j(lxgVar);
    }

    @Override // defpackage.lud
    public final void a(luk lukVar, boolean z) {
        if (this.c) {
            this.b.post(new defpackage.jhc(lukVar, z, 8));
        }
    }

    @Override // defpackage.lud
    public final void b(defpackage.zaw zawVar, long j, int i) {
        if (this.c) {
            ((defpackage.yqj) a.l().ai(4331)).R("updateMessagingStreamItemAsRead. Type: %s Id: %d numRead: %d", zawVar, java.lang.Long.valueOf(j), java.lang.Integer.valueOf(i));
            boolean z = true;
            if (zawVar != defpackage.zaw.IM_NOTIFICATION && zawVar != defpackage.zaw.SMS_NOTIFICATION) {
                z = false;
            }
            defpackage.ysr.aX(z);
            this.b.post(new lvt(zawVar, j, i, 2));
        }
    }

    @Override // defpackage.lhn
    public final void d() {
        this.c = false;
        this.b.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.lud
    public final void e(luk lukVar) {
        if (this.c) {
            defpackage.yqm yqmVar = a;
            if (yqmVar.l().Z()) {
                ((defpackage.yqj) yqmVar.l().ai((char) 4332)).y("updateSmsConversation: %s", j$.util.Objects.toString(lukVar));
            }
            this.b.post(new defpackage.lmh(lukVar, 17));
        }
    }

    @Override // defpackage.lhn
    public final void eQ() {
        this.c = true;
    }
}
