package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class sod extends defpackage.stq {
    final /* synthetic */ defpackage.sok a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sod(defpackage.sok sokVar, android.os.Looper looper) {
        super(looper);
        this.a = sokVar;
    }

    private static final void a(android.os.Message message) {
        defpackage.soe soeVar = (defpackage.soe) message.obj;
        if (soeVar != null) {
            soeVar.e();
        }
    }

    private static final boolean b(android.os.Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, smx] */
    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        java.lang.Object obj;
        defpackage.sok sokVar = this.a;
        if (sokVar.o.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !sokVar.q()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            sokVar.l = new com.google.android.gms.common.ConnectionResult(1, message.arg2, null, null, null);
            if (!sokVar.m) {
                android.text.TextUtils.isEmpty(sokVar.c());
            }
            defpackage.sok sokVar2 = this.a;
            com.google.android.gms.common.ConnectionResult connectionResult = sokVar2.l;
            if (connectionResult == null) {
                connectionResult = new com.google.android.gms.common.ConnectionResult(1, 8, null, null, null);
            }
            sokVar2.f.a(connectionResult);
            java.lang.System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            defpackage.sok sokVar3 = this.a;
            com.google.android.gms.common.ConnectionResult connectionResult2 = sokVar3.l;
            if (connectionResult2 == null) {
                connectionResult2 = new com.google.android.gms.common.ConnectionResult(1, 8, null, null, null);
            }
            sokVar3.f.a(connectionResult2);
            java.lang.System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.f.a(new com.google.android.gms.common.ConnectionResult(1, message.arg2, message.obj instanceof android.app.PendingIntent ? (android.app.PendingIntent) message.obj : null, null, null));
            java.lang.System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            defpackage.sok sokVar4 = this.a;
            sokVar4.G(5, null);
            defpackage.wyz wyzVar = sokVar4.t;
            if (wyzVar != null) {
                wyzVar.a.b(message.arg2);
            }
            int i = message.arg2;
            sokVar4.E();
            sokVar4.F(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.p()) {
            a(message);
            return;
        }
        if (!b(message)) {
            android.util.Log.wtf("GmsClient", defpackage.a.cb(message, "Don't know how to handle message: "), new java.lang.Exception());
            return;
        }
        defpackage.soe soeVar = (defpackage.soe) message.obj;
        synchronized (soeVar) {
            obj = soeVar.d;
            if (soeVar.e) {
                android.util.Log.w("GmsClient", defpackage.a.bV(soeVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            soeVar.c();
        }
        synchronized (soeVar) {
            soeVar.e = true;
        }
        soeVar.e();
    }
}
