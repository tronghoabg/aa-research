package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import mesquite.messaging.model.Message;

/* loaded from: classes.dex */
public final class lwd {
    public static final yph a = yph.c("GH.MsgNotifParser");
    public final String b;
    public final lwe c;
    public final lvz d;
    public final lwa e;
    private final xyc f = wub.L(new lwc(this, 1));
    private final xyc g = wub.L(new lwc(this, 0));
    private final Notification h;
    private final boolean i;
    private NotificationListenerService.Ranking j;

    /* JADX WARN: Removed duplicated region for block: B:57:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lwd(android.service.notification.StatusBarNotification r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lwd.<init>(android.service.notification.StatusBarNotification, boolean):void");
    }

    public static final boolean m(StatusBarNotification statusBarNotification) {
        return dtm.f(statusBarNotification.getNotification()) != null;
    }

    private final boolean n() {
        return (this.c == null && this.d == null && this.e == null) ? false : true;
    }

    public final Bitmap a(Context context) throws Resources.NotFoundException {
        Object obj;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.notification_icon_size);
        Icon iconB = b();
        Bitmap bitmap = null;
        Bitmap bitmapB = iconB != null ? kfl.b(iconB.loadDrawable(context), dimensionPixelSize, dimensionPixelSize) : null;
        if (bitmapB != null) {
            return bitmapB;
        }
        lwe lweVar = this.c;
        if (lweVar != null) {
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.notification_icon_size);
            duk dukVar = ((dtl) lweVar.b.a.get(0)).c;
            IconCompat iconCompat = dukVar != null ? dukVar.b : null;
            if (iconCompat != null) {
                try {
                    Drawable drawableE = iconCompat.e(context);
                    drawableE.getClass();
                    Bitmap bitmapB2 = kfl.b(drawableE, dimensionPixelSize2, dimensionPixelSize2);
                    if (bitmapB2 != null) {
                        bitmap = bitmapB2;
                    }
                } catch (NullPointerException e) {
                    if (e.getMessage() == null || !e.getMessage().contains("android.content.res.Resources.getIdentifier")) {
                        throw e;
                    }
                    throw new RuntimeException("NullPointerException at #getIdentifier when parsing MS SBN avatar for package <" + lweVar.c + "> with IconCompat returning res package <" + iconCompat.o() + ">", e);
                }
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        lwa lwaVar = this.e;
        if (lwaVar != null && (obj = lwaVar.c.b) != null) {
            return (Bitmap) obj;
        }
        String strF = f();
        gnb gnbVar = new gnb(context.getResources());
        gnbVar.b(strF, strF);
        gnbVar.c();
        return gnbVar.a(dimensionPixelSize);
    }

    public final Icon b() {
        return this.h.getLargeIcon();
    }

    @ResultIgnorabilityUnspecified
    public final dst c() {
        xyc xycVar = this.g;
        if (xycVar.gu() != null) {
            return (dst) xycVar.gu();
        }
        lwa lwaVar = this.e;
        if (lwaVar == null) {
            return null;
        }
        Object obj = lwaVar.c.c;
        obj.getClass();
        PendingIntent pendingIntent = ((dtc) obj).d;
        pendingIntent.getClass();
        return new dst((IconCompat) null, (CharSequence) null, pendingIntent);
    }

    @ResultIgnorabilityUnspecified
    public final dst d() {
        xyc xycVar = this.f;
        if (xycVar.gu() != null) {
            return (dst) xycVar.gu();
        }
        lwa lwaVar = this.e;
        if (lwaVar == null) {
            return null;
        }
        yib yibVar = lwaVar.c;
        Object obj = yibVar.c;
        obj.getClass();
        PendingIntent pendingIntent = ((dtc) obj).c;
        pendingIntent.getClass();
        dss dssVar = new dss((IconCompat) null, (CharSequence) null, pendingIntent);
        Object obj2 = yibVar.c;
        obj2.getClass();
        dum dumVar = ((dtc) obj2).b;
        dumVar.getClass();
        dssVar.b(dumVar);
        return dssVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    public final yfq e() {
        lwe lweVar = this.c;
        int i = 0;
        if (lweVar != null) {
            int i2 = yfq.d;
            yfl yflVar = new yfl(4);
            for (dtl dtlVar : lweVar.b.a) {
                duk dukVar = dtlVar.c;
                if (dukVar != null) {
                    CharSequence charSequence = dtlVar.a;
                    String string = TextUtils.isEmpty(charSequence.toString()) ? mki.a.c.getString(R.string.messaging_style_multimedia_message_with_empty_body) : charSequence.toString();
                    Message.Builder builder = new Message.Builder();
                    builder.b(lweVar.d + i);
                    builder.a = dukVar;
                    builder.b = string;
                    builder.d = dtlVar.d;
                    builder.e = dtlVar.e;
                    builder.c = Math.max(dtlVar.b, 0L);
                    yflVar.i(builder.a());
                    i++;
                }
            }
            return yflVar.g();
        }
        lvz lvzVar = this.d;
        if (lvzVar != null) {
            String string2 = mki.a.c.getString(R.string.big_picture_message_text);
            Message.Builder builder2 = new Message.Builder();
            builder2.b((String) lvzVar.d);
            builder2.c = lvzVar.a;
            duj dujVar = new duj();
            dujVar.a = lvzVar.c;
            builder2.a = new duk(dujVar);
            builder2.b = string2;
            return yfq.q(builder2.a());
        }
        lwa lwaVar = this.e;
        if (lwaVar == null) {
            throw new IllegalStateException("A valid SBN should always have messages");
        }
        Object obj = lwaVar.c.c;
        obj.getClass();
        dtc dtcVar = (dtc) obj;
        String[] strArr = dtcVar.a;
        strArr.getClass();
        String strA = dtcVar.a();
        strA.getClass();
        yfl yflVar2 = new yfl(4);
        duj dujVar2 = new duj();
        dujVar2.a = strA;
        duk dukVar2 = new duk(dujVar2);
        while (i < strArr.length) {
            String str = strArr[i];
            Message.Builder builder3 = new Message.Builder();
            builder3.a = dukVar2;
            builder3.b(strA);
            builder3.b = str;
            builder3.c = dtcVar.e;
            yflVar2.i(builder3.a());
            i++;
        }
        return yflVar2.g();
    }

    public final String f() {
        ShortcutInfo conversationShortcutInfo;
        if (Build.VERSION.SDK_INT >= 31 && this.j.isConversation() && (conversationShortcutInfo = this.j.getConversationShortcutInfo()) != null) {
            CharSequence shortLabel = conversationShortcutInfo.getShortLabel();
            if (shortLabel != null) {
                return shortLabel.toString();
            }
            CharSequence longLabel = conversationShortcutInfo.getLongLabel();
            if (longLabel != null) {
                return longLabel.toString();
            }
        }
        lwe lweVar = this.c;
        if (lweVar != null) {
            CharSequence charSequence = lweVar.b.c;
            String string = charSequence != null ? charSequence.toString() : null;
            if (string != null) {
                return string;
            }
        }
        return this.h.extras.getCharSequence("android.title", "").toString();
    }

    public final List g() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Notification notification = this.h;
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                Bundle bundle3 = bundle.getBundle(Integer.toString(i));
                Bundle bundle4 = bundle3.getBundle("extras");
                boolean z = bundle4 != null ? bundle4.getBoolean("android.support.allowGeneratedReplies", false) : false;
                int i2 = bundle3.getInt("icon");
                CharSequence charSequence = bundle3.getCharSequence("title");
                PendingIntent pendingIntent = (PendingIntent) bundle3.getParcelable("actionIntent");
                Bundle bundle5 = bundle3.getBundle("extras");
                dum[] dumVarArrE = dsu.e(dsu.d(bundle3, "remoteInputs"));
                dsu.e(dsu.d(bundle3, "dataOnlyRemoteInputs"));
                arrayList2.add(new dst(i2, charSequence, pendingIntent, bundle5, dumVarArrE, z, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false, 0, 0, false));
            }
        }
        arrayList.addAll(arrayList2);
        for (int i3 = 0; i3 < dsr.j(notification); i3++) {
            arrayList.add(dsr.k(notification, i3));
        }
        return arrayList;
    }

    public final void h(yzy yzyVar) {
        if (this.i) {
            String str = this.b;
            lxr.e();
            lxr.h(yzz.MESSAGING_PARSING, yzyVar, str);
        }
    }

    public final boolean i() {
        lwe lweVar = this.c;
        if (lweVar != null) {
            return lweVar.b.g();
        }
        return false;
    }

    public final boolean j() {
        if (this.c == null && this.d == null && this.e == null) {
            TimeUnit.SECONDS.getClass();
            return false;
        }
        if (c() == null) {
            ((ype) ((ype) ((ype) a.h()).l(10, TimeUnit.SECONDS)).ai(4392)).M("No valid mark as read action (%s): %s", this.b, this.h);
            h(yzy.lV);
            return false;
        }
        if (d() != null) {
            return true;
        }
        ((ype) ((ype) ((ype) a.h()).l(10, TimeUnit.SECONDS)).ai(4391)).M("No valid reply action (%s): %s", this.b, this.h);
        h(yzy.lW);
        return false;
    }

    public final boolean k() {
        return this.g.gu() != null;
    }

    public final boolean l() {
        return this.f.gu() != null;
    }
}
