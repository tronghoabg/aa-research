package a2;

import A7.AbstractC0279p0;
import E5.C0441b;
import Q1.x;
import ad.L;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.V;
import androidx.profileinstaller.ProfileInstallReceiver;
import ba.C1521a;
import c4.C1557j;
import com.google.android.gms.common.api.internal.InterfaceC1708w;
import com.google.android.gms.common.internal.C1735y;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import d4.C2387a;
import dd.ExecutorC2423b;
import dd.InterfaceC2422a;
import ef.C2527k;
import f4.C2556c;
import f4.C2557d;
import ff.AbstractC2640A;
import g2.C2694o;
import g7.C2712a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k1.InterfaceC3127n;
import kotlin.jvm.internal.AbstractC3340k;
import l8.AbstractC3403E;
import l8.AbstractC3409K;
import l8.AbstractC3437s;
import l8.C3406H;
import l8.C3407I;
import l8.C3441w;
import nb.InterfaceC3613b;
import od.M0;
import od.T0;
import p2.AbstractC3759b;
import p9.C3776A;
import pb.RunnableC3790a;
import q.C3816i;
import r9.InterfaceC3949f;
import uc.C4276m;
import uc.C4278o;
import uc.C4281r;
import uc.C4287x;
import uc.InterfaceC4267d;
import uc.InterfaceC4268e;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;
import x6.InterfaceC4485p;
import xc.C4508a;

/* renamed from: a2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1323c implements OnSuccessListener, OnFailureListener, OnCanceledListener, InterfaceC4485p, c2.c, com.dexterous.flutterlocalnotifications.i, InterfaceC1708w, i3.a, InterfaceC4269f, T0, org.chromium.net.c, o2.h, InterfaceC3613b, p.i, InterfaceC3949f, InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17155a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17156b;

    public /* synthetic */ C1323c(int i5, Object obj, Object obj2) {
        this.f17155a = i5;
        this.f17156b = obj;
    }

    public static h4.o I(C1557j c1557j, h4.h hVar, C2556c c2556c, C2557d c2557d) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(hVar.f36092a.getResources(), c2557d.f34811a);
        Map map = c2557d.f34812b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z2 = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config config = k4.e.f39264a;
        if ((c1557j instanceof C1557j) && c1557j.f19653g) {
            z2 = true;
        }
        return new h4.o(bitmapDrawable, hVar, 1, c2556c, str, zBooleanValue, z2);
    }

    @Override // o2.h
    public void A(o2.j jVar, long j8, long j10) {
        boolean z2;
        S3.l lVar = (S3.l) this.f17156b;
        synchronized (AbstractC3759b.f43199b) {
            z2 = AbstractC3759b.f43200c;
        }
        if (z2) {
            lVar.r();
        } else {
            ((X1.f) lVar.f10967a).x(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void B(boolean z2) {
        ((InterfaceC4280q) this.f17156b).a(Boolean.valueOf(z2));
    }

    public String C(String html) {
        AbstractC3340k.e(html, "html");
        G4.c cVar = (G4.c) this.f17156b;
        String strB = cVar.b("mraid.js");
        String strB2 = cVar.b("mraid-bridge.js");
        byte[] bytes = Bf.l.V(Bf.r.h0("\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\"> \n        <style> body { margin:0; padding:0; overflow:hidden; } </style>\n        ".concat(html), "<script src=\"mraid.js\"></script>", AbstractC0279p0.l("<script>", strB, "</script>"), false)).getBytes(Bf.a.f1670a);
        AbstractC3340k.d(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(bytes, 1);
        AbstractC3340k.d(strEncodeToString, "encodeToString(...)");
        return Bf.l.V("\n            <script>" + strB2 + "</script>\n            <iframe id=\"adFrame\"\n                style=\"width:100vw; height:100vh; border:none;\"\n                src=\"data:text/html;base64," + strEncodeToString + "\"\n                sandbox=\"allow-scripts allow-same-origin\"\n            >\n            </iframe>\n        ");
    }

    public void D(String str, String str2) {
        String strA = C2694o.a(str.trim());
        String strTrim = str2.trim();
        C1323c c1323c = (C1323c) this.f17156b;
        c1323c.getClass();
        AbstractC3437s.c(strA, strTrim);
        C3441w c3441wA = (C3441w) c1323c.f17156b;
        if (c3441wA == null) {
            c3441wA = C3441w.a();
            c1323c.f17156b = c3441wA;
        }
        AbstractC3403E abstractC3403E = (AbstractC3403E) c3441wA.get(strA);
        if (abstractC3403E == null) {
            C3407I c3407i = AbstractC3409K.f40056b;
            AbstractC3437s.d(4, "expectedSize");
            C3406H c3406h = new C3406H(4);
            C3441w c3441wA2 = (C3441w) c1323c.f17156b;
            if (c3441wA2 == null) {
                c3441wA2 = C3441w.a();
                c1323c.f17156b = c3441wA2;
            }
            c3441wA2.put(strA, c3406h);
            abstractC3403E = c3406h;
        }
        abstractC3403E.c(strTrim);
    }

    @Override // o2.h
    public U5.f E(o2.j jVar, long j8, long j10, IOException iOException, int i5) {
        ((X1.f) ((S3.l) this.f17156b).f10967a).x(iOException);
        return o2.m.f41318e;
    }

    public void F(List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            String str = (String) list.get(i5);
            int i10 = x.f9724a;
            String[] strArrSplit = str.split(":\\s?", 2);
            if (strArrSplit.length == 2) {
                D(strArrSplit[0], strArrSplit[1]);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f4.C2557d G(h4.h r20, f4.C2556c r21, i4.C2849f r22, int r23) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C1323c.G(h4.h, f4.c, i4.f, int):f4.d");
    }

    public C2556c H(h4.h hVar, Object obj, h4.l lVar, X3.c cVar) {
        String string;
        Map linkedHashMap;
        hVar.getClass();
        List list = ((X3.k) this.f17156b).f16116f.f16082c;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                C2527k c2527k = (C2527k) list.get(i5);
                C2387a c2387a = (C2387a) c2527k.f34671a;
                if (((Class) c2527k.f34672b).isAssignableFrom(obj.getClass())) {
                    AbstractC3340k.c(c2387a, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                    switch (c2387a.f34074a) {
                        case 0:
                            File file = (File) obj;
                            string = file.getPath() + ':' + file.lastModified();
                            break;
                        default:
                            Uri uri = (Uri) obj;
                            if (!AbstractC3340k.a(uri.getScheme(), "android.resource")) {
                                string = uri.toString();
                                break;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(uri);
                                sb2.append('-');
                                Configuration configuration = lVar.f36118a.getResources().getConfiguration();
                                Bitmap.Config config = k4.e.f39264a;
                                sb2.append(configuration.uiMode & 48);
                                string = sb2.toString();
                                break;
                            }
                    }
                    if (string != null) {
                    }
                }
                i5++;
            } else {
                string = null;
            }
        }
        if (string == null) {
            return null;
        }
        Map map = hVar.f36109s.f36132a;
        boolean zIsEmpty = map.isEmpty();
        ff.w wVar = ff.w.f35433a;
        if (zIsEmpty) {
            linkedHashMap = wVar;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = map.entrySet().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getValue().getClass();
                throw new ClassCastException();
            }
        }
        hVar.f36096e.getClass();
        return linkedHashMap.isEmpty() ? new C2556c(string, wVar) : new C2556c(string, AbstractC2640A.a0(linkedHashMap));
    }

    public void J(Callable callable, InterfaceC2422a interfaceC2422a) {
        p8.q qVar = new p8.q();
        ((ThreadPoolExecutor) this.f17156b).execute(new com.applovin.impl.sdk.nativeAd.e(14, qVar, callable));
        qVar.addListener(new com.applovin.impl.sdk.nativeAd.e(13, interfaceC2422a, qVar), new ExecutorC2423b());
    }

    public void K(int i5, tc.k kVar) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f17156b;
        iVar.d();
        iVar.f37067f = kVar;
        iVar.f37066e = new D9.n(2, i5, 8);
        iVar.f37069h.e(iVar);
        S3.i iVar2 = kVar.f46025j;
        iVar.f37069h = new io.flutter.plugin.editing.e(iVar2 != null ? (tc.l) iVar2.f10963c : null, iVar.f37062a);
        iVar.e(kVar);
        iVar.f37070i = true;
        if (iVar.f37066e.f2592b == 3) {
            iVar.f37076p = false;
        }
        iVar.f37073m = null;
        iVar.f37069h.a(iVar);
    }

    public void L(double d3, double d5, double[] dArr) {
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f17156b;
        iVar.getClass();
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d10 = dArr[12];
        double d11 = dArr[15];
        double d12 = d10 / d11;
        dArr2[1] = d12;
        dArr2[0] = d12;
        double d13 = dArr[13] / d11;
        dArr2[3] = d13;
        dArr2[2] = d13;
        C0441b c0441b = new C0441b(z2, dArr, dArr2);
        c0441b.g(d3, 0.0d);
        c0441b.g(d3, d5);
        c0441b.g(0.0d, d5);
        double d14 = iVar.f37062a.getContext().getResources().getDisplayMetrics().density;
        iVar.f37073m = new Rect((int) (dArr2[0] * d14), (int) (dArr2[2] * d14), (int) Math.ceil(dArr2[1] * d14), (int) Math.ceil(dArr2[3] * d14));
    }

    public void M(tc.l lVar) {
        tc.l lVar2;
        int i5;
        int i10;
        io.flutter.plugin.editing.i iVar = (io.flutter.plugin.editing.i) this.f17156b;
        kc.r rVar = iVar.f37062a;
        if (!iVar.f37070i && (lVar2 = iVar.f37075o) != null && (i5 = lVar2.f46030d) >= 0 && (i10 = lVar2.f46031e) > i5) {
            int i11 = i10 - i5;
            int i12 = lVar.f46031e;
            int i13 = lVar.f46030d;
            boolean z2 = true;
            if (i11 == i12 - i13) {
                int i14 = 0;
                while (true) {
                    if (i14 >= i11) {
                        z2 = false;
                        break;
                    } else if (lVar2.f46027a.charAt(i14 + i5) != lVar.f46027a.charAt(i14 + i13)) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            iVar.f37070i = z2;
        }
        iVar.f37075o = lVar;
        iVar.f37069h.f(lVar);
        if (iVar.f37070i) {
            iVar.f37063b.restartInput(rVar);
            iVar.f37070i = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (r2 >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0078, code lost:
    
        if (r2 >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int N(N1.C0765n r7) {
        /*
            r6 = this;
            r0 = 4
            r1 = 1
            java.lang.String r2 = r7.f8232n
            r3 = 0
            if (r2 == 0) goto L84
            boolean r2 = N1.C.j(r2)
            if (r2 != 0) goto Lf
            goto L84
        Lf:
            int r2 = Q1.x.f9724a
            java.lang.String r7 = r7.f8232n
            r7.getClass()
            int r2 = Q1.x.f9724a
            r4 = -1
            int r5 = r7.hashCode()
            switch(r5) {
                case -1487656890: goto L63;
                case -1487464693: goto L58;
                case -1487464690: goto L4d;
                case -1487394660: goto L42;
                case -1487018032: goto L37;
                case -879272239: goto L2c;
                case -879258763: goto L21;
                default: goto L20;
            }
        L20:
            goto L6d
        L21:
            java.lang.String r5 = "image/png"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L2a
            goto L6d
        L2a:
            r4 = 6
            goto L6d
        L2c:
            java.lang.String r5 = "image/bmp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L35
            goto L6d
        L35:
            r4 = 5
            goto L6d
        L37:
            java.lang.String r5 = "image/webp"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L40
            goto L6d
        L40:
            r4 = r0
            goto L6d
        L42:
            java.lang.String r5 = "image/jpeg"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L4b
            goto L6d
        L4b:
            r4 = 3
            goto L6d
        L4d:
            java.lang.String r5 = "image/heif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L56
            goto L6d
        L56:
            r4 = 2
            goto L6d
        L58:
            java.lang.String r5 = "image/heic"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L61
            goto L6d
        L61:
            r4 = r1
            goto L6d
        L63:
            java.lang.String r5 = "image/avif"
            boolean r7 = r7.equals(r5)
            if (r7 != 0) goto L6c
            goto L6d
        L6c:
            r4 = r3
        L6d:
            switch(r4) {
                case 0: goto L76;
                case 1: goto L71;
                case 2: goto L71;
                case 3: goto L7a;
                case 4: goto L7a;
                case 5: goto L7a;
                case 6: goto L7a;
                default: goto L70;
            }
        L70:
            goto L7f
        L71:
            r7 = 26
            if (r2 < r7) goto L7f
            goto L7a
        L76:
            r7 = 34
            if (r2 < r7) goto L7f
        L7a:
            int r7 = R8.v.a(r0, r3, r3, r3)
            return r7
        L7f:
            int r7 = R8.v.a(r1, r3, r3, r3)
            return r7
        L84:
            int r7 = R8.v.a(r3, r3, r3, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C1323c.N(N1.n):int");
    }

    public void O(boolean z2) {
        M0 m02 = (M0) this.f17156b;
        m02.f41677Z.W(m02.f41657E, z2);
    }

    @Override // i3.a
    public void a(int i5, Serializable serializable) {
        String str;
        switch (i5) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i5 == 6 || i5 == 7 || i5 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f17156b).setResultCode(i5);
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC1708w
    public void accept(Object obj, Object obj2) throws RemoteException {
        C2712a c2712a = (C2712a) ((g7.c) obj).getService();
        Parcel parcelZaa = c2712a.zaa();
        zac.zac(parcelZaa, (C1735y) this.f17156b);
        c2712a.zad(1, parcelZaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // uc.InterfaceC4269f
    public ab.b b() {
        return ((mc.j) this.f17156b).c(new C4276m());
    }

    @Override // i3.a
    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p.i
    public boolean f(p.k kVar, MenuItem menuItem) {
        ((Toolbar) this.f17156b).getClass();
        return false;
    }

    @Override // org.chromium.net.c
    public FileChannel g() throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f17156b;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
    }

    @Override // r9.InterfaceC3949f
    public String h() {
        return null;
    }

    @Override // uc.InterfaceC4269f
    public void i(String str, InterfaceC4267d interfaceC4267d, ab.b bVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((mc.j) this.f17156b).i(str, interfaceC4267d, bVar);
    }

    @Override // uc.InterfaceC4269f
    public void j(String str, ByteBuffer byteBuffer, InterfaceC4268e interfaceC4268e) {
        ((mc.j) this.f17156b).j(str, byteBuffer, interfaceC4268e);
    }

    @Override // r9.InterfaceC3949f
    public int k(C3776A c3776a) {
        return 1;
    }

    @Override // uc.InterfaceC4269f
    public void l(String str, InterfaceC4267d interfaceC4267d) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ((mc.j) this.f17156b).i(str, interfaceC4267d, null);
    }

    @Override // r9.InterfaceC3949f
    public s9.b m(String str) {
        return s9.b.f45360d;
    }

    @Override // nb.InterfaceC3613b
    public void onAdLoaded() {
        RunnableC3790a runnableC3790a = (RunnableC3790a) this.f17156b;
        ((ConcurrentHashMap) ((pb.b) runnableC3790a.f43450c).f1971b).put(((nb.c) runnableC3790a.f43449b).f41000a, (rb.f) runnableC3790a.f43451d);
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public void onCanceled() {
        ((CountDownLatch) this.f17156b).countDown();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.f17156b).countDown();
    }

    @Override // uc.InterfaceC4279p
    public void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        switch (this.f17155a) {
            case 27:
                ((k) this.f17156b).getClass();
                break;
            default:
                C1521a c1521a = (C1521a) this.f17156b;
                if (((C4508a) c1521a.f19415c) != null) {
                    String str = c4278o.f46759a;
                    Object obj = c4278o.f46760b;
                    str.getClass();
                    if (str.equals("ProcessText.processTextAction")) {
                        try {
                            ArrayList arrayList = (ArrayList) obj;
                            ((C4508a) c1521a.f19415c).a((String) arrayList.get(0), (String) arrayList.get(1), ((Boolean) arrayList.get(2)).booleanValue(), (tc.g) interfaceC4280q);
                            break;
                        } catch (IllegalStateException e7) {
                            ((tc.g) interfaceC4280q).b("error", e7.getMessage(), null);
                        }
                    } else if (!str.equals("ProcessText.queryTextActions")) {
                        ((tc.g) interfaceC4280q).c();
                        break;
                    } else {
                        try {
                            ((tc.g) interfaceC4280q).a(((C4508a) c1521a.f19415c).b());
                            break;
                        } catch (IllegalStateException e10) {
                            ((tc.g) interfaceC4280q).b("error", e10.getMessage(), null);
                            return;
                        }
                    }
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((CountDownLatch) this.f17156b).countDown();
    }

    @Override // r9.InterfaceC3949f
    public List p(C3776A c3776a) {
        return null;
    }

    @Override // uc.InterfaceC4269f
    public void q(String str, ByteBuffer byteBuffer) {
        ((mc.j) this.f17156b).j(str, byteBuffer, null);
    }

    @Override // r9.InterfaceC3949f
    public Collection r() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.dexterous.flutterlocalnotifications.i
    public void s() {
        ((InterfaceC4280q) this.f17156b).b("permissionRequestInProgress", "Another permission request is already in progress", null);
    }

    @Override // r9.InterfaceC3949f
    public List t(String str) {
        HashSet hashSet = (HashSet) ((HashMap) ((L) this.f17156b).f17515b).get(str);
        return hashSet != null ? new ArrayList(hashSet) : Collections.EMPTY_LIST;
    }

    @Override // r9.InterfaceC3949f
    public void u(s9.m mVar) {
        ((L) this.f17156b).e(mVar);
    }

    @Override // r9.InterfaceC3949f
    public s9.b x(C3776A c3776a) {
        return s9.b.f45360d;
    }

    @Override // p.i
    public void z(p.k kVar) {
        Toolbar toolbar = (Toolbar) this.f17156b;
        C3816i c3816i = toolbar.f17977a.f17844t;
        if (c3816i == null || !c3816i.j()) {
            Iterator it = toolbar.f17967G.f38847b.iterator();
            while (it.hasNext()) {
                ((V) ((InterfaceC3127n) it.next())).f18344a.t(kVar);
            }
        }
    }

    public /* synthetic */ C1323c(Object obj, int i5) {
        this.f17155a = i5;
        this.f17156b = obj;
    }

    public C1323c(mc.b bVar) {
        this.f17155a = 28;
        new C4281r(bVar, "flutter/mousecursor", C4287x.f46768b, null).b(new L(this, 26));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1323c(int i5, String str, String str2) {
        this(10);
        this.f17155a = 10;
        D("User-Agent", str);
        D("CSeq", String.valueOf(i5));
        if (str2 != null) {
            D("Session", str2);
        }
    }

    public C1323c(int i5) {
        this.f17155a = i5;
        switch (i5) {
            case 3:
                this.f17156b = new V1.c(18);
                break;
            case 8:
                this.f17156b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
                break;
            case 10:
                this.f17156b = new C1323c(17);
                break;
            case 17:
                break;
            case 25:
                this.f17156b = new L(24);
                break;
            case 26:
                this.f17156b = new CopyOnWriteArrayList();
                break;
            default:
                this.f17156b = new CountDownLatch(1);
                break;
        }
    }

    @Override // r9.InterfaceC3949f
    public void start() {
    }

    @Override // r9.InterfaceC3949f
    public void v() {
    }

    @Override // r9.InterfaceC3949f
    public void c(s9.a aVar) {
    }

    @Override // r9.InterfaceC3949f
    public void e(s9.a aVar) {
    }

    @Override // r9.InterfaceC3949f
    public void n(c9.c cVar) {
    }

    @Override // r9.InterfaceC3949f
    public void y(C3776A c3776a) {
    }

    @Override // r9.InterfaceC3949f
    public void o(String str, s9.b bVar) {
    }

    @Override // o2.h
    public void w(o2.j jVar, long j8, long j10, boolean z2) {
    }
}
