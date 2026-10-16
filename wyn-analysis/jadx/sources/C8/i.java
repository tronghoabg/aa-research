package C8;

import A7.C0237b0;
import Cd.C0352u;
import D6.C0395s;
import Ef.H;
import Ef.H0;
import G6.L;
import a9.C1342b;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import b4.InterfaceC1510f;
import be.EnumC1525a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzceq;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzfqg;
import com.google.android.gms.internal.ads.zzfqq;
import com.google.android.gms.internal.ads.zzhcc;
import com.google.android.gms.internal.identity.zzbi;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuthRegistrar;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ilrd.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.L0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.M0;
import com.qonversion.android.sdk.internal.api.ApiHeadersProvider;
import com.unity3d.services.UnityAdsConstants;
import e0.C2454f;
import e0.x;
import e4.C2471a;
import ef.C2527k;
import ef.C2532p;
import ff.AbstractC2640A;
import ff.p;
import h6.C2782a;
import h6.C2783b;
import h6.InterfaceC2787f;
import i0.C2821A;
import i0.C2829g;
import i0.C2830h;
import i0.C2831i;
import i0.C2832j;
import i0.C2833k;
import i0.C2834l;
import i0.C2835m;
import i0.C2836n;
import i0.C2837o;
import i0.C2838p;
import i0.q;
import i0.r;
import i0.t;
import i0.u;
import i0.y;
import i0.z;
import j$.util.DesugarCollections;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import k3.C3184p;
import kd.C3308d;
import kd.C3310f;
import kd.C3311g;
import kd.C3321q;
import kotlin.jvm.internal.AbstractC3340k;
import n7.AbstractC3598c;
import n7.AbstractC3601f;
import o6.C3650a;
import o6.C3653d;
import o6.C3654e;
import org.json.JSONException;
import org.json.JSONObject;
import r7.AbstractC3935e;
import re.C3977a;
import re.C3980d;
import s9.o;
import te.EnumC4158a;
import u6.v;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;
import ve.C4343a;
import we.C4404a;
import x9.C4503c;
import x9.InterfaceC4505e;

/* loaded from: classes4.dex */
public final class i implements L8.e, zzhcc, P2.d, InterfaceC2787f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1938a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1939b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1940c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1941d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1942e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1943f;

    public /* synthetic */ i(int i5, boolean z2) {
        this.f1938a = i5;
    }

    public static i l(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        i iVar = new i(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) iVar.f1942e)) {
            try {
                ((ArrayDeque) iVar.f1942e).clear();
                String string = ((SharedPreferences) iVar.f1939b).getString((String) iVar.f1940c, "");
                if (!TextUtils.isEmpty(string) && string.contains((String) iVar.f1941d)) {
                    String[] strArrSplit = string.split((String) iVar.f1941d, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) iVar.f1942e).add(str);
                        }
                    }
                    return iVar;
                }
                return iVar;
            } finally {
            }
        }
    }

    public static void m(x xVar, double d3, double d5, double d10, double d11, double d12, double d13, double d14, boolean z2, boolean z10) {
        double d15;
        double d16;
        double d17 = d12;
        double d18 = (d14 / 180) * 3.141592653589793d;
        double dCos = Math.cos(d18);
        double dSin = Math.sin(d18);
        double d19 = ((d5 * dSin) + (d3 * dCos)) / d17;
        double d20 = ((d5 * dCos) + ((-d3) * dSin)) / d13;
        double d21 = ((d11 * dSin) + (d10 * dCos)) / d17;
        double d22 = ((d11 * dCos) + ((-d10) * dSin)) / d13;
        double d23 = d19 - d21;
        double d24 = d20 - d22;
        double d25 = 2;
        double d26 = (d19 + d21) / d25;
        double d27 = (d20 + d22) / d25;
        double d28 = (d24 * d24) + (d23 * d23);
        if (d28 == 0.0d) {
            return;
        }
        double d29 = (1.0d / d28) - 0.25d;
        if (d29 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d28) / 1.99999d);
            m(xVar, d3, d5, d10, d11, d17 * dSqrt, d13 * dSqrt, d14, z2, z10);
            return;
        }
        double dSqrt2 = Math.sqrt(d29);
        double d30 = d23 * dSqrt2;
        double d31 = dSqrt2 * d24;
        if (z2 == z10) {
            d15 = d26 - d31;
            d16 = d27 + d30;
        } else {
            d15 = d26 + d31;
            d16 = d27 - d30;
        }
        double dAtan2 = Math.atan2(d20 - d16, d19 - d15);
        double dAtan22 = Math.atan2(d22 - d16, d21 - d15) - dAtan2;
        if (z10 != (dAtan22 >= 0.0d)) {
            dAtan22 = dAtan22 > 0.0d ? dAtan22 - 6.283185307179586d : dAtan22 + 6.283185307179586d;
        }
        double d32 = d15 * d17;
        double d33 = d16 * d13;
        double d34 = (d32 * dCos) - (d33 * dSin);
        double d35 = (d33 * dCos) + (d32 * dSin);
        double d36 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan22 * d36) / 3.141592653589793d));
        double dCos2 = Math.cos(d18);
        double dSin2 = Math.sin(d18);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d37 = dAtan22;
        double d38 = -d17;
        double d39 = d38 * dCos2;
        double d40 = d13 * dSin2;
        double d41 = (d39 * dSin3) - (d40 * dCos3);
        double d42 = d38 * dSin2;
        double d43 = d13 * dCos2;
        double d44 = (dCos3 * d43) + (dSin3 * d42);
        double d45 = d37 / iCeil;
        int i5 = 0;
        double d46 = d41;
        double d47 = d44;
        double d48 = d5;
        double d49 = dAtan2;
        double d50 = d3;
        while (i5 < iCeil) {
            double d51 = d49 + d45;
            double dSin4 = Math.sin(d51);
            double dCos4 = Math.cos(d51);
            int i10 = i5;
            double d52 = (((d17 * dCos2) * dCos4) + d34) - (d40 * dSin4);
            int i11 = iCeil;
            double d53 = (d43 * dSin4) + (d17 * dSin2 * dCos4) + d35;
            double d54 = (d39 * dSin4) - (d40 * dCos4);
            double d55 = (dCos4 * d43) + (dSin4 * d42);
            double d56 = d51 - d49;
            double dTan = Math.tan(d56 / d25);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d36) - 1) * Math.sin(d56)) / 3;
            ((C2454f) xVar).f34364a.cubicTo((float) ((d46 * dSqrt3) + d50), (float) ((d47 * dSqrt3) + d48), (float) (d52 - (dSqrt3 * d54)), (float) (d53 - (dSqrt3 * d55)), (float) d52, (float) d53);
            dSin2 = dSin2;
            d50 = d52;
            i5 = i10 + 1;
            d34 = d34;
            d36 = d36;
            d49 = d51;
            d47 = d55;
            d46 = d54;
            d48 = d53;
            iCeil = i11;
            d17 = d12;
        }
    }

    public static void t(Throwable th) {
        Log.e("WebChromeClientImpl", th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    @Override // P2.d, h6.InterfaceC2787f
    public int a(long j8) {
        switch (this.f1938a) {
            case 4:
                long[] jArr = (long[]) this.f1940c;
                int iA = Q1.x.a(jArr, j8, false);
                if (iA < jArr.length) {
                    return iA;
                }
                return -1;
            default:
                long[] jArr2 = (long[]) this.f1940c;
                int iB = v.b(jArr2, j8, false);
                if (iB < jArr2.length) {
                    return iB;
                }
                return -1;
        }
    }

    public synchronized void b(long j8, tf.l lVar) throws Throwable {
        Throwable th;
        try {
            try {
                H0 job = (H0) this.f1942e;
                if (job != null) {
                    try {
                        AbstractC3340k.e(job, "job");
                        if (job.isActive()) {
                            job.cancel(null);
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "IlrdScheduler", wg.b.c(new StringBuilder("Task "), (String) this.f1940c, " cancelled"), null, false, 12, null);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f1942e = H.D((Kd.a) this.f1939b, null, new w(this, j8, lVar, null), 3);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void c(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g lastClickPosition) {
        AbstractC3340k.e(lastClickPosition, "lastClickPosition");
        List list = (List) this.f1940c;
        if (list != null) {
            G.h((L0) this.f1943f, list, ((s) this.f1942e).b(), (com.moloco.sdk.internal.services.events.c) this.f1939b, lastClickPosition);
            this.f1940c = null;
        }
    }

    public byte[] d(String rsaPublicKey) throws BadPaddingException, NoSuchPaddingException, InvalidKeySpecException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        AbstractC3340k.e(rsaPublicKey, "rsaPublicKey");
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.f1942e;
        AbstractC3340k.d(secretKeySpec.getEncoded(), "getEncoded(...)");
        Cipher cipher = Cipher.getInstance((String) ((C2532p) this.f1940c).getValue());
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance((String) ((C2532p) this.f1939b).getValue()).generatePublic(new X509EncodedKeySpec(Base64.decode(rsaPublicKey, 0)));
        AbstractC3340k.d(publicKeyGeneratePublic, "generatePublic(...)");
        cipher.init(1, publicKeyGeneratePublic);
        byte[] bArrDoFinal = cipher.doFinal(secretKeySpec.getEncoded());
        AbstractC3340k.d(bArrDoFinal, "doFinal(...)");
        return bArrDoFinal;
    }

    public void e(InterfaceC1510f interfaceC1510f, Class cls) {
        ((ArrayList) this.f1942e).add(new C2527k(interfaceC1510f, cls));
    }

    public void f(C2471a c2471a, Class cls) {
        ((ArrayList) this.f1940c).add(new C2527k(c2471a, cls));
    }

    @Override // P2.d, h6.InterfaceC2787f
    public List g(long j8) {
        switch (this.f1938a) {
            case 4:
                V2.c cVar = (V2.c) this.f1939b;
                ArrayList arrayList = new ArrayList();
                cVar.g(j8, cVar.f12970h, arrayList);
                TreeMap treeMap = new TreeMap();
                cVar.i(j8, false, cVar.f12970h, treeMap);
                HashMap map = (HashMap) this.f1942e;
                cVar.h(j8, (Map) this.f1941d, map, cVar.f12970h, treeMap);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    String str = (String) ((HashMap) this.f1943f).get(pair.second);
                    if (str != null) {
                        byte[] bArrDecode = Base64.decode(str, 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        V2.f fVar = (V2.f) map.get(pair.first);
                        fVar.getClass();
                        arrayList2.add(new P1.b(null, null, null, bitmapDecodeByteArray, fVar.f12989c, 0, fVar.f12991e, fVar.f12988b, 0, Integer.MIN_VALUE, -3.4028235E38f, fVar.f12992f, fVar.f12993g, false, -16777216, fVar.f12996j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                }
                for (Map.Entry entry : treeMap.entrySet()) {
                    V2.f fVar2 = (V2.f) map.get(entry.getKey());
                    fVar2.getClass();
                    P1.a aVar = (P1.a) entry.getValue();
                    CharSequence charSequence = aVar.f8985a;
                    charSequence.getClass();
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
                    for (V2.a aVar2 : (V2.a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), V2.a.class)) {
                        spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(aVar2), spannableStringBuilder.getSpanEnd(aVar2), (CharSequence) "");
                    }
                    for (int i5 = 0; i5 < spannableStringBuilder.length(); i5++) {
                        if (spannableStringBuilder.charAt(i5) == ' ') {
                            int i10 = i5 + 1;
                            int i11 = i10;
                            while (i11 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i11) == ' ') {
                                i11++;
                            }
                            int i12 = i11 - i10;
                            if (i12 > 0) {
                                spannableStringBuilder.delete(i5, i12 + i5);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                        spannableStringBuilder.delete(0, 1);
                    }
                    for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                        if (spannableStringBuilder.charAt(i13) == '\n') {
                            int i14 = i13 + 1;
                            if (spannableStringBuilder.charAt(i14) == ' ') {
                                spannableStringBuilder.delete(i14, i13 + 2);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                    for (int i15 = 0; i15 < spannableStringBuilder.length() - 1; i15++) {
                        if (spannableStringBuilder.charAt(i15) == ' ') {
                            int i16 = i15 + 1;
                            if (spannableStringBuilder.charAt(i16) == '\n') {
                                spannableStringBuilder.delete(i15, i16);
                            }
                        }
                    }
                    if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
                    }
                    aVar.f8989e = fVar2.f12989c;
                    aVar.f8990f = fVar2.f12990d;
                    aVar.f8991g = fVar2.f12991e;
                    aVar.f8992h = fVar2.f12988b;
                    aVar.f8995l = fVar2.f12992f;
                    aVar.k = fVar2.f12995i;
                    aVar.f8994j = fVar2.f12994h;
                    aVar.f8999p = fVar2.f12996j;
                    arrayList2.add(aVar.a());
                }
                return arrayList2;
            default:
                C3653d c3653d = (C3653d) this.f1939b;
                ArrayList arrayList3 = new ArrayList();
                c3653d.g(j8, c3653d.f41391h, arrayList3);
                TreeMap treeMap2 = new TreeMap();
                c3653d.i(j8, false, c3653d.f41391h, treeMap2);
                HashMap map2 = (HashMap) this.f1942e;
                c3653d.h(j8, (Map) this.f1941d, map2, c3653d.f41391h, treeMap2);
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    String str2 = (String) ((HashMap) this.f1943f).get(pair2.second);
                    if (str2 != null) {
                        byte[] bArrDecode2 = Base64.decode(str2, 0);
                        Bitmap bitmapDecodeByteArray2 = BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length);
                        C3654e c3654e = (C3654e) map2.get(pair2.first);
                        c3654e.getClass();
                        arrayList4.add(new C2783b(null, null, null, bitmapDecodeByteArray2, c3654e.f41398c, 0, c3654e.f41400e, c3654e.f41397b, 0, Integer.MIN_VALUE, -3.4028235E38f, c3654e.f41401f, c3654e.f41402g, false, -16777216, c3654e.f41405j, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    }
                }
                for (Map.Entry entry2 : treeMap2.entrySet()) {
                    C3654e c3654e2 = (C3654e) map2.get(entry2.getKey());
                    c3654e2.getClass();
                    C2782a c2782a = (C2782a) entry2.getValue();
                    CharSequence charSequence2 = c2782a.f36150a;
                    charSequence2.getClass();
                    SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) charSequence2;
                    for (C3650a c3650a : (C3650a[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), C3650a.class)) {
                        spannableStringBuilder2.replace(spannableStringBuilder2.getSpanStart(c3650a), spannableStringBuilder2.getSpanEnd(c3650a), (CharSequence) "");
                    }
                    for (int i17 = 0; i17 < spannableStringBuilder2.length(); i17++) {
                        if (spannableStringBuilder2.charAt(i17) == ' ') {
                            int i18 = i17 + 1;
                            int i19 = i18;
                            while (i19 < spannableStringBuilder2.length() && spannableStringBuilder2.charAt(i19) == ' ') {
                                i19++;
                            }
                            int i20 = i19 - i18;
                            if (i20 > 0) {
                                spannableStringBuilder2.delete(i17, i20 + i17);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(0) == ' ') {
                        spannableStringBuilder2.delete(0, 1);
                    }
                    for (int i21 = 0; i21 < spannableStringBuilder2.length() - 1; i21++) {
                        if (spannableStringBuilder2.charAt(i21) == '\n') {
                            int i22 = i21 + 1;
                            if (spannableStringBuilder2.charAt(i22) == ' ') {
                                spannableStringBuilder2.delete(i22, i21 + 2);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == ' ') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                    for (int i23 = 0; i23 < spannableStringBuilder2.length() - 1; i23++) {
                        if (spannableStringBuilder2.charAt(i23) == ' ') {
                            int i24 = i23 + 1;
                            if (spannableStringBuilder2.charAt(i24) == '\n') {
                                spannableStringBuilder2.delete(i23, i24);
                            }
                        }
                    }
                    if (spannableStringBuilder2.length() > 0 && spannableStringBuilder2.charAt(spannableStringBuilder2.length() - 1) == '\n') {
                        spannableStringBuilder2.delete(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length());
                    }
                    c2782a.f36154e = c3654e2.f41398c;
                    c2782a.f36155f = c3654e2.f41399d;
                    c2782a.f36156g = c3654e2.f41400e;
                    c2782a.f36157h = c3654e2.f41397b;
                    c2782a.f36160l = c3654e2.f41401f;
                    c2782a.k = c3654e2.f41404i;
                    c2782a.f36159j = c3654e2.f41403h;
                    c2782a.f36164p = c3654e2.f41405j;
                    arrayList4.add(c2782a.a());
                }
                return arrayList4;
        }
    }

    public boolean h(String str) {
        boolean zAdd;
        if (TextUtils.isEmpty(str) || str.contains((String) this.f1941d)) {
            return false;
        }
        synchronized (((ArrayDeque) this.f1942e)) {
            zAdd = ((ArrayDeque) this.f1942e).add(str);
            if (zAdd) {
                ((ScheduledThreadPoolExecutor) this.f1943f).execute(new g(this, 19));
            }
        }
        return zAdd;
    }

    public void i(char c10, float[] fArr) {
        List listC;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5 = (ArrayList) this.f1939b;
        if (c10 == 'z' || c10 == 'Z') {
            listC = AbstractC3935e.C(C2830h.f36647c);
        } else {
            if (c10 == 'm') {
                zf.e eVarR0 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 2, 1), 2);
                arrayList2 = new ArrayList(p.a0(eVarR0, 10));
                Iterator it = eVarR0.iterator();
                while (((zf.f) it).f48505c) {
                    int iA = ((zf.f) it).a();
                    float[] fArrL0 = ff.m.l0(fArr, iA, iA + 2);
                    float f10 = fArrL0[0];
                    float f11 = fArrL0[1];
                    z tVar = new t(f10, f11);
                    if (iA > 0) {
                        tVar = new i0.s(f10, f11);
                    }
                    arrayList2.add(tVar);
                }
            } else if (c10 == 'M') {
                zf.e eVarR02 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 2, 1), 2);
                arrayList2 = new ArrayList(p.a0(eVarR02, 10));
                Iterator it2 = eVarR02.iterator();
                while (((zf.f) it2).f48505c) {
                    int iA2 = ((zf.f) it2).a();
                    float[] fArrL02 = ff.m.l0(fArr, iA2, iA2 + 2);
                    float f12 = fArrL02[0];
                    float f13 = fArrL02[1];
                    z c2834l = new C2834l(f12, f13);
                    if (iA2 > 0) {
                        c2834l = new C2833k(f12, f13);
                    }
                    arrayList2.add(c2834l);
                }
            } else if (c10 == 'l') {
                zf.e eVarR03 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 2, 1), 2);
                arrayList2 = new ArrayList(p.a0(eVarR03, 10));
                Iterator it3 = eVarR03.iterator();
                while (((zf.f) it3).f48505c) {
                    int iA3 = ((zf.f) it3).a();
                    float[] fArrL03 = ff.m.l0(fArr, iA3, iA3 + 2);
                    arrayList2.add(new i0.s(fArrL03[0], fArrL03[1]));
                }
            } else if (c10 == 'L') {
                zf.e eVarR04 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 2, 1), 2);
                arrayList2 = new ArrayList(p.a0(eVarR04, 10));
                Iterator it4 = eVarR04.iterator();
                while (((zf.f) it4).f48505c) {
                    int iA4 = ((zf.f) it4).a();
                    float[] fArrL04 = ff.m.l0(fArr, iA4, iA4 + 2);
                    arrayList2.add(new C2833k(fArrL04[0], fArrL04[1]));
                }
            } else {
                if (c10 == 'h') {
                    zf.e eVarR05 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 1, 1), 1);
                    arrayList4 = new ArrayList(p.a0(eVarR05, 10));
                    Iterator it5 = eVarR05.iterator();
                    while (((zf.f) it5).f48505c) {
                        int iA5 = ((zf.f) it5).a();
                        arrayList4.add(new r(ff.m.l0(fArr, iA5, iA5 + 1)[0]));
                    }
                } else if (c10 == 'H') {
                    zf.e eVarR06 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 1, 1), 1);
                    arrayList4 = new ArrayList(p.a0(eVarR06, 10));
                    Iterator it6 = eVarR06.iterator();
                    while (((zf.f) it6).f48505c) {
                        int iA6 = ((zf.f) it6).a();
                        arrayList4.add(new C2832j(ff.m.l0(fArr, iA6, iA6 + 1)[0]));
                    }
                } else if (c10 == 'v') {
                    zf.e eVarR07 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 1, 1), 1);
                    arrayList4 = new ArrayList(p.a0(eVarR07, 10));
                    Iterator it7 = eVarR07.iterator();
                    while (((zf.f) it7).f48505c) {
                        int iA7 = ((zf.f) it7).a();
                        arrayList4.add(new i0.x(ff.m.l0(fArr, iA7, iA7 + 1)[0]));
                    }
                } else if (c10 == 'V') {
                    zf.e eVarR08 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 1, 1), 1);
                    arrayList4 = new ArrayList(p.a0(eVarR08, 10));
                    Iterator it8 = eVarR08.iterator();
                    while (((zf.f) it8).f48505c) {
                        int iA8 = ((zf.f) it8).a();
                        arrayList4.add(new y(ff.m.l0(fArr, iA8, iA8 + 1)[0]));
                    }
                } else {
                    if (c10 == 'c') {
                        zf.e eVarR09 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 6, 1), 6);
                        arrayList3 = new ArrayList(p.a0(eVarR09, 10));
                        Iterator it9 = eVarR09.iterator();
                        while (((zf.f) it9).f48505c) {
                            int iA9 = ((zf.f) it9).a();
                            float[] fArrL05 = ff.m.l0(fArr, iA9, iA9 + 6);
                            arrayList3.add(new q(fArrL05[0], fArrL05[1], fArrL05[2], fArrL05[3], fArrL05[4], fArrL05[5]));
                        }
                    } else if (c10 == 'C') {
                        zf.e eVarR010 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 6, 1), 6);
                        arrayList3 = new ArrayList(p.a0(eVarR010, 10));
                        Iterator it10 = eVarR010.iterator();
                        while (((zf.f) it10).f48505c) {
                            int iA10 = ((zf.f) it10).a();
                            float[] fArrL06 = ff.m.l0(fArr, iA10, iA10 + 6);
                            arrayList3.add(new C2831i(fArrL06[0], fArrL06[1], fArrL06[2], fArrL06[3], fArrL06[4], fArrL06[5]));
                        }
                    } else if (c10 == 's') {
                        zf.e eVarR011 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 4, 1), 4);
                        arrayList3 = new ArrayList(p.a0(eVarR011, 10));
                        Iterator it11 = eVarR011.iterator();
                        while (((zf.f) it11).f48505c) {
                            int iA11 = ((zf.f) it11).a();
                            float[] fArrL07 = ff.m.l0(fArr, iA11, iA11 + 4);
                            arrayList3.add(new i0.v(fArrL07[0], fArrL07[1], fArrL07[2], fArrL07[3]));
                        }
                    } else if (c10 == 'S') {
                        zf.e eVarR012 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 4, 1), 4);
                        arrayList3 = new ArrayList(p.a0(eVarR012, 10));
                        Iterator it12 = eVarR012.iterator();
                        while (((zf.f) it12).f48505c) {
                            int iA12 = ((zf.f) it12).a();
                            float[] fArrL08 = ff.m.l0(fArr, iA12, iA12 + 4);
                            arrayList3.add(new C2836n(fArrL08[0], fArrL08[1], fArrL08[2], fArrL08[3]));
                        }
                    } else if (c10 == 'q') {
                        zf.e eVarR013 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 4, 1), 4);
                        arrayList3 = new ArrayList(p.a0(eVarR013, 10));
                        Iterator it13 = eVarR013.iterator();
                        while (((zf.f) it13).f48505c) {
                            int iA13 = ((zf.f) it13).a();
                            float[] fArrL09 = ff.m.l0(fArr, iA13, iA13 + 4);
                            arrayList3.add(new u(fArrL09[0], fArrL09[1], fArrL09[2], fArrL09[3]));
                        }
                    } else if (c10 == 'Q') {
                        zf.e eVarR014 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 4, 1), 4);
                        arrayList3 = new ArrayList(p.a0(eVarR014, 10));
                        Iterator it14 = eVarR014.iterator();
                        while (((zf.f) it14).f48505c) {
                            int iA14 = ((zf.f) it14).a();
                            float[] fArrL010 = ff.m.l0(fArr, iA14, iA14 + 4);
                            arrayList3.add(new C2835m(fArrL010[0], fArrL010[1], fArrL010[2], fArrL010[3]));
                        }
                    } else if (c10 == 't') {
                        zf.e eVarR015 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 2, 1), 2);
                        arrayList2 = new ArrayList(p.a0(eVarR015, 10));
                        Iterator it15 = eVarR015.iterator();
                        while (((zf.f) it15).f48505c) {
                            int iA15 = ((zf.f) it15).a();
                            float[] fArrL011 = ff.m.l0(fArr, iA15, iA15 + 2);
                            arrayList2.add(new i0.w(fArrL011[0], fArrL011[1]));
                        }
                    } else if (c10 == 'T') {
                        zf.e eVarR016 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 2, 1), 2);
                        arrayList2 = new ArrayList(p.a0(eVarR016, 10));
                        Iterator it16 = eVarR016.iterator();
                        while (((zf.f) it16).f48505c) {
                            int iA16 = ((zf.f) it16).a();
                            float[] fArrL012 = ff.m.l0(fArr, iA16, iA16 + 2);
                            arrayList2.add(new C2837o(fArrL012[0], fArrL012[1]));
                        }
                    } else {
                        if (c10 == 'a') {
                            zf.e eVarR017 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 7, 1), 7);
                            arrayList = new ArrayList(p.a0(eVarR017, 10));
                            Iterator it17 = eVarR017.iterator();
                            while (((zf.f) it17).f48505c) {
                                int iA17 = ((zf.f) it17).a();
                                float[] fArrL013 = ff.m.l0(fArr, iA17, iA17 + 7);
                                arrayList.add(new C2838p(fArrL013[0], fArrL013[1], fArrL013[2], Float.compare(fArrL013[3], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0, Float.compare(fArrL013[4], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0, fArrL013[5], fArrL013[6]));
                            }
                        } else {
                            if (c10 != 'A') {
                                throw new IllegalArgumentException("Unknown command for: " + c10);
                            }
                            zf.e eVarR018 = android.support.v4.media.session.b.r0(new zf.g(0, fArr.length - 7, 1), 7);
                            arrayList = new ArrayList(p.a0(eVarR018, 10));
                            Iterator it18 = eVarR018.iterator();
                            while (((zf.f) it18).f48505c) {
                                int iA18 = ((zf.f) it18).a();
                                float[] fArrL014 = ff.m.l0(fArr, iA18, iA18 + 7);
                                arrayList.add(new C2829g(fArrL014[0], fArrL014[1], fArrL014[2], Float.compare(fArrL014[3], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0, Float.compare(fArrL014[4], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != 0, fArrL014[5], fArrL014[6]));
                            }
                        }
                        listC = arrayList;
                    }
                    listC = arrayList3;
                }
                listC = arrayList4;
            }
            listC = arrayList2;
        }
        arrayList5.addAll(listC);
    }

    public Map j() {
        String language = ((Locale) this.f1940c).getLanguage();
        String strConcat = "Bearer ".concat(((C3980d) ((i) this.f1941d).f1939b).f44808a);
        EnumC4158a[] enumC4158aArr = EnumC4158a.f46040a;
        return AbstractC2640A.R(new C2527k(ApiHeadersProvider.AUTHORIZATION, strConcat), new C2527k(ApiHeadersProvider.USER_LOCALE, language), new C2527k(ApiHeadersProvider.SOURCE, (String) ((C2532p) this.f1942e).getValue()), new C2527k(ApiHeadersProvider.SOURCE_VERSION, (String) ((C2532p) this.f1943f).getValue()), new C2527k(ApiHeadersProvider.PLATFORM, "android"), new C2527k(ApiHeadersProvider.PLATFORM_VERSION, Build.VERSION.RELEASE));
    }

    @Override // P2.d, h6.InterfaceC2787f
    public long k(int i5) {
        switch (this.f1938a) {
        }
        return ((long[]) this.f1940c)[i5];
    }

    public a n(byte[] bArr, int i5, j jVar) throws s8.j {
        String str;
        if (jVar.f1945b > System.currentTimeMillis()) {
            throw new s8.j("Too many attempts.");
        }
        if (i5 == 2) {
            str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangeDebugToken?key=%s";
        } else {
            if (i5 != 3) {
                throw new IllegalArgumentException("Unknown token type.");
            }
            str = "https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s";
        }
        JSONObject jSONObject = new JSONObject(u(new URL(String.format(str, (String) this.f1942e, (String) this.f1941d, (String) this.f1940c)), bArr, jVar, true));
        String strA = AbstractC3601f.a(jSONObject.optString("token"));
        String strA2 = AbstractC3601f.a(jSONObject.optString("ttl"));
        if (strA == null || strA2 == null) {
            throw new s8.j("Unexpected server response.");
        }
        a aVar = new a();
        aVar.f1905a = strA;
        aVar.f1906b = strA2;
        return aVar;
    }

    @Override // L8.e
    public Object o(C6.l lVar) {
        return FirebaseAuthRegistrar.lambda$getComponents$0((L8.t) this.f1939b, (L8.t) this.f1940c, (L8.t) this.f1941d, (L8.t) this.f1942e, (L8.t) this.f1943f, lVar);
    }

    @Override // P2.d, h6.InterfaceC2787f
    public int p() {
        switch (this.f1938a) {
        }
        return ((long[]) this.f1940c).length;
    }

    public InterfaceC4277n q() {
        if (((C3311g) this.f1942e) == null) {
            this.f1942e = new C3311g(this);
        }
        C3311g c3311g = (C3311g) this.f1942e;
        AbstractC3340k.b(c3311g);
        return c3311g;
    }

    public ve.c r(C4343a c4343a, be.b bVar) throws be.b {
        if (c4343a == null) {
            if (bVar != null) {
                throw bVar;
            }
            throw new IllegalStateException("Unreachable code. Either response or executionException should be non-null");
        }
        try {
            Object obj = ((Map) c4343a.f47236b).get("error");
            Map map = obj instanceof Map ? (Map) obj : null;
            int i5 = c4343a.f47235a;
            if (map == null) {
                return new ve.c(i5, "No error data provided");
            }
            ((ab.b) this.f1942e).getClass();
            String strG = Fe.e.G(PglCryptUtils.KEY_MESSAGE, map);
            if (strG == null) {
                strG = "No message provided";
            }
            Fe.e.G("type", map);
            Fe.e.G("code", map);
            return new ve.c(i5, strG);
        } catch (ClassCastException e7) {
            throw new be.b(EnumC1525a.f19466i, "Unexpected payload type. Map expected", e7);
        }
    }

    public String s() throws NoSuchAlgorithmException {
        Context context = (Context) this.f1939b;
        try {
            byte[] bArrG = AbstractC3598c.g(context, context.getPackageName());
            if (bArrG != null) {
                return AbstractC3598c.c(bArrG);
            }
            Log.e("C8.i", "Could not get fingerprint hash for package: " + context.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e7) {
            Log.e("C8.i", "No such package: " + context.getPackageName(), e7);
            return null;
        }
    }

    public String toString() {
        switch (this.f1938a) {
            case 20:
                return "RemoteEvent{snapshotVersion=" + ((o) this.f1939b) + ", targetChanges=" + ((Map) this.f1940c) + ", targetMismatches=" + ((Map) this.f1941d) + ", documentUpdates=" + ((Map) this.f1942e) + ", resolvedLimboDocuments=" + ((Set) this.f1943f) + '}';
            default:
                return super.toString();
        }
    }

    public String u(URL url, byte[] bArr, j jVar, boolean z2) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        boolean z10 = true;
        try {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            InterfaceC4505e interfaceC4505e = (InterfaceC4505e) ((O9.b) this.f1943f).get();
            String str = null;
            if (interfaceC4505e != null) {
                try {
                    str = (String) Tasks.await(((C4503c) interfaceC4505e).b());
                } catch (Exception unused) {
                    Log.w("C8.i", "Unable to get heartbeats!");
                }
            }
            if (str != null) {
                httpURLConnection.setRequestProperty("X-Firebase-Client", str);
            }
            httpURLConnection.setRequestProperty("X-Android-Package", ((Context) this.f1939b).getPackageName());
            httpURLConnection.setRequestProperty("X-Android-Cert", s());
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bArr.length);
            try {
                bufferedOutputStream.write(bArr, 0, bArr.length);
                bufferedOutputStream.close();
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = responseCode >= 200 && responseCode < 300 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    } finally {
                    }
                }
                bufferedReader.close();
                String string = sb2.toString();
                if (responseCode < 200 || responseCode >= 300) {
                    z10 = false;
                }
                if (z10) {
                    if (z2) {
                        jVar.f1944a = 0L;
                        jVar.f1945b = -1L;
                    }
                    httpURLConnection.disconnect();
                    return string;
                }
                jVar.f1944a++;
                if (responseCode == 400 || responseCode == 404) {
                    jVar.f1945b = System.currentTimeMillis() + 86400000;
                } else {
                    jVar.f1945b = Math.min((long) (Math.pow(2.0d, jVar.f1944a * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L) + System.currentTimeMillis();
                }
                JSONObject jSONObject = new JSONObject(new JSONObject(string).optString("error"));
                throw new s8.j("Error returned from API. code: " + jSONObject.optInt("code") + " body: " + jSONObject.optString(PglCryptUtils.KEY_MESSAGE));
            } finally {
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public String v() {
        String str;
        synchronized (((ArrayDeque) this.f1942e)) {
            str = (String) ((ArrayDeque) this.f1942e).peek();
        }
        return str;
    }

    public boolean w(Object obj) {
        boolean zRemove;
        synchronized (((ArrayDeque) this.f1942e)) {
            zRemove = ((ArrayDeque) this.f1942e).remove(obj);
            if (zRemove) {
                ((ScheduledThreadPoolExecutor) this.f1943f).execute(new g(this, 19));
            }
        }
        return zRemove;
    }

    public void x(Runnable runnable) {
        Context context = (Context) this.f1939b;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public void y(x target) {
        C2454f c2454f;
        C2821A c2821a;
        C2821A c2821a2;
        C2821A c2821a3;
        ArrayList arrayList;
        int i5;
        int i10;
        z zVar;
        AbstractC3340k.e(target, "target");
        C2454f c2454f2 = (C2454f) target;
        c2454f2.c();
        C2821A c2821a4 = (C2821A) this.f1940c;
        c2821a4.a();
        C2821A c2821a5 = (C2821A) this.f1941d;
        c2821a5.a();
        C2821A c2821a6 = (C2821A) this.f1942e;
        c2821a6.a();
        C2821A c2821a7 = (C2821A) this.f1943f;
        c2821a7.a();
        ArrayList arrayList2 = (ArrayList) this.f1939b;
        int size = arrayList2.size();
        z zVar2 = null;
        int i11 = 0;
        while (i11 < size) {
            z zVar3 = (z) arrayList2.get(i11);
            if (zVar2 == null) {
                zVar2 = zVar3;
            }
            boolean z2 = zVar3 instanceof C2830h;
            Path path = c2454f2.f34364a;
            if (z2) {
                c2821a4.f36463a = c2821a6.f36463a;
                c2821a4.f36464b = c2821a6.f36464b;
                c2821a5.f36463a = c2821a6.f36463a;
                c2821a5.f36464b = c2821a6.f36464b;
                path.close();
                path.moveTo(c2821a4.f36463a, c2821a4.f36464b);
            } else if (zVar3 instanceof t) {
                t tVar = (t) zVar3;
                float f10 = c2821a4.f36463a;
                float f11 = tVar.f36685c;
                c2821a4.f36463a = f10 + f11;
                float f12 = c2821a4.f36464b;
                float f13 = tVar.f36686d;
                c2821a4.f36464b = f12 + f13;
                path.rMoveTo(f11, f13);
                c2821a6.f36463a = c2821a4.f36463a;
                c2821a6.f36464b = c2821a4.f36464b;
            } else if (zVar3 instanceof C2834l) {
                C2834l c2834l = (C2834l) zVar3;
                float f14 = c2834l.f36657c;
                c2821a4.f36463a = f14;
                float f15 = c2834l.f36658d;
                c2821a4.f36464b = f15;
                path.moveTo(f14, f15);
                c2821a6.f36463a = c2821a4.f36463a;
                c2821a6.f36464b = c2821a4.f36464b;
            } else if (zVar3 instanceof i0.s) {
                i0.s sVar = (i0.s) zVar3;
                float f16 = sVar.f36683c;
                float f17 = sVar.f36684d;
                path.rLineTo(f16, f17);
                c2821a4.f36463a += sVar.f36683c;
                c2821a4.f36464b += f17;
            } else if (zVar3 instanceof C2833k) {
                C2833k c2833k = (C2833k) zVar3;
                float f18 = c2833k.f36655c;
                float f19 = c2833k.f36656d;
                path.lineTo(f18, f19);
                c2821a4.f36463a = c2833k.f36655c;
                c2821a4.f36464b = f19;
            } else if (zVar3 instanceof r) {
                r rVar = (r) zVar3;
                path.rLineTo(rVar.f36682c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                c2821a4.f36463a += rVar.f36682c;
            } else if (zVar3 instanceof C2832j) {
                C2832j c2832j = (C2832j) zVar3;
                path.lineTo(c2832j.f36654c, c2821a4.f36464b);
                c2821a4.f36463a = c2832j.f36654c;
            } else if (zVar3 instanceof i0.x) {
                i0.x xVar = (i0.x) zVar3;
                path.rLineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xVar.f36697c);
                c2821a4.f36464b += xVar.f36697c;
            } else if (zVar3 instanceof y) {
                y yVar = (y) zVar3;
                path.lineTo(c2821a4.f36463a, yVar.f36698c);
                c2821a4.f36464b = yVar.f36698c;
            } else if (zVar3 instanceof q) {
                q qVar = (q) zVar3;
                path.rCubicTo(qVar.f36676c, qVar.f36677d, qVar.f36678e, qVar.f36679f, qVar.f36680g, qVar.f36681h);
                c2821a5.f36463a = c2821a4.f36463a + qVar.f36678e;
                c2821a5.f36464b = c2821a4.f36464b + qVar.f36679f;
                c2821a4.f36463a += qVar.f36680g;
                c2821a4.f36464b += qVar.f36681h;
            } else if (zVar3 instanceof C2831i) {
                C2831i c2831i = (C2831i) zVar3;
                path.cubicTo(c2831i.f36648c, c2831i.f36649d, c2831i.f36650e, c2831i.f36651f, c2831i.f36652g, c2831i.f36653h);
                c2821a5.f36463a = c2831i.f36650e;
                c2821a5.f36464b = c2831i.f36651f;
                c2821a4.f36463a = c2831i.f36652g;
                c2821a4.f36464b = c2831i.f36653h;
            } else if (zVar3 instanceof i0.v) {
                i0.v vVar = (i0.v) zVar3;
                AbstractC3340k.b(zVar2);
                if (zVar2.f36699a) {
                    c2821a7.f36463a = c2821a4.f36463a - c2821a5.f36463a;
                    c2821a7.f36464b = c2821a4.f36464b - c2821a5.f36464b;
                } else {
                    c2821a7.a();
                }
                path.rCubicTo(c2821a7.f36463a, c2821a7.f36464b, vVar.f36691c, vVar.f36692d, vVar.f36693e, vVar.f36694f);
                c2821a5.f36463a = c2821a4.f36463a + vVar.f36691c;
                c2821a5.f36464b = c2821a4.f36464b + vVar.f36692d;
                c2821a4.f36463a += vVar.f36693e;
                c2821a4.f36464b += vVar.f36694f;
            } else if (zVar3 instanceof C2836n) {
                C2836n c2836n = (C2836n) zVar3;
                AbstractC3340k.b(zVar2);
                if (zVar2.f36699a) {
                    float f20 = 2;
                    c2821a7.f36463a = (c2821a4.f36463a * f20) - c2821a5.f36463a;
                    c2821a7.f36464b = (f20 * c2821a4.f36464b) - c2821a5.f36464b;
                } else {
                    c2821a7.f36463a = c2821a4.f36463a;
                    c2821a7.f36464b = c2821a4.f36464b;
                }
                path.cubicTo(c2821a7.f36463a, c2821a7.f36464b, c2836n.f36663c, c2836n.f36664d, c2836n.f36665e, c2836n.f36666f);
                c2821a5.f36463a = c2836n.f36663c;
                c2821a5.f36464b = c2836n.f36664d;
                c2821a4.f36463a = c2836n.f36665e;
                c2821a4.f36464b = c2836n.f36666f;
            } else if (zVar3 instanceof u) {
                u uVar = (u) zVar3;
                float f21 = uVar.f36687c;
                float f22 = uVar.f36688d;
                float f23 = uVar.f36689e;
                float f24 = uVar.f36690f;
                path.rQuadTo(f21, f22, f23, f24);
                c2821a5.f36463a = c2821a4.f36463a + uVar.f36687c;
                c2821a5.f36464b = c2821a4.f36464b + f22;
                c2821a4.f36463a += f23;
                c2821a4.f36464b += f24;
            } else if (zVar3 instanceof C2835m) {
                C2835m c2835m = (C2835m) zVar3;
                float f25 = c2835m.f36659c;
                float f26 = c2835m.f36660d;
                float f27 = c2835m.f36661e;
                float f28 = c2835m.f36662f;
                path.quadTo(f25, f26, f27, f28);
                c2821a5.f36463a = c2835m.f36659c;
                c2821a5.f36464b = f26;
                c2821a4.f36463a = f27;
                c2821a4.f36464b = f28;
            } else if (zVar3 instanceof i0.w) {
                i0.w wVar = (i0.w) zVar3;
                AbstractC3340k.b(zVar2);
                if (zVar2.f36700b) {
                    c2821a7.f36463a = c2821a4.f36463a - c2821a5.f36463a;
                    c2821a7.f36464b = c2821a4.f36464b - c2821a5.f36464b;
                } else {
                    c2821a7.a();
                }
                float f29 = c2821a7.f36463a;
                float f30 = c2821a7.f36464b;
                float f31 = wVar.f36695c;
                float f32 = wVar.f36696d;
                path.rQuadTo(f29, f30, f31, f32);
                c2821a5.f36463a = c2821a4.f36463a + c2821a7.f36463a;
                c2821a5.f36464b = c2821a4.f36464b + c2821a7.f36464b;
                c2821a4.f36463a += wVar.f36695c;
                c2821a4.f36464b += f32;
            } else if (zVar3 instanceof C2837o) {
                C2837o c2837o = (C2837o) zVar3;
                AbstractC3340k.b(zVar2);
                if (zVar2.f36700b) {
                    float f33 = 2;
                    c2821a7.f36463a = (c2821a4.f36463a * f33) - c2821a5.f36463a;
                    c2821a7.f36464b = (f33 * c2821a4.f36464b) - c2821a5.f36464b;
                } else {
                    c2821a7.f36463a = c2821a4.f36463a;
                    c2821a7.f36464b = c2821a4.f36464b;
                }
                float f34 = c2821a7.f36463a;
                float f35 = c2821a7.f36464b;
                float f36 = c2837o.f36667c;
                float f37 = c2837o.f36668d;
                path.quadTo(f34, f35, f36, f37);
                c2821a5.f36463a = c2821a7.f36463a;
                c2821a5.f36464b = c2821a7.f36464b;
                c2821a4.f36463a = c2837o.f36667c;
                c2821a4.f36464b = f37;
            } else {
                if (zVar3 instanceof C2838p) {
                    C2838p c2838p = (C2838p) zVar3;
                    float f38 = c2838p.f36674h;
                    float f39 = c2821a4.f36463a;
                    float f40 = f38 + f39;
                    float f41 = c2821a4.f36464b;
                    float f42 = c2838p.f36675i + f41;
                    double d3 = f39;
                    C2454f c2454f3 = c2454f2;
                    C2821A c2821a8 = c2821a4;
                    c2454f = c2454f3;
                    zVar = zVar3;
                    c2821a3 = c2821a7;
                    c2821a2 = c2821a6;
                    arrayList = arrayList2;
                    i5 = size;
                    i10 = i11;
                    m(target, d3, f41, f40, f42, c2838p.f36669c, c2838p.f36670d, c2838p.f36671e, c2838p.f36672f, c2838p.f36673g);
                    c2821a8.f36463a = f40;
                    c2821a8.f36464b = f42;
                    c2821a = c2821a5;
                    c2821a.f36463a = f40;
                    c2821a.f36464b = f42;
                    c2821a4 = c2821a8;
                } else {
                    c2454f = c2454f2;
                    C2821A c2821a9 = c2821a4;
                    c2821a = c2821a5;
                    c2821a2 = c2821a6;
                    c2821a3 = c2821a7;
                    arrayList = arrayList2;
                    i5 = size;
                    i10 = i11;
                    if (zVar3 instanceof C2829g) {
                        C2829g c2829g = (C2829g) zVar3;
                        double d5 = c2821a9.f36463a;
                        double d10 = c2821a9.f36464b;
                        double d11 = c2829g.f36645h;
                        float f43 = c2829g.f36646i;
                        zVar = zVar3;
                        m(target, d5, d10, d11, f43, c2829g.f36640c, c2829g.f36641d, c2829g.f36642e, c2829g.f36643f, c2829g.f36644g);
                        float f44 = c2829g.f36645h;
                        c2821a4 = c2821a9;
                        c2821a4.f36463a = f44;
                        c2821a4.f36464b = f43;
                        c2821a = c2821a;
                        c2821a.f36463a = f44;
                        c2821a.f36464b = f43;
                    } else {
                        c2821a4 = c2821a9;
                        zVar = zVar3;
                    }
                }
                i11 = i10 + 1;
                c2821a5 = c2821a;
                c2454f2 = c2454f;
                c2821a6 = c2821a2;
                c2821a7 = c2821a3;
                arrayList2 = arrayList;
                size = i5;
                zVar2 = zVar;
            }
            c2454f = c2454f2;
            c2821a = c2821a5;
            c2821a2 = c2821a6;
            c2821a3 = c2821a7;
            arrayList = arrayList2;
            i5 = size;
            i10 = i11;
            zVar = zVar3;
            i11 = i10 + 1;
            c2821a5 = c2821a;
            c2454f2 = c2454f;
            c2821a6 = c2821a2;
            c2821a7 = c2821a3;
            arrayList2 = arrayList;
            size = i5;
            zVar2 = zVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziM)).booleanValue()) {
            C6.n.f1857D.f1868h.zzi(th, "SignalGeneratorImpl.generateSignals");
        } else {
            C6.n.f1857D.f1868h.zzh(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfqq zzfqqVarA0 = N6.j.a0((p8.p) this.f1939b, (zzcex) this.f1940c);
        if (((Boolean) zzbkq.zze.zze()).booleanValue() && zzfqqVarA0 != null) {
            zzfqg zzfqgVar = (zzfqg) this.f1942e;
            zzfqgVar.zzj(th);
            zzfqgVar.zzd(false);
            zzfqqVarA0.zza(zzfqgVar);
            zzfqqVarA0.zzh();
        }
        zzceq zzceqVar = (zzceq) this.f1941d;
        if (zzceqVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                sb2.append("Internal error. ");
                sb2.append(message);
                message = sb2.toString();
            }
            zzceqVar.zzb(message);
        } catch (RemoteException e7) {
            int i5 = L.f4523b;
            H6.l.d("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public void zzb(Object obj) {
        N6.j jVar = (N6.j) this.f1943f;
        AtomicBoolean atomicBoolean = jVar.f8484B;
        N6.s sVar = (N6.s) obj;
        zzfqq zzfqqVarA0 = N6.j.a0((p8.p) this.f1939b, (zzcex) this.f1940c);
        atomicBoolean.set(true);
        boolean zBooleanValue = ((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zziG)).booleanValue();
        zzceq zzceqVar = (zzceq) this.f1941d;
        zzfqg zzfqgVar = (zzfqg) this.f1942e;
        if (!zBooleanValue) {
            if (zzceqVar != null) {
                try {
                    zzceqVar.zzb("QueryInfo generation has been disabled.");
                } catch (RemoteException e7) {
                    String strConcat = "QueryInfo generation has been disabled.".concat(e7.toString());
                    int i5 = L.f4523b;
                    H6.l.c(strConcat);
                }
            }
            if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarA0 == null) {
                return;
            }
            zzfqgVar.zzk("QueryInfo generation has been disabled.");
            zzfqgVar.zzd(false);
            zzfqqVarA0.zza(zzfqgVar);
            zzfqqVarA0.zzh();
            return;
        }
        try {
            try {
                if (sVar == null) {
                    if (zzceqVar != null) {
                        zzceqVar.zzc(null, null, null);
                    }
                    zzfqgVar.zzd(true);
                    if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarA0 == null) {
                        return;
                    }
                    zzfqqVarA0.zza(zzfqgVar);
                    zzfqqVarA0.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty(new JSONObject(sVar.f8541b).optString("request_id", ""))) {
                        int i10 = L.f4523b;
                        H6.l.f("The request ID is empty in request JSON.");
                        if (zzceqVar != null) {
                            zzceqVar.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfqgVar.zzk("Request ID empty");
                        zzfqgVar.zzd(false);
                        if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarA0 == null) {
                            return;
                        }
                        zzfqqVarA0.zza(zzfqgVar);
                        zzfqqVarA0.zzh();
                        return;
                    }
                    Bundle bundle = sVar.f8543d;
                    boolean z2 = jVar.f8503p;
                    String str = jVar.f8504q;
                    String str2 = jVar.f8505r;
                    if (z2 && bundle != null && bundle.getInt(str2, -1) == -1) {
                        bundle.putInt(str2, jVar.f8506s.get());
                    }
                    if (jVar.f8502o && bundle != null && TextUtils.isEmpty(bundle.getString(str))) {
                        if (TextUtils.isEmpty(jVar.f8508u)) {
                            jVar.f8508u = C6.n.f1857D.f1863c.E(jVar.f8490b, jVar.f8507t.f4927a);
                        }
                        bundle.putString(str, jVar.f8508u);
                    }
                    if (zzceqVar != null) {
                        zzceqVar.zzc(sVar.f8540a, sVar.f8541b, bundle);
                    }
                    zzfqgVar.zzd(true);
                    if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarA0 == null) {
                        return;
                    }
                    zzfqqVarA0.zza(zzfqgVar);
                    zzfqqVarA0.zzh();
                } catch (JSONException e10) {
                    int i11 = L.f4523b;
                    H6.l.f("Failed to create JSON object from the request string.");
                    if (zzceqVar != null) {
                        String string = e10.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 33);
                        sb2.append("Internal error for request JSON: ");
                        sb2.append(string);
                        zzceqVar.zzb(sb2.toString());
                    }
                    zzfqgVar.zzj(e10);
                    zzfqgVar.zzd(false);
                    C6.n.f1857D.f1868h.zzh(e10, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarA0 == null) {
                        return;
                    }
                    zzfqqVarA0.zza(zzfqgVar);
                    zzfqqVarA0.zzh();
                }
            } catch (RemoteException e11) {
                zzfqgVar.zzj(e11);
                zzfqgVar.zzd(false);
                int i12 = L.f4523b;
                H6.l.d("", e11);
                C6.n.f1857D.f1868h.zzh(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbkq.zze.zze()).booleanValue() || zzfqqVarA0 == null) {
                    return;
                }
                zzfqqVarA0.zza(zzfqgVar);
                zzfqqVarA0.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbkq.zze.zze()).booleanValue() && zzfqqVarA0 != null) {
                zzfqqVarA0.zza(zzfqgVar);
                zzfqqVarA0.zzh();
            }
            throw th;
        }
    }

    public i(b7.k kVar) {
        this.f1938a = 16;
        C3980d c3980d = (C3980d) kVar.f19396b;
        C3184p c3184p = (C3184p) kVar.f19397c;
        C3977a c3977a = (C3977a) kVar.f19398d;
        this.f1939b = c3980d;
        this.f1940c = c3184p;
        this.f1941d = c3977a;
        this.f1942e = null;
        this.f1943f = null;
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i5) {
        this.f1938a = i5;
        this.f1939b = obj;
        this.f1940c = obj2;
        this.f1941d = obj3;
        this.f1942e = obj4;
        this.f1943f = obj5;
    }

    public i(Kd.a aVar, com.moloco.sdk.internal.services.k timeProvider, String str) {
        this.f1938a = 7;
        AbstractC3340k.e(timeProvider, "timeProvider");
        this.f1939b = aVar;
        this.f1941d = timeProvider;
        this.f1940c = str;
        this.f1943f = new SimpleDateFormat("HH:mm:ss");
    }

    public i(N6.j jVar, p8.p pVar, zzcex zzcexVar, zzceq zzceqVar, zzfqg zzfqgVar) {
        this.f1938a = 2;
        this.f1939b = pVar;
        this.f1940c = zzcexVar;
        this.f1941d = zzceqVar;
        this.f1942e = zzfqgVar;
        this.f1943f = jVar;
    }

    public i(com.moloco.sdk.internal.services.events.c customUserEventBuilderService, List list, ArrayList arrayList) {
        this.f1938a = 10;
        s sVar = new s();
        L0 vastTracker = M0.a();
        AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
        AbstractC3340k.e(vastTracker, "vastTracker");
        this.f1939b = customUserEventBuilderService;
        this.f1940c = list;
        this.f1941d = arrayList;
        this.f1942e = sVar;
        this.f1943f = vastTracker;
    }

    public i(int i5) throws NoSuchAlgorithmException {
        this.f1938a = i5;
        switch (i5) {
            case 9:
                this.f1939b = Fe.c.z(new C0352u(26));
                this.f1940c = Fe.c.z(new C0352u(27));
                C2532p c2532pZ = Fe.c.z(new C0352u(28));
                this.f1941d = Fe.c.z(new C0352u(29));
                KeyGenerator keyGenerator = KeyGenerator.getInstance((String) c2532pZ.getValue());
                keyGenerator.init(256);
                this.f1942e = new SecretKeySpec(keyGenerator.generateKey().getEncoded(), (String) c2532pZ.getValue());
                this.f1943f = Fe.c.z(new com.moloco.sdk.internal.services.encryption.a(0));
                break;
            case 13:
                this.f1939b = new ArrayList();
                this.f1940c = new C2821A();
                this.f1941d = new C2821A();
                this.f1942e = new C2821A();
                this.f1943f = new C2821A();
                break;
            default:
                this.f1939b = null;
                this.f1940c = null;
                this.f1941d = null;
                this.f1942e = null;
                this.f1943f = null;
                break;
        }
    }

    public i(a2.v localStorage, Locale locale, i iVar) {
        this.f1938a = 21;
        AbstractC3340k.e(localStorage, "localStorage");
        AbstractC3340k.e(locale, "locale");
        this.f1939b = localStorage;
        this.f1940c = locale;
        this.f1941d = iVar;
        this.f1942e = Fe.c.z(new C4404a(this, 0));
        this.f1943f = Fe.c.z(new C4404a(this, 1));
    }

    public i(InterfaceC4269f binaryMessenger, Context context, C3321q c3321q) {
        this.f1938a = 14;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        this.f1940c = binaryMessenger;
        this.f1941d = new C3308d(new com.google.android.gms.ads.nativead.l(new C3310f(binaryMessenger), 8));
        this.f1939b = context;
        this.f1943f = c3321q;
    }

    public i(v6.l lVar, ad.r delayCalculator, i iVar, ab.b errorMapper, C1342b c1342b) {
        this.f1938a = 18;
        AbstractC3340k.e(delayCalculator, "delayCalculator");
        AbstractC3340k.e(errorMapper, "errorMapper");
        this.f1939b = lVar;
        this.f1940c = delayCalculator;
        this.f1941d = iVar;
        this.f1942e = errorMapper;
        this.f1943f = c1342b;
    }

    public i(V2.c cVar, HashMap map, HashMap map2, HashMap map3) {
        this.f1938a = 4;
        this.f1939b = cVar;
        this.f1942e = map2;
        this.f1943f = map3;
        this.f1941d = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i5 = 0;
        cVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i5] = ((Long) it.next()).longValue();
            i5++;
        }
        this.f1940c = jArr;
    }

    public i(C3653d c3653d, HashMap map, HashMap map2, HashMap map3) {
        this.f1938a = 15;
        this.f1939b = c3653d;
        this.f1942e = map2;
        this.f1943f = map3;
        this.f1941d = DesugarCollections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i5 = 0;
        c3653d.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i5] = ((Long) it.next()).longValue();
            i5++;
        }
        this.f1940c = jArr;
    }

    public i(Context context, C0237b0 c0237b0) {
        this.f1938a = 3;
        this.f1943f = new Qb.a(this);
        this.f1939b = context;
        this.f1940c = c0237b0;
        int i5 = x7.o.f47805a;
        this.f1941d = new zzbi(context);
        LocationRequest locationRequestV = LocationRequest.V();
        this.f1942e = locationRequestV;
        x7.z.b(100);
        locationRequestV.f26726a = 100;
        ((LocationRequest) this.f1942e).X(10000L);
        LocationRequest locationRequest = (LocationRequest) this.f1942e;
        locationRequest.getClass();
        locationRequest.f26728c = 5000L;
    }

    public i(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f1938a = 5;
        this.f1942e = new ArrayDeque();
        this.f1939b = sharedPreferences;
        this.f1940c = "topic_operation_queue";
        this.f1941d = ",";
        this.f1943f = scheduledThreadPoolExecutor;
    }

    public i(s8.g gVar) {
        this.f1938a = 0;
        gVar.a();
        gVar.a();
        O9.b bVar = ((f) gVar.c(f.class)).f1919b;
        Context context = gVar.f45328a;
        AbstractC1732v.i(context);
        s8.l lVar = gVar.f45330c;
        AbstractC1732v.i(lVar);
        AbstractC1732v.i(bVar);
        this.f1939b = context;
        this.f1940c = lVar.f45343a;
        this.f1941d = lVar.f45344b;
        String str = lVar.f45349g;
        this.f1942e = str;
        if (str != null) {
            this.f1943f = bVar;
            return;
        }
        throw new IllegalArgumentException("FirebaseOptions#getProjectId cannot be null.");
    }

    public i(X3.b bVar) {
        this.f1938a = 6;
        this.f1939b = ff.o.U0(bVar.f16080a);
        this.f1940c = ff.o.U0(bVar.f16081b);
        this.f1941d = ff.o.U0(bVar.f16082c);
        this.f1942e = ff.o.U0(bVar.f16083d);
        this.f1943f = ff.o.U0(bVar.f16084e);
    }

    public i(J5.i iVar) {
        this.f1938a = 11;
        this.f1939b = iVar;
        this.f1940c = new HashMap();
        this.f1941d = new HashSet();
        this.f1942e = new HashMap();
    }
}
