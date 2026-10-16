package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dtt extends defpackage.duj {
    public dur b;
    public java.lang.CharSequence c;
    private java.lang.Boolean e;
    public final java.util.List a = new java.util.ArrayList();
    private final java.util.List d = new java.util.ArrayList();

    public dtt(dur durVar) {
        if (android.text.TextUtils.isEmpty(durVar.a)) {
            throw new java.lang.IllegalArgumentException("User's name must not be empty.");
        }
        this.b = durVar;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005  */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    public static defpackage.dtt f(android.app.Notification notification) {
        defpackage.duj dttVar;
        android.os.Bundle bundle = notification.extras;
        if (bundle != null) {
            java.lang.String string = bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE");
            if (string != null) {
                switch (string) {
                    case "androidx.core.app.NotificationCompat$ProgressStyle":
                        dttVar = new dui();
                        break;
                    case "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle":
                        dttVar = new dtl();
                        break;
                    case "androidx.core.app.NotificationCompat$BigPictureStyle":
                        dttVar = new dtc();
                        break;
                    case "androidx.core.app.NotificationCompat$MetricStyle":
                        dttVar = new dud();
                        break;
                    case "androidx.core.app.NotificationCompat$CallStyle":
                        dttVar = new defpackage.dth();
                        break;
                    case "androidx.core.app.NotificationCompat$InboxStyle":
                        dttVar = new dtm();
                        break;
                    case "androidx.core.app.NotificationCompat$BigTextStyle":
                        dttVar = new dtd();
                        break;
                    case "androidx.core.app.NotificationCompat$MessagingStyle":
                        dttVar = new defpackage.dtt();
                        break;
                    default:
                        dttVar = null;
                        break;
                }
            } else {
                dttVar = null;
            }
            if (dttVar == null) {
                if (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) {
                    dttVar = new defpackage.dtt();
                } else if (bundle.containsKey("android.picture") || bundle.containsKey("android.pictureIcon")) {
                    dttVar = new dtc();
                } else if (bundle.containsKey("android.bigText")) {
                    dttVar = new dtd();
                } else if (bundle.containsKey("android.textLines")) {
                    dttVar = new dtm();
                } else if (bundle.containsKey("android.callType")) {
                    dttVar = new defpackage.dth();
                } else if (bundle.containsKey("android.progressSegments") || bundle.containsKey("android.progressPoints")) {
                    dttVar = new dui();
                } else if (bundle.containsKey("android.metrics")) {
                    dttVar = new dud();
                } else {
                    java.lang.String string2 = bundle.getString("android.template");
                    if (string2 == null) {
                        dttVar = null;
                    } else if (string2.equals(android.app.Notification.BigPictureStyle.class.getName())) {
                        dttVar = new dtc();
                    } else if (string2.equals(android.app.Notification.BigTextStyle.class.getName())) {
                        dttVar = new dtd();
                    } else if (string2.equals(android.app.Notification.InboxStyle.class.getName())) {
                        dttVar = new dtm();
                    } else if (android.os.Build.VERSION.SDK_INT >= 36 && string2.equals(b$.ExternalSyntheticApiModelOutline0.m().getName())) {
                        dttVar = new dui();
                    } else if (string2.equals(a$.ExternalSyntheticApiModelOutline2.m().getName())) {
                        dttVar = new defpackage.dtt();
                    } else if (string2.equals(a$.ExternalSyntheticApiModelOutline2.m$1().getName())) {
                        dttVar = new dtl();
                    } else if (android.os.Build.VERSION.SDK_INT < 37 || !string2.equals(dac$.ExternalSyntheticApiModelOutline0.m().getName())) {
                        dttVar = null;
                    } else {
                        dttVar = new dud();
                    }
                }
            }
            if (dttVar == null) {
                dttVar = null;
            } else {
                try {
                    dttVar.b(bundle);
                } catch (java.lang.ClassCastException unused) {
                    dttVar = null;
                }
            }
        } else {
            dttVar = null;
        }
        if (dttVar instanceof defpackage.dtt) {
            return (defpackage.dtt) dttVar;
        }
        return null;
    }

    @Override // defpackage.duj
    protected final java.lang.String a() {
        return "androidx.core.app.NotificationCompat$MessagingStyle";
    }

    @Override // defpackage.duj
    protected final void b(android.os.Bundle bundle) {
        super.b(bundle);
        java.util.List list = this.a;
        list.clear();
        dur durVarC = bundle.containsKey("android.messagingUser") ? dtp.c(bundle, "android.messagingUser") : null;
        if (durVarC != null) {
            this.b = durVarC;
        } else if (bundle.containsKey("android.messagingStyleUser")) {
            this.b = dur.b(bundle.getBundle("android.messagingStyleUser"));
        } else {
            duq duqVar = new duq();
            duqVar.a = bundle.getString("android.selfDisplayName");
            this.b = new dur(duqVar);
        }
        java.lang.CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.c = charSequence;
        if (charSequence == null) {
            this.c = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            list.addAll(dts.b(parcelableArray));
        }
        android.os.Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.d.addAll(dts.b(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.e = java.lang.Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    @Override // defpackage.duj
    public final void c(defpackage.mku mkuVar) {
        h(g());
        android.app.Notification.MessagingStyle messagingStyleA = dtp.a(dtb.d(this.b));
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            defpackage.dtn.a(messagingStyleA, ((dts) it.next()).a());
        }
        java.util.Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            dto.a(messagingStyleA, ((dts) it2.next()).a());
        }
        this.e.booleanValue();
        defpackage.dtn.b(messagingStyleA, this.c);
        dtp.b(messagingStyleA, this.e.booleanValue());
        messagingStyleA.setBuilder((android.app.Notification.Builder) mkuVar.a);
    }

    public final boolean g() {
        defpackage.dte dteVar = this.g;
        if (dteVar != null && dteVar.a.getApplicationInfo().targetSdkVersion < 28 && this.e == null) {
            return this.c != null;
        }
        java.lang.Boolean bool = this.e;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void h(boolean z) {
        this.e = java.lang.Boolean.valueOf(z);
    }

    public dtt() {
    }
}
