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

/* loaded from: classes.dex */
public final class lwl implements lwj {
    public static final yph a = yph.c("GH.MsgNotifAction");
    private final Context b;
    private final Class c;
    private final ltx d;
    private final Handler e = new Handler(Looper.getMainLooper());

    public lwl(Context context, Class cls, ltx ltxVar) {
        this.b = context;
        this.c = cls;
        this.d = ltxVar;
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
            ltv.a().c(numValueOf.intValue(), new kzu(yzyVarB, stringExtra, 14, null));
        }
    }

    private static void h(String str, Intent intent) {
        StringBuilder sb = new StringBuilder(str);
        sb.append("\n");
        f(sb, "Intent", intent);
        f(sb, "StreamItemType", Integer.valueOf(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", -1)));
        f(sb, "StreamItemID", Integer.valueOf(intent.getIntExtra("EXTRA_STREAM_ITEM_ID", -1)));
        f(sb, "NumReadMessages", Integer.valueOf(intent.getIntExtra("EXTRA_NUM_READ_MESSAGES", -1)));
        f(sb, "SbnKey", Integer.valueOf(intent.getIntExtra("EXTRA_SBN_KEY", -1)));
        f(sb, "RemoteInputKey", Integer.valueOf(intent.getIntExtra("EXTRA_REMOTE_INPUT_KEY", -1)));
        f(sb, "VpShowing", Integer.valueOf(intent.getIntExtra("EXTRA_VISUAL_PREVIEW_SHOWING", -1)));
        f(sb, "TelemetryRequestKey", Integer.valueOf(intent.getIntExtra("EXTRA_TELEMETRY_REQUEST_KEY", -1)));
        f(sb, "TelemetryAction", Integer.valueOf(intent.getIntExtra("EXTRA_AGSA_TELEMETRY_ACTION", -1)));
        throw new IllegalArgumentException(sb.toString());
    }

    private final void i(Intent intent) {
        this.d.b(yzr.b(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0)), intent.getLongExtra("EXTRA_STREAM_ITEM_ID", 0L), intent.getIntExtra("EXTRA_NUM_READ_MESSAGES", 0));
    }

    private static void j(Intent intent, Integer num, yzy yzyVar, String str) {
        if (yzyVar != null) {
            intent.putExtra("EXTRA_AGSA_TELEMETRY_ACTION", yzyVar.a());
        }
        if (str != null) {
            intent.putExtra("EXTRA_PACKAGE", str);
        }
        if (num != null) {
            intent.putExtra("EXTRA_TELEMETRY_REQUEST_KEY", num);
        }
    }

    @Override // defpackage.lwj
    @ResultIgnorabilityUnspecified
    public final boolean a(String str, Intent intent) {
        if (!str.equals("com.google.android.gearhead.messaging.MARK_AS_READ") && !str.equals("com.google.android.gearhead.messaging.REPLY") && !str.equals("com.google.android.gearhead.messaging.MUTE")) {
            return false;
        }
        if (!intent.hasExtra("EXTRA_STREAM_ITEM_TYPE")) {
            if (actw.c()) {
                return true;
            }
            h("Message intent received without a message type...", intent);
        }
        int intExtra = intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0);
        if (intExtra != 3 && intExtra != 5) {
            throw new IllegalArgumentException(a.bp(intExtra, "Message intent received with an invalid stream item type: "));
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1464674445) {
            if (iHashCode != 729336187) {
                if (iHashCode == 1138722728 && str.equals("com.google.android.gearhead.messaging.REPLY")) {
                    ((ype) a.l().ai((char) 4412)).u("Received proxy Reply intent.");
                    Bundle bundleExtra = intent.getBundleExtra("EXTRA_MESSAGING_FLOW_METADATA");
                    bundleExtra.getClass();
                    whg whgVar = new whg(bundleExtra);
                    woy.S(intent.hasExtra("EXTRA_REMOTE_INPUT_KEY"), "No RemoteInput key when replying: %s", intent);
                    Bundle resultsFromIntent = RemoteInput.getResultsFromIntent(intent);
                    if (!intent.hasExtra("EXTRA_REMOTE_INPUT_KEY")) {
                        h("Missing EXTRA_REMOTE_INPUT_KEY when replying...", intent);
                    }
                    String stringExtra = intent.getStringExtra("EXTRA_REMOTE_INPUT_KEY");
                    stringExtra.getClass();
                    if (!resultsFromIntent.containsKey(stringExtra)) {
                        h("No message found in this intent...", intent);
                    }
                    String string = resultsFromIntent.getString(stringExtra);
                    string.getClass();
                    i(intent);
                    String stringExtra2 = intent.getStringExtra("EXTRA_PACKAGE");
                    if (intent.getBooleanExtra("EXTRA_VISUAL_PREVIEW_SHOWING", false)) {
                        lxr.e();
                        lxr.j(yzz.MESSAGING, yzy.nw, yyv.MESSAGING_REPLY_WITH_VISUAL_PREVIEW, stringExtra2);
                    }
                    g(intent);
                    yzr yzrVarB = yzr.b(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0));
                    if (yzrVarB == yzr.IM_NOTIFICATION) {
                        String stringExtra3 = intent.getStringExtra("EXTRA_SBN_KEY");
                        stringExtra3.getClass();
                        this.e.post(new kzu(stringExtra3, string, 13, null));
                    } else if (yzrVarB == yzr.SMS_NOTIFICATION) {
                        String stringExtra4 = intent.getStringExtra("EXTRA_SMS_PHONE_NUMBER");
                        if (stringExtra4 == null) {
                            throw new IllegalArgumentException("No phone number provided when replying to SMS.");
                        }
                        SmsManager.getDefault().sendTextMessage(stringExtra4, null, string, null, null);
                    }
                    whgVar.d();
                }
            } else if (str.equals("com.google.android.gearhead.messaging.MUTE")) {
                ((ype) a.l().ai((char) 4411)).u("Received proxy Mute intent.");
                woy.S(intent.hasExtra("EXTRA_STREAM_ITEM_ID"), "No StreamItem ID when muting: %s", intent);
                yzr yzrVarB2 = yzr.b(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0));
                if (yzrVarB2 != null) {
                    this.e.post(new kzu(yzrVarB2, intent, 15));
                }
                g(intent);
            }
        } else if (str.equals("com.google.android.gearhead.messaging.MARK_AS_READ")) {
            ((ype) a.l().ai((char) 4410)).u("Received proxy Mark As Read intent.");
            whg whgVar2 = new whg(intent.getBundleExtra("EXTRA_MESSAGING_FLOW_METADATA"));
            woy.S(intent.hasExtra("EXTRA_STREAM_ITEM_ID"), "No StreamItem ID when marking as read: %s", intent);
            yzr yzrVarB3 = yzr.b(intent.getIntExtra("EXTRA_STREAM_ITEM_TYPE", 0));
            i(intent);
            g(intent);
            String stringExtra5 = intent.getStringExtra("EXTRA_PACKAGE");
            if (intent.getBooleanExtra("EXTRA_VISUAL_PREVIEW_SHOWING", false)) {
                lxr.e();
                lxr.j(yzz.MESSAGING, yzy.nx, yyv.MESSAGING_MARK_AS_READ_WITH_VISUAL_PREVIEW, stringExtra5);
            }
            if (yzrVarB3 == yzr.IM_NOTIFICATION) {
                String stringExtra6 = intent.getStringExtra("EXTRA_SBN_KEY");
                stringExtra6.getClass();
                this.e.post(new lqj(stringExtra6, 9));
            }
            whgVar2.c();
        }
        return true;
    }

    @Override // defpackage.lwj
    public final PendingIntent b(lue lueVar, whg whgVar, yzy yzyVar, Integer num) {
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) this.c);
        intent.setAction("com.google.android.gearhead.messaging.MARK_AS_READ");
        yzr yzrVar = lueVar.j;
        intent.putExtra("EXTRA_STREAM_ITEM_TYPE", yzrVar.J);
        long j = lueVar.k;
        intent.putExtra("EXTRA_STREAM_ITEM_ID", j);
        intent.putExtra("EXTRA_NUM_READ_MESSAGES", lueVar.a());
        yzr yzrVar2 = yzr.IM_NOTIFICATION;
        if (yzrVar == yzrVar2) {
            intent.putExtra("EXTRA_SBN_KEY", ((lwz) lueVar).c.getKey());
        }
        intent.putExtra("EXTRA_VISUAL_PREVIEW_SHOWING", lws.d().j(lueVar));
        j(intent, num, yzyVar, yzrVar == yzrVar2 ? lueVar.l : null);
        intent.putExtra("EXTRA_MESSAGING_FLOW_METADATA", whgVar.a());
        return PendingIntent.getService(context, (int) j, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 1073741824);
    }

    @Override // defpackage.lwj
    public final PendingIntent c(lue lueVar, whg whgVar, yzy yzyVar, Integer num) {
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) this.c);
        intent.setAction("com.google.android.gearhead.messaging.MUTE");
        yzr yzrVar = lueVar.j;
        intent.putExtra("EXTRA_STREAM_ITEM_TYPE", yzrVar.J);
        long j = lueVar.k;
        intent.putExtra("EXTRA_STREAM_ITEM_ID", j);
        j(intent, num, yzyVar, yzrVar == yzr.IM_NOTIFICATION ? lueVar.l : null);
        intent.putExtra("EXTRA_MESSAGING_FLOW_METADATA", whgVar.a());
        return PendingIntent.getService(context, (int) j, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 1073741824);
    }

    @Override // defpackage.lwj
    public final PendingIntent d(lue lueVar, RemoteInput remoteInput, whg whgVar, yzy yzyVar, Integer num) {
        Context context = this.b;
        Intent intent = new Intent(context, (Class<?>) this.c);
        intent.setAction("com.google.android.gearhead.messaging.REPLY");
        yzr yzrVar = lueVar.j;
        intent.putExtra("EXTRA_STREAM_ITEM_TYPE", yzrVar.J);
        intent.putExtra("EXTRA_REMOTE_INPUT_KEY", remoteInput.getResultKey());
        long j = lueVar.k;
        intent.putExtra("EXTRA_STREAM_ITEM_ID", j);
        intent.putExtra("EXTRA_NUM_READ_MESSAGES", lueVar.a());
        intent.putExtra("EXTRA_VISUAL_PREVIEW_SHOWING", lws.d().j(lueVar));
        String str = null;
        if (yzrVar == yzr.SMS_NOTIFICATION) {
            intent.putExtra("EXTRA_SMS_PHONE_NUMBER", ((lxd) lueVar).g);
        } else if (yzrVar == yzr.IM_NOTIFICATION) {
            intent.putExtra("EXTRA_SBN_KEY", ((lwz) lueVar).c.getKey());
            str = lueVar.l;
        }
        j(intent, num, yzyVar, str);
        intent.putExtra("EXTRA_MESSAGING_FLOW_METADATA", whgVar.a());
        return PendingIntent.getService(context, (int) j, intent, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 1073741824);
    }
}
