package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.telephony.ServiceState;
import android.text.TextUtils;
import android.view.autofill.AutofillValue;
import android.widget.RemoteViews;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class mko {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;

    public mko(dsx dsxVar) {
        String str;
        Bundle[] bundleArr;
        dst dstVarD;
        this.b = new Bundle();
        this.c = dsxVar;
        Context context = dsxVar.a;
        this.a = context;
        Notification.Builder builder = new Notification.Builder(dsxVar.a, dsxVar.x);
        this.d = builder;
        Notification notification = dsxVar.y;
        Bundle[] bundleArr2 = null;
        int i = 2;
        int i2 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dsxVar.e).setContentText(dsxVar.f).setContentInfo(null).setContentIntent(dsxVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(dsxVar.l, dsxVar.m, dsxVar.n);
        IconCompat iconCompat = dsxVar.h;
        builder.setLargeIcon(iconCompat == null ? null : dtj.b(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(dsxVar.i);
        duc ducVar = dsxVar.k;
        if (ducVar instanceof dta) {
            dta dtaVar = (dta) ducVar;
            PendingIntent pendingIntent = dtaVar.b;
            dst dstVarD2 = pendingIntent == null ? dtaVar.d(R.drawable.ic_call_decline, R.string.call_notification_hang_up_action, dtaVar.f, R.color.call_notification_decline_color, dtaVar.c) : dtaVar.d(R.drawable.ic_call_decline, R.string.call_notification_decline_action, dtaVar.f, R.color.call_notification_decline_color, pendingIntent);
            PendingIntent pendingIntent2 = dtaVar.a;
            if (pendingIntent2 == null) {
                dstVarD = null;
            } else {
                boolean z = dtaVar.d;
                dstVarD = dtaVar.d(true != z ? R.drawable.ic_call_answer : R.drawable.ic_call_answer_video, true != z ? R.string.call_notification_answer_action : R.string.call_notification_answer_video_action, dtaVar.e, R.color.call_notification_answer_color, pendingIntent2);
            }
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(dstVarD2);
            ArrayList arrayList2 = dtaVar.g.b;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                dst dstVar = (dst) arrayList2.get(i3);
                if (dstVar.f) {
                    arrayList.add(dstVar);
                } else if (dstVar == null || !dstVar.a.getBoolean("key_action_priority")) {
                    arrayList.add(dstVar);
                    i--;
                }
                if (dstVarD != null && i == 1) {
                    arrayList.add(dstVarD);
                    i = 0;
                }
            }
            if (dstVarD != null && i > 0) {
                arrayList.add(dstVarD);
            }
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                D((dst) arrayList.get(i4));
            }
        } else {
            ArrayList arrayList3 = dsxVar.b;
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                D((dst) arrayList3.get(i5));
            }
        }
        Bundle bundle = dsxVar.s;
        if (bundle != null) {
            ((Bundle) this.b).putAll(bundle);
        }
        ((Notification.Builder) this.d).setShowWhen(dsxVar.j);
        ((Notification.Builder) this.d).setLocalOnly(dsxVar.q);
        ((Notification.Builder) this.d).setGroup(dsxVar.o);
        ((Notification.Builder) this.d).setSortKey(null);
        ((Notification.Builder) this.d).setGroupSummary(dsxVar.p);
        ((Notification.Builder) this.d).setCategory(dsxVar.r);
        ((Notification.Builder) this.d).setColor(dsxVar.t);
        ((Notification.Builder) this.d).setVisibility(dsxVar.u);
        ((Notification.Builder) this.d).setPublicVersion(dsxVar.v);
        ((Notification.Builder) this.d).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = dsxVar.z;
        if (!arrayList4.isEmpty()) {
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                ((Notification.Builder) this.d).addPerson((String) it.next());
            }
        }
        if (dsxVar.d.size() > 0) {
            Bundle bundle2 = dsxVar.b().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i6 = 0;
            while (i6 < dsxVar.d.size()) {
                String string = Integer.toString(i6);
                dst dstVar2 = (dst) dsxVar.d.get(i6);
                Bundle bundle5 = new Bundle();
                IconCompat iconCompatA = dstVar2.a();
                bundle5.putInt("icon", iconCompatA != null ? iconCompatA.a() : i2);
                bundle5.putCharSequence("title", dstVar2.j);
                bundle5.putParcelable("actionIntent", dstVar2.k);
                Bundle bundle6 = new Bundle(dstVar2.a);
                bundle6.putBoolean("android.support.allowGeneratedReplies", dstVar2.c);
                bundle5.putBundle("extras", bundle6);
                dum[] dumVarArr = dstVar2.b;
                if (dumVarArr == null) {
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[dumVarArr.length];
                    int i7 = i2;
                    while (i7 < dumVarArr.length) {
                        dum dumVar = dumVarArr[i7];
                        Bundle bundle7 = new Bundle();
                        int i8 = i6;
                        int i9 = i7;
                        bundle7.putString("resultKey", dumVar.a);
                        bundle7.putCharSequence("label", dumVar.b);
                        bundle7.putCharSequenceArray("choices", dumVar.c);
                        bundle7.putBoolean("allowFreeFormInput", dumVar.d);
                        bundle7.putBundle("extras", dumVar.f);
                        Set set = dumVar.g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList5 = new ArrayList<>(set.size());
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add((String) it2.next());
                            }
                            bundle7.putStringArrayList("allowedDataTypes", arrayList5);
                        }
                        bundleArr[i9] = bundle7;
                        i7 = i9 + 1;
                        i6 = i8;
                    }
                }
                int i10 = i6;
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", dstVar2.d);
                bundle5.putInt("semanticAction", dstVar2.e);
                bundle4.putBundle(string, bundle5);
                i6 = i10 + 1;
                bundleArr2 = null;
                i2 = 0;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dsxVar.b().putBundle("android.car.EXTENSIONS", bundle2);
            ((Bundle) this.b).putBundle("android.car.EXTENSIONS", bundle3);
        }
        ((Notification.Builder) this.d).setExtras(dsxVar.s);
        ((Notification.Builder) this.d).setRemoteInputHistory(null);
        RemoteViews remoteViews = dsxVar.w;
        if (remoteViews != null) {
            ((Notification.Builder) this.d).setCustomContentView(remoteViews);
        }
        ((Notification.Builder) this.d).setBadgeIconType(0);
        ((Notification.Builder) this.d).setSettingsText(null);
        ((Notification.Builder) this.d).setShortcutId(null);
        ((Notification.Builder) this.d).setTimeoutAfter(0L);
        ((Notification.Builder) this.d).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(dsxVar.x)) {
            ((Notification.Builder) this.d).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        ArrayList arrayList6 = dsxVar.c;
        int size4 = arrayList6.size();
        for (int i11 = 0; i11 < size4; i11++) {
            ((Notification.Builder) this.d).addPerson(dsy.b((duk) arrayList6.get(i11)));
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ((Notification.Builder) this.d).setAllowSystemGeneratedContextualActions(true);
            str = null;
            ((Notification.Builder) this.d).setBubbleMetadata(null);
        } else {
            str = null;
        }
        if (Build.VERSION.SDK_INT >= 36) {
            ((Notification.Builder) this.d).setShortCriticalText(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    private final void C(yzz yzzVar, yzy yzyVar, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i == 0) {
            return;
        }
        iry iryVar = new iry(yzzVar, yzyVar);
        synchronized (this.d) {
            ?? r1 = this.b;
            Integer num = (Integer) r1.get(iryVar);
            r1.put(iryVar, Integer.valueOf((num == null ? 0 : num.intValue()) + i));
        }
    }

    private final void D(dst dstVar) {
        IconCompat iconCompatA = dstVar.a();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatA != null ? dtj.b(iconCompatA, null) : null, dstVar.j, dstVar.k);
        dum[] dumVarArr = dstVar.b;
        if (dumVarArr != null) {
            for (RemoteInput remoteInput : dum.a(dumVarArr)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = new Bundle(dstVar.a);
        bundle.putBoolean("android.support.allowGeneratedReplies", dstVar.c);
        builder.setAllowGeneratedReplies(dstVar.c);
        int i = dstVar.e;
        bundle.putInt("android.support.action.semanticAction", i);
        builder.setSemanticAction(i);
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(dstVar.f);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            builder.setAuthenticationRequired(dstVar.l);
        }
        if (Build.VERSION.SDK_INT >= 37) {
            builder.setEmphasisHint(dstVar.g);
            builder.setStyleHint(dstVar.h);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", dstVar.d);
        builder.addExtras(bundle);
        ((Notification.Builder) this.d).addAction(builder.build());
    }

    public static void p(eql eqlVar, Boolean bool, Boolean bool2, ServiceState serviceState) {
        if (Boolean.TRUE.equals(bool) && (serviceState == null || serviceState.getState() != 2)) {
            eqlVar.m(ntr.b);
        } else if (Boolean.TRUE.equals(bool2) && Boolean.FALSE.equals(bool)) {
            eqlVar.m(ntr.d);
        } else {
            eqlVar.m(ntr.c);
        }
    }

    public final ddu A() {
        ddr ddrVar = new ddr();
        return new ddu((cfx) this.b, false, (cxb) this.d, ddrVar);
    }

    public final void B(cxb cxbVar, ddr ddrVar) {
        cgf cgfVar;
        ddr ddrVar2;
        cgf cgfVar2;
        ddr ddrVar3;
        deu deuVar;
        deu deuVar2;
        aag aagVar = (aag) this.c;
        Object[] objArr = aagVar.a;
        int i = aagVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            cgi cgiVar = (cgi) objArr[i2];
            ddr ddrVarR = cxbVar.r();
            int i3 = cxbVar.c;
            if (ddrVar != null) {
                cgfVar = (cgf) ddrVar.g(ddx.s);
                ddrVar2 = ddrVar;
            } else {
                cgfVar = null;
                ddrVar2 = null;
            }
            if (ddrVarR != null) {
                cgfVar2 = (cgf) ddrVarR.g(ddx.s);
                ddrVar3 = ddrVarR;
            } else {
                cgfVar2 = null;
                ddrVar3 = null;
            }
            cgf cgfVar3 = cgk.a;
            if (!affa.f(cgfVar2, cgfVar3)) {
                if (affa.f(cgfVar, cgfVar3) && !affa.f(cgfVar2, cgfVar3)) {
                    cgiVar.g.c(cgiVar.a, i3, true);
                }
                String str = (ddrVar2 == null || (deuVar2 = (deu) ddrVar2.g(ddx.G)) == null) ? null : deuVar2.b;
                String str2 = (ddrVar3 == null || (deuVar = (deu) ddrVar3.g(ddx.G)) == null) ? null : deuVar.b;
                if (str != str2) {
                    if (str == null) {
                        cgiVar.g.c(cgiVar.a, i3, true);
                    } else if (str2 == null) {
                        cgiVar.g.c(cgiVar.a, i3, false);
                    } else if (affa.f(cgfVar2, cgk.b)) {
                        cgiVar.g.b(cgiVar.a, i3, vs.f(str2));
                    }
                }
                dem demVar = ddrVar2 != null ? (dem) ddrVar2.g(ddx.M) : null;
                dem demVar2 = ddrVar3 != null ? (dem) ddrVar3.g(ddx.M) : null;
                if (demVar != demVar2) {
                    if (demVar == null) {
                        cgiVar.g.c(cgiVar.a, i3, true);
                    } else if (demVar2 == null) {
                        cgiVar.g.c(cgiVar.a, i3, false);
                    } else if (affa.f(cgfVar2, cgk.c)) {
                        int iOrdinal = demVar2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : false : true;
                        if (bool != null) {
                            cgiVar.g.b(cgiVar.a, i3, AutofillValue.forToggle(bool.booleanValue()));
                        }
                    }
                }
                cgh cghVar = ddrVar2 != null ? (cgh) ddrVar2.g(ddx.t) : null;
                cgh cghVar2 = ddrVar3 != null ? (cgh) ddrVar3.g(ddx.t) : null;
                if (!affa.f(cghVar, cghVar2)) {
                    if (cghVar == null) {
                        cgiVar.g.c(cgiVar.a, i3, true);
                    } else if (cghVar2 == null) {
                        cgiVar.g.c(cgiVar.a, i3, false);
                    } else {
                        cgiVar.g.b(cgiVar.a, i3, cghVar2.a);
                    }
                }
            } else if (!affa.f(cgfVar, cgfVar3)) {
                cgiVar.g.c(cgiVar.a, i3, false);
            }
            boolean z = ddrVar != null && aan.f(ddrVar.c, ddx.r);
            boolean z2 = ddrVarR != null && aan.f(ddrVarR.c, ddx.r);
            if (z != z2) {
                if (z2) {
                    cgiVar.h.d(i3);
                } else {
                    cgiVar.h.e(i3);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    @Deprecated
    public final void a(String str, boolean z) {
        if (acxa.aW() && this.d.contains(str)) {
            this.c.edit().putBoolean(str, z).apply();
        }
        this.b.edit().putBoolean(str, z).apply();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void b(String str, boolean z) {
        this.c.edit().putBoolean(str, z).apply();
    }

    public final boolean c() {
        return g("key_settings_always_autoplay_media_3", i());
    }

    public final boolean d() {
        return g("key_settings_autoplay_messages", ((Context) this.a).getResources().getBoolean(R.bool.settings_autoplay_messages_default));
    }

    public final boolean e() {
        boolean zX = acmd.x();
        Object obj = this.a;
        return h("key_settings_gemini_barge_in", zX ? ((Context) obj).getResources().getBoolean(R.bool.settings_gemini_barge_in_enabled) : ((Context) obj).getResources().getBoolean(R.bool.settings_gemini_barge_in_enabled_fail_safe));
    }

    public final boolean f() {
        return h("key_settings_gemini_share_precise_location", ((Context) this.a).getResources().getBoolean(R.bool.settings_gemini_share_precise_location_default));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.SharedPreferences, java.lang.Object] */
    @Deprecated
    public final boolean g(String str, boolean z) {
        return (acxa.a.gu().aU() && this.d.contains(str)) ? this.c.getBoolean(str, z) : this.b.getBoolean(str, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean h(String str, boolean z) {
        return this.c.getBoolean(str, z);
    }

    public final boolean i() {
        return g("key_settings_autoplay_media", ((Context) this.a).getResources().getBoolean(R.bool.settings_legacy_autoplay_media_default));
    }

    public final boolean j() {
        return h("key_settings_messaging_allow_notification_data_sharing_agsa", ((Context) this.a).getResources().getBoolean(R.bool.settings_messaging_allow_notification_data_sharing_agsa_default));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean k() {
        if (acxa.aW()) {
            ?? r0 = this.c;
            if (!r0.contains("key_settings_notification_chime_enabled") && r0.contains("key_settings_no_notification_sound")) {
                ebf.j().f(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_COMMON, yzy.eu));
                r0.edit().putBoolean("key_settings_notification_chime_enabled", !this.b.getBoolean("key_settings_no_notification_sound", false)).apply();
            }
        } else {
            ?? r02 = this.b;
            if (!r02.contains("key_settings_notification_chime_enabled") && r02.contains("key_settings_no_notification_sound")) {
                ebf.j().f(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_COMMON, yzy.eu));
                r02.edit().putBoolean("key_settings_notification_chime_enabled", !r02.getBoolean("key_settings_no_notification_sound", false)).apply();
            }
        }
        return g("key_settings_notification_chime_enabled", ((Context) this.a).getResources().getBoolean(R.bool.settings_notification_chime_enable_default));
    }

    public final boolean l() {
        return g("key_settings_messaging_group_notifications", ((Context) this.a).getResources().getBoolean(R.bool.settings_messaging_group_notifications_default));
    }

    public final boolean m() {
        return g("key_settings_show_message_summarization", ((Context) this.a).getResources().getBoolean(R.bool.settings_show_message_summarization_default));
    }

    public final boolean n() {
        return g("key_settings_messaging_notifications_enabled", ((Context) this.a).getResources().getBoolean(R.bool.settings_messaging_notifications_default));
    }

    public final boolean o() {
        return g("key_work_profile_support", ((Context) this.a).getResources().getBoolean(R.bool.settings_work_profile_support_default));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iri, java.lang.Object] */
    public final void q(ots otsVar) {
        yzy yzyVar;
        yzy yzyVar2;
        otw otwVar = otsVar.c;
        if (otwVar == null) {
            otwVar = otw.a;
        }
        ouh ouhVarB = ouh.b(otwVar.e);
        if (ouhVarB == null) {
            ouhVarB = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
        }
        yzz yzzVarA = this.c.a(ouhVarB);
        for (oup oupVar : otsVar.g) {
            ouo ouoVarB = ouo.b(oupVar.e);
            if (ouoVarB == null) {
                ouoVarB = ouo.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
            }
            switch (ouoVarB.ordinal()) {
                case 0:
                    yzyVar2 = yzy.vZ;
                    break;
                case 1:
                    yzyVar2 = yzy.wa;
                    break;
                case 2:
                    yzyVar2 = yzy.wb;
                    break;
                case 3:
                    yzyVar2 = yzy.wc;
                    break;
                case 4:
                    yzyVar2 = yzy.wd;
                    break;
                case 5:
                    yzyVar2 = yzy.we;
                    break;
                case 6:
                    yzyVar2 = yzy.wf;
                    break;
                case 7:
                    yzyVar2 = yzy.wg;
                    break;
                case 8:
                    yzyVar2 = yzy.wh;
                    break;
                case 9:
                    yzyVar2 = yzy.wi;
                    break;
                case 10:
                    yzyVar2 = yzy.wj;
                    break;
                case 11:
                    yzyVar2 = yzy.wk;
                    break;
                case 12:
                    yzyVar2 = yzy.wl;
                    break;
                case 13:
                    yzyVar2 = yzy.wm;
                    break;
                case 14:
                    yzyVar2 = yzy.wn;
                    break;
                case 15:
                    yzyVar2 = yzy.wo;
                    break;
                case 16:
                    yzyVar2 = yzy.wp;
                    break;
                case 17:
                    yzyVar2 = yzy.wq;
                    break;
                case 18:
                    yzyVar2 = yzy.wr;
                    break;
                case 19:
                    yzyVar2 = yzy.ws;
                    break;
                case 20:
                    yzyVar2 = yzy.wt;
                    break;
                case 21:
                    yzyVar2 = yzy.wu;
                    break;
                case 22:
                    yzyVar2 = yzy.wv;
                    break;
                case 23:
                    yzyVar2 = yzy.wH;
                    break;
                case 24:
                    yzyVar2 = yzy.wI;
                    break;
                case 25:
                    yzyVar2 = yzy.wK;
                    break;
                case 26:
                    yzyVar2 = yzy.wL;
                    break;
                case 27:
                    yzyVar2 = yzy.wM;
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    yzyVar2 = yzy.wN;
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    yzyVar2 = yzy.wO;
                    break;
                case 30:
                    yzyVar2 = yzy.wQ;
                    break;
                case 31:
                    yzyVar2 = yzy.wJ;
                    break;
                case 32:
                    yzyVar2 = yzy.wE;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    yzyVar2 = yzy.wz;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    yzyVar2 = yzy.wR;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    yzyVar2 = yzy.wS;
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    yzyVar2 = yzy.wT;
                    break;
                case 37:
                    yzyVar2 = yzy.xy;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    yzyVar2 = yzy.wW;
                    break;
                case Maneuver.TYPE_DESTINATION /* 39 */:
                    yzyVar2 = yzy.wX;
                    break;
                case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                    yzyVar2 = yzy.wY;
                    break;
                case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                    yzyVar2 = yzy.wZ;
                    break;
                case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                    yzyVar2 = yzy.xa;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                    yzyVar2 = yzy.xb;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                    yzyVar2 = yzy.xc;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                    yzyVar2 = yzy.xd;
                    break;
                case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                    yzyVar2 = yzy.xe;
                    break;
                case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                    yzyVar2 = yzy.xf;
                    break;
                case 48:
                    yzyVar2 = yzy.xg;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    yzyVar2 = yzy.xh;
                    break;
                case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                    yzyVar2 = yzy.xi;
                    break;
                case 51:
                    yzyVar2 = yzy.xj;
                    break;
                case 52:
                    yzyVar2 = yzy.xk;
                    break;
                case 53:
                    yzyVar2 = yzy.xl;
                    break;
                case 54:
                    yzyVar2 = yzy.xm;
                    break;
                case 55:
                    yzyVar2 = yzy.xn;
                    break;
                case 56:
                    yzyVar2 = yzy.xo;
                    break;
                case 57:
                    yzyVar2 = yzy.xp;
                    break;
                case 58:
                    yzyVar2 = yzy.xq;
                    break;
                case 59:
                    yzyVar2 = yzy.xr;
                    break;
                case 60:
                    yzyVar2 = yzy.xs;
                    break;
                case 61:
                    yzyVar2 = yzy.xt;
                    break;
                case 62:
                    yzyVar2 = yzy.xu;
                    break;
                default:
                    throw new RuntimeException(null, null);
            }
            C(yzzVarA, yzyVar2, 1);
            if ((oupVar.b & 16) != 0) {
                oum oumVar = oupVar.g;
                if (oumVar == null) {
                    oumVar = oum.a;
                }
                otw otwVar2 = otsVar.c;
                if (otwVar2 == null) {
                    otwVar2 = otw.a;
                }
                ouh ouhVarB2 = ouh.b(otwVar2.e);
                if (ouhVarB2 == null) {
                    ouhVarB2 = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
                }
                ouo ouoVarB2 = ouo.b(oupVar.e);
                if (ouoVarB2 == null) {
                    ouoVarB2 = ouo.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
                }
                int iOrdinal = ouoVarB2.ordinal();
                if (iOrdinal != 24) {
                    if (iOrdinal == 29 || iOrdinal == 36) {
                        if ((oumVar.b & 64) != 0) {
                            ouh ouhVarB3 = ouh.b(oumVar.i);
                            if (ouhVarB3 == null) {
                                ouhVarB3 = ouh.AUDIO_STREAM_TYPE_UNSPECIFIED;
                            }
                            if (ouhVarB2 != ouhVarB3) {
                                C(yzzVarA, yzy.wP, 1);
                            }
                        }
                    } else if (iOrdinal == 42 && (oumVar.b & 2) != 0 && !oumVar.d) {
                        C(yzzVarA, yzy.xv, 1);
                    }
                } else if ((oumVar.b & 256) != 0) {
                    int i = oumVar.k;
                    C(yzzVarA, i != -6 ? i != -3 ? i != -2 ? i != -1 ? yzy.xI : yzy.xE : yzy.xF : yzy.xH : yzy.xG, 1);
                }
            }
            if ((oupVar.b & 32) != 0) {
                ouk oukVar = oupVar.h;
                if (oukVar == null) {
                    oukVar = ouk.a;
                }
                ouo ouoVarB3 = ouo.b(oupVar.e);
                if (ouoVarB3 == null) {
                    ouoVarB3 = ouo.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
                }
                if (ouoVarB3 == ouo.AUDIO_BOTTOM_HALF_STREAMING_STARTED && (oukVar.b & 8) != 0 && oukVar.f) {
                    C(yzzVarA, yzy.xw, 1);
                }
            }
        }
        C(yzzVarA, yzy.vL, otsVar.h);
        otr otrVarB = otr.b(otsVar.e);
        if (otrVarB == null) {
            otrVarB = otr.AUDIO_STREAMING_STATUS_UNSPECIFIED;
        }
        if (otrVarB != otr.STREAMING) {
            ott ottVar = otsVar.f;
            if (ottVar == null) {
                ottVar = ott.a;
            }
            C(yzzVarA, yzy.vO, ottVar.f);
            for (ouj oujVar : ottVar.r) {
                oui ouiVarB = oui.b(oujVar.d);
                if (ouiVarB == null) {
                    ouiVarB = oui.DROPPED_MEDIA_STREAM_FRAME_REASON_UNSPECIFIED;
                }
                switch (ouiVarB.ordinal()) {
                    case 0:
                        yzyVar = yzy.vP;
                        break;
                    case 1:
                        yzyVar = yzy.vQ;
                        break;
                    case 2:
                        yzyVar = yzy.vR;
                        break;
                    case 3:
                        yzyVar = yzy.vS;
                        break;
                    case 4:
                        yzyVar = yzy.vT;
                        break;
                    case 5:
                        yzyVar = yzy.vU;
                        break;
                    case 6:
                        yzyVar = yzy.vV;
                        break;
                    case 7:
                        yzyVar = yzy.vW;
                        break;
                    case 8:
                        yzyVar = yzy.vX;
                        break;
                    case 9:
                        yzyVar = yzy.vY;
                        break;
                    default:
                        throw new RuntimeException(null, null);
                }
                C(yzzVarA, yzyVar, oujVar.e);
            }
            C(yzzVarA, yzy.vM, ottVar.g);
            C(yzzVarA, yzy.vN, ottVar.i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [irh, java.lang.Object] */
    public final void r() {
        synchronized (this.d) {
            ?? r1 = this.b;
            for (Map.Entry entry : r1.entrySet()) {
                iry iryVar = (iry) entry.getKey();
                ?? r5 = this.a;
                rrb rrbVarH = rrc.h(yxy.CAR_SERVICE, iryVar.a, iryVar.b);
                rrbVarH.w(((Integer) entry.getValue()).intValue());
                r5.a((rrc) rrbVarH.l());
            }
            r1.clear();
        }
    }

    public final void s(eww ewwVar) {
        if (((aaj) this.c).f(ewwVar)) {
            ((ewx) this.b).c(this, ewwVar, -1);
        }
    }

    public final void t(eww ewwVar, int i) {
        if (i != 1) {
            i = 0;
        }
        if (((aaj) this.c).f(ewwVar)) {
            ((ewx) this.b).c(this, ewwVar, i);
        }
    }

    public final void u(ewt ewtVar) {
        if (((aaj) this.a).f(ewtVar)) {
            Object obj = this.b;
            if (ewtVar.f != null) {
                throw new IllegalArgumentException(a.bm(ewtVar, "Handler '", "' is already registered with a dispatcher"));
            }
            ewx ewxVar = (ewx) obj;
            ewxVar.b.addFirst(ewtVar);
            ewtVar.f = this;
            ewxVar.b();
        }
    }

    public final void v(eww ewwVar, ews ewsVar) {
        ewx ewxVar = (ewx) this.b;
        if (ewxVar.d != 0) {
            return;
        }
        ewt ewtVarA = ewxVar.a(-1);
        ewxVar.c = ewtVarA;
        ewxVar.d = -1;
        ewxVar.e = ewwVar;
        if (ewsVar != null) {
            if (ewtVarA != null) {
                ewtVarA.e();
            }
            ewxVar.f.d(new ewz(ewsVar));
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [erq, java.lang.Object] */
    public final erm w(afhe afheVar, String str) {
        erm ermVarI;
        synchronized (this.b) {
            Map map = ((ert) this.a).a;
            ermVarI = (erm) map.get(str);
            if (afheVar.isInstance(ermVarI)) {
                ermVarI.getClass();
            } else {
                ese eseVar = new ese((esc) this.c);
                eseVar.b(ers.a, str);
                ermVarI = ebf.i(this.d, afheVar, eseVar);
                ermVarI.getClass();
                erm ermVar = (erm) map.put(str, ermVarI);
                if (ermVar != null) {
                    ermVar.g();
                }
            }
        }
        return ermVarI;
    }

    public final ArrayList x(Object obj) {
        return (ArrayList) ((aat) this.a).get(obj);
    }

    public final void y(Object obj) {
        aat aatVar = (aat) this.a;
        if (aatVar.containsKey(obj)) {
            return;
        }
        aatVar.put(obj, null);
    }

    public final void z(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((aat) this.a).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                z(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public mko(cxb cxbVar, ddk ddkVar, zh zhVar) {
        this.d = cxbVar;
        this.b = ddkVar;
        this.a = zhVar;
        this.c = new aag(2);
    }

    public mko(izj izjVar) {
        this.d = izjVar;
        this.b = new ewx();
        int i = aak.a;
        new aaj(6);
        this.a = new aaj(6);
        this.c = new aaj(6);
    }

    public mko(byte[] bArr, byte[] bArr2) {
        this.c = new dzl(10);
        this.a = new aat(0);
        this.d = new ArrayList();
        this.b = new HashSet();
    }

    public mko(ert ertVar, erq erqVar, esc escVar) {
        this.a = ertVar;
        this.d = erqVar;
        this.c = escVar;
        this.b = new eqy();
    }

    public mko(iri iriVar, irh irhVar) {
        this.d = new Object();
        this.b = new HashMap();
        this.c = iriVar;
        this.a = irhVar;
    }

    public mko(byte[] bArr) {
        this.a = krr.a;
        this.c = krr.b;
        this.d = new ktu(krr.v);
        this.b = new ktu(krr.w);
    }

    public mko(Context context, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        this.d = acxa.a.gu().J().b;
        this.a = context;
        this.b = sharedPreferences;
        this.c = sharedPreferences2;
    }

    public mko(Context context) {
        final eqj eqmVar;
        nte nteVar = new nte(context);
        context.getClass();
        acxa acxaVar = acxa.a;
        final int i = 0;
        if (acxaVar.gu().aF() && Build.VERSION.SDK_INT >= 36 && context.getPackageManager().hasSystemFeature("android.hardware.telephony.satellite")) {
            eqmVar = new ntt(context);
        } else {
            eqmVar = new eqm(false);
        }
        ntn ntnVar = (ntn) mki.a.i(ntn.class);
        if (ntnVar.a == null) {
            ntm ntmVar = new ntm(context.getApplicationContext(), new nth());
            ntmVar.m(new ntq(nts.n, -1, false));
            ntnVar.a = ntmVar;
        }
        Object obj = ntnVar.a;
        final ntv ntvVar = new ntv(context);
        ntvVar.m(null);
        this.a = nteVar;
        this.d = eqmVar;
        this.c = eqy.c(ntvVar, new njq(obj, 8));
        eqj eqjVarA = tby.a(nteVar, eqy.b(ntvVar, new nna(9)));
        if (acxaVar.gu().aF()) {
            final eql eqlVar = new eql();
            this.b = eqlVar;
            final int i2 = 1;
            final nte nteVar2 = nteVar;
            eqlVar.r(nteVar2, new eqn() { // from class: ntp
                @Override // defpackage.eqn
                public final void eS(Object obj2) {
                    int i3 = i2;
                    if (i3 == 0) {
                        Boolean bool = (Boolean) eqmVar.e();
                        ServiceState serviceState = (ServiceState) ntvVar.e();
                        mko.p(eqlVar, bool, (Boolean) obj2, serviceState);
                        return;
                    }
                    if (i3 != 1) {
                        Boolean bool2 = (Boolean) eqmVar.e();
                        Boolean bool3 = (Boolean) ntvVar.e();
                        mko.p(eqlVar, bool2, bool3, (ServiceState) obj2);
                        return;
                    }
                    Boolean bool4 = (Boolean) eqmVar.e();
                    ServiceState serviceState2 = (ServiceState) ntvVar.e();
                    mko.p(eqlVar, (Boolean) obj2, bool4, serviceState2);
                }
            });
            eqlVar.r(eqmVar, new eqn() { // from class: ntp
                @Override // defpackage.eqn
                public final void eS(Object obj2) {
                    int i3 = i;
                    if (i3 == 0) {
                        Boolean bool = (Boolean) nteVar2.e();
                        ServiceState serviceState = (ServiceState) ntvVar.e();
                        mko.p(eqlVar, bool, (Boolean) obj2, serviceState);
                        return;
                    }
                    if (i3 != 1) {
                        Boolean bool2 = (Boolean) nteVar2.e();
                        Boolean bool3 = (Boolean) ntvVar.e();
                        mko.p(eqlVar, bool2, bool3, (ServiceState) obj2);
                        return;
                    }
                    Boolean bool4 = (Boolean) nteVar2.e();
                    ServiceState serviceState2 = (ServiceState) ntvVar.e();
                    mko.p(eqlVar, (Boolean) obj2, bool4, serviceState2);
                }
            });
            final int i3 = 2;
            eqlVar.r(ntvVar, new eqn() { // from class: ntp
                @Override // defpackage.eqn
                public final void eS(Object obj2) {
                    int i32 = i3;
                    if (i32 == 0) {
                        Boolean bool = (Boolean) nteVar2.e();
                        ServiceState serviceState = (ServiceState) eqmVar.e();
                        mko.p(eqlVar, bool, (Boolean) obj2, serviceState);
                        return;
                    }
                    if (i32 != 1) {
                        Boolean bool2 = (Boolean) nteVar2.e();
                        Boolean bool3 = (Boolean) eqmVar.e();
                        mko.p(eqlVar, bool2, bool3, (ServiceState) obj2);
                        return;
                    }
                    Boolean bool4 = (Boolean) nteVar2.e();
                    ServiceState serviceState2 = (ServiceState) eqmVar.e();
                    mko.p(eqlVar, (Boolean) obj2, bool4, serviceState2);
                }
            });
            return;
        }
        this.b = eqy.b(eqjVarA, new erl(ntr.b, ntr.c, 17));
    }

    public mko() {
        this.b = new yfu(4);
        this.a = new yfu(4);
        this.c = new yfu(4);
        this.d = new yfu(4);
    }

    public mko(yxy yxyVar, yxc yxcVar, yxb yxbVar, List list) {
        this.d = yxyVar;
        this.c = yxcVar;
        this.a = yxbVar;
        this.b = yfq.o(list);
    }

    public mko(aitx aitxVar, afec afecVar, afeg afegVar, afeg afegVar2) {
        this.b = aitxVar;
        this.a = afegVar2;
        this.c = afpt.r(Alert.DURATION_SHOW_INDEFINITELY, 0, 6);
        this.d = new kwp((byte[]) null, (byte[]) null, (byte[]) null);
        aivh aivhVar = (aivh) ((ajbw) aitxVar).a.get(aivh.d);
        if (aivhVar != null) {
            aivhVar.p(new acg((Object) afecVar, (Object) this, (Object) afegVar, 14, (short[]) null));
        }
    }
}
