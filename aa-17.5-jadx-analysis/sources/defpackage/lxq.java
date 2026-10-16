package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import mesquite.messaging.model.Message;

/* loaded from: classes.dex */
public final class lxq extends lxn {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.SSbnConverter.MS");

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mnt
    @ResultIgnorabilityUnspecified
    public final /* synthetic */ moa a(Context context, Object obj) {
        Long l;
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        if (!i(context, statusBarNotification)) {
            return null;
        }
        yph yphVar = b;
        ((ype) yphVar.l().ai((char) 4443)).y("Using MessagingStyle to convert %s", obj);
        boolean z = false;
        lwd lwdVar = new lwd(statusBarNotification, false);
        String strF = lwdVar.f();
        lwe lweVar = lwdVar.c;
        lweVar.getClass();
        if (lweVar.b()) {
            return null;
        }
        yfq yfqVarE = lwdVar.e();
        if (lvx.e(yfqVarE, statusBarNotification.getPackageName())) {
            ((ype) yphVar.l().ai((char) 4446)).y("Dropped bugle voice message that contains null URI or Uri.EMPTY, sbn: %s", obj);
            return null;
        }
        dst dstVarC = lwdVar.c();
        dstVarC.getClass();
        dst dstVarD = lwdVar.d();
        dstVarD.getClass();
        qjk qjkVar = new qjk();
        qjkVar.m = lwdVar.i();
        g(qjkVar, statusBarNotification, strF, lwdVar.b());
        lxe.e(qjkVar, dstVarC, dstVarD);
        ynp ynpVarListIterator = yfqVarE.listIterator(0);
        while (ynpVarListIterator.hasNext()) {
            Message message = (Message) ynpVarListIterator.next();
            duk dukVar = message.e;
            ntn ntnVar = new ntn(dukVar.d);
            CharSequence charSequence = dukVar.a;
            ntnVar.l((String) spu.aT(charSequence, new lst(3)));
            String str = (String) ntnVar.i(strF);
            String str2 = (String) spu.aT(charSequence, new lst(3));
            String str3 = true == TextUtils.isEmpty(str2) ? strF : str2;
            String string = message.b;
            if (TextUtils.isEmpty(string)) {
                string = context.getString(R.string.messaging_style_multimedia_message_with_empty_body);
            }
            qjkVar.a(new qjl(str3, str, string, message.f, message.c, message.d));
        }
        lwf.a();
        lwb lwbVarB = lwf.b(statusBarNotification);
        mcd.b();
        long jA = mcd.a(statusBarNotification);
        if (lwbVarB != null) {
            lyn lynVarA = lyn.a();
            HashMap map = lynVarA.d;
            if (map.containsKey(lwbVarB) && ((l = (Long) map.get(lwbVarB)) == null || jA != l.longValue())) {
                ((ype) lynVarA.c.g()).u("Inconsistent conversation/notification ID mapping detected.");
            }
            map.put(lwbVarB, Long.valueOf(jA));
        }
        boolean zI = lnm.k().i(jA);
        lwy lwyVarE = e(statusBarNotification);
        lwyVarE.a = new MessagingInfo(qjkVar);
        lwyVarE.d(lwdVar.a(context));
        lwz lwzVar = new lwz(lwyVarE);
        if (!zI) {
            f(lwzVar);
        }
        moa moaVarA = mlq.e().a(lwzVar.j, lwzVar.k);
        if (moaVarA != null && (!(moaVarA instanceof lwz) || lwzVar.h(moaVarA))) {
            return lwzVar;
        }
        String packageName = statusBarNotification.getPackageName();
        boolean zI2 = lwdVar.i();
        lweVar.getClass();
        boolean z2 = false;
        boolean z3 = false;
        for (dtl dtlVar : lweVar.a()) {
            if (dtlVar.c != null) {
                String str4 = dtlVar.d;
                if (!TextUtils.isEmpty(str4)) {
                    boolean zStartsWith = str4.startsWith("image");
                    z3 |= !zStartsWith;
                    z |= zStartsWith;
                    if (str4.startsWith("audio")) {
                        z2 = true;
                    }
                }
            }
        }
        if (zI2) {
            lxr.e();
            lxr.h(yzz.MESSAGING_PARSING, yzy.lZ, packageName);
        }
        if (z) {
            lxr.e();
            lxr.h(yzz.MESSAGING_PARSING, yzy.ma, packageName);
        }
        if (z2) {
            lxr.e();
            lxr.h(yzz.MESSAGING_PARSING, yzy.mb, packageName);
        }
        if (z3) {
            lxr.e();
            lxr.h(yzz.MESSAGING_PARSING, yzy.mc, packageName);
        }
        ohs ohsVarJ = ebf.j();
        rqu rquVarH = rqv.h(yxy.GEARHEAD, 14, yyv.SI_CREATION_USED_MESSAGING_STYLE_ONLY);
        rquVarH.e(packageName);
        ohsVarJ.F(rquVarH.l());
        lxr.e();
        yzz yzzVar = yzz.MESSAGING;
        lxr.i(yzzVar, yzy.nj, packageName);
        lxr.e();
        lxr.i(yzzVar, yzy.nl, packageName);
        ((ype) yphVar.l().ai((char) 4445)).y("Message timestamp: %s", new SimpleDateFormat("HH:mm:ss.SSS", Locale.US).format(new Date(lwzVar.b())));
        return lwzVar;
    }

    @Override // defpackage.lxn
    protected final boolean b(StatusBarNotification statusBarNotification) {
        lwd lwdVar = new lwd(statusBarNotification, false);
        return lwdVar.j() && lwdVar.c != null;
    }
}
