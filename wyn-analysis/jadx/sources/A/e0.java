package A;

import A7.AbstractC0279p0;
import A7.E0;
import A7.EnumC0254h;
import A7.L1;
import D6.V0;
import D6.Z0;
import E5.AbstractC0455i;
import G5.AbstractC0524e;
import G5.AbstractC0526g;
import G5.C0527h;
import I4.C0617b;
import I4.InterfaceC0616a;
import N1.C0757f;
import N1.C0762k;
import T5.C0828a;
import T5.C0830c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.ads.zzhbm;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.p002firebaseauthapi.zzahh;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.unity3d.services.UnityAdsConstants;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k2.C3168z;
import k2.n0;
import k8.AbstractC3198g;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l8.AbstractC3409K;
import l8.C3407I;
import org.apache.tika.fork.ForkServer;
import org.json.JSONObject;
import y3.C4552j;

/* loaded from: classes.dex */
public final class e0 implements InterfaceC0222o, A7.T, InitializationStatus, I4.q, InterfaceC0616a, B4.b, Continuation, zzhbm, O7.a, SuccessContinuation, o2.h, k2.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151a;

    /* renamed from: b, reason: collision with root package name */
    public Object f152b;

    public /* synthetic */ e0(int i5, boolean z2) {
        this.f151a = i5;
    }

    public static String j(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    @Override // o2.h
    public void A(o2.j jVar, long j8, long j10) {
        int i5;
        long j11;
        o2.p pVar = (o2.p) jVar;
        X1.f fVar = (X1.f) this.f152b;
        fVar.getClass();
        long j12 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        fVar.f15973m.getClass();
        fVar.f15977q.d(c3168z, pVar.f41325c);
        Y1.c cVar = (Y1.c) pVar.f41328f;
        Y1.c cVar2 = fVar.f15961H;
        int size = cVar2 == null ? 0 : cVar2.f16321m.size();
        long j13 = cVar.b(0).f16343b;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i5 = 1;
                break;
            }
            i5 = 1;
            if (fVar.f15961H.b(i10).f16343b >= j13) {
                break;
            } else {
                i10++;
            }
        }
        if (cVar.f16313d) {
            if (size - i10 > cVar.f16321m.size()) {
                Q1.k.w("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = fVar.f15966N;
                j11 = -9223372036854775807L;
                if (j14 == -9223372036854775807L || cVar.f16317h * 1000 > j14) {
                    fVar.f15965M = 0;
                } else {
                    Q1.k.w("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.f16317h + ", " + fVar.f15966N);
                }
            }
            int i11 = fVar.f15965M;
            fVar.f15965M = i11 + 1;
            if (i11 < fVar.f15973m.g(pVar.f41325c)) {
                fVar.f15957D.postDelayed(fVar.f15982v, Math.min((fVar.f15965M - 1) * 1000, 5000));
                return;
            } else {
                fVar.f15956C = new io.ktor.utils.io.T();
                return;
            }
        }
        j11 = -9223372036854775807L;
        fVar.f15961H = cVar;
        fVar.f15962I &= cVar.f16313d;
        fVar.f15963J = j8 - j10;
        fVar.f15964K = j8;
        fVar.f15967O += i10;
        synchronized (fVar.f15980t) {
            try {
                if (pVar.f41324b.f10870a == fVar.f15959F) {
                    Uri uri2 = fVar.f15961H.k;
                    if (uri2 == null) {
                        uri2 = pVar.f41326d.f10922c;
                    }
                    fVar.f15959F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Y1.c cVar3 = fVar.f15961H;
        if (!cVar3.f16313d || fVar.L != j11) {
            fVar.y(true);
            return;
        }
        Y1.t tVar = cVar3.f16318i;
        if (tVar == null) {
            fVar.u();
            return;
        }
        String str = tVar.f16380b;
        int i12 = Q1.x.f9724a;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                fVar.L = Q1.x.N(tVar.f16381c) - fVar.f15964K;
                fVar.y(true);
                return;
            } catch (N1.D e7) {
                fVar.x(e7);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            o2.p pVar2 = new o2.p(fVar.f15986z, Uri.parse(tVar.f16381c), 5, new X1.e());
            fVar.f15954A.f(pVar2, new C4552j(fVar, 26), 1);
            fVar.f15977q.h(new C3168z(pVar2.f41324b), pVar2.f41325c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            o2.p pVar3 = new o2.p(fVar.f15986z, Uri.parse(tVar.f16381c), 5, new ya.b(28));
            fVar.f15954A.f(pVar3, new C4552j(fVar, 26), i5);
            fVar.f15977q.h(new C3168z(pVar3.f41324b), pVar3.f41325c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            fVar.u();
        } else {
            fVar.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void B(A7.E0 r3, int r4) {
        /*
            r2 = this;
            A7.h r0 = A7.EnumC0254h.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            A7.h r0 = A7.EnumC0254h.INITIALIZATION
            goto L20
        L18:
            A7.h r0 = A7.EnumC0254h.MANIFEST
            goto L20
        L1b:
            A7.h r0 = A7.EnumC0254h.API
            goto L20
        L1e:
            A7.h r0 = A7.EnumC0254h.TCF
        L20:
            java.lang.Object r4 = r2.f152b
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A.e0.B(A7.E0, int):void");
    }

    public void C(E0 e02, EnumC0254h enumC0254h) {
        ((EnumMap) this.f152b).put((EnumMap) e02, (E0) enumC0254h);
    }

    @Override // o2.h
    public U5.f E(o2.j jVar, long j8, long j10, IOException iOException, int i5) {
        long jMin;
        o2.p pVar = (o2.p) jVar;
        X1.f fVar = (X1.f) this.f152b;
        fVar.getClass();
        long j11 = pVar.f41323a;
        Uri uri = pVar.f41326d.f10922c;
        C3168z c3168z = new C3168z(j10);
        fVar.f15973m.getClass();
        if ((iOException instanceof N1.D) || (iOException instanceof FileNotFoundException) || (iOException instanceof S1.r) || (iOException instanceof o2.l)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i10 = S1.i.f10862b;
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof S1.i) && ((S1.i) cause).f10863a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
        }
        jMin = Math.min((i5 - 1) * 1000, 5000);
        U5.f fVar2 = jMin == -9223372036854775807L ? o2.m.f41319f : new U5.f(jMin, 0, false);
        fVar.f15977q.g(c3168z, pVar.f41325c, iOException, !fVar2.a());
        return fVar2;
    }

    @Override // k2.e0
    public void a(k2.f0 f0Var) {
        a2.m mVar = (a2.m) this.f152b;
        mVar.f17231q.a(mVar);
    }

    public JSONObject b(View view) {
        if (view == null) {
            return Ra.b.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = (int[]) this.f152b;
        view.getLocationOnScreen(iArr);
        return Ra.b.a(iArr[0], iArr[1], width, height);
    }

    @Override // I4.q
    public I4.p d(I4.v vVar) {
        return new C0617b(0, (AssetManager) this.f152b, this);
    }

    public void f(int i5, boolean z2) {
        C0762k c0762k = (C0762k) this.f152b;
        if (z2) {
            c0762k.a(i5);
        } else {
            c0762k.getClass();
        }
    }

    @Override // B4.b
    public boolean g(Object obj, File file, B4.g gVar) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        F4.f fVar = (F4.f) this.f152b;
        byte[] bArr = (byte[]) fVar.e(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i5 = inputStream.read(bArr);
                        if (i5 == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i5);
                    } catch (IOException e7) {
                        e = e7;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        fVar.i(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        fVar.i(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                fVar.i(bArr);
                return true;
            } catch (IOException e10) {
                e = e10;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // A.InterfaceC0222o
    public InterfaceC0228v get(int i5) {
        return (InterfaceC0228v) this.f152b;
    }

    @Override // com.google.android.gms.ads.initialization.InitializationStatus
    public Map getAdapterStatusMap() {
        HashMap map = new HashMap();
        Objects.requireNonNull((Z0) this.f152b);
        map.put("com.google.android.gms.ads.MobileAds", new V0());
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(int i5, int i10, s2.j jVar) throws EOFException, InterruptedIOException, N1.D {
        int i11;
        int i12;
        int i13;
        long j8;
        int i14;
        int i15;
        int i16;
        int i17;
        K2.d dVar = (K2.d) this.f152b;
        SparseArray sparseArray = dVar.f6426c;
        int i18 = 0;
        int i19 = 1;
        if (i5 != 161 && i5 != 163) {
            if (i5 == 165) {
                if (dVar.f6405I != 2) {
                    return;
                }
                K2.c cVar = (K2.c) sparseArray.get(dVar.f6410O);
                if (dVar.f6413R != 4 || !"V_VP9".equals(cVar.f6367b)) {
                    jVar.j(i10);
                    return;
                }
                Q1.o oVar = dVar.f6440p;
                oVar.D(i10);
                jVar.f(oVar.f9702a, 0, i10, false);
                return;
            }
            if (i5 == 16877) {
                dVar.c(i5);
                K2.c cVar2 = dVar.f6447w;
                int i20 = cVar2.f6372g;
                if (i20 != 1685485123 && i20 != 1685480259) {
                    jVar.j(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                cVar2.f6354O = bArr;
                jVar.f(bArr, 0, i10, false);
                return;
            }
            if (i5 == 16981) {
                dVar.c(i5);
                byte[] bArr2 = new byte[i10];
                dVar.f6447w.f6374i = bArr2;
                jVar.f(bArr2, 0, i10, false);
                return;
            }
            if (i5 == 18402) {
                byte[] bArr3 = new byte[i10];
                jVar.f(bArr3, 0, i10, false);
                dVar.c(i5);
                dVar.f6447w.f6375j = new s2.B(1, bArr3, 0, 0);
                return;
            }
            if (i5 == 21419) {
                Q1.o oVar2 = dVar.k;
                Arrays.fill(oVar2.f9702a, (byte) 0);
                jVar.f(oVar2.f9702a, 4 - i10, i10, false);
                oVar2.G(0);
                dVar.f6449y = (int) oVar2.w();
                return;
            }
            if (i5 == 25506) {
                dVar.c(i5);
                byte[] bArr4 = new byte[i10];
                dVar.f6447w.k = bArr4;
                jVar.f(bArr4, 0, i10, false);
                return;
            }
            if (i5 != 30322) {
                throw N1.D.a(null, "Unexpected id: " + i5);
            }
            dVar.c(i5);
            byte[] bArr5 = new byte[i10];
            dVar.f6447w.f6387w = bArr5;
            jVar.f(bArr5, 0, i10, false);
            return;
        }
        int i21 = dVar.f6405I;
        Q1.o oVar3 = dVar.f6434i;
        if (i21 == 0) {
            K2.e eVar = dVar.f6424b;
            dVar.f6410O = (int) eVar.c(jVar, false, true, 8);
            dVar.f6411P = eVar.f6454c;
            dVar.f6407K = -9223372036854775807L;
            dVar.f6405I = 1;
            oVar3.D(0);
        }
        K2.c cVar3 = (K2.c) sparseArray.get(dVar.f6410O);
        if (cVar3 == null) {
            jVar.j(i10 - dVar.f6411P);
            dVar.f6405I = 0;
            return;
        }
        cVar3.f6364Y.getClass();
        if (dVar.f6405I == 1) {
            dVar.f(jVar, 3);
            int i22 = (oVar3.f9702a[2] & 6) >> 1;
            int i23 = 255;
            if (i22 == 0) {
                dVar.f6408M = 1;
                int[] iArr = dVar.f6409N;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                dVar.f6409N = iArr;
                iArr[0] = (i10 - dVar.f6411P) - 3;
            } else {
                dVar.f(jVar, 4);
                int i24 = (oVar3.f9702a[3] & 255) + 1;
                dVar.f6408M = i24;
                int[] iArr2 = dVar.f6409N;
                if (iArr2 == null) {
                    iArr2 = new int[i24];
                } else if (iArr2.length < i24) {
                    iArr2 = new int[Math.max(iArr2.length * 2, i24)];
                }
                dVar.f6409N = iArr2;
                if (i22 == 2) {
                    int i25 = (i10 - dVar.f6411P) - 4;
                    int i26 = dVar.f6408M;
                    Arrays.fill(iArr2, 0, i26, i25 / i26);
                } else {
                    if (i22 != 1) {
                        if (i22 != 3) {
                            throw N1.D.a(null, "Unexpected lacing value: " + i22);
                        }
                        int i27 = 0;
                        int i28 = 0;
                        int i29 = 4;
                        while (true) {
                            int i30 = dVar.f6408M - i19;
                            if (i27 >= i30) {
                                i12 = i18;
                                i11 = i19;
                                dVar.f6409N[i30] = ((i10 - dVar.f6411P) - i29) - i28;
                                break;
                            }
                            dVar.f6409N[i27] = i18;
                            int i31 = i29 + 1;
                            dVar.f(jVar, i31);
                            if (oVar3.f9702a[i29] == 0) {
                                throw N1.D.a(null, "No valid varint length mask found");
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
                                if ((oVar3.f9702a[i29] & i34) != 0) {
                                    i14 = i31 + i33;
                                    dVar.f(jVar, i14);
                                    j8 = oVar3.f9702a[i29] & i23 & (~i34);
                                    while (i31 < i14) {
                                        j8 = (j8 << 8) | (oVar3.f9702a[i31] & i23);
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
                            int[] iArr3 = dVar.f6409N;
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
                        throw N1.D.a(null, "EBML lacing sample size out of range.");
                    }
                    int i36 = 0;
                    int i37 = 0;
                    int i38 = 4;
                    while (true) {
                        i15 = dVar.f6408M - 1;
                        if (i36 >= i15) {
                            break;
                        }
                        dVar.f6409N[i36] = 0;
                        while (true) {
                            i16 = i38 + 1;
                            dVar.f(jVar, i16);
                            int i39 = oVar3.f9702a[i38] & 255;
                            int[] iArr4 = dVar.f6409N;
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
                    dVar.f6409N[i15] = ((i10 - dVar.f6411P) - i38) - i37;
                }
            }
            i12 = 0;
            i11 = 1;
            byte[] bArr6 = oVar3.f9702a;
            dVar.f6406J = dVar.m((bArr6[i11] & ForkServer.ERROR) | (bArr6[i12] << 8)) + dVar.f6400D;
            dVar.f6412Q = (cVar3.f6369d == 2 || (i5 == 163 && (oVar3.f9702a[2] & 128) == 128)) ? i11 : i12;
            dVar.f6405I = 2;
            dVar.L = i12;
        } else {
            i11 = 1;
        }
        if (i5 == 163) {
            while (true) {
                int i40 = dVar.L;
                if (i40 >= dVar.f6408M) {
                    dVar.f6405I = 0;
                    return;
                } else {
                    dVar.d(cVar3, dVar.f6406J + ((dVar.L * cVar3.f6370e) / 1000), dVar.f6412Q, dVar.n(jVar, cVar3, dVar.f6409N[i40], false), 0);
                    dVar.L++;
                }
            }
        } else {
            while (true) {
                int i41 = dVar.L;
                if (i41 >= dVar.f6408M) {
                    return;
                }
                int[] iArr5 = dVar.f6409N;
                boolean z2 = i11;
                iArr5[i41] = dVar.n(jVar, cVar3, iArr5[i41], z2);
                dVar.L += z2 ? 1 : 0;
            }
        }
    }

    public T5.C i(int i5, Dd.c cVar) {
        if (i5 != 2) {
            String str = (String) cVar.f2642b;
            if (i5 == 3 || i5 == 4) {
                return new T5.t(new T5.r(str));
            }
            if (i5 == 21) {
                return new T5.t(new T5.e(1));
            }
            if (i5 == 27) {
                return new T5.t(new T5.n(new S3.s(o(cVar)), false, false));
            }
            if (i5 == 36) {
                return new T5.t(new T5.p(new S3.s(o(cVar))));
            }
            if (i5 == 89) {
                return new T5.t(new T5.e(0, (List) cVar.f2643c));
            }
            if (i5 == 138) {
                return new T5.t(new T5.d(str));
            }
            if (i5 == 172) {
                return new T5.t(new C0828a(str, 1));
            }
            if (i5 == 257) {
                return new T5.y(new b7.k("application/vnd.dvb.ait"));
            }
            if (i5 == 134) {
                return new T5.y(new b7.k("application/x-scte35"));
            }
            if (i5 != 135) {
                switch (i5) {
                    case 15:
                        return new T5.t(new C0830c(false, str));
                    case 16:
                        return new T5.t(new T5.k(new S3.e(o(cVar))));
                    case 17:
                        return new T5.t(new T5.q(str));
                    default:
                        switch (i5) {
                            case 128:
                                break;
                            case EMPTY_TPAT_ERROR_VALUE:
                                break;
                            case MRAID_DOWNLOAD_JS_ERROR_VALUE:
                            default:
                                return null;
                        }
                }
            }
            return new T5.t(new C0828a(str, 0));
        }
        return new T5.t(new T5.h(new S3.e(o(cVar))));
    }

    @Override // I4.InterfaceC0616a
    public C4.e k(AssetManager assetManager, String str) {
        return new C4.k(assetManager, str, 0);
    }

    public synchronized void m() {
        ((SharedPreferences) this.f152b).edit().clear().commit();
    }

    public Object n(SerialDescriptor descriptor, Yf.s sVar) {
        AbstractC3340k.e(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f152b).get(descriptor);
        Object obj = map != null ? map.get(sVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6 */
    public List o(Dd.c cVar) {
        String str;
        int i5;
        Y4.b bVar = new Y4.b((byte[]) cVar.f2644d);
        ArrayList arrayList = (AbstractC3409K) this.f152b;
        while (bVar.a() > 0) {
            int iQ = bVar.q();
            int iQ2 = bVar.f16680b + bVar.q();
            if (iQ == 134) {
                arrayList = new ArrayList();
                int iQ3 = bVar.q() & 31;
                for (int i10 = 0; i10 < iQ3; i10++) {
                    String strO = bVar.o(3, AbstractC3198g.f39301c);
                    int iQ4 = bVar.q();
                    boolean z2 = (iQ4 & 128) != 0;
                    if (z2) {
                        i5 = iQ4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i5 = 1;
                    }
                    byte bQ = (byte) bVar.q();
                    bVar.B(1);
                    List listSingletonList = z2 ? Collections.singletonList((bQ & 64) != 0 ? new byte[]{1} : new byte[]{0}) : null;
                    E5.S s10 = new E5.S();
                    s10.k = str;
                    s10.f3197c = strO;
                    s10.f3193C = i5;
                    s10.f3206m = listSingletonList;
                    arrayList.add(new E5.T(s10));
                }
            }
            bVar.A(iQ2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public I5.d p() {
        return (I5.d) this.f152b;
    }

    public UUID q() {
        return AbstractC0455i.f3412a;
    }

    public int r() {
        return 1;
    }

    public void s(int i5, long j8) throws N1.D {
        K2.d dVar = (K2.d) this.f152b;
        dVar.getClass();
        if (i5 == 20529) {
            if (j8 == 0) {
                return;
            }
            throw N1.D.a(null, "ContentEncodingOrder " + j8 + " not supported");
        }
        if (i5 == 20530) {
            if (j8 == 1) {
                return;
            }
            throw N1.D.a(null, "ContentEncodingScope " + j8 + " not supported");
        }
        switch (i5) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                dVar.c(i5);
                dVar.f6447w.f6369d = (int) j8;
                return;
            case PRIVACY_URL_ERROR_VALUE:
                dVar.c(i5);
                dVar.f6447w.f6362W = j8 == 1;
                return;
            case 155:
                dVar.f6407K = dVar.m(j8);
                return;
            case 159:
                dVar.c(i5);
                dVar.f6447w.f6355P = (int) j8;
                return;
            case 176:
                dVar.c(i5);
                dVar.f6447w.f6377m = (int) j8;
                return;
            case 179:
                dVar.b(i5);
                dVar.f6401E.a(dVar.m(j8));
                return;
            case 186:
                dVar.c(i5);
                dVar.f6447w.f6378n = (int) j8;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                dVar.c(i5);
                dVar.f6447w.f6368c = (int) j8;
                return;
            case 231:
                dVar.f6400D = dVar.m(j8);
                return;
            case 238:
                dVar.f6413R = (int) j8;
                return;
            case 241:
                if (dVar.f6403G) {
                    return;
                }
                dVar.b(i5);
                dVar.f6402F.a(j8);
                dVar.f6403G = true;
                return;
            case 251:
                dVar.f6414S = true;
                return;
            case 16871:
                dVar.c(i5);
                dVar.f6447w.f6372g = (int) j8;
                return;
            case 16980:
                if (j8 == 3) {
                    return;
                }
                throw N1.D.a(null, "ContentCompAlgo " + j8 + " not supported");
            case 17029:
                if (j8 < 1 || j8 > 2) {
                    throw N1.D.a(null, "DocTypeReadVersion " + j8 + " not supported");
                }
                return;
            case 17143:
                if (j8 == 1) {
                    return;
                }
                throw N1.D.a(null, "EBMLReadVersion " + j8 + " not supported");
            case 18401:
                if (j8 == 5) {
                    return;
                }
                throw N1.D.a(null, "ContentEncAlgo " + j8 + " not supported");
            case 18408:
                if (j8 == 1) {
                    return;
                }
                throw N1.D.a(null, "AESSettingsCipherMode " + j8 + " not supported");
            case 21420:
                dVar.f6450z = j8 + dVar.f6443s;
                return;
            case 21432:
                int i10 = (int) j8;
                dVar.c(i5);
                if (i10 == 0) {
                    dVar.f6447w.f6388x = 0;
                    return;
                }
                if (i10 == 1) {
                    dVar.f6447w.f6388x = 2;
                    return;
                } else if (i10 == 3) {
                    dVar.f6447w.f6388x = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    dVar.f6447w.f6388x = 3;
                    return;
                }
            case 21680:
                dVar.c(i5);
                dVar.f6447w.f6380p = (int) j8;
                return;
            case 21682:
                dVar.c(i5);
                dVar.f6447w.f6382r = (int) j8;
                return;
            case 21690:
                dVar.c(i5);
                dVar.f6447w.f6381q = (int) j8;
                return;
            case 21930:
                dVar.c(i5);
                dVar.f6447w.f6361V = j8 == 1;
                return;
            case 21938:
                dVar.c(i5);
                K2.c cVar = dVar.f6447w;
                cVar.f6389y = true;
                cVar.f6379o = (int) j8;
                return;
            case 21998:
                dVar.c(i5);
                dVar.f6447w.f6371f = (int) j8;
                return;
            case 22186:
                dVar.c(i5);
                dVar.f6447w.f6358S = j8;
                return;
            case 22203:
                dVar.c(i5);
                dVar.f6447w.f6359T = j8;
                return;
            case 25188:
                dVar.c(i5);
                dVar.f6447w.f6356Q = (int) j8;
                return;
            case 30114:
                dVar.f6415T = j8;
                return;
            case 30321:
                dVar.c(i5);
                int i11 = (int) j8;
                if (i11 == 0) {
                    dVar.f6447w.f6383s = 0;
                    return;
                }
                if (i11 == 1) {
                    dVar.f6447w.f6383s = 1;
                    return;
                } else if (i11 == 2) {
                    dVar.f6447w.f6383s = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    dVar.f6447w.f6383s = 3;
                    return;
                }
            case 2352003:
                dVar.c(i5);
                dVar.f6447w.f6370e = (int) j8;
                return;
            case 2807729:
                dVar.f6444t = j8;
                return;
            default:
                switch (i5) {
                    case 21945:
                        dVar.c(i5);
                        int i12 = (int) j8;
                        if (i12 == 1) {
                            dVar.f6447w.f6342B = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            dVar.f6447w.f6342B = 1;
                            return;
                        }
                    case 21946:
                        dVar.c(i5);
                        int iG = C0757f.g((int) j8);
                        if (iG != -1) {
                            dVar.f6447w.f6341A = iG;
                            return;
                        }
                        return;
                    case 21947:
                        dVar.c(i5);
                        dVar.f6447w.f6389y = true;
                        int iF = C0757f.f((int) j8);
                        if (iF != -1) {
                            dVar.f6447w.f6390z = iF;
                            return;
                        }
                        return;
                    case 21948:
                        dVar.c(i5);
                        dVar.f6447w.f6343C = (int) j8;
                        return;
                    case 21949:
                        dVar.c(i5);
                        dVar.f6447w.f6344D = (int) j8;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // A7.T
    public void t(String str, int i5, IOException iOException, byte[] bArr, Map map) {
        ((L1) this.f152b).J(str, i5, iOException, bArr, map);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            AbstractC1732v.i(exception);
            return Tasks.forException(exception);
        }
        zzahh zzahhVar = (zzahh) task.getResult();
        if (!(zzahhVar instanceof zzahn)) {
            throw new IllegalArgumentException(AbstractC0279p0.l("Response should be an instance of StartTotpMfaEnrollmentResponse but was ", zzahhVar.getClass().getName(), "."));
        }
        zzahn zzahnVar = (zzahn) zzahhVar;
        String strZzf = zzahnVar.zzf();
        AbstractC1732v.f(strZzf);
        String strZze = zzahnVar.zze();
        AbstractC1732v.f(strZze);
        int iZzc = zzahnVar.zzc();
        int iZzb = zzahnVar.zzb();
        long jZzd = zzahnVar.zzd();
        String strZza = zzahnVar.zza();
        AbstractC1732v.f(strZza);
        return Tasks.forResult(new K8.B(strZzf, strZze, iZzc, iZzb, jZzd, strZza, (FirebaseAuth) this.f152b));
    }

    public String toString() {
        switch (this.f151a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
                for (E0 e02 : E0.values()) {
                    EnumC0254h enumC0254h = (EnumC0254h) ((EnumMap) this.f152b).get(e02);
                    if (enumC0254h == null) {
                        enumC0254h = EnumC0254h.UNSET;
                    }
                    sb2.append(enumC0254h.f885a);
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        a2.m mVar = (a2.m) this.f152b;
        int i5 = mVar.f17232r - 1;
        mVar.f17232r = i5;
        if (i5 > 0) {
            return;
        }
        int i10 = 0;
        for (a2.s sVar : mVar.f17234t) {
            sVar.a();
            i10 += sVar.f17272I.f39128a;
        }
        N1.O[] oArr = new N1.O[i10];
        int i11 = 0;
        for (a2.s sVar2 : mVar.f17234t) {
            sVar2.a();
            int i12 = sVar2.f17272I.f39128a;
            int i13 = 0;
            while (i13 < i12) {
                sVar2.a();
                oArr[i11] = sVar2.f17272I.a(i13);
                i13++;
                i11++;
            }
        }
        mVar.f17233s = new n0(oArr);
        mVar.f17231q.l(mVar);
    }

    public kotlinx.serialization.json.b v(String key, kotlinx.serialization.json.d element) {
        AbstractC3340k.e(key, "key");
        AbstractC3340k.e(element, "element");
        return (kotlinx.serialization.json.b) ((LinkedHashMap) this.f152b).put(key, element);
    }

    @Override // o2.h
    public void w(o2.j jVar, long j8, long j10, boolean z2) {
        ((X1.f) this.f152b).v((o2.p) jVar, j10);
    }

    public synchronized void x(A4.c cVar) {
        cVar.f322b = null;
        cVar.f323c = null;
        ((ArrayDeque) this.f152b).offer(cVar);
    }

    public void z(int i5, long j8, long j10) throws N1.D {
        K2.d dVar = (K2.d) this.f152b;
        Q1.k.h(dVar.f6429d0);
        if (i5 == 160) {
            dVar.f6414S = false;
            dVar.f6415T = 0L;
            return;
        }
        if (i5 != 174) {
            if (i5 == 187) {
                dVar.f6403G = false;
                return;
            }
            if (i5 == 19899) {
                dVar.f6449y = -1;
                dVar.f6450z = -1L;
                return;
            }
            if (i5 == 20533) {
                dVar.c(i5);
                dVar.f6447w.f6373h = true;
                return;
            }
            if (i5 == 21968) {
                dVar.c(i5);
                dVar.f6447w.f6389y = true;
                return;
            }
            if (i5 == 408125543) {
                long j11 = dVar.f6443s;
                if (j11 != -1 && j11 != j8) {
                    throw N1.D.a(null, "Multiple Segment elements not supported");
                }
                dVar.f6443s = j8;
                dVar.f6442r = j10;
                return;
            }
            if (i5 == 475249515) {
                dVar.f6401E = new Q1.l((byte) 0, 0);
                dVar.f6402F = new Q1.l((byte) 0, 0);
                return;
            } else {
                if (i5 == 524531317 && !dVar.f6448x) {
                    if (dVar.f6428d && dVar.f6398B != -1) {
                        dVar.f6397A = true;
                        return;
                    } else {
                        dVar.f6429d0.s(new s2.q(dVar.f6446v));
                        dVar.f6448x = true;
                        return;
                    }
                }
                return;
            }
        }
        K2.c cVar = new K2.c();
        cVar.f6377m = -1;
        cVar.f6378n = -1;
        cVar.f6379o = -1;
        cVar.f6380p = -1;
        cVar.f6381q = -1;
        cVar.f6382r = 0;
        cVar.f6383s = -1;
        cVar.f6384t = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        cVar.f6385u = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        cVar.f6386v = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        cVar.f6387w = null;
        cVar.f6388x = -1;
        cVar.f6389y = false;
        cVar.f6390z = -1;
        cVar.f6341A = -1;
        cVar.f6342B = -1;
        cVar.f6343C = 1000;
        cVar.f6344D = 200;
        cVar.f6345E = -1.0f;
        cVar.f6346F = -1.0f;
        cVar.f6347G = -1.0f;
        cVar.f6348H = -1.0f;
        cVar.f6349I = -1.0f;
        cVar.f6350J = -1.0f;
        cVar.f6351K = -1.0f;
        cVar.L = -1.0f;
        cVar.f6352M = -1.0f;
        cVar.f6353N = -1.0f;
        cVar.f6355P = 1;
        cVar.f6356Q = -1;
        cVar.f6357R = 8000;
        cVar.f6358S = 0L;
        cVar.f6359T = 0L;
        cVar.f6362W = true;
        cVar.f6363X = "eng";
        dVar.f6447w = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    public /* synthetic */ p8.p zza() {
        N6.j jVar = (N6.j) this.f152b;
        jVar.getClass();
        try {
            return jVar.W(jVar.f8490b, null, "BANNER", null, null, new Bundle()).zza();
        } catch (NullPointerException e7) {
            return zzhcf.zzc(e7);
        }
    }

    public /* synthetic */ e0(Object obj, int i5) {
        this.f151a = i5;
        this.f152b = obj;
    }

    public e0(int i5) {
        this.f151a = i5;
        switch (i5) {
            case 5:
                this.f152b = new C0762k(1);
                break;
            case 17:
                char[] cArr = Y4.m.f16700a;
                this.f152b = new ArrayDeque(0);
                break;
            case 18:
                this.f152b = new int[2];
                break;
            case 21:
                C3407I c3407i = AbstractC3409K.f40056b;
                this.f152b = l8.e0.f40101e;
                break;
            case 25:
                this.f152b = new LinkedHashMap();
                break;
            case 26:
                this.f152b = new ConcurrentHashMap(16);
                break;
            default:
                this.f152b = new EnumMap(E0.class);
                break;
        }
    }

    public e0(EnumMap enumMap) {
        this.f151a = 1;
        EnumMap enumMap2 = new EnumMap(E0.class);
        this.f152b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        if (((Z8.a) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        S3.c cVar = (S3.c) this.f152b;
        R8.m.a((R8.m) cVar.f10937c);
        R8.m mVar = (R8.m) cVar.f10937c;
        mVar.f10488m.j(null, mVar.f10481e.f11034a);
        mVar.f10493r.trySetResult(null);
        return Tasks.forResult(null);
    }

    public e0(WorkDatabase workDatabase) {
        this.f151a = 20;
        AbstractC3340k.e(workDatabase, "workDatabase");
        this.f152b = workDatabase;
    }

    public e0(Context context) {
        boolean zIsEmpty;
        this.f151a = 23;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f152b = sharedPreferences;
        File file = new File(Y0.e.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                m();
            }
        } catch (IOException e7) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
            }
        }
    }

    public void c(I5.f fVar) {
    }

    public void y(I5.f fVar) {
    }

    public e0(C0527h c0527h) {
        this.f151a = 7;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c0527h.f4409a).setFlags(c0527h.f4410b).setUsage(c0527h.f4411c);
        int i5 = u6.v.f46721a;
        if (i5 >= 29) {
            AbstractC0524e.a(usage, c0527h.f4412d);
        }
        if (i5 >= 32) {
            AbstractC0526g.a(usage, c0527h.f4413e);
        }
        this.f152b = usage.build();
    }
}
