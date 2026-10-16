package com.google.android.apps.auto.components.bugreport;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import defpackage.acnv;
import defpackage.acqa;
import defpackage.acvz;
import defpackage.duq;
import defpackage.jfz;
import defpackage.kga;
import defpackage.kgi;
import defpackage.lbk;
import defpackage.rpz;
import defpackage.rrc;
import defpackage.ycg;
import defpackage.yfl;
import defpackage.yfq;
import defpackage.yfy;
import defpackage.yls;
import defpackage.ylx;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yyi;
import defpackage.yzy;
import defpackage.yzz;
import defpackage.zeb;
import defpackage.zjc;
import defpackage.zjd;
import j$.time.Instant;
import j$.time.format.DateTimeParseException;
import j$.util.Collection;
import j$.util.DesugarDate;
import j$.util.Optional;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public final class BugreportHandlerActivity extends Activity {
    private static final yph c = yph.c("GH.BugreportHandler");
    static final yfy a = yfy.n(yyi.ALPHA, 4103443L, yyi.BETA, 4103563L, yyi.PROD, 4103445L, yyi.INTERNAL_BETA, 4102924L);
    static final BiConsumer b = new ycg(1);

    public static final void a(Context context, boolean z) {
        ((ype) c.l().ai((char) 3009)).y("%s Android Auto as a visible target for sharing bugreports.", new zjd(zjc.a, true != z ? "Disabling" : "Enabling"));
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) BugreportHandlerActivity.class), true != z ? 2 : 1, 1);
    }

    private static Date b(String str) {
        if (str != null) {
            try {
                return DesugarDate.from(kgi.a(str));
            } catch (DateTimeParseException | IllegalArgumentException e) {
                ((ype) ((ype) ((ype) c.h()).p(e)).ai((char) 2997)).y("Couldn't parse date and time from %s", str);
            }
        }
        return null;
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ype) ((ype) c.f()).ai((char) 3003)).u("onCreate()");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, java.util.List] */
    @Override // android.app.Activity
    public final void onStart() {
        int i;
        String strE;
        Optional optionalOf;
        ArrayList<String> arrayList;
        int i2;
        int i3;
        Optional optionalEmpty;
        super.onStart();
        yph yphVar = c;
        ((ype) ((ype) yphVar.f()).ai((char) 3004)).u("onStart()");
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        long longExtra = intent.getLongExtra("EXTRA_HAPPENED_TIME", -1L);
        int i4 = (longExtra > (-1L) ? 1 : (longExtra == (-1L) ? 0 : -1));
        String strC = i4 != 0 ? kgi.c(Instant.ofEpochMilli(longExtra)) : null;
        if (stringExtra == null) {
            ((ype) ((ype) yphVar.h()).ai((char) 3008)).u("Bugreport title is missing, so not handling it");
            finish();
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            ((ype) ((ype) yphVar.h()).ai((char) 3005)).u("Extra stream, which should contain the bugreport is empty, so not handling it");
            finish();
            return;
        }
        Uri uri = (Uri) parcelableArrayListExtra.get(0);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("EXTRA_CAR_DISPLAY_IDS");
        yfl yflVar = new yfl(4);
        if (stringArrayListExtra != null) {
            int size = stringArrayListExtra.size();
            int i5 = 0;
            while (i5 < size) {
                String str = stringArrayListExtra.get(i5);
                String strE2 = strC != null ? strC : kgi.e(stringExtra);
                if (strE2 == null) {
                    optionalEmpty = Optional.empty();
                    arrayList = stringArrayListExtra;
                    i2 = i4;
                    i3 = i5;
                } else {
                    arrayList = stringArrayListExtra;
                    i2 = i4;
                    File file = new File(new File(getCacheDir(), "bugreports"), kgi.g(strE2, str));
                    if (file.exists()) {
                        i3 = i5;
                        ((ype) yphVar.l().ai((char) 3002)).y("Found screenshot %s", file.getAbsolutePath());
                        optionalEmpty = Optional.of(duq.a(this, "com.google.android.apps.auto.components.bugreport.fileprovider", file));
                    } else {
                        i3 = i5;
                        ((ype) ((ype) yphVar.h()).ai((char) 3001)).y("Screenshot %s not found", file.getAbsolutePath());
                        optionalEmpty = Optional.empty();
                    }
                }
                if (optionalEmpty.isPresent()) {
                    yflVar.i(optionalEmpty.get());
                } else {
                    ((ype) ((ype) yphVar.h()).ai((char) 3007)).y("Screenshot with carDisplayId %s not found", str);
                }
                i5 = i3 + 1;
                stringArrayListExtra = arrayList;
                i4 = i2;
            }
            i = i4;
        } else {
            i = i4;
            ((ype) ((ype) yphVar.h()).ai((char) 3006)).u("No car display IDs found");
        }
        yfq yfqVarG = yflVar.g();
        if (kgi.h(this)) {
            rpz.a(this).c(rrc.h(yxy.GEARHEAD, yzz.BUGREPORT, yzy.CB).l());
            Intent data = new Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK").setComponent(new ComponentName((String) kgi.b(this).get(), "com.google.android.apps.betterbug.filebug.DeeplinkDispatchActivity")).addFlags(268435456).addFlags(1).putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_SKIP_DEEPLINK_INTERMEDIATE_SCREEN", true).putExtra("EXTRA_ADDITIONAL_COMMENT", strC).putExtra("EXTRA_ISSUE_TITLE", stringExtra).putExtra("EXTRA_DELETE_ATTACHMENTS", true).setData(uri);
            data.putExtra("EXTRA_COMPONENT_ID", 1400185L);
            ArrayList arrayList2 = new ArrayList(acnv.d().b);
            Long l = (Long) a.get(yyi.b((int) acvz.b()));
            if (l != null) {
                arrayList2.add(l);
            }
            if (!arrayList2.isEmpty()) {
                data.putExtra("EXTRA_HOTLIST_ID_LIST", zeb.m(arrayList2));
            }
            if (i != 0) {
                data.putExtra("EXTRA_HAPPENED_TIME", longExtra);
            }
            if (!yfqVarG.isEmpty()) {
                Optional optionalB = kgi.b(this);
                kga kgaVar = new kga(this, yfqVarG, 0);
                if (true == optionalB.isPresent()) {
                    Object obj = optionalB.get();
                    Object obj2 = kgaVar.a;
                    ?? r5 = kgaVar.b;
                    String str2 = (String) obj;
                    for (int i6 = 0; i6 < ((yls) r5).c; i6++) {
                        ((BugreportHandlerActivity) obj2).grantUriPermission(str2, (Uri) r5.get(i6), 3);
                    }
                }
                ClipData clipData = new ClipData(new ClipDescription("URIs", new String[]{"text/uri-list"}), new ClipData.Item((Uri) yfqVarG.get(0)));
                for (int i7 = 1; i7 < ((yls) yfqVarG).c; i7++) {
                    clipData.addItem(new ClipData.Item((Uri) yfqVarG.get(i7)));
                }
                data.setClipData(clipData);
            }
            ((ype) ((ype) yphVar.f()).ai((char) 2996)).u("Sending an Intent to BetterBug!");
            startActivity(data);
        } else {
            rpz.a(this).c(rrc.h(yxy.GEARHEAD, yzz.BUGREPORT, yzy.CC).l());
            Optional optionalFindFirst = Collection.EL.stream(yfqVarG).findFirst();
            if (strC != null) {
                strE = strC;
            } else {
                strC = kgi.e(stringExtra);
                strE = null;
            }
            if (strC == null) {
                optionalOf = Optional.empty();
            } else {
                File file2 = new File(new File(getCacheDir(), "bugreports"), kgi.f(strC));
                if (file2.exists()) {
                    ((ype) yphVar.l().ai((char) 2999)).y("Found logs %s", file2.getAbsolutePath());
                    optionalOf = Optional.of(file2);
                } else {
                    ((ype) ((ype) yphVar.h()).ai((char) 3000)).y("Logs %s not found", file2.getAbsolutePath());
                    optionalOf = Optional.empty();
                }
            }
            if (strE == null) {
                strE = kgi.e(stringExtra);
            }
            Date dateB = b(strE);
            if (dateB == null) {
                ((ype) ((ype) yphVar.h()).ai((char) 2998)).u("Using 'now' as the date since we couldn't parse it");
                dateB = DesugarDate.from(Instant.now());
            }
            lbk lbkVar = new lbk(ylx.a, dateB);
            lbkVar.e = "BUGREPORT";
            lbkVar.i(acqa.c());
            lbkVar.f = stringExtra;
            lbkVar.l = uri;
            jfz jfzVar = new jfz(lbkVar, 4);
            if (true == optionalFindFirst.isPresent()) {
                ((lbk) jfzVar.a).h = (Uri) optionalFindFirst.get();
            }
            jfz jfzVar2 = new jfz(lbkVar, 5);
            if (true == optionalOf.isPresent()) {
                ((lbk) jfzVar2.a).i = (File) optionalOf.get();
            }
            b.accept(this, lbkVar);
            lbkVar.f(this);
        }
        finish();
    }
}
