package G8;

import A.e0;
import A7.C0237b0;
import C8.i;
import J9.C0647f;
import K3.r;
import R8.C0805a;
import R8.m;
import R8.s;
import S8.f;
import Y2.B;
import aa.e;
import aa.o;
import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import b7.k;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.g;
import d7.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import md.AbstractC3556y;
import md.C3535c;
import md.S;
import n7.AbstractC3601f;
import nd.C3616b;
import nd.C3617c;
import od.C3728u0;
import org.apache.tika.pipes.async.AsyncProcessor;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import p9.l;
import s8.j;
import v9.n;
import w9.C4386e;
import x9.C4504d;
import y3.C4548f;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4670b;

    public /* synthetic */ c(d dVar, C4504d c4504d) {
        this.f4669a = 0;
        this.f4670b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws j, UnsupportedEncodingException {
        Throwable th;
        FileInputStream fileInputStreamOpenFileInput;
        boolean z2 = true;
        e eVarA = null;
        switch (this.f4669a) {
            case 0:
                d dVar = (d) this.f4670b;
                dVar.getClass();
                byte[] bytes = new JSONObject().toString().getBytes("UTF-8");
                i iVar = dVar.f4673c;
                iVar.getClass();
                C8.j jVar = dVar.f4676f;
                if (jVar.f1945b > System.currentTimeMillis()) {
                    throw new j("Too many attempts.");
                }
                JSONObject jSONObject = new JSONObject(iVar.u(new URL("https://firebaseappcheck.googleapis.com/v1/projects/" + ((String) iVar.f1942e) + "/apps/" + ((String) iVar.f1941d) + ":generatePlayIntegrityChallenge?key=" + ((String) iVar.f1940c)), bytes, jVar, false));
                String strA = AbstractC3601f.a(jSONObject.optString("challenge"));
                String strA2 = AbstractC3601f.a(jSONObject.optString("ttl"));
                if (strA == null || strA2 == null) {
                    throw new j("Unexpected server response.");
                }
                a aVar = new a();
                aVar.f4666a = strA;
                return aVar;
            case 1:
                return com.vungle.ads.internal.session.b.a((com.vungle.ads.internal.session.b) this.f4670b);
            case 2:
                return ((C0647f) this.f4670b).f5929d;
            case 3:
                ((TaskCompletionSource) this.f4670b).setResult(null);
                return null;
            case 4:
                m mVar = ((s) this.f4670b).f10517h;
                mVar.getClass();
                f.a();
                S3.e eVar = mVar.f10479c;
                String str = (String) eVar.f10941b;
                X8.c cVar = (X8.c) eVar.f10942c;
                cVar.getClass();
                if (new File((File) cVar.f16186c, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    String str2 = (String) eVar.f10941b;
                    cVar.getClass();
                    new File((File) cVar.f16186c, str2).delete();
                } else {
                    String strE = mVar.e();
                    if (strE == null || !mVar.f10486j.c(strE)) {
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
            case 5:
                WorkDatabase workDatabase = (WorkDatabase) ((e0) this.f4670b).f152b;
                Long lO = workDatabase.q().o("next_alarm_manager_id");
                int iLongValue = lO != null ? (int) lO.longValue() : 0;
                workDatabase.q().q(new S3.d("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 6:
                r rVar = (r) ((B) this.f4670b).f16384c;
                Z8.c cVar2 = (Z8.c) rVar.f6512b;
                B8.e eVar2 = (B8.e) rVar.f6516f;
                String str3 = eVar2.f1613b;
                f.b();
                try {
                    HashMap mapC = B8.e.c(cVar2);
                    k kVar = new k(mapC, str3);
                    kVar.x("User-Agent", "Crashlytics Android SDK/19.3.0");
                    kVar.x("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    B8.e.b(kVar, cVar2);
                    String str4 = "Requesting settings from " + str3;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str4, null);
                    }
                    String str5 = "Settings query params were: " + mapC;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str5, null);
                    }
                    return eVar2.d(kVar.u());
                } catch (IOException e7) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e7);
                    return null;
                }
            case 7:
                return ((Z9.d) this.f4670b).c();
            case 8:
                return ((Z9.k) this.f4670b).a();
            case 9:
                o oVar = (o) this.f4670b;
                synchronized (oVar) {
                    try {
                        fileInputStreamOpenFileInput = oVar.f17478a.openFileInput(oVar.f17479b);
                        try {
                            int iAvailable = fileInputStreamOpenFileInput.available();
                            byte[] bArr = new byte[iAvailable];
                            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                            eVarA = e.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStreamOpenFileInput.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            return eVarA;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStreamOpenFileInput = null;
                    }
                }
                return eVarA;
            case 10:
                return ((AsyncProcessor) this.f4670b).lambda$new$0();
            case 11:
                X8.c cVar3 = (X8.c) this.f4670b;
                Context context = (Context) cVar3.f16188e;
                try {
                    D7.a.a(context);
                } catch (g | h | IllegalStateException e10) {
                    Ba.c.p("GrpcCallProvider", "Failed to update ssl context: %s", 2, e10);
                }
                C0237b0 c0237b0 = (C0237b0) cVar3.f16189f;
                pd.h hVarC = AbstractC3556y.c((String) c0237b0.f814d);
                if (!c0237b0.f812b) {
                    hVarC.f43511g = 2;
                }
                long nanos = TimeUnit.SECONDS.toNanos(30L);
                hVarC.f43512h = nanos;
                long jMax = Math.max(nanos, C3728u0.k);
                hVarC.f43512h = jMax;
                if (jMax >= pd.h.f43503n) {
                    hVarC.f43512h = Long.MAX_VALUE;
                }
                C3617c c3617c = new C3617c(hVarC);
                c3617c.f41019b = context;
                S sA = c3617c.a();
                n nVar = new n(cVar3, (C3616b) sA, i);
                C4386e c4386e = (C4386e) cVar3.f16185b;
                c4386e.a(nVar);
                C0805a c0805aB = C3535c.b(C3535c.f40619i.c(ud.e.f46784c, ud.b.f46774b));
                c0805aB.f10438c = (v9.i) cVar3.f16190g;
                C0805a c0805aB2 = C3535c.b(new C3535c(c0805aB));
                c0805aB2.f10437b = c4386e.f47427a;
                cVar3.f16186c = new C3535c(c0805aB2);
                Ba.c.p("GrpcCallProvider", "Channel successfully reset.", 1, new Object[0]);
                return sA;
            case 12:
                ((Runnable) this.f4670b).run();
                return null;
            case 13:
                ((l) this.f4670b).run();
                return null;
            default:
                return new C4548f((JsReplyProxyBoundaryInterface) this.f4670b);
        }
    }

    public /* synthetic */ c(Object obj, int i5) {
        this.f4669a = i5;
        this.f4670b = obj;
    }
}
