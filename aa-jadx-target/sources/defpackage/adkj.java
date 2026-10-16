package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adkj implements java.lang.Runnable {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public adkj(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r6v41, types: [adxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v42, types: [adxi, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                try {
                    ((adkk) this.a).j(new java.util.concurrent.TimeoutException("context timed out"));
                    return;
                } catch (java.lang.Throwable th) {
                    defpackage.adkr.c.logp(java.util.logging.Level.SEVERE, "io.grpc.Context$CancellableContext$1CancelOnExpiration", "run", "Cancel threw an exception, which should not happen", th);
                    return;
                }
            case 1:
                aahh aahhVar = (aahh) this.a;
                aahhVar.c.b();
                if (!aahhVar.d) {
                    aahhVar.d = true;
                    aahhVar.a();
                    aahhVar.f = aahl.a;
                    return;
                } else {
                    java.lang.String str = aahh.a;
                    if (zsr.e(str, 6)) {
                        android.util.Log.e(str, "onDestroy() called more than once!");
                        return;
                    }
                    return;
                }
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.adps) this.a).m();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                ((defpackage.adps) this.a).o();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                ((adpx) this.a).b();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                java.lang.Object obj = this.a;
                synchronized (obj) {
                    if (((defpackage.adqa) obj).C(4)) {
                        ((defpackage.adqa) obj).w(((defpackage.adqa) obj).o, true);
                    }
                    break;
                }
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                adqq adqqVar = (adqq) this.a;
                defpackage.ysr.bk(adqqVar.i == null, "Already registered!");
                adqqVar.i = new adqp(adqqVar);
                android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                intentFilter.addDataScheme("package");
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                android.content.BroadcastReceiver broadcastReceiver = adqqVar.i;
                android.content.Context context = adqqVar.e;
                context.registerReceiver(broadcastReceiver, intentFilter);
                context.registerReceiver(adqqVar.i, new android.content.IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                adqq adqqVar2 = (adqq) this.a;
                defpackage.adox adoxVar = adqqVar2.g;
                adoxVar.c();
                defpackage.ysr.bj(adqqVar2.k != null);
                defpackage.ysr.bj(adqqVar2.k.isDone());
                defpackage.adrs adrsVar = adqqVar2.l;
                adrsVar.getClass();
                defpackage.ysr.cy(adqqVar2.k, new adqo(adrsVar, 0), adoxVar);
                adqqVar2.k = null;
                if (adqqVar2.j) {
                    adqqVar2.j = false;
                    adqqVar2.e();
                    return;
                }
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                adqq adqqVar3 = (adqq) this.a;
                android.content.BroadcastReceiver broadcastReceiver2 = adqqVar3.i;
                if (broadcastReceiver2 != null) {
                    adqqVar3.e.unregisterReceiver(broadcastReceiver2);
                    adqqVar3.i = null;
                    return;
                }
                return;
            case 9:
                ((adqq) this.a).e();
                return;
            case 10:
                ((defpackage.adox) this.a).a();
                return;
            case 11:
                adsd adsdVar = (adsd) this.a;
                adxi adxiVar = adsdVar.b;
                defpackage.adjs adjsVar = adsdVar.g;
                adxiVar.h();
                adsdVar.g = adjsVar;
                adsdVar.b.b();
                return;
            case 12:
                defpackage.adst adstVar = (defpackage.adst) this.a;
                defpackage.aecg aecgVar = adstVar.e;
                if (aecgVar != null && aecgVar.i()) {
                    aecgVar.h();
                }
                adstVar.d = null;
                return;
            case 13:
                ((adud) this.a).g.j();
                return;
            case 14:
                ((aduc) this.a).o();
                return;
            case 15:
                this.a.a(true);
                return;
            case 16:
                this.a.a(false);
                return;
            case 17:
                defpackage.adww adwwVar = ((defpackage.adwk) this.a).a;
                defpackage.ysr.bk(adwwVar.z.get(), "Channel must have been shut down");
                adwwVar.A = true;
                adwwVar.l(false);
                adwwVar.j();
                return;
            case 18:
                adxi adxiVar2 = ((defpackage.aduf) this.a).f;
                defpackage.aeat aeatVar = defpackage.aeat.SUBCHANNEL_SHUTDOWN;
                defpackage.ysr.bk(((defpackage.adwk) adxiVar2).a.z.get(), "Channel must have been shut down");
                return;
            case 19:
                ((defpackage.adui) this.a).f.f();
                return;
            default:
                ((defpackage.adui) this.a).t();
                return;
        }
    }

    public /* synthetic */ adkj(java.lang.Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
