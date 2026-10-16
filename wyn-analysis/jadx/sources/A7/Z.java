package A7;

import Va.X7;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes4.dex */
public final class Z extends D0 {

    /* renamed from: A, reason: collision with root package name */
    public static final Pair f762A = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f763c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f764d;

    /* renamed from: e, reason: collision with root package name */
    public SharedPreferences f765e;

    /* renamed from: f, reason: collision with root package name */
    public C0240c0 f766f;

    /* renamed from: g, reason: collision with root package name */
    public final C0234a0 f767g;

    /* renamed from: h, reason: collision with root package name */
    public final C0237b0 f768h;

    /* renamed from: i, reason: collision with root package name */
    public String f769i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f770j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public final C0234a0 f771l;

    /* renamed from: m, reason: collision with root package name */
    public final X f772m;

    /* renamed from: n, reason: collision with root package name */
    public final C0237b0 f773n;

    /* renamed from: o, reason: collision with root package name */
    public final X7 f774o;

    /* renamed from: p, reason: collision with root package name */
    public final X f775p;

    /* renamed from: q, reason: collision with root package name */
    public final C0234a0 f776q;

    /* renamed from: r, reason: collision with root package name */
    public final C0234a0 f777r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f778s;

    /* renamed from: t, reason: collision with root package name */
    public final X f779t;

    /* renamed from: u, reason: collision with root package name */
    public final X f780u;

    /* renamed from: v, reason: collision with root package name */
    public final C0234a0 f781v;

    /* renamed from: w, reason: collision with root package name */
    public final C0237b0 f782w;

    /* renamed from: x, reason: collision with root package name */
    public final C0237b0 f783x;

    /* renamed from: y, reason: collision with root package name */
    public final C0234a0 f784y;

    /* renamed from: z, reason: collision with root package name */
    public final X7 f785z;

    public Z(C0273n0 c0273n0) {
        super(c0273n0);
        this.f764d = new Object();
        this.f771l = new C0234a0(this, "session_timeout", 1800000L);
        this.f772m = new X(this, "start_new_session", true);
        this.f776q = new C0234a0(this, "last_pause_time", 0L);
        this.f777r = new C0234a0(this, "session_id", 0L);
        this.f773n = new C0237b0(this, "non_personalized_ads");
        this.f774o = new X7(this, "last_received_uri_timestamps_by_source");
        this.f775p = new X(this, "allow_remote_dynamite", false);
        this.f767g = new C0234a0(this, "first_open_time", 0L);
        AbstractC1732v.f("app_install_time");
        this.f768h = new C0237b0(this, "app_instance_id");
        this.f779t = new X(this, "app_backgrounded", false);
        this.f780u = new X(this, "deep_link_retrieval_complete", false);
        this.f781v = new C0234a0(this, "deep_link_retrieval_attempts", 0L);
        this.f782w = new C0237b0(this, "firebase_feature_rollouts");
        this.f783x = new C0237b0(this, "deferred_attribution_cache");
        this.f784y = new C0234a0(this, "deferred_attribution_cache_timestamp", 0L);
        this.f785z = new X7(this, "default_event_parameters");
    }

    @Override // A7.D0
    public final boolean g0() {
        return true;
    }

    public final void h0(SparseArray sparseArray) {
        int[] iArr = new int[sparseArray.size()];
        long[] jArr = new long[sparseArray.size()];
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            iArr[i5] = sparseArray.keyAt(i5);
            jArr[i5] = ((Long) sparseArray.valueAt(i5)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        this.f774o.p(bundle);
    }

    public final boolean i0(long j8) {
        return j8 - this.f771l.d() > this.f776q.d();
    }

    public final void j0(boolean z2) {
        c0();
        N nZzj = zzj();
        nZzj.f612n.d("App measurement setting deferred collection", Boolean.valueOf(z2));
        SharedPreferences.Editor editorEdit = l0().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z2);
        editorEdit.apply();
    }

    public final SharedPreferences k0() {
        c0();
        e0();
        if (this.f765e == null) {
            synchronized (this.f764d) {
                try {
                    if (this.f765e == null) {
                        String str = ((C0273n0) this.f421a).f973a.getPackageName() + "_preferences";
                        zzj().f612n.d("Default prefs file", str);
                        this.f765e = ((C0273n0) this.f421a).f973a.getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f765e;
    }

    public final SharedPreferences l0() {
        c0();
        e0();
        AbstractC1732v.i(this.f763c);
        return this.f763c;
    }

    public final SparseArray m0() {
        Bundle bundleO = this.f774o.o();
        int[] intArray = bundleO.getIntArray("uriSources");
        long[] longArray = bundleO.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            zzj().f605f.c("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i5 = 0; i5 < intArray.length; i5++) {
            sparseArray.put(intArray[i5], Long.valueOf(longArray[i5]));
        }
        return sparseArray;
    }

    public final F0 n0() {
        c0();
        return F0.c(l0().getInt("consent_source", 100), l0().getString("consent_settings", "G1"));
    }
}
