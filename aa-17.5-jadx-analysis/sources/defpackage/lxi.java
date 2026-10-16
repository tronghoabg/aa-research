package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import mesquite.messaging.model.Message;

/* loaded from: classes2.dex */
public final class lxi extends lxj {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.SSbnConverter.ConvCE");

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lxj
    public final /* synthetic */ lvg a(Context context, StatusBarNotification statusBarNotification) {
        if (!j(statusBarNotification)) {
            return null;
        }
        ((ype) b.l().ai((char) 4433)).y("Using CarExtender to convert %s", statusBarNotification);
        ebf.j().C(yyv.SI_CREATION_USED_CAR_EXTENDER_ONLY, statusBarNotification.getPackageName());
        lxr.e();
        yzz yzzVar = yzz.MESSAGING;
        lxr.i(yzzVar, yzy.nj, statusBarNotification.getPackageName());
        lxr.e();
        lxr.i(yzzVar, yzy.nk, statusBarNotification.getPackageName());
        lwd lwdVar = new lwd(statusBarNotification, false);
        yfq yfqVarE = lwdVar.e();
        dst dstVarC = lwdVar.c();
        dst dstVarD = lwdVar.d();
        qjk qjkVar = new qjk();
        lxe.e(qjkVar, dstVarC, dstVarD);
        g(qjkVar, statusBarNotification, lwdVar.f(), lwdVar.b());
        int i = ((yls) yfqVarE).c;
        for (int i2 = 0; i2 < i; i2++) {
            Message message = (Message) yfqVarE.get(i2);
            qjkVar.a(new qjl(message.e.a.toString(), message.a, message.b, message.f));
        }
        lwa lwaVar = lwdVar.e;
        int iA = lwaVar.c() ? lwaVar.a() : statusBarNotification.getNotification().color;
        lud ludVarJ = lnm.j();
        mcd.b();
        boolean zI = ludVarJ.i(mcd.a(statusBarNotification));
        lvh lvhVarE = e(statusBarNotification);
        lvhVarE.l = new MessagingInfo(qjkVar);
        lvhVarE.m = iA;
        lvhVarE.j = lwdVar.a(context);
        lvi lviVar = new lvi(lvhVarE);
        if (!zI) {
            f(lviVar);
        }
        return lviVar;
    }

    @Override // defpackage.lxj
    protected final boolean b(StatusBarNotification statusBarNotification) {
        lwd lwdVar = new lwd(statusBarNotification, false);
        return lwdVar.j() && lwdVar.e != null;
    }
}
