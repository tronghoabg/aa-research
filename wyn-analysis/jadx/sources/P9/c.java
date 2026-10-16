package P9;

import A.AbstractC0213f;
import E4.n;
import L8.p;
import S3.s;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f9270m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final s8.g f9271a;

    /* renamed from: b, reason: collision with root package name */
    public final R9.c f9272b;

    /* renamed from: c, reason: collision with root package name */
    public final s f9273c;

    /* renamed from: d, reason: collision with root package name */
    public final j f9274d;

    /* renamed from: e, reason: collision with root package name */
    public final p f9275e;

    /* renamed from: f, reason: collision with root package name */
    public final h f9276f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f9277g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f9278h;

    /* renamed from: i, reason: collision with root package name */
    public final M8.j f9279i;

    /* renamed from: j, reason: collision with root package name */
    public String f9280j;
    public final HashSet k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f9281l;

    static {
        new AtomicInteger(1);
    }

    public c(s8.g gVar, O9.b bVar, ExecutorService executorService, M8.j jVar) {
        gVar.a();
        R9.c cVar = new R9.c(gVar.f45328a, bVar);
        s sVar = new s(gVar, 17);
        if (ya.b.f48041b == null) {
            ya.b.f48041b = new ya.b(26);
        }
        ya.b bVar2 = ya.b.f48041b;
        if (j.f9289d == null) {
            j.f9289d = new j(bVar2);
        }
        j jVar2 = j.f9289d;
        p pVar = new p(new L8.d(gVar, 2));
        h hVar = new h();
        this.f9277g = new Object();
        this.k = new HashSet();
        this.f9281l = new ArrayList();
        this.f9271a = gVar;
        this.f9272b = cVar;
        this.f9273c = sVar;
        this.f9274d = jVar2;
        this.f9275e = pVar;
        this.f9276f = hVar;
        this.f9278h = executorService;
        this.f9279i = jVar;
    }

    public final void a(i iVar) {
        synchronized (this.f9277g) {
            this.f9281l.add(iVar);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        Q9.b bVarU;
        synchronized (f9270m) {
            try {
                s8.g gVar = this.f9271a;
                gVar.a();
                S3.e eVarJ = S3.e.j(gVar.f45328a);
                try {
                    bVarU = this.f9273c.u();
                    int i5 = bVarU.f9920b;
                    boolean z2 = true;
                    if (i5 != 2 && i5 != 1) {
                        z2 = false;
                    }
                    if (z2) {
                        String strH = h(bVarU);
                        s sVar = this.f9273c;
                        Q9.a aVarA = bVarU.a();
                        aVarA.f9913c = strH;
                        aVarA.f9912b = 3;
                        bVarU = aVarA.a();
                        sVar.s(bVarU);
                    }
                    if (eVarJ != null) {
                        eVarJ.w();
                    }
                } catch (Throwable th) {
                    if (eVarJ != null) {
                        eVarJ.w();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k(bVarU);
        this.f9279i.execute(new b(this, 2));
    }

    public final Q9.b c(Q9.b bVar) throws e {
        int responseCode;
        R9.b bVarF;
        s8.g gVar = this.f9271a;
        gVar.a();
        String str = gVar.f45330c.f45343a;
        gVar.a();
        String str2 = gVar.f45330c.f45349g;
        String str3 = bVar.f9922d;
        R9.c cVar = this.f9272b;
        R9.d dVar = cVar.f10563c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = R9.c.a("projects/" + str2 + "/installations/" + bVar.f9919a + "/authTokens:generate");
        for (int i5 = 0; i5 <= 1; i5++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty(ApiHeadersProvider.AUTHORIZATION, "FIS_v2 " + str3);
                    httpURLConnectionC.setDoOutput(true);
                    R9.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                bVarF = R9.c.f(httpURLConnectionC);
            } else {
                R9.c.b(httpURLConnectionC, null, str, str2);
                if (responseCode == 401 || responseCode == 404) {
                    n nVarA = R9.b.a();
                    nVarA.f2938b = 3;
                    bVarF = nVarA.d();
                } else {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        n nVarA2 = R9.b.a();
                        nVarA2.f2938b = 2;
                        bVarF = nVarA2.d();
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            httpURLConnectionC.disconnect();
            TrafficStats.clearThreadStatsTag();
            int iF = AbstractC0213f.f(bVarF.f10558c);
            if (iF == 0) {
                j jVar = this.f9274d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f9290a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                Q9.a aVarA = bVar.a();
                aVarA.f9914d = bVarF.f10556a;
                aVarA.f9917g = Long.valueOf(bVarF.f10557b);
                aVarA.f9918h = Long.valueOf(seconds);
                return aVarA.a();
            }
            if (iF == 1) {
                Q9.a aVarA2 = bVar.a();
                aVarA2.f9916f = "BAD CONFIG";
                aVarA2.f9912b = 5;
                return aVarA2.a();
            }
            if (iF != 2) {
                throw new e("Firebase Installations Service is unavailable. Please try again later.");
            }
            l(null);
            Q9.a aVarA3 = bVar.a();
            aVarA3.f9912b = 2;
            return aVarA3.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final Task d() {
        String str;
        g();
        synchronized (this) {
            str = this.f9280j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new g(taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.f9278h.execute(new b(this, 0));
        return task;
    }

    public final Task e() {
        g();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        a(new f(this.f9274d, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.f9278h.execute(new b(this, 1));
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(Q9.b bVar) {
        synchronized (f9270m) {
            try {
                s8.g gVar = this.f9271a;
                gVar.a();
                S3.e eVarJ = S3.e.j(gVar.f45328a);
                try {
                    this.f9273c.s(bVar);
                    if (eVarJ != null) {
                        eVarJ.w();
                    }
                } catch (Throwable th) {
                    if (eVarJ != null) {
                        eVarJ.w();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        s8.g gVar = this.f9271a;
        gVar.a();
        AbstractC1732v.g(gVar.f45330c.f45344b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        AbstractC1732v.g(gVar.f45330c.f45349g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        AbstractC1732v.g(gVar.f45330c.f45343a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f45330c.f45344b;
        Pattern pattern = j.f9288c;
        AbstractC1732v.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER));
        gVar.a();
        AbstractC1732v.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", j.f9288c.matcher(gVar.f45330c.f45343a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String h(Q9.b r3) {
        /*
            r2 = this;
            s8.g r0 = r2.f9271a
            r0.a()
            java.lang.String r0 = r0.f45329b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            s8.g r0 = r2.f9271a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f45329b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L50
        L1e:
            r0 = 1
            int r3 = r3.f9920b
            if (r3 != r0) goto L50
            L8.p r3 = r2.f9275e
            java.lang.Object r3 = r3.get()
            Q9.c r3 = (Q9.c) r3
            android.content.SharedPreferences r0 = r3.f9927a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4e
        L38:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4d
            P9.h r3 = r2.f9276f
            r3.getClass()
            java.lang.String r3 = P9.h.a()
            return r3
        L4d:
            return r1
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L50:
            P9.h r3 = r2.f9276f
            r3.getClass()
            java.lang.String r3 = P9.h.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: P9.c.h(Q9.b):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [R9.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [R9.a] */
    public final Q9.b i(Q9.b bVar) throws e {
        int responseCode;
        String str = bVar.f9919a;
        String string = null;
        if (str != null && str.length() == 11) {
            Q9.c cVar = (Q9.c) this.f9275e.get();
            synchronized (cVar.f9927a) {
                try {
                    String[] strArr = Q9.c.f9926c;
                    int i5 = 0;
                    while (true) {
                        if (i5 < 4) {
                            String str2 = strArr[i5];
                            String string2 = cVar.f9927a.getString("|T|" + cVar.f9928b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i5++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        R9.c cVar2 = this.f9272b;
        s8.g gVar = this.f9271a;
        gVar.a();
        String str3 = gVar.f45330c.f45343a;
        String str4 = bVar.f9919a;
        s8.g gVar2 = this.f9271a;
        gVar2.a();
        String str5 = gVar2.f45330c.f45349g;
        s8.g gVar3 = this.f9271a;
        gVar3.a();
        String str6 = gVar3.f45330c.f45344b;
        R9.d dVar = cVar2.f10563c;
        if (!dVar.b()) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = R9.c.a("projects/" + str5 + "/installations");
        int i10 = 0;
        R9.a aVar = cVar2;
        while (i10 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = aVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    R9.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    dVar.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    R9.a aVarE = R9.c.e(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar = aVarE;
                } else {
                    try {
                        R9.c.b(httpURLConnectionC, str6, str3, str5);
                    } catch (IOException | AssertionError unused3) {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar = aVar;
                    }
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        R9.a aVar2 = new R9.a(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        aVar = aVar2;
                    } else {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar = aVar;
                    }
                }
                int iF = AbstractC0213f.f(aVar.f10555e);
                if (iF != 0) {
                    if (iF != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    Q9.a aVarA = bVar.a();
                    aVarA.f9916f = "BAD CONFIG";
                    aVarA.f9912b = 5;
                    return aVarA.a();
                }
                String str7 = aVar.f10552b;
                String str8 = aVar.f10553c;
                j jVar = this.f9274d;
                jVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                jVar.f9290a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                R9.b bVar2 = aVar.f10554d;
                String str9 = bVar2.f10556a;
                long j8 = bVar2.f10557b;
                Q9.a aVarA2 = bVar.a();
                aVarA2.f9913c = str7;
                aVarA2.f9912b = 4;
                aVarA2.f9914d = str9;
                aVarA2.f9915e = str8;
                aVarA2.f9917g = Long.valueOf(j8);
                aVarA2.f9918h = Long.valueOf(seconds);
                return aVarA2.a();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.f9277g) {
            try {
                Iterator it = this.f9281l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(Q9.b bVar) {
        synchronized (this.f9277g) {
            try {
                Iterator it = this.f9281l.iterator();
                while (it.hasNext()) {
                    if (((i) it.next()).b(bVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.f9280j = str;
    }

    public final synchronized void m(Q9.b bVar, Q9.b bVar2) {
        try {
            if (this.k.size() != 0 && !TextUtils.equals(bVar.f9919a, bVar2.f9919a)) {
                Iterator it = this.k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
