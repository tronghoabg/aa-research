package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mku {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public mku(defpackage.dte dteVar) {
        java.lang.String str;
        android.os.Bundle[] bundleArr;
        defpackage.dta dtaVarD;
        this.b = new android.os.Bundle();
        this.c = dteVar;
        android.content.Context context = dteVar.a;
        this.d = context;
        android.app.Notification.Builder builder = new android.app.Notification.Builder(dteVar.a, dteVar.x);
        this.a = builder;
        android.app.Notification notification = dteVar.y;
        android.os.Bundle[] bundleArr2 = null;
        int i = 2;
        int i2 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dteVar.e).setContentText(dteVar.f).setContentInfo(null).setContentIntent(dteVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(dteVar.l, dteVar.m, dteVar.n);
        androidx.core.graphics.drawable.IconCompat iconCompat = dteVar.h;
        builder.setLargeIcon(iconCompat == null ? null : defpackage.dtq.b(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(dteVar.i);
        defpackage.duj dujVar = dteVar.k;
        if (dujVar instanceof defpackage.dth) {
            defpackage.dth dthVar = (defpackage.dth) dujVar;
            android.app.PendingIntent pendingIntent = dthVar.b;
            defpackage.dta dtaVarD2 = pendingIntent == null ? dthVar.d(2131231919, 2132083260, dthVar.f, 2131099996, dthVar.c) : dthVar.d(2131231919, 2132083259, dthVar.f, 2131099996, pendingIntent);
            android.app.PendingIntent pendingIntent2 = dthVar.a;
            if (pendingIntent2 == null) {
                dtaVarD = null;
            } else {
                boolean z = dthVar.d;
                dtaVarD = dthVar.d(true != z ? 2131231915 : 2131231917, true != z ? 2132083257 : 2132083258, dthVar.e, 2131099995, pendingIntent2);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(3);
            arrayList.add(dtaVarD2);
            java.util.ArrayList arrayList2 = dthVar.g.b;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                defpackage.dta dtaVar = (defpackage.dta) arrayList2.get(i3);
                if (dtaVar.f) {
                    arrayList.add(dtaVar);
                } else if (dtaVar == null || !dtaVar.a.getBoolean("key_action_priority")) {
                    arrayList.add(dtaVar);
                    i--;
                }
                if (dtaVarD != null && i == 1) {
                    arrayList.add(dtaVarD);
                    i = 0;
                }
            }
            if (dtaVarD != null && i > 0) {
                arrayList.add(dtaVarD);
            }
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                A((defpackage.dta) arrayList.get(i4));
            }
        } else {
            java.util.ArrayList arrayList3 = dteVar.b;
            int size3 = arrayList3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                A((defpackage.dta) arrayList3.get(i5));
            }
        }
        android.os.Bundle bundle = dteVar.s;
        if (bundle != null) {
            ((android.os.Bundle) this.b).putAll(bundle);
        }
        ((android.app.Notification.Builder) this.a).setShowWhen(dteVar.j);
        ((android.app.Notification.Builder) this.a).setLocalOnly(dteVar.q);
        ((android.app.Notification.Builder) this.a).setGroup(dteVar.o);
        ((android.app.Notification.Builder) this.a).setSortKey(null);
        ((android.app.Notification.Builder) this.a).setGroupSummary(dteVar.p);
        ((android.app.Notification.Builder) this.a).setCategory(dteVar.r);
        ((android.app.Notification.Builder) this.a).setColor(dteVar.t);
        ((android.app.Notification.Builder) this.a).setVisibility(dteVar.u);
        ((android.app.Notification.Builder) this.a).setPublicVersion(dteVar.v);
        ((android.app.Notification.Builder) this.a).setSound(notification.sound, notification.audioAttributes);
        java.util.ArrayList arrayList4 = dteVar.z;
        if (!arrayList4.isEmpty()) {
            java.util.Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                ((android.app.Notification.Builder) this.a).addPerson((java.lang.String) it.next());
            }
        }
        if (dteVar.d.size() > 0) {
            android.os.Bundle bundle2 = dteVar.b().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new android.os.Bundle() : bundle2;
            android.os.Bundle bundle3 = new android.os.Bundle(bundle2);
            android.os.Bundle bundle4 = new android.os.Bundle();
            int i6 = 0;
            while (i6 < dteVar.d.size()) {
                java.lang.String string = java.lang.Integer.toString(i6);
                defpackage.dta dtaVar2 = (defpackage.dta) dteVar.d.get(i6);
                android.os.Bundle bundle5 = new android.os.Bundle();
                androidx.core.graphics.drawable.IconCompat iconCompatA = dtaVar2.a();
                bundle5.putInt("icon", iconCompatA != null ? iconCompatA.a() : i2);
                bundle5.putCharSequence("title", dtaVar2.j);
                bundle5.putParcelable("actionIntent", dtaVar2.k);
                android.os.Bundle bundle6 = new android.os.Bundle(dtaVar2.a);
                bundle6.putBoolean("android.support.allowGeneratedReplies", dtaVar2.c);
                bundle5.putBundle("extras", bundle6);
                dut[] dutVarArr = dtaVar2.b;
                if (dutVarArr == null) {
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new android.os.Bundle[dutVarArr.length];
                    int i7 = i2;
                    while (i7 < dutVarArr.length) {
                        dut dutVar = dutVarArr[i7];
                        android.os.Bundle bundle7 = new android.os.Bundle();
                        int i8 = i6;
                        int i9 = i7;
                        bundle7.putString("resultKey", dutVar.a);
                        bundle7.putCharSequence("label", dutVar.b);
                        bundle7.putCharSequenceArray("choices", dutVar.c);
                        bundle7.putBoolean("allowFreeFormInput", dutVar.d);
                        bundle7.putBundle("extras", dutVar.f);
                        java.util.Set set = dutVar.g;
                        if (set != null && !set.isEmpty()) {
                            java.util.ArrayList<java.lang.String> arrayList5 = new java.util.ArrayList<>(set.size());
                            java.util.Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                arrayList5.add((java.lang.String) it2.next());
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
                bundle5.putBoolean("showsUserInterface", dtaVar2.d);
                bundle5.putInt("semanticAction", dtaVar2.e);
                bundle4.putBundle(string, bundle5);
                i6 = i10 + 1;
                bundleArr2 = null;
                i2 = 0;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            dteVar.b().putBundle("android.car.EXTENSIONS", bundle2);
            ((android.os.Bundle) this.b).putBundle("android.car.EXTENSIONS", bundle3);
        }
        ((android.app.Notification.Builder) this.a).setExtras(dteVar.s);
        ll$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, (java.lang.CharSequence[]) null);
        android.widget.RemoteViews remoteViews = dteVar.w;
        if (remoteViews != null) {
            ll$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, remoteViews);
        }
        ep$.ExternalSyntheticApiModelOutline1.m((android.app.Notification.Builder) this.a, 0);
        ep$.ExternalSyntheticApiModelOutline1.m((android.app.Notification.Builder) this.a, (java.lang.CharSequence) null);
        ep$.ExternalSyntheticApiModelOutline1.m((android.app.Notification.Builder) this.a, (java.lang.String) null);
        ep$.ExternalSyntheticApiModelOutline1.m((android.app.Notification.Builder) this.a, 0L);
        ep$.ExternalSyntheticApiModelOutline1.m$1((android.app.Notification.Builder) this.a, 0);
        if (!android.text.TextUtils.isEmpty(dteVar.x)) {
            ((android.app.Notification.Builder) this.a).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        java.util.ArrayList arrayList6 = dteVar.c;
        int size4 = arrayList6.size();
        for (int i11 = 0; i11 < size4; i11++) {
            hh$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, dtb.d((dur) arrayList6.get(i11)));
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            ep$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, true);
            str = null;
            ep$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, (android.app.Notification.BubbleMetadata) null);
        } else {
            str = null;
        }
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            b$.ExternalSyntheticApiModelOutline0.m((android.app.Notification.Builder) this.a, str);
        }
    }

    private final void A(defpackage.dta dtaVar) {
        androidx.core.graphics.drawable.IconCompat iconCompatA = dtaVar.a();
        android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(iconCompatA != null ? defpackage.dtq.b(iconCompatA, null) : null, dtaVar.j, dtaVar.k);
        dut[] dutVarArr = dtaVar.b;
        if (dutVarArr != null) {
            for (android.app.RemoteInput remoteInput : dut.a(dutVarArr)) {
                builder.addRemoteInput(remoteInput);
            }
        }
        android.os.Bundle bundle = new android.os.Bundle(dtaVar.a);
        bundle.putBoolean("android.support.allowGeneratedReplies", dtaVar.c);
        ll$.ExternalSyntheticApiModelOutline0.m(builder, dtaVar.c);
        int i = dtaVar.e;
        bundle.putInt("android.support.action.semanticAction", i);
        jx$.ExternalSyntheticApiModelOutline3.m(builder, i);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            ep$.ExternalSyntheticApiModelOutline0.m(builder, dtaVar.f);
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            a$.ExternalSyntheticApiModelOutline0.m(builder, dtaVar.l);
        }
        if (android.os.Build.VERSION.SDK_INT >= 37) {
            dac$.ExternalSyntheticApiModelOutline0.m(builder, dtaVar.g);
            dac$.ExternalSyntheticApiModelOutline0.m$1(builder, dtaVar.h);
        }
        bundle.putBoolean("android.support.action.showsUserInterface", dtaVar.d);
        builder.addExtras(bundle);
        ((android.app.Notification.Builder) this.a).addAction(builder.build());
    }

    public static void p(defpackage.eqr eqrVar, java.lang.Boolean bool, java.lang.Boolean bool2, android.telephony.ServiceState serviceState) {
        if (java.lang.Boolean.TRUE.equals(bool) && (serviceState == null || serviceState.getState() != 2)) {
            eqrVar.m(nuf.b);
        } else if (java.lang.Boolean.TRUE.equals(bool2) && java.lang.Boolean.FALSE.equals(bool)) {
            eqrVar.m(nuf.d);
        } else {
            eqrVar.m(nuf.c);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
    private final void z(defpackage.zbe zbeVar, defpackage.zbd zbdVar, int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (i == 0) {
            return;
        }
        defpackage.isg isgVar = new defpackage.isg(zbeVar, zbdVar);
        synchronized (this.d) {
            ?? r1 = this.b;
            java.lang.Integer num = (java.lang.Integer) r1.get(isgVar);
            r1.put(isgVar, java.lang.Integer.valueOf((num == null ? 0 : num.intValue()) + i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    @java.lang.Deprecated
    public final void a(java.lang.String str, boolean z) {
        if (defpackage.acyc.aZ() && this.d.contains(str)) {
            this.c.edit().putBoolean(str, z).apply();
        }
        this.b.edit().putBoolean(str, z).apply();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void b(java.lang.String str, boolean z) {
        this.c.edit().putBoolean(str, z).apply();
    }

    public final boolean c() {
        return g("key_settings_always_autoplay_media_3", i());
    }

    public final boolean d() {
        return g("key_settings_autoplay_messages", ((android.content.Context) this.a).getResources().getBoolean(2131034212));
    }

    public final boolean e() {
        boolean zX = defpackage.acnf.x();
        java.lang.Object obj = this.a;
        return h("key_settings_gemini_barge_in", zX ? ((android.content.Context) obj).getResources().getBoolean(2131034217) : ((android.content.Context) obj).getResources().getBoolean(2131034218));
    }

    public final boolean f() {
        return h("key_settings_gemini_share_precise_location", ((android.content.Context) this.a).getResources().getBoolean(2131034219));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.SharedPreferences, java.lang.Object] */
    @java.lang.Deprecated
    public final boolean g(java.lang.String str, boolean z) {
        return (defpackage.acyc.a.fF().aX() && this.d.contains(str)) ? this.c.getBoolean(str, z) : this.b.getBoolean(str, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean h(java.lang.String str, boolean z) {
        return this.c.getBoolean(str, z);
    }

    public final boolean i() {
        return g("key_settings_autoplay_media", ((android.content.Context) this.a).getResources().getBoolean(2131034220));
    }

    public final boolean j() {
        return h("key_settings_messaging_allow_notification_data_sharing_agsa", ((android.content.Context) this.a).getResources().getBoolean(2131034221));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.content.SharedPreferences, java.lang.Object] */
    public final boolean k() {
        if (defpackage.acyc.aZ()) {
            ?? r0 = this.c;
            if (!r0.contains("key_settings_notification_chime_enabled") && r0.contains("key_settings_no_notification_sound")) {
                defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.SETTINGS_COMMON, defpackage.zbd.eu));
                r0.edit().putBoolean("key_settings_notification_chime_enabled", !this.b.getBoolean("key_settings_no_notification_sound", false)).apply();
            }
        } else {
            ?? r1 = this.b;
            if (!r1.contains("key_settings_notification_chime_enabled") && r1.contains("key_settings_no_notification_sound")) {
                defpackage.omf.u().f(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.SETTINGS_COMMON, defpackage.zbd.eu));
                r1.edit().putBoolean("key_settings_notification_chime_enabled", !r1.getBoolean("key_settings_no_notification_sound", false)).apply();
            }
        }
        return g("key_settings_notification_chime_enabled", ((android.content.Context) this.a).getResources().getBoolean(2131034226));
    }

    public final boolean l() {
        return g("key_settings_messaging_group_notifications", ((android.content.Context) this.a).getResources().getBoolean(2131034222));
    }

    public final boolean m() {
        return g("key_settings_show_message_summarization", ((android.content.Context) this.a).getResources().getBoolean(2131034228));
    }

    public final boolean n() {
        return g("key_settings_messaging_notifications_enabled", ((android.content.Context) this.a).getResources().getBoolean(2131034223));
    }

    public final boolean o() {
        return g("key_work_profile_support", ((android.content.Context) this.a).getResources().getBoolean(2131034229));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [irq, java.lang.Object] */
    public final void q(defpackage.oup oupVar) {
        defpackage.zbd zbdVar;
        defpackage.zbd zbdVar2;
        defpackage.zbd zbdVar3;
        defpackage.out outVar = oupVar.c;
        if (outVar == null) {
            outVar = defpackage.out.a;
        }
        defpackage.ove oveVarB = defpackage.ove.b(outVar.e);
        if (oveVarB == null) {
            oveVarB = defpackage.ove.AUDIO_STREAM_TYPE_UNSPECIFIED;
        }
        defpackage.zbe zbeVarA = this.c.a(oveVarB);
        for (defpackage.ovm ovmVar : oupVar.g) {
            defpackage.ovl ovlVarB = defpackage.ovl.b(ovmVar.e);
            if (ovlVarB == null) {
                ovlVarB = defpackage.ovl.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
            }
            switch (ovlVarB.ordinal()) {
                case defpackage.abnt.b /* 0 */:
                    zbdVar2 = defpackage.zbd.wd;
                    break;
                case 1:
                    zbdVar2 = defpackage.zbd.we;
                    break;
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    zbdVar2 = defpackage.zbd.wf;
                    break;
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    zbdVar2 = defpackage.zbd.wg;
                    break;
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                    zbdVar2 = defpackage.zbd.wh;
                    break;
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    zbdVar2 = defpackage.zbd.wi;
                    break;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    zbdVar2 = defpackage.zbd.wj;
                    break;
                case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                    zbdVar2 = defpackage.zbd.wk;
                    break;
                case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                    zbdVar2 = defpackage.zbd.wl;
                    break;
                case 9:
                    zbdVar2 = defpackage.zbd.wm;
                    break;
                case 10:
                    zbdVar2 = defpackage.zbd.wn;
                    break;
                case 11:
                    zbdVar2 = defpackage.zbd.wo;
                    break;
                case 12:
                    zbdVar2 = defpackage.zbd.wp;
                    break;
                case 13:
                    zbdVar2 = defpackage.zbd.wq;
                    break;
                case 14:
                    zbdVar2 = defpackage.zbd.wr;
                    break;
                case 15:
                    zbdVar2 = defpackage.zbd.ws;
                    break;
                case 16:
                    zbdVar2 = defpackage.zbd.wt;
                    break;
                case 17:
                    zbdVar2 = defpackage.zbd.wu;
                    break;
                case 18:
                    zbdVar2 = defpackage.zbd.wv;
                    break;
                case 19:
                    zbdVar2 = defpackage.zbd.ww;
                    break;
                case 20:
                    zbdVar2 = defpackage.zbd.wx;
                    break;
                case 21:
                    zbdVar2 = defpackage.zbd.wy;
                    break;
                case 22:
                    zbdVar2 = defpackage.zbd.wz;
                    break;
                case 23:
                    zbdVar2 = defpackage.zbd.wL;
                    break;
                case 24:
                    zbdVar2 = defpackage.zbd.wM;
                    break;
                case 25:
                    zbdVar2 = defpackage.zbd.wO;
                    break;
                case 26:
                    zbdVar2 = defpackage.zbd.wP;
                    break;
                case 27:
                    zbdVar2 = defpackage.zbd.wQ;
                    break;
                case 28:
                    zbdVar2 = defpackage.zbd.wR;
                    break;
                case 29:
                    zbdVar2 = defpackage.zbd.wS;
                    break;
                case 30:
                    zbdVar2 = defpackage.zbd.wU;
                    break;
                case 31:
                    zbdVar2 = defpackage.zbd.wN;
                    break;
                case 32:
                    zbdVar2 = defpackage.zbd.wI;
                    break;
                case 33:
                    zbdVar2 = defpackage.zbd.wD;
                    break;
                case 34:
                    zbdVar2 = defpackage.zbd.wV;
                    break;
                case 35:
                    zbdVar2 = defpackage.zbd.wW;
                    break;
                case 36:
                    zbdVar2 = defpackage.zbd.wX;
                    break;
                case 37:
                    zbdVar2 = defpackage.zbd.xC;
                    break;
                case 38:
                    zbdVar2 = defpackage.zbd.xa;
                    break;
                case 39:
                    zbdVar2 = defpackage.zbd.xb;
                    break;
                case 40:
                    zbdVar2 = defpackage.zbd.xc;
                    break;
                case 41:
                    zbdVar2 = defpackage.zbd.xd;
                    break;
                case 42:
                    zbdVar2 = defpackage.zbd.xe;
                    break;
                case 43:
                    zbdVar2 = defpackage.zbd.xf;
                    break;
                case 44:
                    zbdVar2 = defpackage.zbd.xg;
                    break;
                case 45:
                    zbdVar2 = defpackage.zbd.xh;
                    break;
                case 46:
                    zbdVar2 = defpackage.zbd.xi;
                    break;
                case 47:
                    zbdVar2 = defpackage.zbd.xj;
                    break;
                case 48:
                    zbdVar2 = defpackage.zbd.xk;
                    break;
                case 49:
                    zbdVar2 = defpackage.zbd.xl;
                    break;
                case 50:
                    zbdVar2 = defpackage.zbd.xm;
                    break;
                case 51:
                    zbdVar2 = defpackage.zbd.xn;
                    break;
                case 52:
                    zbdVar2 = defpackage.zbd.xo;
                    break;
                case 53:
                    zbdVar2 = defpackage.zbd.xp;
                    break;
                case 54:
                    zbdVar2 = defpackage.zbd.xq;
                    break;
                case 55:
                    zbdVar2 = defpackage.zbd.xr;
                    break;
                case 56:
                    zbdVar2 = defpackage.zbd.xs;
                    break;
                case 57:
                    zbdVar2 = defpackage.zbd.xt;
                    break;
                case 58:
                    zbdVar2 = defpackage.zbd.xu;
                    break;
                case 59:
                    zbdVar2 = defpackage.zbd.xv;
                    break;
                case 60:
                    zbdVar2 = defpackage.zbd.xw;
                    break;
                case 61:
                    zbdVar2 = defpackage.zbd.xx;
                    break;
                case 62:
                    zbdVar2 = defpackage.zbd.xy;
                    break;
                default:
                    throw new java.lang.RuntimeException(null, null);
            }
            z(zbeVarA, zbdVar2, 1);
            if ((ovmVar.b & 16) != 0) {
                defpackage.ovj ovjVar = ovmVar.g;
                if (ovjVar == null) {
                    ovjVar = defpackage.ovj.a;
                }
                defpackage.out outVar2 = oupVar.c;
                if (outVar2 == null) {
                    outVar2 = defpackage.out.a;
                }
                defpackage.ove oveVarB2 = defpackage.ove.b(outVar2.e);
                if (oveVarB2 == null) {
                    oveVarB2 = defpackage.ove.AUDIO_STREAM_TYPE_UNSPECIFIED;
                }
                defpackage.ovl ovlVarB2 = defpackage.ovl.b(ovmVar.e);
                if (ovlVarB2 == null) {
                    ovlVarB2 = defpackage.ovl.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
                }
                int iOrdinal = ovlVarB2.ordinal();
                if (iOrdinal != 24) {
                    if (iOrdinal == 29 || iOrdinal == 36) {
                        if ((ovjVar.b & 64) != 0) {
                            defpackage.ove oveVarB3 = defpackage.ove.b(ovjVar.i);
                            if (oveVarB3 == null) {
                                oveVarB3 = defpackage.ove.AUDIO_STREAM_TYPE_UNSPECIFIED;
                            }
                            if (oveVarB2 != oveVarB3) {
                                z(zbeVarA, defpackage.zbd.wT, 1);
                            }
                        }
                    } else if (iOrdinal == 42 && (ovjVar.b & 2) != 0 && !ovjVar.d) {
                        z(zbeVarA, defpackage.zbd.xz, 1);
                    }
                } else if ((ovjVar.b & 256) != 0) {
                    int i = ovjVar.k;
                    if (i == -6) {
                        zbdVar3 = defpackage.zbd.xK;
                    } else if (i == -3) {
                        zbdVar3 = defpackage.zbd.xL;
                    } else if (i != -2) {
                        zbdVar3 = i != -1 ? defpackage.zbd.xM : defpackage.zbd.xI;
                    } else {
                        zbdVar3 = defpackage.zbd.xJ;
                    }
                    z(zbeVarA, zbdVar3, 1);
                }
            }
            if ((ovmVar.b & 32) != 0) {
                defpackage.ovh ovhVar = ovmVar.h;
                if (ovhVar == null) {
                    ovhVar = defpackage.ovh.a;
                }
                defpackage.ovl ovlVarB3 = defpackage.ovl.b(ovmVar.e);
                if (ovlVarB3 == null) {
                    ovlVarB3 = defpackage.ovl.MEDIA_STREAM_EVENT_TYPE_UNSPECIFIED;
                }
                if (ovlVarB3 == defpackage.ovl.AUDIO_BOTTOM_HALF_STREAMING_STARTED && (ovhVar.b & 8) != 0 && ovhVar.f) {
                    z(zbeVarA, defpackage.zbd.xA, 1);
                }
            }
        }
        z(zbeVarA, defpackage.zbd.vP, oupVar.h);
        defpackage.ouo ouoVarB = defpackage.ouo.b(oupVar.e);
        if (ouoVarB == null) {
            ouoVarB = defpackage.ouo.AUDIO_STREAMING_STATUS_UNSPECIFIED;
        }
        if (ouoVarB != defpackage.ouo.STREAMING) {
            defpackage.ouq ouqVar = oupVar.f;
            if (ouqVar == null) {
                ouqVar = defpackage.ouq.a;
            }
            z(zbeVarA, defpackage.zbd.vS, ouqVar.f);
            for (ovg ovgVar : ouqVar.r) {
                defpackage.ovf ovfVarB = defpackage.ovf.b(ovgVar.d);
                if (ovfVarB == null) {
                    ovfVarB = defpackage.ovf.DROPPED_MEDIA_STREAM_FRAME_REASON_UNSPECIFIED;
                }
                switch (ovfVarB.ordinal()) {
                    case defpackage.abnt.b /* 0 */:
                        zbdVar = defpackage.zbd.vT;
                        break;
                    case 1:
                        zbdVar = defpackage.zbd.vU;
                        break;
                    case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                        zbdVar = defpackage.zbd.vV;
                        break;
                    case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                        zbdVar = defpackage.zbd.vW;
                        break;
                    case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                        zbdVar = defpackage.zbd.vX;
                        break;
                    case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                        zbdVar = defpackage.zbd.vY;
                        break;
                    case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                        zbdVar = defpackage.zbd.vZ;
                        break;
                    case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                        zbdVar = defpackage.zbd.wa;
                        break;
                    case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                        zbdVar = defpackage.zbd.wb;
                        break;
                    case 9:
                        zbdVar = defpackage.zbd.wc;
                        break;
                    default:
                        throw new java.lang.RuntimeException(null, null);
                }
                z(zbeVarA, zbdVar, ovgVar.e);
            }
            z(zbeVarA, defpackage.zbd.vQ, ouqVar.g);
            z(zbeVarA, defpackage.zbd.vR, ouqVar.i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v0, types: [irp, java.lang.Object] */
    public final void r() {
        synchronized (this.d) {
            ?? r1 = this.b;
            for (java.util.Map.Entry entry : r1.entrySet()) {
                defpackage.isg isgVar = (defpackage.isg) entry.getKey();
                ?? r5 = this.a;
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, isgVar.a, isgVar.b);
                rrvVarH.w(((java.lang.Integer) entry.getValue()).intValue());
                r5.a((defpackage.rrw) rrvVarH.l());
            }
            r1.clear();
        }
    }

    public final void s(defpackage.exc excVar) {
        if (((defpackage.aaq) this.c).f(excVar)) {
            ((defpackage.exd) this.b).c(this, excVar, -1);
        }
    }

    public final void t(defpackage.exc excVar, int i) {
        if (i != 1) {
            i = 0;
        }
        if (((defpackage.aaq) this.c).f(excVar)) {
            ((defpackage.exd) this.b).c(this, excVar, i);
        }
    }

    public final void u(defpackage.ewz ewzVar) {
        if (((defpackage.aaq) this.a).f(ewzVar)) {
            java.lang.Object obj = this.b;
            if (ewzVar.f != null) {
                throw new java.lang.IllegalArgumentException(defpackage.a.bl(ewzVar, "Handler '", "' is already registered with a dispatcher"));
            }
            defpackage.exd exdVar = (defpackage.exd) obj;
            exdVar.b.addFirst(ewzVar);
            ewzVar.f = this;
            exdVar.b();
        }
    }

    public final void v(defpackage.exc excVar, ewy ewyVar) {
        defpackage.exd exdVar = (defpackage.exd) this.b;
        if (exdVar.d != 0) {
            return;
        }
        defpackage.ewz ewzVarA = exdVar.a(-1);
        exdVar.c = ewzVarA;
        exdVar.d = -1;
        exdVar.e = excVar;
        if (ewyVar != null) {
            if (ewzVarA != null) {
                ewzVarA.e();
            }
            exdVar.f.d(new exf(ewyVar));
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [erw, java.lang.Object] */
    public final defpackage.ers w(defpackage.afie afieVar, java.lang.String str) {
        defpackage.ers ersVarJ;
        synchronized (this.d) {
            java.util.Map map = ((defpackage.erz) this.b).a;
            ersVarJ = (defpackage.ers) map.get(str);
            if (afieVar.isInstance(ersVarJ)) {
                ersVarJ.getClass();
            } else {
                defpackage.esk eskVar = new defpackage.esk((defpackage.esi) this.a);
                eskVar.b(defpackage.ery.a, str);
                ersVarJ = defpackage.ebl.j(this.c, afieVar, eskVar);
                ersVarJ.getClass();
                defpackage.ers ersVar = (defpackage.ers) map.put(str, ersVarJ);
                if (ersVar != null) {
                    ersVar.g();
                }
            }
        }
        return ersVarJ;
    }

    public final defpackage.dec x() {
        defpackage.ddz ddzVar = new defpackage.ddz();
        return new defpackage.dec((defpackage.cge) this.c, false, (defpackage.cxl) this.b, ddzVar);
    }

    public final void y(defpackage.cxl cxlVar, defpackage.ddz ddzVar) {
        defpackage.cgm cgmVar;
        defpackage.ddz ddzVar2;
        defpackage.cgm cgmVar2;
        defpackage.ddz ddzVar3;
        defpackage.dfb dfbVar;
        defpackage.dfb dfbVar2;
        defpackage.aan aanVar = (defpackage.aan) this.d;
        java.lang.Object[] objArr = aanVar.a;
        int i = aanVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.cgp cgpVar = (defpackage.cgp) objArr[i2];
            defpackage.ddz ddzVarR = cxlVar.r();
            int i3 = cxlVar.c;
            if (ddzVar != null) {
                cgmVar = (defpackage.cgm) ddzVar.g(defpackage.def.s);
                ddzVar2 = ddzVar;
            } else {
                cgmVar = null;
                ddzVar2 = null;
            }
            if (ddzVarR != null) {
                cgmVar2 = (defpackage.cgm) ddzVarR.g(defpackage.def.s);
                ddzVar3 = ddzVarR;
            } else {
                cgmVar2 = null;
                ddzVar3 = null;
            }
            defpackage.cgm cgmVar3 = defpackage.cgr.a;
            if (!defpackage.afga.f(cgmVar2, cgmVar3)) {
                if (defpackage.afga.f(cgmVar, cgmVar3) && !defpackage.afga.f(cgmVar2, cgmVar3)) {
                    cgpVar.g.c(cgpVar.a, i3, true);
                }
                java.lang.String str = (ddzVar2 == null || (dfbVar2 = (defpackage.dfb) ddzVar2.g(defpackage.def.G)) == null) ? null : dfbVar2.b;
                java.lang.String str2 = (ddzVar3 == null || (dfbVar = (defpackage.dfb) ddzVar3.g(defpackage.def.G)) == null) ? null : dfbVar.b;
                if (str != str2) {
                    if (str == null) {
                        cgpVar.g.c(cgpVar.a, i3, true);
                    } else if (str2 == null) {
                        cgpVar.g.c(cgpVar.a, i3, false);
                    } else if (defpackage.afga.f(cgmVar2, defpackage.cgr.b)) {
                        cgpVar.g.b(cgpVar.a, i3, defpackage.vz.g(str2));
                    }
                }
                defpackage.det detVar = ddzVar2 != null ? (defpackage.det) ddzVar2.g(defpackage.def.M) : null;
                defpackage.det detVar2 = ddzVar3 != null ? (defpackage.det) ddzVar3.g(defpackage.def.M) : null;
                if (detVar != detVar2) {
                    if (detVar == null) {
                        cgpVar.g.c(cgpVar.a, i3, true);
                    } else if (detVar2 == null) {
                        cgpVar.g.c(cgpVar.a, i3, false);
                    } else if (defpackage.afga.f(cgmVar2, defpackage.cgr.c)) {
                        int iOrdinal = detVar2.ordinal();
                        java.lang.Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
                        if (bool != null) {
                            cgpVar.g.b(cgpVar.a, i3, a$.ExternalSyntheticApiModelOutline1.m(bool.booleanValue()));
                        }
                    }
                }
                defpackage.cgo cgoVar = ddzVar2 != null ? (defpackage.cgo) ddzVar2.g(defpackage.def.t) : null;
                defpackage.cgo cgoVar2 = ddzVar3 != null ? (defpackage.cgo) ddzVar3.g(defpackage.def.t) : null;
                if (!defpackage.afga.f(cgoVar, cgoVar2)) {
                    if (cgoVar == null) {
                        cgpVar.g.c(cgpVar.a, i3, true);
                    } else if (cgoVar2 == null) {
                        cgpVar.g.c(cgpVar.a, i3, false);
                    } else {
                        cgpVar.g.b(cgpVar.a, i3, cgoVar2.a);
                    }
                }
            } else if (!defpackage.afga.f(cgmVar, cgmVar3)) {
                cgpVar.g.c(cgpVar.a, i3, false);
            }
            boolean z = ddzVar != null && defpackage.aau.f(ddzVar.c, defpackage.def.r);
            boolean z2 = ddzVarR != null && defpackage.aau.f(ddzVarR.c, defpackage.def.r);
            if (z != z2) {
                if (z2) {
                    cgpVar.h.d(i3);
                } else {
                    cgpVar.h.e(i3);
                }
            }
        }
    }

    public mku(defpackage.cxl cxlVar, defpackage.dds ddsVar, defpackage.zo zoVar) {
        this.b = cxlVar;
        this.c = ddsVar;
        this.a = zoVar;
        this.d = new defpackage.aan(2);
    }

    public mku(defpackage.izq izqVar) {
        this.d = izqVar;
        this.b = new defpackage.exd();
        int i = defpackage.aar.a;
        new defpackage.aaq(6);
        this.a = new defpackage.aaq(6);
        this.c = new defpackage.aaq(6);
    }

    public mku(defpackage.erz erzVar, defpackage.erw erwVar, defpackage.esi esiVar) {
        this.b = erzVar;
        this.c = erwVar;
        this.a = esiVar;
        this.d = new defpackage.ebl();
    }

    public mku(defpackage.irq irqVar, defpackage.irp irpVar) {
        this.d = new java.lang.Object();
        this.b = new java.util.HashMap();
        this.c = irqVar;
        this.a = irpVar;
    }

    public mku(byte[] bArr) {
        this.a = defpackage.kry.a;
        this.c = defpackage.kry.b;
        this.d = new defpackage.kub(defpackage.kry.v);
        this.b = new defpackage.kub(defpackage.kry.w);
    }

    public mku(android.content.Context context, android.content.SharedPreferences sharedPreferences, android.content.SharedPreferences sharedPreferences2) {
        this.d = defpackage.acyc.a.fF().K().b;
        this.a = context;
        this.b = sharedPreferences;
        this.c = sharedPreferences2;
    }

    public mku(android.content.Context context) {
        final nuh eqsVar;
        defpackage.ntr ntrVar = new defpackage.ntr(context);
        context.getClass();
        defpackage.acyc acycVar = defpackage.acyc.a;
        if (acycVar.fF().aI() && android.os.Build.VERSION.SDK_INT >= 36 && context.getPackageManager().hasSystemFeature("android.hardware.telephony.satellite")) {
            eqsVar = new nuh(context);
        } else {
            eqsVar = new defpackage.eqs(java.lang.Boolean.FALSE);
        }
        defpackage.nub nubVar = (defpackage.nub) defpackage.mkp.a.i(defpackage.nub.class);
        final int i = 0;
        if (nubVar.a == null) {
            defpackage.nua nuaVar = new defpackage.nua(context.getApplicationContext(), new defpackage.ntu());
            nuaVar.m(new defpackage.nue(defpackage.nug.n, -1, false));
            nubVar.a = nuaVar;
        }
        java.lang.Object obj = nubVar.a;
        final defpackage.nuj nujVar = new defpackage.nuj(context);
        nujVar.m(null);
        this.a = ntrVar;
        this.d = eqsVar;
        this.c = defpackage.ebo.g(nujVar, new defpackage.nnp(obj, 7));
        defpackage.eqp eqpVarA = defpackage.tcu.a(ntrVar, defpackage.ebo.f(nujVar, new defpackage.nkn(13)));
        if (acycVar.fF().aI()) {
            final defpackage.eqr eqrVar = new defpackage.eqr();
            this.b = eqrVar;
            final int i2 = 1;
            final defpackage.ntr ntrVar2 = ntrVar;
            eqrVar.r(ntrVar2, new defpackage.eqt() { // from class: nud
                @Override // defpackage.eqt
                public final void ea(java.lang.Object obj2) {
                    int i3 = i2;
                    if (i3 == 0) {
                        java.lang.Boolean bool = (java.lang.Boolean) eqsVar.e();
                        android.telephony.ServiceState serviceState = (android.telephony.ServiceState) nujVar.e();
                        defpackage.mku.p(eqrVar, bool, (java.lang.Boolean) obj2, serviceState);
                        return;
                    }
                    if (i3 != 1) {
                        java.lang.Boolean bool2 = (java.lang.Boolean) eqsVar.e();
                        java.lang.Boolean bool3 = (java.lang.Boolean) nujVar.e();
                        defpackage.mku.p(eqrVar, bool2, bool3, (android.telephony.ServiceState) obj2);
                        return;
                    }
                    java.lang.Boolean bool4 = (java.lang.Boolean) eqsVar.e();
                    android.telephony.ServiceState serviceState2 = (android.telephony.ServiceState) nujVar.e();
                    defpackage.mku.p(eqrVar, (java.lang.Boolean) obj2, bool4, serviceState2);
                }
            });
            eqrVar.r(eqsVar, new defpackage.eqt() { // from class: nud
                @Override // defpackage.eqt
                public final void ea(java.lang.Object obj2) {
                    int i3 = i;
                    if (i3 == 0) {
                        java.lang.Boolean bool = (java.lang.Boolean) ntrVar2.e();
                        android.telephony.ServiceState serviceState = (android.telephony.ServiceState) nujVar.e();
                        defpackage.mku.p(eqrVar, bool, (java.lang.Boolean) obj2, serviceState);
                        return;
                    }
                    if (i3 != 1) {
                        java.lang.Boolean bool2 = (java.lang.Boolean) ntrVar2.e();
                        java.lang.Boolean bool3 = (java.lang.Boolean) nujVar.e();
                        defpackage.mku.p(eqrVar, bool2, bool3, (android.telephony.ServiceState) obj2);
                        return;
                    }
                    java.lang.Boolean bool4 = (java.lang.Boolean) ntrVar2.e();
                    android.telephony.ServiceState serviceState2 = (android.telephony.ServiceState) nujVar.e();
                    defpackage.mku.p(eqrVar, (java.lang.Boolean) obj2, bool4, serviceState2);
                }
            });
            final int i3 = 2;
            eqrVar.r(nujVar, new defpackage.eqt() { // from class: nud
                @Override // defpackage.eqt
                public final void ea(java.lang.Object obj2) {
                    int i4 = i3;
                    if (i4 == 0) {
                        java.lang.Boolean bool = (java.lang.Boolean) ntrVar2.e();
                        android.telephony.ServiceState serviceState = (android.telephony.ServiceState) eqsVar.e();
                        defpackage.mku.p(eqrVar, bool, (java.lang.Boolean) obj2, serviceState);
                        return;
                    }
                    if (i4 != 1) {
                        java.lang.Boolean bool2 = (java.lang.Boolean) ntrVar2.e();
                        java.lang.Boolean bool3 = (java.lang.Boolean) eqsVar.e();
                        defpackage.mku.p(eqrVar, bool2, bool3, (android.telephony.ServiceState) obj2);
                        return;
                    }
                    java.lang.Boolean bool4 = (java.lang.Boolean) ntrVar2.e();
                    android.telephony.ServiceState serviceState2 = (android.telephony.ServiceState) eqsVar.e();
                    defpackage.mku.p(eqrVar, (java.lang.Boolean) obj2, bool4, serviceState2);
                }
            });
            return;
        }
        this.b = defpackage.ebo.f(eqpVarA, new defpackage.err(nuf.b, nuf.c, 16));
    }

    public mku() {
        this.b = new defpackage.yha(4);
        this.a = new defpackage.yha(4);
        this.c = new defpackage.yha(4);
        this.d = new defpackage.yha(4);
    }

    public mku(defpackage.yzd yzdVar, defpackage.yyh yyhVar, defpackage.yyg yygVar, java.util.List list) {
        this.d = yzdVar;
        this.c = yyhVar;
        this.a = yygVar;
        this.b = defpackage.ygw.o(list);
    }

    public mku(aiuw aiuwVar, defpackage.affc affcVar, defpackage.affg affgVar, defpackage.affg affgVar2) {
        this.a = aiuwVar;
        this.b = affgVar2;
        this.d = defpackage.afqt.q(Integer.MAX_VALUE, 0, 6);
        this.c = new defpackage.ldx((char[]) null, (byte[]) null);
        aiwg aiwgVar = ((ajcw) aiuwVar).a.get(aiwg.d);
        if (aiwgVar != null) {
            aiwgVar.p(new defpackage.acn((java.lang.Object) affcVar, (java.lang.Object) this, (java.lang.Object) affgVar, 14, (short[]) null));
        }
    }
}
