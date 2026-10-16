package G9;

import A7.L1;
import A7.T;
import Af.q;
import C4.i;
import Ef.H;
import Ef.S;
import G5.C0530k;
import G5.F;
import G5.InterfaceC0532m;
import G5.N;
import J8.C0635j;
import J8.C0636k;
import J8.J;
import J8.v;
import J8.z;
import K8.C0694f;
import K8.C0698j;
import K8.K;
import L4.s;
import L4.t;
import N1.C0764m;
import N1.C0765n;
import Q1.k;
import Q1.u;
import Q1.x;
import S3.l;
import T5.B;
import Y2.w;
import ad.AbstractC1364i;
import ad.C1355I;
import ad.C1361f;
import ad.C1363h;
import ad.P;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1451o;
import androidx.lifecycle.V;
import androidx.lifecycle.Y;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import be.EnumC1525a;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.moloco.sdk.acm.http.g;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.bidtoken.m;
import com.qonversion.android.sdk.dto.QonversionError;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.unity3d.services.core.network.model.HttpRequest;
import ea.C2486a;
import ea.C2487b;
import ef.C2532p;
import f0.AbstractC2547c;
import io.flutter.view.FlutterCallbackInformation;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jf.InterfaceC3108h;
import ka.AbstractC3230e0;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.KClass;
import me.C3558a;
import n3.C3592d;
import s2.C;
import s2.o;
import s8.j;
import uc.C4281r;

/* loaded from: classes4.dex */
public class e implements T, OnCompleteListener, s, P8.b, P8.a, P2.d, w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4684a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4685b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4686c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4687d;

    public e() {
        this.f4684a = 13;
        this.f4686c = new ArrayDeque();
        this.f4687d = null;
        this.f4685b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static void C(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public static void n(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ServerBidTokenCache", "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, false, 4, null);
    }

    public static final URL r(e eVar) {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority((String) eVar.f4687d).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C2487b c2487b = (C2487b) eVar.f4685b;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(c2487b.f34515a).appendPath("settings");
        C2486a c2486a = c2487b.f34516b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c2486a.f34512c).appendQueryParameter("display_version", c2486a.f34511b).build().toString());
    }

    public void A(int i5, String str, String str2) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i5));
        map.put("eventName", "onAppEvent");
        map.put(MediationMetaData.KEY_NAME, str);
        map.put(JsonStorageKeyNames.DATA_KEY, str2);
        w(map);
    }

    public void B(int i5, P p10) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i5));
        map.put("eventName", "onRewardedAdUserEarnedReward");
        map.put("rewardItem", p10);
        w(map);
    }

    public void D(Q0.e eVar, int i5, int i10, int i11) {
        int i12 = eVar.f9543b0;
        int i13 = eVar.f9545c0;
        eVar.f9543b0 = 0;
        eVar.f9545c0 = 0;
        eVar.O(i10);
        eVar.L(i11);
        if (i12 < 0) {
            eVar.f9543b0 = 0;
        } else {
            eVar.f9543b0 = i12;
        }
        if (i13 < 0) {
            eVar.f9545c0 = 0;
        } else {
            eVar.f9545c0 = i13;
        }
        Q0.e eVar2 = (Q0.e) this.f4687d;
        eVar2.f9595t0 = i5;
        eVar2.U();
    }

    public FileOutputStream E() throws IOException {
        File file = (File) this.f4686c;
        File file2 = (File) this.f4687d;
        if (file2.exists()) {
            C(file2, (File) this.f4685b);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e7) {
                throw new IOException("Failed to create new file " + file, e7);
            }
        }
    }

    public void F(AbstractC1364i abstractC1364i, int i5) {
        HashMap map = (HashMap) this.f4686c;
        if (map.get(Integer.valueOf(i5)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i5)));
        }
        map.put(Integer.valueOf(i5), abstractC1364i);
    }

    public void G(float[] fArr) {
        float[] fArrE = ((AbstractC2547c) this.f4685b).e(fArr);
        float[] fArr2 = (float[]) this.f4687d;
        if (fArr2 != null) {
            fArrE[0] = fArrE[0] * fArr2[0];
            fArrE[1] = fArrE[1] * fArr2[1];
            fArrE[2] = fArrE[2] * fArr2[2];
        }
        ((AbstractC2547c) this.f4686c).a(fArrE);
    }

    public void H() {
        W.d dVar = (W.d) this.f4685b;
        LinkedHashMap linkedHashMap = dVar.f14929b;
        String str = (String) this.f4686c;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((AbstractC3343n) this.f4687d);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        dVar.f14929b.put(str, list);
    }

    public void I(Q0.e eVar) {
        ArrayList arrayList = (ArrayList) this.f4685b;
        arrayList.clear();
        int size = eVar.f9592q0.size();
        for (int i5 = 0; i5 < size; i5++) {
            Q0.d dVar = (Q0.d) eVar.f9592q0.get(i5);
            int[] iArr = dVar.f9570p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(dVar);
            }
        }
        eVar.f9594s0.f10050b = true;
    }

    @Override // P2.d, h6.InterfaceC2787f
    public int a(long j8) {
        long[] jArr = (long[]) this.f4687d;
        int iA = x.a(jArr, j8, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    @Override // Y2.w
    public void b(u uVar, o oVar, B b5) {
        this.f4686c = uVar;
        b5.a();
        b5.b();
        C cMo0m = oVar.mo0m(b5.f11473e, 5);
        this.f4687d = cMo0m;
        cMo0m.c((C0765n) this.f4685b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Enum c(lf.AbstractC3464c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G9.e.c(lf.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(com.moloco.sdk.internal.services.bidtoken.m r10, lf.AbstractC3464c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G9.e.d(com.moloco.sdk.internal.services.bidtoken.m, lf.c):java.lang.Object");
    }

    @Override // Y2.w
    public void e(Q1.o oVar) {
        long jD;
        k.h((u) this.f4686c);
        int i5 = x.f9724a;
        u uVar = (u) this.f4686c;
        synchronized (uVar) {
            try {
                long j8 = uVar.f9719c;
                jD = j8 != -9223372036854775807L ? j8 + uVar.f9718b : uVar.d();
            } finally {
            }
        }
        long jE = ((u) this.f4686c).e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        C0765n c0765n = (C0765n) this.f4685b;
        if (jE != c0765n.f8237s) {
            C0764m c0764mA = c0765n.a();
            c0764mA.f8199r = jE;
            C0765n c0765n2 = new C0765n(c0764mA);
            this.f4685b = c0765n2;
            ((C) this.f4687d).c(c0765n2);
        }
        int iA = oVar.a();
        ((C) this.f4687d).e(iA, oVar);
        ((C) this.f4687d).a(jD, 1, iA, 0, null);
    }

    @Override // L4.s
    public Bitmap f(BitmapFactory.Options options) {
        t tVar = (t) ((i) this.f4685b).f1793b;
        tVar.reset();
        return BitmapFactory.decodeStream(tVar, null, options);
    }

    @Override // P2.d, h6.InterfaceC2787f
    public List g(long j8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (true) {
            List list = (List) this.f4685b;
            if (i5 >= list.size()) {
                break;
            }
            int i10 = i5 * 2;
            long[] jArr = (long[]) this.f4686c;
            if (jArr[i10] <= j8 && j8 < jArr[i10 + 1]) {
                X2.d dVar = (X2.d) list.get(i5);
                P1.b bVar = dVar.f16047a;
                if (bVar.f9024e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(bVar);
                }
            }
            i5++;
        }
        Collections.sort(arrayList2, new A0.f(8));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            P1.b bVar2 = ((X2.d) arrayList2.get(i11)).f16047a;
            arrayList.add(new P1.b(bVar2.f9020a, bVar2.f9021b, bVar2.f9022c, bVar2.f9023d, (-1) - i11, 1, bVar2.f9026g, bVar2.f9027h, bVar2.f9028i, bVar2.f9032n, bVar2.f9033o, bVar2.f9029j, bVar2.k, bVar2.f9030l, bVar2.f9031m, bVar2.f9034p, bVar2.f9035q));
        }
        return arrayList;
    }

    @Override // L4.s
    public void h() {
        t tVar = (t) ((i) this.f4685b).f1793b;
        synchronized (tVar) {
            tVar.f6929c = tVar.f6927a.length;
        }
    }

    @Override // L4.s
    public int i() {
        t tVar = (t) ((i) this.f4685b).f1793b;
        tVar.reset();
        return AbstractC3230e0.r((F4.f) this.f4686c, tVar, (ArrayList) this.f4687d);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(lf.AbstractC3464c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: G9.e.j(lf.c):java.lang.Object");
    }

    @Override // P2.d, h6.InterfaceC2787f
    public long k(int i5) {
        k.c(i5 >= 0);
        long[] jArr = (long[]) this.f4687d;
        k.c(i5 < jArr.length);
        return jArr[i5];
    }

    @Override // L4.s
    public ImageHeaderParser$ImageType l() {
        t tVar = (t) ((i) this.f4685b).f1793b;
        tVar.reset();
        return AbstractC3230e0.t((F4.f) this.f4686c, tVar, (ArrayList) this.f4687d);
    }

    @Override // P8.b
    public void m(Bundle bundle, String str) {
        CountDownLatch countDownLatch = (CountDownLatch) this.f4687d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public void o() {
        Ta.a aVar = (Ta.a) ((ArrayDeque) this.f4686c).poll();
        this.f4687d = aVar;
        if (aVar != null) {
            aVar.executeOnExecutor((ThreadPoolExecutor) this.f4685b, new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [J8.K] */
    /* JADX WARN: Type inference failed for: r6v3, types: [J8.J] */
    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        String str;
        String str2;
        String str3;
        boolean zIsSuccessful = task.isSuccessful();
        v vVar = (v) this.f4685b;
        if (zIsSuccessful) {
            str = ((K) task.getResult()).f6592a;
            str2 = ((K) task.getResult()).f6593b;
            str3 = ((K) task.getResult()).f6594c;
        } else {
            Exception exception = task.getException();
            Log.e("FirebaseAuth", exception != null ? R8.v.f("Error while validating application identity: ", exception.getMessage()) : "Error while validating application identity: ");
            if (exception != null && ((exception instanceof C0636k) || ((exception instanceof C0635j) && ((C0635j) exception).f5807a.endsWith("UNAUTHORIZED_DOMAIN")))) {
                FirebaseAuth.m((j) exception, vVar, (String) this.f4686c);
                return;
            }
            Log.e("FirebaseAuth", "Proceeding without any application identifier.");
            str3 = null;
            str = null;
            str2 = null;
        }
        long jLongValue = vVar.f5823b.longValue();
        String str4 = vVar.f5826e;
        Pc.T j8 = vVar.f5824c;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f4687d;
        C0694f c0694f = firebaseAuth.f27289g;
        String str5 = (String) c0694f.f6641c;
        if (str5 != null && ((String) c0694f.f6642d) != null && str4 != null && str4.equals(str5)) {
            j8 = new J8.K(firebaseAuth, j8);
        }
        if (TextUtils.isEmpty(str)) {
            K k = (K) task.getResult();
            if (!vVar.f5831j) {
                j8 = new J(firebaseAuth, vVar, k, j8);
            }
        }
        Pc.T t10 = j8;
        C0698j c0698j = vVar.f5829h;
        AbstractC1732v.i(c0698j);
        if (zzag.zzc(str3) && firebaseAuth.n() != null && firebaseAuth.n().I()) {
            str3 = "NO_RECAPTCHA";
        }
        String str6 = str3;
        if (c0698j.f6652a != null) {
            String str7 = vVar.f5826e;
            AbstractC1732v.i(str7);
            firebaseAuth.f27287e.zza(c0698j, str7, firebaseAuth.f27291i, jLongValue, vVar.f5828g != null, false, str, str2, str6, firebaseAuth.r(), (J8.x) t10, vVar.f5825d, vVar.f5827f);
        } else {
            z zVar = vVar.f5830i;
            AbstractC1732v.i(zVar);
            firebaseAuth.f27287e.zza(c0698j, zVar, firebaseAuth.f27291i, jLongValue, vVar.f5828g != null, false, str, str2, str6, firebaseAuth.r(), (J8.x) t10, vVar.f5825d, vVar.f5827f);
        }
    }

    @Override // P2.d, h6.InterfaceC2787f
    public int p() {
        return ((long[]) this.f4687d).length;
    }

    @Override // P8.a
    public void q(Bundle bundle) {
        synchronized (this.f4686c) {
            try {
                O8.c cVar = O8.c.f8921a;
                cVar.f("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f4687d = new CountDownLatch(1);
                ((l) this.f4685b).q(bundle);
                cVar.f("Awaiting app exception callback from Analytics...");
                try {
                    if (((CountDownLatch) this.f4687d).await(500, TimeUnit.MILLISECONDS)) {
                        cVar.f("App exception callback received from Analytics listener.");
                    } else {
                        cVar.g("Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                    }
                } catch (InterruptedException unused) {
                    Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
                }
                this.f4687d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(FileOutputStream fileOutputStream) throws IOException {
        boolean z2;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
            z2 = true;
        } catch (IOException unused) {
            z2 = false;
        }
        if (!z2) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e7) {
            Log.e("AtomicFile", "Failed to close file output stream", e7);
        }
        File file = (File) this.f4686c;
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    @Override // A7.T
    public void t(String str, int i5, IOException iOException, byte[] bArr, Map map) {
        ((L1) this.f4687d).w(true, i5, iOException, bArr, (String) this.f4685b, (ArrayList) this.f4686c);
    }

    public String toString() {
        switch (this.f4684a) {
            case 20:
                EnumC1525a enumC1525a = (EnumC1525a) this.f4685b;
                String str = enumC1525a.f19470a;
                String str2 = (String) this.f4686c;
                if (str2 == null) {
                    str2 = "";
                }
                return "NoCodesError: {code=" + enumC1525a + ", description=" + str + ", details=" + str2;
            case 29:
                StringBuilder sb2 = new StringBuilder("DartCallback( bundle path: ");
                sb2.append((String) this.f4686c);
                sb2.append(", library path: ");
                FlutterCallbackInformation flutterCallbackInformation = (FlutterCallbackInformation) this.f4687d;
                sb2.append(flutterCallbackInformation.callbackLibraryPath);
                sb2.append(", function: ");
                return wg.b.c(sb2, flutterCallbackInformation.callbackName, " )");
            default:
                return super.toString();
        }
    }

    public void u(FileOutputStream fileOutputStream) throws IOException {
        boolean z2;
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
            z2 = true;
        } catch (IOException unused) {
            z2 = false;
        }
        if (!z2) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e7) {
            Log.e("AtomicFile", "Failed to close file output stream", e7);
        }
        C((File) this.f4686c, (File) this.f4685b);
    }

    public b0 v(String key, KClass modelClass) {
        b0 viewModel;
        AbstractC3340k.e(modelClass, "modelClass");
        AbstractC3340k.e(key, "key");
        e0 e0Var = (e0) this.f4685b;
        e0Var.getClass();
        LinkedHashMap linkedHashMap = e0Var.f18667a;
        b0 b0Var = (b0) linkedHashMap.get(key);
        boolean zIsInstance = modelClass.isInstance(b0Var);
        d0 d0Var = (d0) this.f4686c;
        if (zIsInstance) {
            if (d0Var instanceof Y) {
                Y y10 = (Y) d0Var;
                AbstractC3340k.b(b0Var);
                AbstractC1451o abstractC1451o = y10.f18647d;
                if (abstractC1451o != null) {
                    C3592d c3592d = y10.f18648e;
                    AbstractC3340k.b(c3592d);
                    V.a(b0Var, c3592d, abstractC1451o);
                }
            }
            AbstractC3340k.c(b0Var, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return b0Var;
        }
        H1.c cVar = new H1.c((H1.b) this.f4687d);
        cVar.f4871a.put(I1.b.f5281a, key);
        try {
            try {
                viewModel = d0Var.q(modelClass, cVar);
            } catch (AbstractMethodError unused) {
                viewModel = d0Var.p(Fe.b.y(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            viewModel = d0Var.j(Fe.b.y(modelClass), cVar);
        }
        AbstractC3340k.e(viewModel, "viewModel");
        b0 b0Var2 = (b0) linkedHashMap.put(key, viewModel);
        if (b0Var2 != null) {
            b0Var2.a();
        }
        return viewModel;
    }

    public void w(HashMap map) {
        new Handler(Looper.getMainLooper()).post(new L7.b(this, false, map, 12));
    }

    public boolean x(int i5, Q0.d dVar, T0.e eVar) {
        int[] iArr = dVar.f9570p0;
        int i10 = iArr[0];
        R0.b bVar = (R0.b) this.f4686c;
        bVar.f10038a = i10;
        bVar.f10039b = iArr[1];
        bVar.f10040c = dVar.q();
        bVar.f10041d = dVar.k();
        bVar.f10046i = false;
        bVar.f10047j = i5;
        boolean z2 = bVar.f10038a == 3;
        boolean z10 = bVar.f10039b == 3;
        boolean z11 = z2 && dVar.f9536W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z12 = z10 && dVar.f9536W > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int[] iArr2 = dVar.f9574t;
        if (z11 && iArr2[0] == 4) {
            bVar.f10038a = 1;
        }
        if (z12 && iArr2[1] == 4) {
            bVar.f10039b = 1;
        }
        eVar.b(dVar, bVar);
        dVar.O(bVar.f10042e);
        dVar.L(bVar.f10043f);
        dVar.f9519E = bVar.f10045h;
        dVar.I(bVar.f10044g);
        bVar.f10047j = 0;
        return bVar.f10046i;
    }

    public void y(int i5, C1361f c1361f) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i5));
        map.put("eventName", "onAdFailedToLoad");
        map.put("loadAdError", c1361f);
        w(map);
    }

    public void z(int i5, x6.t tVar) {
        HashMap map = new HashMap();
        map.put("adId", Integer.valueOf(i5));
        map.put("eventName", "onAdLoaded");
        map.put("responseInfo", tVar == null ? null : new C1363h(tVar));
        w(map);
    }

    public /* synthetic */ e(int i5) {
        this.f4684a = i5;
    }

    public /* synthetic */ e(int i5, Object obj, Object obj2, Object obj3, boolean z2) {
        this.f4684a = i5;
        this.f4685b = obj2;
        this.f4686c = obj3;
        this.f4687d = obj;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i5) {
        this.f4684a = i5;
        this.f4685b = obj;
        this.f4686c = obj2;
        this.f4687d = obj3;
    }

    public e(C1355I c1355i, com.moloco.sdk.internal.services.k kVar) {
        this.f4684a = 22;
        this.f4685b = c1355i;
        this.f4686c = kVar;
        this.f4687d = new m("", "", com.moloco.sdk.internal.services.bidtoken.f.f29434a);
    }

    public e(g metricsRequest, com.moloco.sdk.acm.db.e metricsDAO, ab.b bVar, com.moloco.sdk.acm.http.a headers) {
        this.f4684a = 21;
        AbstractC3340k.e(metricsRequest, "metricsRequest");
        AbstractC3340k.e(metricsDAO, "metricsDAO");
        AbstractC3340k.e(headers, "headers");
        this.f4685b = metricsRequest;
        this.f4686c = metricsDAO;
        this.f4687d = headers;
    }

    public e(Set set, com.moloco.sdk.acm.recorder.c cVar) {
        this.f4684a = 23;
        this.f4685b = set;
        this.f4686c = cVar;
        this.f4687d = Fe.c.z(new q(this, 21));
    }

    public e(EnumC1525a code, String str, QonversionError qonversionError) {
        this.f4684a = 20;
        AbstractC3340k.e(code, "code");
        this.f4685b = code;
        this.f4686c = str;
        this.f4687d = qonversionError;
    }

    public e(C8.i iVar, X2.j jVar) {
        this.f4684a = 24;
        Lf.e eVar = S.f3698a;
        Kd.a aVarC = H.c(Lf.d.f7120b);
        this.f4685b = iVar;
        this.f4686c = aVarC;
        W9.u uVar = (W9.u) jVar.f16076c;
        C3558a c3558a = (C3558a) uVar.f15390b;
        this.f4687d = new Ce.a((C8.i) uVar.f15391c, (De.a) ((C2532p) c3558a.f40738c).getValue(), (Application) uVar.f15392d, c3558a.D());
    }

    public e(e0 store, d0 d0Var, H1.b extras) {
        this.f4684a = 6;
        AbstractC3340k.e(store, "store");
        AbstractC3340k.e(extras, "extras");
        this.f4685b = store;
        this.f4686c = d0Var;
        this.f4687d = extras;
    }

    public e(ArrayList arrayList) {
        this.f4684a = 16;
        this.f4685b = DesugarCollections.unmodifiableList(new ArrayList(arrayList));
        this.f4686c = new long[arrayList.size() * 2];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            X2.d dVar = (X2.d) arrayList.get(i5);
            int i10 = i5 * 2;
            long[] jArr = (long[]) this.f4686c;
            jArr[i10] = dVar.f16048b;
            jArr[i10 + 1] = dVar.f16049c;
        }
        long[] jArr2 = (long[]) this.f4686c;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f4687d = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public e(C2487b c2487b, InterfaceC3108h interfaceC3108h) {
        this.f4684a = 26;
        this.f4685b = c2487b;
        this.f4686c = interfaceC3108h;
        this.f4687d = "firebase-settings.crashlytics.com";
    }

    public e(F4.f fVar, InputStream inputStream, ArrayList arrayList) {
        this.f4684a = 8;
        gc.b.k(fVar, "Argument must not be null");
        this.f4686c = fVar;
        gc.b.k(arrayList, "Argument must not be null");
        this.f4687d = arrayList;
        this.f4685b = new i(inputStream, fVar);
    }

    public e(l lVar) {
        this.f4684a = 11;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f4686c = new Object();
        this.f4685b = lVar;
    }

    public e(String str) {
        this.f4684a = 17;
        C0764m c0764m = new C0764m();
        c0764m.f8194m = N1.C.m(str);
        this.f4685b = new C0765n(c0764m);
    }

    public e(C4281r c4281r) {
        this.f4684a = 19;
        this.f4687d = c4281r;
        this.f4686c = new HashMap();
    }

    public e(File file) {
        this.f4684a = 27;
        this.f4685b = file;
        this.f4686c = new File(file.getPath() + ".new");
        this.f4687d = new File(file.getPath() + ".bak");
    }

    public e(Q0.e eVar) {
        this.f4684a = 12;
        this.f4685b = new ArrayList();
        this.f4686c = new R0.b();
        this.f4687d = eVar;
    }

    public e(InterfaceC0532m[] interfaceC0532mArr) {
        this.f4684a = 5;
        N n10 = new N();
        G5.P p10 = new G5.P();
        p10.f4365c = 1.0f;
        p10.f4366d = 1.0f;
        C0530k c0530k = C0530k.f4421e;
        p10.f4367e = c0530k;
        p10.f4368f = c0530k;
        p10.f4369g = c0530k;
        p10.f4370h = c0530k;
        ByteBuffer byteBuffer = InterfaceC0532m.f4426a;
        p10.k = byteBuffer;
        p10.f4373l = byteBuffer.asShortBuffer();
        p10.f4374m = byteBuffer;
        p10.f4364b = -1;
        InterfaceC0532m[] interfaceC0532mArr2 = new InterfaceC0532m[interfaceC0532mArr.length + 2];
        this.f4685b = interfaceC0532mArr2;
        System.arraycopy(interfaceC0532mArr, 0, interfaceC0532mArr2, 0, interfaceC0532mArr.length);
        this.f4686c = n10;
        this.f4687d = p10;
        interfaceC0532mArr2[interfaceC0532mArr.length] = n10;
        interfaceC0532mArr2[interfaceC0532mArr.length + 1] = p10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(f0.AbstractC2547c r12, f0.AbstractC2547c r13, int r14) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 3
            r3 = 25
            r11.f4684a = r3
            r4 = 0
            long r5 = r12.f34739b
            long r7 = f0.AbstractC2546b.f34733a
            boolean r5 = f0.AbstractC2546b.a(r5, r7)
            if (r5 == 0) goto L17
            f0.c r5 = f0.h.a(r12)
            goto L18
        L17:
            r5 = r12
        L18:
            long r9 = r13.f34739b
            boolean r6 = f0.AbstractC2546b.a(r9, r7)
            if (r6 == 0) goto L25
            f0.c r6 = f0.h.a(r13)
            goto L26
        L25:
            r6 = r13
        L26:
            if (r14 != r2) goto L6d
            long r9 = r12.f34739b
            boolean r14 = f0.AbstractC2546b.a(r9, r7)
            long r9 = r13.f34739b
            boolean r7 = f0.AbstractC2546b.a(r9, r7)
            if (r14 == 0) goto L39
            if (r7 == 0) goto L39
            goto L6d
        L39:
            if (r14 != 0) goto L3d
            if (r7 == 0) goto L6d
        L3d:
            if (r14 == 0) goto L40
            goto L41
        L40:
            r12 = r13
        L41:
            f0.n r12 = (f0.n) r12
            float[] r13 = f0.h.f34770e
            f0.p r12 = r12.f34782d
            if (r14 == 0) goto L4e
            float[] r14 = r12.a()
            goto L4f
        L4e:
            r14 = r13
        L4f:
            if (r7 == 0) goto L55
            float[] r13 = r12.a()
        L55:
            r12 = r14[r4]
            r7 = r13[r4]
            float r12 = r12 / r7
            r7 = r14[r1]
            r8 = r13[r1]
            float r7 = r7 / r8
            r14 = r14[r0]
            r13 = r13[r0]
            float r14 = r14 / r13
            float[] r13 = new float[r2]
            r13[r4] = r12
            r13[r1] = r7
            r13[r0] = r14
            goto L6e
        L6d:
            r13 = 0
        L6e:
            r11.<init>(r5, r6, r13, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G9.e.<init>(f0.c, f0.c, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(W.d dVar, String str, tf.a aVar) {
        this.f4684a = 14;
        this.f4685b = dVar;
        this.f4686c = str;
        this.f4687d = (AbstractC3343n) aVar;
    }

    public e(io.flutter.plugins.firebase.messaging.a aVar) {
        this.f4684a = 18;
        this.f4687d = aVar;
        this.f4685b = Executors.newSingleThreadExecutor();
        this.f4686c = new Handler(Looper.getMainLooper());
    }

    public e(W1.t tVar) {
        this.f4684a = 15;
        this.f4687d = tVar;
        this.f4685b = new Handler(Looper.myLooper());
        this.f4686c = new F(this, 1);
    }
}
