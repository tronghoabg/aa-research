package S3;

import U8.v0;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import k3.C3185q;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public Object f10996a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10997b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10998c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10999d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11000e;

    /* renamed from: f, reason: collision with root package name */
    public Object f11001f;

    /* renamed from: g, reason: collision with root package name */
    public Object f11002g;

    /* renamed from: h, reason: collision with root package name */
    public Object f11003h;

    /* renamed from: i, reason: collision with root package name */
    public Object f11004i;

    /* renamed from: j, reason: collision with root package name */
    public Object f11005j;
    public Object k;

    public q(WorkDatabase_Impl workDatabase_Impl) {
        this.f10996a = workDatabase_Impl;
        this.f10997b = new b(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 8);
        this.f10998c = new h(workDatabase_Impl, 9);
        this.f10999d = new h(workDatabase_Impl, 10);
        this.f11000e = new h(workDatabase_Impl, 11);
        this.f11001f = new h(workDatabase_Impl, 12);
        this.f11002g = new h(workDatabase_Impl, 13);
        this.f11003h = new h(workDatabase_Impl, 14);
        this.f11004i = new h(workDatabase_Impl, 15);
        this.f11005j = new h(workDatabase_Impl, 4);
        this.k = new h(workDatabase_Impl, 5);
        new h(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 7);
    }

    public ArrayList a() throws Throwable {
        C3185q c3185q;
        C3185q c3185qD = C3185q.d(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        c3185qD.G(1, 200);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            int iK = v0.K(cursorL, "id");
            int iK2 = v0.K(cursorL, "state");
            int iK3 = v0.K(cursorL, "worker_class_name");
            int iK4 = v0.K(cursorL, "input_merger_class_name");
            int iK5 = v0.K(cursorL, "input");
            int iK6 = v0.K(cursorL, "output");
            int iK7 = v0.K(cursorL, "initial_delay");
            int iK8 = v0.K(cursorL, "interval_duration");
            int iK9 = v0.K(cursorL, "flex_duration");
            int iK10 = v0.K(cursorL, "run_attempt_count");
            int iK11 = v0.K(cursorL, "backoff_policy");
            int iK12 = v0.K(cursorL, "backoff_delay_duration");
            int iK13 = v0.K(cursorL, "last_enqueue_time");
            c3185q = c3185qD;
            try {
                int iK14 = v0.K(cursorL, "minimum_retention_duration");
                int iK15 = v0.K(cursorL, "schedule_requested_at");
                int iK16 = v0.K(cursorL, "run_in_foreground");
                int iK17 = v0.K(cursorL, "out_of_quota_policy");
                int iK18 = v0.K(cursorL, "period_count");
                int iK19 = v0.K(cursorL, "generation");
                int iK20 = v0.K(cursorL, "required_network_type");
                int iK21 = v0.K(cursorL, "requires_charging");
                int iK22 = v0.K(cursorL, "requires_device_idle");
                int iK23 = v0.K(cursorL, "requires_battery_not_low");
                int iK24 = v0.K(cursorL, "requires_storage_not_low");
                int iK25 = v0.K(cursorL, "trigger_content_update_delay");
                int iK26 = v0.K(cursorL, "trigger_max_content_delay");
                int iK27 = v0.K(cursorL, "content_uri_triggers");
                int i5 = iK14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iK) ? null : cursorL.getString(iK);
                    int iM = Fe.e.M(cursorL.getInt(iK2));
                    String string2 = cursorL.isNull(iK3) ? null : cursorL.getString(iK3);
                    String string3 = cursorL.isNull(iK4) ? null : cursorL.getString(iK4);
                    J3.h hVarA = J3.h.a(cursorL.isNull(iK5) ? null : cursorL.getBlob(iK5));
                    J3.h hVarA2 = J3.h.a(cursorL.isNull(iK6) ? null : cursorL.getBlob(iK6));
                    long j8 = cursorL.getLong(iK7);
                    long j10 = cursorL.getLong(iK8);
                    long j11 = cursorL.getLong(iK9);
                    int i10 = cursorL.getInt(iK10);
                    int iJ = Fe.e.J(cursorL.getInt(iK11));
                    long j12 = cursorL.getLong(iK12);
                    long j13 = cursorL.getLong(iK13);
                    int i11 = i5;
                    long j14 = cursorL.getLong(i11);
                    int i12 = iK;
                    int i13 = iK15;
                    long j15 = cursorL.getLong(i13);
                    iK15 = i13;
                    int i14 = iK16;
                    boolean z2 = cursorL.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    int iL = Fe.e.L(cursorL.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorL.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorL.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    int iK28 = Fe.e.K(cursorL.getInt(i20));
                    iK20 = i20;
                    int i21 = iK21;
                    boolean z10 = cursorL.getInt(i21) != 0;
                    iK21 = i21;
                    int i22 = iK22;
                    boolean z11 = cursorL.getInt(i22) != 0;
                    iK22 = i22;
                    int i23 = iK23;
                    boolean z12 = cursorL.getInt(i23) != 0;
                    iK23 = i23;
                    int i24 = iK24;
                    boolean z13 = cursorL.getInt(i24) != 0;
                    iK24 = i24;
                    int i25 = iK25;
                    long j16 = cursorL.getLong(i25);
                    iK25 = i25;
                    int i26 = iK26;
                    long j17 = cursorL.getLong(i26);
                    iK26 = i26;
                    int i27 = iK27;
                    if (!cursorL.isNull(i27)) {
                        blob = cursorL.getBlob(i27);
                    }
                    iK27 = i27;
                    arrayList.add(new p(string, iM, string2, string3, hVarA, hVarA2, j8, j10, j11, new J3.d(iK28, z10, z11, z12, z13, j16, j17, Fe.e.m(blob)), i10, iJ, j12, j13, j14, j15, z2, iL, i17, i19));
                    iK = i12;
                    i5 = i11;
                }
                cursorL.close();
                c3185q.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                c3185q.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c3185q = c3185qD;
        }
    }

    public ArrayList b(int i5) throws Throwable {
        C3185q c3185q;
        C3185q c3185qD = C3185q.d(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        c3185qD.G(1, i5);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            int iK = v0.K(cursorL, "id");
            int iK2 = v0.K(cursorL, "state");
            int iK3 = v0.K(cursorL, "worker_class_name");
            int iK4 = v0.K(cursorL, "input_merger_class_name");
            int iK5 = v0.K(cursorL, "input");
            int iK6 = v0.K(cursorL, "output");
            int iK7 = v0.K(cursorL, "initial_delay");
            int iK8 = v0.K(cursorL, "interval_duration");
            int iK9 = v0.K(cursorL, "flex_duration");
            int iK10 = v0.K(cursorL, "run_attempt_count");
            int iK11 = v0.K(cursorL, "backoff_policy");
            int iK12 = v0.K(cursorL, "backoff_delay_duration");
            int iK13 = v0.K(cursorL, "last_enqueue_time");
            c3185q = c3185qD;
            try {
                int iK14 = v0.K(cursorL, "minimum_retention_duration");
                int iK15 = v0.K(cursorL, "schedule_requested_at");
                int iK16 = v0.K(cursorL, "run_in_foreground");
                int iK17 = v0.K(cursorL, "out_of_quota_policy");
                int iK18 = v0.K(cursorL, "period_count");
                int iK19 = v0.K(cursorL, "generation");
                int iK20 = v0.K(cursorL, "required_network_type");
                int iK21 = v0.K(cursorL, "requires_charging");
                int iK22 = v0.K(cursorL, "requires_device_idle");
                int iK23 = v0.K(cursorL, "requires_battery_not_low");
                int iK24 = v0.K(cursorL, "requires_storage_not_low");
                int iK25 = v0.K(cursorL, "trigger_content_update_delay");
                int iK26 = v0.K(cursorL, "trigger_max_content_delay");
                int iK27 = v0.K(cursorL, "content_uri_triggers");
                int i10 = iK14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iK) ? null : cursorL.getString(iK);
                    int iM = Fe.e.M(cursorL.getInt(iK2));
                    String string2 = cursorL.isNull(iK3) ? null : cursorL.getString(iK3);
                    String string3 = cursorL.isNull(iK4) ? null : cursorL.getString(iK4);
                    J3.h hVarA = J3.h.a(cursorL.isNull(iK5) ? null : cursorL.getBlob(iK5));
                    J3.h hVarA2 = J3.h.a(cursorL.isNull(iK6) ? null : cursorL.getBlob(iK6));
                    long j8 = cursorL.getLong(iK7);
                    long j10 = cursorL.getLong(iK8);
                    long j11 = cursorL.getLong(iK9);
                    int i11 = cursorL.getInt(iK10);
                    int iJ = Fe.e.J(cursorL.getInt(iK11));
                    long j12 = cursorL.getLong(iK12);
                    long j13 = cursorL.getLong(iK13);
                    int i12 = i10;
                    long j14 = cursorL.getLong(i12);
                    int i13 = iK;
                    int i14 = iK15;
                    long j15 = cursorL.getLong(i14);
                    iK15 = i14;
                    int i15 = iK16;
                    boolean z2 = cursorL.getInt(i15) != 0;
                    iK16 = i15;
                    int i16 = iK17;
                    int iL = Fe.e.L(cursorL.getInt(i16));
                    iK17 = i16;
                    int i17 = iK18;
                    int i18 = cursorL.getInt(i17);
                    iK18 = i17;
                    int i19 = iK19;
                    int i20 = cursorL.getInt(i19);
                    iK19 = i19;
                    int i21 = iK20;
                    int iK28 = Fe.e.K(cursorL.getInt(i21));
                    iK20 = i21;
                    int i22 = iK21;
                    boolean z10 = cursorL.getInt(i22) != 0;
                    iK21 = i22;
                    int i23 = iK22;
                    boolean z11 = cursorL.getInt(i23) != 0;
                    iK22 = i23;
                    int i24 = iK23;
                    boolean z12 = cursorL.getInt(i24) != 0;
                    iK23 = i24;
                    int i25 = iK24;
                    boolean z13 = cursorL.getInt(i25) != 0;
                    iK24 = i25;
                    int i26 = iK25;
                    long j16 = cursorL.getLong(i26);
                    iK25 = i26;
                    int i27 = iK26;
                    long j17 = cursorL.getLong(i27);
                    iK26 = i27;
                    int i28 = iK27;
                    if (!cursorL.isNull(i28)) {
                        blob = cursorL.getBlob(i28);
                    }
                    iK27 = i28;
                    arrayList.add(new p(string, iM, string2, string3, hVarA, hVarA2, j8, j10, j11, new J3.d(iK28, z10, z11, z12, z13, j16, j17, Fe.e.m(blob)), i11, iJ, j12, j13, j14, j15, z2, iL, i18, i20));
                    iK = i13;
                    i10 = i12;
                }
                cursorL.close();
                c3185q.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                c3185q.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c3185q = c3185qD;
        }
    }

    public ArrayList c() throws Throwable {
        C3185q c3185q;
        C3185q c3185qD = C3185q.d(0, "SELECT * FROM workspec WHERE state=1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            int iK = v0.K(cursorL, "id");
            int iK2 = v0.K(cursorL, "state");
            int iK3 = v0.K(cursorL, "worker_class_name");
            int iK4 = v0.K(cursorL, "input_merger_class_name");
            int iK5 = v0.K(cursorL, "input");
            int iK6 = v0.K(cursorL, "output");
            int iK7 = v0.K(cursorL, "initial_delay");
            int iK8 = v0.K(cursorL, "interval_duration");
            int iK9 = v0.K(cursorL, "flex_duration");
            int iK10 = v0.K(cursorL, "run_attempt_count");
            int iK11 = v0.K(cursorL, "backoff_policy");
            int iK12 = v0.K(cursorL, "backoff_delay_duration");
            int iK13 = v0.K(cursorL, "last_enqueue_time");
            c3185q = c3185qD;
            try {
                int iK14 = v0.K(cursorL, "minimum_retention_duration");
                int iK15 = v0.K(cursorL, "schedule_requested_at");
                int iK16 = v0.K(cursorL, "run_in_foreground");
                int iK17 = v0.K(cursorL, "out_of_quota_policy");
                int iK18 = v0.K(cursorL, "period_count");
                int iK19 = v0.K(cursorL, "generation");
                int iK20 = v0.K(cursorL, "required_network_type");
                int iK21 = v0.K(cursorL, "requires_charging");
                int iK22 = v0.K(cursorL, "requires_device_idle");
                int iK23 = v0.K(cursorL, "requires_battery_not_low");
                int iK24 = v0.K(cursorL, "requires_storage_not_low");
                int iK25 = v0.K(cursorL, "trigger_content_update_delay");
                int iK26 = v0.K(cursorL, "trigger_max_content_delay");
                int iK27 = v0.K(cursorL, "content_uri_triggers");
                int i5 = iK14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iK) ? null : cursorL.getString(iK);
                    int iM = Fe.e.M(cursorL.getInt(iK2));
                    String string2 = cursorL.isNull(iK3) ? null : cursorL.getString(iK3);
                    String string3 = cursorL.isNull(iK4) ? null : cursorL.getString(iK4);
                    J3.h hVarA = J3.h.a(cursorL.isNull(iK5) ? null : cursorL.getBlob(iK5));
                    J3.h hVarA2 = J3.h.a(cursorL.isNull(iK6) ? null : cursorL.getBlob(iK6));
                    long j8 = cursorL.getLong(iK7);
                    long j10 = cursorL.getLong(iK8);
                    long j11 = cursorL.getLong(iK9);
                    int i10 = cursorL.getInt(iK10);
                    int iJ = Fe.e.J(cursorL.getInt(iK11));
                    long j12 = cursorL.getLong(iK12);
                    long j13 = cursorL.getLong(iK13);
                    int i11 = i5;
                    long j14 = cursorL.getLong(i11);
                    int i12 = iK;
                    int i13 = iK15;
                    long j15 = cursorL.getLong(i13);
                    iK15 = i13;
                    int i14 = iK16;
                    boolean z2 = cursorL.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    int iL = Fe.e.L(cursorL.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorL.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorL.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    int iK28 = Fe.e.K(cursorL.getInt(i20));
                    iK20 = i20;
                    int i21 = iK21;
                    boolean z10 = cursorL.getInt(i21) != 0;
                    iK21 = i21;
                    int i22 = iK22;
                    boolean z11 = cursorL.getInt(i22) != 0;
                    iK22 = i22;
                    int i23 = iK23;
                    boolean z12 = cursorL.getInt(i23) != 0;
                    iK23 = i23;
                    int i24 = iK24;
                    boolean z13 = cursorL.getInt(i24) != 0;
                    iK24 = i24;
                    int i25 = iK25;
                    long j16 = cursorL.getLong(i25);
                    iK25 = i25;
                    int i26 = iK26;
                    long j17 = cursorL.getLong(i26);
                    iK26 = i26;
                    int i27 = iK27;
                    if (!cursorL.isNull(i27)) {
                        blob = cursorL.getBlob(i27);
                    }
                    iK27 = i27;
                    arrayList.add(new p(string, iM, string2, string3, hVarA, hVarA2, j8, j10, j11, new J3.d(iK28, z10, z11, z12, z13, j16, j17, Fe.e.m(blob)), i10, iJ, j12, j13, j14, j15, z2, iL, i17, i19));
                    iK = i12;
                    i5 = i11;
                }
                cursorL.close();
                c3185q.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                c3185q.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c3185q = c3185qD;
        }
    }

    public ArrayList d() {
        C3185q c3185q;
        C3185q c3185qD = C3185q.d(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            int iK = v0.K(cursorL, "id");
            int iK2 = v0.K(cursorL, "state");
            int iK3 = v0.K(cursorL, "worker_class_name");
            int iK4 = v0.K(cursorL, "input_merger_class_name");
            int iK5 = v0.K(cursorL, "input");
            int iK6 = v0.K(cursorL, "output");
            int iK7 = v0.K(cursorL, "initial_delay");
            int iK8 = v0.K(cursorL, "interval_duration");
            int iK9 = v0.K(cursorL, "flex_duration");
            int iK10 = v0.K(cursorL, "run_attempt_count");
            int iK11 = v0.K(cursorL, "backoff_policy");
            int iK12 = v0.K(cursorL, "backoff_delay_duration");
            int iK13 = v0.K(cursorL, "last_enqueue_time");
            c3185q = c3185qD;
            try {
                int iK14 = v0.K(cursorL, "minimum_retention_duration");
                int iK15 = v0.K(cursorL, "schedule_requested_at");
                int iK16 = v0.K(cursorL, "run_in_foreground");
                int iK17 = v0.K(cursorL, "out_of_quota_policy");
                int iK18 = v0.K(cursorL, "period_count");
                int iK19 = v0.K(cursorL, "generation");
                int iK20 = v0.K(cursorL, "required_network_type");
                int iK21 = v0.K(cursorL, "requires_charging");
                int iK22 = v0.K(cursorL, "requires_device_idle");
                int iK23 = v0.K(cursorL, "requires_battery_not_low");
                int iK24 = v0.K(cursorL, "requires_storage_not_low");
                int iK25 = v0.K(cursorL, "trigger_content_update_delay");
                int iK26 = v0.K(cursorL, "trigger_max_content_delay");
                int iK27 = v0.K(cursorL, "content_uri_triggers");
                int i5 = iK14;
                ArrayList arrayList = new ArrayList(cursorL.getCount());
                while (cursorL.moveToNext()) {
                    byte[] blob = null;
                    String string = cursorL.isNull(iK) ? null : cursorL.getString(iK);
                    int iM = Fe.e.M(cursorL.getInt(iK2));
                    String string2 = cursorL.isNull(iK3) ? null : cursorL.getString(iK3);
                    String string3 = cursorL.isNull(iK4) ? null : cursorL.getString(iK4);
                    J3.h hVarA = J3.h.a(cursorL.isNull(iK5) ? null : cursorL.getBlob(iK5));
                    J3.h hVarA2 = J3.h.a(cursorL.isNull(iK6) ? null : cursorL.getBlob(iK6));
                    long j8 = cursorL.getLong(iK7);
                    long j10 = cursorL.getLong(iK8);
                    long j11 = cursorL.getLong(iK9);
                    int i10 = cursorL.getInt(iK10);
                    int iJ = Fe.e.J(cursorL.getInt(iK11));
                    long j12 = cursorL.getLong(iK12);
                    long j13 = cursorL.getLong(iK13);
                    int i11 = i5;
                    long j14 = cursorL.getLong(i11);
                    int i12 = iK;
                    int i13 = iK15;
                    long j15 = cursorL.getLong(i13);
                    iK15 = i13;
                    int i14 = iK16;
                    boolean z2 = cursorL.getInt(i14) != 0;
                    iK16 = i14;
                    int i15 = iK17;
                    int iL = Fe.e.L(cursorL.getInt(i15));
                    iK17 = i15;
                    int i16 = iK18;
                    int i17 = cursorL.getInt(i16);
                    iK18 = i16;
                    int i18 = iK19;
                    int i19 = cursorL.getInt(i18);
                    iK19 = i18;
                    int i20 = iK20;
                    int iK28 = Fe.e.K(cursorL.getInt(i20));
                    iK20 = i20;
                    int i21 = iK21;
                    boolean z10 = cursorL.getInt(i21) != 0;
                    iK21 = i21;
                    int i22 = iK22;
                    boolean z11 = cursorL.getInt(i22) != 0;
                    iK22 = i22;
                    int i23 = iK23;
                    boolean z12 = cursorL.getInt(i23) != 0;
                    iK23 = i23;
                    int i24 = iK24;
                    boolean z13 = cursorL.getInt(i24) != 0;
                    iK24 = i24;
                    int i25 = iK25;
                    long j16 = cursorL.getLong(i25);
                    iK25 = i25;
                    int i26 = iK26;
                    long j17 = cursorL.getLong(i26);
                    iK26 = i26;
                    int i27 = iK27;
                    if (!cursorL.isNull(i27)) {
                        blob = cursorL.getBlob(i27);
                    }
                    iK27 = i27;
                    arrayList.add(new p(string, iM, string2, string3, hVarA, hVarA2, j8, j10, j11, new J3.d(iK28, z10, z11, z12, z13, j16, j17, Fe.e.m(blob)), i10, iJ, j12, j13, j14, j15, z2, iL, i17, i19));
                    iK = i12;
                    i5 = i11;
                }
                cursorL.close();
                c3185q.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorL.close();
                c3185q.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            c3185q = c3185qD;
        }
    }

    public int e(String str) {
        C3185q c3185qD = C3185q.d(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            c3185qD.N(1);
        } else {
            c3185qD.x(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            int iM = 0;
            if (cursorL.moveToFirst()) {
                Integer numValueOf = cursorL.isNull(0) ? null : Integer.valueOf(cursorL.getInt(0));
                if (numValueOf != null) {
                    iM = Fe.e.M(numValueOf.intValue());
                }
            }
            return iM;
        } finally {
            cursorL.close();
            c3185qD.h();
        }
    }

    public ArrayList f() {
        C3185q c3185qD = C3185q.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        c3185qD.N(1);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                arrayList.add(cursorL.isNull(0) ? null : cursorL.getString(0));
            }
            return arrayList;
        } finally {
            cursorL.close();
            c3185qD.h();
        }
    }

    public ArrayList g() {
        C3185q c3185qD = C3185q.d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        c3185qD.x(1, "offline_ping_sender_work");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            ArrayList arrayList = new ArrayList(cursorL.getCount());
            while (cursorL.moveToNext()) {
                arrayList.add(cursorL.isNull(0) ? null : cursorL.getString(0));
            }
            return arrayList;
        } finally {
            cursorL.close();
            c3185qD.h();
        }
    }

    public p h(String str) {
        C3185q c3185q;
        int iK;
        int iK2;
        int iK3;
        int iK4;
        int iK5;
        int iK6;
        int iK7;
        int iK8;
        int iK9;
        int iK10;
        int iK11;
        int iK12;
        int iK13;
        C3185q c3185qD = C3185q.d(1, "SELECT * FROM workspec WHERE id=?");
        if (str == null) {
            c3185qD.N(1);
        } else {
            c3185qD.x(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            iK = v0.K(cursorL, "id");
            iK2 = v0.K(cursorL, "state");
            iK3 = v0.K(cursorL, "worker_class_name");
            iK4 = v0.K(cursorL, "input_merger_class_name");
            iK5 = v0.K(cursorL, "input");
            iK6 = v0.K(cursorL, "output");
            iK7 = v0.K(cursorL, "initial_delay");
            iK8 = v0.K(cursorL, "interval_duration");
            iK9 = v0.K(cursorL, "flex_duration");
            iK10 = v0.K(cursorL, "run_attempt_count");
            iK11 = v0.K(cursorL, "backoff_policy");
            iK12 = v0.K(cursorL, "backoff_delay_duration");
            iK13 = v0.K(cursorL, "last_enqueue_time");
            c3185q = c3185qD;
        } catch (Throwable th) {
            th = th;
            c3185q = c3185qD;
        }
        try {
            int iK14 = v0.K(cursorL, "minimum_retention_duration");
            int iK15 = v0.K(cursorL, "schedule_requested_at");
            int iK16 = v0.K(cursorL, "run_in_foreground");
            int iK17 = v0.K(cursorL, "out_of_quota_policy");
            int iK18 = v0.K(cursorL, "period_count");
            int iK19 = v0.K(cursorL, "generation");
            int iK20 = v0.K(cursorL, "required_network_type");
            int iK21 = v0.K(cursorL, "requires_charging");
            int iK22 = v0.K(cursorL, "requires_device_idle");
            int iK23 = v0.K(cursorL, "requires_battery_not_low");
            int iK24 = v0.K(cursorL, "requires_storage_not_low");
            int iK25 = v0.K(cursorL, "trigger_content_update_delay");
            int iK26 = v0.K(cursorL, "trigger_max_content_delay");
            int iK27 = v0.K(cursorL, "content_uri_triggers");
            p pVar = null;
            byte[] blob = null;
            if (cursorL.moveToFirst()) {
                String string = cursorL.isNull(iK) ? null : cursorL.getString(iK);
                int iM = Fe.e.M(cursorL.getInt(iK2));
                String string2 = cursorL.isNull(iK3) ? null : cursorL.getString(iK3);
                String string3 = cursorL.isNull(iK4) ? null : cursorL.getString(iK4);
                J3.h hVarA = J3.h.a(cursorL.isNull(iK5) ? null : cursorL.getBlob(iK5));
                J3.h hVarA2 = J3.h.a(cursorL.isNull(iK6) ? null : cursorL.getBlob(iK6));
                long j8 = cursorL.getLong(iK7);
                long j10 = cursorL.getLong(iK8);
                long j11 = cursorL.getLong(iK9);
                int i5 = cursorL.getInt(iK10);
                int iJ = Fe.e.J(cursorL.getInt(iK11));
                long j12 = cursorL.getLong(iK12);
                long j13 = cursorL.getLong(iK13);
                long j14 = cursorL.getLong(iK14);
                long j15 = cursorL.getLong(iK15);
                boolean z2 = cursorL.getInt(iK16) != 0;
                int iL = Fe.e.L(cursorL.getInt(iK17));
                int i10 = cursorL.getInt(iK18);
                int i11 = cursorL.getInt(iK19);
                int iK28 = Fe.e.K(cursorL.getInt(iK20));
                boolean z10 = cursorL.getInt(iK21) != 0;
                boolean z11 = cursorL.getInt(iK22) != 0;
                boolean z12 = cursorL.getInt(iK23) != 0;
                boolean z13 = cursorL.getInt(iK24) != 0;
                long j16 = cursorL.getLong(iK25);
                long j17 = cursorL.getLong(iK26);
                if (!cursorL.isNull(iK27)) {
                    blob = cursorL.getBlob(iK27);
                }
                pVar = new p(string, iM, string2, string3, hVarA, hVarA2, j8, j10, j11, new J3.d(iK28, z10, z11, z12, z13, j16, j17, Fe.e.m(blob)), i5, iJ, j12, j13, j14, j15, z2, iL, i10, i11);
            }
            cursorL.close();
            c3185q.h();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            cursorL.close();
            c3185q.h();
            throw th;
        }
    }

    public void i(long j8, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        h hVar = (h) this.f11005j;
        o3.g gVarA = hVar.a();
        gVarA.G(1, j8);
        if (str == null) {
            gVarA.N(2);
        } else {
            gVarA.x(2, str);
        }
        workDatabase_Impl.c();
        try {
            gVarA.g();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            hVar.q(gVarA);
        }
    }

    public void j(long j8, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        h hVar = (h) this.f11002g;
        o3.g gVarA = hVar.a();
        gVarA.G(1, j8);
        if (str == null) {
            gVarA.N(2);
        } else {
            gVarA.x(2, str);
        }
        workDatabase_Impl.c();
        try {
            gVarA.g();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            hVar.q(gVarA);
        }
    }

    public void k(String str, J3.h hVar) throws Throwable {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        h hVar2 = (h) this.f11001f;
        o3.g gVarA = hVar2.a();
        byte[] bArrC = J3.h.c(hVar);
        if (bArrC == null) {
            gVarA.N(1);
        } else {
            gVarA.H(1, bArrC);
        }
        if (str == null) {
            gVarA.N(2);
        } else {
            gVarA.x(2, str);
        }
        workDatabase_Impl.c();
        try {
            gVarA.g();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            hVar2.q(gVarA);
        }
    }

    public void l(int i5, String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10996a;
        workDatabase_Impl.b();
        h hVar = (h) this.f10999d;
        o3.g gVarA = hVar.a();
        gVarA.G(1, Fe.e.T(i5));
        if (str == null) {
            gVarA.N(2);
        } else {
            gVarA.x(2, str);
        }
        workDatabase_Impl.c();
        try {
            gVarA.g();
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
            hVar.q(gVarA);
        }
    }
}
