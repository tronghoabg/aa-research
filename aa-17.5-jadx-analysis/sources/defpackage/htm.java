package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.UserHandle;
import android.os.UserManager;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import org.chromium.net.CronetEngine;

/* loaded from: classes.dex */
public final class htm {
    public final Object a;

    public htm(char[] cArr, char[] cArr2) {
        yfq yfqVarA = tgx.a(new koj(20), acrt.d());
        yfqVarA.getClass();
        this.a = yfqVarA;
    }

    public static htm C(EGLContext eGLContext) {
        return eGLContext == EGL10.EGL_NO_CONTEXT ? uvn.c : new htm(eGLContext, (byte[]) null);
    }

    private static final Boolean D(int i) {
        if (i != 0) {
            return i == 3 || i == 4;
        }
        return null;
    }

    private static final boolean E(int i) {
        return i == 2 || i == 4;
    }

    public static /* synthetic */ Object p(Object obj) {
        yph yphVar = kyw.a;
        abnp abnpVarN = kwz.a.n();
        abnpVarN.t();
        kwz kwzVar = (kwz) abnpVarN.b;
        kwzVar.b |= 1;
        kwzVar.c = true;
        return (kwz) abnpVarN.q();
    }

    public static boolean x(ActivityManager activityManager) throws val {
        if (activityManager == null) {
            throw new val("ActivityManager is not available.");
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            vaq.d();
            String strS = vuf.S();
            if (strS == null) {
                strS = "<?>";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(strS)) {
                    return runningAppProcessInfo.importance == 100 || runningAppProcessInfo.importance == 200;
                }
            }
        }
        throw new val("Process not found in running list");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void A(final Consumer consumer) {
        yfy yfyVarJ;
        synchronized (this) {
            yfyVarJ = yfy.j(this.a);
        }
        yno it = yfyVarJ.entrySet().iterator();
        while (it.hasNext()) {
            final vag vagVar = (vag) ((Map.Entry) it.next()).getValue();
            if (!vagVar.a) {
                vagVar.c.execute(new Runnable() { // from class: uzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        vag vagVar2 = vagVar;
                        if (vagVar2.a) {
                            return;
                        }
                        consumer.accept(vagVar2.b);
                    }
                });
            }
        }
    }

    public final uyb B() {
        return (uyb) ((xxh) this.a).d(uyb.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final boolean a(Class cls) {
        return this.a.containsKey(cls);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public final synchronized void c(ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [htz, java.lang.Object] */
    public final synchronized htz d(Class cls) {
        for (ieb iebVar : this.a) {
            if (((Class) iebVar.a).isAssignableFrom(cls)) {
                return iebVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void e(Class cls, htz htzVar) {
        this.a.add(new ieb(cls, htzVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [icw, java.lang.Object] */
    public final synchronized icw f(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return icx.a;
        }
        for (ncp ncpVar : this.a) {
            if (ncpVar.w(cls, cls2)) {
                return ncpVar.c;
            }
        }
        throw new IllegalArgumentException(a.bL(cls2, cls, "No transcoder registered to transcode from ", " to "));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    public final synchronized List g(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (ncp ncpVar : this.a) {
            if (ncpVar.w(cls, cls2)) {
                Object obj = ncpVar.a;
                if (!arrayList.contains(obj)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    public final synchronized void h(Class cls, Class cls2, icw icwVar) {
        this.a.add(new ncp(cls, cls2, (Object) icwVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized htd i(ByteBuffer byteBuffer) {
        htd htdVar;
        htdVar = (htd) this.a.poll();
        if (htdVar == null) {
            htdVar = new htd();
        }
        htdVar.b = null;
        Arrays.fill(htdVar.a, (byte) 0);
        htdVar.c = new htc();
        htdVar.d = 0;
        htdVar.b = byteBuffer.asReadOnlyBuffer();
        htdVar.b.position(0);
        htdVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return htdVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void j(htd htdVar) {
        htdVar.b = null;
        htdVar.c = null;
        this.a.offer(htdVar);
    }

    public final lla k(boolean z) {
        return E(((Bundle) this.a).getInt(true != z ? "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT" : "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT")) ? lla.b : lla.a;
    }

    public final lla l() {
        return E(((Bundle) this.a).getInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT")) ? lla.b : lla.a;
    }

    public final Boolean m() {
        return D(((Bundle) this.a).getInt("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT"));
    }

    public final Boolean n(boolean z) {
        return D(((Bundle) this.a).getInt(true != z ? "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT" : "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT"));
    }

    public final boolean o(boolean z) {
        return ((Bundle) this.a).containsKey(true != z ? "android.media.browse.CONTENT_STYLE_BROWSABLE_HINT" : "android.media.browse.CONTENT_STYLE_PLAYABLE_HINT");
    }

    public final UserHandle q() {
        return (UserHandle) Collection.EL.stream(((UserManager) this.a).getUserProfiles()).filter(new koh(this, 8)).findFirst().orElse(null);
    }

    public final String r() {
        rrk rrkVar = (rrk) this.a;
        return (rrkVar.b & 1) != 0 ? rrkVar.c : "com.google.android.gms.car.CONNECTIVITY_EVENT";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.r()
            java.lang.String r1 = r7.getAction()
            boolean r0 = r0.equals(r1)
            java.lang.Object r6 = r6.a
            rrk r6 = (defpackage.rrk) r6
            int r1 = r6.b
            r1 = r1 & 2
            r2 = 0
            r3 = -1
            r4 = 1
            if (r1 == 0) goto L26
            java.lang.String r1 = "stage_state"
            int r1 = r7.getIntExtra(r1, r3)
            int r5 = r6.d
            if (r1 != r5) goto L24
            goto L26
        L24:
            r1 = r2
            goto L27
        L26:
            r1 = r4
        L27:
            r0 = r0 & r1
            int r1 = r6.b
            r1 = r1 & 4
            if (r1 == 0) goto L42
            java.lang.String r1 = "event_type"
            int r7 = r7.getIntExtra(r1, r3)
            int r6 = r6.e
            yxi r6 = defpackage.yxi.b(r6)
            if (r6 != 0) goto L3e
            yxi r6 = defpackage.yxi.UNKNOWN
        L3e:
            int r6 = r6.pC
            if (r7 != r6) goto L43
        L42:
            r2 = r4
        L43:
            r6 = r0 & r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.htm.s(android.content.Intent):boolean");
    }

    public final wht t(Context context, String str, String str2, String str3) {
        return new wht(context, str, str2, str3, new ykd(this.a));
    }

    public final String u() {
        try {
            Object obj = this.a;
            return a.bz(((PseudonymousIdToken) spu.aB(new suz((Context) obj).a(), true != wid.m((Context) obj) ? 1000L : 3000L, TimeUnit.MILLISECONDS)).a, "NID=");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task was interrupted while fetching Zwieback ID.", e);
            return "";
        } catch (ExecutionException e2) {
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task failed while fetching Zwieback ID.", e2);
            return "";
        } catch (TimeoutException e3) {
            Log.e("SurveyPseudonymousIdProviderZwieback", "Task timed out while fetching Zwieback ID.", e3);
            return "";
        }
    }

    public final absi v(Location location) {
        abnp abnpVarN = absi.a.n();
        abnpVarN.t();
        absi absiVar = (absi) abnpVarN.b;
        absiVar.c = 1;
        absiVar.b |= 1;
        abnpVarN.t();
        absi absiVar2 = (absi) abnpVarN.b;
        absiVar2.d = 12;
        absiVar2.b |= 2;
        abnpVarN.t();
        absi absiVar3 = (absi) abnpVarN.b;
        absiVar3.h = 8;
        absiVar3.b |= 32768;
        Duration durationOfMillis = Duration.ofMillis(location.getTime());
        int i = zen.a;
        long jA = durationOfMillis.getSeconds() < -9223372036854L ? a.A(zeb.h(durationOfMillis.getSeconds() + 1), (durationOfMillis.getNano() / 1000) - 1000000) : a.A(zeb.h(durationOfMillis.getSeconds()), durationOfMillis.getNano() / 1000);
        abnpVarN.t();
        absi absiVar4 = (absi) abnpVarN.b;
        absiVar4.b |= 4;
        absiVar4.e = jA;
        int i2 = ((Context) this.a).checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 ? 3 : 2;
        abnpVarN.t();
        absi absiVar5 = (absi) abnpVarN.b;
        absiVar5.i = i2 - 1;
        absiVar5.b |= 2097152;
        abnp abnpVarN2 = absg.a.n();
        int iH = vja.h(location.getLatitude());
        abnpVarN2.t();
        absg absgVar = (absg) abnpVarN2.b;
        absgVar.b = 1 | absgVar.b;
        absgVar.c = iH;
        int iH2 = vja.h(location.getLongitude());
        abnpVarN2.t();
        absg absgVar2 = (absg) abnpVarN2.b;
        absgVar2.b |= 2;
        absgVar2.d = iH2;
        abnpVarN.t();
        absi absiVar6 = (absi) abnpVarN.b;
        absg absgVar3 = (absg) abnpVarN2.q();
        absgVar3.getClass();
        absiVar6.f = absgVar3;
        absiVar6.b |= 16;
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy() * 1000.0f;
            abnpVarN.t();
            absi absiVar7 = (absi) abnpVarN.b;
            absiVar7.b |= 128;
            absiVar7.g = accuracy;
        }
        absh.a.n();
        return (absi) abnpVarN.q();
    }

    public final boolean w() throws val {
        return x((ActivityManager) ((Context) this.a).getSystemService("activity"));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final uzy y(Object obj, xyc xycVar) {
        return (uzy) ConcurrentMap.EL.computeIfAbsent(this.a, obj, new mix(xycVar, 19));
    }

    public final synchronized void z(Object obj, Executor executor) {
        vag vagVar = (vag) ((HashMap) this.a).put(obj, new vag(obj, executor));
        if (vagVar != null && vagVar.c != executor) {
            throw new IllegalArgumentException("Listener already registered with different executor.");
        }
    }

    public htm(Object obj) {
        this.a = obj;
    }

    public htm(Object obj, byte[] bArr) {
        this.a = obj;
    }

    @Deprecated
    public htm(CronetEngine cronetEngine) {
        this.a = cronetEngine;
    }

    public htm(short[] sArr) {
        this.a = new kuu(10);
    }

    public htm(Context context, byte[] bArr, char[] cArr) {
        this.a = new vme(context);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public htm(gjv gjvVar) {
        this.a = DesugarCollections.unmodifiableMap(new HashMap((Map) gjvVar.a));
    }

    public htm(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        char[] cArr = ify.a;
        this.a = new ArrayDeque(0);
    }

    public htm(short[] sArr, char[] cArr) {
        this.a = wub.L(new txv(10));
    }

    public htm(char[] cArr, short[] sArr) {
        this.a = new HashMap();
    }

    public htm() {
        this.a = new aitm();
    }

    public htm(byte[] bArr, short[] sArr) {
        this.a = new ArrayDeque();
    }

    public htm(char[] cArr, byte[] bArr) {
        this.a = new ArrayList();
    }

    public htm(byte[] bArr) {
        this.a = new ArrayDeque();
    }

    public htm(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public htm(int[] iArr) {
        this.a = new ConcurrentHashMap();
    }

    public htm(xyc xycVar) {
        this.a = new uzz(xycVar);
    }

    public htm(char[] cArr) {
        this.a = new ArrayList();
    }

    public htm(Context context, byte[] bArr) {
        this.a = (UserManager) context.getSystemService(UserManager.class);
    }

    public htm(short[] sArr, byte[] bArr) {
        this.a = woy.dG(new kbh(14));
    }

    public htm(Context context) {
        this.a = new nas(context);
    }

    public htm(Bundle bundle) {
        bundle.getClass();
        this.a = bundle;
    }

    public /* synthetic */ htm(byte[] bArr, byte[] bArr2, char[] cArr) {
        this(new Bundle());
    }
}
