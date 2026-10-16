package com.google.android.apps.auto.components.troubleshooter.contentprovider;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class TroubleshooterContentProvider extends android.content.ContentProvider {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.TROUBLESHOOTER");
    private java.util.Map b;
    private j$.util.Optional c = j$.util.Optional.empty();

    private final j$.util.Optional c(int i) {
        yyt yytVarB = yyt.b(i);
        if (yytVarB != null) {
            return j$.util.Optional.ofNullable((okc) a().get(yytVarB));
        }
        ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 6004)).w("Unable to obtain a DetectorType for number %d", i);
        return j$.util.Optional.empty();
    }

    private final void d(int i) {
        if (i == android.os.Process.myUid()) {
            return;
        }
        android.content.Context context = getContext();
        context.getClass();
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        defpackage.slj sljVarA = defpackage.slj.a(context);
        if (packagesForUid != null) {
            for (java.lang.String str : packagesForUid) {
                if (sljVarA.b(str)) {
                    return;
                }
            }
        }
        throw new java.lang.SecurityException(defpackage.a.bo(i, "Access denied to non-Google uid: "));
    }

    private final void e(android.content.ContentResolver contentResolver, oll ollVar) {
        j$.util.Optional optional = this.c;
        kgd kgdVar = new kgd(this, ollVar, 3);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            ((com.google.android.apps.auto.components.troubleshooter.contentprovider.TroubleshooterContentProvider) kgdVar.a).b((oll) kgdVar.b, (defpackage.mbt) obj);
        }
        contentResolver.notifyChange(ryc.a, null);
    }

    private static final oll f(android.content.Context context) {
        return new oll(context, new ryh(context));
    }

    public final synchronized java.util.Map a() {
        if (this.b == null) {
            android.content.Context context = getContext();
            context.getClass();
            this.b = defpackage.mlv.C(context, false);
        }
        return this.b;
    }

    public final /* synthetic */ void b(oll ollVar, defpackage.mbt mbtVar) {
        j$.util.stream.Stream map = j$.util.Collection.-EL.stream(ollVar.a().b).filter(new defpackage.mpw(this, 15)).map(new defpackage.mjc(this, 14));
        int i = defpackage.ygw.d;
        defpackage.ygw ygwVar = (defpackage.ygw) map.collect(defpackage.yds.a);
        if (ygwVar.isEmpty()) {
            ((android.app.NotificationManager) mbtVar.b).cancel(24);
            return;
        }
        int size = ygwVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            okf okfVar = (okf) ygwVar.get(i2);
            if (okfVar.e() && !okfVar.d()) {
                mbtVar.d(okfVar);
            }
        }
    }

    @Override // android.content.ContentProvider
    public final android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        d(android.os.Binder.getCallingUid());
        android.content.Context context = getContext();
        context.getClass();
        android.os.Bundle bundle2 = new android.os.Bundle();
        if (str.equals("retrieve_stored_issue_detectors")) {
            bundle2.putByteArray("retrieve_stored_issue_detectors", f(context).a().h());
            return bundle2;
        }
        boolean z = false;
        if (str.equals("retrieve_stored_troubleshooter_parameters")) {
            olp olpVarA = olo.a(context.getSharedPreferences("troubleshooter_metadata", 0));
            defpackage.abor aborVarK = olpVarA.K();
            boolean z2 = olpVarA.d;
            aborVarK.t();
            olp olpVar = aborVarK.b;
            olpVar.b |= 2;
            olpVar.d = z2;
            bundle2.putByteArray("retrieve_stored_troubleshooter_parameters", aborVarK.q().h());
            return bundle2;
        }
        if (str.equals("show_notification_for_persistent_detector")) {
            if (bundle != null && this.c.isPresent()) {
                j$.util.Optional optionalC = c(bundle.getInt("detector_type", -1));
                if (optionalC.isPresent()) {
                    java.lang.Object obj = this.c.get();
                    okc okcVar = (okc) optionalC.get();
                    if (okcVar.e()) {
                        ((defpackage.mbt) obj).d(okcVar.a());
                        z = true;
                    }
                }
            }
            bundle2.putBoolean("show_notification_for_persistent_detector", z);
            return bundle2;
        }
        if (!str.equals("cancel_notification_for_persistent_detector")) {
            throw new java.lang.UnsupportedOperationException();
        }
        if (bundle != null && this.c.isPresent()) {
            j$.util.Optional optionalC2 = c(bundle.getInt("detector_type", -1));
            if (optionalC2.isPresent()) {
                java.lang.Object obj2 = this.c.get();
                okc okcVar2 = (okc) optionalC2.get();
                if (okcVar2.e()) {
                    ((android.app.NotificationManager) ((defpackage.mbt) obj2).b).cancel(defpackage.mbt.e(okcVar2.a()), 24);
                    z = true;
                }
            }
        }
        bundle2.putBoolean("cancel_notification_for_persistent_detector", z);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        java.lang.String str2;
        d(android.os.Binder.getCallingUid());
        android.content.Context context = getContext();
        context.getClass();
        if (strArr == null || strArr.length == 0 || (str2 = strArr[0]) == null) {
            ((defpackage.yqj) a.l().ai((char) 5997)).u("Unable to delete, invalid selectionArgs.");
            return 0;
        }
        if ("detector_type".equals(str)) {
            yyt yytVarB = yyt.b(java.lang.Integer.parseInt(str2));
            if (yytVarB != null) {
                oll ollVarF = f(context);
                if (ollVarF.d(new defpackage.mpw(yytVarB, 16))) {
                    okc okcVar = (okc) a().get(yytVarB);
                    ((defpackage.yqj) a.l().ai((char) 5999)).y("Deleting issue %s", yytVarB);
                    if (okcVar == null || !okcVar.a().m().f()) {
                        defpackage.omv.k(context, defpackage.yyn.TROUBLESHOOTER_ISSUE_RESOLVED, yytVarB);
                    } else {
                        defpackage.omv.i(context, (defpackage.yyn) okcVar.a().m().b());
                    }
                    e(context.getContentResolver(), ollVarF);
                    return 1;
                }
            }
            return 0;
        }
        if (!"stored_issue".equals(str)) {
            ((defpackage.yqj) a.l().ai((char) 5998)).u("Unable to delete, invalid selection type.");
            return 0;
        }
        java.util.UUID uuidFromString = java.util.UUID.fromString(str2);
        oll ollVarF2 = f(context);
        j$.util.Optional optionalFindFirst = j$.util.Collection.-EL.stream(ollVarF2.b().b).filter(new defpackage.mpw(uuidFromString, 18)).findFirst();
        if (optionalFindFirst.isEmpty() || !ollVarF2.d(new defpackage.mpw(uuidFromString, 17))) {
            return 0;
        }
        ((defpackage.yqj) a.l().ai((char) 6000)).y("Deleting issue by uuid %s", uuidFromString);
        defpackage.yyn yynVar = defpackage.yyn.TROUBLESHOOTER_ISSUE_REMOVED;
        yyt yytVarB2 = yyt.b(((olq) optionalFindFirst.get()).d);
        if (yytVarB2 == null) {
            yytVarB2 = yyt.a;
        }
        defpackage.omv.k(context, yynVar, yytVarB2);
        e(context.getContentResolver(), ollVarF2);
        return 1;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        d(android.os.Binder.getCallingUid());
        return "com.google.android.apps.auto/TroubleshooterIssue";
    }

    @Override // android.content.ContentProvider
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        d(android.os.Binder.getCallingUid());
        android.content.Context context = getContext();
        context.getClass();
        java.lang.Integer asInteger = contentValues == null ? null : contentValues.getAsInteger("detector_type");
        defpackage.yqm yqmVar = a;
        ((defpackage.yqj) yqmVar.l().ai((char) 6002)).y("Troubleshooter issue reported: %d", asInteger);
        okc okcVar = asInteger == null ? null : (okc) a().get(yyt.b(asInteger.intValue()));
        if (okcVar != null) {
            okcVar.b();
            if (okcVar.d() == 2 || okcVar.e()) {
                defpackage.ypu ypuVarG = yqmVar.g();
                yyt yytVar = okcVar.c;
                ((defpackage.yqj) ((defpackage.yqj) ypuVarG).ai((char) 6003)).y("Troubleshooter issue detected for %s", yytVar.name());
                if (okcVar.a().j().f()) {
                    defpackage.omv.i(context, (defpackage.yyn) okcVar.a().j().b());
                }
                oll ollVarF = f(context);
                okf okfVarA = okcVar.a();
                int iF = okcVar.f();
                java.util.UUID uuidRandomUUID = java.util.UUID.randomUUID();
                defpackage.abor aborVarN = olq.a.n();
                aborVarN.t();
                olq olqVar = aborVarN.b;
                olqVar.d = yytVar.r;
                olqVar.b |= 2;
                long epochMilli = j$.time.Instant.now().toEpochMilli();
                aborVarN.t();
                olq olqVar2 = aborVarN.b;
                olqVar2.b |= 8;
                olqVar2.f = epochMilli;
                java.lang.String strB = okfVarA.b();
                aborVarN.t();
                olq olqVar3 = aborVarN.b;
                strB.getClass();
                olqVar3.b |= 16;
                olqVar3.g = strB;
                java.lang.String strC = okfVarA.c();
                aborVarN.t();
                olq olqVar4 = aborVarN.b;
                strC.getClass();
                olqVar4.b |= 32;
                olqVar4.h = strC;
                java.lang.String string = uuidRandomUUID.toString();
                aborVarN.t();
                olq olqVar5 = aborVarN.b;
                string.getClass();
                int i = 1;
                olqVar5.b |= 1;
                olqVar5.c = string;
                aborVarN.t();
                olq olqVar6 = aborVarN.b;
                olqVar6.i = iF - 1;
                olqVar6.b |= 64;
                if (okfVarA.n().f()) {
                    java.lang.Object objB = okfVarA.n().b();
                    aborVarN.t();
                    olq olqVar7 = aborVarN.b;
                    olqVar7.b |= 256;
                    olqVar7.k = (java.lang.String) objB;
                }
                olq olqVarQ = aborVarN.q();
                defpackage.xyn xynVarP = okfVarA.p();
                synchronized (oll.a) {
                    defpackage.abor aborVarN2 = olr.a.n();
                    aborVarN2.z(olqVarQ);
                    for (olq olqVar8 : ollVarF.b().b) {
                        yyt yytVarB = yyt.b(olqVar8.d);
                        if (yytVarB == null) {
                            yytVarB = yyt.a;
                        }
                        yyt yytVarB2 = yyt.b(olqVarQ.d);
                        if (yytVarB2 == null) {
                            yytVarB2 = yyt.a;
                        }
                        if (!yytVarB.equals(yytVarB2)) {
                            aborVarN2.z(olqVar8);
                        } else if (i < ((java.lang.Integer) ((defpackage.xys) xynVarP).a).intValue()) {
                            aborVarN2.z(olqVar8);
                            i++;
                        }
                    }
                    ollVarF.c(aborVarN2.q());
                }
                e(context.getContentResolver(), ollVarF);
                return ryc.a.buildUpon().appendPath("uuid").appendPath(uuidRandomUUID.toString()).build();
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        j$.util.Optional optional = this.c;
        android.content.Context context = getContext();
        context.getClass();
        this.c = j$.util.Optional.of((defpackage.mbt) optional.orElse(new defpackage.mbt(context)));
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        d(android.os.Binder.getCallingUid());
        return null;
    }

    @Override // android.content.ContentProvider
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        boolean z;
        d(android.os.Binder.getCallingUid());
        android.content.Context context = getContext();
        context.getClass();
        android.net.Uri uri2 = ryc.a;
        if (uri != null && "com.google.android.projection.gearhead.troubleshooter_provider".equals(uri.getAuthority()) && uri.getPathSegments().size() == 1 && "parameters".equals(uri.getLastPathSegment())) {
            if (contentValues == null) {
                throw new java.lang.IllegalArgumentException("Proto for troubleshooter parameters must be passed in with ContentValues.");
            }
            android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("troubleshooter_metadata", 0);
            if (!contentValues.containsKey("troubleshooter_parameters")) {
                throw new java.lang.IllegalArgumentException("ContentValues does not contain key 'troubleshooter_parameters'");
            }
            try {
                defpackage.abox aboxVar = (olp) defpackage.abox.B(olp.a, contentValues.getAsByteArray("troubleshooter_parameters"), defpackage.abol.a());
                synchronized (olo.a) {
                    defpackage.abor aborVarO = olp.a.o(olo.a(sharedPreferences));
                    aborVarO.w(aboxVar);
                    sharedPreferences.edit().putString("troubleshooter_parameters", android.util.Base64.encodeToString(aborVarO.q().h(), 0)).commit();
                }
                context.getContentResolver().notifyChange(uri, null);
                return 1;
            } catch (defpackage.abpp | java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalArgumentException("Invalid data passed in for TroubleshooterParameters byteArray", e);
            }
        }
        if (!ryc.a.equals(uri)) {
            throw new java.lang.IllegalArgumentException("The URI '" + uri + "' is not handled by this content provider");
        }
        oll ollVarF = f(context);
        try {
            if (contentValues == null) {
                throw new java.lang.IllegalArgumentException("Proto for issue must be passed in with ContentValues.");
            }
            defpackage.abox aboxVar2 = (olq) defpackage.abox.B(olq.a, contentValues.getAsByteArray("stored_issue"), defpackage.abol.a());
            synchronized (oll.a) {
                olr olrVarB = ollVarF.b();
                defpackage.abor aborVarN = olr.a.n();
                z = false;
                for (olq olqVar : olrVarB.b) {
                    if (!z && ((olq) aboxVar2).c.equals(olqVar.c)) {
                        defpackage.abor aborVarK = olqVar.K();
                        aborVarK.w(aboxVar2);
                        olqVar = (olq) aborVarK.q();
                        z = true;
                    }
                    aborVarN.z(olqVar);
                }
                if (z) {
                    ollVarF.c(aborVarN.q());
                }
            }
            e(context.getContentResolver(), ollVarF);
            return z ? 1 : 0;
        } catch (defpackage.abpp | java.lang.IllegalArgumentException e2) {
            throw new java.lang.IllegalArgumentException("Invalid data passed in for StoredIssue byteArray", e2);
        }
    }
}
