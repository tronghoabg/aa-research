package com.applovin.impl.sdk;

import Wf.AbstractC1258p;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import android.view.InputEvent;
import cb.AbstractC1593a;
import com.applovin.impl.e6;
import com.applovin.impl.r4;
import com.applovin.impl.s6;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y4;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final k f23241a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f23242b;

    /* renamed from: e, reason: collision with root package name */
    private final MeasurementManager f23245e;

    /* renamed from: h, reason: collision with root package name */
    private final TopicsManager f23248h;

    /* renamed from: c, reason: collision with root package name */
    private final Set f23243c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private final Object f23244d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f23246f = new AtomicReference(new JSONArray());

    /* renamed from: g, reason: collision with root package name */
    private final d f23247g = new d(this, null);

    public class a implements OutcomeReceiver {
        public a() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            r.this.f23241a.O();
            if (o.a()) {
                r.this.f23241a.O().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        public void onResult(Object obj) {
            r.this.f23241a.O();
            if (o.a()) {
                r.this.f23241a.O().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    public class b implements OutcomeReceiver {
        public b() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            r.this.f23241a.O();
            if (o.a()) {
                r.this.f23241a.O().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        public void onResult(Object obj) {
            r.this.f23241a.O();
            if (o.a()) {
                r.this.f23241a.O().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    public class c implements OutcomeReceiver {
        public c() {
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            r.this.f23241a.O();
            if (o.a()) {
                r.this.f23241a.O().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        public void onResult(Object obj) {
            r.this.f23241a.O();
            if (o.a()) {
                r.this.f23241a.O().a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    public class d implements OutcomeReceiver {
        private d() {
        }

        public void a(GetTopicsResponse getTopicsResponse) {
            List topics = getTopicsResponse.getTopics();
            int size = topics.size();
            r.this.f23241a.O();
            if (o.a()) {
                r.this.f23241a.O().d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = topics.iterator();
            while (it.hasNext()) {
                Topic topicM = h3.e.m(it.next());
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, "id", topicM.getTopicId());
                JsonUtils.putLong(jSONObject, "model", topicM.getModelVersion());
                JsonUtils.putLong(jSONObject, "taxonomy", topicM.getTaxonomyVersion());
                jSONArray.put(jSONObject);
            }
            r.this.f23246f.set(jSONArray);
            r.this.b(((Boolean) r.this.f23241a.a(y4.f23846l7)).booleanValue(), ((Long) r.this.f23241a.a(y4.f23830j7)).longValue());
        }

        public /* bridge */ /* synthetic */ void onResult(Object obj) {
            a(h3.e.l(obj));
        }

        public /* synthetic */ d(r rVar, a aVar) {
            this();
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception exc) {
            String str;
            Long l10 = (Long) r.this.f23241a.a(y4.f23837k7);
            boolean z2 = l10.longValue() == -1;
            r.this.f23241a.O();
            if (o.a()) {
                o oVarO = r.this.f23241a.O();
                StringBuilder sb2 = new StringBuilder("Failed to retrieve topics");
                if (z2) {
                    str = "";
                } else {
                    str = ", retrying in " + l10 + " ms";
                }
                sb2.append(str);
                oVarO.a("PrivacySandboxService", sb2.toString(), exc);
            }
            if (z2) {
                return;
            }
            r.this.b(((Boolean) r.this.f23241a.a(y4.f23855m7)).booleanValue(), l10.longValue());
        }
    }

    public r(k kVar) {
        this.f23241a = kVar;
        this.f23242b = kVar.r0().b();
        Context contextO = k.o();
        this.f23245e = AbstractC1258p.c(contextO.getSystemService(AbstractC1258p.z()));
        this.f23248h = AbstractC1258p.e(contextO.getSystemService(AbstractC1258p.C()));
        if (((Boolean) kVar.a(y4.f23821i7)).booleanValue()) {
            b(((Boolean) kVar.a(y4.f23846l7)).booleanValue(), 0L);
        }
    }

    private boolean c(String str) {
        synchronized (this.f23244d) {
            try {
                if (this.f23243c.contains(str)) {
                    return false;
                }
                this.f23243c.add(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(List list) {
        a("register impression", new u(7, this, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list == null || list.isEmpty() || this.f23245e == null || !r4.e(k.f22987E0)) {
            return;
        }
        this.f23241a.O();
        if (o.a()) {
            this.f23241a.O().a("PrivacySandboxService", "Registering impression...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f23245e.registerSource(Uri.parse((String) it.next()), null, this.f23242b, new a());
        }
    }

    public void b(List list, InputEvent inputEvent) {
        a("register click", new s(this, list, inputEvent, 4));
    }

    public void b(String str) {
        a("register conversion trigger event", new u(8, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z2, long j8) {
        a("retrieve topics", new com.applovin.impl.B(this, z2, j8, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(List list, InputEvent inputEvent) {
        if (list == null || list.isEmpty() || this.f23245e == null || !r4.e(k.f22987E0)) {
            return;
        }
        this.f23241a.O();
        if (o.a()) {
            this.f23241a.O().a("PrivacySandboxService", "Registering click...");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f23245e.registerSource(Uri.parse((String) it.next()), inputEvent, this.f23242b, new b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (TextUtils.isEmpty(str) || this.f23245e == null || !r4.e(k.f22987E0)) {
            return;
        }
        this.f23241a.O();
        if (o.a()) {
            AbstractC1593a.s("Registering conversion: ", str, this.f23241a.O(), "PrivacySandboxService");
        }
        this.f23245e.registerTrigger(Uri.parse(str), this.f23242b, new c());
    }

    public JSONArray a() {
        return (JSONArray) this.f23246f.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, long j8) {
        if (this.f23248h == null) {
            return;
        }
        GetTopicsRequest getTopicsRequestBuild = h3.e.h().setShouldRecordObservation(z2).setAdsSdkName("AppLovin").build();
        if (j8 <= 0) {
            this.f23248h.getTopics(getTopicsRequestBuild, this.f23242b, this.f23247g);
        } else {
            this.f23241a.r0().a(new s6(this.f23241a, true, "getTopics", new u(6, this, getTopicsRequestBuild)), e6.b.OTHER, j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(GetTopicsRequest getTopicsRequest) {
        this.f23248h.getTopics(getTopicsRequest, this.f23242b, this.f23247g);
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f23241a.O();
            if (o.a()) {
                this.f23241a.O().a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th) {
            this.f23241a.O();
            if (o.a()) {
                this.f23241a.O().a("PrivacySandboxService", "Failed to run operation: " + str, th);
            }
            if (c(str)) {
                this.f23241a.D().a("PrivacySandboxService", str, th);
            }
        }
    }
}
