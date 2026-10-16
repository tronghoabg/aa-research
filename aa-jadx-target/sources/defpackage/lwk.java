package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lwk {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MsgNotifParser");
    public final java.lang.String b;
    public final lwl c;
    public final lwg d;
    public final defpackage.lwh e;
    private final defpackage.xzi f = defpackage.ysr.aQ(new defpackage.lwj(this, 1));
    private final defpackage.xzi g = defpackage.ysr.aQ(new defpackage.lwj(this, 0));
    private final android.app.Notification h;
    private final boolean i;
    private android.service.notification.NotificationListenerService.Ranking j;

    /* JADX WARN: Code duplicated, block: B:57:0x01ed  */
    public lwk(android.service.notification.StatusBarNotification statusBarNotification, boolean z) {
        lwl lwlVar;
        lwg lwgVar;
        int i = 1;
        this.j = new android.service.notification.NotificationListenerService.Ranking();
        this.h = statusBarNotification.getNotification();
        this.b = statusBarNotification.getPackageName();
        this.i = z;
        android.service.notification.NotificationListenerService.RankingMap rankingMap = defpackage.nuz.b().a;
        if (rankingMap != null && !rankingMap.getRanking(statusBarNotification.getKey(), this.j)) {
            this.j = new android.service.notification.NotificationListenerService.Ranking();
        }
        defpackage.lwh lwhVar = null;
        if (!l() || !k()) {
            lwlVar = null;
            break;
        }
        try {
            defpackage.dtt dttVarF = defpackage.dtt.f(statusBarNotification.getNotification());
            if (dttVarF != null) {
                lwlVar = new lwl(dttVarF, statusBarNotification.getPackageName(), statusBarNotification.getKey(), z);
                if (defpackage.kmv.c(acuv.b(), lwlVar.c)) {
                    if (!lwlVar.b.a.isEmpty()) {
                        java.util.Iterator it = lwlVar.b.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((dts) it.next()).c != null) {
                                    if (j$.util.Collection.-EL.stream(lwlVar.b.a).anyMatch(new defpackage.lyk(i))) {
                                        defpackage.zbd zbdVar = defpackage.zbd.my;
                                        if (lwlVar.e) {
                                            defpackage.oio oioVarA = defpackage.oio.a();
                                            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MESSAGING_PARSING, zbdVar);
                                            rrvVarH.g(lwlVar.c);
                                            oioVarA.b((defpackage.rrw) rrvVarH.l());
                                        }
                                        ((defpackage.yqj) ((defpackage.yqj) lwl.a.h()).ai(4400)).M("A message with a negative timestamp was found (%s): %s", lwlVar.c, lwlVar.b);
                                    }
                                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4379)).u("Creating MessagingStyle parser");
                                    break;
                                }
                            } else {
                                ((defpackage.yqj) ((defpackage.yqj) lwl.a.h()).ai(4403)).M("MessagingStyle notification doesn't contain any message with a non-null sender (%s): %s", lwlVar.c, lwlVar.b);
                            }
                        }
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) lwl.a.h()).ai(4401)).M("MessagingStyle has no messages (%s): %s", lwlVar.c, lwlVar.b);
                    }
                }
            } else {
                ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4380)).u("No MessagingStyle found");
            }
        } catch (java.lang.IllegalArgumentException e) {
            java.lang.String message = e.getMessage();
            if (message == null || !message.startsWith("Duplicate key in ArrayMap:")) {
                throw e;
            }
            defpackage.yqm yqmVar = a;
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).p(e)).ai((char) 4381)).y("3rd party app %s has an invalid MessagingStyle.", statusBarNotification.getPackageName());
            if (z) {
                defpackage.omf.u().z(defpackage.zaa.SI_CREATION_FAILED, statusBarNotification.getPackageName(), defpackage.zab.NOTIFICATION_MESSAGING_STYLE_INVALID);
                defpackage.lxy.e();
                defpackage.lxy.i(defpackage.zbe.MESSAGING_PARSING, defpackage.zbd.no, statusBarNotification.getPackageName(), 0L);
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.g()).ai((char) 4382)).u("Unexpected error while retrieving MessagingStyle");
        }
        lwlVar = null;
        break;
        this.c = lwlVar;
        if (l() && k() && !n()) {
            java.lang.String strF = f();
            if (statusBarNotification.getNotification().extras.getString("android.template", "").equals(android.app.Notification.BigPictureStyle.class.getName())) {
                lwgVar = new lwg(strF, statusBarNotification.getPackageName(), statusBarNotification.getKey(), statusBarNotification.getPostTime());
                if (defpackage.kmv.c(acuv.b(), (java.lang.String) lwgVar.b)) {
                    ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4376)).u("Creating BigPictureStyle parser");
                } else {
                    lwgVar = null;
                }
            } else {
                lwgVar = null;
            }
        } else {
            lwgVar = null;
        }
        this.d = lwgVar;
        if (!n()) {
            defpackage.lwh lwhVar2 = new defpackage.lwh(new defpackage.yjh(statusBarNotification.getNotification()), statusBarNotification.getPackageName(), z);
            if (defpackage.acul.q()) {
                java.lang.Object obj = lwhVar2.c.c;
                if (obj != null) {
                    dtj dtjVar = (dtj) obj;
                    java.lang.String[] strArr = dtjVar.a;
                    if (strArr == null || (strArr.length) == 0) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lwh.a.h()).ai(4369)).y("CarExtender invalid - no messages (%s)", lwhVar2.b);
                        lwhVar2.b(defpackage.zab.SI_CREATION_FAILED_NO_MESSAGES, lwhVar2.b);
                    } else if (android.text.TextUtils.isEmpty(dtjVar.a())) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lwh.a.h()).ai(4373)).y("CarExtender invalid - no participant (%s)", lwhVar2.b);
                        lwhVar2.b(defpackage.zab.SI_CREATION_FAILED_NO_PARTICIPANT, lwhVar2.b);
                    } else if (dtjVar.c == null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.lwh.a.h()).ai(4372)).y("CarExtender invalid - no reply intent (%s)", lwhVar2.b);
                        lwhVar2.b(defpackage.zab.SI_CREATION_FAILED_NO_REPLY, lwhVar2.b);
                    } else {
                        for (java.lang.String str : strArr) {
                            if (str == null) {
                                ((defpackage.yqj) ((defpackage.yqj) defpackage.lwh.a.h()).ai(4371)).y("CarExtender invalid - found null message body (%s)", lwhVar2.b);
                                lwhVar2.b(defpackage.zab.SI_CREATION_FAILED_NO_TEXT, lwhVar2.b);
                            }
                        }
                        if (dtjVar.e <= 0) {
                            ((defpackage.yqj) ((defpackage.yqj) defpackage.lwh.a.h()).ai(4370)).y("Car message with invalid timestamp (%s)", lwhVar2.b);
                        } else {
                            ((defpackage.yqj) ((defpackage.yqj) a.f()).ai((char) 4378)).u("Creating CarExtender parser");
                            lwhVar = lwhVar2;
                        }
                    }
                }
            } else {
                ((defpackage.yqj) defpackage.lwh.a.l().ai(4375)).y("CarExtender invalid - flag disabled (%s)", lwhVar2.b);
            }
        }
        this.e = lwhVar;
    }

    public static final boolean m(android.service.notification.StatusBarNotification statusBarNotification) {
        try {
            return defpackage.dtt.f(statusBarNotification.getNotification()) != null;
        } catch (android.os.BadParcelableException | java.lang.IllegalArgumentException unused) {
        }
    }

    private final boolean n() {
        return (this.c == null && this.d == null && this.e == null) ? false : true;
    }

    public final android.graphics.Bitmap a(android.content.Context context) {
        java.lang.Object obj;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131168031);
        android.graphics.drawable.Icon iconB = b();
        android.graphics.Bitmap bitmap = null;
        android.graphics.Bitmap bitmapB = iconB != null ? defpackage.kfn.b(iconB.loadDrawable(context), dimensionPixelSize, dimensionPixelSize) : null;
        if (bitmapB != null) {
            return bitmapB;
        }
        lwl lwlVar = this.c;
        if (lwlVar != null) {
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131168031);
            dur durVar = ((dts) lwlVar.b.a.get(0)).c;
            androidx.core.graphics.drawable.IconCompat iconCompat = durVar != null ? durVar.b : null;
            if (iconCompat != null) {
                try {
                    android.graphics.drawable.Drawable drawableE = iconCompat.e(context);
                    drawableE.getClass();
                    android.graphics.Bitmap bitmapB2 = defpackage.kfn.b(drawableE, dimensionPixelSize2, dimensionPixelSize2);
                    if (bitmapB2 != null) {
                        bitmap = bitmapB2;
                    }
                } catch (java.lang.NullPointerException e) {
                    if (e.getMessage() == null || !e.getMessage().contains("android.content.res.Resources.getIdentifier")) {
                        throw e;
                    }
                    throw new java.lang.RuntimeException("NullPointerException at #getIdentifier when parsing MS SBN avatar for package <" + lwlVar.c + "> with IconCompat returning res package <" + iconCompat.o() + ">", e);
                }
            }
            if (bitmap != null) {
                return bitmap;
            }
        }
        defpackage.lwh lwhVar = this.e;
        if (lwhVar != null && (obj = lwhVar.c.b) != null) {
            return (android.graphics.Bitmap) obj;
        }
        java.lang.String strF = f();
        gni gniVar = new gni(context.getResources());
        gniVar.b(strF, strF);
        gniVar.c();
        return gniVar.a(dimensionPixelSize);
    }

    public final android.graphics.drawable.Icon b() {
        return this.h.getLargeIcon();
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.dta c() {
        defpackage.xzi xziVar = this.g;
        if (xziVar.fF() != null) {
            return (defpackage.dta) xziVar.fF();
        }
        defpackage.lwh lwhVar = this.e;
        if (lwhVar == null) {
            return null;
        }
        java.lang.Object obj = lwhVar.c.c;
        obj.getClass();
        android.app.PendingIntent pendingIntent = ((dtj) obj).d;
        pendingIntent.getClass();
        return new defpackage.dta((androidx.core.graphics.drawable.IconCompat) null, (java.lang.CharSequence) null, pendingIntent);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.dta d() {
        defpackage.xzi xziVar = this.f;
        if (xziVar.fF() != null) {
            return (defpackage.dta) xziVar.fF();
        }
        defpackage.lwh lwhVar = this.e;
        if (lwhVar == null) {
            return null;
        }
        defpackage.yjh yjhVar = lwhVar.c;
        java.lang.Object obj = yjhVar.c;
        obj.getClass();
        android.app.PendingIntent pendingIntent = ((dtj) obj).c;
        pendingIntent.getClass();
        dsz dszVar = new dsz((androidx.core.graphics.drawable.IconCompat) null, (java.lang.CharSequence) null, pendingIntent);
        java.lang.Object obj2 = yjhVar.c;
        obj2.getClass();
        dut dutVar = ((dtj) obj2).b;
        dutVar.getClass();
        dszVar.b(dutVar);
        return dszVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence, java.lang.Object] */
    public final defpackage.ygw e() {
        lwl lwlVar = this.c;
        int i = 0;
        if (lwlVar != null) {
            int i2 = defpackage.ygw.d;
            defpackage.ygr ygrVar = new defpackage.ygr(4);
            for (dts dtsVar : lwlVar.b.a) {
                dur durVar = dtsVar.c;
                if (durVar != null) {
                    java.lang.CharSequence charSequence = dtsVar.a;
                    java.lang.String string = android.text.TextUtils.isEmpty(charSequence.toString()) ? defpackage.mkp.a.c.getString(2132084440) : charSequence.toString();
                    mesquite.messaging.model.Message.Builder builder = new mesquite.messaging.model.Message.Builder();
                    builder.b(lwlVar.d + i);
                    builder.a = durVar;
                    builder.b = string;
                    builder.d = dtsVar.d;
                    builder.e = dtsVar.e;
                    builder.c = java.lang.Math.max(dtsVar.b, 0L);
                    ygrVar.i(builder.a());
                    i++;
                }
            }
            return ygrVar.g();
        }
        lwg lwgVar = this.d;
        if (lwgVar != null) {
            java.lang.String string2 = defpackage.mkp.a.c.getString(2132083203);
            mesquite.messaging.model.Message.Builder builder2 = new mesquite.messaging.model.Message.Builder();
            builder2.b((java.lang.String) lwgVar.d);
            builder2.c = lwgVar.a;
            duq duqVar = new duq();
            duqVar.a = lwgVar.c;
            builder2.a = new dur(duqVar);
            builder2.b = string2;
            return defpackage.ygw.q(builder2.a());
        }
        defpackage.lwh lwhVar = this.e;
        if (lwhVar == null) {
            throw new java.lang.IllegalStateException("A valid SBN should always have messages");
        }
        java.lang.Object obj = lwhVar.c.c;
        obj.getClass();
        dtj dtjVar = (dtj) obj;
        java.lang.String[] strArr = dtjVar.a;
        strArr.getClass();
        java.lang.String strA = dtjVar.a();
        strA.getClass();
        defpackage.ygr ygrVar2 = new defpackage.ygr(4);
        duq duqVar2 = new duq();
        duqVar2.a = strA;
        dur durVar2 = new dur(duqVar2);
        while (i < strArr.length) {
            java.lang.String str = strArr[i];
            mesquite.messaging.model.Message.Builder builder3 = new mesquite.messaging.model.Message.Builder();
            builder3.a = durVar2;
            builder3.b(strA);
            builder3.b = str;
            builder3.c = dtjVar.e;
            ygrVar2.i(builder3.a());
            i++;
        }
        return ygrVar2.g();
    }

    public final java.lang.String f() {
        android.content.pm.ShortcutInfo shortcutInfoM;
        if (android.os.Build.VERSION.SDK_INT >= 31 && a$.ExternalSyntheticApiModelOutline0.m(this.j) && (shortcutInfoM = a$.ExternalSyntheticApiModelOutline0.m(this.j)) != null) {
            java.lang.CharSequence charSequenceM = je$.ExternalSyntheticApiModelOutline0.m(shortcutInfoM);
            if (charSequenceM != null) {
                return charSequenceM.toString();
            }
            java.lang.CharSequence charSequenceM$1 = je$.ExternalSyntheticApiModelOutline0.m$1(shortcutInfoM);
            if (charSequenceM$1 != null) {
                return charSequenceM$1.toString();
            }
        }
        lwl lwlVar = this.c;
        if (lwlVar != null) {
            java.lang.CharSequence charSequence = lwlVar.b.c;
            java.lang.String string = charSequence != null ? charSequence.toString() : null;
            if (string != null) {
                return string;
            }
        }
        return this.h.extras.getCharSequence("android.title", "").toString();
    }

    public final java.util.List g() {
        android.os.Bundle bundle;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        android.app.Notification notification = this.h;
        android.os.Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                android.os.Bundle bundle3 = bundle.getBundle(java.lang.Integer.toString(i));
                android.os.Bundle bundle4 = bundle3.getBundle("extras");
                boolean z = bundle4 != null ? bundle4.getBoolean("android.support.allowGeneratedReplies", false) : false;
                int i2 = bundle3.getInt("icon");
                java.lang.CharSequence charSequence = bundle3.getCharSequence("title");
                android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle3.getParcelable("actionIntent");
                android.os.Bundle bundle5 = bundle3.getBundle("extras");
                dut[] dutVarArrK = dsy.k(dsy.j(bundle3, "remoteInputs"));
                dsy.k(dsy.j(bundle3, "dataOnlyRemoteInputs"));
                arrayList2.add(new defpackage.dta(i2, charSequence, pendingIntent, bundle5, dutVarArrK, z, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false, 0, 0, false));
            }
        }
        arrayList.addAll(arrayList2);
        for (int i3 = 0; i3 < defpackage.dsx.b(notification); i3++) {
            arrayList.add(defpackage.dsx.c(notification, i3));
        }
        return arrayList;
    }

    public final void h(defpackage.zbd zbdVar) {
        if (this.i) {
            java.lang.String str = this.b;
            defpackage.lxy.e();
            defpackage.lxy.h(defpackage.zbe.MESSAGING_PARSING, zbdVar, str);
        }
    }

    public final boolean i() {
        lwl lwlVar = this.c;
        if (lwlVar != null) {
            return lwlVar.b.g();
        }
        return false;
    }

    public final boolean j() {
        if (this.c == null && this.d == null && this.e == null) {
            java.util.concurrent.TimeUnit.SECONDS.getClass();
            return false;
        }
        if (c() == null) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(4395)).M("No valid mark as read action (%s): %s", this.b, this.h);
            h(defpackage.zbd.lV);
            return false;
        }
        if (d() != null) {
            return true;
        }
        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) a.h()).l(10, java.util.concurrent.TimeUnit.SECONDS)).ai(4394)).M("No valid reply action (%s): %s", this.b, this.h);
        h(defpackage.zbd.lW);
        return false;
    }

    public final boolean k() {
        return this.g.fF() != null;
    }

    public final boolean l() {
        return this.f.fF() != null;
    }
}
