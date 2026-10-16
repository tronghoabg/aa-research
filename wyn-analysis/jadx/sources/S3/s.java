package S3;

import A.AbstractC0213f;
import A.e0;
import E5.S;
import G6.C0558w;
import G6.C0560y;
import G6.L;
import J5.w;
import K8.M;
import K8.y;
import R8.v;
import T5.B;
import Wf.C1252j;
import Wf.C1259q;
import Wf.InterfaceC1238a0;
import Wf.K;
import Wf.T;
import Wf.Z;
import Wf.m0;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase_Impl;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatu;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.p002firebaseauthapi.zzads;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.internal.p002firebaseauthapi.zzx;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import ef.C2530n;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k3.C3185q;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import l8.AbstractC3409K;
import org.json.JSONException;
import org.json.JSONObject;
import u6.AbstractC4256a;
import wd.C4402c;
import x.C4412e;

/* loaded from: classes.dex */
public final class s implements zzatp, Continuation, SuccessContinuation, He.h, T6.h, V5.j, m0, InterfaceC1238a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11008a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11009b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11010c;

    public /* synthetic */ s(int i5, char c10) {
        this.f11008a = i5;
    }

    @Override // He.h
    public void a(Je.b bVar) {
        Me.a.e((Se.i) this.f11010c, bVar);
    }

    public void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((Bundle) this.f11010c).putString((String) entry.getKey(), (String) entry.getValue());
        }
    }

    @Override // T6.h
    public Object c(IBinder iBinder) throws Ya.a, RemoteException, IOException {
        Bundle bundleZzd = zze.zzb(iBinder).zzd((String) this.f11009b, (Bundle) this.f11010c);
        if (bundleZzd == null) {
            T6.d.f11766c.f("Service call returned null.", new Object[0]);
            throw new IOException("Service unavailable.");
        }
        String string = bundleZzd.getString("Error");
        if (bundleZzd.getBoolean("booleanResult")) {
            return null;
        }
        throw new Ya.a(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(Gd.a r5, lf.AbstractC3464c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Gd.f
            if (r0 == 0) goto L13
            r0 = r6
            Gd.f r0 = (Gd.f) r0
            int r1 = r0.f4730c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4730c = r1
            goto L18
        L13:
            Gd.f r0 = new Gd.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f4728a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f4730c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r6)
            goto L59
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            Fe.e.U(r6)
            jf.h r6 = r5.getCoroutineContext()
            Ef.l0 r2 = Ef.C0499l0.f3748a
            jf.f r6 = r6.get(r2)
            kotlin.jvm.internal.AbstractC3340k.b(r6)
            Ef.v r6 = (Ef.InterfaceC0515v) r6
            r2 = r6
            Ef.o0 r2 = (Ef.C0505o0) r2
            r2.Y()
            io.ktor.utils.io.t r5 = r5.d()     // Catch: java.lang.Throwable -> L4e
            io.ktor.utils.io.N.b(r5)     // Catch: java.lang.Throwable -> L4e
        L4e:
            r0.f4730c = r3
            Ef.z0 r6 = (Ef.z0) r6
            java.lang.Object r5 = r6.join(r0)
            if (r5 != r1) goto L59
            return r1
        L59:
            ef.C r5 = ef.C2515C.f34653a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.s.d(Gd.a, lf.c):java.lang.Object");
    }

    public void e() {
        this.f11009b = null;
        this.f11010c = null;
    }

    @Override // Wf.InterfaceC1238a0
    public Object f(KClass kClass, ArrayList arrayList) {
        Object objZ;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f11010c;
        Class clsY = Fe.b.y(kClass);
        Object z2 = concurrentHashMap.get(clsY);
        if (z2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsY, (z2 = new Z()))) != null) {
            z2 = objPutIfAbsent;
        }
        Z z10 = (Z) z2;
        ArrayList arrayList2 = new ArrayList(ff.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new K((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = z10.f15574a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                objZ = (KSerializer) ((tf.p) this.f11009b).invoke(kClass, arrayList);
            } catch (Throwable th) {
                objZ = Fe.e.z(th);
            }
            C2530n c2530n = new C2530n(objZ);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, c2530n);
            obj = objPutIfAbsent2 == null ? c2530n : objPutIfAbsent2;
        }
        return ((C2530n) obj).f34674a;
    }

    @Override // Wf.m0
    public KSerializer g(KClass kClass) {
        Object obj = ((C1259q) this.f11010c).get(Fe.b.y(kClass));
        AbstractC3340k.d(obj, "get(...)");
        T t10 = (T) obj;
        Object c1252j = t10.f15567a.get();
        if (c1252j == null) {
            synchronized (t10) {
                c1252j = t10.f15567a.get();
                if (c1252j == null) {
                    c1252j = new C1252j((KSerializer) ((tf.l) this.f11009b).invoke(kClass));
                    t10.f15567a = new SoftReference(c1252j);
                }
            }
        }
        return ((C1252j) c1252j).f15608a;
    }

    public boolean h(j jVar) {
        boolean zContainsKey;
        synchronized (this.f11009b) {
            zContainsKey = ((LinkedHashMap) this.f11010c).containsKey(jVar);
        }
        return zContainsKey;
    }

    @Override // V5.j
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Lc.b j(V5.i iVar) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        Lc.b bVar;
        String str = iVar.f13055a.f13061a;
        Lc.b bVar2 = null;
        try {
            AbstractC4256a.b("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                HandlerThread handlerThread = (HandlerThread) ((V5.b) this.f11009b).get();
                HandlerThread handlerThread2 = (HandlerThread) ((V5.b) this.f11010c).get();
                bVar = new Lc.b();
                bVar.f7076c = mediaCodecCreateByCodecName;
                bVar.f7077d = new V5.f(handlerThread);
                bVar.f7078e = new V5.e(mediaCodecCreateByCodecName, handlerThread2);
                bVar.f7075b = 0;
            } catch (Exception e7) {
                e = e7;
            }
        } catch (Exception e10) {
            e = e10;
            mediaCodecCreateByCodecName = null;
        }
        try {
            AbstractC4256a.q();
            Lc.b.a(bVar, iVar.f13056b, iVar.f13058d, iVar.f13059e);
            return bVar;
        } catch (Exception e11) {
            e = e11;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.release();
            } else if (mediaCodecCreateByCodecName != null) {
                mediaCodecCreateByCodecName.release();
            }
            throw e;
        }
    }

    public void k(J5.m mVar, B b5) {
        int i5 = 0;
        while (true) {
            w[] wVarArr = (w[]) this.f11010c;
            if (i5 >= wVarArr.length) {
                return;
            }
            b5.a();
            b5.b();
            w wVarM = mVar.m(b5.f11473e, 3);
            E5.T t10 = (E5.T) ((List) this.f11009b).get(i5);
            String str = t10.f3238l;
            AbstractC4256a.d("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = t10.f3228a;
            if (str2 == null) {
                b5.b();
                str2 = b5.f11474f;
            }
            S s10 = new S();
            s10.f3195a = str2;
            s10.k = str;
            s10.f3198d = t10.f3231d;
            s10.f3197c = t10.f3230c;
            s10.f3193C = t10.f3225D;
            s10.f3206m = t10.f3240n;
            wVarM.a(new E5.T(s10));
            wVarArr[i5] = wVarM;
            i5++;
        }
    }

    public void l(H5.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f11009b;
        if (handler != null) {
            handler.post(new T3.r(13, this, eVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList m() throws PackageManager.NameNotFoundException {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        l lVar = (l) this.f11010c;
        Context context = (Context) this.f11009b;
        Class cls = (Class) lVar.f10967a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new L8.d((String) it.next(), 0));
        }
        return arrayList2;
    }

    public Boolean n(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return null;
        }
        View.OnClickListener onClickListener = (View.OnClickListener) this.f11010c;
        if (onClickListener == null) {
            return Boolean.FALSE;
        }
        onClickListener.onClick((ViewGroup) this.f11009b);
        return Boolean.TRUE;
    }

    public byte[] o(D2.a aVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f11009b;
        byteArrayOutputStream.reset();
        DataOutputStream dataOutputStream = (DataOutputStream) this.f11010c;
        try {
            dataOutputStream.writeBytes(aVar.f2281a);
            dataOutputStream.writeByte(0);
            String str = aVar.f2282b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f2283c);
            dataOutputStream.writeLong(aVar.f2284d);
            dataOutputStream.write(aVar.f2285e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // He.h
    public void onComplete() {
        ((He.h) this.f11009b).onComplete();
    }

    @Override // He.h
    public void onError(Throwable th) {
        ((He.h) this.f11009b).onError(th);
    }

    @Override // He.h
    public void onSuccess(Object obj) {
        ((He.h) this.f11009b).onSuccess(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(lf.AbstractC3464c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof Gd.g
            if (r0 == 0) goto L13
            r0 = r8
            Gd.g r0 = (Gd.g) r0
            int r1 = r0.f4734d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4734d = r1
            goto L18
        L13:
            Gd.g r0 = new Gd.g
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f4732b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f4734d
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            Ef.E r0 = r0.f4731a
            Gd.a r0 = (Gd.a) r0
            Fe.e.U(r8)     // Catch: java.util.concurrent.CancellationException -> L31
            return r0
        L31:
            r8 = move-exception
            goto L8b
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3b:
            Ef.E r2 = r0.f4731a
            xd.c r2 = (xd.C4511c) r2
            Fe.e.U(r8)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L75
        L43:
            Fe.e.U(r8)     // Catch: java.util.concurrent.CancellationException -> L31
            goto L67
        L47:
            Fe.e.U(r8)
            Fd.c r8 = new Fd.c     // Catch: java.util.concurrent.CancellationException -> L31
            r8.<init>()     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r2 = r7.f11009b     // Catch: java.util.concurrent.CancellationException -> L31
            Fd.c r2 = (Fd.c) r2     // Catch: java.util.concurrent.CancellationException -> L31
            Ef.I0 r6 = r2.f4049e     // Catch: java.util.concurrent.CancellationException -> L31
            r8.f4049e = r6     // Catch: java.util.concurrent.CancellationException -> L31
            r8.d(r2)     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r2 = r7.f11010c     // Catch: java.util.concurrent.CancellationException -> L31
            wd.c r2 = (wd.C4402c) r2     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f4734d = r5     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r8 = r2.a(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r8 != r1) goto L67
            goto L89
        L67:
            r2 = r8
            xd.c r2 = (xd.C4511c) r2     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f4731a = r2     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f4734d = r4     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r8 = ka.AbstractC3230e0.w(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r8 != r1) goto L75
            goto L89
        L75:
            xd.c r8 = (xd.C4511c) r8     // Catch: java.util.concurrent.CancellationException -> L31
            Gd.a r8 = r8.e()     // Catch: java.util.concurrent.CancellationException -> L31
            Gd.a r2 = r2.e()     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f4731a = r8     // Catch: java.util.concurrent.CancellationException -> L31
            r0.f4734d = r3     // Catch: java.util.concurrent.CancellationException -> L31
            java.lang.Object r0 = r7.d(r2, r0)     // Catch: java.util.concurrent.CancellationException -> L31
            if (r0 != r1) goto L8a
        L89:
            return r1
        L8a:
            return r8
        L8b:
            java.lang.Throwable r8 = Hd.a.a(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.s.p(lf.c):java.lang.Object");
    }

    public File q() {
        if (((File) this.f11009b) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f11009b) == null) {
                        s8.g gVar = (s8.g) this.f11010c;
                        gVar.a();
                        this.f11009b = new File(gVar.f45328a.getFilesDir(), "PersistedInstallation." + ((s8.g) this.f11010c).g() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f11009b;
    }

    public ArrayList r(String str) {
        C3185q c3185qD = C3185q.d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            c3185qD.N(1);
        } else {
            c3185qD.x(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f11009b;
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

    public void s(Q9.b bVar) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.f9919a);
            jSONObject.put("Status", AbstractC0213f.f(bVar.f9920b));
            jSONObject.put("AuthToken", bVar.f9921c);
            jSONObject.put("RefreshToken", bVar.f9922d);
            jSONObject.put("TokenCreationEpochInSecs", bVar.f9924f);
            jSONObject.put("ExpiresInSecs", bVar.f9923e);
            jSONObject.put("FisError", bVar.f9925g);
            s8.g gVar = (s8.g) this.f11010c;
            gVar.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f45328a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(q())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public void t(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((C4412e) this.f11010c)) {
            ((C4412e) this.f11010c).put(new Y4.k(cls, cls2, cls3), list);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            AbstractC1732v.i(exception);
            String message = exception.getMessage();
            AbstractC1732v.i(message);
            return Tasks.forException(new y(message));
        }
        zzagm zzagmVar = (zzagm) task.getResult();
        String strZza = zzagmVar.zza();
        if (zzag.zzc(strZza)) {
            return Tasks.forException(new y(v.f("No Recaptcha Enterprise siteKey configured for tenant/project ", (String) this.f11009b)));
        }
        List<String> listZza = zzx.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception(v.f("Invalid siteKey format ", strZza)));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + ((String) this.f11009b));
        }
        C6.l lVar = (C6.l) this.f11010c;
        M m10 = (M) lVar.f1849f;
        s8.g gVar = (s8.g) lVar.f1847d;
        gVar.a();
        Application application = (Application) gVar.f45328a;
        m10.getClass();
        Task<RecaptchaTasksClient> tasksClient = Recaptcha.getTasksClient(application, str);
        C6.l lVar2 = (C6.l) this.f11010c;
        String str2 = (String) this.f11009b;
        synchronized (lVar2.f1844a) {
            lVar2.f1846c = zzagmVar;
            ((HashMap) lVar2.f1845b).put(str2, tasksClient);
        }
        return tasksClient;
    }

    public String toString() {
        switch (this.f11008a) {
            case 7:
                return "HttpStatement[" + ((Fd.c) this.f11009b).f4045a + ']';
            default:
                return super.toString();
        }
    }

    public Q9.b u() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(q());
            while (true) {
                try {
                    int i5 = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (i5 < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i5);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i10 = AbstractC0213f.g(5)[iOptInt];
        if (i10 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i10 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new Q9.b(strOptString, i10, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public void v(String str) {
        G4.b bVar;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f11009b).get(str);
                gc.b.k(obj, "Argument must not be null");
                bVar = (G4.b) obj;
                int i5 = bVar.f4225b;
                if (i5 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + bVar.f4225b);
                }
                int i10 = i5 - 1;
                bVar.f4225b = i10;
                if (i10 == 0) {
                    G4.b bVar2 = (G4.b) ((HashMap) this.f11009b).remove(str);
                    if (!bVar2.equals(bVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + bVar + ", but actually removed: " + bVar2 + ", safeKey: " + str);
                    }
                    ((xa.d) this.f11010c).z(bVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bVar.f4224a.unlock();
    }

    public K3.j w(j jVar) {
        K3.j jVar2;
        synchronized (this.f11009b) {
            jVar2 = (K3.j) ((LinkedHashMap) this.f11010c).remove(jVar);
        }
        return jVar2;
    }

    public List x(String workSpecId) {
        List listS0;
        AbstractC3340k.e(workSpecId, "workSpecId");
        synchronized (this.f11009b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11010c;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (AbstractC3340k.a(((j) entry.getKey()).f10965a, workSpecId)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it = linkedHashMap2.keySet().iterator();
                while (it.hasNext()) {
                    ((LinkedHashMap) this.f11010c).remove((j) it.next());
                }
                listS0 = ff.o.S0(linkedHashMap2.values());
            } catch (Throwable th) {
                throw th;
            }
        }
        return listS0;
    }

    public K3.j y(j jVar) {
        K3.j jVar2;
        synchronized (this.f11009b) {
            try {
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f11010c;
                Object jVar3 = linkedHashMap.get(jVar);
                if (jVar3 == null) {
                    jVar3 = new K3.j(jVar);
                    linkedHashMap.put(jVar, jVar3);
                }
                jVar2 = (K3.j) jVar3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public void zza(zzatu zzatuVar) {
        String string = zzatuVar.toString();
        String str = (String) this.f11009b;
        String strH = AbstractC3256n.h(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length()), "Failed to load URL: ", str, "\n", string);
        int i5 = L.f4523b;
        H6.l.f(strH);
        ((C0558w) this.f11010c).zzc(null);
    }

    public /* synthetic */ s(int i5, Object obj, Object obj2) {
        this.f11008a = i5;
        this.f11009b = obj;
        this.f11010c = obj2;
    }

    public /* synthetic */ s(int i5, Object obj, String str) {
        this.f11008a = i5;
        this.f11009b = str;
        this.f11010c = obj;
    }

    public /* synthetic */ s(Object obj, int i5) {
        this.f11008a = i5;
        this.f11010c = obj;
    }

    public s(C0560y c0560y, String str, C0558w c0558w) {
        this.f11008a = 6;
        this.f11009b = str;
        this.f11010c = c0558w;
        Objects.requireNonNull(c0560y);
    }

    public s(String str, FirebaseAuth firebaseAuth) {
        this.f11008a = 9;
        Bundle bundle = new Bundle();
        this.f11009b = bundle;
        Bundle bundle2 = new Bundle();
        this.f11010c = bundle2;
        s8.g gVar = firebaseAuth.f27283a;
        gVar.a();
        bundle.putString("com.google.firebase.auth.KEY_API_KEY", gVar.f45330c.f45343a);
        bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
        bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
        bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzads.zza().zzb());
        bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.b());
        gVar.a();
        bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", gVar.f45329b);
        bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.f27282B);
    }

    public s(WorkDatabase_Impl workDatabase_Impl) {
        this.f11008a = 0;
        this.f11009b = workDatabase_Impl;
        this.f11010c = new b(workDatabase_Impl, 6);
        new h(workDatabase_Impl, 16);
    }

    public s(Fd.c cVar, C4402c client) {
        this.f11008a = 7;
        AbstractC3340k.e(client, "client");
        this.f11009b = cVar;
        this.f11010c = client;
    }

    public s(byte b5, int i5) {
        this.f11008a = i5;
        switch (i5) {
            case 5:
                this.f11009b = new HashMap();
                this.f11010c = new xa.d(8);
                break;
            case 10:
                this.f11009b = new Object();
                this.f11010c = new LinkedHashMap();
                break;
            case 16:
                e0 e0Var = new e0(18);
                this.f11009b = e0Var;
                this.f11010c = new Y9.c(e0Var, 21);
                break;
            case 20:
                this.f11009b = new AtomicInteger();
                this.f11010c = new AtomicInteger();
                break;
            case 23:
                this.f11009b = new AtomicReference();
                this.f11010c = new C4412e(0);
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f11009b = byteArrayOutputStream;
                this.f11010c = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        if (((Z8.a) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        R8.k kVar = (R8.k) this.f11010c;
        R8.m mVar = kVar.f10473f;
        return Tasks.whenAll((Task<?>[]) new Task[]{R8.m.a(mVar), mVar.f10488m.j(kVar.f10472e ? (String) this.f11009b : null, mVar.f10481e.f11034a)});
    }

    public s(Context context) {
        this.f11008a = 15;
        this.f11009b = context;
        this.f11010c = null;
    }

    public s(List list) {
        this.f11008a = 24;
        this.f11009b = list;
        this.f11010c = new w[list.size()];
    }

    public s(tf.l lVar) {
        this.f11008a = 28;
        this.f11009b = lVar;
        this.f11010c = new C1259q();
    }

    public s(int i5) {
        this.f11008a = 26;
        V5.b bVar = new V5.b(i5, 0);
        V5.b bVar2 = new V5.b(i5, 1);
        this.f11009b = bVar;
        this.f11010c = bVar2;
    }

    public s(tf.p pVar) {
        this.f11008a = 29;
        this.f11009b = pVar;
        this.f11010c = new ConcurrentHashMap();
    }

    public s(EditText editText) {
        this.f11008a = 1;
        this.f11009b = editText;
        A1.i iVar = new A1.i(editText);
        this.f11010c = iVar;
        editText.addTextChangedListener(iVar);
        if (A1.a.f235b == null) {
            synchronized (A1.a.f234a) {
                try {
                    if (A1.a.f235b == null) {
                        A1.a aVar = new A1.a();
                        try {
                            A1.a.f236c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, A1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        A1.a.f235b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(A1.a.f235b);
    }

    public s(l8.e0 e0Var, int[] iArr) {
        this.f11008a = 18;
        this.f11009b = AbstractC3409K.j(e0Var);
        this.f11010c = iArr;
    }
}
