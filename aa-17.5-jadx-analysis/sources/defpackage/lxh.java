package defpackage;

import android.app.Notification;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class lxh extends lxj {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.SSbnConverter.BPS");

    @Override // defpackage.lxj
    public final /* synthetic */ lvg a(Context context, StatusBarNotification statusBarNotification) {
        woy.N(j(statusBarNotification));
        ((ype) b.l().ai((char) 4432)).y("Using BigPicture to convert %s", statusBarNotification);
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
        lud ludVarJ = lnm.j();
        mcd.b();
        boolean zI = ludVarJ.i(mcd.a(statusBarNotification));
        lvh lvhVarE = e(statusBarNotification);
        lvhVarE.l = new MessagingInfo(qjkVar);
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
        return lwdVar.j() && lwdVar.d != null;
    }
}
