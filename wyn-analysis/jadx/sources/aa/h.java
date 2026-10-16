package aa;

import J9.B;
import android.text.format.DateUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: i, reason: collision with root package name */
    public static final long f17435i = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f17436j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a, reason: collision with root package name */
    public final P9.d f17437a;

    /* renamed from: b, reason: collision with root package name */
    public final O9.b f17438b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f17439c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f17440d;

    /* renamed from: e, reason: collision with root package name */
    public final c f17441e;

    /* renamed from: f, reason: collision with root package name */
    public final ConfigFetchHttpClient f17442f;

    /* renamed from: g, reason: collision with root package name */
    public final k f17443g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f17444h;

    public h(P9.d dVar, O9.b bVar, Executor executor, Random random, c cVar, ConfigFetchHttpClient configFetchHttpClient, k kVar, HashMap map) {
        this.f17437a = dVar;
        this.f17438b = bVar;
        this.f17439c = executor;
        this.f17440d = random;
        this.f17441e = cVar;
        this.f17442f = configFetchHttpClient;
        this.f17443g = kVar;
        this.f17444h = map;
    }

    public final g a(String str, String str2, Date date, HashMap map) throws Z9.f {
        Date date2;
        String str3;
        HttpURLConnection httpURLConnectionB;
        ConfigFetchHttpClient configFetchHttpClient;
        HashMap mapD;
        String string;
        w8.d dVar;
        try {
            httpURLConnectionB = this.f17442f.b();
            configFetchHttpClient = this.f17442f;
            mapD = d();
            string = this.f17443g.f17454a.getString("last_fetch_etag", null);
            dVar = (w8.d) this.f17438b.get();
            date2 = date;
        } catch (Z9.h e7) {
            e = e7;
            date2 = date;
        }
        try {
            g gVarFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, dVar != null ? (Long) dVar.e(true).get("_fot") : null, date2);
            e eVar = gVarFetch.f17433b;
            if (eVar != null) {
                k kVar = this.f17443g;
                long j8 = eVar.f17427f;
                synchronized (kVar.f17455b) {
                    kVar.f17454a.edit().putLong("last_template_version", j8).apply();
                }
            }
            String str4 = gVarFetch.f17434c;
            if (str4 != null) {
                this.f17443g.d(str4);
            }
            this.f17443g.c(0, k.f17453f);
            return gVarFetch;
        } catch (Z9.h e10) {
            e = e10;
            Z9.h hVar = e;
            int i5 = hVar.f17061a;
            k kVar2 = this.f17443g;
            if (i5 == 429 || i5 == 502 || i5 == 503 || i5 == 504) {
                int i10 = kVar2.a().f17450a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f17436j;
                kVar2.c(i10, new Date(date2.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f17440d.nextInt((int) r2)));
            }
            j jVarA = kVar2.a();
            int i11 = hVar.f17061a;
            if (jVarA.f17450a > 1 || i11 == 429) {
                jVarA.f17451b.getTime();
                throw new Z9.g("Fetch was throttled.");
            }
            if (i11 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i11 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i11 == 429) {
                    throw new Z9.e("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i11 != 500) {
                    switch (i11) {
                        case PglCryptUtils.INPUT_INVALID /* 502 */:
                        case PglCryptUtils.COMPRESS_FAILED /* 503 */:
                        case PglCryptUtils.BASE64_FAILED /* 504 */:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new Z9.h(hVar.f17061a, "Fetch failed: ".concat(str3), hVar);
        }
    }

    public final Task b(Task task, long j8, HashMap map) {
        Task taskContinueWithTask;
        Date date = new Date(System.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        k kVar = this.f17443g;
        if (zIsSuccessful) {
            Date date2 = new Date(kVar.f17454a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(k.f17452e) ? false : date.before(new Date(TimeUnit.SECONDS.toMillis(j8) + date2.getTime()))) {
                return Tasks.forResult(new g(2, null, null));
            }
        }
        Date date3 = kVar.a().f17451b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f17439c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new Z9.g(str));
        } else {
            P9.c cVar = (P9.c) this.f17437a;
            Task taskD = cVar.d();
            Task taskE = cVar.e();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{taskD, taskE}).continueWithTask(executor, new B(this, taskD, taskE, date, map));
        }
        return taskContinueWithTask.continueWithTask(executor, new A5.h(29, this, date));
    }

    public final Task c(int i5) {
        HashMap map = new HashMap(this.f17444h);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i5);
        return this.f17441e.b().continueWithTask(this.f17439c, new f(0, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        w8.d dVar = (w8.d) this.f17438b.get();
        if (dVar != null) {
            for (Map.Entry entry : dVar.e(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
