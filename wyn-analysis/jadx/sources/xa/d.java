package xa;

import A.AbstractC0221n;
import A.c0;
import A.d0;
import A7.C0273n0;
import A7.F0;
import A7.H0;
import A7.L1;
import A7.N;
import A7.T;
import D9.m;
import E5.o0;
import He.e;
import I4.B;
import I4.C;
import I4.C0617b;
import I4.InterfaceC0616a;
import I4.p;
import I4.q;
import J5.h;
import J8.AbstractC0640o;
import J9.C0643b;
import J9.C0656o;
import Pc.C0797m;
import Q1.k;
import R4.i;
import Re.AbstractC0814i;
import S3.s;
import W1.f;
import W1.v;
import X1.g;
import Yf.AbstractC1298d;
import Yf.C1299e;
import Yf.j;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import c8.C1581e;
import com.google.android.gms.internal.ads.zzdlv;
import com.google.android.gms.internal.ads.zzhcc;
import com.google.firebase.auth.FirebaseAuth;
import ef.EnumC2526j;
import ff.l;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import m9.S;
import o2.n;
import org.apache.tika.fork.ForkServer;
import org.json.JSONObject;
import v6.C4303b;
import x9.C4504d;
import y3.C4552j;

/* loaded from: classes4.dex */
public final class d implements c0, T, m, q, InterfaceC0616a, B, e, B4.e, zzhcc, i, n, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47872a;

    /* renamed from: b, reason: collision with root package name */
    public Object f47873b;

    public /* synthetic */ d(int i5, boolean z2) {
        this.f47872a = i5;
    }

    public static d G(String str) {
        return new d((TextUtils.isEmpty(str) || str.length() > 1) ? H0.UNINITIALIZED : F0.e(str.charAt(0)), 2);
    }

    public static ArrayList m(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }

    public static AbstractC0640o s(C0797m c0797m) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(s8.g.f(c0797m.f9423a));
        String str = c0797m.f9424b;
        if (str != null) {
            firebaseAuth.f(str);
        }
        return firebaseAuth.f27288f;
    }

    public void A(Exception exc) {
        k.l("MediaCodecAudioRenderer", "Audio sink error", exc);
        s sVar = ((v) this.f47873b).f15101D0;
        Handler handler = (Handler) sVar.f11009b;
        if (handler != null) {
            handler.post(new f(sVar, exc, 4));
        }
    }

    public Z8.a B(JSONObject jSONObject) {
        Z8.b c4504d;
        int i5 = jSONObject.getInt("settings_version");
        if (i5 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i5 + ". Using default settings values.", null);
            c4504d = new x4.d(29);
        } else {
            c4504d = new C4504d(29);
        }
        return c4504d.l((S) this.f47873b, jSONObject);
    }

    public void C() {
        j jVar = (j) this.f47873b;
        jVar.getClass();
        C1299e c1299e = C1299e.f16854c;
        byte[] bArrArray = jVar.f16863c.array();
        AbstractC3340k.d(bArrArray, "array(...)");
        c1299e.getClass();
        synchronized (c1299e) {
            int i5 = c1299e.f16856b;
            if (bArrArray.length + i5 < AbstractC1298d.f16853a) {
                c1299e.f16856b = i5 + (bArrArray.length / 2);
                ((l) c1299e.f16855a).addLast(bArrArray);
            }
        }
    }

    @Override // X1.g
    public boolean D() {
        return true;
    }

    @Override // X1.g
    public long E() {
        return 0L;
    }

    @Override // X1.g
    public long F(long j8, long j10) {
        return 1L;
    }

    public boolean H() {
        C0273n0 c0273n0 = (C0273n0) this.f47873b;
        if (!TextUtils.isEmpty(c0273n0.f974b)) {
            return false;
        }
        N n10 = c0273n0.f981i;
        C0273n0.d(n10);
        return n10.l0(3);
    }

    @Override // o2.n
    public void a() throws io.ktor.utils.io.T {
        X1.f fVar = (X1.f) this.f47873b;
        fVar.f15954A.a();
        io.ktor.utils.io.T t10 = fVar.f15956C;
        if (t10 != null) {
            throw t10;
        }
    }

    @Override // X1.g
    public long b(long j8) {
        return 0L;
    }

    @Override // B4.e
    public void c(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.f47873b)) {
            ((ByteBuffer) this.f47873b).position(0);
            messageDigest.update(((ByteBuffer) this.f47873b).putInt(num.intValue()).array());
        }
    }

    @Override // I4.q
    public p d(I4.v vVar) {
        switch (this.f47872a) {
            case 10:
                return new C0617b(0, (AssetManager) this.f47873b, this);
            case 11:
                return new C0617b((Resources) this.f47873b, vVar.b(Uri.class, AssetFileDescriptor.class));
            default:
                return new C(this);
        }
    }

    @Override // D9.m
    public void e() {
        B9.d dVar = (B9.d) this.f47873b;
        B9.f fVar = dVar.f1625h;
        if (fVar.f1636j == null || fVar.k == null) {
            return;
        }
        D9.e.e("Impression timer onFinish for: " + ((String) dVar.f1625h.f1636j.f8623b.f3291c));
        ((C0656o) dVar.f1625h.k).b();
    }

    @Override // A.c0
    public AbstractC0221n f(long j8, AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        return ((S3.n) this.f47873b).f(j8, initialValue, targetValue, initialVelocity);
    }

    @Override // He.e
    public void g(AbstractC0814i abstractC0814i) {
        ic.d.E("Subscribing to analytics events.");
        C0643b c0643b = (C0643b) this.f47873b;
        w8.d dVar = c0643b.f5915a;
        C4552j c4552j = new C4552j(14, false);
        c4552j.f48001b = abstractC0814i;
        c0643b.f5917c = dVar.h("fiam", c4552j);
    }

    @Override // A.c0
    public AbstractC0221n h(long j8, AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        return ((S3.n) this.f47873b).h(j8, initialValue, targetValue, initialVelocity);
    }

    @Override // A.c0
    public long i(AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        return ((S3.n) this.f47873b).i(initialValue, targetValue, initialVelocity);
    }

    @Override // I4.B
    public C4.e j(Uri uri) {
        return new C4.a((ContentResolver) this.f47873b, uri, 0);
    }

    @Override // I4.InterfaceC0616a
    public C4.e k(AssetManager assetManager, String str) {
        return new C4.k(assetManager, str, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l(int i5, int i10, h hVar) throws o0, EOFException, InterruptedIOException {
        int i11;
        int i12;
        int i13;
        long j8;
        int i14;
        int i15;
        int i16;
        int i17;
        P5.c cVar = (P5.c) this.f47873b;
        SparseArray sparseArray = cVar.f9231c;
        int i18 = 0;
        int i19 = 1;
        if (i5 != 161 && i5 != 163) {
            if (i5 == 165) {
                if (cVar.f9208G != 2) {
                    return;
                }
                P5.b bVar = (P5.b) sparseArray.get(cVar.f9213M);
                if (cVar.f9216P != 4 || !"V_VP9".equals(bVar.f9172b)) {
                    hVar.j(i10);
                    return;
                }
                Y4.b bVar2 = cVar.f9241n;
                bVar2.x(i10);
                hVar.f(bVar2.f16679a, 0, i10, false);
                return;
            }
            if (i5 == 16877) {
                cVar.c(i5);
                P5.b bVar3 = cVar.f9248u;
                int i20 = bVar3.f9177g;
                if (i20 != 1685485123 && i20 != 1685480259) {
                    hVar.j(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                bVar3.f9159N = bArr;
                hVar.f(bArr, 0, i10, false);
                return;
            }
            if (i5 == 16981) {
                cVar.c(i5);
                byte[] bArr2 = new byte[i10];
                cVar.f9248u.f9179i = bArr2;
                hVar.f(bArr2, 0, i10, false);
                return;
            }
            if (i5 == 18402) {
                byte[] bArr3 = new byte[i10];
                hVar.f(bArr3, 0, i10, false);
                cVar.c(i5);
                cVar.f9248u.f9180j = new J5.v(1, bArr3, 0, 0);
                return;
            }
            if (i5 == 21419) {
                Y4.b bVar4 = cVar.f9237i;
                Arrays.fill(bVar4.f16679a, (byte) 0);
                hVar.f(bVar4.f16679a, 4 - i10, i10, false);
                bVar4.A(0);
                cVar.f9250w = (int) bVar4.r();
                return;
            }
            if (i5 == 25506) {
                cVar.c(i5);
                byte[] bArr4 = new byte[i10];
                cVar.f9248u.k = bArr4;
                hVar.f(bArr4, 0, i10, false);
                return;
            }
            if (i5 != 30322) {
                throw o0.a("Unexpected id: " + i5, null);
            }
            cVar.c(i5);
            byte[] bArr5 = new byte[i10];
            cVar.f9248u.f9191v = bArr5;
            hVar.f(bArr5, 0, i10, false);
            return;
        }
        int i21 = cVar.f9208G;
        Y4.b bVar5 = cVar.f9235g;
        if (i21 == 0) {
            P5.d dVar = cVar.f9229b;
            cVar.f9213M = (int) dVar.c(hVar, false, true, 8);
            cVar.f9214N = dVar.f9257c;
            cVar.f9210I = -9223372036854775807L;
            cVar.f9208G = 1;
            bVar5.x(0);
        }
        P5.b bVar6 = (P5.b) sparseArray.get(cVar.f9213M);
        if (bVar6 == null) {
            hVar.j(i10 - cVar.f9214N);
            cVar.f9208G = 0;
            return;
        }
        bVar6.f9169X.getClass();
        if (cVar.f9208G == 1) {
            cVar.j(hVar, 3);
            int i22 = (bVar5.f16679a[2] & 6) >> 1;
            int i23 = 255;
            if (i22 == 0) {
                cVar.f9212K = 1;
                int[] iArr = cVar.L;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                cVar.L = iArr;
                iArr[0] = (i10 - cVar.f9214N) - 3;
            } else {
                cVar.j(hVar, 4);
                int i24 = (bVar5.f16679a[3] & 255) + 1;
                cVar.f9212K = i24;
                int[] iArr2 = cVar.L;
                if (iArr2 == null) {
                    iArr2 = new int[i24];
                } else if (iArr2.length < i24) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i24)];
                }
                cVar.L = iArr2;
                if (i22 == 2) {
                    int i25 = (i10 - cVar.f9214N) - 4;
                    int i26 = cVar.f9212K;
                    Arrays.fill(iArr2, 0, i26, i25 / i26);
                } else {
                    if (i22 != 1) {
                        if (i22 != 3) {
                            throw o0.a("Unexpected lacing value: " + i22, null);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = cVar.f9212K - i19;
                            if (i27 >= i30) {
                                i12 = i18;
                                i11 = i19;
                                cVar.L[i30] = ((i10 - cVar.f9214N) - i29) - i28;
                                break;
                            }
                            cVar.L[i27] = i18;
                            int i31 = i29 + 1;
                            cVar.j(hVar, i31);
                            if (bVar5.f16679a[i29] == 0) {
                                throw o0.a("No valid varint length mask found", null);
                            }
                            int i32 = i19;
                            int i33 = i18;
                            while (true) {
                                if (i33 >= 8) {
                                    i13 = i18;
                                    j8 = 0;
                                    i14 = i31;
                                    break;
                                }
                                int i34 = i32 << (7 - i33);
                                i13 = i18;
                                if ((bVar5.f16679a[i29] & i34) != 0) {
                                    i14 = i31 + i33;
                                    cVar.j(hVar, i14);
                                    j8 = bVar5.f16679a[i29] & i23 & (~i34);
                                    while (i31 < i14) {
                                        j8 = (j8 << 8) | (bVar5.f16679a[i31] & i23);
                                        i31++;
                                        i23 = 255;
                                    }
                                    if (i27 > 0) {
                                        j8 -= (1 << ((i33 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i33++;
                                    i18 = i13;
                                    i23 = 255;
                                }
                            }
                            if (j8 < -2147483648L || j8 > 2147483647L) {
                                break;
                            }
                            int i35 = (int) j8;
                            int[] iArr3 = cVar.L;
                            if (i27 != 0) {
                                i35 += iArr3[i27 - 1];
                            }
                            iArr3[i27] = i35;
                            i28 += i35;
                            i27++;
                            i29 = i14;
                            i19 = i32;
                            i18 = i13;
                            i23 = 255;
                        }
                        throw o0.a("EBML lacing sample size out of range.", null);
                    }
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 4;
                    while (true) {
                        i15 = cVar.f9212K - 1;
                        if (i36 >= i15) {
                            break;
                        }
                        cVar.L[i36] = 0;
                        while (true) {
                            i16 = i38 + 1;
                            cVar.j(hVar, i16);
                            int i39 = bVar5.f16679a[i38] & 255;
                            int[] iArr4 = cVar.L;
                            i17 = iArr4[i36] + i39;
                            iArr4[i36] = i17;
                            if (i39 != 255) {
                                break;
                            } else {
                                i38 = i16;
                            }
                        }
                        i37 += i17;
                        i36++;
                        i38 = i16;
                    }
                    cVar.L[i15] = ((i10 - cVar.f9214N) - i38) - i37;
                }
            }
            i12 = 0;
            i11 = 1;
            byte[] bArr6 = bVar5.f16679a;
            cVar.f9209H = cVar.l((bArr6[i11] & ForkServer.ERROR) | (bArr6[i12] << 8)) + cVar.f9203B;
            cVar.f9215O = (bVar6.f9174d == 2 || (i5 == 163 && (bVar5.f16679a[2] & 128) == 128)) ? i11 : i12;
            cVar.f9208G = 2;
            cVar.f9211J = i12;
        } else {
            i11 = 1;
        }
        if (i5 == 163) {
            while (true) {
                int i40 = cVar.f9211J;
                if (i40 >= cVar.f9212K) {
                    cVar.f9208G = 0;
                    return;
                } else {
                    cVar.d(bVar6, cVar.f9209H + ((cVar.f9211J * bVar6.f9175e) / 1000), cVar.f9215O, cVar.m(hVar, bVar6, cVar.L[i40], false), 0);
                    cVar.f9211J++;
                }
            }
        } else {
            while (true) {
                int i41 = cVar.f9211J;
                if (i41 >= cVar.f9212K) {
                    return;
                }
                int[] iArr5 = cVar.L;
                boolean z2 = i11;
                iArr5[i41] = cVar.m(hVar, bVar6, iArr5[i41], z2);
                cVar.f9211J += z2 ? 1 : 0;
            }
        }
    }

    @Override // A.c0
    public AbstractC0221n n(AbstractC0221n initialValue, AbstractC0221n targetValue, AbstractC0221n initialVelocity) {
        AbstractC3340k.e(initialValue, "initialValue");
        AbstractC3340k.e(targetValue, "targetValue");
        AbstractC3340k.e(initialVelocity, "initialVelocity");
        return ((S3.n) this.f47873b).n(initialValue, targetValue, initialVelocity);
    }

    @Override // A.c0
    public boolean p() {
        ((S3.n) this.f47873b).getClass();
        return false;
    }

    @Override // X1.g
    public long q(long j8, long j10) {
        return 0L;
    }

    @Override // X1.g
    public long r(long j8, long j10) {
        return -9223372036854775807L;
    }

    @Override // A7.T
    public void t(String str, int i5, IOException iOException, byte[] bArr, Map map) {
        ((L1) this.f47873b).J(str, i5, iOException, bArr, map);
    }

    public String toString() {
        switch (this.f47872a) {
            case 22:
                return super.toString() + "{fragment=" + ((R4.g) this.f47873b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // X1.g
    public Y1.j u(long j8) {
        return (Y1.j) this.f47873b;
    }

    @Override // X1.g
    public long v(long j8, long j10) {
        return 0L;
    }

    @Override // X1.g
    public long w(long j8) {
        return 1L;
    }

    public void x(int i5, long j8) throws o0 {
        P5.c cVar = (P5.c) this.f47873b;
        cVar.getClass();
        if (i5 == 20529) {
            if (j8 == 0) {
                return;
            }
            throw o0.a("ContentEncodingOrder " + j8 + " not supported", null);
        }
        if (i5 == 20530) {
            if (j8 == 1) {
                return;
            }
            throw o0.a("ContentEncodingScope " + j8 + " not supported", null);
        }
        int i10 = 3;
        switch (i5) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                cVar.c(i5);
                cVar.f9248u.f9174d = (int) j8;
                return;
            case PRIVACY_URL_ERROR_VALUE:
                cVar.c(i5);
                cVar.f9248u.f9167V = j8 == 1;
                return;
            case 155:
                cVar.f9210I = cVar.l(j8);
                return;
            case 159:
                cVar.c(i5);
                cVar.f9248u.f9160O = (int) j8;
                return;
            case 176:
                cVar.c(i5);
                cVar.f9248u.f9182m = (int) j8;
                return;
            case 179:
                cVar.b(i5);
                cVar.f9204C.a(cVar.l(j8));
                return;
            case 186:
                cVar.c(i5);
                cVar.f9248u.f9183n = (int) j8;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                cVar.c(i5);
                cVar.f9248u.f9173c = (int) j8;
                return;
            case 231:
                cVar.f9203B = cVar.l(j8);
                return;
            case 238:
                cVar.f9216P = (int) j8;
                return;
            case 241:
                if (cVar.f9206E) {
                    return;
                }
                cVar.b(i5);
                cVar.f9205D.a(j8);
                cVar.f9206E = true;
                return;
            case 251:
                cVar.f9217Q = true;
                return;
            case 16871:
                cVar.c(i5);
                cVar.f9248u.f9177g = (int) j8;
                return;
            case 16980:
                if (j8 == 3) {
                    return;
                }
                throw o0.a("ContentCompAlgo " + j8 + " not supported", null);
            case 17029:
                if (j8 < 1 || j8 > 2) {
                    throw o0.a("DocTypeReadVersion " + j8 + " not supported", null);
                }
                return;
            case 17143:
                if (j8 == 1) {
                    return;
                }
                throw o0.a("EBMLReadVersion " + j8 + " not supported", null);
            case 18401:
                if (j8 == 5) {
                    return;
                }
                throw o0.a("ContentEncAlgo " + j8 + " not supported", null);
            case 18408:
                if (j8 == 1) {
                    return;
                }
                throw o0.a("AESSettingsCipherMode " + j8 + " not supported", null);
            case 21420:
                cVar.f9251x = j8 + cVar.f9244q;
                return;
            case 21432:
                int i11 = (int) j8;
                cVar.c(i5);
                if (i11 == 0) {
                    cVar.f9248u.f9192w = 0;
                    return;
                }
                if (i11 == 1) {
                    cVar.f9248u.f9192w = 2;
                    return;
                } else if (i11 == 3) {
                    cVar.f9248u.f9192w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    cVar.f9248u.f9192w = 3;
                    return;
                }
            case 21680:
                cVar.c(i5);
                cVar.f9248u.f9184o = (int) j8;
                return;
            case 21682:
                cVar.c(i5);
                cVar.f9248u.f9186q = (int) j8;
                return;
            case 21690:
                cVar.c(i5);
                cVar.f9248u.f9185p = (int) j8;
                return;
            case 21930:
                cVar.c(i5);
                cVar.f9248u.f9166U = j8 == 1;
                return;
            case 21998:
                cVar.c(i5);
                cVar.f9248u.f9176f = (int) j8;
                return;
            case 22186:
                cVar.c(i5);
                cVar.f9248u.f9163R = j8;
                return;
            case 22203:
                cVar.c(i5);
                cVar.f9248u.f9164S = j8;
                return;
            case 25188:
                cVar.c(i5);
                cVar.f9248u.f9161P = (int) j8;
                return;
            case 30114:
                cVar.f9218R = j8;
                return;
            case 30321:
                cVar.c(i5);
                int i12 = (int) j8;
                if (i12 == 0) {
                    cVar.f9248u.f9187r = 0;
                    return;
                }
                if (i12 == 1) {
                    cVar.f9248u.f9187r = 1;
                    return;
                } else if (i12 == 2) {
                    cVar.f9248u.f9187r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    cVar.f9248u.f9187r = 3;
                    return;
                }
            case 2352003:
                cVar.c(i5);
                cVar.f9248u.f9175e = (int) j8;
                return;
            case 2807729:
                cVar.f9245r = j8;
                return;
            default:
                switch (i5) {
                    case 21945:
                        cVar.c(i5);
                        int i13 = (int) j8;
                        if (i13 == 1) {
                            cVar.f9248u.f9147A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            cVar.f9248u.f9147A = 1;
                            return;
                        }
                    case 21946:
                        cVar.c(i5);
                        int i14 = (int) j8;
                        if (i14 != 1) {
                            if (i14 == 16) {
                                i10 = 6;
                            } else if (i14 == 18) {
                                i10 = 7;
                            } else if (i14 != 6 && i14 != 7) {
                                i10 = -1;
                            }
                        }
                        if (i10 != -1) {
                            cVar.f9248u.f9195z = i10;
                            return;
                        }
                        return;
                    case 21947:
                        cVar.c(i5);
                        cVar.f9248u.f9193x = true;
                        int iA = C4303b.a((int) j8);
                        if (iA != -1) {
                            cVar.f9248u.f9194y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        cVar.c(i5);
                        cVar.f9248u.f9148B = (int) j8;
                        return;
                    case 21949:
                        cVar.c(i5);
                        cVar.f9248u.f9149C = (int) j8;
                        return;
                    default:
                        return;
                }
        }
    }

    public G4.b y() {
        G4.b bVar;
        synchronized (((ArrayDeque) this.f47873b)) {
            bVar = (G4.b) ((ArrayDeque) this.f47873b).poll();
        }
        return bVar == null ? new G4.b() : bVar;
    }

    public void z(G4.b bVar) {
        synchronized (((ArrayDeque) this.f47873b)) {
            if (((ArrayDeque) this.f47873b).size() < 10) {
                ((ArrayDeque) this.f47873b).offer(bVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public void zza(Throwable th) {
        ((zzdlv) this.f47873b).zzb(th.getMessage());
    }

    @Override // com.google.android.gms.internal.ads.zzhcc
    public /* synthetic */ void zzb(Object obj) {
        ((zzdlv) this.f47873b).zza((N6.s) obj);
    }

    public /* synthetic */ d(Object obj, int i5) {
        this.f47872a = i5;
        this.f47873b = obj;
    }

    public d(Set set) {
        this.f47872a = 0;
        this.f47873b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            HashMap map = (HashMap) this.f47873b;
            cVar.getClass();
            map.put(AbstractC4506a.class, cVar.f47871a);
        }
    }

    public d(int i5) {
        Object c1581e;
        this.f47872a = i5;
        switch (i5) {
            case 8:
                this.f47873b = new ArrayDeque();
                break;
            case 14:
                this.f47873b = xg.g.v(Looper.getMainLooper());
                break;
            case 15:
                this.f47873b = ByteBuffer.allocate(4);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                    c1581e = new Xd.c(16);
                } else {
                    c1581e = new C1581e(16);
                }
                this.f47873b = c1581e;
                break;
        }
    }

    public d(Context context) {
        this.f47872a = 7;
        this.f47873b = Fe.c.y(EnumC2526j.f34669c, new A0.p(context, 4));
    }

    public d(InputStream inputStream) {
        this.f47872a = 28;
        this.f47873b = new j(inputStream, Bf.a.f1670a);
    }

    public d(float f10, AbstractC0221n abstractC0221n) {
        Object cVar;
        this.f47872a = 1;
        if (abstractC0221n != null) {
            cVar = new d0(f10, abstractC0221n);
        } else {
            cVar = new Y9.c(f10);
        }
        S3.n nVar = new S3.n();
        nVar.f10970a = cVar;
        this.f47873b = nVar;
    }

    @Override // X1.g
    public long o(long j8, long j10) {
        return j10;
    }
}
