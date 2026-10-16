package com.google.android.apps.auto.components.bugreport;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class BugreportHandlerActivity extends android.app.Activity {
    private static final defpackage.yqm c = defpackage.yqm.c("GH.BugreportHandler");
    static final defpackage.yhe a = defpackage.yhe.n(defpackage.yzn.ALPHA, 4103443L, defpackage.yzn.BETA, 4103563L, defpackage.yzn.PROD, 4103445L, defpackage.yzn.INTERNAL_BETA, 4102924L);
    static final java.util.function.BiConsumer b = new defpackage.ydn(1);

    public static final void a(android.content.Context context, boolean z) {
        ((defpackage.yqj) c.l().ai((char) 3012)).y("%s Android Auto as a visible target for sharing bugreports.", new defpackage.zkf(defpackage.zke.a, true != z ? "Disabling" : "Enabling"));
        context.getPackageManager().setComponentEnabledSetting(new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.apps.auto.components.bugreport.BugreportHandlerActivity.class), true != z ? 2 : 1, 1);
    }

    private static java.util.Date b(java.lang.String str) {
        if (str != null) {
            try {
                return j$.util.DesugarDate.from(defpackage.kgl.a(str));
            } catch (java.lang.IllegalArgumentException | j$.time.format.DateTimeParseException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).ai((char) 3000)).y("Couldn't parse date and time from %s", str);
            }
        }
        return null;
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 3006)).u("onCreate()");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v35, types: [java.lang.Object, java.util.List] */
    @Override // android.app.Activity
    public final void onStart() {
        int i;
        java.lang.String strE;
        j$.util.Optional optionalOf;
        java.util.ArrayList<java.lang.String> arrayList;
        int i2;
        j$.util.Optional optionalEmpty;
        super.onStart();
        defpackage.yqm yqmVar = c;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 3007)).u("onStart()");
        android.content.Intent intent = getIntent();
        java.lang.String stringExtra = intent.getStringExtra("android.intent.extra.SUBJECT");
        long longExtra = intent.getLongExtra("EXTRA_HAPPENED_TIME", -1L);
        int i3 = (longExtra > (-1L) ? 1 : (longExtra == (-1L) ? 0 : -1));
        java.lang.String strC = i3 != 0 ? defpackage.kgl.c(j$.time.Instant.ofEpochMilli(longExtra)) : null;
        if (stringExtra == null) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3011)).u("Bugreport title is missing, so not handling it");
            finish();
            return;
        }
        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3008)).u("Extra stream, which should contain the bugreport is empty, so not handling it");
            finish();
            return;
        }
        android.net.Uri uri = (android.net.Uri) parcelableArrayListExtra.get(0);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("EXTRA_CAR_DISPLAY_IDS");
        defpackage.ygr ygrVar = new defpackage.ygr(4);
        if (stringArrayListExtra != null) {
            int i4 = 0;
            for (int size = stringArrayListExtra.size(); i4 < size; size = size) {
                java.lang.String str = stringArrayListExtra.get(i4);
                java.lang.String strE2 = strC != null ? strC : defpackage.kgl.e(stringExtra);
                if (strE2 == null) {
                    optionalEmpty = j$.util.Optional.empty();
                    arrayList = stringArrayListExtra;
                    i2 = i3;
                } else {
                    arrayList = stringArrayListExtra;
                    i2 = i3;
                    java.io.File file = new java.io.File(new java.io.File(getCacheDir(), "bugreports"), defpackage.kgl.g(strE2, str));
                    if (file.exists()) {
                        ((defpackage.yqj) yqmVar.l().ai((char) 3005)).y("Found screenshot %s", file.getAbsolutePath());
                        optionalEmpty = j$.util.Optional.of(defpackage.dux.a(this, "com.google.android.apps.auto.components.bugreport.fileprovider", file));
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3004)).y("Screenshot %s not found", file.getAbsolutePath());
                        optionalEmpty = j$.util.Optional.empty();
                    }
                }
                if (optionalEmpty.isPresent()) {
                    ygrVar.i(optionalEmpty.get());
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3010)).y("Screenshot with carDisplayId %s not found", str);
                }
                i4++;
                stringArrayListExtra = arrayList;
                i3 = i2;
            }
            i = i3;
        } else {
            i = i3;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3009)).u("No car display IDs found");
        }
        defpackage.ygw ygwVarG = ygrVar.g();
        if (defpackage.kgl.h(this)) {
            defpackage.rqt.a(this).c(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.BUGREPORT, defpackage.zbd.CF).l());
            android.content.Intent data = new android.content.Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK").setComponent(new android.content.ComponentName((java.lang.String) defpackage.kgl.b(this).get(), "com.google.android.apps.betterbug.filebug.DeeplinkDispatchActivity")).addFlags(268435456).addFlags(1).putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_SKIP_DEEPLINK_INTERMEDIATE_SCREEN", true).putExtra("EXTRA_ADDITIONAL_COMMENT", strC).putExtra("EXTRA_ISSUE_TITLE", stringExtra).putExtra("EXTRA_DELETE_ATTACHMENTS", true).setData(uri);
            data.putExtra("EXTRA_COMPONENT_ID", 1400185L);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.acox.d().b);
            java.lang.Long l = (java.lang.Long) a.get(defpackage.yzn.b((int) defpackage.acxb.b()));
            if (l != null) {
                arrayList2.add(l);
            }
            if (!arrayList2.isEmpty()) {
                data.putExtra("EXTRA_HOTLIST_ID_LIST", defpackage.zfh.m(arrayList2));
            }
            if (i != 0) {
                data.putExtra("EXTRA_HAPPENED_TIME", longExtra);
            }
            if (!ygwVarG.isEmpty()) {
                j$.util.Optional optionalB = defpackage.kgl.b(this);
                kgd kgdVar = new kgd(this, ygwVarG, 0);
                if (true == optionalB.isPresent()) {
                    java.lang.Object obj = optionalB.get();
                    java.lang.Object obj2 = kgdVar.a;
                    ?? r5 = kgdVar.b;
                    java.lang.String str2 = (java.lang.String) obj;
                    for (int i5 = 0; i5 < ((defpackage.ymx) r5).c; i5++) {
                        ((com.google.android.apps.auto.components.bugreport.BugreportHandlerActivity) obj2).grantUriPermission(str2, (android.net.Uri) r5.get(i5), 3);
                    }
                }
                android.content.ClipData clipData = new android.content.ClipData(new android.content.ClipDescription("URIs", new java.lang.String[]{"text/uri-list"}), new android.content.ClipData.Item((android.net.Uri) ygwVarG.get(0)));
                for (int i6 = 1; i6 < ((defpackage.ymx) ygwVarG).c; i6++) {
                    clipData.addItem(new android.content.ClipData.Item((android.net.Uri) ygwVarG.get(i6)));
                }
                data.setClipData(clipData);
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 2999)).u("Sending an Intent to BetterBug!");
            startActivity(data);
        } else {
            defpackage.rqt.a(this).c(defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.BUGREPORT, defpackage.zbd.CG).l());
            j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(ygwVarG).findFirst();
            if (strC != null) {
                strE = strC;
            } else {
                strC = defpackage.kgl.e(stringExtra);
                strE = null;
            }
            if (strC == null) {
                optionalOf = j$.util.Optional.empty();
            } else {
                java.io.File file2 = new java.io.File(new java.io.File(getCacheDir(), "bugreports"), defpackage.kgl.f(strC));
                if (file2.exists()) {
                    ((defpackage.yqj) yqmVar.l().ai((char) 3002)).y("Found logs %s", file2.getAbsolutePath());
                    optionalOf = j$.util.Optional.of(file2);
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3003)).y("Logs %s not found", file2.getAbsolutePath());
                    optionalOf = j$.util.Optional.empty();
                }
            }
            if (strE == null) {
                strE = defpackage.kgl.e(stringExtra);
            }
            java.util.Date dateB = b(strE);
            if (dateB == null) {
                ((defpackage.yqj) ((defpackage.yqj) yqmVar.h()).ai((char) 3001)).u("Using 'now' as the date since we couldn't parse it");
                dateB = j$.util.DesugarDate.from(j$.time.Instant.now());
            }
            lbp lbpVar = new lbp(defpackage.ync.a, dateB);
            lbpVar.e = "BUGREPORT";
            lbpVar.i(defpackage.acrc.c());
            lbpVar.f = stringExtra;
            lbpVar.l = uri;
            jgh jghVar = new jgh(lbpVar, 5);
            if (true == optionalFindFirst.isPresent()) {
                ((lbp) jghVar.a).h = (android.net.Uri) optionalFindFirst.get();
            }
            jgh jghVar2 = new jgh(lbpVar, 6);
            if (true == optionalOf.isPresent()) {
                ((lbp) jghVar2.a).i = (java.io.File) optionalOf.get();
            }
            a$.ExternalSyntheticApiModelOutline2.m(b, this, lbpVar);
            lbpVar.f(this);
        }
        finish();
    }
}
