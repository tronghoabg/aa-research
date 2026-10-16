package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import mesquite.messaging.model.Message;

/* loaded from: classes.dex */
public final class lxg extends lxn {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.SSbnConverter.CE");

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnt
    public final /* synthetic */ moa a(Context context, Object obj) {
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        if (!i(context, statusBarNotification)) {
            return null;
        }
        ((ype) b.l().ai((char) 4431)).y("Using CarExtender to convert %s", obj);
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
        luc lucVarK = lnm.k();
        mcd.b();
        boolean zI = lucVarK.i(mcd.a(statusBarNotification));
        lwy lwyVarE = e(statusBarNotification);
        lwyVarE.a = new MessagingInfo(qjkVar);
        lwyVarE.w = iA;
        lwyVarE.d(lwdVar.a(context));
        lwz lwzVar = new lwz(lwyVarE);
        if (!zI) {
            f(lwzVar);
        }
        return lwzVar;
    }

    @Override // defpackage.lxn
    protected final boolean b(StatusBarNotification statusBarNotification) {
        lwd lwdVar = new lwd(statusBarNotification, false);
        return lwdVar.j() && lwdVar.e != null;
    }
}
