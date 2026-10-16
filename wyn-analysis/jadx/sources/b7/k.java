package b7;

import A.C0230x;
import A.e0;
import A7.L1;
import A7.P1;
import A7.T;
import A7.V0;
import E5.Q;
import E5.S;
import Ef.H;
import G5.F;
import G5.G;
import Hf.k0;
import Hf.u0;
import Hf.v0;
import Hf.x0;
import J3.r;
import J5.w;
import J8.C0635j;
import J8.C0636k;
import J8.J;
import K8.C0694f;
import K8.K;
import L4.s;
import N1.C0764m;
import N1.C0765n;
import R1.q;
import T5.B;
import T5.x;
import Va.M6;
import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.AbstractServiceC1460y;
import androidx.lifecycle.C1459x;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.a0;
import c0.C1542g;
import c0.InterfaceC1540e;
import cb.AbstractC1593a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.V;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagz;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1988e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.M0;
import ef.C2515C;
import gd.C2746a;
import gd.C2747b;
import gd.C2750e;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugins.urllauncher.WebViewActivity;
import j9.C3091a;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import jc.ThreadFactoryC3098a;
import k3.C3184p;
import kotlin.jvm.internal.AbstractC3340k;
import oc.C3665d;
import org.json.JSONException;
import p9.C3778C;
import re.C3977a;
import re.C3980d;
import s2.C;
import s2.o;
import u6.AbstractC4256a;
import u6.t;
import u6.v;

/* loaded from: classes3.dex */
public final class k implements T, OnCompleteListener, s, Q4.a, x, V3.a, InterfaceC1540e, m1.g {

    /* renamed from: e, reason: collision with root package name */
    public static k f19393e;

    /* renamed from: f, reason: collision with root package name */
    public static k f19394f;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19395a;

    /* renamed from: b, reason: collision with root package name */
    public Object f19396b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19397c;

    /* renamed from: d, reason: collision with root package name */
    public Object f19398d;

    public k(int i5, Kd.a scope) {
        this.f19395a = 22;
        AbstractC3340k.e(scope, "scope");
        this.f19396b = scope;
        x0 x0VarC = k0.c(ic.d.c(i5, scope, null));
        this.f19397c = x0VarC;
        this.f19398d = k0.x(k0.j(new C1988e(this, null)), scope, new u0(), ((v0) x0VarC.getValue()).getValue());
    }

    public static synchronized k I(Context context) {
        return K(context.getApplicationContext());
    }

    public static synchronized k K(Context context) {
        k kVar = f19393e;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(context, 0);
        f19393e = kVar2;
        return kVar2;
    }

    public static String r(HashMap map, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return N0.a.g(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return N0.a.f(str, string);
    }

    public static Bundle w(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public static k z() {
        if (f19394f == null) {
            a2.k kVar = new a2.k();
            ThreadFactoryC3098a threadFactoryC3098a = new ThreadFactoryC3098a();
            threadFactoryC3098a.f38753a = 0;
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(threadFactoryC3098a);
            FlutterJNI flutterJNI = new FlutterJNI();
            C3665d c3665d = new C3665d();
            c3665d.f41474b = false;
            c3665d.f41477e = flutterJNI;
            c3665d.f41478f = executorServiceNewCachedThreadPool;
            k kVar2 = new k(27, false);
            kVar2.f19396b = c3665d;
            kVar2.f19397c = kVar;
            kVar2.f19398d = executorServiceNewCachedThreadPool;
            f19394f = kVar2;
        }
        return f19394f;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A(int r19) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.k.A(int):boolean");
    }

    public void B(ArrayList workSpecs) {
        AbstractC3340k.e(workSpecs, "workSpecs");
        synchronized (this.f19398d) {
            O3.b bVar = (O3.b) this.f19396b;
            if (bVar != null) {
                bVar.b(workSpecs);
            }
        }
    }

    public void C(Activity activity, D3.k kVar) {
        AbstractC3340k.e(activity, "activity");
        ReentrantLock reentrantLock = (ReentrantLock) this.f19397c;
        reentrantLock.lock();
        WeakHashMap weakHashMap = (WeakHashMap) this.f19398d;
        try {
            if (kVar.equals((D3.k) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((G3.l) ((e0) this.f19396b).f152b).f4223b.iterator();
            while (it.hasNext()) {
                G3.k kVar2 = (G3.k) it.next();
                if (kVar2.f4217a.equals(activity)) {
                    kVar2.f4219c = kVar;
                    kVar2.f4218b.accept(kVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public Boolean D(String str, Boolean bool, C2750e c2750e, C2746a c2746a) {
        if (((Activity) this.f19398d) == null) {
            throw new C2747b();
        }
        Bundle bundleW = w(c2750e.f35874c);
        if (bool.booleanValue()) {
            Iterator it = c2750e.f35874c.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                    lowerCase.getClass();
                    switch (lowerCase) {
                    }
                } else {
                    Uri uri = Uri.parse(str);
                    Activity activity = (Activity) this.f19398d;
                    C3778C c3778c = new C3778C();
                    ((Intent) c3778c.f43324c).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", c2746a.f35867a.booleanValue() ? 1 : 0);
                    u.k kVarB = c3778c.b();
                    kVarB.f46072a.putExtra("com.android.browser.headers", bundleW);
                    try {
                        kVarB.a(activity, uri);
                        return Boolean.TRUE;
                    } catch (ActivityNotFoundException unused) {
                    }
                }
            }
        }
        Activity activity2 = (Activity) this.f19398d;
        boolean zBooleanValue = c2750e.f35872a.booleanValue();
        boolean zBooleanValue2 = c2750e.f35873b.booleanValue();
        int i5 = WebViewActivity.f37184e;
        try {
            ((Activity) this.f19398d).startActivity(new Intent(activity2, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", zBooleanValue).putExtra("enableDomStorage", zBooleanValue2).putExtra("com.android.browser.headers", bundleW));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused2) {
            return Boolean.FALSE;
        }
    }

    public void E(EnumC1449m enumC1449m) {
        a0 a0Var = (a0) this.f19398d;
        if (a0Var != null) {
            a0Var.run();
        }
        a0 a0Var2 = new a0((C1459x) this.f19396b, enumC1449m);
        this.f19398d = a0Var2;
        ((Handler) this.f19397c).postAtFrontOfQueue(a0Var2);
    }

    public void F(Iterable workSpecs) {
        AbstractC3340k.e(workSpecs, "workSpecs");
        synchronized (this.f19398d) {
            try {
                for (P3.b bVar : (P3.b[]) this.f19397c) {
                    if (bVar.f9096e != null) {
                        bVar.f9096e = null;
                        bVar.d(null, bVar.f9095d);
                    }
                }
                for (P3.b bVar2 : (P3.b[]) this.f19397c) {
                    bVar2.c(workSpecs);
                }
                for (P3.b bVar3 : (P3.b[]) this.f19397c) {
                    if (bVar3.f9096e != this) {
                        bVar3.f9096e = this;
                        bVar3.d(this, bVar3.f9095d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void G() {
        synchronized (this.f19398d) {
            for (P3.b bVar : (P3.b[]) this.f19397c) {
                ArrayList arrayList = bVar.f9093b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    bVar.f9092a.b(bVar);
                }
            }
        }
    }

    public synchronized GoogleSignInAccount H() {
        return (GoogleSignInAccount) this.f19397c;
    }

    public synchronized void J() {
        b bVar = (b) this.f19396b;
        ReentrantLock reentrantLock = bVar.f19371a;
        reentrantLock.lock();
        try {
            bVar.f19372b.edit().clear().apply();
            reentrantLock.unlock();
            this.f19397c = null;
            this.f19398d = null;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // m1.g
    public Object a() {
        return null;
    }

    @Override // m1.g
    public Uri b() {
        return (Uri) this.f19396b;
    }

    @Override // T5.x
    public void c(Y4.b bVar) {
        long jC;
        AbstractC4256a.j((t) this.f19397c);
        int i5 = v.f46721a;
        t tVar = (t) this.f19397c;
        synchronized (tVar) {
            try {
                long j8 = tVar.f46719c;
                jC = j8 != -9223372036854775807L ? j8 + tVar.f46718b : tVar.c();
            } finally {
            }
        }
        long jD = ((t) this.f19397c).d();
        if (jC == -9223372036854775807L || jD == -9223372036854775807L) {
            return;
        }
        E5.T t10 = (E5.T) this.f19396b;
        if (jD != t10.f3242p) {
            S sA = t10.a();
            sA.f3208o = jD;
            E5.T t11 = new E5.T(sA);
            this.f19396b = t11;
            ((w) this.f19398d).a(t11);
        }
        int iA = bVar.a();
        ((w) this.f19398d).c(iA, bVar);
        ((w) this.f19398d).b(jC, 1, iA, 0, null);
    }

    @Override // T5.x
    public void d(t tVar, J5.m mVar, B b5) {
        this.f19397c = tVar;
        b5.a();
        b5.b();
        w wVarM = mVar.m(b5.f11473e, 5);
        this.f19398d = wVarM;
        wVarM.a((E5.T) this.f19396b);
    }

    @Override // Q4.a
    public E4.B e(E4.B b5, B4.g gVar) {
        Drawable drawable = (Drawable) b5.get();
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            return ((C0230x) this.f19397c).e(bitmap != null ? new L4.c((F4.a) this.f19396b, bitmap) : null, gVar);
        }
        if (drawable instanceof P4.c) {
            return ((Q4.c) this.f19398d).e(b5, gVar);
        }
        return null;
    }

    @Override // L4.s
    public Bitmap f(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(((C4.i) this.f19398d).e().getFileDescriptor(), null, options);
    }

    @Override // m1.g
    public ClipDescription getDescription() {
        return (ClipDescription) this.f19397c;
    }

    @Override // L4.s
    public int i() throws Throwable {
        L4.t tVar;
        C4.i iVar = (C4.i) this.f19398d;
        F4.f fVar = (F4.f) this.f19396b;
        ArrayList arrayList = (ArrayList) this.f19397c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            B4.c cVar = (B4.c) arrayList.get(i5);
            L4.t tVar2 = null;
            try {
                tVar = new L4.t(new FileInputStream(iVar.e().getFileDescriptor()), fVar);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int iA = cVar.a(tVar, fVar);
                try {
                    tVar.close();
                } catch (IOException unused) {
                }
                iVar.e();
                if (iA != -1) {
                    return iA;
                }
            } catch (Throwable th2) {
                th = th2;
                tVar2 = tVar;
                if (tVar2 != null) {
                    try {
                        tVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                iVar.e();
                throw th;
            }
        }
        return -1;
    }

    @Override // m1.g
    public Uri j() {
        return (Uri) this.f19398d;
    }

    public Object k(com.moloco.sdk.acm.eventprocessing.d dVar) throws Throwable {
        Lf.e eVar = Ef.S.f3698a;
        Object objP = H.P(Jf.n.f6132a.f4117e, new com.moloco.sdk.acm.services.c(this, null), dVar);
        return objP == kf.a.f39711a ? objP : C2515C.f34653a;
    }

    @Override // L4.s
    public ImageHeaderParser$ImageType l() throws Throwable {
        L4.t tVar;
        C4.i iVar = (C4.i) this.f19398d;
        F4.f fVar = (F4.f) this.f19396b;
        ArrayList arrayList = (ArrayList) this.f19397c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            B4.c cVar = (B4.c) arrayList.get(i5);
            L4.t tVar2 = null;
            try {
                tVar = new L4.t(new FileInputStream(iVar.e().getFileDescriptor()), fVar);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = cVar.c(tVar);
                try {
                    tVar.close();
                } catch (IOException unused) {
                }
                iVar.e();
                if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeC;
                }
            } catch (Throwable th2) {
                th = th2;
                tVar2 = tVar;
                if (tVar2 != null) {
                    try {
                        tVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                iVar.e();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public boolean m(String workSpecId) {
        P3.b bVar;
        boolean z2;
        AbstractC3340k.e(workSpecId, "workSpecId");
        synchronized (this.f19398d) {
            try {
                P3.b[] bVarArr = (P3.b[]) this.f19397c;
                int length = bVarArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i5];
                    bVar.getClass();
                    Object obj = bVar.f9095d;
                    if (obj != null && bVar.b(obj) && bVar.f9094c.contains(workSpecId)) {
                        break;
                    }
                    i5++;
                }
                if (bVar != null) {
                    r.d().a(O3.c.f8856a, "Work " + workSpecId + " constrained by " + bVar.getClass().getSimpleName());
                }
                z2 = bVar == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public Task n(int i5) {
        Bundle bundle = (Bundle) this.f19397c;
        if (bundle.getString("apiKey") == null) {
            throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
        }
        bundle.putInt("suffix", i5);
        f9.h hVar = (f9.h) this.f19396b;
        f9.h.c(bundle);
        return hVar.f35254a.doWrite(new V(bundle));
    }

    public Boolean o(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName componentNameResolveActivity = intent.resolveActivity(((K3.l) this.f19397c).f6493a.getPackageManager());
        return (componentNameResolveActivity == null ? null : componentNameResolveActivity.toShortString()) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [J8.J] */
    /* JADX WARN: Type inference failed for: r5v8, types: [J8.K] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        J8.v vVar = (J8.v) this.f19396b;
        if (!zIsSuccessful) {
            Exception exception = task.getException();
            AbstractC1593a.t("Error while validating application identity: ", exception != null ? exception.getMessage() : "", "FirebaseAuth");
            if (exception != null && ((exception instanceof C0636k) || ((exception instanceof C0635j) && ((C0635j) exception).f5807a.endsWith("UNAUTHORIZED_DOMAIN")))) {
                FirebaseAuth.m((s8.j) exception, vVar, (String) this.f19397c);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
        }
        K k = (K) task.getResult();
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f19398d;
        firebaseAuth.getClass();
        long jLongValue = vVar.f5823b.longValue();
        if (jLongValue < 0 || jLongValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String str = vVar.f5826e;
        AbstractC1732v.f(str);
        String str2 = k.f6594c;
        if (zzag.zzc(str2) && firebaseAuth.n() != null && firebaseAuth.n().I()) {
            str2 = "NO_RECAPTCHA";
        }
        String str3 = str2;
        boolean z2 = vVar.f5828g != null;
        String str4 = firebaseAuth.f27291i;
        String str5 = firebaseAuth.k;
        boolean zR = firebaseAuth.r();
        String str6 = k.f6592a;
        String str7 = k.f6593b;
        zzagz zzagzVar = new zzagz(str, jLongValue, z2, str4, str5, str6, str7, str3, zR);
        Pc.T j8 = vVar.f5824c;
        C0694f c0694f = firebaseAuth.f27289g;
        String str8 = (String) c0694f.f6641c;
        if (str8 != null && ((String) c0694f.f6642d) != null && str != null && str.equals(str8)) {
            j8 = new J8.K(firebaseAuth, j8);
        }
        if (TextUtils.isEmpty(k.f6592a)) {
            K k5 = new K(str6, str7, str3);
            if (!vVar.f5831j) {
                j8 = new J(firebaseAuth, vVar, k5, j8);
            }
        }
        firebaseAuth.f27287e.zza(firebaseAuth.f27283a, zzagzVar, j8, vVar.f5827f, vVar.f5825d);
    }

    public void p(boolean z2) {
        c0.r rVar;
        C1542g c1542g = (C1542g) this.f19396b;
        c0.r rVar2 = c1542g.f19500d;
        if (xg.g.q(c1542g, z2)) {
            int iOrdinal = rVar2.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                rVar = c0.r.f19534a;
            } else if (iOrdinal == 3 || iOrdinal == 4) {
                rVar = c0.r.f19537d;
            } else {
                if (iOrdinal != 5) {
                    throw new Q((byte) 0, 9);
                }
                rVar = c0.r.f19539f;
            }
            c1542g.e0(rVar);
        }
    }

    public void q(o oVar, B b5) {
        int i5 = 0;
        while (true) {
            C[] cArr = (C[]) this.f19397c;
            if (i5 >= cArr.length) {
                return;
            }
            b5.a();
            b5.b();
            C cMo0m = oVar.mo0m(b5.f11473e, 3);
            C0765n c0765n = (C0765n) ((List) this.f19396b).get(i5);
            String str = c0765n.f8232n;
            Q1.k.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c0765n.f8220a;
            if (str2 == null) {
                b5.b();
                str2 = b5.f11474f;
            }
            C0764m c0764m = new C0764m();
            c0764m.f8183a = str2;
            c0764m.f8194m = N1.C.m(str);
            c0764m.f8187e = c0765n.f8224e;
            c0764m.f8186d = c0765n.f8223d;
            c0764m.f8178G = c0765n.f8215H;
            c0764m.f8197p = c0765n.f8235q;
            M6.y(c0764m, cMo0m);
            cArr[i5] = cMo0m;
            i5++;
        }
    }

    public void s(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        HashMap map = (HashMap) this.f19397c;
        HashMap map2 = (HashMap) this.f19396b;
        k9.f fVar = new k9.f(byteArrayOutputStream, map2, map, (C3091a) this.f19398d);
        if (obj == null) {
            return;
        }
        h9.e eVar = (h9.e) map2.get(obj.getClass());
        if (eVar != null) {
            eVar.encode(obj, fVar);
        } else {
            throw new h9.b("No encoder for " + obj.getClass());
        }
    }

    @Override // A7.T
    public void t(String str, int i5, IOException iOException, byte[] bArr, Map map) {
        switch (this.f19395a) {
            case 1:
                ((L1) this.f19398d).w(true, i5, iOException, bArr, (String) this.f19396b, (ArrayList) this.f19397c);
                break;
            default:
                ((L1) this.f19398d).s((String) this.f19396b, i5, iOException, bArr, (P1) this.f19397c);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Va.Aa u() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            java.lang.String r1 = "GET Request URL: "
            S8.f.b()
            r2 = 0
            java.lang.Object r3 = r8.f19396b     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r4 = r8.f19397c     // Catch: java.lang.Throwable -> Lbd
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lbd
            java.lang.String r3 = r(r4, r3)     // Catch: java.lang.Throwable -> Lb8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb8
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lb8
            r4.append(r3)     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> Lb8
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L2e
            android.util.Log.v(r0, r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L2e
        L2b:
            r0 = move-exception
            goto Lbb
        L2e:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb8
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lb8
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb8
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lb8
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r1 = r8.f19398d     // Catch: java.lang.Throwable -> L6e
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L6e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L6e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L6e
        L52:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto L70
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L6e
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6e
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L6e
            goto L52
        L6e:
            r1 = move-exception
            goto Lbf
        L70:
            r0.connect()     // Catch: java.lang.Throwable -> L6e
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L6e
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L6e
            if (r3 == 0) goto La6
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La3
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> La3
            r2.<init>(r4)     // Catch: java.lang.Throwable -> La3
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3
            r5.<init>()     // Catch: java.lang.Throwable -> La3
        L92:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> La3
            r7 = -1
            if (r6 == r7) goto L9e
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> La3
            goto L92
        L9e:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> La3
            goto La6
        La3:
            r1 = move-exception
            r2 = r3
            goto Lbf
        La6:
            if (r3 == 0) goto Lab
            r3.close()
        Lab:
            r0.disconnect()
            Va.Aa r0 = new Va.Aa
            r0.<init>()
            r0.f13191a = r1
            r0.f13192b = r2
            return r0
        Lb8:
            r1 = move-exception
        Lb9:
            r0 = r2
            goto Lbf
        Lbb:
            r1 = r0
            goto Lb9
        Lbd:
            r0 = move-exception
            goto Lbb
        Lbf:
            if (r2 == 0) goto Lc4
            r2.close()
        Lc4:
            if (r0 == 0) goto Lc9
            r0.disconnect()
        Lc9:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.k.u():Va.Aa");
    }

    public void v(Runnable runnable) {
        ((T3.m) this.f19396b).execute(runnable);
    }

    public void x(String str, String str2) {
        ((HashMap) this.f19398d).put(str, str2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020a A[Catch: all -> 0x0226, TRY_ENTER, TryCatch #1 {all -> 0x0226, blocks: (B:7:0x0028, B:9:0x003b, B:12:0x0042, B:161:0x020a, B:162:0x020d, B:165:0x0215, B:168:0x021b, B:171:0x0221, B:172:0x0224, B:175:0x0229, B:16:0x004e), top: B:228:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021b A[Catch: all -> 0x0226, TryCatch #1 {all -> 0x0226, blocks: (B:7:0x0028, B:9:0x003b, B:12:0x0042, B:161:0x020a, B:162:0x020d, B:165:0x0215, B:168:0x021b, B:171:0x0221, B:172:0x0224, B:175:0x0229, B:16:0x004e), top: B:228:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y(t6.InterfaceC4144l r23, android.net.Uri r24, java.util.Map r25, long r26, long r28, f6.C2584N r30) throws N5.d {
        /*
            Method dump skipped, instructions count: 924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.k.y(t6.l, android.net.Uri, java.util.Map, long, long, f6.N):void");
    }

    public /* synthetic */ k(int i5, Object obj, Object obj2, Object obj3, boolean z2) {
        this.f19395a = i5;
        this.f19396b = obj;
        this.f19397c = obj2;
        this.f19398d = obj3;
    }

    public /* synthetic */ k(int i5, boolean z2) {
        this.f19395a = i5;
    }

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i5) {
        this.f19395a = i5;
        this.f19396b = obj2;
        this.f19397c = obj3;
        this.f19398d = obj;
    }

    public k(Context context, int i5) {
        GoogleSignInOptions googleSignInOptionsW;
        String strD;
        this.f19395a = i5;
        switch (i5) {
            case 16:
                this.f19396b = context.getApplicationContext();
                this.f19397c = k4.d.f39263a;
                this.f19398d = new k4.i();
                break;
            case 26:
                K3.l lVar = new K3.l(context);
                this.f19396b = context;
                this.f19397c = lVar;
                break;
            default:
                b bVarA = b.a(context);
                this.f19396b = bVarA;
                this.f19397c = bVarA.b();
                String strD2 = bVarA.d("defaultGoogleSignInAccount");
                if (TextUtils.isEmpty(strD2) || (strD = bVarA.d(b.f("googleSignInOptions", strD2))) == null) {
                    googleSignInOptionsW = null;
                } else {
                    try {
                        googleSignInOptionsW = GoogleSignInOptions.W(strD);
                    } catch (JSONException unused) {
                    }
                }
                this.f19398d = googleSignInOptionsW;
                break;
        }
    }

    @Override // m1.g
    public void g() {
    }

    @Override // L4.s
    public void h() {
    }

    public k(AbstractC1451o lifecycle, com.moloco.sdk.acm.services.b bVar) {
        this.f19395a = 21;
        AbstractC3340k.e(lifecycle, "lifecycle");
        this.f19396b = lifecycle;
        this.f19397c = bVar;
        this.f19398d = new AtomicBoolean(false);
    }

    public k(List list, List list2) {
        this.f19395a = 23;
        L0 vastTracker = M0.a();
        AbstractC3340k.e(vastTracker, "vastTracker");
        this.f19396b = list;
        this.f19397c = list2;
        this.f19398d = vastTracker;
    }

    public k(Application application, C3980d c3980d, C3184p c3184p, C3977a c3977a) {
        this.f19395a = 18;
        this.f19396b = c3980d;
        this.f19397c = c3184p;
        this.f19398d = c3977a;
    }

    public k(AbstractServiceC1460y abstractServiceC1460y) {
        this.f19395a = 19;
        this.f19396b = new C1459x(abstractServiceC1460y);
        this.f19397c = new Handler();
    }

    public k(ExecutorService executorService) {
        this.f19395a = 13;
        this.f19397c = new Handler(Looper.getMainLooper());
        this.f19398d = new V0(this, 1);
        this.f19396b = new T3.m(executorService);
    }

    public k(HashMap map, String str) {
        this.f19395a = 15;
        this.f19396b = str;
        this.f19397c = map;
        this.f19398d = new HashMap();
    }

    public k(List list) {
        this.f19395a = 17;
        this.f19396b = list;
        this.f19397c = new C[list.size()];
        this.f19398d = new q(new S8.b(this, 17));
    }

    public k(String str) {
        this.f19395a = 12;
        S s10 = new S();
        s10.k = str;
        this.f19396b = new E5.T(s10);
    }

    public k(J5.i iVar) {
        this.f19395a = 25;
        this.f19396b = iVar;
    }

    public k(S3.n trackers, O3.b bVar) {
        this.f19395a = 10;
        AbstractC3340k.e(trackers, "trackers");
        Q3.f tracker = (Q3.f) trackers.f10970a;
        AbstractC3340k.e(tracker, "tracker");
        P3.a aVar = new P3.a(tracker, 0);
        Q3.a tracker2 = (Q3.a) trackers.f10971b;
        AbstractC3340k.e(tracker2, "tracker");
        P3.a aVar2 = new P3.a(tracker2, 1);
        Q3.f tracker3 = (Q3.f) trackers.f10973d;
        AbstractC3340k.e(tracker3, "tracker");
        P3.a aVar3 = new P3.a(tracker3, 4);
        Q3.f tracker4 = (Q3.f) trackers.f10972c;
        AbstractC3340k.e(tracker4, "tracker");
        P3.a aVar4 = new P3.a(tracker4, 2);
        AbstractC3340k.e(tracker4, "tracker");
        P3.a aVar5 = new P3.a(tracker4, 3);
        AbstractC3340k.e(tracker4, "tracker");
        P3.d dVar = new P3.d(tracker4);
        AbstractC3340k.e(tracker4, "tracker");
        P3.b[] bVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, dVar, new P3.c(tracker4)};
        this.f19396b = bVar;
        this.f19397c = bVarArr;
        this.f19398d = new Object();
    }

    public k(ParcelFileDescriptor parcelFileDescriptor, ArrayList arrayList, F4.f fVar) {
        this.f19395a = 8;
        gc.b.k(fVar, "Argument must not be null");
        this.f19396b = fVar;
        gc.b.k(arrayList, "Argument must not be null");
        this.f19397c = arrayList;
        this.f19398d = new C4.i(parcelFileDescriptor);
    }

    public k(f9.h hVar) {
        this.f19395a = 24;
        this.f19396b = hVar;
        Bundle bundle = new Bundle();
        this.f19397c = bundle;
        s8.g gVar = hVar.f35256c;
        gVar.a();
        bundle.putString("apiKey", gVar.f45330c.f45343a);
        Bundle bundle2 = new Bundle();
        this.f19398d = bundle2;
        bundle.putBundle("parameters", bundle2);
    }

    public k(O1.d[] dVarArr) {
        this.f19395a = 14;
        W1.x xVar = new W1.x();
        O1.g gVar = new O1.g();
        gVar.f8837c = 1.0f;
        gVar.f8838d = 1.0f;
        O1.b bVar = O1.b.f8801e;
        gVar.f8839e = bVar;
        gVar.f8840f = bVar;
        gVar.f8841g = bVar;
        gVar.f8842h = bVar;
        ByteBuffer byteBuffer = O1.d.f8806a;
        gVar.k = byteBuffer;
        gVar.f8845l = byteBuffer.asShortBuffer();
        gVar.f8846m = byteBuffer;
        gVar.f8836b = -1;
        O1.d[] dVarArr2 = new O1.d[dVarArr.length + 2];
        this.f19396b = dVarArr2;
        System.arraycopy(dVarArr, 0, dVarArr2, 0, dVarArr.length);
        this.f19397c = xVar;
        this.f19398d = gVar;
        dVarArr2[dVarArr.length] = xVar;
        dVarArr2[dVarArr.length + 1] = gVar;
    }

    public k(int i5) {
        this.f19395a = i5;
        switch (i5) {
            case 20:
                C1542g c1542g = new C1542g();
                this.f19396b = c1542g;
                a2.v vVar = c0.k.f19514a;
                this.f19397c = c1542g.g(c0.k.f19515b);
                break;
            default:
                List list = Collections.EMPTY_LIST;
                this.f19396b = list;
                this.f19397c = list;
                break;
        }
    }

    public k(e0 e0Var) {
        this.f19395a = 4;
        this.f19396b = e0Var;
        this.f19397c = new ReentrantLock();
        this.f19398d = new WeakHashMap();
    }

    public k(G g9) {
        this.f19395a = 5;
        this.f19398d = g9;
        this.f19396b = new Handler(Looper.myLooper());
        this.f19397c = new F(this, 0);
    }
}
