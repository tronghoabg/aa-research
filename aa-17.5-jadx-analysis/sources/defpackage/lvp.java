package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class lvp {
    public static final yph a = yph.c("GH.Conv2Pn");
    public lvg b;
    public lvg c;
    public final htm d = new htm(mki.a.c, (byte[]) null);
    private int e;

    private final PendingIntent h(Bundle bundle) {
        Intent intent = new Intent("com.google.android.gearhead.ACTION_HANDLE_CONVERSATION_NOTIFICATION_INTENT").setPackage("com.google.android.projection.gearhead");
        intent.putExtra("EXTRA_PAYLOAD", bundle);
        int i = Build.VERSION.SDK_INT;
        Context context = mki.a.c;
        int i2 = this.e;
        this.e = i2 + 1;
        return PendingIntent.getBroadcast(context, i2, intent, (i >= 31 ? 33554432 : 0) | 268435456);
    }

    private final Bundle i(String str, whg whgVar) {
        Bundle bundle = new Bundle();
        whgVar.e(bundle);
        bundle.putLong("CONVERSATION_ID", this.b.e);
        bundle.putString("ACTION_ID", str);
        return bundle;
    }

    private static final boolean j(lwr lwrVar, whg whgVar) {
        yzz yzzVar = ((lub) whgVar.c).h;
        if (lwrVar.d(yzzVar)) {
            return false;
        }
        lwrVar.c(yzzVar);
        return true;
    }

    public final PendingIntent a(lub lubVar, boolean z) {
        return f("ACTION_PLAY", g(lua.ASSISTANT_READ_REPLY, lubVar, z));
    }

    public final Pair b(lwr lwrVar, lub lubVar, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        nul nulVarC = null;
        if (z && lwrVar != null) {
            whg whgVarG = g(null, lubVar, false);
            lwq lwqVar = lwrVar.a;
            switch (lwqVar.ordinal()) {
                case 1:
                case 3:
                    if (z4 && j(lwrVar, whgVarG)) {
                        lvl.y(whgVarG);
                    }
                    Context context = mki.a.c;
                    aaew aaewVar = new aaew(null);
                    String str = lwrVar.b;
                    aaewVar.d = context.getString(R.string.smart_reply_action, str);
                    Bundle bundleI = i("ACTION_SMART_REPLY", whgVarG);
                    bundleI.putString("EXTRA_REPLY_TEXT", str);
                    aaewVar.b = h(bundleI);
                    if (lwrVar.e) {
                        aaewVar.a = 6;
                    }
                    nulVarC = new nul(aaewVar);
                    break;
                case 2:
                    if (z4 && j(lwrVar, whgVarG)) {
                        lvl.y(whgVarG);
                    }
                    aaew aaewVar2 = new aaew(null);
                    aaewVar2.d = lwrVar.b;
                    lwp lwpVar = lwrVar.d;
                    Bundle bundleI2 = i("ACTION_SMART_REPLY_WITH_CONFIRMATION", whgVarG);
                    bundleI2.putString("EXTRA_REPLY_TEXT", lwpVar.d);
                    aaewVar2.b = h(bundleI2);
                    if (lwrVar.e) {
                        aaewVar2.a = 6;
                    }
                    nulVarC = new nul(aaewVar2);
                    break;
                case 4:
                    if (!roc.X()) {
                        if (lbh.c().b() != null) {
                            if (z4 && j(lwrVar, whgVarG)) {
                                lvl.w(whgVarG);
                            }
                            Context context2 = mki.a.c;
                            GhIcon ghIconP = GhIcon.p(context2, 2131233132);
                            aaew aaewVar3 = new aaew(null);
                            aaewVar3.e = ghIconP;
                            aaewVar3.d = context2.getString(R.string.share_location_smart_action_verbose);
                            aaewVar3.b = h(i("ACTION_SHARE_LOCATION", whgVarG));
                            if (lwrVar.e) {
                                aaewVar3.a = 6;
                            }
                            nulVarC = new nul(aaewVar3);
                            break;
                        }
                    } else {
                        if (z4 && j(lwrVar, whgVarG)) {
                            lvl.t(whgVarG);
                        }
                        Context context3 = mki.a.c;
                        GhIcon ghIconP2 = GhIcon.p(context3, 2131233152);
                        aaew aaewVar4 = new aaew(null);
                        aaewVar4.e = ghIconP2;
                        aaewVar4.d = context3.getString(R.string.share_eta_smart_action);
                        aaewVar4.b = h(i("ACTION_SHARE_ETA", whgVarG));
                        if (lwrVar.e) {
                            aaewVar4.a = 6;
                        }
                        nulVarC = new nul(aaewVar4);
                        break;
                    }
                    break;
                case 5:
                    ComponentName componentNameA = lgv.a().a(mpz.b);
                    if (componentNameA != null && componentNameA.getPackageName() != null && (actj.z() || map.b(componentNameA))) {
                        if (z4 && j(lwrVar, whgVarG)) {
                            lvl.q(whgVarG);
                        }
                        GhIcon ghIconP3 = GhIcon.p(mki.a.c, 2131233134);
                        aaew aaewVar5 = new aaew(null);
                        aaewVar5.e = ghIconP3;
                        aaewVar5.d = lwrVar.b;
                        String str2 = lwrVar.d.b;
                        str2.getClass();
                        Bundle bundleI3 = i("ACTION_SMART_NAVIGATE", whgVarG);
                        bundleI3.putString("EXTRA_NAVIGATE_DESTINATION", str2);
                        aaewVar5.b = h(bundleI3);
                        if (lwrVar.e) {
                            aaewVar5.a = 6;
                        }
                        nulVarC = new nul(aaewVar5);
                        break;
                    }
                    break;
                case 6:
                    if (z4 && j(lwrVar, whgVarG)) {
                        lvl.o(whgVarG);
                    }
                    Context context4 = mki.a.c;
                    GhIcon ghIconP4 = GhIcon.p(context4, 2131233094);
                    lwp lwpVar2 = lwrVar.d;
                    aaew aaewVar6 = new aaew(null);
                    aaewVar6.e = ghIconP4;
                    String string = z3 ? lwrVar.b : context4.getString(R.string.call_smart_action);
                    String str3 = lwpVar2.a;
                    aaewVar6.d = string;
                    Bundle bundleI4 = i("ACTION_SMART_CALL_SENDER", whgVarG);
                    if (str3 != null && !roc.Z(str3)) {
                        bundleI4.putString("EXTRA_PHONE_NUMBER", str3);
                    }
                    String str4 = lwpVar2.c;
                    if (str4 != null && !roc.Z(str4)) {
                        bundleI4.putString("EXTRA_CONTACT_NAME", str4);
                    }
                    aaewVar6.b = h(bundleI4);
                    if (lwrVar.e) {
                        aaewVar6.a = 6;
                    }
                    nulVarC = new nul(aaewVar6);
                    break;
                case 7:
                    if (z4 && j(lwrVar, whgVarG)) {
                        lvl.m(whgVarG);
                    }
                    Context context5 = mki.a.c;
                    GhIcon ghIconP5 = GhIcon.p(context5, 2131233094);
                    String str5 = lwrVar.d.a;
                    str5.getClass();
                    aaew aaewVar7 = new aaew(null);
                    aaewVar7.e = ghIconP5;
                    aaewVar7.d = odn.a().r(context5, str5);
                    Bundle bundleI5 = i("ACTION_SMART_CALL_NUMBER", whgVarG);
                    bundleI5.putString("EXTRA_PHONE_NUMBER", str5);
                    aaewVar7.b = h(bundleI5);
                    if (lwrVar.e) {
                        aaewVar7.a = 6;
                    }
                    nulVarC = new nul(aaewVar7);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid smartActionType: ".concat(lwqVar.toString()));
            }
        }
        if (nulVarC == null) {
            nulVarC = c(f("ACTION_REPLY", g(lua.ASSISTANT_DIRECT_REPLY, lubVar, z2)));
        } else {
            z5 = false;
        }
        return Pair.create(nulVarC, Boolean.valueOf(z5));
    }

    public final nul c(PendingIntent pendingIntent) {
        Context context = mki.a.c;
        GhIcon ghIconP = GhIcon.p(context, 2131233146);
        aaew aaewVar = new aaew(null);
        aaewVar.e = ghIconP;
        aaewVar.b = pendingIntent;
        aaewVar.d = context.getString(R.string.notification_center_reply_message);
        return new nul(aaewVar);
    }

    public final nul d(lub lubVar, boolean z) {
        Context context = mki.a.c;
        if (!this.b.o()) {
            aaew aaewVar = new aaew(null);
            aaewVar.e = GhIcon.p(context, 2131233135);
            aaewVar.d = z ? null : context.getString(R.string.mute_conversation);
            aaewVar.b = f("ACTION_MUTE", g(null, lubVar, false));
            return new nul(aaewVar);
        }
        aaew aaewVar2 = new aaew(null);
        GhIcon ghIconP = GhIcon.p(context, 2131233135);
        ghIconP.v();
        aaewVar2.e = ghIconP;
        aaewVar2.b = f("ACTION_UNMUTE", g(null, lub.NC, false));
        return new nul(aaewVar2);
    }

    public final nul e(PendingIntent pendingIntent) {
        Context context = mki.a.c;
        GhIcon ghIconP = GhIcon.p(context, 2131233143);
        String string = actj.y() ? context.getString(R.string.play_message) : context.getString(R.string.play_aloud_message);
        aaew aaewVar = new aaew(null);
        aaewVar.e = ghIconP;
        aaewVar.d = string;
        aaewVar.b = pendingIntent;
        return new nul(aaewVar);
    }

    public final PendingIntent f(String str, whg whgVar) {
        return h(i(str, whgVar));
    }

    public final whg g(lua luaVar, lub lubVar, boolean z) {
        lvg lvgVar = this.b;
        ltz ltzVar = lvgVar instanceof lvk ? ltz.b : ltz.a;
        String strF = lvgVar.f();
        if (strF == null) {
            strF = "com.google.android.projection.gearhead";
        }
        return new whg(ltzVar, luaVar, lubVar, new ComponentName(strF, ""), z);
    }
}
