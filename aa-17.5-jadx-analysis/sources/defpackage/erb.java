package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaCodec;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import com.google.android.enterprise.connectedapps.internal.BundleCallReceiver;
import com.google.android.enterprise.connectedapps.internal.Bundler;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class erb {
    public final Object a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public erb(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = new EnumMap(qbt.class);
        for (qbt qbtVar : qbt.values()) {
            this.a.put(qbtVar, new roc(null, null));
        }
    }

    public static int[] X(String str) {
        try {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("Version string is empty");
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
            int iCountTokens = stringTokenizer.countTokens();
            int[] iArr = new int[iCountTokens];
            for (int i = 0; i < iCountTokens; i++) {
                iArr[i] = Integer.parseInt(stringTokenizer.nextToken());
            }
            return iArr;
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(a.bq(str, "Unable to parse HTTP flags version string: `", "`"), e);
        }
    }

    public static int r(fgp fgpVar, Object obj, Object obj2) {
        return ejc.a((ell) fgpVar.b, 1, obj) + ejc.a((ell) fgpVar.c, 2, obj2);
    }

    public static void s(eiw eiwVar, fgp fgpVar, Object obj, Object obj2) throws IOException {
        ejc.f(eiwVar, (ell) fgpVar.b, 1, obj);
        ejc.f(eiwVar, (ell) fgpVar.c, 2, obj2);
    }

    public static erb y(int i, int i2, int i3, int i4, boolean z) {
        return new erb(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public static erb z(int i, int i2, int i3) {
        return new erb(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    public final void A(fak fakVar) {
        fakVar.getClass();
        int i = fakVar.a;
        ?? r3 = this.a;
        Integer numValueOf = Integer.valueOf(i);
        Object treeMap = r3.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            r3.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        Integer numValueOf2 = Integer.valueOf(fakVar.b);
        if (treeMap2.containsKey(numValueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(numValueOf2) + " with " + fakVar);
        }
        treeMap2.put(numValueOf2, fakVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(defpackage.aiyl r5, defpackage.afck r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.eyw
            if (r0 == 0) goto L13
            r0 = r6
            eyw r0 = (defpackage.eyw) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            eyw r0 = new eyw
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            defpackage.woy.dF(r6)
            goto L3f
        L2f:
            defpackage.woy.dF(r6)
            java.lang.Object r4 = r4.a
            r0.b = r3
            ajab r4 = (defpackage.ajab) r4
            java.lang.Object r4 = r4.hR(r5, r0)
            if (r4 != r1) goto L3f
            return r1
        L3f:
            aezp r4 = new aezp
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erb.B(aiyl, afck):java.lang.Object");
    }

    public final String C(int i) throws Resources.NotFoundException {
        try {
            String resourceName = ((Context) this.a).getResources().getResourceName(i);
            resourceName.getClass();
            return resourceName;
        } catch (Resources.NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    public final int D() {
        return ((adpb) this.a).a;
    }

    public final Bundle E() {
        Bundle bundleZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
        adpb adpbVar = (adpb) this.a;
        fbh.c(bundleZ, "nav-entry-state:id", (String) adpbVar.b);
        bundleZ.putInt("nav-entry-state:destination-id", adpbVar.a);
        Object objZ = adpbVar.c;
        if (objZ == null) {
            objZ = dsg.z((aezu[]) Arrays.copyOf(new aezu[0], 0));
        }
        fbh.a(bundleZ, "nav-entry-state:args", (Bundle) objZ);
        fbh.a(bundleZ, "nav-entry-state:saved-state", (Bundle) adpbVar.d);
        return bundleZ;
    }

    public final String F() {
        return (String) ((adpb) this.a).b;
    }

    public final IBinder G() {
        return ((Messenger) this.a).getBinder();
    }

    public final void H(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        ((Messenger) this.a).send(messageObtain);
    }

    public final void I(Object obj) {
        ArrayList arrayList = null;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                ((MediaBrowserService.Result) this.a).sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            ((MediaBrowserService.Result) this.a).sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        Object obj2 = this.a;
        List<Parcel> list = (List) obj;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            for (Parcel parcel2 : list) {
                parcel2.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
                parcel2.recycle();
            }
        }
        ((MediaBrowserService.Result) obj2).sendResult(arrayList);
    }

    public final euq J(erb erbVar, euz euzVar, eps epsVar, evn evnVar) {
        erbVar.getClass();
        epsVar.getClass();
        adpb adpbVar = (adpb) this.a;
        Object obj = adpbVar.c;
        if (obj != null) {
            ((Bundle) obj).setClassLoader(((Context) erbVar.a).getClassLoader());
        } else {
            obj = null;
        }
        return ebf.L(erbVar, euzVar, (Bundle) obj, epsVar, evnVar, (String) adpbVar.b, (Bundle) adpbVar.d);
    }

    public final void K(int i) {
        Object obj = this.a;
        Object obj2 = ((ajki) obj).b;
        synchronized (obj2) {
            long j = i;
            long[] jArr = (long[]) ((LongSparseArray) obj2).get(j);
            if (jArr == null) {
                return;
            }
            long j2 = jArr[0] - 1;
            jArr[0] = j2;
            if (j2 <= 0) {
                ((LongSparseArray) obj2).delete(j);
            } else {
                long j3 = ((ajki) obj).a + 1;
                ((ajki) obj).a = j3;
                jArr[1] = j3;
            }
        }
    }

    public final void L(yzz yzzVar, yzy yzyVar) {
        ((sak) this.a).e(rrc.h(yxy.FRX, yzzVar, yzyVar).l());
    }

    public final int M(long j) {
        return ((MediaCodec) this.a).dequeueInputBuffer(j);
    }

    public final ByteBuffer[] N() {
        return ((MediaCodec) this.a).getOutputBuffers();
    }

    public final void O(int i, int i2, long j, int i3) throws MediaCodec.CryptoException {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    public final rhj P() {
        return new rhj((Context) this.a);
    }

    public final byte[] Q(Context context, long j, int i, long j2, int i2, byte[] bArr, qdc qdcVar) {
        try {
            Object obj = this.a;
            Bundle preparedCall = ((BundleCallReceiver) obj).getPreparedCall(j, i, bArr);
            if (j2 != -4319067186032159575L) {
                throw new IllegalArgumentException(a.bN(j2, "Unknown type identifier "));
            }
            context.getApplicationContext();
            qdt[] qdtVarArr = kia.a.c;
            if (i2 >= 3) {
                throw new IllegalArgumentException(a.bp(i2, "Invalid method identifier"));
            }
            return ((BundleCallReceiver) obj).prepareResponse(j, qdtVarArr[i2].a(preparedCall, qdcVar));
        } catch (Error e) {
            Bundle bundle = new Bundle(Bundler.class.getClassLoader());
            bundle.putSerializable("throwable", e);
            byte[] bArrPrepareResponse = ((BundleCallReceiver) this.a).prepareResponse(j, bundle);
            new Handler(Looper.getMainLooper()).postDelayed(new qds(), 5000L);
            return bArrPrepareResponse;
        } catch (RuntimeException e2) {
            Bundle bundle2 = new Bundle(Bundler.class.getClassLoader());
            bundle2.putSerializable("throwable", e2);
            byte[] bArrPrepareResponse2 = ((BundleCallReceiver) this.a).prepareResponse(j, bundle2);
            new Handler(Looper.getMainLooper()).postDelayed(new qds(e2), 5000L);
            return bArrPrepareResponse2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized Object R(qbw qbwVar) {
        ((roc) this.a.get(qbwVar.b)).getClass();
        return qbwVar.a();
    }

    public final /* synthetic */ void S(qbr qbrVar) {
        sii siiVar = ((qbe) R(qbrVar)).a;
    }

    public final /* synthetic */ void T(qbq qbqVar) {
    }

    public final /* synthetic */ void U(qbv qbvVar) {
    }

    public final /* synthetic */ void V(qbu qbuVar) {
        sik sikVar = ((qbf) R(qbuVar)).a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Map W() {
        return DesugarCollections.unmodifiableMap(this.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void Y(ajii ajiiVar) {
        this.a.remove(ajiiVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized void Z(ajii ajiiVar) {
        this.a.add(ajiiVar);
    }

    public final void a(int i, boolean z) throws IOException {
        ((eiw) this.a).j(i, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final synchronized boolean aa(ajii ajiiVar) {
        return this.a.contains(ajiiVar);
    }

    public final void ab(String str, String str2) {
        str.getClass();
        ahdw.e(str);
        ahdw.f(str2, str);
        ahdw.l(this, str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aeaa, java.lang.Object] */
    public final aeac ac() {
        return new aeac(this.a);
    }

    public final Object ad() {
        return ((tzx) this.a).a();
    }

    public final String ae() {
        return ((tzx) this.a).e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void af(ajmd ajmdVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setUpdateListener(ajmdVar != null ? new nt(ajmdVar, 2, 0 == true ? 1 : 0) : null);
        }
    }

    public final void b(int i, eip eipVar) throws IOException {
        ((eiw) this.a).k(i, eipVar);
    }

    public final void c(int i, double d) throws IOException {
        ((eiw) this.a).R(i, d);
    }

    public final void d(int i, int i2) throws IOException {
        ((eiw) this.a).q(i, i2);
    }

    public final void e(int i, int i2) throws IOException {
        ((eiw) this.a).m(i, i2);
    }

    public final void f(int i, long j) throws IOException {
        ((eiw) this.a).o(i, j);
    }

    public final void g(int i, float f) throws IOException {
        ((eiw) this.a).T(i, f);
    }

    public final void h(int i, Object obj, ekp ekpVar) throws IOException {
        eiw eiwVar = (eiw) this.a;
        eiwVar.x(i, 3);
        ekpVar.i((eie) obj, this);
        eiwVar.x(i, 4);
    }

    public final void i(int i, int i2) throws IOException {
        ((eiw) this.a).q(i, i2);
    }

    public final void j(int i, long j) throws IOException {
        ((eiw) this.a).A(i, j);
    }

    public final void k(int i, Object obj, ekp ekpVar) throws IOException {
        eie eieVar = (eie) obj;
        eiw eiwVar = (eiw) this.a;
        eiwVar.x(i, 2);
        eiwVar.z(eieVar.c(ekpVar));
        ekpVar.i(eieVar, this);
    }

    public final void l(int i, int i2) throws IOException {
        ((eiw) this.a).m(i, i2);
    }

    public final void m(int i, long j) throws IOException {
        ((eiw) this.a).o(i, j);
    }

    public final void n(int i, int i2) throws IOException {
        ((eiw) this.a).y(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void o(int i, long j) throws IOException {
        ((eiw) this.a).A(i, (j >> 63) ^ (j + j));
    }

    public final void p(int i, int i2) throws IOException {
        ((eiw) this.a).y(i, i2);
    }

    public final void q(int i, long j) throws IOException {
        ((eiw) this.a).A(i, j);
    }

    public final void t() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void u(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void v(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void w(ebu ebuVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (ebuVar != null) {
                view.animate().setListener(new ebt(ebuVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void x(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public erb(Object obj) {
        this.a = obj;
    }

    public erb(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public erb(byte[] bArr, char[] cArr) {
        this.a = new swe();
    }

    public erb(short[] sArr) {
        this.a = new erb((byte[]) null, (char[]) null);
    }

    public erb() {
        new LinkedHashMap();
        this.a = new ajdr(afbf.a);
    }

    public erb(View view) {
        this.a = new WeakReference(view);
    }

    public erb(tzx tzxVar) {
        zkt.n(tzxVar, "phoenixIndoorLevel");
        this.a = tzxVar;
    }

    public erb(byte[] bArr, byte[] bArr2) {
        this.a = ajac.a(new int[7]);
    }

    public erb(int[] iArr) {
        this.a = new HandlerThread("AudioRecord", -19);
    }

    public erb(boolean z) {
        this.a = new AtomicBoolean(z);
    }

    public erb(byte[] bArr) {
        this.a = new LinkedHashMap();
    }

    public erb(char[] cArr, char[] cArr2) {
        this.a = new ArrayList(20);
    }

    public erb(short[] sArr, byte[] bArr) {
        this.a = new HashMap();
    }

    public erb(eiw eiwVar) {
        Charset charset = ejn.a;
        this.a = eiwVar;
        eiwVar.f = this;
    }

    public erb(fbp fbpVar) {
        fbpVar.getClass();
        this.a = fbpVar;
    }

    public erb(Map map) {
        new LinkedHashMap();
        this.a = new ajdr(map);
    }

    public erb(sin sinVar) {
        this.a = sinVar;
        SystemClock.elapsedRealtime();
    }

    public erb(byte[] bArr, byte[] bArr2, char[] cArr) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        timeUnit.getClass();
        ajix ajixVar = ajix.a;
        ajjc ajjcVar = ajjc.a;
        ajixVar.getClass();
        this.a = new ajjp(ajixVar, timeUnit, ajjcVar);
    }

    public erb(ell ellVar, ell ellVar2, Object obj) {
        this.a = new fgp(ellVar, ellVar2, obj);
    }

    public erb(char[] cArr, byte[] bArr) {
        this.a = new ajki((byte[]) null);
    }

    public erb(Bundle bundle) {
        bundle.getClass();
        bundle.setClassLoader(getClass().getClassLoader());
        this.a = new adpb(bundle);
    }

    public erb(byte[] bArr, short[] sArr) {
        this.a = new ArrayList(20);
    }

    public erb(euq euqVar) {
        euqVar.getClass();
        this.a = new adpb(euqVar, euqVar.a.c());
    }

    public erb(ThreadFactory threadFactory) {
        this.a = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public erb(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new BundleCallReceiver();
    }

    public erb(char[] cArr) {
        this.a = new AtomicInteger(0);
    }

    public erb(boolean[] zArr) {
        this.a = new LinkedHashSet();
    }
}
