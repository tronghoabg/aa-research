package A7;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzkb;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import x.C4412e;

/* renamed from: A7.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0249f0 extends G1 implements InterfaceC0248f {

    /* renamed from: d, reason: collision with root package name */
    public final C4412e f858d;

    /* renamed from: e, reason: collision with root package name */
    public final C4412e f859e;

    /* renamed from: f, reason: collision with root package name */
    public final C4412e f860f;

    /* renamed from: g, reason: collision with root package name */
    public final C4412e f861g;

    /* renamed from: h, reason: collision with root package name */
    public final C4412e f862h;

    /* renamed from: i, reason: collision with root package name */
    public final C4412e f863i;

    /* renamed from: j, reason: collision with root package name */
    public final C0252g0 f864j;
    public final Y9.c k;

    /* renamed from: l, reason: collision with root package name */
    public final C4412e f865l;

    /* renamed from: m, reason: collision with root package name */
    public final C4412e f866m;

    /* renamed from: n, reason: collision with root package name */
    public final C4412e f867n;

    public C0249f0(L1 l12) {
        super(l12);
        this.f858d = new C4412e(0);
        this.f859e = new C4412e(0);
        this.f860f = new C4412e(0);
        this.f861g = new C4412e(0);
        this.f862h = new C4412e(0);
        this.f865l = new C4412e(0);
        this.f866m = new C4412e(0);
        this.f867n = new C4412e(0);
        this.f863i = new C4412e(0);
        this.f864j = new C0252g0(this);
        this.k = new Y9.c(this, 3);
    }

    public static E0 l0(zzfr.zza.zze zzeVar) {
        int i5 = AbstractC0261j0.f915b[zzeVar.ordinal()];
        if (i5 == 1) {
            return E0.AD_STORAGE;
        }
        if (i5 == 2) {
            return E0.ANALYTICS_STORAGE;
        }
        if (i5 == 3) {
            return E0.AD_USER_DATA;
        }
        if (i5 != 4) {
            return null;
        }
        return E0.AD_PERSONALIZATION;
    }

    public static C4412e o0(zzfr.zzd zzdVar) {
        C4412e c4412e = new C4412e(0);
        if (zzdVar != null) {
            for (zzfr.zzh zzhVar : zzdVar.zzn()) {
                c4412e.put(zzhVar.zzb(), zzhVar.zzc());
            }
        }
        return c4412e;
    }

    public final boolean A0(String str) {
        c0();
        B0(str);
        C4412e c4412e = this.f859e;
        if (c4412e.get(str) != null) {
            return ((Set) c4412e.get(str)).contains("os_version") || ((Set) c4412e.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B0(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0249f0.B0(java.lang.String):void");
    }

    @Override // A7.InterfaceC0248f
    public final String a(String str, String str2) {
        c0();
        B0(str);
        Map map = (Map) this.f858d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // A7.G1
    public final boolean j0() {
        return false;
    }

    public final long k0(String str) {
        String strA = a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strA)) {
            return 0L;
        }
        try {
            return Long.parseLong(strA);
        } catch (NumberFormatException e7) {
            N nZzj = zzj();
            nZzj.f608i.b(N.h0(str), "Unable to parse timezone offset. appId", e7);
            return 0L;
        }
    }

    public final H0 m0(String str, E0 e02) {
        c0();
        B0(str);
        zzfr.zza zzaVarT0 = t0(str);
        H0 h02 = H0.UNINITIALIZED;
        if (zzaVarT0 != null) {
            Iterator<zzfr.zza.C0147zza> it = zzaVarT0.zzf().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zzfr.zza.C0147zza next = it.next();
                if (l0(next.zzc()) == e02) {
                    int i5 = AbstractC0261j0.f916c[next.zzb().ordinal()];
                    if (i5 == 1) {
                        return H0.DENIED;
                    }
                    if (i5 == 2) {
                        return H0.GRANTED;
                    }
                }
            }
        }
        return h02;
    }

    public final zzfr.zzd n0(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfr.zzd.zzg();
        }
        try {
            zzfr.zzd zzdVar = (zzfr.zzd) ((zzjt) ((zzfr.zzd.zza) S1.t0(zzfr.zzd.zze(), bArr)).zzai());
            zzj().f612n.b(zzdVar.zzr() ? Long.valueOf(zzdVar.zzc()) : null, "Parsed config. version, gmp_app_id", zzdVar.zzp() ? zzdVar.zzi() : null);
            return zzdVar;
        } catch (zzkb e7) {
            zzj().f608i.b(N.h0(str), "Unable to merge remote config. appId", e7);
            return zzfr.zzd.zzg();
        } catch (RuntimeException e10) {
            zzj().f608i.b(N.h0(str), "Unable to merge remote config. appId", e10);
            return zzfr.zzd.zzg();
        }
    }

    public final void p0(String str, zzfr.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        C4412e c4412e = new C4412e(0);
        C4412e c4412e2 = new C4412e(0);
        C4412e c4412e3 = new C4412e(0);
        if (zzaVar != null) {
            Iterator<zzfr.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i5 = 0; i5 < zzaVar.zza(); i5++) {
                zzfr.zzc.zza zzaVarZzcd = zzaVar.zza(i5).zzcd();
                if (zzaVarZzcd.zzb().isEmpty()) {
                    zzj().f608i.c("EventConfig contained null event name");
                } else {
                    String strZzb = zzaVarZzcd.zzb();
                    String strC = I0.c(zzaVarZzcd.zzb(), I0.f523a, I0.f525c);
                    if (!TextUtils.isEmpty(strC)) {
                        zzaVarZzcd = zzaVarZzcd.zza(strC);
                        zzaVar.zza(i5, zzaVarZzcd);
                    }
                    if (zzaVarZzcd.zze() && zzaVarZzcd.zzc()) {
                        c4412e.put(strZzb, Boolean.TRUE);
                    }
                    if (zzaVarZzcd.zzf() && zzaVarZzcd.zzd()) {
                        c4412e2.put(zzaVarZzcd.zzb(), Boolean.TRUE);
                    }
                    if (zzaVarZzcd.zzg()) {
                        if (zzaVarZzcd.zza() < 2 || zzaVarZzcd.zza() > 65535) {
                            N nZzj = zzj();
                            nZzj.f608i.b(zzaVarZzcd.zzb(), "Invalid sampling rate. Event name, sample rate", Integer.valueOf(zzaVarZzcd.zza()));
                        } else {
                            c4412e3.put(zzaVarZzcd.zzb(), Integer.valueOf(zzaVarZzcd.zza()));
                        }
                    }
                }
            }
        }
        this.f859e.put(str, hashSet);
        this.f860f.put(str, c4412e);
        this.f861g.put(str, c4412e2);
        this.f863i.put(str, c4412e3);
    }

    public final void q0(String str, zzfr.zzd zzdVar) {
        int iZza = zzdVar.zza();
        C0252g0 c0252g0 = this.f864j;
        if (iZza == 0) {
            c0252g0.remove(str);
            return;
        }
        N nZzj = zzj();
        nZzj.f612n.d("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzgd.zzc zzcVar = zzdVar.zzm().get(0);
        try {
            zzb zzbVar = new zzb();
            CallableC0246e0 callableC0246e0 = new CallableC0246e0(2);
            callableC0246e0.f856b = this;
            callableC0246e0.f857c = str;
            zzbVar.zza("internal.remoteConfig", callableC0246e0);
            CallableC0246e0 callableC0246e02 = new CallableC0246e0(1);
            callableC0246e02.f856b = this;
            callableC0246e02.f857c = str;
            zzbVar.zza("internal.appMetadata", callableC0246e02);
            CallableC0255h0 callableC0255h0 = new CallableC0255h0();
            callableC0255h0.f887b = this;
            zzbVar.zza("internal.logger", callableC0255h0);
            zzbVar.zza(zzcVar);
            c0252g0.put(str, zzbVar);
            zzj().f612n.b(str, "EES program loaded for appId, activities", Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzgd.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().f612n.d("EES program activity", it.next().zzb());
            }
        } catch (zzc unused) {
            zzj().f605f.d("Failed to load EES program. appId", str);
        }
    }

    public final boolean r0(String str, String str2, String str3, byte[] bArr) {
        byte[] bArrZzca;
        boolean z2;
        boolean z10;
        h0();
        c0();
        AbstractC1732v.f(str);
        zzfr.zzd.zza zzaVarZzcd = n0(str, bArr).zzcd();
        int i5 = 0;
        if (zzaVarZzcd == null) {
            return false;
        }
        p0(str, zzaVarZzcd);
        q0(str, (zzfr.zzd) ((zzjt) zzaVarZzcd.zzai()));
        C4412e c4412e = this.f862h;
        c4412e.put(str, (zzfr.zzd) ((zzjt) zzaVarZzcd.zzai()));
        this.f865l.put(str, zzaVarZzcd.zzc());
        this.f866m.put(str, str2);
        this.f867n.put(str, str3);
        this.f858d.put(str, o0((zzfr.zzd) ((zzjt) zzaVarZzcd.zzai())));
        C0257i c0257iF0 = f0();
        ArrayList arrayList = new ArrayList(zzaVarZzcd.zzd());
        int i10 = 0;
        while (i10 < arrayList.size()) {
            zzfo.zza.C0146zza c0146zzaZzcd = ((zzfo.zza) arrayList.get(i10)).zzcd();
            if (c0146zzaZzcd.zza() != 0) {
                while (i5 < c0146zzaZzcd.zza()) {
                    zzfo.zzb.zza zzaVarZzcd2 = c0146zzaZzcd.zza(i5).zzcd();
                    zzfo.zzb.zza zzaVar = (zzfo.zzb.zza) ((zzjt.zzb) zzaVarZzcd2.clone());
                    zzfr.zzd.zza zzaVar2 = zzaVarZzcd;
                    C4412e c4412e2 = c4412e;
                    String strC = I0.c(zzaVarZzcd2.zzb(), I0.f523a, I0.f525c);
                    if (strC != null) {
                        zzaVar.zza(strC);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i11 = 0;
                    while (i11 < zzaVarZzcd2.zza()) {
                        zzfo.zzc zzcVarZza = zzaVarZzcd2.zza(i11);
                        zzfo.zzb.zza zzaVar3 = zzaVarZzcd2;
                        boolean z11 = z10;
                        String strC2 = I0.c(zzcVarZza.zze(), I0.f529g, I0.f530h);
                        if (strC2 != null) {
                            zzaVar.zza(i11, (zzfo.zzc) ((zzjt) zzcVarZza.zzcd().zza(strC2).zzai()));
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i11++;
                        zzaVarZzcd2 = zzaVar3;
                    }
                    if (z10) {
                        zzfo.zza.C0146zza c0146zzaZza = c0146zzaZzcd.zza(i5, zzaVar);
                        arrayList.set(i10, (zzfo.zza) ((zzjt) c0146zzaZza.zzai()));
                        c0146zzaZzcd = c0146zzaZza;
                    }
                    i5++;
                    zzaVarZzcd = zzaVar2;
                    c4412e = c4412e2;
                }
            }
            zzfr.zzd.zza zzaVar4 = zzaVarZzcd;
            C4412e c4412e3 = c4412e;
            if (c0146zzaZzcd.zzb() != 0) {
                for (int i12 = 0; i12 < c0146zzaZzcd.zzb(); i12++) {
                    zzfo.zze zzeVarZzb = c0146zzaZzcd.zzb(i12);
                    String strC3 = I0.c(zzeVarZzb.zze(), I0.f527e, I0.f528f);
                    if (strC3 != null) {
                        zzfo.zza.C0146zza c0146zzaZza2 = c0146zzaZzcd.zza(i12, zzeVarZzb.zzcd().zza(strC3));
                        arrayList.set(i10, (zzfo.zza) ((zzjt) c0146zzaZza2.zzai()));
                        c0146zzaZzcd = c0146zzaZza2;
                    }
                }
            }
            i10++;
            zzaVarZzcd = zzaVar4;
            c4412e = c4412e3;
            i5 = 0;
        }
        zzfr.zzd.zza zzaVar5 = zzaVarZzcd;
        C4412e c4412e4 = c4412e;
        c0257iF0.h0();
        c0257iF0.c0();
        AbstractC1732v.f(str);
        SQLiteDatabase sQLiteDatabaseL0 = c0257iF0.l0();
        sQLiteDatabaseL0.beginTransaction();
        try {
            c0257iF0.h0();
            c0257iF0.c0();
            AbstractC1732v.f(str);
            SQLiteDatabase sQLiteDatabaseL02 = c0257iF0.l0();
            sQLiteDatabaseL02.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseL02.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                zzfo.zza zzaVar6 = (zzfo.zza) it.next();
                c0257iF0.h0();
                c0257iF0.c0();
                AbstractC1732v.f(str);
                AbstractC1732v.i(zzaVar6);
                if (zzaVar6.zzg()) {
                    int iZza = zzaVar6.zza();
                    Iterator<zzfo.zzb> it2 = zzaVar6.zze().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!it2.next().zzl()) {
                                c0257iF0.zzj().f608i.b(N.h0(str), "Event filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iZza));
                                break;
                            }
                        } else {
                            Iterator<zzfo.zze> it3 = zzaVar6.zzf().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    if (!it3.next().zzi()) {
                                        c0257iF0.zzj().f608i.b(N.h0(str), "Property filter with no ID. Audience definition ignored. appId, audienceId", Integer.valueOf(iZza));
                                        break;
                                    }
                                } else {
                                    Iterator<zzfo.zzb> it4 = zzaVar6.zze().iterator();
                                    while (true) {
                                        if (!it4.hasNext()) {
                                            z2 = true;
                                            break;
                                        }
                                        if (!c0257iF0.O0(str, iZza, it4.next())) {
                                            z2 = false;
                                            break;
                                        }
                                    }
                                    if (z2) {
                                        Iterator<zzfo.zze> it5 = zzaVar6.zzf().iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                break;
                                            }
                                            if (!c0257iF0.P0(str, iZza, it5.next())) {
                                                z2 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z2) {
                                        c0257iF0.h0();
                                        c0257iF0.c0();
                                        AbstractC1732v.f(str);
                                        SQLiteDatabase sQLiteDatabaseL03 = c0257iF0.l0();
                                        sQLiteDatabaseL03.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZza)});
                                        sQLiteDatabaseL03.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZza)});
                                    }
                                }
                            }
                        }
                    }
                } else {
                    c0257iF0.zzj().f608i.d("Audience with no ID. appId", N.h0(str));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                zzfo.zza zzaVar7 = (zzfo.zza) it6.next();
                arrayList2.add(zzaVar7.zzg() ? Integer.valueOf(zzaVar7.zza()) : null);
            }
            c0257iF0.X0(str, arrayList2);
            sQLiteDatabaseL0.setTransactionSuccessful();
            sQLiteDatabaseL0.endTransaction();
            try {
                zzaVar5.zzb();
                bArrZzca = ((zzfr.zzd) ((zzjt) zzaVar5.zzai())).zzca();
            } catch (RuntimeException e7) {
                zzj().f608i.b(N.h0(str), "Unable to serialize reduced-size config. Storing full config instead. appId", e7);
                bArrZzca = bArr;
            }
            C0257i c0257iF02 = f0();
            AbstractC1732v.f(str);
            c0257iF02.c0();
            c0257iF02.h0();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArrZzca);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (c0257iF02.l0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    c0257iF02.zzj().f605f.d("Failed to update remote config (got 0). appId", N.h0(str));
                }
            } catch (SQLiteException e10) {
                c0257iF02.zzj().f605f.b(N.h0(str), "Error storing remote config. appId", e10);
            }
            c4412e4.put(str, (zzfr.zzd) ((zzjt) zzaVar5.zzai()));
            return true;
        } catch (Throwable th) {
            sQLiteDatabaseL0.endTransaction();
            throw th;
        }
    }

    public final int s0(String str, String str2) {
        Integer num;
        c0();
        B0(str);
        Map map = (Map) this.f863i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final zzfr.zza t0(String str) {
        c0();
        B0(str);
        zzfr.zzd zzdVarU0 = u0(str);
        if (zzdVarU0 == null || !zzdVarU0.zzo()) {
            return null;
        }
        return zzdVarU0.zzd();
    }

    public final zzfr.zzd u0(String str) {
        h0();
        c0();
        AbstractC1732v.f(str);
        B0(str);
        return (zzfr.zzd) this.f862h.get(str);
    }

    public final boolean v0(String str, E0 e02) {
        c0();
        B0(str);
        zzfr.zza zzaVarT0 = t0(str);
        if (zzaVarT0 == null) {
            return false;
        }
        for (zzfr.zza.C0147zza c0147zza : zzaVarT0.zzd()) {
            if (e02 == l0(c0147zza.zzc())) {
                return c0147zza.zzb() == zzfr.zza.zzd.GRANTED;
            }
        }
        return false;
    }

    public final boolean w0(String str, String str2) {
        Boolean bool;
        c0();
        B0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f861g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean x0(String str, String str2) {
        Boolean bool;
        c0();
        B0(str);
        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(a(str, "measurement.upload.blacklist_internal")) && U1.j1(str2)) {
            return true;
        }
        if (UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(a(str, "measurement.upload.blacklist_public")) && U1.k1(str2)) {
            return true;
        }
        Map map = (Map) this.f860f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String y0(String str) {
        c0();
        B0(str);
        return (String) this.f865l.get(str);
    }

    public final boolean z0(String str) {
        c0();
        B0(str);
        C4412e c4412e = this.f859e;
        return c4412e.get(str) != null && ((Set) c4412e.get(str)).contains("app_instance_id");
    }
}
