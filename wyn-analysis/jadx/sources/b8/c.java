package B8;

import C8.j;
import D6.c1;
import J9.I;
import Va.Za;
import W9.D;
import W9.u;
import aa.k;
import aa.o;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import ba.C1521a;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.unity3d.ads.core.data.repository.AndroidDiagnosticEventRepository;
import com.vungle.ads.internal.executor.g;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import org.apache.tika.pipes.PipesClient;
import org.json.JSONException;
import org.json.JSONObject;
import p9.C3778C;
import p9.C3779D;
import p9.n;
import r9.C3955l;
import r9.InterfaceC3940A;
import r9.InterfaceC3945b;
import s8.q;
import s9.h;
import t9.f;
import t9.l;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1604b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1605c;

    public /* synthetic */ c(int i5, Object obj, Object obj2) {
        this.f1603a = i5;
        this.f1604b = obj;
        this.f1605c = obj2;
    }

    private final Object a() {
        I i5 = (I) this.f1604b;
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this.f1605c;
        synchronized (i5) {
            FileOutputStream fileOutputStreamOpenFileOutput = i5.f5885a.openFileOutput(i5.f5886b, 0);
            try {
                fileOutputStreamOpenFileOutput.write(generatedMessageLite.toByteArray());
                fileOutputStreamOpenFileOutput.close();
            } finally {
            }
        }
        return generatedMessageLite;
    }

    private final Object b() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i5;
        ComponentName componentNameStartService;
        Context context = (Context) this.f1604b;
        Intent intent = (Intent) this.f1605c;
        u uVarF = u.f();
        uVarF.getClass();
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        ((ArrayDeque) uVarF.f15392d).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (uVarF) {
            try {
                str = (String) uVarF.f15389a;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    } else {
                        if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                            if (str2.startsWith(".")) {
                                uVarF.f15389a = context.getPackageName() + serviceInfo.name;
                            } else {
                                uVarF.f15389a = serviceInfo.name;
                            }
                            str = (String) uVarF.f15389a;
                        }
                        Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                    }
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
            }
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            if (uVarF.h(context)) {
                componentNameStartService = D.d(context, intent2);
            } else {
                componentNameStartService = context.startService(intent2);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService == null) {
                Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                i5 = TTAdConstant.DEEPLINK_FALLBACK_CODE;
            } else {
                i5 = -1;
            }
        } catch (IllegalStateException e7) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e7);
            i5 = TTAdConstant.AD_ID_IS_NULL_CODE;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            i5 = TTAdConstant.MATE_IS_NULL_CODE;
        }
        return Integer.valueOf(i5);
    }

    private final Object c() {
        Z9.d dVar = (Z9.d) this.f1604b;
        j jVar = (j) this.f1605c;
        k kVar = dVar.f17058i;
        synchronized (kVar.f17455b) {
            kVar.f17454a.edit().putLong("fetch_timeout_in_seconds", jVar.f1944a).putLong("minimum_fetch_interval_in_seconds", jVar.f1945b).commit();
        }
        return null;
    }

    private final Object d() {
        aa.c cVar = (aa.c) this.f1604b;
        aa.e eVar = (aa.e) this.f1605c;
        o oVar = cVar.f17413b;
        synchronized (oVar) {
            FileOutputStream fileOutputStreamOpenFileOutput = oVar.f17478a.openFileOutput(oVar.f17479b, 0);
            try {
                fileOutputStreamOpenFileOutput.write(eVar.f17422a.toString().getBytes("UTF-8"));
            } finally {
                fileOutputStreamOpenFileOutput.close();
            }
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws JSONException {
        switch (this.f1603a) {
            case 0:
                d dVar = (d) this.f1604b;
                dVar.getClass();
                e eVar = (e) this.f1605c;
                eVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("debugToken", eVar.f1613b);
                return dVar.f1606a.n(jSONObject.toString().getBytes("UTF-8"), 2, dVar.f1609d);
            case 1:
                return g.a((Callable) this.f1604b, (tf.a) this.f1605c);
            case 2:
                G8.d dVar2 = (G8.d) this.f1604b;
                dVar2.getClass();
                c1 c1Var = (c1) this.f1605c;
                c1Var.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playIntegrityToken", c1Var.f2412a);
                return dVar2.f4673c.n(jSONObject2.toString().getBytes("UTF-8"), 3, dVar2.f4676f);
            case 3:
                I8.b bVar = (I8.b) this.f1604b;
                bVar.getClass();
                c1 c1Var2 = (c1) this.f1605c;
                c1Var2.getClass();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("safetyNetToken", c1Var2.f2412a);
                return bVar.f5427b.n(jSONObject3.toString().getBytes("UTF-8"), 1, bVar.f5430e);
            case 4:
                I i5 = (I) this.f1604b;
                Parser parser = (Parser) this.f1605c;
                synchronized (i5) {
                    try {
                        FileInputStream fileInputStreamOpenFileInput = i5.f5885a.openFileInput(i5.f5886b);
                        try {
                            AbstractMessageLite abstractMessageLite = (AbstractMessageLite) parser.parseFrom(fileInputStreamOpenFileInput);
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            return abstractMessageLite;
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    } catch (InvalidProtocolBufferException | FileNotFoundException e7) {
                        ic.d.F("Recoverable exception while reading cache: " + e7.getMessage());
                        return null;
                    }
                }
            case 5:
                return a();
            case 6:
                return b();
            case 7:
                return c();
            case 8:
                return d();
            case 9:
                return AndroidDiagnosticEventRepository.flush$lambda$4((AndroidDiagnosticEventRepository) this.f1604b, (List) this.f1605c);
            case 10:
                return ((PipesClient) this.f1604b).lambda$restart$1((lg.c) this.f1605c);
            case 11:
                Za za2 = ((n) this.f1604b).f43385g.f44636f;
                InterfaceC3945b interfaceC3945b = (InterfaceC3945b) za2.f13917c;
                h hVar = (h) this.f1605c;
                t9.d dVarE = interfaceC3945b.e(hVar);
                s9.k kVarB = (dVarE == null || (dVarE.f45946b instanceof l)) ? ((InterfaceC3940A) za2.f13915a).B(hVar) : s9.k.g(hVar);
                if (dVarE != null) {
                    dVarE.f45946b.a(kVarB, f.f45947b, new q(new Date()));
                }
                return kVarB;
            default:
                C3955l c3955l = ((n) this.f1604b).f43385g;
                p9.u uVar = (p9.u) this.f1605c;
                C1521a c1521aB = c3955l.b(uVar, true);
                C3778C c3778c = new C3778C(uVar, (c9.d) c1521aB.f19415c);
                return (C3779D) c3778c.a(c3778c.d((c9.c) c1521aB.f19414b, null), null, false).f16075b;
        }
    }
}
