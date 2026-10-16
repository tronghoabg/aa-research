package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jza implements mbe {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("CarApp.H.Not");
    private final defpackage.yhx c;
    private final defpackage.yhx d;
    private final java.util.Set e;
    private final android.content.Context f;
    private final java.util.Map g;
    private final defpackage.kdj h;

    public jza(android.content.Context context, defpackage.epy epyVar) {
        defpackage.mqj mqjVarA;
        defpackage.yhv yhvVar = new defpackage.yhv();
        j$.util.Collection.-EL.stream(defpackage.jzf.a().b(defpackage.kit.b().e(), defpackage.nze.a())).map(new defpackage.jvi(6)).filter(new defpackage.hmj(14)).map(new defpackage.jvi(7)).forEach(new defpackage.ikd(yhvVar, 19));
        if (defpackage.ogv.k() && (mqjVarA = defpackage.ogv.d().a()) != null) {
            yhvVar.c(mqjVarA.a());
        }
        defpackage.yhx yhxVarG = yhvVar.g();
        this.c = yhxVarG;
        this.d = (defpackage.yhx) j$.util.Collection.-EL.stream(defpackage.jzg.a().b(defpackage.kit.b().e(), defpackage.nze.a())).map(new defpackage.jvi(6)).filter(new defpackage.hmj(14)).map(new defpackage.jvi(7)).collect(defpackage.yds.b);
        this.f = context;
        this.e = new java.util.HashSet();
        this.g = new java.util.HashMap();
        this.h = defpackage.kdj.a;
        epyVar.c(new defpackage.jyz(context, new defpackage.jyx(yhxVarG), epyVar));
    }

    private final boolean c(android.service.notification.StatusBarNotification statusBarNotification) {
        if (defpackage.ysr.as(this.c, new defpackage.juh(statusBarNotification, 3))) {
            return true;
        }
        return java.lang.Boolean.TRUE.equals(defpackage.ebo.n().g().e()) && statusBarNotification.getPackageName().equals("com.google.android.googlequicksearchbox");
    }

    /* JADX WARN: Code duplicated, block: B:171:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:173:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:175:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:181:0x041c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0424  */
    /* JADX WARN: Code duplicated, block: B:185:0x0485  */
    /* JADX WARN: Code duplicated, block: B:186:0x048d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0495  */
    /* JADX WARN: Code duplicated, block: B:190:0x049c  */
    /* JADX WARN: Code duplicated, block: B:193:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:194:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:198:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:201:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:233:0x0575  */
    /* JADX WARN: Code duplicated, block: B:235:0x057a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0584  */
    /* JADX WARN: Code duplicated, block: B:240:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:241:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:243:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:245:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:249:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    public final boolean a(android.service.notification.StatusBarNotification statusBarNotification, int i, boolean z) {
        android.os.Bundle bundle;
        int i2;
        java.lang.String str;
        jvf jvfVar;
        android.os.Bundle bundle2;
        java.lang.CharSequence charSequence;
        java.lang.CharSequence charSequence2;
        int i3;
        android.graphics.Bitmap bitmap;
        android.app.PendingIntent pendingIntent;
        android.app.PendingIntent pendingIntent2;
        java.util.ArrayList arrayList;
        androidx.car.app.model.CarColor carColor;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconJ;
        android.app.PendingIntent pendingIntentB;
        nwg nwgVar;
        int i4;
        android.graphics.drawable.Drawable drawableF;
        java.lang.String packageName;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconL;
        defpackage.ygw ygwVar;
        nvb nvbVar;
        nvb nvbVar2;
        nvb nvbVar3;
        nvh nvhVarB;
        nwg nwgVar2;
        long j;
        defpackage.nve nveVar;
        aiwg aiwgVar;
        java.util.Set set;
        java.lang.Integer numValueOf;
        int i5;
        nvf nvfVar;
        android.graphics.Bitmap bitmap2;
        android.graphics.drawable.Icon largeIcon;
        jvf jvfVarK;
        if (!c(statusBarNotification)) {
            return false;
        }
        defpackage.yqm yqmVar = defpackage.jyw.a;
        android.app.Notification notification = statusBarNotification.getNotification();
        notification.getClass();
        android.os.Bundle bundle3 = notification.extras;
        if ((bundle3 == null || bundle3.getBundle("androidx.car.app.EXTENSIONS") == null) && !defpackage.jyw.d(statusBarNotification)) {
            return false;
        }
        int iA = defpackage.jyw.a(statusBarNotification);
        android.os.Bundle bundle4 = statusBarNotification.getNotification().extras;
        java.lang.String str2 = "Failed to deserialize the notification color";
        if (bundle4 == null || (bundle = bundle4.getBundle("androidx.car.app.EXTENSIONS")) == null) {
            i2 = 0;
        } else {
            bundle.getCharSequence("content_title");
            bundle.getCharSequence("content_text");
            bundle.getInt("small_res_id");
            if (bundle.getParcelableArrayList("actions") == null) {
                new java.util.ArrayList();
            }
            int i6 = bundle.getInt("importance", -1000);
            android.os.Bundle bundle5 = bundle.getBundle("color");
            if (bundle5 != null) {
                try {
                } catch (xy e) {
                    android.util.Log.e("CarAppExtender", "Failed to deserialize the notification color", e);
                }
            }
            bundle.getString("channel_id");
            i2 = i6;
        }
        if (i2 == -1000) {
            i2 = i;
        }
        int i7 = (i2 >= 4 && "navigation".equals(statusBarNotification.getNotification().category) && statusBarNotification.isOngoing() && defpackage.jyp.a().a) ? 3 : i2;
        android.content.Context context = this.f;
        java.lang.String packageName2 = statusBarNotification.getPackageName();
        int i8 = i7;
        java.util.Map map = this.g;
        jvf jvfVar2 = (jvf) map.get(packageName2);
        if (jvfVar2 == null) {
            android.content.ComponentName componentName = null;
            for (android.content.ComponentName componentName2 : this.d) {
                java.lang.String str3 = str2;
                if (true == packageName2.equals(componentName2.getPackageName())) {
                    componentName = componentName2;
                }
                str2 = str3;
            }
            str = str2;
            if (componentName == null) {
                ((defpackage.yqj) ((defpackage.yqj) b.h()).ai((char) 2857)).y("%s is not registered as a car navigation app, using default notification color", packageName2);
                jvfVarK = jvf.a(context);
            } else {
                jvfVarK = gcg.k(context, componentName);
            }
            map.put(packageName2, jvfVarK);
            jvfVar = jvfVarK;
        } else {
            str = "Failed to deserialize the notification color";
            jvfVar = jvfVar2;
        }
        android.app.Notification notification2 = statusBarNotification.getNotification();
        defpackage.nve nveVarC = defpackage.jyw.c(notification2);
        android.os.Bundle bundle6 = statusBarNotification.getNotification().extras;
        if (bundle6 == null || (bundle2 = bundle6.getBundle("androidx.car.app.EXTENSIONS")) == null) {
            carColor = null;
            charSequence2 = null;
            charSequence = null;
            i3 = 0;
            bitmap = null;
            pendingIntent2 = null;
            pendingIntent = null;
            arrayList = null;
        } else {
            charSequence = bundle2.getCharSequence("content_title");
            charSequence2 = bundle2.getCharSequence("content_text");
            i3 = bundle2.getInt("small_res_id");
            bitmap = (android.graphics.Bitmap) bundle2.getParcelable("large_bitmap");
            pendingIntent = (android.app.PendingIntent) bundle2.getParcelable("content_intent");
            pendingIntent2 = (android.app.PendingIntent) bundle2.getParcelable("delete_intent");
            java.util.ArrayList parcelableArrayList = bundle2.getParcelableArrayList("actions");
            if (parcelableArrayList == null) {
                parcelableArrayList = new java.util.ArrayList();
            }
            arrayList = parcelableArrayList;
            bundle2.getInt("importance", -1000);
            android.os.Bundle bundle7 = bundle2.getBundle("color");
            if (bundle7 != null) {
                try {
                    carColor = (androidx.car.app.model.CarColor) xx.b(bundle7);
                } catch (xy e2) {
                    android.util.Log.e("CarAppExtender", str, e2);
                    carColor = null;
                }
            } else {
                carColor = null;
            }
            bundle2.getString("channel_id");
        }
        if (charSequence == null) {
            charSequence = notification2.extras.getCharSequence("android.title");
        }
        if (charSequence2 == null) {
            charSequence2 = notification2.extras.getCharSequence("android.text");
        }
        if (i3 == 0 || android.text.TextUtils.isEmpty(statusBarNotification.getPackageName())) {
            android.graphics.drawable.Icon smallIcon = statusBarNotification.getNotification().getSmallIcon();
            if (smallIcon != null) {
                ghIconJ = com.google.android.apps.auto.components.graphics.icon.GhIcon.k(smallIcon);
            } else {
                int i9 = statusBarNotification.getNotification().extras.getInt("android.icon");
                ghIconJ = (i9 == 0 || android.text.TextUtils.isEmpty(statusBarNotification.getPackageName())) ? com.google.android.apps.auto.components.graphics.icon.GhIcon.j(new android.content.ComponentName(defpackage.ysr.bv(statusBarNotification.getPackageName()), "")) : com.google.android.apps.auto.components.graphics.icon.GhIcon.r(statusBarNotification.getPackageName(), i9);
            }
        } else {
            ghIconJ = com.google.android.apps.auto.components.graphics.icon.GhIcon.r(statusBarNotification.getPackageName(), i3);
        }
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIconL2 = bitmap != null ? com.google.android.apps.auto.components.graphics.icon.GhIcon.l(bitmap) : null;
        if (ghIconL2 == null && (largeIcon = statusBarNotification.getNotification().getLargeIcon()) != null) {
            ghIconL2 = com.google.android.apps.auto.components.graphics.icon.GhIcon.k(largeIcon);
        }
        if (ghIconL2 == null && (bitmap2 = statusBarNotification.getNotification().largeIcon) != null) {
            ghIconL2 = com.google.android.apps.auto.components.graphics.icon.GhIcon.l(bitmap2);
        }
        if (pendingIntent == null) {
            pendingIntent = statusBarNotification.getNotification().contentIntent;
        }
        if (pendingIntent == null) {
            android.content.Intent intentPutExtra = new android.content.Intent("androidx.car.app.action.CarAppNotificationAction").putExtra("TemplateAppPackageName", statusBarNotification.getPackageName()).putExtra("TemplateAppActionType", 2);
            if (defpackage.acpd.Z()) {
                intentPutExtra.setPackage(context.getPackageName());
            }
            int i10 = juq.a;
            juq.a = i10 + 1;
            pendingIntentB = android.app.PendingIntent.getBroadcast(context, i10, intentPutExtra, 67108864);
        } else {
            pendingIntentB = juq.b(context, statusBarNotification.getPackageName(), pendingIntent);
        }
        java.lang.String packageName3 = statusBarNotification.getPackageName();
        if (pendingIntent2 == null) {
            pendingIntent2 = notification2.deleteIntent;
        }
        android.app.PendingIntent pendingIntentB2 = pendingIntent2 == null ? null : juq.b(context, packageName3, pendingIntent2);
        nvf nvfVarA = nvh.a(i8);
        boolean z2 = (statusBarNotification.getNotification().flags & 8) == 8;
        nvc nvcVar = new nvc();
        nvcVar.f = statusBarNotification.getPackageName();
        nvcVar.g = statusBarNotification.getKey();
        nvcVar.b = ghIconJ;
        nvcVar.d = ghIconL2;
        nvcVar.c = pendingIntentB;
        nvcVar.c(pendingIntentB2);
        nvcVar.a = nvfVarA;
        nvcVar.w = defpackage.lxy.l().a(statusBarNotification);
        nvcVar.k = z2;
        nvcVar.i = notification2.when;
        nvcVar.j = false;
        nvcVar.l = statusBarNotification.isOngoing();
        nvcVar.x = nveVarC;
        if (charSequence != null) {
            nvcVar.m = charSequence.toString();
        }
        if (charSequence2 != null) {
            nvcVar.n = charSequence2.toString();
        }
        if (!"navigation".equals(statusBarNotification.getNotification().category) || !statusBarNotification.isOngoing()) {
            if (defpackage.jyw.d(statusBarNotification)) {
                android.app.Notification notification3 = statusBarNotification.getNotification();
                defpackage.yqm yqmVar2 = nwg.a;
                notification3.getClass();
                android.os.Bundle bundle8 = notification3.extras;
                android.app.Person personM = hh$.ExternalSyntheticApiModelOutline0.m(ag$.ExternalSyntheticApiModelOutline0.m(bundle8, "android.callPerson", jx$.ExternalSyntheticApiModelOutline3.m()));
                if (personM != null) {
                    dur durVarE = dtb.e(personM);
                    android.app.PendingIntent pendingIntent3 = (android.app.PendingIntent) ag$.ExternalSyntheticApiModelOutline0.m(bundle8, "android.answerIntent", android.app.PendingIntent.class);
                    android.app.PendingIntent pendingIntent4 = (android.app.PendingIntent) ag$.ExternalSyntheticApiModelOutline0.m(bundle8, "android.declineIntent", android.app.PendingIntent.class);
                    android.app.PendingIntent pendingIntent5 = (android.app.PendingIntent) ag$.ExternalSyntheticApiModelOutline0.m(bundle8, "android.hangUpIntent", android.app.PendingIntent.class);
                    java.lang.Integer numJ = defpackage.mcl.J(notification3);
                    if (numJ != null && numJ.intValue() == 1) {
                        if (pendingIntent4 == null) {
                            defpackage.mcl.K("Incoming call notification does not have a decline intent, dropping");
                        } else if (pendingIntent3 == null) {
                            defpackage.mcl.K("Incoming call notification does not have an answer intent, dropping");
                        } else {
                            nwgVar2 = new nwg(1, durVarE, pendingIntent3, pendingIntent4, (android.app.PendingIntent) null);
                            nwgVar = nwgVar2;
                        }
                    } else if (numJ != null && numJ.intValue() == 2) {
                        if (pendingIntent5 == null) {
                            defpackage.mcl.K("Ongoing call notification does not have a hangup intent, dropping");
                        } else {
                            nwgVar2 = new nwg(2, durVarE, (android.app.PendingIntent) null, (android.app.PendingIntent) null, pendingIntent5);
                            nwgVar = nwgVar2;
                        }
                    } else if (numJ == null || numJ.intValue() != 3) {
                        defpackage.mcl.K("Unknown CallStyle type ".concat(java.lang.String.valueOf(defpackage.mcl.J(notification3))));
                    } else if (pendingIntent5 == null) {
                        defpackage.mcl.K("Screening call notification does not have a hangup intent, dropping");
                    } else if (pendingIntent3 == null) {
                        defpackage.mcl.K("Screening call notification does not have an answer intent, dropping");
                    } else {
                        nwgVar2 = new nwg(3, durVarE, pendingIntent3, (android.app.PendingIntent) null, pendingIntent5);
                        nwgVar = nwgVar2;
                    }
                    if (nwgVar == null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.jyw.a.h()).ai((char) 2845)).y("%s has a malformed CallStyle notification, dropping", statusBarNotification.getPackageName());
                    } else {
                        i4 = nwgVar.b;
                        if (i4 == 2) {
                            if (nvfVarA == nvf.a) {
                                i4 = 2;
                            }
                            if (nvhVarB == null) {
                                return false;
                            }
                            j = iA;
                            if (!z) {
                                i5 = nvhVarB.a.f;
                                nvfVar = nvf.c;
                                if (i5 > nvfVar.f) {
                                    ((defpackage.yqj) ((defpackage.yqj) b.e()).ai(2856)).y("Capping priority of pre-existing template notification %s at DEFAULT to suppress HUN", nvhVarB.g);
                                    nvc nvcVarA = nvc.a(nvhVarB);
                                    nvcVarA.a = nvfVar;
                                    nvhVarB = nvcVarA.b();
                                }
                            }
                            nveVar = nvhVarB.x;
                            if (nveVar == defpackage.nve.e) {
                                defpackage.nuz.b().g("APPHOST", j, statusBarNotification.getPackageName());
                            } else if (nveVar == defpackage.nve.d) {
                                thi thiVar = thi.a;
                                defpackage.tgf tgfVar = defpackage.tgf.GEARHEAD_CAL_EXTERNAL_DIALER_CALL_TO_NOTIFICATION_FLOW;
                                aiwgVar = (aiwg) thi.b.remove(tgfVar);
                                if (aiwgVar != null) {
                                    aiwgVar.s((java.util.concurrent.CancellationException) null);
                                }
                                defpackage.tgg.a.d(tgfVar, 1);
                            }
                            defpackage.nuz.b().j("APPHOST", j, nvhVarB);
                            set = this.e;
                            numValueOf = java.lang.Integer.valueOf(iA);
                            if (!set.contains(numValueOf)) {
                                defpackage.oim oimVarU = defpackage.omf.u();
                                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_APP_LIBRARY, defpackage.zbd.sD);
                                rrvVarH.f(statusBarNotification.getPackageName());
                                oimVarU.F(rrvVarH.l());
                            }
                            set.add(numValueOf);
                            return true;
                        }
                        nvcVar.F = nwgVar;
                        nvcVar.j = statusBarNotification.getNotification().extras.getBoolean("android.showChronometer", false);
                        drawableF = ghIconJ.f(context, -1);
                        packageName = statusBarNotification.getPackageName();
                        if (drawableF == null) {
                            ghIconL = new com.google.android.apps.auto.components.graphics.icon.GhIcon(8);
                        } else {
                            int iA2 = new mot(context, new android.content.ComponentName(packageName, "")).a(android.R.attr.colorPrimary);
                            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(64, 64, android.graphics.Bitmap.Config.ARGB_8888);
                            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                            android.graphics.Paint paint = new android.graphics.Paint(1);
                            paint.setColor(iA2);
                            canvas.drawCircle(32.0f, 32.0f, 32.0f, paint);
                            drawableF.setBounds(10, 10, 54, 54);
                            drawableF.setFilterBitmap(true);
                            drawableF.draw(canvas);
                            ghIconL = com.google.android.apps.auto.components.graphics.icon.GhIcon.l(bitmapCreateBitmap);
                        }
                        nvcVar.b = ghIconL;
                        j$.util.stream.Stream map2 = j$.util.Collection.-EL.stream(defpackage.tq.a(arrayList)).map(new defpackage.jxj(context, statusBarNotification, 3));
                        int i11 = defpackage.ygw.d;
                        ygwVar = (defpackage.ygw) map2.collect(defpackage.yds.a);
                        if (ygwVar.isEmpty()) {
                            nvbVar = null;
                        } else {
                            nvbVar = (nvb) ygwVar.get(0);
                        }
                        if (ygwVar.size() > 1) {
                            nvbVar2 = (nvb) ygwVar.get(1);
                        } else {
                            nvbVar2 = null;
                        }
                        if (ygwVar.size() > 2) {
                            nvbVar3 = (nvb) ygwVar.get(2);
                        } else {
                            nvbVar3 = null;
                        }
                        nvcVar.p = nvbVar;
                        nvcVar.q = nvbVar2;
                        nvcVar.r = nvbVar3;
                        if (i4 != 2) {
                            nvcVar.a = nvf.d;
                            nvcVar.x = defpackage.nve.d;
                        } else {
                            nvcVar.a = nvfVarA;
                            nvcVar.x = defpackage.nve.e;
                        }
                        nvcVar.c = com.google.android.apps.auto.components.system.GhPendingIntentReceiver.c(new android.content.Intent().setComponent(defpackage.mkt.b), context);
                        if (defpackage.lee.a().c(defpackage.kit.b().e())) {
                            nvcVar.D = statusBarNotification.getNotification().extras;
                        }
                    }
                    nvhVarB = null;
                    if (nvhVarB == null) {
                        return false;
                    }
                    j = iA;
                    if (!z) {
                        i5 = nvhVarB.a.f;
                        nvfVar = nvf.c;
                        if (i5 > nvfVar.f) {
                            ((defpackage.yqj) ((defpackage.yqj) b.e()).ai(2856)).y("Capping priority of pre-existing template notification %s at DEFAULT to suppress HUN", nvhVarB.g);
                            nvc nvcVarA2 = nvc.a(nvhVarB);
                            nvcVarA2.a = nvfVar;
                            nvhVarB = nvcVarA2.b();
                        }
                    }
                    nveVar = nvhVarB.x;
                    if (nveVar == defpackage.nve.e) {
                        defpackage.nuz.b().g("APPHOST", j, statusBarNotification.getPackageName());
                    } else if (nveVar == defpackage.nve.d) {
                        thi thiVar2 = thi.a;
                        defpackage.tgf tgfVar2 = defpackage.tgf.GEARHEAD_CAL_EXTERNAL_DIALER_CALL_TO_NOTIFICATION_FLOW;
                        aiwgVar = (aiwg) thi.b.remove(tgfVar2);
                        if (aiwgVar != null) {
                            aiwgVar.s((java.util.concurrent.CancellationException) null);
                        }
                        defpackage.tgg.a.d(tgfVar2, 1);
                    }
                    defpackage.nuz.b().j("APPHOST", j, nvhVarB);
                    set = this.e;
                    numValueOf = java.lang.Integer.valueOf(iA);
                    if (!set.contains(numValueOf)) {
                        defpackage.oim oimVarU2 = defpackage.omf.u();
                        defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_APP_LIBRARY, defpackage.zbd.sD);
                        rrvVarH2.f(statusBarNotification.getPackageName());
                        oimVarU2.F(rrvVarH2.l());
                    }
                    set.add(numValueOf);
                    return true;
                }
                defpackage.mcl.K("CallStyle notification does not have a person, dropping");
                nwgVar = null;
                if (nwgVar == null) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.jyw.a.h()).ai((char) 2845)).y("%s has a malformed CallStyle notification, dropping", statusBarNotification.getPackageName());
                } else {
                    i4 = nwgVar.b;
                    if (i4 == 2) {
                        if (nvfVarA == nvf.a) {
                            i4 = 2;
                        }
                        if (nvhVarB == null) {
                            return false;
                        }
                        j = iA;
                        if (!z) {
                            i5 = nvhVarB.a.f;
                            nvfVar = nvf.c;
                            if (i5 > nvfVar.f) {
                                ((defpackage.yqj) ((defpackage.yqj) b.e()).ai(2856)).y("Capping priority of pre-existing template notification %s at DEFAULT to suppress HUN", nvhVarB.g);
                                nvc nvcVarA3 = nvc.a(nvhVarB);
                                nvcVarA3.a = nvfVar;
                                nvhVarB = nvcVarA3.b();
                            }
                        }
                        nveVar = nvhVarB.x;
                        if (nveVar == defpackage.nve.e) {
                            defpackage.nuz.b().g("APPHOST", j, statusBarNotification.getPackageName());
                        } else if (nveVar == defpackage.nve.d) {
                            thi thiVar3 = thi.a;
                            defpackage.tgf tgfVar3 = defpackage.tgf.GEARHEAD_CAL_EXTERNAL_DIALER_CALL_TO_NOTIFICATION_FLOW;
                            aiwgVar = (aiwg) thi.b.remove(tgfVar3);
                            if (aiwgVar != null) {
                                aiwgVar.s((java.util.concurrent.CancellationException) null);
                            }
                            defpackage.tgg.a.d(tgfVar3, 1);
                        }
                        defpackage.nuz.b().j("APPHOST", j, nvhVarB);
                        set = this.e;
                        numValueOf = java.lang.Integer.valueOf(iA);
                        if (!set.contains(numValueOf)) {
                            defpackage.oim oimVarU3 = defpackage.omf.u();
                            defpackage.rrv rrvVarH3 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_APP_LIBRARY, defpackage.zbd.sD);
                            rrvVarH3.f(statusBarNotification.getPackageName());
                            oimVarU3.F(rrvVarH3.l());
                        }
                        set.add(numValueOf);
                        return true;
                    }
                    nvcVar.F = nwgVar;
                    nvcVar.j = statusBarNotification.getNotification().extras.getBoolean("android.showChronometer", false);
                    drawableF = ghIconJ.f(context, -1);
                    packageName = statusBarNotification.getPackageName();
                    if (drawableF == null) {
                        ghIconL = new com.google.android.apps.auto.components.graphics.icon.GhIcon(8);
                    } else {
                        int iA3 = new mot(context, new android.content.ComponentName(packageName, "")).a(android.R.attr.colorPrimary);
                        android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(64, 64, android.graphics.Bitmap.Config.ARGB_8888);
                        android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap2);
                        android.graphics.Paint paint2 = new android.graphics.Paint(1);
                        paint2.setColor(iA3);
                        canvas2.drawCircle(32.0f, 32.0f, 32.0f, paint2);
                        drawableF.setBounds(10, 10, 54, 54);
                        drawableF.setFilterBitmap(true);
                        drawableF.draw(canvas2);
                        ghIconL = com.google.android.apps.auto.components.graphics.icon.GhIcon.l(bitmapCreateBitmap2);
                    }
                    nvcVar.b = ghIconL;
                    j$.util.stream.Stream map3 = j$.util.Collection.-EL.stream(defpackage.tq.a(arrayList)).map(new defpackage.jxj(context, statusBarNotification, 3));
                    int i12 = defpackage.ygw.d;
                    ygwVar = (defpackage.ygw) map3.collect(defpackage.yds.a);
                    if (ygwVar.isEmpty()) {
                        nvbVar = (nvb) ygwVar.get(0);
                    } else {
                        nvbVar = null;
                    }
                    if (ygwVar.size() > 1) {
                        nvbVar2 = (nvb) ygwVar.get(1);
                    } else {
                        nvbVar2 = null;
                    }
                    if (ygwVar.size() > 2) {
                        nvbVar3 = (nvb) ygwVar.get(2);
                    } else {
                        nvbVar3 = null;
                    }
                    nvcVar.p = nvbVar;
                    nvcVar.q = nvbVar2;
                    nvcVar.r = nvbVar3;
                    if (i4 != 2) {
                        nvcVar.a = nvf.d;
                        nvcVar.x = defpackage.nve.d;
                    } else {
                        nvcVar.a = nvfVarA;
                        nvcVar.x = defpackage.nve.e;
                    }
                    nvcVar.c = com.google.android.apps.auto.components.system.GhPendingIntentReceiver.c(new android.content.Intent().setComponent(defpackage.mkt.b), context);
                    if (defpackage.lee.a().c(defpackage.kit.b().e())) {
                        nvcVar.D = statusBarNotification.getNotification().extras;
                    }
                }
                nvhVarB = null;
                if (nvhVarB == null) {
                    return false;
                }
                j = iA;
                if (!z) {
                    i5 = nvhVarB.a.f;
                    nvfVar = nvf.c;
                    if (i5 > nvfVar.f) {
                        ((defpackage.yqj) ((defpackage.yqj) b.e()).ai(2856)).y("Capping priority of pre-existing template notification %s at DEFAULT to suppress HUN", nvhVarB.g);
                        nvc nvcVarA4 = nvc.a(nvhVarB);
                        nvcVarA4.a = nvfVar;
                        nvhVarB = nvcVarA4.b();
                    }
                }
                nveVar = nvhVarB.x;
                if (nveVar == defpackage.nve.e) {
                    defpackage.nuz.b().g("APPHOST", j, statusBarNotification.getPackageName());
                } else if (nveVar == defpackage.nve.d) {
                    thi thiVar4 = thi.a;
                    defpackage.tgf tgfVar4 = defpackage.tgf.GEARHEAD_CAL_EXTERNAL_DIALER_CALL_TO_NOTIFICATION_FLOW;
                    aiwgVar = (aiwg) thi.b.remove(tgfVar4);
                    if (aiwgVar != null) {
                        aiwgVar.s((java.util.concurrent.CancellationException) null);
                    }
                    defpackage.tgg.a.d(tgfVar4, 1);
                }
                defpackage.nuz.b().j("APPHOST", j, nvhVarB);
                set = this.e;
                numValueOf = java.lang.Integer.valueOf(iA);
                if (!set.contains(numValueOf)) {
                    defpackage.oim oimVarU4 = defpackage.omf.u();
                    defpackage.rrv rrvVarH4 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_APP_LIBRARY, defpackage.zbd.sD);
                    rrvVarH4.f(statusBarNotification.getPackageName());
                    oimVarU4.F(rrvVarH4.l());
                }
                set.add(numValueOf);
                return true;
            }
            java.util.List listA = defpackage.tq.a(arrayList);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (listA == null || listA.isEmpty()) {
                android.app.Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
                if (actionArr != null && actionArr.length > 0) {
                    for (android.app.Notification.Action action : statusBarNotification.getNotification().actions) {
                        arrayList2.add(defpackage.jyw.b(context, statusBarNotification.getPackageName(), action));
                    }
                }
            } else {
                java.util.Iterator it = listA.iterator();
                while (it.hasNext()) {
                    arrayList2.add(defpackage.jyw.b(context, statusBarNotification.getPackageName(), (android.app.Notification.Action) it.next()));
                }
            }
            int size = arrayList2.size();
            nvb nvbVar4 = size > 0 ? (nvb) arrayList2.get(0) : null;
            nvb nvbVar5 = size > 1 ? (nvb) arrayList2.get(1) : null;
            nvb nvbVar6 = size > 2 ? (nvb) arrayList2.get(2) : null;
            nvcVar.p = nvbVar4;
            nvcVar.q = nvbVar5;
            nvcVar.r = nvbVar6;
        } else if (carColor != null) {
            nvcVar.h = gcg.l(context, defpackage.omf.r(context), carColor, jvfVar, 0, 0);
        } else if (notification2.extras.getBoolean("android.colorized")) {
            nvcVar.h = notification2.color;
        }
        nvhVarB = nvcVar.b();
        if (nvhVarB == null) {
            return false;
        }
        j = iA;
        if (!z) {
            i5 = nvhVarB.a.f;
            nvfVar = nvf.c;
            if (i5 > nvfVar.f) {
                ((defpackage.yqj) ((defpackage.yqj) b.e()).ai(2856)).y("Capping priority of pre-existing template notification %s at DEFAULT to suppress HUN", nvhVarB.g);
                nvc nvcVarA5 = nvc.a(nvhVarB);
                nvcVarA5.a = nvfVar;
                nvhVarB = nvcVarA5.b();
            }
        }
        nveVar = nvhVarB.x;
        if (nveVar == defpackage.nve.e) {
            defpackage.nuz.b().g("APPHOST", j, statusBarNotification.getPackageName());
        } else if (nveVar == defpackage.nve.d) {
            thi thiVar5 = thi.a;
            defpackage.tgf tgfVar5 = defpackage.tgf.GEARHEAD_CAL_EXTERNAL_DIALER_CALL_TO_NOTIFICATION_FLOW;
            aiwgVar = (aiwg) thi.b.remove(tgfVar5);
            if (aiwgVar != null) {
                aiwgVar.s((java.util.concurrent.CancellationException) null);
            }
            defpackage.tgg.a.d(tgfVar5, 1);
        }
        defpackage.nuz.b().j("APPHOST", j, nvhVarB);
        set = this.e;
        numValueOf = java.lang.Integer.valueOf(iA);
        if (!set.contains(numValueOf)) {
            defpackage.oim oimVarU5 = defpackage.omf.u();
            defpackage.rrv rrvVarH5 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_APP_LIBRARY, defpackage.zbd.sD);
            rrvVarH5.f(statusBarNotification.getPackageName());
            oimVarU5.F(rrvVarH5.l());
        }
        set.add(numValueOf);
        return true;
    }

    public final boolean b(android.service.notification.StatusBarNotification statusBarNotification) {
        if (!c(statusBarNotification)) {
            return false;
        }
        int iA = defpackage.jyw.a(statusBarNotification);
        defpackage.nuz.b().g("APPHOST", iA, statusBarNotification.getPackageName());
        this.e.remove(java.lang.Integer.valueOf(iA));
        defpackage.oim oimVarU = defpackage.omf.u();
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.CAR_APP_LIBRARY, defpackage.zbd.sE);
        rrvVarH.f(statusBarNotification.getPackageName());
        oimVarU.F(rrvVarH.l());
        return true;
    }
}
