package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class pmt implements java.util.function.Consumer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ pmt(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return;
            case 1:
                ((defpackage.rlw) this.a).d((pby) obj);
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                android.telephony.SmsMessage[] smsMessageArr = (android.telephony.SmsMessage[]) obj;
                java.lang.String originatingAddress = smsMessageArr[0].getOriginatingAddress();
                originatingAddress.getClass();
                android.content.Context context = (android.content.Context) this.a;
                java.lang.String strQ = defpackage.oeh.a().q(context, originatingAddress);
                android.graphics.Bitmap bitmapA = defpackage.oeh.a().a(context.getContentResolver(), originatingAddress);
                defpackage.ojm.a();
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                if (bitmapA == null) {
                    gni gniVar = new gni(context.getResources());
                    gniVar.b(strQ, originatingAddress);
                    gniVar.c();
                    bitmapA = gniVar.a(context.getResources().getDimensionPixelSize(2131168031));
                }
                int iHashCode = originatingAddress.hashCode();
                lxj lxjVar = new lxj();
                ((moh) lxjVar).h = iHashCode;
                lxjVar.a = java.util.Collections.singletonList(smsMessageArr);
                ((moh) lxjVar).i = context.getPackageName();
                ((moh) lxjVar).p = 4;
                lxjVar.d = epochMilli;
                lxjVar.f = strQ;
                lxjVar.g = originatingAddress;
                ((moh) lxjVar).y = 2131233464;
                ((moh) lxjVar).w = context.getResources().getColor(2131104370);
                lxjVar.d(bitmapA);
                ((moh) lxjVar).B = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI;
                ((lxh) lxjVar).e = defpackage.lnt.k().b(iHashCode);
                luk lxkVar = new lxk(lxjVar);
                lxkVar.s(defpackage.lwz.d().i());
                lxkVar.g(defpackage.lnt.k().j(lxkVar));
                defpackage.omf.u().x(14, defpackage.zaa.SI_CREATION_USED_SMS);
                defpackage.lxy.e();
                defpackage.zbe zbeVar = defpackage.zbe.MESSAGING;
                defpackage.lxy.i(zbeVar, defpackage.zbd.nj, context.getPackageName(), 0L);
                defpackage.lxy.e();
                defpackage.lxy.i(zbeVar, defpackage.zbd.nn, context.getPackageName(), 0L);
                defpackage.lnt.l().e(lxkVar);
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                xpu xpuVar = (xpu) obj;
                defpackage.abor aborVar = (defpackage.abor) this.a;
                aborVar.t();
                xps xpsVar = aborVar.b;
                xps xpsVar2 = xps.a;
                xpuVar.getClass();
                defpackage.abpj abpjVar = xpsVar.b;
                if (!abpjVar.c()) {
                    xpsVar.b = defpackage.abox.I(abpjVar);
                }
                xpsVar.b.add(xpuVar);
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                xpu xpuVar2 = (xpu) obj;
                defpackage.abor aborVar2 = (defpackage.abor) this.a;
                aborVar2.t();
                xps xpsVar3 = aborVar2.b;
                xps xpsVar4 = xps.a;
                xpuVar2.getClass();
                defpackage.abpj abpjVar2 = xpsVar3.c;
                if (!abpjVar2.c()) {
                    xpsVar3.c = defpackage.abox.I(abpjVar2);
                }
                xpsVar3.c.add(xpuVar2);
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((urn) this.a).d.b.n().b((twv) obj);
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((urn) this.a).d.b.l().a((tqp) obj);
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                twv twvVar = (twv) obj;
                tyg tygVarN = ((urn) this.a).d.b.n();
                tyg.e(twvVar);
                java.util.Set set = tygVarN.d;
                synchronized (set) {
                    set.remove(twvVar);
                    break;
                }
                twvVar.w();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                ((urn) this.a).d.b.l().b((tqp) obj);
                return;
            case 9:
                ((urn) this.a).d.b.n().d((twv) obj);
                return;
            case 10:
                ((urn) this.a).d.b.l().d((tqp) obj);
                return;
            case 11:
                ((urq) this.a).a.b.m().g((tqt) obj);
                return;
            case 12:
                ((urq) this.a).a.b.m().d((tqt) obj);
                return;
            case 13:
                ((urq) this.a).a.b.m().c((tqt) obj);
                return;
            case 14:
                ((twi) this.a).o((trb) obj);
                return;
            default:
                java.lang.Object obj2 = this.a;
                com.google.android.projection.gearhead.system.RecoveryLifecycleService recoveryLifecycleService = (com.google.android.projection.gearhead.system.RecoveryLifecycleService) obj2;
                recoveryLifecycleService.h.d((android.content.Context) obj2, recoveryLifecycleService.i, 2, (rza) obj);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer) {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
        }
        return j$.util.function.Consumer.-CC.$default$andThen(this, consumer);
    }
}
