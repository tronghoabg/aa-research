package S3;

import A.e0;
import A7.AbstractC0279p0;
import A7.C0273n0;
import A7.K0;
import A7.N;
import A7.O0;
import E4.B;
import G6.M;
import G6.U;
import J5.y;
import J8.AbstractC0640o;
import J8.C0627b;
import J8.C0641p;
import J9.L;
import K8.C0693e;
import L4.C0710b;
import N.C0718d;
import N.P;
import T5.x;
import T5.z;
import Wf.C1259q;
import Wf.InterfaceC1238a0;
import Wf.K;
import Wf.T;
import Wf.Z;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import c8.C1581e;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.measurement.zzdp;
import com.google.android.gms.internal.p002firebaseauthapi.zzadk;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import ef.C2530n;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.lang.ref.SoftReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import k3.C3185q;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import l8.AbstractC3409K;
import l9.InterfaceC3448d;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.utils.StringUtils;
import p7.AbstractC3772b;
import p9.C3778C;
import u6.t;

/* loaded from: classes.dex */
public final class c implements K0, H6.e, Continuation, OnCompleteListener, B4.j, He.b, SuccessContinuation, S1.g, x, He.o, InterfaceC1238a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10935a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10936b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10937c;

    public /* synthetic */ c(int i5, Object obj, Object obj2) {
        this.f10935a = i5;
        this.f10937c = obj;
        this.f10936b = obj2;
    }

    @Override // He.b
    public void a(Je.b bVar) {
        switch (this.f10935a) {
            case 17:
                ((He.b) this.f10936b).a(bVar);
                break;
            default:
                ((He.o) this.f10936b).a(bVar);
                break;
        }
    }

    @Override // S1.g
    public S1.h b() {
        return new S1.l((Context) this.f10936b, ((N2.e) this.f10937c).b());
    }

    @Override // T5.x
    public void c(Y4.b bVar) {
        z zVar;
        if (bVar.q() == 0 && (bVar.q() & 128) != 0) {
            bVar.B(6);
            int iA = bVar.a() / 4;
            int i5 = 0;
            while (true) {
                zVar = (z) this.f10937c;
                if (i5 >= iA) {
                    break;
                }
                y yVar = (y) this.f10936b;
                bVar.c(0, 4, yVar.f5695b);
                yVar.q(0);
                int i10 = yVar.i(16);
                yVar.t(3);
                if (i10 == 0) {
                    yVar.t(13);
                } else {
                    int i11 = yVar.i(13);
                    if (zVar.f11740g.get(i11) == null) {
                        zVar.f11740g.put(i11, new T5.y(new N2.j(zVar, i11)));
                        zVar.f11745m++;
                    }
                }
                i5++;
            }
            if (zVar.f11734a != 2) {
                zVar.f11740g.remove(0);
            }
        }
    }

    @Override // B4.j
    public int e(B4.g gVar) {
        return 2;
    }

    @Override // Wf.InterfaceC1238a0
    public Object f(KClass kClass, ArrayList arrayList) {
        Object objZ;
        Object obj = ((C1259q) this.f10937c).get(Fe.b.y(kClass));
        AbstractC3340k.d(obj, "get(...)");
        T t10 = (T) obj;
        Object z2 = t10.f15567a.get();
        if (z2 == null) {
            synchronized (t10) {
                z2 = t10.f15567a.get();
                if (z2 == null) {
                    z2 = new Z();
                    t10.f15567a = new SoftReference(z2);
                }
            }
        }
        Z z10 = (Z) z2;
        ArrayList arrayList2 = new ArrayList(ff.p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new K((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = z10.f15574a;
        Object obj2 = concurrentHashMap.get(arrayList2);
        if (obj2 == null) {
            try {
                objZ = (KSerializer) ((tf.p) this.f10936b).invoke(kClass, arrayList);
            } catch (Throwable th) {
                objZ = Fe.e.z(th);
            }
            C2530n c2530n = new C2530n(objZ);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, c2530n);
            obj2 = objPutIfAbsent == null ? c2530n : objPutIfAbsent;
        }
        return ((C2530n) obj2).f34674a;
    }

    @Override // B4.b
    public boolean g(Object obj, File file, B4.g gVar) {
        return ((C0710b) this.f10937c).g(new L4.c((F4.a) this.f10936b, ((BitmapDrawable) ((B) obj).get()).getBitmap()), file, gVar);
    }

    public String h(B4.d dVar) {
        String str;
        G4.g gVar = (G4.g) ((Dd.c) this.f10937c).z();
        try {
            dVar.b(gVar.f4237a);
            byte[] bArrDigest = gVar.f4237a.digest();
            char[] cArr = Y4.m.f16701b;
            synchronized (cArr) {
                for (int i5 = 0; i5 < bArrDigest.length; i5++) {
                    byte b5 = bArrDigest[i5];
                    int i10 = i5 * 2;
                    int i11 = (b5 & ForkServer.ERROR) >>> 4;
                    char[] cArr2 = Y4.m.f16700a;
                    cArr[i10] = cArr2[i11];
                    cArr[i10 + 1] = cArr2[b5 & 15];
                }
                str = new String(cArr);
            }
            return str;
        } finally {
            ((Dd.c) this.f10937c).O(gVar);
        }
    }

    public void i() {
        this.f10936b = null;
        this.f10937c = null;
    }

    public Object j(F4.h hVar) {
        HashMap map = (HashMap) this.f10937c;
        F4.c cVar = (F4.c) map.get(hVar);
        if (cVar == null) {
            cVar = new F4.c(hVar);
            map.put(hVar, cVar);
        } else {
            hVar.a();
        }
        F4.c cVar2 = cVar.f3840d;
        cVar2.f3839c = cVar.f3839c;
        cVar.f3839c.f3840d = cVar2;
        F4.c cVar3 = (F4.c) this.f10936b;
        cVar.f3840d = cVar3;
        F4.c cVar4 = cVar3.f3839c;
        cVar.f3839c = cVar4;
        cVar4.f3840d = cVar;
        cVar.f3840d.f3839c = cVar;
        ArrayList arrayList = cVar.f3838b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return cVar.f3838b.remove(size - 1);
        }
        return null;
    }

    public ArrayList k(String str) {
        C3185q c3185qD = C3185q.d(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            c3185qD.N(1);
        } else {
            c3185qD.x(1, str);
        }
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10936b;
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

    public J5.k l(Object... objArr) {
        Constructor constructorB;
        synchronized (((AtomicBoolean) this.f10937c)) {
            if (!((AtomicBoolean) this.f10937c).get()) {
                try {
                    constructorB = ((F5.d) this.f10936b).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f10937c).set(true);
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
            constructorB = null;
        }
        if (constructorB == null) {
            return null;
        }
        try {
            return (J5.k) constructorB.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    public synchronized List m(String str) {
        List arrayList;
        if (!((ArrayList) this.f10936b).contains(str)) {
            ((ArrayList) this.f10936b).add(str);
        }
        arrayList = (List) ((HashMap) this.f10937c).get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) this.f10937c).put(str, arrayList);
        }
        return arrayList;
    }

    public synchronized ArrayList n(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f10936b).iterator();
        while (it.hasNext()) {
            List<T4.c> list = (List) ((HashMap) this.f10937c).get((String) it.next());
            if (list != null) {
                for (T4.c cVar : list) {
                    if ((cVar.f11462a.isAssignableFrom(cls) && cls2.isAssignableFrom(cVar.f11463b)) && !arrayList.contains(cVar.f11463b)) {
                        arrayList.add(cVar.f11463b);
                    }
                }
            }
        }
        return arrayList;
    }

    public String o(B4.d dVar) {
        String strH;
        synchronized (((W1.r) this.f10936b)) {
            strH = (String) ((W1.r) this.f10936b).b(dVar);
        }
        if (strH == null) {
            strH = h(dVar);
        }
        synchronized (((W1.r) this.f10936b)) {
            ((W1.r) this.f10936b).e(dVar, strH);
        }
        return strH;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Intent intent = new Intent("android.intent.action.VIEW");
        GenericIdpActivity genericIdpActivity = (GenericIdpActivity) this.f10936b;
        ResolveInfo resolveInfoResolveActivity = genericIdpActivity.getPackageManager().resolveActivity(intent, 0);
        String str = (String) this.f10937c;
        if (resolveInfoResolveActivity == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzadk.zzb(genericIdpActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            u.k kVarB = new C3778C().b();
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            kVarB.a(genericIdpActivity, (Uri) task.getResult());
        } else {
            Intent intent2 = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent2.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent2.addFlags(1073741824);
            intent2.addFlags(268435456);
            genericIdpActivity.startActivity(intent2);
        }
    }

    @Override // He.b
    public void onError(Throwable th) {
        switch (this.f10935a) {
            case 17:
                He.b bVar = (He.b) this.f10936b;
                try {
                    ((Qe.b) this.f10937c).getClass();
                    bVar.onComplete();
                    break;
                } catch (Throwable th2) {
                    AbstractC3772b.U(th2);
                    bVar.onError(new Ke.b(th, th2));
                }
            default:
                try {
                    ((F5.d) ((Ue.a) this.f10937c).f12793c).accept(th);
                } catch (Throwable th3) {
                    AbstractC3772b.U(th3);
                    th = new Ke.b(th, th3);
                }
                ((He.o) this.f10936b).onError(th);
                break;
        }
    }

    @Override // He.o
    public void onSuccess(Object obj) {
        ((He.o) this.f10936b).onSuccess(obj);
    }

    public void p(String str, String str2, Bundle bundle, long j8) {
        try {
            ((zzdp) this.f10936b).zza(str, str2, bundle, j8);
        } catch (RemoteException e7) {
            C0273n0 c0273n0 = ((AppMeasurementDynamiteService) this.f10937c).f26746a;
            if (c0273n0 != null) {
                N n10 = c0273n0.f981i;
                C0273n0.d(n10);
                n10.f608i.d("Event interceptor threw exception", e7);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x022b, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.content.Context r12, android.content.res.XmlResourceParser r13) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.c.q(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void r(F4.h hVar, Object obj) {
        HashMap map = (HashMap) this.f10937c;
        F4.c cVar = (F4.c) map.get(hVar);
        if (cVar == null) {
            cVar = new F4.c(hVar);
            cVar.f3840d = cVar;
            F4.c cVar2 = (F4.c) this.f10936b;
            cVar.f3840d = cVar2.f3840d;
            cVar.f3839c = cVar2;
            cVar2.f3840d = cVar;
            cVar.f3840d.f3839c = cVar;
            map.put(hVar, cVar);
        } else {
            hVar.a();
        }
        if (cVar.f3838b == null) {
            cVar.f3838b = new ArrayList();
        }
        cVar.f3838b.add(obj);
    }

    public Object s() {
        F4.c cVar = (F4.c) this.f10936b;
        F4.c cVar2 = cVar.f3840d;
        while (true) {
            if (cVar2.equals(cVar)) {
                return null;
            }
            ArrayList arrayList = cVar2.f3838b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? cVar2.f3838b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            F4.c cVar3 = cVar2.f3840d;
            cVar3.f3839c = cVar2.f3839c;
            cVar2.f3839c.f3840d = cVar3;
            HashMap map = (HashMap) this.f10937c;
            F4.h hVar = cVar2.f3837a;
            map.remove(hVar);
            hVar.a();
            cVar2 = cVar2.f3840d;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        C0641p c0641p = (C0641p) task.getResult();
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(s8.g.f(((C0693e) ((AbstractC0640o) this.f10937c)).f6629c));
        String str = c0641p.f5812a;
        AbstractC1732v.i(str);
        C0627b c0627b = (C0627b) this.f10936b;
        firebaseAuth.getClass();
        AbstractC1732v.f(str);
        String str2 = firebaseAuth.f27291i;
        if (str2 != null) {
            c0627b.f5791h = str2;
        }
        return firebaseAuth.f27287e.zza(firebaseAuth.f27283a, c0627b, str);
    }

    public String toString() {
        switch (this.f10935a) {
            case 5:
                StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
                F4.c cVar = (F4.c) this.f10936b;
                F4.c cVar2 = cVar.f3839c;
                boolean z2 = false;
                while (!cVar2.equals(cVar)) {
                    sb2.append('{');
                    sb2.append(cVar2.f3837a);
                    sb2.append(':');
                    ArrayList arrayList = cVar2.f3838b;
                    sb2.append(arrayList != null ? arrayList.size() : 0);
                    sb2.append("}, ");
                    cVar2 = cVar2.f3839c;
                    z2 = true;
                }
                if (z2) {
                    sb2.delete(sb2.length() - 2, sb2.length());
                }
                sb2.append(" )");
                return sb2.toString();
            case 15:
                String string = "[ ";
                if (((O0.f) this.f10936b) != null) {
                    for (int i5 = 0; i5 < 9; i5++) {
                        StringBuilder sbJ = N0.a.j(string);
                        sbJ.append(((O0.f) this.f10936b).f8793h[i5]);
                        sbJ.append(StringUtils.SPACE);
                        string = sbJ.toString();
                    }
                }
                StringBuilder sbQ = AbstractC0279p0.q(string, "] ");
                sbQ.append((O0.f) this.f10936b);
                return sbQ.toString();
            default:
                return super.toString();
        }
    }

    @Override // H6.e
    public H6.o zza(String str) {
        M m10 = U.f4562l;
        U u10 = C6.n.f1857D.f1863c;
        new G6.B((Context) this.f10936b, (String) this.f10937c, str, null).zzb();
        return H6.o.f4961a;
    }

    public /* synthetic */ c(int i5, boolean z2) {
        this.f10935a = i5;
    }

    public /* synthetic */ c(Object obj, int i5) {
        this.f10935a = i5;
        this.f10937c = obj;
    }

    public /* synthetic */ c(Object obj, boolean z2, Object obj2, int i5) {
        this.f10935a = i5;
        this.f10936b = obj;
        this.f10937c = obj2;
    }

    public c(WorkDatabase_Impl workDatabase_Impl) {
        this.f10935a = 0;
        this.f10936b = workDatabase_Impl;
        this.f10937c = new b(workDatabase_Impl, 0);
    }

    public c(int i5) {
        this.f10935a = i5;
        switch (i5) {
            case 4:
                this.f10936b = new C1581e(19);
                this.f10937c = new D0.b();
                break;
            case 5:
                this.f10936b = new F4.c(null);
                this.f10937c = new HashMap();
                break;
            case 6:
                this.f10936b = new W1.r(1000L);
                this.f10937c = Z4.d.a(10, new x4.d(18));
                break;
            case 23:
                this.f10936b = new ArrayList();
                this.f10937c = new HashMap();
                break;
            default:
                this.f10936b = new ReentrantLock();
                this.f10937c = new LinkedHashMap();
                break;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean zBooleanValue = bool.booleanValue();
        R8.m mVar = (R8.m) this.f10937c;
        if (!zBooleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            Iterator it = X8.c.h(((File) mVar.f10483g.f16186c).listFiles(R8.m.f10476t)).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            X8.c cVar = ((X8.a) mVar.f10488m.f2463b).f16180b;
            X8.a.a(X8.c.h(((File) cVar.f16188e).listFiles()));
            X8.a.a(X8.c.h(((File) cVar.f16189f).listFiles()));
            X8.a.a(X8.c.h(((File) cVar.f16190g).listFiles()));
            mVar.f10493r.trySetResult(null);
            return Tasks.forResult(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
        }
        boolean zBooleanValue2 = bool.booleanValue();
        R0.e eVar = mVar.f10478b;
        if (zBooleanValue2) {
            ((TaskCompletionSource) eVar.f10057i).trySetResult(null);
            return ((Task) this.f10936b).onSuccessTask(mVar.f10481e.f11034a, new e0(this, 19));
        }
        eVar.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    @Override // He.b
    public void onComplete() {
        ((He.b) this.f10936b).onComplete();
    }

    public c(L8.r rVar, InterfaceC3448d interfaceC3448d) {
        this.f10935a = 13;
        L l10 = new L();
        l10.f5891a = rVar;
        rVar.a(new B8.b(l10, 16));
        this.f10936b = l10;
        this.f10937c = interfaceC3448d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Context context, int i5) {
        this(context, new N2.e(1));
        this.f10935a = i5;
        switch (i5) {
            case 28:
                this.f10936b = context;
                break;
            default:
                break;
        }
    }

    public c(Context context, N2.e eVar) {
        this.f10935a = 20;
        this.f10936b = context.getApplicationContext();
        this.f10937c = eVar;
    }

    public c(Object obj) {
        this.f10935a = 1;
        P p10 = P.f7730f;
        this.f10936b = C0718d.G(obj, p10);
        C0718d.G(obj, P.f7730f);
        this.f10937c = C0718d.G(Boolean.FALSE, p10);
    }

    public c(tf.p pVar) {
        this.f10935a = 29;
        this.f10936b = pVar;
        this.f10937c = new C1259q();
    }

    public c(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10935a = 8;
        this.f10936b = cryptoInfo;
        this.f10937c = O0.e();
    }

    public c(l8.e0 e0Var, int[] iArr) {
        this.f10935a = 18;
        this.f10936b = AbstractC3409K.j(e0Var);
        this.f10937c = iArr;
    }

    public c(F5.d dVar) {
        this.f10935a = 9;
        this.f10936b = dVar;
        this.f10937c = new AtomicBoolean(false);
    }

    public c(z zVar) {
        this.f10935a = 24;
        this.f10937c = zVar;
        this.f10936b = new y(new byte[4], 4, 6, (byte) 0);
    }

    @Override // T5.x
    public void d(t tVar, J5.m mVar, T5.B b5) {
    }
}
