package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.provider.Settings;
import android.telephony.SmsMessage;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.system.RecoveryLifecycleService;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.Collections;
import java.util.Set;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final /* synthetic */ class qio implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qio(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                SmsMessage[] smsMessageArr = (SmsMessage[]) obj;
                String originatingAddress = smsMessageArr[0].getOriginatingAddress();
                originatingAddress.getClass();
                Context context = (Context) this.a;
                String strQ = odn.a().q(context, originatingAddress);
                Bitmap bitmapA = odn.a().a(context.getContentResolver(), originatingAddress);
                oit.a();
                long epochMilli = Instant.now().toEpochMilli();
                if (bitmapA == null) {
                    gnb gnbVar = new gnb(context.getResources());
                    gnbVar.b(strQ, originatingAddress);
                    gnbVar.c();
                    bitmapA = gnbVar.a(context.getResources().getDimensionPixelSize(R.dimen.notification_icon_size));
                }
                int iHashCode = originatingAddress.hashCode();
                lxc lxcVar = new lxc();
                lxcVar.h = iHashCode;
                lxcVar.a = Collections.singletonList(smsMessageArr);
                lxcVar.i = context.getPackageName();
                lxcVar.p = 4;
                lxcVar.d = epochMilli;
                lxcVar.f = strQ;
                lxcVar.g = originatingAddress;
                lxcVar.y = 2131233464;
                lxcVar.w = context.getResources().getColor(R.color.sms_badge_background_color);
                lxcVar.d(bitmapA);
                lxcVar.B = Settings.System.DEFAULT_NOTIFICATION_URI;
                lxcVar.e = lnm.k().b(iHashCode);
                lxd lxdVar = new lxd(lxcVar);
                lxdVar.s(lws.d().i());
                lxdVar.g(lnm.k().j(lxdVar));
                ebf.j().x(14, yyv.SI_CREATION_USED_SMS);
                lxr.e();
                yzz yzzVar = yzz.MESSAGING;
                lxr.i(yzzVar, yzy.nj, context.getPackageName());
                lxr.e();
                lxr.i(yzzVar, yzy.nn, context.getPackageName());
                lnm.l().e(lxdVar);
                return;
            case 1:
                return;
            case 2:
                xot xotVar = (xot) obj;
                abnp abnpVar = (abnp) this.a;
                abnpVar.t();
                xor xorVar = (xor) abnpVar.b;
                xor xorVar2 = xor.a;
                xotVar.getClass();
                aboh abohVar = xorVar.b;
                if (!abohVar.c()) {
                    xorVar.b = abnv.I(abohVar);
                }
                xorVar.b.add(xotVar);
                return;
            case 3:
                xot xotVar2 = (xot) obj;
                abnp abnpVar2 = (abnp) this.a;
                abnpVar2.t();
                xor xorVar3 = (xor) abnpVar2.b;
                xor xorVar4 = xor.a;
                xotVar2.getClass();
                aboh abohVar2 = xorVar3.c;
                if (!abohVar2.c()) {
                    xorVar3.c = abnv.I(abohVar2);
                }
                xorVar3.c.add(xotVar2);
                return;
            case 4:
                ((BasePendingResult) this.a).j((Status) obj);
                return;
            case 5:
                ((slt) this.a).f((Status) obj);
                return;
            case 6:
                ((uqp) this.a).d.b.n().b((tvz) obj);
                return;
            case 7:
                ((uqp) this.a).d.b.l().a((tpr) obj);
                return;
            case 8:
                tvz tvzVar = (tvz) obj;
                txj txjVarN = ((uqp) this.a).d.b.n();
                txj.e(tvzVar);
                Set set = txjVarN.d;
                synchronized (set) {
                    set.remove(tvzVar);
                }
                tvzVar.w();
                return;
            case 9:
                ((uqp) this.a).d.b.l().b((tpr) obj);
                return;
            case 10:
                ((uqp) this.a).d.b.n().d((tvz) obj);
                return;
            case 11:
                ((uqp) this.a).d.b.l().d((tpr) obj);
                return;
            case 12:
                ((uqs) this.a).a.b.m().g((tpv) obj);
                return;
            case 13:
                ((uqs) this.a).a.b.m().d((tpv) obj);
                return;
            case 14:
                ((uqs) this.a).a.b.m().c((tpv) obj);
                return;
            case 15:
                ((tvl) this.a).o((tqd) obj);
                return;
            default:
                Object obj2 = this.a;
                RecoveryLifecycleService recoveryLifecycleService = (RecoveryLifecycleService) obj2;
                recoveryLifecycleService.h.d((Context) obj2, recoveryLifecycleService.i, 2, (ryf) obj);
                return;
        }
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
