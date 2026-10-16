package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lws implements defpackage.lwq {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.MsgNotifAction");
    private final android.content.Context b;
    private final java.lang.Class c;
    private final defpackage.lud d;
    private final android.os.Handler e = new android.os.Handler(android.os.Looper.getMainLooper());

    public lws(android.content.Context context, java.lang.Class cls, defpackage.lud ludVar) {
        this.b = context;
        this.c = cls;
        this.d = ludVar;
    }

    public static void e(defpackage.zbd zbdVar, java.lang.String str) {
        defpackage.lxy.e();
        defpackage.lxy.h(defpackage.zbe.MESSAGING, zbdVar, str);
    }

    private static void f(java.lang.StringBuilder sb, java.lang.String str, java.lang.Object obj) {
        sb.append("\t");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append("\n");
    }

    private static void g(android.content.Intent intent) {
        java.lang.Integer numValueOf = intent.hasExtra("EXTRA_TELEMETRY_REQUEST_KEY") ? java.lang.Integer.valueOf(intent.getIntExtra("EXTRA_TELEMETRY_REQUEST_KEY", 0)) : null;
        java.lang.String stringExtra = intent.hasExtra("EXTRA_PACKAGE") ? intent.getStringExtra("EXTRA_PACKAGE") : null;
        if (!intent.hasExtra("EXTRA_AGSA_TELEMETRY_ACTION")) {
            if (!acuy.c()) {
                throw new java.lang.IllegalArgumentException("No round trip telemetry event found when processing a proxy PendingIntent.");
            }
            return;
        }
        defpackage.zbd zbdVarB = defpackage.zbd.b(intent.getIntExtra("EXTRA_AGSA_TELEMETRY_ACTION", -1));
        if (zbdVarB == null) {
            throw new java.lang.IllegalArgumentException("Intent received with null telemetry action");
        }
        if (numValueOf == null) {
            e(zbdVarB, stringExtra);
        } else {
            defpackage.lub.a().c(numValueOf.intValue(), new defpackage.kzz(zbdVarB, stringExtra, 16, null));
        }
    }

    private static void h(java.lang.String str, android.content.Intent intent) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str);
        sb.append("\n");
        f(sb, "Intent", intent);
        f(sb, "StreamItemType", java.lang.Integer.valueOf(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", -1)));
        f(sb, "StreamItemID", java.lang.Integer.valueOf(intent.getIntExtra("EXTRA_STREAM_ITEM_ID", -1)));
        f(sb, "NumReadMessages", java.lang.Integer.valueOf(intent.getIntExtra("EXTRA_NUM_READ_MESSAGES", -1)));
        f(sb, "SbnKey", java.lang.Integer.valueOf(intent.getIntExtra("EXTRA_SBN_KEY", -1)));
        f(sb, "RemoteInputKey", java.lang.Integer.valueOf(intent.getIntExtra("EXTRA_REMOTE_INPUT_KEY", -1)));
        f(sb, "VpShowing", java.lang.Integer.valueOf(intent.getIntExtra("EXTRA_VISUAL_PREVIEW_SHOWING", -1)));
        f(sb, "TelemetryRequestKey", java.lang.Integer.valueOf(intent.getIntExtra("EXTRA_TELEMETRY_REQUEST_KEY", -1)));
        f(sb, "TelemetryAction", java.lang.Integer.valueOf(intent.getIntExtra("EXTRA_AGSA_TELEMETRY_ACTION", -1)));
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private final void i(android.content.Intent intent) {
        this.d.b(defpackage.zaw.b(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0)), intent.getLongExtra("EXTRA_STREAM_ITEM_ID", 0L), intent.getIntExtra("EXTRA_NUM_READ_MESSAGES", 0));
    }

    private static void j(android.content.Intent intent, java.lang.Integer num, defpackage.zbd zbdVar, java.lang.String str) {
        if (zbdVar != null) {
            intent.putExtra("EXTRA_AGSA_TELEMETRY_ACTION", zbdVar.a());
        }
        if (str != null) {
            intent.putExtra("EXTRA_PACKAGE", str);
        }
        if (num != null) {
            intent.putExtra("EXTRA_TELEMETRY_REQUEST_KEY", num);
        }
    }

    @Override // defpackage.lwq
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final boolean a(java.lang.String str, android.content.Intent intent) {
        if (!str.equals("com.google.android.gearhead.messaging.MARK_AS_READ") && !str.equals("com.google.android.gearhead.messaging.REPLY") && !str.equals("com.google.android.gearhead.messaging.MUTE")) {
            return false;
        }
        if (!intent.hasExtra("EXTRA_STREAM_ITEM_TYPE")) {
            if (acuy.c()) {
                return true;
            }
            h("Message intent received without a message type...", intent);
        }
        int intExtra = intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0);
        if (intExtra != 3 && intExtra != 5) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bo(intExtra, "Message intent received with an invalid stream item type: "));
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1464674445) {
            if (iHashCode != 729336187) {
                if (iHashCode == 1138722728 && str.equals("com.google.android.gearhead.messaging.REPLY")) {
                    ((defpackage.yqj) a.l().ai((char) 4415)).u("Received proxy Reply intent.");
                    android.os.Bundle bundleExtra = intent.getBundleExtra("EXTRA_MESSAGING_FLOW_METADATA");
                    bundleExtra.getClass();
                    wif wifVar = new wif(bundleExtra);
                    defpackage.ysr.bc(intent.hasExtra("EXTRA_REMOTE_INPUT_KEY"), "No RemoteInput key when replying: %s", intent);
                    android.os.Bundle resultsFromIntent = android.app.RemoteInput.getResultsFromIntent(intent);
                    if (!intent.hasExtra("EXTRA_REMOTE_INPUT_KEY")) {
                        h("Missing EXTRA_REMOTE_INPUT_KEY when replying...", intent);
                    }
                    java.lang.String stringExtra = intent.getStringExtra("EXTRA_REMOTE_INPUT_KEY");
                    stringExtra.getClass();
                    if (!resultsFromIntent.containsKey(stringExtra)) {
                        h("No message found in this intent...", intent);
                    }
                    java.lang.String string = resultsFromIntent.getString(stringExtra);
                    string.getClass();
                    i(intent);
                    java.lang.String stringExtra2 = intent.getStringExtra("EXTRA_PACKAGE");
                    if (intent.getBooleanExtra("EXTRA_VISUAL_PREVIEW_SHOWING", false)) {
                        defpackage.lxy.e();
                        defpackage.lxy.j(defpackage.zbe.MESSAGING, defpackage.zbd.nw, defpackage.zaa.MESSAGING_REPLY_WITH_VISUAL_PREVIEW, stringExtra2);
                    }
                    g(intent);
                    defpackage.zaw zawVarB = defpackage.zaw.b(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0));
                    if (zawVarB == defpackage.zaw.IM_NOTIFICATION) {
                        java.lang.String stringExtra3 = intent.getStringExtra("EXTRA_SBN_KEY");
                        stringExtra3.getClass();
                        this.e.post(new defpackage.kzz(stringExtra3, string, 15, null));
                    } else if (zawVarB == defpackage.zaw.SMS_NOTIFICATION) {
                        java.lang.String stringExtra4 = intent.getStringExtra("EXTRA_SMS_PHONE_NUMBER");
                        if (stringExtra4 == null) {
                            throw new java.lang.IllegalArgumentException("No phone number provided when replying to SMS.");
                        }
                        android.telephony.SmsManager.getDefault().sendTextMessage(stringExtra4, null, string, null, null);
                    }
                    wifVar.d();
                }
            } else if (str.equals("com.google.android.gearhead.messaging.MUTE")) {
                ((defpackage.yqj) a.l().ai((char) 4414)).u("Received proxy Mute intent.");
                defpackage.ysr.bc(intent.hasExtra("EXTRA_STREAM_ITEM_ID"), "No StreamItem ID when muting: %s", intent);
                defpackage.zaw zawVarB2 = defpackage.zaw.b(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0));
                if (zawVarB2 != null) {
                    this.e.post(new defpackage.kzz(zawVarB2, intent, 17));
                }
                g(intent);
            }
        } else if (str.equals("com.google.android.gearhead.messaging.MARK_AS_READ")) {
            ((defpackage.yqj) a.l().ai((char) 4413)).u("Received proxy Mark As Read intent.");
            wif wifVar2 = new wif(intent.getBundleExtra("EXTRA_MESSAGING_FLOW_METADATA"));
            defpackage.ysr.bc(intent.hasExtra("EXTRA_STREAM_ITEM_ID"), "No StreamItem ID when marking as read: %s", intent);
            defpackage.zaw zawVarB3 = defpackage.zaw.b(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0));
            i(intent);
            g(intent);
            java.lang.String stringExtra5 = intent.getStringExtra("EXTRA_PACKAGE");
            if (intent.getBooleanExtra("EXTRA_VISUAL_PREVIEW_SHOWING", false)) {
                defpackage.lxy.e();
                defpackage.lxy.j(defpackage.zbe.MESSAGING, defpackage.zbd.nx, defpackage.zaa.MESSAGING_MARK_AS_READ_WITH_VISUAL_PREVIEW, stringExtra5);
            }
            if (zawVarB3 == defpackage.zaw.IM_NOTIFICATION) {
                java.lang.String stringExtra6 = intent.getStringExtra("EXTRA_SBN_KEY");
                stringExtra6.getClass();
                this.e.post(new defpackage.lmh(stringExtra6, 18));
            }
            wifVar2.c();
        }
        return true;
    }

    @Override // defpackage.lwq
    public final android.app.PendingIntent b(luk lukVar, wif wifVar, defpackage.zbd zbdVar, java.lang.Integer num) {
        android.content.Context context = this.b;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) this.c);
        intent.setAction("com.google.android.gearhead.messaging.MARK_AS_READ");
        defpackage.zaw zawVar = ((moi) lukVar).j;
        intent.putExtra("EXTRA_STREAM_ITEM_TYPE", zawVar.J);
        long j = ((moi) lukVar).k;
        intent.putExtra("EXTRA_STREAM_ITEM_ID", j);
        intent.putExtra("EXTRA_NUM_READ_MESSAGES", lukVar.a());
        defpackage.zaw zawVar2 = defpackage.zaw.IM_NOTIFICATION;
        if (zawVar == zawVar2) {
            intent.putExtra("EXTRA_SBN_KEY", ((lxg) lukVar).c.getKey());
        }
        intent.putExtra("EXTRA_VISUAL_PREVIEW_SHOWING", defpackage.lwz.d().j(lukVar));
        j(intent, num, zbdVar, zawVar == zawVar2 ? ((moi) lukVar).l : null);
        intent.putExtra("EXTRA_MESSAGING_FLOW_METADATA", wifVar.a());
        return android.app.PendingIntent.getService(context, (int) j, intent, (android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 1073741824);
    }

    @Override // defpackage.lwq
    public final android.app.PendingIntent c(luk lukVar, wif wifVar, defpackage.zbd zbdVar, java.lang.Integer num) {
        android.content.Context context = this.b;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) this.c);
        intent.setAction("com.google.android.gearhead.messaging.MUTE");
        defpackage.zaw zawVar = ((moi) lukVar).j;
        intent.putExtra("EXTRA_STREAM_ITEM_TYPE", zawVar.J);
        long j = ((moi) lukVar).k;
        intent.putExtra("EXTRA_STREAM_ITEM_ID", j);
        j(intent, num, zbdVar, zawVar == defpackage.zaw.IM_NOTIFICATION ? ((moi) lukVar).l : null);
        intent.putExtra("EXTRA_MESSAGING_FLOW_METADATA", wifVar.a());
        return android.app.PendingIntent.getService(context, (int) j, intent, (android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 1073741824);
    }

    @Override // defpackage.lwq
    public final android.app.PendingIntent d(luk lukVar, android.app.RemoteInput remoteInput, wif wifVar, defpackage.zbd zbdVar, java.lang.Integer num) {
        android.content.Context context = this.b;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) this.c);
        intent.setAction("com.google.android.gearhead.messaging.REPLY");
        defpackage.zaw zawVar = ((moi) lukVar).j;
        intent.putExtra("EXTRA_STREAM_ITEM_TYPE", zawVar.J);
        intent.putExtra("EXTRA_REMOTE_INPUT_KEY", remoteInput.getResultKey());
        long j = ((moi) lukVar).k;
        intent.putExtra("EXTRA_STREAM_ITEM_ID", j);
        intent.putExtra("EXTRA_NUM_READ_MESSAGES", lukVar.a());
        intent.putExtra("EXTRA_VISUAL_PREVIEW_SHOWING", defpackage.lwz.d().j(lukVar));
        java.lang.String str = null;
        if (zawVar == defpackage.zaw.SMS_NOTIFICATION) {
            intent.putExtra("EXTRA_SMS_PHONE_NUMBER", ((lxk) lukVar).g);
        } else if (zawVar == defpackage.zaw.IM_NOTIFICATION) {
            intent.putExtra("EXTRA_SBN_KEY", ((lxg) lukVar).c.getKey());
            str = ((moi) lukVar).l;
        }
        j(intent, num, zbdVar, str);
        intent.putExtra("EXTRA_MESSAGING_FLOW_METADATA", wifVar.a());
        return android.app.PendingIntent.getService(context, (int) j, intent, (android.os.Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 1073741824);
    }
}
