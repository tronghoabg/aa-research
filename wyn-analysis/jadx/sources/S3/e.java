package S3;

import A7.O0;
import E4.C0437f;
import E4.G;
import E5.S;
import E5.T;
import J3.v;
import J3.w;
import L4.t;
import Q1.u;
import T5.B;
import Wf.C1252j;
import Wf.m0;
import Y2.x;
import Y2.y;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.E;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.p002firebaseauthapi.zzadk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.internal.RecaptchaActivity;
import com.unity3d.ads.metadata.MediationMetaData;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import k3.C3185q;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import l8.AbstractC3409K;
import l8.e0;
import p7.AbstractC3772b;
import p9.C3778C;
import u6.AbstractC4256a;
import uc.InterfaceC4279p;
import x6.InterfaceC4486q;
import y3.C4552j;

/* loaded from: classes.dex */
public final class e implements D3.h, C4.d, H6.e, w, OnCompleteListener, L4.l, w8.b, He.o, He.h, J5.e, k1.r, m0, InterfaceC4279p, Y2.w, InterfaceC4486q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10940a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10941b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10942c;

    public /* synthetic */ e(int i5, Object obj, Object obj2) {
        this.f10940a = i5;
        this.f10941b = obj2;
        this.f10942c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static S3.e j(android.content.Context r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L31 java.lang.Error -> L35 java.io.IOException -> L37
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L2a java.lang.Error -> L2d java.io.IOException -> L2f
            S3.e r2 = new S3.e     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            r3 = 13
            r4 = 0
            r2.<init>(r5, r4, r0, r3)     // Catch: java.nio.channels.OverlappingFileLockException -> L24 java.lang.Error -> L26 java.io.IOException -> L28
            return r2
        L24:
            r2 = move-exception
            goto L39
        L26:
            r2 = move-exception
            goto L39
        L28:
            r2 = move-exception
            goto L39
        L2a:
            r2 = move-exception
        L2b:
            r0 = r1
            goto L39
        L2d:
            r2 = move-exception
            goto L2b
        L2f:
            r2 = move-exception
            goto L2b
        L31:
            r2 = move-exception
        L32:
            r5 = r1
            r0 = r5
            goto L39
        L35:
            r2 = move-exception
            goto L32
        L37:
            r2 = move-exception
            goto L32
        L39:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L45
            r0.release()     // Catch: java.io.IOException -> L45
        L45:
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.e.j(android.content.Context):S3.e");
    }

    public static String n(int i5) {
        return String.format("%d.%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(i5 & 255), Integer.valueOf((i5 >> 8) & 255), Integer.valueOf((i5 >> 16) & 255), Integer.valueOf((i5 >> 24) & 255)}, 4));
    }

    @Override // He.o, He.h
    public void a(Je.b bVar) {
        switch (this.f10940a) {
            case 14:
                Me.a.c((Se.i) this.f10941b, bVar);
                break;
            case 17:
                Me.a.e((Se.q) this.f10942c, bVar);
                break;
            default:
                ((He.o) this.f10941b).a(bVar);
                break;
        }
    }

    @Override // C4.d
    public void c(Exception exc) {
        G g9 = (G) this.f10942c;
        I4.o oVar = (I4.o) this.f10941b;
        I4.o oVar2 = g9.f2860f;
        if (oVar2 == null || oVar2 != oVar) {
            return;
        }
        C0437f c0437f = g9.f2861g;
        C4.e eVar = oVar.f5355c;
        g9.f2856b.b(c0437f, exc, eVar, eVar.d());
    }

    @Override // L4.l
    public void d(F4.a aVar, Bitmap bitmap) throws IOException {
        IOException iOException = ((Y4.f) this.f10942c).f16688b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            aVar.f(bitmap);
            throw iOException;
        }
    }

    @Override // Y2.w
    public void e(Q1.o oVar) {
        y yVar;
        if (oVar.u() == 0 && (oVar.u() & 128) != 0) {
            oVar.H(6);
            int iA = oVar.a() / 4;
            int i5 = 0;
            while (true) {
                yVar = (y) this.f10942c;
                if (i5 >= iA) {
                    break;
                }
                J5.y yVar2 = (J5.y) this.f10941b;
                oVar.f(0, 4, yVar2.f5695b);
                yVar2.q(0);
                int i10 = yVar2.i(16);
                yVar2.t(3);
                if (i10 == 0) {
                    yVar2.t(13);
                } else {
                    int i11 = yVar2.i(13);
                    if (yVar.f16616h.get(i11) == null) {
                        yVar.f16616h.put(i11, new x(new N2.j(yVar, i11)));
                        yVar.f16621n++;
                    }
                }
                i5++;
            }
            if (yVar.f16609a != 2) {
                yVar.f16616h.remove(0);
            }
        }
    }

    @Override // w8.b
    public void f(int i5, Bundle bundle) {
        Locale locale = Locale.US;
        String str = "Analytics listener received message. ID: " + i5 + ", Extras: " + bundle;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
        String string = bundle.getString(MediationMetaData.KEY_NAME);
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            P8.b bVar = "clx".equals(bundle2.getString("_o")) ? (G9.e) this.f10941b : (C4552j) this.f10942c;
            if (bVar == null) {
                return;
            }
            bVar.m(bundle2, string);
        }
    }

    @Override // Wf.m0
    public KSerializer g(KClass kClass) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f10942c;
        Class clsY = Fe.b.y(kClass);
        Object c1252j = concurrentHashMap.get(clsY);
        if (c1252j == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsY, (c1252j = new C1252j((KSerializer) ((tf.l) this.f10941b).invoke(kClass))))) != null) {
            c1252j = objPutIfAbsent;
        }
        return ((C1252j) c1252j).f15608a;
    }

    @Override // L4.l
    public void h() {
        t tVar = (t) this.f10941b;
        synchronized (tVar) {
            tVar.f6929c = tVar.f6927a.length;
        }
    }

    @Override // C4.d
    public void i(Object obj) {
        G g9 = (G) this.f10942c;
        I4.o oVar = (I4.o) this.f10941b;
        I4.o oVar2 = g9.f2860f;
        if (oVar2 == null || oVar2 != oVar) {
            return;
        }
        E4.m mVar = g9.f2855a.f2893p;
        if (obj != null && mVar.a(oVar.f5355c.d())) {
            g9.f2859e = obj;
            g9.f2856b.o();
            return;
        }
        B4.d dVar = oVar.f5353a;
        C4.e eVar = oVar.f5355c;
        g9.f2856b.a(dVar, obj, eVar, eVar.d(), g9.f2861g);
    }

    public void k(long j8, Y4.b bVar) {
        if (bVar.a() < 9) {
            return;
        }
        int iD = bVar.d();
        int iD2 = bVar.d();
        int iQ = bVar.q();
        if (iD == 434 && iD2 == 1195456820 && iQ == 3) {
            Fe.g.x(j8, bVar, (J5.w[]) this.f10942c);
        }
    }

    public void l() throws IOException {
        String str = (String) this.f10941b;
        try {
            X8.c cVar = (X8.c) this.f10942c;
            cVar.getClass();
            new File((File) cVar.f16186c, str).createNewFile();
        } catch (IOException e7) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e7);
        }
    }

    public void m(J5.m mVar, B b5) {
        int i5 = 0;
        while (true) {
            J5.w[] wVarArr = (J5.w[]) this.f10942c;
            if (i5 >= wVarArr.length) {
                return;
            }
            b5.a();
            b5.b();
            J5.w wVarM = mVar.m(b5.f11473e, 3);
            T t10 = (T) ((List) this.f10941b).get(i5);
            String str = t10.f3238l;
            AbstractC4256a.d("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            S s10 = new S();
            b5.b();
            s10.f3195a = b5.f11474f;
            s10.k = str;
            s10.f3198d = t10.f3231d;
            s10.f3197c = t10.f3230c;
            s10.f3193C = t10.f3225D;
            s10.f3206m = t10.f3240n;
            wVarM.a(new T(s10));
            wVarArr[i5] = wVarM;
            i5++;
        }
    }

    public Long o(String str) {
        C3185q c3185qD = C3185q.d(1, "SELECT long_value FROM Preference where `key`=?");
        c3185qD.x(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10941b;
        workDatabase_Impl.b();
        Cursor cursorL = workDatabase_Impl.l(c3185qD);
        try {
            Long lValueOf = null;
            if (cursorL.moveToFirst() && !cursorL.isNull(0)) {
                lValueOf = Long.valueOf(cursorL.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorL.close();
            c3185qD.h();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        RecaptchaActivity recaptchaActivity = (RecaptchaActivity) this.f10941b;
        recaptchaActivity.getClass();
        ResolveInfo resolveInfoResolveActivity = recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0);
        String str = (String) this.f10942c;
        if (resolveInfoResolveActivity == null) {
            Log.e("RecaptchaActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzadk.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> listQueryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            recaptchaActivity.startActivity(intent);
            return;
        }
        u.k kVarB = new C3778C().b();
        Intent intent2 = kVarB.f46072a;
        intent2.addFlags(1073741824);
        intent2.addFlags(268435456);
        kVarB.a(recaptchaActivity, (Uri) task.getResult());
    }

    @Override // He.o, He.h
    public void onError(Throwable th) {
        switch (this.f10940a) {
            case 14:
                ((He.o) this.f10942c).onError(th);
                break;
            case 17:
                ((He.h) this.f10941b).onError(th);
                break;
            default:
                ((He.o) this.f10941b).onError(th);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c2  */
    @Override // uc.InterfaceC4279p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMethodCall(uc.C4278o r12, uc.InterfaceC4280q r13) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.e.onMethodCall(uc.o, uc.q):void");
    }

    @Override // He.o
    public void onSuccess(Object obj) {
        switch (this.f10940a) {
            case 14:
                ((He.o) this.f10942c).onSuccess(obj);
                break;
            case 17:
                ((He.h) this.f10941b).onSuccess(obj);
                break;
            default:
                He.o oVar = (He.o) this.f10941b;
                try {
                    ((Le.b) ((Ue.a) this.f10942c).f12793c).accept(obj);
                    oVar.onSuccess(obj);
                    break;
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    oVar.onError(th);
                }
        }
    }

    public String p() {
        Object next;
        InetAddress address;
        LinkProperties linkProperties;
        if (Build.VERSION.SDK_INT >= 31) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f10942c;
            List<LinkAddress> linkAddresses = (connectivityManager == null || (linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork())) == null) ? null : linkProperties.getLinkAddresses();
            if (linkAddresses != null) {
                Iterator<T> it = linkAddresses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    String hostAddress = ((LinkAddress) next).getAddress().getHostAddress();
                    if (hostAddress != null ? Bf.k.o0(hostAddress, '.') : false) {
                        break;
                    }
                }
                LinkAddress linkAddress = (LinkAddress) next;
                if (linkAddress != null && (address = linkAddress.getAddress()) != null) {
                    return address.getHostAddress();
                }
            }
        } else {
            WifiInfo connectionInfo = ((WifiManager) this.f10941b).getConnectionInfo();
            AbstractC3340k.d(connectionInfo, "getConnectionInfo(...)");
            int ipAddress = connectionInfo.getIpAddress();
            if (ipAddress != 0) {
                return n(ipAddress);
            }
        }
        return null;
    }

    public void q(d dVar) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f10941b;
        workDatabase_Impl.b();
        workDatabase_Impl.c();
        try {
            ((b) this.f10942c).x(dVar);
            workDatabase_Impl.n();
        } finally {
            workDatabase_Impl.j();
        }
    }

    public void r(Fe.c cVar) {
        ((E) this.f10941b).h(cVar);
        boolean z2 = cVar instanceof v;
        U3.j jVar = (U3.j) this.f10942c;
        if (z2) {
            jVar.i((v) cVar);
        } else if (cVar instanceof J3.t) {
            jVar.j(((J3.t) cVar).f5588a);
        }
    }

    @Override // J5.e, s2.g
    public void s() {
        byte[] bArr = u6.v.f46726f;
        Y4.b bVar = (Y4.b) this.f10942c;
        bVar.getClass();
        bVar.y(bArr.length, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118 A[EDGE_INSN: B:68:0x0118->B:52:0x0118 BREAK  A[LOOP:1: B:38:0x00df->B:51:0x0107], SYNTHETIC] */
    @Override // J5.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public J5.d t(J5.h r17, long r18) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.e.t(J5.h, long):J5.d");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(java.lang.Throwable r9) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.e.u(java.lang.Throwable):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    @Override // k1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k1.v0 v(android.view.View r17, k1.v0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.Object r3 = r0.f10942c
            G5.c r3 = (G5.C0522c) r3
            int r4 = r3.f4405a
            java.lang.Object r5 = r0.f10941b
            E4.F r5 = (E4.F) r5
            k1.s0 r6 = r2.f38877a
            r7 = 519(0x207, float:7.27E-43)
            b1.c r7 = r6.f(r7)
            r8 = 32
            b1.c r6 = r6.f(r8)
            int r8 = r7.f19122b
            java.lang.Object r9 = r5.f2854c
            com.google.android.material.bottomsheet.BottomSheetBehavior r9 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r9
            r9.f26839w = r8
            boolean r8 = W7.k.e(r1)
            int r10 = r1.getPaddingBottom()
            int r11 = r1.getPaddingLeft()
            int r12 = r1.getPaddingRight()
            boolean r13 = r9.f26831o
            if (r13 == 0) goto L43
            int r10 = r2.a()
            r9.f26838v = r10
            int r14 = r3.f4407c
            int r10 = r10 + r14
        L43:
            int r3 = r3.f4406b
            boolean r14 = r9.f26832p
            int r15 = r7.f19121a
            if (r14 == 0) goto L51
            if (r8 == 0) goto L4f
            r11 = r3
            goto L50
        L4f:
            r11 = r4
        L50:
            int r11 = r11 + r15
        L51:
            boolean r14 = r9.f26833q
            int r0 = r7.f19123c
            if (r14 == 0) goto L5d
            if (r8 == 0) goto L5a
            goto L5b
        L5a:
            r4 = r3
        L5b:
            int r12 = r4 + r0
        L5d:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            boolean r4 = r9.f26835s
            r8 = 1
            if (r4 == 0) goto L70
            int r4 = r3.leftMargin
            if (r4 == r15) goto L70
            r3.leftMargin = r15
            r4 = r8
            goto L71
        L70:
            r4 = 0
        L71:
            boolean r14 = r9.f26836t
            if (r14 == 0) goto L7c
            int r14 = r3.rightMargin
            if (r14 == r0) goto L7c
            r3.rightMargin = r0
            r4 = r8
        L7c:
            boolean r0 = r9.f26837u
            if (r0 == 0) goto L89
            int r0 = r3.topMargin
            int r7 = r7.f19122b
            if (r0 == r7) goto L89
            r3.topMargin = r7
            goto L8a
        L89:
            r8 = r4
        L8a:
            if (r8 == 0) goto L8f
            r1.setLayoutParams(r3)
        L8f:
            int r0 = r1.getPaddingTop()
            r1.setPadding(r11, r0, r12, r10)
            boolean r0 = r5.f2853b
            if (r0 == 0) goto L9e
            int r1 = r6.f19124d
            r9.f26829m = r1
        L9e:
            if (r13 != 0) goto La4
            if (r0 == 0) goto La3
            goto La4
        La3:
            return r2
        La4:
            r9.G()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.e.v(android.view.View, k1.v0):k1.v0");
    }

    public void w() throws IOException {
        try {
            ((FileLock) this.f10942c).release();
            ((FileChannel) this.f10941b).close();
        } catch (IOException e7) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e7);
        }
    }

    @Override // H6.e
    public /* synthetic */ H6.o zza(String str) {
        new H6.d((H6.f) this.f10941b, (Context) this.f10942c, str).start();
        return H6.o.f4961a;
    }

    public /* synthetic */ e(int i5, boolean z2) {
        this.f10940a = i5;
    }

    public /* synthetic */ e(Object obj, boolean z2, Object obj2, int i5) {
        this.f10940a = i5;
        this.f10941b = obj;
        this.f10942c = obj2;
    }

    public e(WorkDatabase_Impl workDatabase_Impl) {
        this.f10940a = 0;
        this.f10941b = workDatabase_Impl;
        this.f10942c = new b(workDatabase_Impl, 1);
    }

    public e(List list) {
        this.f10940a = 20;
        this.f10941b = list;
        this.f10942c = new J5.w[list.size()];
    }

    public e(D3.b bVar) {
        this.f10940a = 3;
        c cVar = new c(3);
        this.f10941b = bVar;
        this.f10942c = cVar;
    }

    public e(int i5) {
        this.f10940a = i5;
        switch (i5) {
            case 11:
                this.f10941b = new LinkedHashMap();
                this.f10942c = new LinkedHashMap();
                break;
            default:
                this.f10941b = new E();
                this.f10942c = new U3.j();
                r(w.f5590M8);
                break;
        }
    }

    @Override // He.h
    public void onComplete() {
        ((He.h) this.f10941b).onComplete();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(tf.l lVar, tf.l lVar2) {
        this.f10940a = 1;
        this.f10941b = (AbstractC3343n) lVar;
        this.f10942c = (AbstractC3343n) lVar2;
    }

    public e(u6.t tVar) {
        this.f10940a = 19;
        this.f10941b = tVar;
        this.f10942c = new Y4.b();
    }

    public e(tf.l lVar) {
        this.f10940a = 24;
        this.f10941b = lVar;
        this.f10942c = new ConcurrentHashMap();
    }

    public e(MediaCodec.CryptoInfo cryptoInfo) {
        this.f10940a = 18;
        this.f10941b = cryptoInfo;
        this.f10942c = O0.e();
    }

    public e(e0 e0Var, int[] iArr) {
        this.f10940a = 15;
        this.f10941b = AbstractC3409K.j(e0Var);
        this.f10942c = iArr;
    }

    public e(y yVar) {
        this.f10940a = 26;
        this.f10942c = yVar;
        this.f10941b = new J5.y(new byte[4], 4, 1, (byte) 0);
    }

    @Override // Y2.w
    public void b(u uVar, s2.o oVar, B b5) {
    }
}
