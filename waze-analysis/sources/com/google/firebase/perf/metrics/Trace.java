package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.e.m;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class Trace extends com.google.firebase.perf.a.d implements Parcelable, com.google.firebase.perf.session.c {
    public static final Parcelable.Creator<Trace> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.perf.c.a f10495a = com.google.firebase.perf.c.a.a();

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f10496b;

    /* renamed from: c, reason: collision with root package name */
    private final Trace f10497c;

    /* renamed from: d, reason: collision with root package name */
    private final GaugeManager f10498d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10499e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f10500f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f10501g;

    /* renamed from: h, reason: collision with root package name */
    private final List f10502h;

    /* renamed from: i, reason: collision with root package name */
    private final List f10503i;

    /* renamed from: j, reason: collision with root package name */
    private final com.google.firebase.perf.d.f f10504j;

    /* renamed from: k, reason: collision with root package name */
    private m f10505k;

    /* renamed from: l, reason: collision with root package name */
    private m f10506l;

    static {
        new ConcurrentHashMap();
        CREATOR = new g();
    }

    /* synthetic */ Trace(Parcel parcel) {
        super(com.google.firebase.perf.a.c.a());
        this.f10496b = new WeakReference(this);
        this.f10497c = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f10499e = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f10503i = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f10500f = concurrentHashMap;
        this.f10501g = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, d.class.getClassLoader());
        this.f10505k = (m) parcel.readParcelable(m.class.getClassLoader());
        this.f10506l = (m) parcel.readParcelable(m.class.getClassLoader());
        List listSynchronizedList = DesugarCollections.synchronizedList(new ArrayList());
        this.f10502h = listSynchronizedList;
        parcel.readList(listSynchronizedList, com.google.firebase.perf.session.b.class.getClassLoader());
        this.f10504j = com.google.firebase.perf.d.f.a();
        this.f10498d = GaugeManager.getInstance();
    }

    private final d j(String str) {
        Map map = this.f10500f;
        d dVar = (d) map.get(str);
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(str);
        map.put(str, dVar2);
        return dVar2;
    }

    final m a() {
        return this.f10506l;
    }

    final m b() {
        return this.f10505k;
    }

    @Override // com.google.firebase.perf.session.c
    public final void c(com.google.firebase.perf.session.b bVar) {
        if (bVar == null) {
            f10495a.i("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (!h() || i()) {
                return;
            }
            this.f10502h.add(bVar);
        }
    }

    public final String d() {
        return this.f10499e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    final List e() {
        List listUnmodifiableList;
        List<com.google.firebase.perf.session.b> list = this.f10502h;
        synchronized (list) {
            ArrayList arrayList = new ArrayList();
            for (com.google.firebase.perf.session.b bVar : list) {
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }

    final List f() {
        return this.f10503i;
    }

    protected final void finalize() throws Throwable {
        try {
            if (h() && !i()) {
                f10495a.j("Trace '%s' is started but not stopped when it is destructed!", this.f10499e);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    final Map g() {
        return this.f10500f;
    }

    public String getAttribute(String str) {
        return (String) this.f10501g.get(str);
    }

    public Map<String, String> getAttributes() {
        return new HashMap(this.f10501g);
    }

    public long getLongMetric(String str) {
        d dVar = str != null ? (d) this.f10500f.get(str.trim()) : null;
        if (dVar == null) {
            return 0L;
        }
        return dVar.a();
    }

    final boolean h() {
        return this.f10505k != null;
    }

    final boolean i() {
        return this.f10506l != null;
    }

    public void incrementMetric(String str, long j2) {
        String strB = com.google.firebase.perf.metrics.a.e.b(str);
        if (strB != null) {
            f10495a.e("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strB);
            return;
        }
        if (!h()) {
            f10495a.j("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f10499e);
        } else {
            if (i()) {
                f10495a.j("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f10499e);
                return;
            }
            d dVarJ = j(str.trim());
            dVarJ.c(j2);
            f10495a.c("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(dVarJ.a()), this.f10499e);
        }
    }

    public void putAttribute(String str, String str2) {
        boolean z = true;
        try {
            str = str.trim();
            str2 = str2.trim();
        } catch (Exception e2) {
            f10495a.e("Can not set attribute '%s' with value '%s' (%s)", str, str2, e2.getMessage());
            z = false;
        }
        if (i()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f10499e));
        }
        Map map = this.f10501g;
        if (!map.containsKey(str) && map.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        com.google.firebase.perf.metrics.a.e.c(str, str2);
        f10495a.c("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f10499e);
        if (z) {
            this.f10501g.put(str, str2);
        }
    }

    public void putMetric(String str, long j2) {
        String strB = com.google.firebase.perf.metrics.a.e.b(str);
        if (strB != null) {
            f10495a.e("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strB);
            return;
        }
        if (!h()) {
            f10495a.j("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f10499e);
        } else if (i()) {
            f10495a.j("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f10499e);
        } else {
            j(str.trim()).d(j2);
            f10495a.c("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j2), this.f10499e);
        }
    }

    public void removeAttribute(String str) {
        if (i()) {
            f10495a.d("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.f10501g.remove(str);
        }
    }

    public void start() {
        String str;
        if (!com.google.firebase.perf.config.a.o().u()) {
            f10495a.b("Trace feature is disabled.");
            return;
        }
        String str2 = this.f10499e;
        int i2 = com.google.firebase.perf.metrics.a.e.f10516a;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            str = String.format(Locale.US, "Trace name must not exceed %d characters", 100);
        } else if (str2.startsWith("_")) {
            com.google.firebase.perf.e.b[] bVarArrValues = com.google.firebase.perf.e.b.values();
            int length = bVarArrValues.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (bVarArrValues[i3].toString().equals(str2)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (str2.startsWith("_st_")) {
                    break;
                } else {
                    str = "Trace name must not start with '_'";
                }
            }
            str = null;
        } else {
            str = null;
        }
        if (str != null) {
            f10495a.e("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.f10505k != null) {
            f10495a.e("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.f10505k = new m();
        registerForAppState();
        com.google.firebase.perf.session.b bVarPerfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f10496b);
        c(bVarPerfSession);
        if (bVarPerfSession.e()) {
            this.f10498d.collectGaugeMetricOnce(bVarPerfSession.b());
        }
    }

    public void stop() {
        if (!h()) {
            f10495a.e("Trace '%s' has not been started so unable to stop!", this.f10499e);
            return;
        }
        if (i()) {
            f10495a.e("Trace '%s' has already stopped, should not stop again!", this.f10499e);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f10496b);
        unregisterForAppState();
        m mVar = new m();
        this.f10506l = mVar;
        if (this.f10497c == null) {
            List list = this.f10503i;
            if (!list.isEmpty()) {
                Trace trace = (Trace) list.get(list.size() - 1);
                if (trace.f10506l == null) {
                    trace.f10506l = mVar;
                }
            }
            if (this.f10499e.isEmpty()) {
                f10495a.d("Trace name is empty, no log is sent to server");
                return;
            }
            this.f10504j.k(h.a(this), getAppState());
            if (SessionManager.getInstance().perfSession().e()) {
                this.f10498d.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().b());
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f10497c, 0);
        parcel.writeString(this.f10499e);
        parcel.writeList(this.f10503i);
        parcel.writeMap(this.f10500f);
        parcel.writeParcelable(this.f10505k, 0);
        parcel.writeParcelable(this.f10506l, 0);
        List list = this.f10502h;
        synchronized (list) {
            parcel.writeList(list);
        }
    }

    public Trace(String str, com.google.firebase.perf.d.f fVar, com.google.firebase.perf.a.c cVar) {
        this(str, fVar, cVar, GaugeManager.getInstance());
    }

    public Trace(String str, com.google.firebase.perf.d.f fVar, com.google.firebase.perf.a.c cVar, GaugeManager gaugeManager) {
        super(cVar);
        this.f10496b = new WeakReference(this);
        this.f10497c = null;
        this.f10499e = str.trim();
        this.f10503i = new ArrayList();
        this.f10500f = new ConcurrentHashMap();
        this.f10501g = new ConcurrentHashMap();
        this.f10504j = fVar;
        this.f10502h = DesugarCollections.synchronizedList(new ArrayList());
        this.f10498d = gaugeManager;
    }
}
