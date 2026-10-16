package com.google.android.apps.auto.components.troubleshooter.contentprovider;

import android.app.NotificationManager;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.util.Base64;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.a;
import defpackage.abnj;
import defpackage.abnp;
import defpackage.abnv;
import defpackage.abon;
import defpackage.kga;
import defpackage.mbm;
import defpackage.mix;
import defpackage.mjv;
import defpackage.mqu;
import defpackage.ojj;
import defpackage.ojn;
import defpackage.okt;
import defpackage.okw;
import defpackage.okx;
import defpackage.oky;
import defpackage.okz;
import defpackage.ols;
import defpackage.rxj;
import defpackage.rxo;
import defpackage.skn;
import defpackage.xxh;
import defpackage.xxm;
import defpackage.ycm;
import defpackage.yfq;
import defpackage.yop;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxi;
import defpackage.yxo;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class TroubleshooterContentProvider extends ContentProvider {
    private static final yph a = yph.c("GH.TROUBLESHOOTER");
    private Map b;
    private Optional c = Optional.empty();

    private final Optional c(int i) {
        yxo yxoVarB = yxo.b(i);
        if (yxoVarB != null) {
            return Optional.ofNullable((ojj) a().get(yxoVarB));
        }
        ((ype) ((ype) a.h()).ai((char) 5978)).w("Unable to obtain a DetectorType for number %d", i);
        return Optional.empty();
    }

    private final void d(int i) {
        if (i == Process.myUid()) {
            return;
        }
        Context context = getContext();
        context.getClass();
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        skn sknVarA = skn.a(context);
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (sknVarA.b(str)) {
                    return;
                }
            }
        }
        throw new SecurityException(a.bp(i, "Access denied to non-Google uid: "));
    }

    private final void e(ContentResolver contentResolver, okt oktVar) {
        Optional optional = this.c;
        kga kgaVar = new kga(this, oktVar, 3);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            ((TroubleshooterContentProvider) kgaVar.a).b((okt) kgaVar.b, (mbm) obj);
        }
        contentResolver.notifyChange(rxj.a, null);
    }

    private static final okt f(Context context) {
        return new okt(context, new rxo(context));
    }

    public final synchronized Map a() {
        if (this.b == null) {
            Context context = getContext();
            context.getClass();
            this.b = mjv.r(context, false);
        }
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void b(okt oktVar, mbm mbmVar) {
        Stream map = Collection.EL.stream(oktVar.a().b).filter(new mqu(this, 14)).map(new mix(this, 13));
        int i = yfq.d;
        yfq yfqVar = (yfq) map.collect(ycm.a);
        if (yfqVar.isEmpty()) {
            ((NotificationManager) mbmVar.a).cancel(24);
            return;
        }
        int size = yfqVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            ojn ojnVar = (ojn) yfqVar.get(i2);
            if (ojnVar.e() && !ojnVar.d()) {
                mbmVar.e(ojnVar);
            }
        }
    }

    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        d(Binder.getCallingUid());
        Context context = getContext();
        context.getClass();
        Bundle bundle2 = new Bundle();
        if (str.equals("retrieve_stored_issue_detectors")) {
            bundle2.putByteArray("retrieve_stored_issue_detectors", f(context).a().h());
            return bundle2;
        }
        boolean z = false;
        if (str.equals("retrieve_stored_troubleshooter_parameters")) {
            okx okxVarA = okw.a(context.getSharedPreferences("troubleshooter_metadata", 0));
            abnp abnpVarK = okxVarA.K();
            boolean z2 = okxVarA.d;
            abnpVarK.t();
            okx okxVar = (okx) abnpVarK.b;
            okxVar.b |= 2;
            okxVar.d = z2;
            bundle2.putByteArray("retrieve_stored_troubleshooter_parameters", ((okx) abnpVarK.q()).h());
            return bundle2;
        }
        if (str.equals("show_notification_for_persistent_detector")) {
            if (bundle != null && this.c.isPresent()) {
                Optional optionalC = c(bundle.getInt("detector_type", -1));
                if (optionalC.isPresent()) {
                    Object obj = this.c.get();
                    ojj ojjVar = (ojj) optionalC.get();
                    if (ojjVar.e()) {
                        ((mbm) obj).e(ojjVar.a());
                        z = true;
                    }
                }
            }
            bundle2.putBoolean("show_notification_for_persistent_detector", z);
            return bundle2;
        }
        if (!str.equals("cancel_notification_for_persistent_detector")) {
            throw new UnsupportedOperationException();
        }
        if (bundle != null && this.c.isPresent()) {
            Optional optionalC2 = c(bundle.getInt("detector_type", -1));
            if (optionalC2.isPresent()) {
                Object obj2 = this.c.get();
                ojj ojjVar2 = (ojj) optionalC2.get();
                if (ojjVar2.e()) {
                    ((NotificationManager) ((mbm) obj2).a).cancel(mbm.f(ojjVar2.a()), 24);
                    z = true;
                }
            }
        }
        bundle2.putBoolean("cancel_notification_for_persistent_detector", z);
        return bundle2;
    }

    @Override // android.content.ContentProvider
    @ResultIgnorabilityUnspecified
    public final int delete(Uri uri, String str, String[] strArr) {
        String str2;
        d(Binder.getCallingUid());
        Context context = getContext();
        context.getClass();
        if (strArr == null || strArr.length == 0 || (str2 = strArr[0]) == null) {
            ((ype) a.l().ai((char) 5971)).u("Unable to delete, invalid selectionArgs.");
            return 0;
        }
        if ("detector_type".equals(str)) {
            yxo yxoVarB = yxo.b(Integer.parseInt(str2));
            if (yxoVarB != null) {
                okt oktVarF = f(context);
                if (oktVarF.d(new mqu(yxoVarB, 15))) {
                    ojj ojjVar = (ojj) a().get(yxoVarB);
                    ((ype) a.l().ai((char) 5973)).y("Deleting issue %s", yxoVarB);
                    if (ojjVar == null || !ojjVar.a().m().f()) {
                        ols.O(context, yxi.TROUBLESHOOTER_ISSUE_RESOLVED, yxoVarB);
                    } else {
                        ols.M(context, (yxi) ojjVar.a().m().b());
                    }
                    e(context.getContentResolver(), oktVarF);
                    return 1;
                }
            }
            return 0;
        }
        if (!"stored_issue".equals(str)) {
            ((ype) a.l().ai((char) 5972)).u("Unable to delete, invalid selection type.");
            return 0;
        }
        UUID uuidFromString = UUID.fromString(str2);
        okt oktVarF2 = f(context);
        Optional optionalFindFirst = Collection.EL.stream(oktVarF2.b().b).filter(new mqu(uuidFromString, 17)).findFirst();
        if (optionalFindFirst.isEmpty() || !oktVarF2.d(new mqu(uuidFromString, 16))) {
            return 0;
        }
        ((ype) a.l().ai((char) 5974)).y("Deleting issue by uuid %s", uuidFromString);
        yxi yxiVar = yxi.TROUBLESHOOTER_ISSUE_REMOVED;
        yxo yxoVarB2 = yxo.b(((oky) optionalFindFirst.get()).d);
        if (yxoVarB2 == null) {
            yxoVarB2 = yxo.DETECTOR_TYPE_UNSPECIFIED;
        }
        ols.O(context, yxiVar, yxoVarB2);
        e(context.getContentResolver(), oktVarF2);
        return 1;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        d(Binder.getCallingUid());
        return "com.google.android.apps.auto/TroubleshooterIssue";
    }

    @Override // android.content.ContentProvider
    @ResultIgnorabilityUnspecified
    public final Uri insert(Uri uri, ContentValues contentValues) {
        d(Binder.getCallingUid());
        Context context = getContext();
        context.getClass();
        Integer asInteger = contentValues == null ? null : contentValues.getAsInteger("detector_type");
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 5976)).y("Troubleshooter issue reported: %d", asInteger);
        ojj ojjVar = asInteger == null ? null : (ojj) a().get(yxo.b(asInteger.intValue()));
        if (ojjVar != null) {
            ojjVar.b();
            if (ojjVar.d() == 2 || ojjVar.e()) {
                yop yopVarG = yphVar.g();
                yxo yxoVar = ojjVar.c;
                ((ype) ((ype) yopVarG).ai((char) 5977)).y("Troubleshooter issue detected for %s", yxoVar.name());
                if (ojjVar.a().j().f()) {
                    ols.M(context, (yxi) ojjVar.a().j().b());
                }
                okt oktVarF = f(context);
                ojn ojnVarA = ojjVar.a();
                int iF = ojjVar.f();
                UUID uuidRandomUUID = UUID.randomUUID();
                abnp abnpVarN = oky.a.n();
                abnpVarN.t();
                oky okyVar = (oky) abnpVarN.b;
                okyVar.d = yxoVar.r;
                okyVar.b |= 2;
                long epochMilli = Instant.now().toEpochMilli();
                abnpVarN.t();
                oky okyVar2 = (oky) abnpVarN.b;
                okyVar2.b |= 8;
                okyVar2.f = epochMilli;
                String strB = ojnVarA.b();
                abnpVarN.t();
                oky okyVar3 = (oky) abnpVarN.b;
                strB.getClass();
                okyVar3.b |= 16;
                okyVar3.g = strB;
                String strC = ojnVarA.c();
                abnpVarN.t();
                oky okyVar4 = (oky) abnpVarN.b;
                strC.getClass();
                okyVar4.b |= 32;
                okyVar4.h = strC;
                String string = uuidRandomUUID.toString();
                abnpVarN.t();
                oky okyVar5 = (oky) abnpVarN.b;
                string.getClass();
                int i = 1;
                okyVar5.b |= 1;
                okyVar5.c = string;
                abnpVarN.t();
                oky okyVar6 = (oky) abnpVarN.b;
                okyVar6.i = iF - 1;
                okyVar6.b |= 64;
                if (ojnVarA.n().f()) {
                    Object objB = ojnVarA.n().b();
                    abnpVarN.t();
                    oky okyVar7 = (oky) abnpVarN.b;
                    okyVar7.b |= 256;
                    okyVar7.k = (String) objB;
                }
                oky okyVar8 = (oky) abnpVarN.q();
                xxh xxhVarP = ojnVarA.p();
                synchronized (okt.a) {
                    abnp abnpVarN2 = okz.a.n();
                    abnpVarN2.z(okyVar8);
                    for (oky okyVar9 : oktVarF.b().b) {
                        yxo yxoVarB = yxo.b(okyVar9.d);
                        if (yxoVarB == null) {
                            yxoVarB = yxo.DETECTOR_TYPE_UNSPECIFIED;
                        }
                        yxo yxoVarB2 = yxo.b(okyVar8.d);
                        if (yxoVarB2 == null) {
                            yxoVarB2 = yxo.DETECTOR_TYPE_UNSPECIFIED;
                        }
                        if (!yxoVarB.equals(yxoVarB2)) {
                            abnpVarN2.z(okyVar9);
                        } else if (i < ((Integer) ((xxm) xxhVarP).a).intValue()) {
                            abnpVarN2.z(okyVar9);
                            i++;
                        }
                    }
                    oktVarF.c((okz) abnpVarN2.q());
                }
                e(context.getContentResolver(), oktVarF);
                return rxj.a.buildUpon().appendPath("uuid").appendPath(uuidRandomUUID.toString()).build();
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Optional optional = this.c;
        Context context = getContext();
        context.getClass();
        this.c = Optional.of((mbm) optional.orElse(new mbm(context)));
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        d(Binder.getCallingUid());
        return null;
    }

    @Override // android.content.ContentProvider
    @ResultIgnorabilityUnspecified
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        boolean z;
        d(Binder.getCallingUid());
        Context context = getContext();
        context.getClass();
        Uri uri2 = rxj.a;
        if (uri != null && "com.google.android.projection.gearhead.troubleshooter_provider".equals(uri.getAuthority()) && uri.getPathSegments().size() == 1 && "parameters".equals(uri.getLastPathSegment())) {
            if (contentValues == null) {
                throw new IllegalArgumentException("Proto for troubleshooter parameters must be passed in with ContentValues.");
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("troubleshooter_metadata", 0);
            if (!contentValues.containsKey("troubleshooter_parameters")) {
                throw new IllegalArgumentException("ContentValues does not contain key 'troubleshooter_parameters'");
            }
            try {
                okx okxVar = (okx) abnv.B(okx.a, contentValues.getAsByteArray("troubleshooter_parameters"), abnj.a());
                synchronized (okw.a) {
                    abnp abnpVarO = okx.a.o(okw.a(sharedPreferences));
                    abnpVarO.w(okxVar);
                    sharedPreferences.edit().putString("troubleshooter_parameters", Base64.encodeToString(((okx) abnpVarO.q()).h(), 0)).commit();
                }
                context.getContentResolver().notifyChange(uri, null);
                return 1;
            } catch (abon | IllegalArgumentException e) {
                throw new IllegalArgumentException("Invalid data passed in for TroubleshooterParameters byteArray", e);
            }
        }
        if (!rxj.a.equals(uri)) {
            throw new IllegalArgumentException("The URI '" + uri + "' is not handled by this content provider");
        }
        okt oktVarF = f(context);
        try {
            if (contentValues == null) {
                throw new IllegalArgumentException("Proto for issue must be passed in with ContentValues.");
            }
            oky okyVar = (oky) abnv.B(oky.a, contentValues.getAsByteArray("stored_issue"), abnj.a());
            synchronized (okt.a) {
                okz okzVarB = oktVarF.b();
                abnp abnpVarN = okz.a.n();
                z = false;
                for (oky okyVar2 : okzVarB.b) {
                    if (!z && okyVar.c.equals(okyVar2.c)) {
                        abnp abnpVarK = okyVar2.K();
                        abnpVarK.w(okyVar);
                        okyVar2 = (oky) abnpVarK.q();
                        z = true;
                    }
                    abnpVarN.z(okyVar2);
                }
                if (z) {
                    oktVarF.c((okz) abnpVarN.q());
                }
            }
            e(context.getContentResolver(), oktVarF);
            return z ? 1 : 0;
        } catch (abon | IllegalArgumentException e2) {
            throw new IllegalArgumentException("Invalid data passed in for StoredIssue byteArray", e2);
        }
    }
}
