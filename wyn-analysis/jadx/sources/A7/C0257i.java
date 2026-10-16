package A7;

import A.AbstractC0213f;
import Va.M6;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zzpu;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* renamed from: A7.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0257i extends G1 {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f888f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f889g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f890h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f891i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f892j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f893l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f894m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: n, reason: collision with root package name */
    public static final String[] f895n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: o, reason: collision with root package name */
    public static final String[] f896o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d, reason: collision with root package name */
    public final C0269m f897d;

    /* renamed from: e, reason: collision with root package name */
    public final A2.d f898e;

    public C0257i(L1 l12) {
        super(l12);
        this.f898e = new A2.d(((C0273n0) this.f421a).f985n);
        this.f897d = new C0269m(this, ((C0273n0) this.f421a).f973a);
    }

    public static void A0(ContentValues contentValues, Object obj) {
        AbstractC1732v.f(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        AbstractC1732v.i(obj);
        if (obj instanceof String) {
            contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (Double) obj);
        }
    }

    public final void B0(zzfy.zzk zzkVar, boolean z2) {
        c0();
        h0();
        AbstractC1732v.i(zzkVar);
        AbstractC1732v.f(zzkVar.zzz());
        AbstractC1732v.l(zzkVar.zzbj());
        q1();
        ((C0273n0) this.f421a).f985n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jZzm = zzkVar.zzm();
        D d3 = AbstractC0304y.f1126F;
        if (jZzm < jCurrentTimeMillis - ((Long) d3.a(null)).longValue() || zzkVar.zzm() > ((Long) d3.a(null)).longValue() + jCurrentTimeMillis) {
            N nZzj = zzj();
            nZzj.f608i.a(N.h0(zzkVar.zzz()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zzkVar.zzm()), "Storing bundle outside of the max uploading time span. appId, now, timestamp");
        }
        try {
            byte[] bArrO0 = e0().O0(zzkVar.zzca());
            N nZzj2 = zzj();
            nZzj2.f612n.d("Saving bundle, size", Integer.valueOf(bArrO0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzkVar.zzz());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzkVar.zzm()));
            contentValues.put(JsonStorageKeyNames.DATA_KEY, bArrO0);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (zzkVar.zzbq()) {
                contentValues.put("retry_count", Integer.valueOf(zzkVar.zzg()));
            }
            try {
                if (l0().insert("queue", null, contentValues) == -1) {
                    zzj().f605f.d("Failed to insert bundle (got -1). appId", N.h0(zzkVar.zzz()));
                }
            } catch (SQLiteException e7) {
                N nZzj3 = zzj();
                nZzj3.f605f.b(N.h0(zzkVar.zzz()), "Error storing bundle. appId", e7);
            }
        } catch (IOException e10) {
            N nZzj4 = zzj();
            nZzj4.f605f.b(N.h0(zzkVar.zzz()), "Data loss. Failed to serialize bundle. appId", e10);
        }
    }

    public final void C0(Long l10) throws SQLException {
        c0();
        h0();
        if ((!zzpu.zza() || ((C0273n0) this.f421a).f979g.o0(null, AbstractC0304y.B0)) && Q0()) {
            if (T0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l10 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().f608i.c("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                l0().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l10 + " AND retry_count < 2147483647");
            } catch (SQLiteException e7) {
                zzj().f605f.d("Error incrementing retry count. error", e7);
            }
        }
    }

    public final void D0(String str, C0289t c0289t) {
        AbstractC1732v.i(c0289t);
        c0();
        h0();
        ContentValues contentValues = new ContentValues();
        String str2 = c0289t.f1051a;
        contentValues.put("app_id", str2);
        contentValues.put(MediationMetaData.KEY_NAME, c0289t.f1052b);
        contentValues.put("lifetime_count", Long.valueOf(c0289t.f1053c));
        contentValues.put("current_bundle_count", Long.valueOf(c0289t.f1054d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c0289t.f1056f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c0289t.f1057g));
        contentValues.put("last_bundled_day", c0289t.f1058h);
        contentValues.put("last_sampled_complex_event_id", c0289t.f1059i);
        contentValues.put("last_sampling_rate", c0289t.f1060j);
        contentValues.put("current_session_count", Long.valueOf(c0289t.f1055e));
        Boolean bool = c0289t.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (l0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().f605f.d("Failed to insert/update event aggregates (got -1). appId", N.h0(str2));
            }
        } catch (SQLiteException e7) {
            zzj().f605f.b(N.h0(str2), "Error storing event aggregates. appId", e7);
        }
    }

    public final void E0(String str, F0 f02) {
        AbstractC1732v.i(str);
        c0();
        h0();
        W0(str, g1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", f02.m());
        z0(contentValues);
    }

    public final void F0(String str, E1 e12) {
        c0();
        h0();
        AbstractC1732v.f(str);
        ((C0273n0) this.f421a).f985n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        D d3 = AbstractC0304y.f1190i0;
        long jLongValue = jCurrentTimeMillis - ((Long) d3.a(null)).longValue();
        long j8 = e12.f488b;
        if (j8 < jLongValue || j8 > ((Long) d3.a(null)).longValue() + jCurrentTimeMillis) {
            N nZzj = zzj();
            nZzj.f608i.a(N.h0(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j8), "Storing trigger URI outside of the max retention time span. appId, now, timestamp");
        }
        zzj().f612n.c("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", e12.f487a);
        contentValues.put("source", Integer.valueOf(e12.f489c));
        contentValues.put("timestamp_millis", Long.valueOf(j8));
        try {
            if (l0().insert("trigger_uris", null, contentValues) == -1) {
                zzj().f605f.d("Failed to insert trigger URI (got -1). appId", N.h0(str));
            }
        } catch (SQLiteException e7) {
            N nZzj2 = zzj();
            nZzj2.f605f.b(N.h0(str), "Error storing trigger URI. appId", e7);
        }
    }

    public final void G0(String str, Bundle bundle) {
        AbstractC1732v.i(bundle);
        c0();
        h0();
        String str2 = str;
        C0266l c0266l = new C0266l(this, str);
        List<C0260j> listA = c0266l.a();
        while (!listA.isEmpty()) {
            for (C0260j c0260j : listA) {
                S1 s1E0 = e0();
                zzfy.zzf zzfVar = c0260j.f913d;
                Bundle bundle2 = new Bundle();
                for (zzfy.zzh zzhVar : zzfVar.zzh()) {
                    if (zzhVar.zzj()) {
                        bundle2.putDouble(zzhVar.zzg(), zzhVar.zza());
                    } else if (zzhVar.zzk()) {
                        bundle2.putFloat(zzhVar.zzg(), zzhVar.zzb());
                    } else if (zzhVar.zzl()) {
                        bundle2.putLong(zzhVar.zzg(), zzhVar.zzd());
                    } else if (zzhVar.zzn()) {
                        bundle2.putString(zzhVar.zzg(), zzhVar.zzh());
                    } else if (zzhVar.zzi().isEmpty()) {
                        s1E0.zzj().f605f.d("Unexpected parameter type for parameter", zzhVar);
                    } else {
                        bundle2.putParcelableArray(zzhVar.zzg(), S1.P0(zzhVar.zzi()));
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                zzfVar.zzg();
                if (string == null) {
                    string = "";
                }
                zzfVar.zzd();
                b0().x0(bundle2, bundle);
                zzfy.zzf zzfVar2 = c0260j.f913d;
                C0292u c0292u = new C0292u((C0273n0) this.f421a, string, str2, zzfVar2.zzg(), zzfVar2.zzd(), zzfVar2.zzc(), bundle2);
                long j8 = c0260j.f910a;
                c0();
                h0();
                String str3 = (String) c0292u.f1071d;
                AbstractC1732v.f(str3);
                byte[] bArrZzca = e0().r0(c0292u).zzca();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put(MediationMetaData.KEY_NAME, (String) c0292u.f1072e);
                contentValues.put("timestamp", Long.valueOf(c0292u.f1069b));
                contentValues.put("metadata_fingerprint", Long.valueOf(c0260j.f911b));
                contentValues.put(JsonStorageKeyNames.DATA_KEY, bArrZzca);
                contentValues.put("realtime", Integer.valueOf(c0260j.f912c ? 1 : 0));
                try {
                    long jUpdate = l0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j8)});
                    if (jUpdate != 1) {
                        zzj().f605f.b(N.h0(str3), "Failed to update raw event. appId, updatedRows", Long.valueOf(jUpdate));
                    }
                } catch (SQLiteException e7) {
                    zzj().f605f.b(N.h0(str3), "Error updating raw event. appId", e7);
                }
                str2 = str;
            }
            listA = c0266l.a();
            str2 = str;
        }
    }

    public final void H0(String str, zzfy.zzj zzjVar, String str2, Map map, int i5) {
        int iDelete;
        c0();
        h0();
        AbstractC1732v.i(zzjVar);
        AbstractC1732v.f(str);
        boolean zZza = zzpu.zza();
        C0273n0 c0273n0 = (C0273n0) this.f421a;
        if (!zZza || c0273n0.f979g.o0(null, AbstractC0304y.B0)) {
            c0();
            h0();
            if (Q0()) {
                L1 l12 = this.f509b;
                long jD = l12.f575i.f1098f.d();
                c0273n0.f985n.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (Math.abs(jElapsedRealtime - jD) > ((Long) AbstractC0304y.f1117A.a(null)).longValue()) {
                    l12.f575i.f1098f.f(jElapsedRealtime);
                    c0();
                    h0();
                    if (Q0() && (iDelete = l0().delete("upload_queue", R0(), new String[0])) > 0) {
                        zzj().f612n.d("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            byte[] bArrZzca = zzjVar.zzca();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", bArrZzca);
            contentValues.put("upload_uri", str2);
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            if (size > 0) {
                sb2.append((CharSequence) arrayList.get(0));
                int i10 = 1;
                while (i10 < size) {
                    sb2.append((CharSequence) "\r\n");
                    Object obj = arrayList.get(i10);
                    i10++;
                    sb2.append((CharSequence) obj);
                }
            }
            contentValues.put("upload_headers", sb2.toString());
            contentValues.put("upload_type", Integer.valueOf(AbstractC0213f.f(i5)));
            c0273n0.f985n.getClass();
            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry_count", (Integer) 0);
            try {
                if (l0().insert("upload_queue", null, contentValues) == -1) {
                    zzj().f605f.d("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
                }
            } catch (SQLiteException e7) {
                zzj().f605f.b(str, "Error storing MeasurementBatch to upload_queue. appId", e7);
            }
        }
    }

    public final void I0(String str, Long l10, long j8, zzfy.zzf zzfVar) {
        c0();
        h0();
        AbstractC1732v.i(zzfVar);
        AbstractC1732v.f(str);
        byte[] bArrZzca = zzfVar.zzca();
        N nZzj = zzj();
        nZzj.f612n.b(((C0273n0) this.f421a).f984m.c(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrZzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j8));
        contentValues.put("main_event", bArrZzca);
        try {
            if (l0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                zzj().f605f.d("Failed to insert complex main event (got -1). appId", N.h0(str));
            }
        } catch (SQLiteException e7) {
            N nZzj2 = zzj();
            nZzj2.f605f.b(N.h0(str), "Error storing complex main event. appId", e7);
        }
    }

    public final void J0(String str, String str2) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        c0();
        h0();
        try {
            l0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            N nZzj = zzj();
            nZzj.f605f.a(N.h0(str), ((C0273n0) this.f421a).f984m.g(str2), e7, "Error deleting conditional property");
        }
    }

    public final void K0(List list) throws SQLException {
        c0();
        h0();
        AbstractC1732v.i(list);
        if (((ArrayList) list).size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (Q0()) {
            String strL = AbstractC0279p0.l("(", TextUtils.join(",", list), ")");
            if (T0("SELECT COUNT(1) FROM queue WHERE rowid IN " + strL + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().f608i.c("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                l0().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strL + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e7) {
                zzj().f605f.d("Error incrementing retry count. error", e7);
            }
        }
    }

    public final boolean L0(C0242d c0242d) {
        c0();
        h0();
        String str = c0242d.f833a;
        AbstractC1732v.i(str);
        if (d1(str, c0242d.f835c.f681b) == null && T0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c0242d.f834b);
        contentValues.put(MediationMetaData.KEY_NAME, c0242d.f835c.f681b);
        Object objZza = c0242d.f835c.zza();
        AbstractC1732v.i(objZza);
        A0(contentValues, objZza);
        contentValues.put("active", Boolean.valueOf(c0242d.f837e));
        contentValues.put("trigger_event_name", c0242d.f838f);
        contentValues.put("trigger_timeout", Long.valueOf(c0242d.f840h));
        b0();
        contentValues.put("timed_out_event", U1.T0(c0242d.f839g));
        contentValues.put("creation_timestamp", Long.valueOf(c0242d.f836d));
        b0();
        contentValues.put("triggered_event", U1.T0(c0242d.f841i));
        contentValues.put("triggered_timestamp", Long.valueOf(c0242d.f835c.f682c));
        contentValues.put("time_to_live", Long.valueOf(c0242d.f842j));
        b0();
        contentValues.put("expired_event", U1.T0(c0242d.k));
        try {
            if (l0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f605f.d("Failed to insert/update conditional user property (got -1)", N.h0(str));
            return true;
        } catch (SQLiteException e7) {
            N nZzj = zzj();
            nZzj.f605f.b(N.h0(str), "Error storing conditional user property", e7);
            return true;
        }
    }

    public final boolean M0(C0292u c0292u, long j8, boolean z2) {
        c0();
        h0();
        String str = (String) c0292u.f1071d;
        AbstractC1732v.f(str);
        byte[] bArrZzca = e0().r0(c0292u).zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(MediationMetaData.KEY_NAME, (String) c0292u.f1072e);
        contentValues.put("timestamp", Long.valueOf(c0292u.f1069b));
        contentValues.put("metadata_fingerprint", Long.valueOf(j8));
        contentValues.put(JsonStorageKeyNames.DATA_KEY, bArrZzca);
        contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
        try {
            if (l0().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().f605f.d("Failed to insert raw event (got -1). appId", N.h0(str));
            return false;
        } catch (SQLiteException e7) {
            N nZzj = zzj();
            nZzj.f605f.b(N.h0(str), "Error storing raw event. appId", e7);
            return false;
        }
    }

    public final boolean N0(T1 t12) {
        c0();
        h0();
        String str = t12.f701a;
        String str2 = t12.f703c;
        T1 t1D1 = d1(str, str2);
        String str3 = t12.f702b;
        if (t1D1 == null) {
            if (U1.k1(str2)) {
                if (T0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(((C0273n0) this.f421a).f979g.i0(str, AbstractC0304y.f1134J), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2) && T0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put(MediationMetaData.KEY_NAME, str2);
        contentValues.put("set_timestamp", Long.valueOf(t12.f704d));
        A0(contentValues, t12.f705e);
        try {
            if (l0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f605f.d("Failed to insert/update user property (got -1). appId", N.h0(str));
            return true;
        } catch (SQLiteException e7) {
            zzj().f605f.b(N.h0(str), "Error storing user property. appId", e7);
            return true;
        }
    }

    public final boolean O0(String str, int i5, zzfo.zzb zzbVar) {
        h0();
        c0();
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().f608i.a(N.h0(str), Integer.valueOf(i5), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null), "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId");
            return false;
        }
        byte[] bArrZzca = zzbVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i5));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put(JsonStorageKeyNames.DATA_KEY, bArrZzca);
        try {
            if (l0().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f605f.d("Failed to insert event filter (got -1). appId", N.h0(str));
            return true;
        } catch (SQLiteException e7) {
            zzj().f605f.b(N.h0(str), "Error storing event filter. appId", e7);
            return false;
        }
    }

    public final boolean P0(String str, int i5, zzfo.zze zzeVar) {
        h0();
        c0();
        AbstractC1732v.f(str);
        AbstractC1732v.i(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().f608i.a(N.h0(str), Integer.valueOf(i5), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null), "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId");
            return false;
        }
        byte[] bArrZzca = zzeVar.zzca();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i5));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put(JsonStorageKeyNames.DATA_KEY, bArrZzca);
        try {
            if (l0().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().f605f.d("Failed to insert property filter (got -1). appId", N.h0(str));
            return false;
        } catch (SQLiteException e7) {
            zzj().f605f.b(N.h0(str), "Error storing property filter. appId", e7);
            return false;
        }
    }

    public final boolean Q0() {
        return ((C0273n0) this.f421a).f973a.getDatabasePath("google_app_measurement.db").exists();
    }

    public final String R0() {
        ((C0273n0) this.f421a).f985n.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        return R8.v.g("(", M6.s(M6.u(jCurrentTimeMillis, "(upload_type = 1 AND (ABS(creation_timestamp - ", ") > CAST("), ((Long) AbstractC0304y.f1128G.a(null)).longValue(), " AS INTEGER)))"), " OR ", M6.s(M6.u(jCurrentTimeMillis, "(upload_type != 1 AND (ABS(creation_timestamp - ", ") > CAST("), ((Long) AbstractC0304y.f1126F.a(null)).longValue(), " AS INTEGER)))"), ")");
    }

    public final long S0(String str) {
        AbstractC1732v.f(str);
        AbstractC1732v.f("first_open_count");
        c0();
        h0();
        SQLiteDatabase sQLiteDatabaseL0 = l0();
        sQLiteDatabaseL0.beginTransaction();
        long j8 = 0;
        try {
            try {
                long jP0 = p0("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jP0 == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseL0.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().f605f.b(N.h0(str), "Failed to insert column (got -1). appId", "first_open_count");
                        return -1L;
                    }
                    jP0 = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jP0));
                    if (sQLiteDatabaseL0.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().f605f.b(N.h0(str), "Failed to update column (got 0). appId", "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseL0.setTransactionSuccessful();
                    return jP0;
                } catch (SQLiteException e7) {
                    long j10 = jP0;
                    e = e7;
                    j8 = j10;
                    zzj().f605f.a(N.h0(str), "first_open_count", e, "Error inserting column. appId");
                    return j8;
                }
            } finally {
                sQLiteDatabaseL0.endTransaction();
            }
        } catch (SQLiteException e10) {
            e = e10;
        }
    }

    public final long T0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = l0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j8 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e7) {
                zzj().f605f.b(str, "Database error", e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        zzj().f605f.d("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List U0(java.lang.String r18, java.lang.String r19, java.lang.String r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.U0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void V0(Bundle bundle, String str) {
        c0();
        h0();
        byte[] bArrZzca = e0().r0(new C0292u((C0273n0) this.f421a, "", str, "dep", 0L, 0L, bundle)).zzca();
        N nZzj = zzj();
        nZzj.f612n.b(((C0273n0) this.f421a).f984m.c(str), "Saving default event parameters, appId, data size", Integer.valueOf(bArrZzca.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrZzca);
        try {
            if (l0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                zzj().f605f.d("Failed to insert default event parameters (got -1). appId", N.h0(str));
            }
        } catch (SQLiteException e7) {
            N nZzj2 = zzj();
            nZzj2.f605f.b(N.h0(str), "Error storing default event parameters. appId", e7);
        }
    }

    public final void W0(String str, F0 f02) {
        AbstractC1732v.i(str);
        AbstractC1732v.i(f02);
        c0();
        h0();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", f02.m());
        contentValues.put("consent_source", Integer.valueOf(f02.f492b));
        z0(contentValues);
    }

    public final void X0(String str, ArrayList arrayList) {
        AbstractC1732v.f(str);
        h0();
        c0();
        SQLiteDatabase sQLiteDatabaseL0 = l0();
        try {
            long jT0 = T0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, ((C0273n0) this.f421a).f979g.i0(str, AbstractC0304y.f1132I)));
            if (jT0 <= iMax) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                Integer num = (Integer) arrayList.get(i5);
                if (num == null) {
                    return;
                }
                arrayList2.add(Integer.toString(num.intValue()));
            }
            sQLiteDatabaseL0.delete("audience_filter_values", AbstractC0279p0.l("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ", AbstractC0279p0.l("(", TextUtils.join(",", arrayList2), ")"), " order by rowid desc limit -1 offset ?)"), new String[]{str, Integer.toString(iMax)});
        } catch (SQLiteException e7) {
            zzj().f605f.b(N.h0(str), "Database error querying filters. appId", e7);
        }
    }

    public final long Y0(String str) {
        AbstractC1732v.f(str);
        c0();
        h0();
        return p0("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    public final long Z0(String str) {
        AbstractC1732v.f(str);
        return p0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0059: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:90), block:B:14:0x0059 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A7.C0242d a1(java.lang.String r27, java.lang.String r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.a1(java.lang.String, java.lang.String):A7.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0132  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A7.C0289t b1(java.lang.String r29, java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.b1(java.lang.String, java.lang.String, java.lang.String):A7.t");
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0441  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A7.E c1(java.lang.String r51) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.c1(java.lang.String):A7.E");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A7.T1 d1(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.AbstractC1732v.f(r11)
            com.google.android.gms.common.internal.AbstractC1732v.f(r12)
            r10.c0()
            r10.h0()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r10.l0()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r3 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r4 = new java.lang.String[]{r0, r4, r5}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            java.lang.String r5 = "app_id=? and name=?"
            java.lang.String[] r6 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            r9 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteException -> L78
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            if (r0 != 0) goto L34
            r2.close()
            return r1
        L34:
            r0 = 0
            long r7 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            r0 = 1
            java.lang.Object r9 = r10.s0(r2, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            if (r9 != 0) goto L44
            r2.close()
            return r1
        L44:
            r0 = 2
            java.lang.String r5 = r2.getString(r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            A7.T1 r3 = new A7.T1     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L71
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            if (r11 == 0) goto L6d
            A7.N r11 = r10.zzj()     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            A7.P r11 = r11.f605f     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r12 = "Got multiple records for user property, expected one. appId"
            A7.O r0 = A7.N.h0(r4)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            r11.d(r12, r0)     // Catch: java.lang.Throwable -> L66 android.database.sqlite.SQLiteException -> L6a
            goto L6d
        L66:
            r0 = move-exception
            r11 = r0
            r1 = r2
            goto L9c
        L6a:
            r0 = move-exception
        L6b:
            r11 = r0
            goto L7d
        L6d:
            r2.close()
            return r3
        L71:
            r0 = move-exception
            r4 = r11
            r6 = r12
            goto L6b
        L75:
            r0 = move-exception
            r11 = r0
            goto L9c
        L78:
            r0 = move-exception
            r4 = r11
            r6 = r12
            r11 = r0
            r2 = r1
        L7d:
            A7.N r12 = r10.zzj()     // Catch: java.lang.Throwable -> L66
            A7.P r12 = r12.f605f     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "Error querying user property. appId"
            A7.O r3 = A7.N.h0(r4)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r4 = r10.f421a     // Catch: java.lang.Throwable -> L66
            A7.n0 r4 = (A7.C0273n0) r4     // Catch: java.lang.Throwable -> L66
            A7.J r4 = r4.f984m     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = r4.g(r6)     // Catch: java.lang.Throwable -> L66
            r12.a(r3, r4, r11, r0)     // Catch: java.lang.Throwable -> L66
            if (r2 == 0) goto L9b
            r2.close()
        L9b:
            return r1
        L9c:
            if (r1 == 0) goto La1
            r1.close()
        La1:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.d1(java.lang.String, java.lang.String):A7.T1");
    }

    public final F0 e1(String str) {
        AbstractC1732v.i(str);
        c0();
        h0();
        return F0.c(100, u0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    public final void f1(String str, String str2) {
        AbstractC1732v.f(str);
        AbstractC1732v.f(str2);
        c0();
        h0();
        try {
            l0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e7) {
            N nZzj = zzj();
            nZzj.f605f.a(N.h0(str), ((C0273n0) this.f421a).f984m.g(str2), e7, "Error deleting user property. appId");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final A7.F0 g1(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.AbstractC1732v.i(r5)
            r4.c0()
            r4.h0()
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.l0()     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L44 android.database.sqlite.SQLiteException -> L46
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            if (r0 != 0) goto L32
            A7.N r0 = r4.zzj()     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            A7.P r0 = r0.f612n     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            java.lang.String r2 = "No data found"
            r0.c(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r5.close()
            goto L58
        L2d:
            r0 = move-exception
            r1 = r5
            goto L5e
        L30:
            r0 = move-exception
            goto L48
        L32:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            A7.F0 r1 = A7.F0.c(r2, r0)     // Catch: java.lang.Throwable -> L2d android.database.sqlite.SQLiteException -> L30
            r5.close()
            goto L58
        L44:
            r0 = move-exception
            goto L5e
        L46:
            r0 = move-exception
            r5 = r1
        L48:
            A7.N r2 = r4.zzj()     // Catch: java.lang.Throwable -> L2d
            A7.P r2 = r2.f605f     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "Error querying database."
            r2.d(r3, r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto L58
            r5.close()
        L58:
            if (r1 != 0) goto L5d
            A7.F0 r5 = A7.F0.f490c
            return r5
        L5d:
            return r1
        L5e:
            if (r1 == 0) goto L63
            r1.close()
        L63:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.g1(java.lang.String):A7.F0");
    }

    public final void h1(String str, String str2) {
        AbstractC1732v.f(str2);
        c0();
        h0();
        try {
            l0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e7) {
            N nZzj = zzj();
            nZzj.f605f.b(N.h0(str2), "Error deleting snapshot. appId", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final P1 i1(String str) throws Throwable {
        P1 p12;
        Cursor cursorQuery;
        P1 p13;
        Cursor cursor;
        AbstractC1732v.f(str);
        c0();
        h0();
        Cursor cursor2 = null;
        if (zzpu.zza() && !((C0273n0) this.f421a).f979g.o0(null, AbstractC0304y.B0)) {
            return null;
        }
        try {
            cursorQuery = l0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + R0(), new String[]{str}, null, null, "creation_timestamp ASC", UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(3);
                    try {
                        if (TextUtils.isEmpty(string)) {
                            zzj().f611m.c("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                            cursorQuery.close();
                            return null;
                        }
                        try {
                            zzfy.zzj.zza zzaVar = (zzfy.zzj.zza) S1.t0(zzfy.zzj.zzb(), cursorQuery.getBlob(2));
                            int i5 = AbstractC0213f.g(3)[cursorQuery.getInt(5)];
                            if ((i5 == 3 || i5 == 1) && cursorQuery.getInt(6) > 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<zzfy.zzk> it = zzaVar.zzd().iterator();
                                while (it.hasNext()) {
                                    zzfy.zzk.zza zzaVarZzcd = it.next().zzcd();
                                    zzaVarZzcd.zzi(cursorQuery.getInt(6));
                                    arrayList.add((zzfy.zzk) ((zzjt) zzaVarZzcd.zzai()));
                                }
                                zzaVar.zzb();
                                zzaVar.zza(arrayList);
                            }
                            HashMap map = new HashMap();
                            String string2 = cursorQuery.getString(4);
                            if (string2 != null) {
                                String[] strArrSplit = string2.split("\r\n");
                                int length = strArrSplit.length;
                                int i10 = 0;
                                while (i10 < length) {
                                    String str2 = strArrSplit[i10];
                                    if (str2.isEmpty()) {
                                        break;
                                    }
                                    String[] strArrSplit2 = str2.split("=", 2);
                                    cursor = cursor2;
                                    try {
                                        if (strArrSplit2.length != 2) {
                                            zzj().f605f.d("Invalid upload header: ", str2);
                                            cursor = cursor;
                                            break;
                                        }
                                        map.put(strArrSplit2[0], strArrSplit2[1]);
                                        i10++;
                                        cursor2 = cursor;
                                    } catch (IOException e7) {
                                        e = e7;
                                        p13 = cursor;
                                        zzj().f605f.b(str, "Failed to queued MeasurementBatch from upload_queue. appId", e);
                                        cursorQuery.close();
                                        return p13;
                                    }
                                }
                                cursor = cursor2;
                            } else {
                                cursor = cursor2;
                            }
                            long j8 = cursorQuery.getLong(0);
                            zzfy.zzj zzjVar = (zzfy.zzj) ((zzjt) zzaVar.zzai());
                            P1 p14 = new P1();
                            p14.f669a = j8;
                            p14.f670b = zzjVar;
                            p14.f671c = string;
                            p14.f672d = map;
                            p14.f673e = i5;
                            cursorQuery.close();
                            return p14;
                        } catch (IOException e10) {
                            e = e10;
                            p13 = cursor2;
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        zzj().f605f.b(str, "Error to querying MeasurementBatch from upload_queue. appId", e);
                        if (cursorQuery == null) {
                            return p12;
                        }
                        cursorQuery.close();
                        return p12;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursorQuery;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e12) {
                e = e12;
                p12 = null;
            }
        } catch (SQLiteException e13) {
            e = e13;
            p12 = null;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // A7.G1
    public final boolean j0() {
        return false;
    }

    public final List j1(String str) {
        String str2;
        AbstractC1732v.f(str);
        c0();
        h0();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = l0().query("user_attributes", new String[]{MediationMetaData.KEY_NAME, "origin", "set_timestamp", MimeTypesReaderMetKeys.MATCH_VALUE_ATTR}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str3 = string2;
                    long j8 = cursorQuery.getLong(2);
                    Object objS0 = s0(cursorQuery, 3);
                    if (objS0 == null) {
                        zzj().f605f.d("Read invalid user property value, ignoring it. appId", N.h0(str));
                        str2 = str;
                    } else {
                        str2 = str;
                        try {
                            arrayList.add(new T1(str2, str3, string, j8, objS0));
                        } catch (SQLiteException e7) {
                            e = e7;
                            zzj().f605f.b(N.h0(str2), "Error querying user properties. appId", e);
                            List list = Collections.EMPTY_LIST;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return list;
                        }
                    }
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    str = str2;
                }
            } finally {
            }
        } catch (SQLiteException e10) {
            e = e10;
            str2 = str;
        }
    }

    public final long k0() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = l0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j8 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j8;
            } catch (SQLiteException e7) {
                zzj().f605f.d("Error querying raw events", e7);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void k1() {
        h0();
        l0().beginTransaction();
    }

    public final SQLiteDatabase l0() {
        c0();
        try {
            return this.f897d.getWritableDatabase();
        } catch (SQLiteException e7) {
            zzj().f608i.d("Error opening database", e7);
            throw e7;
        }
    }

    public final void l1(String str) throws SQLException {
        c0();
        h0();
        try {
            l0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e7) {
            zzj().f605f.d("Error clearing default event params", e7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m0() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.l0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L27
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L1e
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L3a
        L1c:
            r2 = move-exception
            goto L29
        L1e:
            r0.close()
            return r1
        L22:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3a
        L27:
            r2 = move-exception
            r0 = r1
        L29:
            A7.N r3 = r6.zzj()     // Catch: java.lang.Throwable -> L1a
            A7.P r3 = r3.f605f     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.d(r4, r2)     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.m0():java.lang.String");
    }

    public final void m1(String str) {
        C0289t c0289tB1;
        h1("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = l0().query("events", (String[]) Collections.singletonList(MediationMetaData.KEY_NAME).toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (c0289tB1 = b1("events", str, string)) != null) {
                        D0("events_snapshot", c0289tB1);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e7) {
                zzj().f605f.b(N.h0(str), "Error creating snapshot. appId", e7);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } finally {
        }
    }

    public final long n0(zzfy.zzk zzkVar) {
        c0();
        h0();
        AbstractC1732v.i(zzkVar);
        AbstractC1732v.f(zzkVar.zzz());
        byte[] bArrZzca = zzkVar.zzca();
        long jL0 = e0().l0(bArrZzca);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzkVar.zzz());
        contentValues.put("metadata_fingerprint", Long.valueOf(jL0));
        contentValues.put(ExternalParsersConfigReaderMetKeys.METADATA_TAG, bArrZzca);
        try {
            l0().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jL0;
        } catch (SQLiteException e7) {
            N nZzj = zzj();
            nZzj.f605f.b(N.h0(zzkVar.zzz()), "Error storing raw event metadata. appId", e7);
            throw e7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n1(java.lang.String r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.n1(java.lang.String):void");
    }

    public final long o0(String str) {
        AbstractC1732v.f(str);
        c0();
        h0();
        try {
            return l0().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, ((C0273n0) this.f421a).f979g.i0(str, AbstractC0304y.f1208q))))});
        } catch (SQLiteException e7) {
            zzj().f605f.b(N.h0(str), "Error deleting over the limit events. appId", e7);
            return 0L;
        }
    }

    public final boolean o1(String str) {
        return (!zzpu.zza() || ((C0273n0) this.f421a).f979g.o0(null, AbstractC0304y.B0)) && T0(R8.v.f("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ", R0()), new String[]{str}) != 0;
    }

    public final long p0(String str, String[] strArr, long j8) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = l0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j8;
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e7) {
                zzj().f605f.b(str, "Database error", e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void p1() {
        h0();
        l0().endTransaction();
    }

    public final C0263k q0(long j8, String str, long j10, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        AbstractC1732v.f(str);
        c0();
        h0();
        String[] strArr = {str};
        C0263k c0263k = new C0263k();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseL0 = l0();
                Cursor cursorQuery = sQLiteDatabaseL0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzj().f608i.d("Not updating daily counts, app is not known. appId", N.h0(str));
                    cursorQuery.close();
                    return c0263k;
                }
                if (cursorQuery.getLong(0) == j8) {
                    c0263k.f924b = cursorQuery.getLong(1);
                    c0263k.f923a = cursorQuery.getLong(2);
                    c0263k.f925c = cursorQuery.getLong(3);
                    c0263k.f926d = cursorQuery.getLong(4);
                    c0263k.f927e = cursorQuery.getLong(5);
                    c0263k.f928f = cursorQuery.getLong(6);
                    c0263k.f929g = cursorQuery.getLong(7);
                }
                if (z2) {
                    c0263k.f924b += j10;
                }
                if (z10) {
                    c0263k.f923a += j10;
                }
                if (z11) {
                    c0263k.f925c += j10;
                }
                if (z12) {
                    c0263k.f926d += j10;
                }
                if (z13) {
                    c0263k.f927e += j10;
                }
                if (z14) {
                    c0263k.f928f += j10;
                }
                if (z15) {
                    c0263k.f929g += j10;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j8));
                contentValues.put("daily_public_events_count", Long.valueOf(c0263k.f923a));
                contentValues.put("daily_events_count", Long.valueOf(c0263k.f924b));
                contentValues.put("daily_conversions_count", Long.valueOf(c0263k.f925c));
                contentValues.put("daily_error_events_count", Long.valueOf(c0263k.f926d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c0263k.f927e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(c0263k.f928f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(c0263k.f929g));
                sQLiteDatabaseL0.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c0263k;
            } catch (SQLiteException e7) {
                zzj().f605f.b(N.h0(str), "Error updating daily counts. appId", e7);
                if (0 != 0) {
                    cursor.close();
                }
                return c0263k;
            }
        } finally {
        }
    }

    public final void q1() {
        c0();
        h0();
        if (Q0()) {
            L1 l12 = this.f509b;
            long jD = l12.f575i.f1097e.d();
            C0273n0 c0273n0 = (C0273n0) this.f421a;
            c0273n0.f985n.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jD) > ((Long) AbstractC0304y.f1117A.a(null)).longValue()) {
                l12.f575i.f1097e.f(jElapsedRealtime);
                c0();
                h0();
                if (Q0()) {
                    SQLiteDatabase sQLiteDatabaseL0 = l0();
                    c0273n0.f985n.getClass();
                    int iDelete = sQLiteDatabaseL0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) AbstractC0304y.f1126F.a(null)).longValue())});
                    if (iDelete > 0) {
                        N nZzj = zzj();
                        nZzj.f612n.d("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    public final C0263k r0(long j8, String str, boolean z2, boolean z10, boolean z11, boolean z12) {
        return q0(j8, str, 1L, false, false, z2, false, z10, z11, z12);
    }

    public final void r1() {
        h0();
        l0().setTransactionSuccessful();
    }

    public final Object s0(Cursor cursor, int i5) {
        int type = cursor.getType(i5);
        if (type == 0) {
            zzj().f605f.c("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i5));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i5));
        }
        if (type == 3) {
            return cursor.getString(i5);
        }
        if (type == 4) {
            zzj().f605f.c("Loaded invalid blob type value, ignoring it");
            return null;
        }
        N nZzj = zzj();
        nZzj.f605f.d("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String t0(long r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r3.c0()
            r3.h0()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r3.l0()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r4 = r1.rawQuery(r2, r4)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r5 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            if (r5 != 0) goto L33
            A7.N r5 = r3.zzj()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            A7.P r5 = r5.f612n     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            java.lang.String r1 = "No expired configs for apps with pending events"
            r5.c(r1)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r0
        L2e:
            r5 = move-exception
            r0 = r4
            goto L51
        L31:
            r5 = move-exception
            goto L40
        L33:
            r5 = 0
            java.lang.String r5 = r4.getString(r5)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteException -> L31
            r4.close()
            return r5
        L3c:
            r5 = move-exception
            goto L51
        L3e:
            r5 = move-exception
            r4 = r0
        L40:
            A7.N r1 = r3.zzj()     // Catch: java.lang.Throwable -> L2e
            A7.P r1 = r1.f605f     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "Error selecting expired configs"
            r1.d(r2, r5)     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L50
            r4.close()
        L50:
            return r0
        L51:
            if (r0 == 0) goto L56
            r0.close()
        L56:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.t0(long):java.lang.String");
    }

    public final String u0(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = l0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e7) {
                zzj().f605f.b(str, "Database error", e7);
                throw e7;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final List v0(int i5, int i10, String str) {
        byte[] bArrQ0;
        long jZzc;
        long jZzc2;
        c0();
        h0();
        int i11 = 1;
        AbstractC1732v.b(i5 > 0);
        AbstractC1732v.b(i10 > 0);
        AbstractC1732v.f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = l0().query("queue", new String[]{"rowid", JsonStorageKeyNames.DATA_KEY, "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i5));
                if (!cursorQuery.moveToFirst()) {
                    List list = Collections.EMPTY_LIST;
                    cursorQuery.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j8 = cursorQuery.getLong(0);
                    try {
                        bArrQ0 = e0().Q0(cursorQuery.getBlob(i11));
                    } catch (IOException e7) {
                        zzj().f605f.b(N.h0(str), "Failed to unzip queued bundle. appId", e7);
                    }
                    if (!arrayList.isEmpty() && bArrQ0.length + length > i10) {
                        break;
                    }
                    try {
                        zzfy.zzk.zza zzaVar = (zzfy.zzk.zza) S1.t0(zzfy.zzk.zzw(), bArrQ0);
                        if (!arrayList.isEmpty()) {
                            zzfy.zzk zzkVar = (zzfy.zzk) ((Pair) arrayList.get(0)).first;
                            zzfy.zzk zzkVar2 = (zzfy.zzk) ((zzjt) zzaVar.zzai());
                            if (!zzkVar.zzae().equals(zzkVar2.zzae()) || !zzkVar.zzad().equals(zzkVar2.zzad()) || zzkVar.zzau() != zzkVar2.zzau() || !zzkVar.zzaf().equals(zzkVar2.zzaf())) {
                                break;
                            }
                            Iterator<zzfy.zzo> it = zzkVar.zzas().iterator();
                            while (true) {
                                jZzc = -1;
                                if (!it.hasNext()) {
                                    jZzc2 = -1;
                                    break;
                                }
                                zzfy.zzo next = it.next();
                                if ("_npa".equals(next.zzg())) {
                                    jZzc2 = next.zzc();
                                    break;
                                }
                            }
                            Iterator<zzfy.zzo> it2 = zzkVar2.zzas().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                zzfy.zzo next2 = it2.next();
                                if ("_npa".equals(next2.zzg())) {
                                    jZzc = next2.zzc();
                                    break;
                                }
                            }
                            if (jZzc2 != jZzc) {
                                break;
                            }
                        }
                        if (!cursorQuery.isNull(2)) {
                            zzaVar.zzi(cursorQuery.getInt(2));
                        }
                        length += bArrQ0.length;
                        arrayList.add(Pair.create((zzfy.zzk) ((zzjt) zzaVar.zzai()), Long.valueOf(j8)));
                    } catch (IOException e10) {
                        zzj().f605f.b(N.h0(str), "Failed to merge queued bundle. appId", e10);
                    }
                    if (!cursorQuery.moveToNext() || length > i10) {
                        break;
                    }
                    i11 = 1;
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e11) {
                zzj().f605f.b(N.h0(str), "Error querying bundles. appId", e11);
                List list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final List w0(String str, String str2, String str3) {
        AbstractC1732v.f(str);
        c0();
        h0();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return x0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0050, code lost:
    
        zzj().f605f.d("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List x0(java.lang.String r21, java.lang.String[] r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.x0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y0(A7.E r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 994
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.C0257i.y0(A7.E, boolean):void");
    }

    public final void z0(ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseL0 = l0();
            if (contentValues.getAsString("app_id") == null) {
                zzj().f607h.d("Value of the primary key is not set.", N.h0("app_id"));
            } else if (sQLiteDatabaseL0.update("consent_settings", contentValues, "app_id = ?", new String[]{r3}) == 0 && sQLiteDatabaseL0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzj().f605f.b(N.h0("consent_settings"), "Failed to insert/update table (got -1). key", N.h0("app_id"));
            }
        } catch (SQLiteException e7) {
            zzj().f605f.a(N.h0("consent_settings"), N.h0("app_id"), e7, "Error storing into table. key");
        }
    }
}
