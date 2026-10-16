package Fe;

import A.AbstractC0226t;
import A.f0;
import C6.n;
import Cd.U;
import D6.C0395s;
import E5.Q;
import Ef.C0487f0;
import Ef.D;
import Ef.H;
import Ef.H0;
import Ef.S;
import G6.L;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzgcv;
import com.google.android.gms.internal.ads.zzgcw;
import com.google.android.gms.internal.ads.zzgcx;
import com.google.android.gms.internal.ads.zzgtf;
import com.google.android.gms.internal.ads.zzgug;
import com.moloco.sdk.internal.MolocoLogger;
import ef.C2515C;
import ef.C2516D;
import ef.C2531o;
import ef.C2532p;
import ef.C2541y;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import ff.AbstractC2651f;
import ff.C2648c;
import gd.C2747b;
import io.ktor.utils.io.C2880m;
import io.ktor.utils.io.E;
import io.ktor.utils.io.K;
import io.ktor.utils.io.P;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.C3109i;
import jf.InterfaceC3108h;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p7.AbstractC3772b;
import tf.p;
import u0.M;
import u0.x0;
import u0.y0;
import z.AbstractC4604i;
import z.C4597b;
import z.C4598c;
import z.C4600e;
import z.C4605j;
import z.C4606k;
import z.o;
import z.w;

/* loaded from: classes5.dex */
public abstract class c {
    public static Typeface A(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, S3.f.m(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static InterfaceC3108h B(InterfaceC3108h interfaceC3108h, InterfaceC3108h context) {
        AbstractC3340k.e(context, "context");
        return context == C3109i.f38759a ? interfaceC3108h : (InterfaceC3108h) context.fold(interfaceC3108h, new U(19));
    }

    public static final String C(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[Segment.SIZE];
        int i5 = reader.read(cArr);
        while (i5 >= 0) {
            stringWriter.write(cArr, 0, i5);
            i5 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        AbstractC3340k.d(string, "toString(...)");
        return string;
    }

    public static boolean D(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final z.EnumC4601f E(A.U r6, java.lang.Object r7, N.C0740o r8) {
        /*
            r0 = 361571134(0x158d233e, float:5.700505E-26)
            r8.M(r0)
            r0 = 0
            r1 = -721837481(0xffffffffd4f9a257, float:-8.577364E12)
            r2 = 0
            r8.J(r1, r6, r2, r0)
            boolean r0 = r6.d()
            z.f r1 = z.EnumC4601f.f48218a
            z.f r3 = z.EnumC4601f.f48220c
            z.f r4 = z.EnumC4601f.f48219b
            if (r0 == 0) goto L38
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.booleanValue()
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L27
        L25:
            r1 = r4
            goto L83
        L27:
            java.lang.Object r6 = r6.b()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L83
        L36:
            r1 = r3
            goto L83
        L38:
            r0 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r8.M(r0)
            java.lang.Object r0 = r8.F()
            N.P r5 = N.C0732k.f7800a
            if (r0 != r5) goto L51
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            N.P r5 = N.P.f7730f
            N.Y r0 = N.C0718d.G(r0, r5)
            r8.U(r0)
        L51:
            r8.p(r2)
            N.V r0 = (N.V) r0
            java.lang.Object r6 = r6.b()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r6.booleanValue()
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6a
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.setValue(r6)
        L6a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r7.booleanValue()
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L76
            goto L25
        L76:
            java.lang.Object r6 = r0.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L83
            goto L36
        L83:
            r8.p(r2)
            r8.p(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.c.E(A.U, java.lang.Object, N.o):z.f");
    }

    public static final byte[] F(String str, Charset charset) throws CharacterCodingException {
        AbstractC3340k.e(str, "<this>");
        AbstractC3340k.e(charset, "charset");
        Charset charset2 = Bf.a.f1670a;
        if (!charset.equals(charset2)) {
            return AbstractC3772b.r(charset.newEncoder(), str, 0, str.length());
        }
        int length = str.length();
        C2648c c2648c = AbstractC2651f.Companion;
        int length2 = str.length();
        c2648c.getClass();
        C2648c.a(0, length, length2);
        CharsetEncoder charsetEncoderNewEncoder = charset2.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
        ByteBuffer byteBufferEncode = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).encode(CharBuffer.wrap(str, 0, length));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            AbstractC3340k.b(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                AbstractC3340k.b(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    public static ArrayList G(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C2747b) {
            C2747b c2747b = (C2747b) th;
            arrayList.add(c2747b.f35868a);
            arrayList.add(c2747b.getMessage());
            arrayList.add(null);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static P H(File file) {
        Lf.e eVar = S.f3698a;
        Lf.d coroutineContext = Lf.d.f7120b;
        AbstractC3340k.e(file, "<this>");
        AbstractC3340k.e(coroutineContext, "coroutineContext");
        C0487f0 c0487f0 = C0487f0.f3733a;
        InterfaceC3108h coroutineContext2 = new D("file-writer").plus(coroutineContext);
        Od.b bVar = new Od.b(file, null);
        AbstractC3340k.e(coroutineContext2, "coroutineContext");
        C2880m c2880m = new C2880m();
        H0 h0D = H.D(c0487f0, coroutineContext2, new E(bVar, c2880m, null), 2);
        h0D.invokeOnCompletion(new K(c2880m, 1));
        return new P(c2880m, new io.ktor.utils.io.D(h0D, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(Md.c r4, java.io.OutputStream r5, lf.AbstractC3464c r6) {
        /*
            boolean r0 = r6 instanceof Ad.f
            if (r0 == 0) goto L13
            r0 = r6
            Ad.f r0 = (Ad.f) r0
            int r1 = r0.f1279c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1279c = r1
            goto L18
        L13:
            Ad.f r0 = new Ad.f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1278b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f1279c
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 == r3) goto L3c
            r4 = 2
            if (r2 == r4) goto L39
            r4 = 3
            if (r2 != r4) goto L31
            java.io.OutputStream r5 = r0.f1277a
        L2b:
            Fe.e.U(r6)     // Catch: java.lang.Throwable -> L2f
            goto L6e
        L2f:
            r4 = move-exception
            goto L7e
        L31:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L39:
            java.io.OutputStream r5 = r0.f1277a
            goto L2b
        L3c:
            java.io.OutputStream r5 = r0.f1277a
            goto L2b
        L3f:
            Fe.e.U(r6)
            boolean r6 = r4 instanceof Md.b     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L50
            Md.b r4 = (Md.b) r4     // Catch: java.lang.Throwable -> L2f
            byte[] r4 = r4.d()     // Catch: java.lang.Throwable -> L2f
            r5.write(r4)     // Catch: java.lang.Throwable -> L2f
            goto L6e
        L50:
            boolean r6 = r4 instanceof Cd.C0347o     // Catch: java.lang.Throwable -> L2f
            if (r6 == 0) goto L6a
            Cd.o r4 = (Cd.C0347o) r4     // Catch: java.lang.Throwable -> L2f
            io.ktor.utils.io.t r4 = r4.d()     // Catch: java.lang.Throwable -> L2f
            r0.f1277a = r5     // Catch: java.lang.Throwable -> L2f
            r0.f1279c = r3     // Catch: java.lang.Throwable -> L2f
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r4 = a.AbstractC1304a.n(r4, r5, r2, r0)     // Catch: java.lang.Throwable -> L2f
            if (r4 != r1) goto L6e
            return r1
        L6a:
            boolean r4 = r4 instanceof Hd.b     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L75
        L6e:
            r4 = 0
            Ba.c.n(r5, r4)
            ef.C r4 = ef.C2515C.f34653a
            return r4
        L75:
            E5.Q r4 = new E5.Q     // Catch: java.lang.Throwable -> L2f
            r6 = 9
            r0 = 0
            r4.<init>(r0, r6)     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L7e:
            throw r4     // Catch: java.lang.Throwable -> L7f
        L7f:
            r6 = move-exception
            Ba.c.n(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.c.I(Md.c, java.io.OutputStream, lf.c):java.lang.Object");
    }

    public static void J(Context context) {
        if (((Boolean) C0395s.f2489e.f2492c.zzd(zzbix.zzhn)).booleanValue() && context != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
        try {
            zzgcv zzgcvVarZzh = zzgcv.zzh(context);
            zzgcw zzgcwVarZzh = zzgcw.zzh(context);
            zzgcx zzgcxVarZza = zzgcx.zza(context);
            zzgcvVarZzh.zzk();
            zzgcvVarZzh.zzl();
            zzgcwVarZzh.zzj();
            zzgcxVarZza.zzb(null);
        } catch (IOException e7) {
            n.f1857D.f1868h.zzh(e7, "clearStorageOnIdlessMode");
        }
    }

    public static Bundle K(Context context, String str) {
        JSONArray jSONArray;
        Object obj;
        SharedPreferences sharedPreferences;
        String str2;
        if (TextUtils.isEmpty(str)) {
            jSONArray = null;
        } else {
            try {
                jSONArray = new JSONArray(str);
            } catch (JSONException e7) {
                int i5 = L.f4523b;
                H6.l.b("JSON parsing error", e7);
            }
        }
        if (jSONArray == null) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            String strOptString = jSONObjectOptJSONObject.optString("bk");
            String strOptString2 = jSONObjectOptJSONObject.optString("sk");
            int iOptInt = jSONObjectOptJSONObject.optInt("type", -1);
            int i11 = iOptInt != 0 ? iOptInt != 1 ? iOptInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2) && i11 != 0) {
                List listZzg = zzgug.zza(zzgtf.zzd('/')).zzg(strOptString2);
                if (listZzg.size() > 2 || listZzg.isEmpty()) {
                    obj = null;
                } else {
                    if (listZzg.size() == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str2 = (String) listZzg.get(0);
                    } else {
                        sharedPreferences = context.getSharedPreferences((String) listZzg.get(0), 0);
                        str2 = (String) listZzg.get(1);
                    }
                    obj = sharedPreferences.getAll().get(str2);
                }
                if (obj != null) {
                    int i12 = i11 - 1;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(strOptString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(strOptString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(strOptString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(strOptString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(strOptString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035b  */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r14v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(A.U r30, Z.k r31, z.C4605j r32, z.C4606k r33, V.d r34, N.C0740o r35, int r36) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.c.a(A.U, Z.k, z.j, z.k, V.d, N.o, int):void");
    }

    public static final void b(boolean z2, Z.k kVar, C4605j c4605j, C4606k c4606k, String str, V.d dVar, C0740o c0740o, int i5) {
        int i10;
        C4605j c4605j2;
        String str2;
        C4606k c4606k2;
        c0740o.N(2088733774);
        if ((i5 & 14) == 0) {
            i10 = i5 | (c0740o.f(z2) ? 4 : 2);
        } else {
            i10 = i5;
        }
        if ((i5 & 112) == 0) {
            i10 |= c0740o.e(kVar) ? 32 : 16;
        }
        int i11 = i10 | 28032;
        if ((i5 & 458752) == 0) {
            i11 |= c0740o.e(dVar) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && c0740o.x()) {
            c0740o.I();
            c4605j2 = c4605j;
            c4606k2 = c4606k;
            str2 = str;
        } else {
            Z.d dVar2 = Z.a.f16908i;
            S3.e eVar = AbstractC4604i.f48227a;
            o oVar = new o(AbstractC0226t.i(5, null));
            if ((14 & 1) != 0) {
                oVar = null;
            }
            Object obj = f0.f154a;
            C4600e c4600e = new C4600e(dVar2, C4597b.f48204n, AbstractC0226t.i(1, new L0.h(Ba.c.a(1, 1))));
            if ((11 & 4) != 0) {
                c4600e = null;
            }
            int i12 = i11;
            if (oVar == null) {
                oVar = null;
            }
            c4605j2 = new C4605j(new w(oVar, c4600e));
            C4600e c4600e2 = new C4600e(dVar2, C4597b.f48205o, AbstractC0226t.i(1, new L0.h(Ba.c.a(1, 1))));
            if ((11 & 4) != 0) {
                c4600e2 = null;
            }
            o oVar2 = new o(AbstractC0226t.i(5, null));
            if ((14 & 1) != 0) {
                oVar2 = null;
            }
            C4606k c4606k3 = new C4606k(new w(oVar2, c4600e2 != null ? c4600e2 : null));
            int i13 = i12 << 3;
            a(AbstractC0226t.l(Boolean.valueOf(z2), c0740o, (14 & i12) | ((i12 >> 9) & 112), 0), kVar, c4605j2, c4606k3, dVar, c0740o, (i12 & 458752) | (i13 & 57344) | (i13 & 896) | 48 | (i13 & 7168));
            str2 = "AnimatedVisibility";
            c4606k2 = c4606k3;
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C4598c(z2, kVar, c4605j2, c4606k2, str2, dVar, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x034c A[PHI: r13
  0x034c: PHI (r13v9 float) = (r13v2 float), (r13v7 float) binds: [B:98:0x034a, B:102:0x0356] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(K.C0680e r43, K.L r44, K.z r45, V.d r46, N.C0740o r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 1103
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.c.c(K.e, K.L, K.z, V.d, N.o, int, int):void");
    }

    public static final long d(float f10, float f11) {
        long jFloatToIntBits = (Float.floatToIntBits(f11) & 4294967295L) | (Float.floatToIntBits(f10) << 32);
        int i5 = L0.l.f6814c;
        return jFloatToIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(wd.C4402c r5, java.lang.String r6, lf.AbstractC3464c r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f
            if (r0 == 0) goto L13
            r0 = r7
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f) r0
            int r1 = r0.f32439b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32439b = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f32438a
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f32439b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r7)     // Catch: java.lang.Exception -> L4c
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            Fe.e.U(r7)
            Lf.e r7 = Ef.S.f3698a     // Catch: java.lang.Exception -> L4c
            Lf.d r7 = Lf.d.f7120b     // Catch: java.lang.Exception -> L4c
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g r2 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.g     // Catch: java.lang.Exception -> L4c
            r4 = 0
            r2.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L4c
            r0.f32439b = r3     // Catch: java.lang.Exception -> L4c
            java.lang.Object r7 = Ef.H.P(r7, r2, r0)     // Catch: java.lang.Exception -> L4c
            if (r7 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Exception -> L4c
            boolean r5 = r7.booleanValue()     // Catch: java.lang.Exception -> L4c
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.c.e(wd.c, java.lang.String, lf.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(wd.C4402c r12, java.lang.String r13, byte[] r14, Jd.C0672f r15, java.lang.String r16, lf.AbstractC3464c r17) throws java.lang.Throwable {
        /*
            r0 = r17
            boolean r1 = r0 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h
            if (r1 == 0) goto L15
            r1 = r0
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h) r1
            int r2 = r1.f32444b
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f32444b = r2
            goto L1a
        L15:
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h r1 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f32443a
            kf.a r2 = kf.a.f39711a
            int r3 = r1.f32444b
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            Fe.e.U(r0)     // Catch: java.lang.Exception -> L54
            goto L4d
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            Fe.e.U(r0)
            Lf.e r0 = Ef.S.f3698a     // Catch: java.lang.Exception -> L54
            Lf.d r0 = Lf.d.f7120b     // Catch: java.lang.Exception -> L54
            com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i r5 = new com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i     // Catch: java.lang.Exception -> L54
            r11 = 0
            r6 = r12
            r7 = r13
            r9 = r14
            r10 = r15
            r8 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L54
            r1.f32444b = r4     // Catch: java.lang.Exception -> L54
            java.lang.Object r0 = Ef.H.P(r0, r5, r1)     // Catch: java.lang.Exception -> L54
            if (r0 != r2) goto L4d
            return r2
        L4d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L54
            boolean r12 = r0.booleanValue()     // Catch: java.lang.Exception -> L54
            goto L55
        L54:
            r12 = 0
        L55:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.c.f(wd.c, java.lang.String, byte[], Jd.f, java.lang.String, lf.c):java.lang.Object");
    }

    public static final void g(final Activity activity, C0740o c0740o, final int i5) {
        int i10;
        c0740o.N(-726701488);
        if ((i5 & 6) == 0) {
            i10 = (c0740o.e(activity) ? 4 : 2) | i5;
        } else {
            i10 = i5;
        }
        if ((i10 & 3) == 2 && c0740o.x()) {
            c0740o.I();
        } else {
            Boolean bool = (Boolean) ((y0) ((x0) c0740o.j(M.f46153p))).f46411a.getValue();
            boolean zBooleanValue = bool.booleanValue();
            c0740o.M(-1598618285);
            boolean zF = c0740o.f(zBooleanValue) | c0740o.e(activity);
            Object objF = c0740o.F();
            if (zF || objF == C0732k.f7800a) {
                objF = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.E(zBooleanValue, activity, null);
                c0740o.U(objF);
            }
            c0740o.p(false);
            C0718d.d(c0740o, bool, (p) objF);
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.D
                @Override // tf.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i11 = i5 | 1;
                    Fe.c.g(activity, (C0740o) obj, i11);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final boolean h(String str) {
        AbstractC3340k.e(str, "<this>");
        boolean zMatches = Patterns.WEB_URL.matcher(str).matches();
        if (!zMatches) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "HttpRequestClient", "URL is invalid. ".concat(str), null, false, 12, null);
        }
        return zMatches;
    }

    public static final Xf.i i(Decoder decoder) {
        AbstractC3340k.e(decoder, "<this>");
        Xf.i iVar = decoder instanceof Xf.i ? (Xf.i) decoder : null;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException(AbstractC3256n.i(kotlin.jvm.internal.H.f39741a, decoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    public static final Xf.m j(Encoder encoder) {
        AbstractC3340k.e(encoder, "<this>");
        Xf.m mVar = encoder instanceof Xf.m ? (Xf.m) encoder : null;
        if (mVar != null) {
            return mVar;
        }
        throw new IllegalStateException(AbstractC3256n.i(kotlin.jvm.internal.H.f39741a, encoder.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    public static void k(boolean z2, String str, Object... objArr) {
        if (!z2) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final int m(long j8, long j10) {
        boolean z2 = ((int) (j8 & 4294967295L)) != 0;
        return z2 != (((int) (4294967295L & j10)) != 0) ? z2 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j8 >> 32)) - Float.intBitsToFloat((int) (j10 >> 32)));
    }

    public static final double n(double d3, Cf.c sourceUnit, Cf.c targetUnit) {
        AbstractC3340k.e(sourceUnit, "sourceUnit");
        AbstractC3340k.e(targetUnit, "targetUnit");
        long jConvert = targetUnit.f2213a.convert(1L, sourceUnit.f2213a);
        return jConvert > 0 ? d3 * jConvert : d3 / r8.convert(1L, r9);
    }

    public static final long o(long j8, Cf.c sourceUnit, Cf.c targetUnit) {
        AbstractC3340k.e(sourceUnit, "sourceUnit");
        AbstractC3340k.e(targetUnit, "targetUnit");
        return targetUnit.f2213a.convert(j8, sourceUnit.f2213a);
    }

    public static final long p(long j8, Cf.c sourceUnit, Cf.c targetUnit) {
        AbstractC3340k.e(sourceUnit, "sourceUnit");
        AbstractC3340k.e(targetUnit, "targetUnit");
        return targetUnit.f2213a.convert(j8, sourceUnit.f2213a);
    }

    public static final long q(long j8, Cf.c unit) {
        long j10;
        AbstractC3340k.e(unit, "unit");
        int iOrdinal = unit.ordinal();
        if (iOrdinal == 2) {
            j10 = 1;
        } else if (iOrdinal == 3) {
            j10 = 1000;
        } else if (iOrdinal == 4) {
            j10 = 60000;
        } else if (iOrdinal == 5) {
            j10 = 3600000;
        } else {
            if (iOrdinal != 6) {
                throw new IllegalStateException(("Wrong unit for millisMultiplier: " + unit).toString());
            }
            j10 = 86400000;
        }
        if (j8 == 0) {
            return 0L;
        }
        if (j8 == 1) {
            if (j10 <= 4611686018427387903L) {
                return j10;
            }
        } else if (j10 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j8)) - Long.numberOfLeadingZeros(j10);
            if (iNumberOfLeadingZeros < 63) {
                return j8 * j10;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j11 = j8 * j10;
                if (j11 <= 4611686018427387903L) {
                    return j11;
                }
            }
        } else if (j8 <= 4611686018427387903L) {
            return j8;
        }
        return 4611686018427387903L;
    }

    public static final void r(BufferedReader bufferedReader, tf.l lVar) throws IOException {
        try {
            Iterator it = new Af.a(new Af.o(bufferedReader, 6)).iterator();
            while (it.hasNext()) {
                lVar.invoke(it.next());
            }
            bufferedReader.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Ba.c.n(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final S3.j s(S3.p pVar) {
        AbstractC3340k.e(pVar, "<this>");
        return new S3.j(pVar.f10977a, pVar.f10995t);
    }

    public static final int t(int i5, int i10, int i11) {
        if (i11 > 0) {
            if (i5 < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i5 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else {
            if (i11 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i5 > i10) {
                int i15 = -i11;
                int i16 = i5 % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        }
        return i10;
    }

    public static int u(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Y0.c.f(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon resource", e7);
            return 0;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        }
    }

    public static String v(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Y0.c.g(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon package", e7);
            return null;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon package", e10);
            return null;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        }
    }

    public static int w(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Y0.c.n(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e7);
            return -1;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        }
    }

    public static Uri x(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Y0.c.o(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e7) {
            Log.e("IconCompat", "Unable to get icon uri", e7);
            return null;
        } catch (NoSuchMethodException e10) {
            Log.e("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (InvocationTargetException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        }
    }

    public static InterfaceC2525i y(EnumC2526j enumC2526j, tf.a initializer) {
        AbstractC3340k.e(initializer, "initializer");
        int iOrdinal = enumC2526j.ordinal();
        if (iOrdinal == 0) {
            return new C2532p(initializer);
        }
        C2541y c2541y = C2541y.f34690a;
        if (iOrdinal == 1) {
            C2531o c2531o = new C2531o();
            c2531o.f34676a = initializer;
            c2531o.f34677b = c2541y;
            return c2531o;
        }
        if (iOrdinal != 2) {
            throw new Q((byte) 0, 9);
        }
        C2516D c2516d = new C2516D();
        c2516d.f34654a = initializer;
        c2516d.f34655b = c2541y;
        return c2516d;
    }

    public static C2532p z(tf.a initializer) {
        AbstractC3340k.e(initializer, "initializer");
        return new C2532p(initializer);
    }
}
