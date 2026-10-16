package A6;

import A.AbstractC0213f;
import A.AbstractC0226t;
import A.C0212e;
import A.C0217j;
import A.b0;
import A7.R0;
import B.C0317h;
import B.F;
import Bf.r;
import Cd.C0352u;
import Cd.m0;
import Cd.n0;
import E.AbstractC0426p;
import E.L;
import E5.Q;
import K.AbstractC0676a;
import K.C0678c;
import K.C0679d;
import K.C0685j;
import K.C0686k;
import K.C0687l;
import K.C0688m;
import K.I;
import N.C0718d;
import N.C0729i0;
import N.C0732k;
import N.C0740o;
import N.P;
import N.V;
import N.Y;
import U8.v0;
import Uc.o;
import Va.M6;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC1457v;
import c0.C1542g;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.internal.publisher.H;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.publisher.MolocoInitializationListener;
import com.unity3d.services.UnityAdsConstants;
import e0.C2465q;
import e0.InterfaceC2442E;
import ea.C2504t;
import ef.C2515C;
import ef.C2532p;
import ef.C2537u;
import ff.v;
import g0.InterfaceC2663d;
import h4.C2775b;
import io.flutter.plugins.GeneratedPluginRegistrant;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.C3109i;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.K;
import kotlin.reflect.KClass;
import lc.C3458b;
import lf.AbstractC3462a;
import lf.AbstractC3464c;
import okhttp3.Headers;
import org.apache.tika.metadata.HttpHeaders;
import org.xmlpull.v1.XmlSerializer;
import r0.InterfaceC3909n;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import tf.p;
import u0.InterfaceC4193p0;
import u0.M;

/* loaded from: classes3.dex */
public abstract class h {
    public static InterfaceC3103c A(InterfaceC3103c interfaceC3103c) {
        InterfaceC3103c<Object> interfaceC3103cIntercepted;
        AbstractC3340k.e(interfaceC3103c, "<this>");
        AbstractC3464c abstractC3464c = interfaceC3103c instanceof AbstractC3464c ? (AbstractC3464c) interfaceC3103c : null;
        return (abstractC3464c == null || (interfaceC3103cIntercepted = abstractC3464c.intercepted()) == null) ? interfaceC3103c : interfaceC3103cIntercepted;
    }

    public static boolean B(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean C(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static void D(Context context, String str) throws IOException {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                        if (fileOutputStreamOpenFileOutput != null) {
                            fileOutputStreamOpenFileOutput.close();
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e7);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (IOException unused2) {
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    public static final boolean E(C1542g c1542g, F f10) {
        c1542g.f19499c.n(new R0(10));
        P.d dVar = c1542g.f19499c;
        int i5 = dVar.f8972c;
        if (i5 <= 0) {
            return false;
        }
        int i10 = i5 - 1;
        Object[] objArr = dVar.f8970a;
        do {
            C1542g c1542g2 = (C1542g) objArr[i10];
            if (c.D(c1542g2) && i(c1542g2, f10)) {
                return true;
            }
            i10--;
        } while (i10 >= 0);
        return false;
    }

    public static final byte[] F(InputStream inputStream) throws IOException {
        AbstractC3340k.e(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(Segment.SIZE, inputStream.available()));
        o(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC3340k.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String G(android.content.Context r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.h.G(android.content.Context):java.lang.String");
    }

    public static void H(C3458b c3458b) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", C3458b.class).invoke(null, c3458b);
        } catch (Exception e7) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + c3458b + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e7);
        }
    }

    public static TypedValue J(Context context, int i5) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i5, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean K(Context context, int i5, boolean z2) {
        TypedValue typedValueJ = J(context, i5);
        return (typedValueJ == null || typedValueJ.type != 18) ? z2 : typedValueJ.data != 0;
    }

    public static TypedValue L(Context context, int i5, String str) {
        TypedValue typedValueJ = J(context, i5);
        if (typedValueJ != null) {
            return typedValueJ;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i5)));
    }

    public static long M(long j8, long j10) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j10) + Long.numberOfLeadingZeros(j10) + Long.numberOfLeadingZeros(~j8) + Long.numberOfLeadingZeros(j8);
        if (iNumberOfLeadingZeros > 65) {
            return j8 * j10;
        }
        long j11 = ((j8 ^ j10) >>> 63) + Long.MAX_VALUE;
        if (!((iNumberOfLeadingZeros < 64) | ((j10 == Long.MIN_VALUE) & (j8 < 0)))) {
            long j12 = j8 * j10;
            if (j8 == 0 || j12 / j8 == j10) {
                return j12;
            }
        }
        return j11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean N(c0.C1542g r9, c0.C1542g r10, int r11, B.F r12) {
        /*
            c0.r r0 = r9.f19500d
            c0.r r1 = c0.r.f19535b
            c0.r r2 = c0.r.f19538e
            if (r0 == r1) goto L13
            if (r0 != r2) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "This function should only be used within a parent that has focus."
            r9.<init>(r10)
            throw r9
        L13:
            A7.R0 r0 = new A7.R0
            r1 = 10
            r0.<init>(r1)
            P.d r1 = r9.f19499c
            r1.n(r0)
            r0 = 1
            r3 = 0
            if (r11 != r0) goto L56
            zf.g r4 = new zf.g
            int r5 = r1.f8972c
            int r5 = r5 - r0
            r4.<init>(r3, r5, r0)
            int r4 = r4.f48501b
            if (r4 < 0) goto L8b
            r5 = r3
            r6 = r5
        L31:
            if (r5 == 0) goto L46
            java.lang.Object[] r7 = r1.f8970a
            r7 = r7[r6]
            c0.g r7 = (c0.C1542g) r7
            boolean r8 = A6.c.D(r7)
            if (r8 == 0) goto L46
            boolean r7 = w(r7, r12)
            if (r7 == 0) goto L46
            goto L7a
        L46:
            java.lang.Object[] r7 = r1.f8970a
            r7 = r7[r6]
            boolean r7 = kotlin.jvm.internal.AbstractC3340k.a(r7, r10)
            if (r7 == 0) goto L51
            r5 = r0
        L51:
            if (r6 == r4) goto L8b
            int r6 = r6 + 1
            goto L31
        L56:
            r4 = 2
            if (r11 != r4) goto La3
            zf.g r4 = new zf.g
            int r5 = r1.f8972c
            int r5 = r5 - r0
            r4.<init>(r3, r5, r0)
            int r4 = r4.f48501b
            if (r4 < 0) goto L8b
            r5 = r3
        L66:
            if (r5 == 0) goto L7b
            java.lang.Object[] r6 = r1.f8970a
            r6 = r6[r4]
            c0.g r6 = (c0.C1542g) r6
            boolean r7 = A6.c.D(r6)
            if (r7 == 0) goto L7b
            boolean r6 = i(r6, r12)
            if (r6 == 0) goto L7b
        L7a:
            return r0
        L7b:
            java.lang.Object[] r6 = r1.f8970a
            r6 = r6[r4]
            boolean r6 = kotlin.jvm.internal.AbstractC3340k.a(r6, r10)
            if (r6 == 0) goto L86
            r5 = r0
        L86:
            if (r4 == 0) goto L8b
            int r4 = r4 + (-1)
            goto L66
        L8b:
            if (r11 != r0) goto L8e
            goto La2
        L8e:
            c0.r r10 = r9.f19500d
            if (r10 == r2) goto La2
            c0.g r10 = r9.f19498b
            if (r10 != 0) goto L97
            goto La2
        L97:
            java.lang.Object r9 = r12.invoke(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
        La2:
            return r3
        La3:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "This function should only be used for 1-D focus search"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.h.N(c0.g, c0.g, int, B.F):boolean");
    }

    public static String O(String str) {
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            char cCharAt = str.charAt(i5);
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i5 < length) {
                    char c10 = charArray[i5];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i5] = (char) (c10 ^ ' ');
                    }
                    i5++;
                }
                return String.valueOf(charArray);
            }
            i5++;
        }
        return str;
    }

    public static String P(String str) {
        int length = str.length();
        int i5 = 0;
        while (i5 < length) {
            if (C(str.charAt(i5))) {
                char[] charArray = str.toCharArray();
                while (i5 < length) {
                    char c10 = charArray[i5];
                    if (C(c10)) {
                        charArray[i5] = (char) (c10 ^ ' ');
                    }
                    i5++;
                }
                return String.valueOf(charArray);
            }
            i5++;
        }
        return str;
    }

    public static final boolean Q(String str, tf.a aVar) {
        try {
            boolean zBooleanValue = ((Boolean) aVar.invoke()).booleanValue();
            if (!zBooleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused2) {
            if (str == null) {
                str = "";
            }
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    public static ArrayList R(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof o) {
            o oVar = (o) th;
            arrayList.add(oVar.f12755a);
            arrayList.add(oVar.getMessage());
            arrayList.add(oVar.f12756b);
            return arrayList;
        }
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }

    public static Object S(p pVar, Object obj, InterfaceC3103c completion) {
        AbstractC3340k.e(pVar, "<this>");
        AbstractC3340k.e(completion, "completion");
        InterfaceC3108h context = completion.getContext();
        Object eVar = context == C3109i.f38759a ? new kf.e(completion) : new kf.f(completion, context);
        K.e(2, pVar);
        return pVar.invoke(obj, eVar);
    }

    public static d7.d[] T(Ca.h hVar) {
        return hVar.c() ? ya.j.f48055a : new d7.d[]{ya.j.f48056b};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    public static final void a(tf.a onClick, Z.k kVar, boolean z2, D.i iVar, K.n nVar, InterfaceC2442E interfaceC2442E, C0317h c0317h, C0685j c0685j, E.F f10, V.d dVar, C0740o c0740o, int i5, int i10) {
        Z.k kVar2;
        ?? r16;
        boolean z10;
        D.i iVar2;
        K.n nVar2;
        E.F f11;
        K.n nVar3;
        long j8;
        K.n nVar4;
        D.h hVar;
        K.n nVar5;
        boolean z11;
        C0217j c0217j;
        boolean z12;
        D.i iVar3;
        K.n nVar6;
        E.F f12;
        AbstractC3340k.e(onClick, "onClick");
        c0740o.N(-2116133464);
        int i11 = (i5 & 14) == 0 ? (c0740o.e(onClick) ? 4 : 2) | i5 : i5;
        if ((i5 & 112) == 0) {
            kVar2 = kVar;
            i11 |= c0740o.e(kVar2) ? 32 : 16;
        } else {
            kVar2 = kVar;
        }
        int i12 = i10 & 4;
        if (i12 != 0) {
            i11 |= 384;
            z10 = z2;
            r16 = 1;
        } else {
            r16 = 1;
            r16 = 1;
            if ((i5 & 896) == 0) {
                z10 = z2;
                i11 |= c0740o.f(z10) ? 256 : 128;
            } else {
                z10 = z2;
            }
        }
        int i13 = i10 & 8;
        if (i13 != 0) {
            i11 |= 3072;
            iVar2 = iVar;
        } else if ((i5 & 7168) == 0) {
            iVar2 = iVar;
            i11 |= c0740o.e(iVar2) ? 2048 : Segment.SHARE_MINIMUM;
        } else {
            iVar2 = iVar;
        }
        if ((i5 & 57344) == 0) {
            nVar2 = nVar;
            i11 |= ((i10 & 16) == 0 && c0740o.e(nVar2)) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        } else {
            nVar2 = nVar;
        }
        if ((i5 & 458752) == 0) {
            i11 |= c0740o.e(interfaceC2442E) ? 131072 : 65536;
        }
        if ((i5 & 3670016) == 0) {
            i11 |= c0740o.e(c0317h) ? 1048576 : 524288;
        }
        if ((i5 & 29360128) == 0) {
            i11 |= c0740o.e(c0685j) ? 8388608 : 4194304;
        }
        int i14 = 256 & i10;
        if (i14 != 0) {
            i11 |= 100663296;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i5 & 234881024) == 0) {
                i11 |= c0740o.e(f11) ? 67108864 : 33554432;
            }
        }
        if ((i5 & 1879048192) == 0) {
            i11 |= c0740o.e(dVar) ? 536870912 : 268435456;
        }
        if ((i11 & 1533916891) == 306783378 && c0740o.x()) {
            c0740o.I();
            nVar6 = nVar2;
            z12 = z10;
            iVar3 = iVar2;
            f12 = f11;
        } else {
            c0740o.K();
            int i15 = i5 & 1;
            P p10 = C0732k.f7800a;
            if (i15 == 0 || c0740o.w()) {
                if (i12 != 0) {
                    z10 = r16;
                }
                if (i13 != 0) {
                    c0740o.M(-492369756);
                    Object objF = c0740o.F();
                    if (objF == p10) {
                        objF = new D.i();
                        c0740o.U(objF);
                    }
                    c0740o.p(false);
                    iVar2 = (D.i) objF;
                }
                if ((i10 & 16) != 0) {
                    E.F f13 = AbstractC0676a.f6216a;
                    c0740o.M(-737170518);
                    float f14 = 2;
                    float f15 = 8;
                    float f16 = 0;
                    float f17 = 4;
                    L0.d dVar2 = new L0.d(f14);
                    L0.d dVar3 = new L0.d(f15);
                    L0.d dVar4 = new L0.d(f16);
                    L0.d dVar5 = new L0.d(f17);
                    L0.d dVar6 = new L0.d(f17);
                    Object[] objArr = new Object[5];
                    objArr[0] = dVar2;
                    objArr[r16] = dVar3;
                    objArr[2] = dVar4;
                    objArr[3] = dVar5;
                    objArr[4] = dVar6;
                    c0740o.M(-568225417);
                    boolean zE = false;
                    for (int i16 = 0; i16 < 5; i16++) {
                        zE |= c0740o.e(objArr[i16]);
                    }
                    Object objF2 = c0740o.F();
                    if (zE || objF2 == p10) {
                        objF2 = new K.n(f14, f15, f16, f17, f17);
                        c0740o.U(objF2);
                    }
                    c0740o.p(false);
                    nVar3 = (K.n) objF2;
                    c0740o.p(false);
                    i11 &= -57345;
                } else {
                    nVar3 = nVar2;
                }
                if (i14 != 0) {
                    f11 = AbstractC0676a.f6216a;
                }
            } else {
                c0740o.I();
                if ((i10 & 16) != 0) {
                    i11 &= -57345;
                }
                nVar3 = nVar2;
            }
            boolean z13 = z10;
            int i17 = i11;
            D.i interactionSource = iVar2;
            c0740o.q();
            int i18 = i17 >> 6;
            c0740o.M(-2133647540);
            V vI = C0718d.I(new C2465q(z13 ? c0685j.f6264b : c0685j.f6266d), c0740o);
            c0740o.p(false);
            c0740o.M(-655254499);
            V vI2 = C0718d.I(new C2465q(z13 ? c0685j.f6263a : c0685j.f6265c), c0740o);
            c0740o.p(false);
            long j10 = ((C2465q) vI2.getValue()).f34382a;
            long jA = C2465q.a(((C2465q) vI.getValue()).f34382a, 1.0f);
            if (nVar3 == null) {
                nVar5 = nVar3;
                j8 = jA;
                c0217j = null;
            } else {
                AbstractC3340k.e(interactionSource, "interactionSource");
                c0740o.M(-1588756907);
                c0740o.M(-492369756);
                Object objF3 = c0740o.F();
                if (objF3 == p10) {
                    objF3 = C0718d.F();
                    c0740o.U(objF3);
                }
                j8 = jA;
                c0740o.p(false);
                X.p pVar = (X.p) objF3;
                C0718d.d(c0740o, interactionSource, new C0686k(interactionSource, pVar, null));
                D.h hVar2 = (D.h) ff.o.z0(pVar);
                float f18 = !z13 ? nVar3.f6280c : hVar2 instanceof D.k ? nVar3.f6279b : hVar2 instanceof D.e ? nVar3.f6281d : hVar2 instanceof D.a ? nVar3.f6282e : nVar3.f6278a;
                c0740o.M(-492369756);
                Object objF4 = c0740o.F();
                if (objF4 == p10) {
                    nVar4 = nVar3;
                    hVar = hVar2;
                    objF4 = new C0212e(new L0.d(f18), b0.f130c, null);
                    c0740o.U(objF4);
                } else {
                    nVar4 = nVar3;
                    hVar = hVar2;
                }
                c0740o.p(false);
                C0212e c0212e = (C0212e) objF4;
                if (z13) {
                    c0740o.M(-1598807310);
                    nVar5 = nVar4;
                    C0718d.d(c0740o, new L0.d(f18), new C0688m(c0212e, nVar4, f18, hVar, null));
                    z11 = false;
                    c0740o.p(false);
                } else {
                    c0740o.M(-1598807481);
                    C0718d.d(c0740o, new L0.d(f18), new C0687l(c0212e, f18, null));
                    c0740o.p(false);
                    nVar5 = nVar4;
                    z11 = false;
                }
                c0217j = c0212e.f143c;
                c0740o.p(z11);
            }
            E.F f19 = f11;
            Fe.g.f(onClick, kVar2, z13, interfaceC2442E, j10, j8, c0317h, c0217j != null ? ((L0.d) ((Y) c0217j.f170f).getValue()).f6795a : 0, interactionSource, V.e.b(c0740o, 7524271, new C0678c(i17, 0, vI, f19, dVar)), c0740o, (i17 & 14) | 805306368 | (i17 & 112) | (i17 & 896) | (i18 & 7168) | (i17 & 3670016) | ((i17 << 15) & 234881024));
            z12 = z13;
            iVar3 = interactionSource;
            nVar6 = nVar5;
            f12 = f19;
        }
        C0729i0 c0729i0R = c0740o.r();
        if (c0729i0R == null) {
            return;
        }
        c0729i0R.f7788d = new C0679d(onClick, kVar, z12, iVar3, nVar6, interfaceC2442E, c0317h, c0685j, f12, dVar, i5, i10);
    }

    public static final long b(int i5, int i10) {
        long j8 = (i10 & 4294967295L) | (i5 << 32);
        int i11 = L0.g.f6803c;
        return j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public static final void c(final long j8, final long j10, final Z.k kVar, float f10, final float f11, final tf.a onTimerFinish, InterfaceC1457v interfaceC1457v, final int i5, final int i10, C0740o c0740o, final int i11) {
        int i12;
        int i13;
        float f12;
        InterfaceC1457v interfaceC1457v2;
        Object mVar;
        int i14;
        C0212e c0212e;
        float f13;
        InterfaceC1457v interfaceC1457v3;
        ?? r12;
        C0740o c0740o2;
        Object obj;
        C0740o c0740o3;
        InterfaceC1457v interfaceC1457v4;
        boolean z2;
        Object obj2;
        float f14;
        C0740o c0740o4;
        final InterfaceC1457v interfaceC1457v5;
        final float f15;
        AbstractC3340k.e(onTimerFinish, "onTimerFinish");
        c0740o.N(-562864551);
        if ((i11 & 6) == 0) {
            i12 = (c0740o.d(j8) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= c0740o.d(j10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= c0740o.e(kVar) ? 256 : 128;
        }
        int i15 = i12 | 3072;
        if ((i11 & 24576) == 0) {
            i15 |= c0740o.b(f11) ? Http2.INITIAL_MAX_FRAME_SIZE : Segment.SIZE;
        }
        if ((196608 & i11) == 0) {
            i15 |= c0740o.e(onTimerFinish) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i15 |= 524288;
        }
        if ((12582912 & i11) == 0) {
            i15 |= c0740o.c(i5) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i15 |= c0740o.c(i10) ? 67108864 : 33554432;
        }
        if ((38347923 & i15) == 38347922 && c0740o.x()) {
            c0740o.I();
            f15 = f10;
            interfaceC1457v5 = interfaceC1457v;
            c0740o4 = c0740o;
        } else {
            c0740o.K();
            int i16 = i11 & 1;
            Z.i iVar = Z.i.f16922a;
            if (i16 == 0 || c0740o.w()) {
                i13 = i15 & (-3670017);
                f12 = 7;
                interfaceC1457v2 = (InterfaceC1457v) c0740o.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            } else {
                c0740o.I();
                interfaceC1457v2 = interfaceC1457v;
                i13 = i15 & (-3670017);
                f12 = f10;
            }
            c0740o.q();
            c0740o.M(1215960328);
            boolean zE = c0740o.e(interfaceC1457v2);
            Object objF = c0740o.F();
            Object obj3 = C0732k.f7800a;
            if (zE || objF == obj3) {
                objF = C0718d.G(Boolean.TRUE, P.f7730f);
                c0740o.U(objF);
            }
            V v2 = (V) objF;
            c0740o.p(false);
            InterfaceC1457v interfaceC1457v6 = interfaceC1457v2;
            Object[] objArr = new Object[0];
            c0740o.M(1215963943);
            boolean zC = c0740o.c(i10);
            Object objF2 = c0740o.F();
            if (zC || objF2 == obj3) {
                objF2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.b(i10, 1);
                c0740o.U(objF2);
            }
            c0740o.p(false);
            V v10 = (V) gc.b.E(objArr, null, (tf.a) objF2, c0740o, 0, 6);
            c0740o.M(1215966697);
            Object objF3 = c0740o.F();
            if (objF3 == obj3) {
                objF3 = AbstractC0226t.a(xg.g.d(i10, i5));
                c0740o.U(objF3);
            }
            C0212e c0212e2 = (C0212e) objF3;
            c0740o.p(false);
            C2537u c2537u = new C2537u(i10);
            c0740o.M(1215977122);
            boolean zE2 = c0740o.e(v10) | c0740o.c(i10) | c0740o.c(i5) | c0740o.e(c0212e2) | c0740o.e(onTimerFinish);
            Object objF4 = c0740o.F();
            if (zE2 || objF4 == obj3) {
                i14 = i10;
                c0212e = c0212e2;
                f13 = f12;
                interfaceC1457v3 = interfaceC1457v6;
                r12 = 0;
                C0740o c0740o5 = c0740o;
                mVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.m(i14, i5, c0212e, onTimerFinish, v10, null);
                c0740o5.U(mVar);
                c0740o2 = c0740o5;
            } else {
                c0212e = c0212e2;
                mVar = objF4;
                f13 = f12;
                i14 = i10;
                c0740o2 = c0740o;
                interfaceC1457v3 = interfaceC1457v6;
                r12 = 0;
            }
            c0740o2.p(r12);
            C0718d.d(c0740o2, c2537u, (p) mVar);
            Boolean bool = (Boolean) v2.getValue();
            bool.getClass();
            c0740o2.M(1216010844);
            boolean zE3 = c0740o2.e(v2) | c0740o2.e(c0212e);
            Object objF5 = c0740o2.F();
            if (zE3 || objF5 == obj3) {
                objF5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.n(c0212e, v2, null);
                c0740o2.U(objF5);
            }
            c0740o2.p(r12);
            C0718d.d(c0740o2, bool, (p) objF5);
            c0740o2.M(1216015257);
            boolean zE4 = c0740o2.e(v2) | c0740o2.e(c0212e) | c0740o2.e(interfaceC1457v3);
            Object objF6 = c0740o2.F();
            if (zE4 || objF6 == obj3) {
                objF6 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.c(interfaceC1457v3, c0212e, v2, 1);
                c0740o2.U(objF6);
            }
            c0740o2.p(r12);
            C0718d.c(interfaceC1457v3, (tf.l) objF6, c0740o2);
            Z.d dVar = Z.a.f16904e;
            Z.k kVarL = v0.l(ic.d.k(L.c(kVar, f11), H.e.a(20)), C2465q.a(C2465q.f34375d, 0.9f), H.e.f4848a);
            c0740o2.M(1216045352);
            boolean zE5 = c0740o2.e("timer_container");
            Object objF7 = c0740o2.F();
            if (zE5 || objF7 == obj3) {
                objF7 = new C1915d(15);
                c0740o2.U(objF7);
            }
            c0740o2.p(r12);
            Z.k kVarJ = Fe.g.J(kVarL, r12, (tf.l) objF7);
            c0740o2.M(733328855);
            InterfaceC3909n interfaceC3909nC = AbstractC0426p.c(dVar, r12, c0740o2);
            c0740o2.M(-1323940314);
            L0.b bVar = (L0.b) c0740o2.j(M.f46143e);
            L0.i iVar2 = (L0.i) c0740o2.j(M.k);
            InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o2.j(M.f46152o);
            InterfaceC4055c.g9.getClass();
            C4056d c4056d = C4054b.f45453b;
            V.d dVarY = S3.f.y(kVarJ);
            c0740o2.O();
            if (c0740o2.f7843O) {
                c0740o2.k(c4056d);
            } else {
                c0740o2.X();
            }
            c0740o2.f7867x = r12;
            C0718d.M(c0740o2, interfaceC3909nC, C4054b.f45456e);
            C0718d.M(c0740o2, bVar, C4054b.f45455d);
            C0718d.M(c0740o2, iVar2, C4054b.f45457f);
            wg.b.d(r12, dVarY, wg.b.b(c0740o2, interfaceC4193p0, C4054b.f45458g, c0740o2), c0740o2, 2058660585);
            c0740o2.M(-2137368960);
            Z.k kVarA = L.a(iVar);
            c0740o2.M(1205651458);
            final float f16 = f13;
            boolean zD = c0740o2.d(j8) | c0740o2.b(f16) | c0740o2.e(c0212e) | c0740o2.d(j10);
            Object objF8 = c0740o2.F();
            if (zD || objF8 == obj3) {
                c0740o3 = c0740o2;
                interfaceC1457v4 = interfaceC1457v3;
                final C0212e c0212e3 = c0212e;
                z2 = r12;
                obj2 = obj3;
                obj = new tf.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.k
                    @Override // tf.l
                    public final Object invoke(Object obj4) {
                        InterfaceC2663d Canvas = (InterfaceC2663d) obj4;
                        AbstractC3340k.e(Canvas, "$this$Canvas");
                        long jI = H.I(d0.f.d(Canvas.c()), d0.f.b(Canvas.c()));
                        float f17 = f16;
                        com.google.android.gms.internal.consent_sdk.a.c(Canvas, j8, 360.0f, 360.0f, jI, new g0.g(Canvas.t(f17), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, 26));
                        C0212e c0212e4 = c0212e3;
                        float fFloatValue = ((Number) c0212e4.d()).floatValue();
                        float f18 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (fFloatValue > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            float fFloatValue2 = ((Number) c0212e4.d()).floatValue();
                            if (fFloatValue2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                f18 = fFloatValue2;
                            }
                            long jI2 = H.I(d0.f.d(Canvas.c()), d0.f.b(Canvas.c()));
                            g0.g gVar = new g0.g(Canvas.t(f17), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1, 0, 26);
                            com.google.android.gms.internal.consent_sdk.a.c(Canvas, j10, 270.0f, f18 * (-360.0f), jI2, gVar);
                        }
                        return C2515C.f34653a;
                    }
                };
                f14 = f16;
                c0740o3.U(obj);
            } else {
                z2 = r12;
                interfaceC1457v4 = interfaceC1457v3;
                f14 = f16;
                obj = objF8;
                c0740o3 = c0740o2;
                obj2 = obj3;
            }
            c0740o3.p(z2);
            android.support.v4.media.session.b.F(kVarA, (tf.l) obj, c0740o3, 6);
            String string = Long.toString(i14 & 4294967295L, 10);
            z0.p pVar = ((K.L) c0740o3.j(K.M.f6215a)).k;
            long j11 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31058b;
            c0740o3.M(1205686792);
            boolean zE6 = c0740o3.e("countdown_timer_text");
            Object objF9 = c0740o3.F();
            if (zE6 || objF9 == obj2) {
                objF9 = new C1915d(16);
                c0740o3.U(objF9);
            }
            c0740o3.p(z2);
            I.b(string, Fe.g.J(iVar, z2, (tf.l) objF9), j10, j11, null, null, 0L, new K0.c(3), 0L, 0, false, 1, null, pVar, c0740o, ((i13 << 3) & 896) | 3072, 3072, 24048);
            c0740o4 = c0740o;
            wg.b.e(c0740o4, false, false, true, false);
            c0740o4.p(false);
            interfaceC1457v5 = interfaceC1457v4;
            f15 = f14;
        }
        C0729i0 c0729i0R = c0740o4.r();
        if (c0729i0R != null) {
            c0729i0R.f7788d = new p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.rewardedcountdowntimer.l
                @Override // tf.p
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int i17 = i11 | 1;
                    int i18 = i5;
                    int i19 = i10;
                    A6.h.c(j8, j10, kVar, f15, f11, onTimerFinish, interfaceC1457v5, i18, i19, (C0740o) obj4, i17);
                    return C2515C.f34653a;
                }
            };
        }
    }

    public static final void d(Fd.c cVar, long j8) {
        n0 n0Var = new n0();
        Long lValueOf = Long.valueOf(j8);
        n0.a(lValueOf);
        n0Var.f2142a = lValueOf;
        ((Map) cVar.f4050f.a(zd.g.f48487a, new C0352u(1))).put(m0.f2138a, n0Var);
    }

    public static final void e(MolocoInitializationListener molocoInitializationListener, MolocoInitStatus initStatus) {
        AbstractC3340k.e(molocoInitializationListener, "<this>");
        AbstractC3340k.e(initStatus, "initStatus");
        Bf.g gVar = new Bf.g(5, molocoInitializationListener, initStatus);
        Kd.a aVar = com.moloco.sdk.internal.scheduling.c.f29368a;
        Ef.H.D(com.moloco.sdk.internal.scheduling.c.f29368a, null, new com.moloco.sdk.internal.scheduling.b(gVar, null), 3);
    }

    public static final Object[] f(Object[] objArr, int i5, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        ff.m.j0(objArr, 0, objArr2, i5, 6);
        ff.m.h0(objArr, i5 + 2, objArr2, i5, objArr.length);
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] g(int i5, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        ff.m.j0(objArr, 0, objArr2, i5, 6);
        ff.m.h0(objArr, i5, objArr2, i5 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] h(int i5, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        ff.m.j0(objArr, 0, objArr2, i5, 6);
        ff.m.h0(objArr, i5, objArr2, i5 + 1, objArr.length);
        return objArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(c0.C1542g r8, B.F r9) {
        /*
            c0.r r0 = r8.f19500d
            int r0 = r0.ordinal()
            if (r0 == 0) goto L88
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == r5) goto L33
            if (r0 == r4) goto L88
            if (r0 == r3) goto L88
            if (r0 == r2) goto L33
            if (r0 != r1) goto L2a
            boolean r0 = E(r8, r9)
            if (r0 != 0) goto L7c
            java.lang.Object r8 = r9.invoke(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7a
            goto L7c
        L2a:
            E5.Q r8 = new E5.Q
            r9 = 9
            r0 = 0
            r8.<init>(r0, r9)
            throw r8
        L33:
            c0.g r0 = r8.f19501e
            java.lang.String r6 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L82
            c0.r r7 = r0.f19500d
            int r7 = r7.ordinal()
            if (r7 == 0) goto L7d
            if (r7 == r5) goto L67
            if (r7 == r4) goto L7d
            if (r7 == r3) goto L61
            if (r7 == r2) goto L54
            if (r7 == r1) goto L61
            E5.Q r8 = new E5.Q
            r9 = 9
            r0 = 0
            r8.<init>(r0, r9)
            throw r8
        L54:
            boolean r1 = i(r0, r9)
            if (r1 != 0) goto L7c
            boolean r8 = N(r8, r0, r4, r9)
            if (r8 == 0) goto L7a
            goto L7c
        L61:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r6)
            throw r8
        L67:
            boolean r8 = i(r0, r9)
            if (r8 != 0) goto L7c
            java.lang.Object r8 = r9.invoke(r0)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7a
            goto L7c
        L7a:
            r8 = 0
            return r8
        L7c:
            return r5
        L7d:
            boolean r8 = N(r8, r0, r4, r9)
            return r8
        L82:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r6)
            throw r8
        L88:
            boolean r8 = E(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: A6.h.i(c0.g, B.F):boolean");
    }

    public static void j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static long k(long j8, long j10) {
        long j11 = j8 + j10;
        if (((j8 ^ j10) < 0) || ((j8 ^ j11) >= 0)) {
            return j11;
        }
        throw new ArithmeticException(M6.s(M6.u(j8, "overflow: checkedAdd(", ", "), j10, ")"));
    }

    public static Headers l(Headers headers, Headers headers2) {
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        for (int i5 = 0; i5 < size; i5++) {
            String strC = headers.c(i5);
            String strF = headers.f(i5);
            if ((!"Warning".equalsIgnoreCase(strC) || !r.k0(strF, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION, false)) && (HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strC) || HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strC) || "Content-Type".equalsIgnoreCase(strC) || !B(strC) || headers2.a(strC) == null)) {
                builder.a(strC, strF);
            }
        }
        int size2 = headers2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            String strC2 = headers2.c(i10);
            if (!HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(strC2) && !HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(strC2) && !"Content-Type".equalsIgnoreCase(strC2) && B(strC2)) {
                builder.a(strC2, headers2.f(i10));
            }
        }
        return builder.d();
    }

    public static MeteringRectangle n(Size size, double d3, double d5, int i5) {
        double d10;
        double d11;
        int iF = AbstractC0213f.f(i5);
        if (iF == 0) {
            d10 = 1.0d - d3;
            d11 = d5;
        } else if (iF == 1) {
            d11 = 1.0d - d5;
            d10 = d3;
        } else if (iF != 3) {
            d11 = d3;
            d10 = d5;
        } else {
            d10 = 1.0d - d5;
            d11 = 1.0d - d3;
        }
        int iRound = (int) Math.round(d11 * (size.getWidth() - 1));
        int iRound2 = (int) Math.round(d10 * (size.getHeight() - 1));
        int iRound3 = (int) Math.round(size.getWidth() / 10.0d);
        int iRound4 = (int) Math.round(size.getHeight() / 10.0d);
        int i10 = iRound - (iRound3 / 2);
        int i11 = iRound2 - (iRound4 / 2);
        if (i10 < 0) {
            i10 = 0;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        int width = (size.getWidth() - 1) - iRound3;
        int height = (size.getHeight() - 1) - iRound4;
        if (i10 > width) {
            i10 = width;
        }
        if (i11 > height) {
            i11 = height;
        }
        return new MeteringRectangle(i10, i11, iRound3, iRound4, 1);
    }

    public static void o(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        AbstractC3340k.e(inputStream, "<this>");
        byte[] bArr = new byte[Segment.SIZE];
        int i5 = inputStream.read(bArr);
        while (i5 >= 0) {
            byteArrayOutputStream.write(bArr, 0, i5);
            i5 = inputStream.read(bArr);
        }
    }

    public static final X3.k p(Context context) {
        b7.k kVar = new b7.k(context, 16);
        C2532p c2532pZ = Fe.c.z(new X3.d(kVar, 0));
        C2532p c2532pZ2 = Fe.c.z(new X3.d(kVar, 1));
        C2532p c2532pZ3 = Fe.c.z(X3.e.f16088i);
        v vVar = v.f35432a;
        return new X3.k((Context) kVar.f19396b, (C2775b) kVar.f19397c, c2532pZ, c2532pZ2, c2532pZ3, new X3.b(vVar, vVar, vVar, vVar, vVar), (k4.i) kVar.f19398d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC3103c q(InterfaceC3103c interfaceC3103c, InterfaceC3103c interfaceC3103c2, p pVar) {
        AbstractC3340k.e(pVar, "<this>");
        if (pVar instanceof AbstractC3462a) {
            return ((AbstractC3462a) pVar).create(interfaceC3103c, interfaceC3103c2);
        }
        InterfaceC3108h context = interfaceC3103c2.getContext();
        return context == C3109i.f38759a ? new kf.c(interfaceC3103c2, interfaceC3103c, pVar) : new kf.d(interfaceC3103c2, context, pVar, interfaceC3103c);
    }

    public static String r(Object value, String str) {
        AbstractC3340k.e(value, "value");
        return str + " value: " + value;
    }

    public static void s(File file) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("Failed to delete file " + file);
        }
        try {
            Files.deleteIfExists(file.toPath());
        } catch (IOException e7) {
            throw new IOException("Failed to delete file " + file + ": " + e7);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static long t(long j8, long j10, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j11 = j8 / j10;
        long j12 = j8 - (j10 * j11);
        if (j12 == 0) {
            return j11;
        }
        int i5 = ((int) ((j8 ^ j10) >> 63)) | 1;
        switch (n8.e.f40942a[roundingMode.ordinal()]) {
            case 1:
                Ba.c.m(j12 == 0);
                return j11;
            case 2:
                return j11;
            case 3:
                if (i5 >= 0) {
                    return j11;
                }
                return j11 + i5;
            case 4:
                return j11 + i5;
            case 5:
                if (i5 <= 0) {
                    return j11;
                }
                return j11 + i5;
            case 6:
            case 7:
            case 8:
                long jAbs = Math.abs(j12);
                long jAbs2 = jAbs - (Math.abs(j10) - jAbs);
                if (jAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j11) == 0)) {
                        return j11;
                    }
                } else if (jAbs2 <= 0) {
                    return j11;
                }
                return j11 + i5;
            default:
                throw new AssertionError();
        }
    }

    public static boolean u(Method method, KClass clazz) {
        AbstractC3340k.e(clazz, "clazz");
        return method.getReturnType().equals(Fe.b.y(clazz));
    }

    public static boolean v(String str, String str2) {
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length == str2.length()) {
            for (int i5 = 0; i5 < length; i5++) {
                if (str.charAt(i5) == str2.charAt(i5) || ((c10 = (char) ((r3 | ' ') - 97)) < 26 && c10 == ((char) ((r4 | ' ') - 97)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean w(C1542g c1542g, F f10) {
        int iOrdinal = c1542g.f19500d.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return ((Boolean) f10.invoke(c1542g)).booleanValue();
                        }
                        throw new Q((byte) 0, 9);
                    }
                }
            }
            C1542g c1542g2 = c1542g.f19501e;
            if (c1542g2 != null) {
                return w(c1542g2, f10) || N(c1542g, c1542g2, 1, f10);
            }
            throw new IllegalStateException("ActiveParent must have a focusedChild");
        }
        R0 r02 = new R0(10);
        P.d dVar = c1542g.f19499c;
        dVar.n(r02);
        int i5 = dVar.f8972c;
        if (i5 > 0) {
            Object[] objArr = dVar.f8970a;
            int i10 = 0;
            do {
                C1542g c1542g3 = (C1542g) objArr[i10];
                if (!c.D(c1542g3) || !w(c1542g3, f10)) {
                    i10++;
                }
            } while (i10 < i5);
        }
    }

    public static long x(long j8, long j10) {
        Ba.c.l(j8, "a");
        Ba.c.l(j10, "b");
        if (j8 == 0) {
            return j10;
        }
        if (j10 == 0) {
            return j8;
        }
        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
        long jNumberOfTrailingZeros = j8 >> iNumberOfTrailingZeros;
        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(j10);
        long j11 = j10 >> iNumberOfTrailingZeros2;
        while (jNumberOfTrailingZeros != j11) {
            long j12 = jNumberOfTrailingZeros - j11;
            long j13 = (j12 >> 63) & j12;
            long j14 = (j12 - j13) - j13;
            j11 += j13;
            jNumberOfTrailingZeros = j14 >> Long.numberOfTrailingZeros(j14);
        }
        return jNumberOfTrailingZeros << Math.min(iNumberOfTrailingZeros, iNumberOfTrailingZeros2);
    }

    public static ArrayList y(Context context) {
        AbstractC3340k.e(context, "context");
        int i5 = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = v.f35432a;
        }
        ArrayList arrayListO0 = ff.o.o0(runningAppProcesses);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListO0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i5) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(ff.p.a0(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            String str2 = runningAppProcessInfo.processName;
            AbstractC3340k.d(str2, "runningAppProcessInfo.processName");
            arrayList2.add(new C2504t(str2, runningAppProcessInfo.pid, runningAppProcessInfo.importance, AbstractC3340k.a(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static final int z(int i5, int i10) {
        return (i5 >> i10) & 31;
    }

    public abstract h I(String str, tf.l lVar);

    public abstract Object m();
}
