package defpackage;

/* loaded from: classes2.dex */
final class ajxv implements ajsq {
    final /* synthetic */ ajtg a;
    final /* synthetic */ ajxw b;
    final /* synthetic */ ajxs c;

    public ajxv(ajxw ajxwVar, ajxs ajxsVar, ajtg ajtgVar) {
        this.c = ajxsVar;
        this.a = ajtgVar;
        this.b = ajxwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02fd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02f7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011f  */
    @Override // defpackage.ajsq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ajsy a(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, defpackage.ajst {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajxv.a(long, java.util.concurrent.TimeUnit):ajsy");
    }

    @Override // defpackage.ajsq
    public final void b() {
        ajxs ajxsVar = this.c;
        ajxsVar.d.d.lock();
        try {
            ajxy ajxyVar = ajxsVar.a;
            ajxyVar.b = true;
            ajxx ajxxVar = ajxyVar.a;
            if (ajxxVar != null) {
                ajxxVar.a();
            }
        } finally {
            ajxsVar.d.d.unlock();
        }
    }
}
