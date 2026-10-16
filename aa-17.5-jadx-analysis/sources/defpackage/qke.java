package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import android.util.Pair;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.gearhead.sdk.assistant.MessagingInfo;
import com.google.android.gms.car.navigation.NavigationCurrentPosition;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;

/* loaded from: classes2.dex */
public final class qke extends qkk {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("GH.MsgPAdapter");
    private lue c;
    private final Handler d;
    private boolean e;
    private final htm f;

    public qke(ykd ykdVar) {
        htm htmVar = new htm(mki.a.c, (byte[]) null);
        super(ykdVar);
        this.d = new Handler(Looper.getMainLooper());
        this.f = htmVar;
    }

    private final PendingIntent g(lub lubVar, boolean z) {
        return o("ACTION_PLAY", q(lua.ASSISTANT_READ_REPLY, lubVar, z));
    }

    private final Pair h(lwr lwrVar, lub lubVar, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = false;
        nul nulVarI = null;
        if (z && lwrVar != null) {
            whg whgVarQ = q(null, lubVar, false);
            lwq lwqVar = lwrVar.a;
            switch (lwqVar.ordinal()) {
                case 1:
                case 3:
                    if (z4 && r(lwrVar, whgVarQ)) {
                        lvl.y(whgVarQ);
                    }
                    Context context = mki.a.c;
                    aaew aaewVar = new aaew(null);
                    String str = lwrVar.b;
                    aaewVar.d = context.getString(R.string.smart_reply_action, str);
                    Bundle bundleP = p("ACTION_SMART_REPLY", whgVarQ);
                    bundleP.putString("EXTRA_REPLY_TEXT", str);
                    aaewVar.b = roc.bo(this.g, bundleP);
                    if (lwrVar.e) {
                        aaewVar.a = 6;
                    }
                    nulVarI = new nul(aaewVar);
                    break;
                case 2:
                    if (z4 && r(lwrVar, whgVarQ)) {
                        lvl.y(whgVarQ);
                    }
                    aaew aaewVar2 = new aaew(null);
                    aaewVar2.d = lwrVar.b;
                    lwp lwpVar = lwrVar.d;
                    Bundle bundleP2 = p("ACTION_SMART_REPLY_WITH_CONFIRMATION", whgVarQ);
                    bundleP2.putString("EXTRA_REPLY_TEXT", lwpVar.d);
                    aaewVar2.b = roc.bo(this.g, bundleP2);
                    if (lwrVar.e) {
                        aaewVar2.a = 6;
                    }
                    nulVarI = new nul(aaewVar2);
                    break;
                case 4:
                    if (!roc.X()) {
                        if (lbh.c().b() != null) {
                            if (z4 && r(lwrVar, whgVarQ)) {
                                lvl.w(whgVarQ);
                            }
                            Context context2 = mki.a.c;
                            GhIcon ghIconP = GhIcon.p(context2, true != this.e ? 2131233132 : R.drawable.gs_my_location_fill1_vd_theme_24);
                            aaew aaewVar3 = new aaew(null);
                            aaewVar3.e = ghIconP;
                            aaewVar3.d = context2.getString(R.string.share_location_smart_action_verbose);
                            aaewVar3.b = roc.bo(this.g, p("ACTION_SHARE_LOCATION", whgVarQ));
                            if (lwrVar.e) {
                                aaewVar3.a = 6;
                            }
                            nulVarI = new nul(aaewVar3);
                            break;
                        }
                    } else {
                        if (z4 && r(lwrVar, whgVarQ)) {
                            lvl.t(whgVarQ);
                        }
                        Context context3 = mki.a.c;
                        GhIcon ghIconP2 = GhIcon.p(context3, true != this.e ? 2131233152 : R.drawable.gs_share_eta_fill1_vd_theme_24);
                        aaew aaewVar4 = new aaew(null);
                        aaewVar4.e = ghIconP2;
                        aaewVar4.d = context3.getString(R.string.share_eta_smart_action);
                        aaewVar4.b = roc.bo(this.g, p("ACTION_SHARE_ETA", whgVarQ));
                        if (lwrVar.e) {
                            aaewVar4.a = 6;
                        }
                        nulVarI = new nul(aaewVar4);
                        break;
                    }
                    break;
                case 5:
                    ComponentName componentNameA = lgv.a().a(mpz.b);
                    if (componentNameA != null && componentNameA.getPackageName() != null && (actj.z() || map.b(componentNameA))) {
                        if (z4 && r(lwrVar, whgVarQ)) {
                            lvl.q(whgVarQ);
                        }
                        GhIcon ghIconP3 = GhIcon.p(mki.a.c, true != this.e ? 2131233134 : R.drawable.gs_navigation_fill1_vd_theme_24);
                        aaew aaewVar5 = new aaew(null);
                        aaewVar5.e = ghIconP3;
                        aaewVar5.d = lwrVar.b;
                        String str2 = lwrVar.d.b;
                        str2.getClass();
                        Bundle bundleP3 = p("ACTION_SMART_NAVIGATE", whgVarQ);
                        bundleP3.putString("EXTRA_NAVIGATE_DESTINATION", str2);
                        aaewVar5.b = roc.bo(this.g, bundleP3);
                        if (lwrVar.e) {
                            aaewVar5.a = 6;
                        }
                        nulVarI = new nul(aaewVar5);
                        break;
                    }
                    break;
                case 6:
                    if (z4 && r(lwrVar, whgVarQ)) {
                        lvl.o(whgVarQ);
                    }
                    Context context4 = mki.a.c;
                    GhIcon ghIconP4 = GhIcon.p(context4, true == this.e ? R.drawable.gs_call_fill1_vd_theme_24 : 2131233094);
                    lwp lwpVar2 = lwrVar.d;
                    aaew aaewVar6 = new aaew(null);
                    aaewVar6.e = ghIconP4;
                    String string = z3 ? lwrVar.b : context4.getString(R.string.call_smart_action);
                    String str3 = lwpVar2.a;
                    aaewVar6.d = string;
                    Bundle bundleP4 = p("ACTION_SMART_CALL_SENDER", whgVarQ);
                    if (str3 != null && !roc.Y(str3)) {
                        bundleP4.putString("EXTRA_PHONE_NUMBER", str3);
                    }
                    String str4 = lwpVar2.c;
                    if (str4 != null && !roc.Y(str4)) {
                        bundleP4.putString("EXTRA_CONTACT_NAME", str4);
                    }
                    aaewVar6.b = roc.bo(this.g, bundleP4);
                    if (lwrVar.e) {
                        aaewVar6.a = 6;
                    }
                    nulVarI = new nul(aaewVar6);
                    break;
                case 7:
                    if (z4 && r(lwrVar, whgVarQ)) {
                        lvl.m(whgVarQ);
                    }
                    Context context5 = mki.a.c;
                    GhIcon ghIconP5 = GhIcon.p(context5, true == this.e ? R.drawable.gs_call_fill1_vd_theme_24 : 2131233094);
                    String str5 = lwrVar.d.a;
                    str5.getClass();
                    aaew aaewVar7 = new aaew(null);
                    aaewVar7.e = ghIconP5;
                    aaewVar7.d = odn.a().r(context5, str5);
                    Bundle bundleP5 = p("ACTION_SMART_CALL_NUMBER", whgVarQ);
                    bundleP5.putString("EXTRA_PHONE_NUMBER", str5);
                    aaewVar7.b = roc.bo(this.g, bundleP5);
                    if (lwrVar.e) {
                        aaewVar7.a = 6;
                    }
                    nulVarI = new nul(aaewVar7);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid smartActionType: ".concat(lwqVar.toString()));
            }
        }
        if (nulVarI == null) {
            nulVarI = i(o("ACTION_REPLY", q(lua.ASSISTANT_DIRECT_REPLY, lubVar, z2)));
            z5 = true;
        }
        return Pair.create(nulVarI, Boolean.valueOf(z5));
    }

    private final nul i(PendingIntent pendingIntent) {
        Context context = mki.a.c;
        GhIcon ghIconP = GhIcon.p(context, true != this.e ? 2131233146 : R.drawable.gs_reply_fill1_vd_theme_24);
        aaew aaewVar = new aaew(null);
        aaewVar.e = ghIconP;
        aaewVar.b = pendingIntent;
        aaewVar.d = context.getString(R.string.notification_center_reply_message);
        return new nul(aaewVar);
    }

    private final nul j(lub lubVar, boolean z) {
        Context context = mki.a.c;
        if (!((lue) this.g).k()) {
            aaew aaewVar = new aaew(null);
            aaewVar.e = GhIcon.p(context, true == this.e ? R.drawable.gs_notifications_off_fill1_vd_theme_24 : 2131233135);
            aaewVar.d = z ? null : context.getString(R.string.mute_conversation);
            aaewVar.b = o("ACTION_MUTE", q(null, lubVar, false));
            return new nul(aaewVar);
        }
        aaew aaewVar2 = new aaew(null);
        GhIcon ghIconP = GhIcon.p(context, true == this.e ? R.drawable.gs_notifications_off_fill1_vd_theme_24 : 2131233135);
        ghIconP.v();
        aaewVar2.e = ghIconP;
        aaewVar2.b = o("ACTION_UNMUTE", q(null, lub.NC, false));
        aaewVar2.a = 4;
        return new nul(aaewVar2);
    }

    private final nul k(PendingIntent pendingIntent) {
        Context context = mki.a.c;
        GhIcon ghIconP = GhIcon.p(context, true != this.e ? 2131233143 : R.drawable.gs_play_arrow_fill1_vd_theme_24);
        String string = actj.y() ? context.getString(R.string.play_message) : context.getString(R.string.play_aloud_message);
        aaew aaewVar = new aaew(null);
        aaewVar.e = ghIconP;
        aaewVar.d = string;
        aaewVar.b = pendingIntent;
        aaewVar.a = 5;
        return new nul(aaewVar);
    }

    private static void l(int i) {
        obs.a().h(mki.a.c, mkn.n, i);
    }

    private final void m(String str, lwz lwzVar) {
        this.d.post(new qfa((Object) lwzVar.c.getKey(), (Object) str, 15, (byte[]) null));
    }

    private static final boolean n() {
        return nsr.c().b().F();
    }

    private final PendingIntent o(String str, whg whgVar) {
        return roc.bo(this.g, p(str, whgVar));
    }

    private static Bundle p(String str, whg whgVar) {
        Bundle bundle = new Bundle();
        whgVar.e(bundle);
        bundle.putString("ACTION_ID", str);
        return bundle;
    }

    private final whg q(lua luaVar, lub lubVar, boolean z) {
        moa moaVar = this.g;
        ltz ltzVar = moaVar.J().equals(yzr.IM_NOTIFICATION) ? ltz.a : ltz.b;
        String strO = moaVar.O();
        if (strO == null) {
            strO = "com.google.android.projection.gearhead";
        }
        return new whg(ltzVar, luaVar, lubVar, new ComponentName(strO, ""), z);
    }

    private static final boolean r(lwr lwrVar, whg whgVar) {
        yzz yzzVar = ((lub) whgVar.c).h;
        if (lwrVar.d(yzzVar)) {
            return false;
        }
        lwrVar.c(yzzVar);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d1  */
    @Override // defpackage.qkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final defpackage.nur a(defpackage.moa r28) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qke.a(moa):nur");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qkj
    public final void b(Bundle bundle) throws Resources.NotFoundException {
        lue lueVar = (lue) this.g;
        luc lucVarK = lnm.k();
        String string = bundle.getString("ACTION_ID", "");
        whg whgVar = new whg(bundle);
        switch (string.hashCode()) {
            case -2038311701:
                if (string.equals("ACTION_SMART_CALL_NUMBER")) {
                    ((ype) b.l().ai((char) 7477)).u("Smart Call Number Action");
                    mpe.a().i(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(bundle.getString("EXTRA_PHONE_NUMBER", ""))))));
                    lvl.n(whgVar);
                    lucVarK.e(lueVar);
                    return;
                }
                break;
            case -1909910569:
                if (string.equals("ACTION_SMART_CALL_SENDER")) {
                    ((ype) b.l().ai((char) 7478)).u("Smart Call Sender Action");
                    String string2 = bundle.getString("EXTRA_PHONE_NUMBER", "");
                    if (roc.Y(string2)) {
                        kfl.h().B(R.string.call_contact_query_text, Optional.empty(), Optional.of(osv.ASSISTANT_SMART_ACTION_CALL_SENDER_CLICKED), yfq.q(bundle.getString("EXTRA_CONTACT_NAME", "")));
                    } else {
                        mpe.a().i(new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(String.valueOf(string2)))));
                    }
                    lvl.p(whgVar);
                    lucVarK.e(lueVar);
                    return;
                }
                break;
            case -1858033621:
                if (string.equals("ACTION_SMART_REPLY")) {
                    if (lueVar instanceof lwz) {
                        lwz lwzVar = (lwz) lueVar;
                        ((ype) b.l().ai((char) 7475)).u("Post Smart Reply");
                        m(bundle.getString("EXTRA_REPLY_TEXT", ""), lwzVar);
                        l(R.string.smart_reply_sent_text);
                        lvl.z(whgVar);
                        lucVarK.e(lwzVar);
                        return;
                    }
                    return;
                }
                break;
            case -1757790679:
                if (string.equals("ACTION_SHARE_ETA")) {
                    if (lueVar instanceof lwz) {
                        ((ype) b.l().ai((char) 7480)).u("Post Share ETA");
                        String strB = lvl.b(mki.a.c, (NavigationCurrentPosition) mad.e().b.e());
                        lvl.u(whgVar);
                        if (strB != null) {
                            m(strB, (lwz) lueVar);
                            l(R.string.share_eta_sent_text);
                        } else {
                            lvl.s(whgVar);
                            l(R.string.share_eta_failed_text);
                        }
                        lucVarK.e(lueVar);
                        return;
                    }
                    return;
                }
                break;
            case -1746781228:
                if (string.equals("ACTION_DELETE")) {
                    ((ype) b.l().ai((char) 7473)).u("Dismiss message");
                    mlq.e().i(lueVar);
                    lvl.i(whgVar);
                    return;
                }
                break;
            case -1251728805:
                if (string.equals("ACTION_UNMUTE")) {
                    ((ype) b.l().ai((char) 7472)).u("Unmute message");
                    lucVarK.f(lueVar, false);
                    lvl.A(whgVar);
                    return;
                }
                break;
            case -985581218:
                if (string.equals("ACTION_SHARE_LOCATION")) {
                    if (lueVar instanceof lwz) {
                        ((ype) b.l().ai((char) 7479)).u("Post Share location");
                        String strA = lwr.a(mki.a.c, lbh.c().b());
                        lvl.x(whgVar);
                        if (strA != null) {
                            m(strA, (lwz) lueVar);
                            l(R.string.share_location_sent_text);
                        } else {
                            lvl.v(whgVar);
                            l(R.string.share_location_failed_text);
                        }
                        lucVarK.e(lueVar);
                        return;
                    }
                    return;
                }
                break;
            case -903880592:
                if (string.equals("ACTION_SMART_NAVIGATE")) {
                    ((ype) b.l().ai((char) 7481)).u("Smart Navigate Action");
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format("geo:0,0?q=%s", Uri.parse(bundle.getString("EXTRA_NAVIGATE_DESTINATION", "")))));
                    lvl.r(whgVar);
                    mpe.a().i(intent);
                    lucVarK.e(lueVar);
                    return;
                }
                break;
            case -528907646:
                if (string.equals("ACTION_MUTE")) {
                    ((ype) b.l().ai((char) 7471)).u("Mute message");
                    lucVarK.f(lueVar, true);
                    lvl.j(whgVar);
                    return;
                }
                break;
            case -528827491:
                if (string.equals("ACTION_PLAY")) {
                    boolean zEquals = ((lua) whgVar.d).equals(lua.ASSISTANT_AUTO_READ);
                    luc lucVarK2 = lnm.k();
                    yzy yzyVarG = lvl.g(whgVar);
                    yzy yzyVarF = lvl.f(whgVar);
                    yzy yzyVarE = null;
                    if (actj.o() && !n() && kfl.h().k().a()) {
                        yzyVarE = lvl.e(whgVar);
                    }
                    MessagingInfo messagingInfoK = lucVarK2.k(lueVar, whgVar, yzyVarG, yzyVarF, yzyVarE, null, null, null);
                    if (zEquals) {
                        kfl.h().m(messagingInfoK);
                    } else {
                        kfl.h().H(messagingInfoK);
                    }
                    ((ype) b.l().ai(7470)).P("Play message (isAutoplay:%s) %s", zEquals, lueVar.j);
                    lvl.k(whgVar);
                    return;
                }
                break;
            case 787869569:
                if (string.equals("ACTION_REPLY")) {
                    ((ype) b.l().ai((char) 7474)).u("Direct Reply to message");
                    kfl.h().t(lnm.k().k(lueVar, whgVar, lvl.h(whgVar), yzy.mM, null, null, null, null));
                    lvl.l(whgVar);
                    return;
                }
                break;
            case 1471620090:
                if (string.equals("ACTION_SMART_REPLY_WITH_CONFIRMATION")) {
                    if (lueVar instanceof lwz) {
                        lwz lwzVar2 = (lwz) lueVar;
                        yph yphVar = b;
                        ((ype) yphVar.l().ai((char) 7476)).u("Post Smart Reply With Confirmation");
                        String string3 = bundle.getString("EXTRA_REPLY_TEXT", "");
                        StatusBarNotification statusBarNotification = lwzVar2.c;
                        lws.b();
                        Intent intentA = lws.a(statusBarNotification.getKey(), lwzVar2.f(), string3);
                        ((ype) ((ype) yphVar.f()).ai((char) 7482)).u("Launching SmartReplyConfirmationService");
                        mpe.a().i(intentA);
                        lvl.z(whgVar);
                        return;
                    }
                    return;
                }
                break;
        }
        throw new IllegalArgumentException("unknown action id: ".concat(String.valueOf(string)));
    }
}
