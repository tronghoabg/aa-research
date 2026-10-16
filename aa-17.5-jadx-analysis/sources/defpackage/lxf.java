package defpackage;

import android.app.Notification;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class lxf extends lxn {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.SSbnConverter.BPS");

    @Override // defpackage.mnt
    public final /* synthetic */ moa a(Context context, Object obj) {
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        woy.N(i(context, statusBarNotification));
        ((ype) b.l().ai((char) 4430)).y("Using BigPicture to convert %s", obj);
        ebf.j().C(yyv.SI_CREATION_USED_BIG_PICTURE_STYLE_ONLY, statusBarNotification.getPackageName());
        lxr.e();
        yzz yzzVar = yzz.MESSAGING;
        lxr.i(yzzVar, yzy.nj, statusBarNotification.getPackageName());
        lxr.e();
        lxr.i(yzzVar, yzy.nm, statusBarNotification.getPackageName());
        Notification notification = statusBarNotification.getNotification();
        lwd lwdVar = new lwd(statusBarNotification, false);
        String string = notification.extras.getString("android.title");
        String string2 = context.getString(R.string.big_picture_message_text);
        dst dstVarC = lwdVar.c();
        dst dstVarD = lwdVar.d();
        qjk qjkVar = new qjk();
        g(qjkVar, statusBarNotification, string, lwdVar.b());
        lxe.e(qjkVar, dstVarC, dstVarD);
        qjkVar.a(new qjl(string, string, string2, statusBarNotification.getPostTime()));
        luc lucVarK = lnm.k();
        mcd.b();
        boolean zI = lucVarK.i(mcd.a(statusBarNotification));
        lwy lwyVarE = e(statusBarNotification);
        lwyVarE.a = new MessagingInfo(qjkVar);
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
        return lwdVar.j() && lwdVar.d != null;
    }
}
