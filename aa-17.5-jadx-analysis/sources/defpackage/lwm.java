package defpackage;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.SmsManager;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class lwm implements lwk {
    public static final yph a = yph.c("GH.MsgNotifAction");
    private final Context b;
    private final Class c;
    private final ltw d;
    private final Handler e = new Handler(Looper.getMainLooper());

    public lwm(Context context, Class cls, ltw ltwVar) {
        this.b = context;
        this.c = cls;
        this.d = ltwVar;
    }

    public static void e(yzy yzyVar, String str) {
        lxr.e();
        lxr.h(yzz.MESSAGING, yzyVar, str);
    }

    private static void f(StringBuilder sb, String str, Object obj) {
        sb.append("\t");
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append("\n");
    }

    private static void g(Intent intent) {
        Integer numValueOf = intent.hasExtra("EXTRA_TELEMETRY_REQUEST_KEY") ? Integer.valueOf(intent.getIntExtra("EXTRA_TELEMETRY_REQUEST_KEY", 0)) : null;
        String stringExtra = intent.hasExtra("EXTRA_PACKAGE") ? intent.getStringExtra("EXTRA_PACKAGE") : null;
        if (!intent.hasExtra("EXTRA_AGSA_TELEMETRY_ACTION")) {
            if (!actw.c()) {
                throw new IllegalArgumentException("No round trip telemetry event found when processing a proxy PendingIntent.");
            }
            return;
        }
        yzy yzyVarB = yzy.b(intent.getIntExtra("EXTRA_AGSA_TELEMETRY_ACTION", -1));
        if (yzyVarB == null) {
            throw new IllegalArgumentException("Intent received with null telemetry action");
        }
        if (numValueOf == null) {
            e(yzyVarB, stringExtra);
        } else {
            ltv.a().c(numValueOf.intValue(), new kzu(yzyVarB, stringExtra, 16, null));
        }
    }

    private static void h(String str, Intent intent) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("\n");
        f(sb, "Intent", intent);
        f(sb, "ConversationId", Integer.valueOf(intent.getIntExtra("EXTRA_CONVERSATION_ID", -1)));
        f(sb, "NumReadMessages", Integer.valueOf(intent.getIntExtra("EXTRA_NUM_READ_MESSAGES", -1)));
        f(sb, "SbnKey", Integer.valueOf(intent.getIntExtra("EXTRA_SBN_KEY", -1)));
        f(sb, "RemoteInputKey", Integer.valueOf(intent.getIntExtra("EXTRA_REMOTE_INPUT_KEY", -1)));
        f(sb, "VpShowing", Integer.valueOf(intent.getIntExtra("EXTRA_VISUAL_PREVIEW_SHOWING", -1)));
        f(sb, "TelemetryRequestKey", Integer.valueOf(intent.getIntExtra("EXTRA_TELEMETRY_REQUEST_KEY", -1)));
        f(sb, "TelemetryAction", Integer.valueOf(intent.getIntExtra("EXTRA_AGSA_TELEMETRY_ACTION", -1)));
        throw new IllegalArgumentException(sb.toString());
    }

    private final void i(Intent intent) {
        this.d.g(intent.getLongExtra("EXTRA_CONVERSATION_ID", 0L), intent.getIntExtra("EXTRA_NUM_READ_MESSAGES", 0));
    }

    private static void j(Intent intent, yzy yzyVar, String str) {
        if (yzyVar != null) {
            intent.putExtra("EXTRA_AGSA_TELEMETRY_ACTION", yzyVar.a());
        }
        if (str != null) {
            intent.putExtra("EXTRA_PACKAGE", str);
        }
    }

    @Override // defpackage.lwk
    @ResultIgnorabilityUnspecified
    public final boolean a(String str, Intent intent) {
        if (!str.equals("com.google.android.gearhead.messaging.CONVERSATION_MARK_AS_READ") && !str.equals("com.google.android.gearhead.messaging.CONVERSATION_REPLY") && !str.equals("com.google.android.gearhead.messaging.CONVERSATION_MUTE")) {
            return false;
        }
        if (!intent.hasExtra("EXTRA_CONVERSATION_ID")) {
            if (actw.c()) {
                return true;
            }
            h("Message intent received without a conversation id...", intent);
        }
        lvg lvgVarA = lnm.m().a(intent.getLongExtra("EXTRA_CONVERSATION_ID", 0L));
        if (!(lvgVarA instanceof lvk) && !(lvgVarA instanceof lvi)) {
            throw new IllegalArgumentException("Message intent received with an invalid conversation type: ");
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2061457357) {
            if (iHashCode != 523468784) {
                if (iHashCode == 1422687787 && str.equals("com.google.android.gearhead.messaging.CONVERSATION_MARK_AS_READ")) {
                    ((ype) a.l().ai((char) 4414)).u("Received proxy Mark As Read intent.");
                    whg whgVar = new whg(intent.getBundleExtra("EXTRA_MESSAGING_FLOW_METADATA"));
                    woy.S(intent.hasExtra("EXTRA_CONVERSATION_ID"), "No Conversation ID when marking as read: %s", intent);
                    lvg lvgVarA2 = lnm.m().a(intent.getLongExtra("EXTRA_CONVERSATION_ID", 0L));
                    i(intent);
                    g(intent);
                    String stringExtra = intent.getStringExtra("EXTRA_PACKAGE");
                    if (intent.getBooleanExtra("EXTRA_VISUAL_PREVIEW_SHOWING", false)) {
                        lxr.e();
                        lxr.j(yzz.MESSAGING, yzy.nx, yyv.MESSAGING_MARK_AS_READ_WITH_VISUAL_PREVIEW, stringExtra);
                    }
                    if (lvgVarA2 instanceof lvi) {
                        String stringExtra2 = intent.getStringExtra("EXTRA_SBN_KEY");
                        stringExtra2.getClass();
                        this.e.post(new lqj(stringExtra2, 10));
                    }
                    whgVar.c();
                }
            } else if (str.equals("com.google.android.gearhead.messaging.CONVERSATION_REPLY")) {
                ((ype) a.l().ai((char) 4416)).u("Received proxy Reply intent.");
                Bundle bundleExtra = intent.getBundleExtra("EXTRA_MESSAGING_FLOW_METADATA");
                bundleExtra.getClass();
                whg whgVar2 = new whg(bundleExtra);
                woy.S(intent.hasExtra("EXTRA_REMOTE_INPUT_KEY"), "No RemoteInput key when replying: %s", intent);
                Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                if (!intent.hasExtra("EXTRA_REMOTE_INPUT_KEY")) {
                    h("Missing EXTRA_REMOTE_INPUT_KEY when replying...", intent);
                }
                String stringExtra3 = intent.getStringExtra("EXTRA_REMOTE_INPUT_KEY");
                stringExtra3.getClass();
                if (!resultsFromIntent.containsKey(stringExtra3)) {
                    h("No message found in this intent...", intent);
                }
                String string = resultsFromIntent.getString(stringExtra3);
                string.getClass();
                i(intent);
                String stringExtra4 = intent.getStringExtra("EXTRA_PACKAGE");
                if (intent.getBooleanExtra("EXTRA_VISUAL_PREVIEW_SHOWING", false)) {
                    lxr.e();
                    lxr.j(yzz.MESSAGING, yzy.nw, yyv.MESSAGING_REPLY_WITH_VISUAL_PREVIEW, stringExtra4);
                }
                g(intent);
                if (lnm.m().a(intent.getLongExtra("EXTRA_CONVERSATION_ID", 0L)) instanceof lvk) {
                    String stringExtra5 = intent.getStringExtra("EXTRA_SMS_PHONE_NUMBER");
                    if (stringExtra5 == null) {
                        throw new IllegalArgumentException("No phone number provided when replying to SMS.");
                    }
                    SmsManager.getDefault().sendTextMessage(stringExtra5, null, string, null, null);
                }
                whgVar2.d();
            }
        } else if (str.equals("com.google.android.gearhead.messaging.CONVERSATION_MUTE")) {
            ((ype) a.l().ai((char) 4415)).u("Received proxy Mute intent.");
            woy.S(intent.hasExtra("EXTRA_CONVERSATION_ID"), "No Conversation ID when muting: %s", intent);
            this.e.post(new lqj(intent, 11));
            g(intent);
        }
        return true;
    }

    @Override // defpackage.lwk
    public final PendingIntent b(lvg lvgVar, whg whgVar, yzy yzyVar) {
        String str;
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) this.c);
        intent.setAction("com.google.android.gearhead.messaging.CONVERSATION_MARK_AS_READ");
        long j = lvgVar.e;
        intent.putExtra("EXTRA_CONVERSATION_ID", j);
        intent.putExtra("EXTRA_NUM_READ_MESSAGES", lvgVar.a());
        if (lvgVar instanceof lvi) {
            lvi lviVar = (lvi) lvgVar;
            intent.putExtra("EXTRA_SBN_KEY", lviVar.p.getKey());
            str = lviVar.o;
        } else {
            str = null;
        }
        intent.putExtra("EXTRA_VISUAL_PREVIEW_SHOWING", lws.d().k(lvgVar));
        j(intent, yzyVar, str);
        intent.putExtra("EXTRA_MESSAGING_FLOW_METADATA", whgVar.a());
        return PendingIntent.getService(context, (int) j, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 1073741824);
    }

    @Override // defpackage.lwk
    public final PendingIntent c(lvg lvgVar, whg whgVar, yzy yzyVar) {
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) this.c);
        intent.setAction("com.google.android.gearhead.messaging.CONVERSATION_MUTE");
        long j = lvgVar.e;
        intent.putExtra("EXTRA_CONVERSATION_ID", j);
        j(intent, yzyVar, lvgVar instanceof lvi ? ((lvi) lvgVar).o : null);
        intent.putExtra("EXTRA_MESSAGING_FLOW_METADATA", whgVar.a());
        return PendingIntent.getService(context, (int) j, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 1073741824);
    }

    @Override // defpackage.lwk
    public final PendingIntent d(lvg lvgVar, RemoteInput remoteInput, whg whgVar, yzy yzyVar) {
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) this.c);
        intent.setAction("com.google.android.gearhead.messaging.CONVERSATION_REPLY");
        intent.putExtra("EXTRA_REMOTE_INPUT_KEY", remoteInput.getResultKey());
        long j = lvgVar.e;
        intent.putExtra("EXTRA_CONVERSATION_ID", j);
        intent.putExtra("EXTRA_NUM_READ_MESSAGES", lvgVar.a());
        intent.putExtra("EXTRA_VISUAL_PREVIEW_SHOWING", lws.d().k(lvgVar));
        String str = null;
        if (lvgVar instanceof lvk) {
            intent.putExtra("EXTRA_SMS_PHONE_NUMBER", ((lvk) lvgVar).q);
        } else if (lvgVar instanceof lvi) {
            lvi lviVar = (lvi) lvgVar;
            intent.putExtra("EXTRA_SBN_KEY", lviVar.p.getKey());
            str = lviVar.o;
        }
        j(intent, yzyVar, str);
        intent.putExtra("EXTRA_MESSAGING_FLOW_METADATA", whgVar.a());
        return PendingIntent.getService(context, (int) j, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 1073741824);
    }
}
