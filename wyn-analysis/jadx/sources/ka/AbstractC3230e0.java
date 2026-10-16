package ka;

import A7.AbstractC0279p0;
import Cd.C0352u;
import E.C0423m;
import Jd.C0672f;
import Jd.C0675i;
import N.C0718d;
import N.C0740o;
import Va.M6;
import Va.X7;
import W9.C1233d;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import ba.C1521a;
import com.applovin.shadow.okio.Segment;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.google.protobuf.ExtensionRegistryLite;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import ef.C2527k;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.C3109i;
import k3.C3179k;
import kd.C3306b;
import kotlin.jvm.internal.AbstractC3340k;
import n0.AbstractC3562a;
import o.C3623d;
import oc.C3665d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r7.AbstractC3935e;
import t0.C4054b;
import t0.C4056d;
import t0.InterfaceC4055c;
import u0.InterfaceC4193p0;
import uc.InterfaceC4265b;
import uc.InterfaceC4269f;
import uc.InterfaceC4277n;

/* renamed from: ka.e0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3230e0 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile F6.r f39401a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile F6.r f39402b = null;

    /* renamed from: c, reason: collision with root package name */
    public static volatile F6.r f39403c = null;

    /* renamed from: d, reason: collision with root package name */
    public static volatile F6.r f39404d = null;

    /* renamed from: e, reason: collision with root package name */
    public static volatile F6.r f39405e = null;

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f39406f = true;

    /* renamed from: g, reason: collision with root package name */
    public static UiModeManager f39407g;

    /* renamed from: h, reason: collision with root package name */
    public static Context f39408h;

    public static Object A(Object obj) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                jSONArray.put(A(it.next()));
            }
            return jSONArray;
        }
        if (obj.getClass().isArray()) {
            JSONArray jSONArray2 = new JSONArray();
            int length = Array.getLength(obj);
            for (int i5 = 0; i5 < length; i5++) {
                jSONArray2.put(A(Array.get(obj, i5)));
            }
            return jSONArray2;
        }
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONObject.put((String) entry.getKey(), A(entry.getValue()));
            }
            return jSONObject;
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if (obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public static final long a(int i5) {
        long j8 = (i5 << 32) | (0 & 4294967295L);
        int i10 = AbstractC3562a.k;
        return j8;
    }

    public static final void b(C0740o c0740o, Z.k modifier) {
        AbstractC3340k.e(modifier, "modifier");
        c0740o.M(-72882467);
        C0423m c0423m = C0423m.f2754c;
        c0740o.M(-1323940314);
        L0.b bVar = (L0.b) c0740o.j(u0.M.f46143e);
        L0.i iVar = (L0.i) c0740o.j(u0.M.k);
        InterfaceC4193p0 interfaceC4193p0 = (InterfaceC4193p0) c0740o.j(u0.M.f46152o);
        InterfaceC4055c.g9.getClass();
        C4056d c4056d = C4054b.f45453b;
        V.d dVarY = S3.f.y(modifier);
        c0740o.O();
        if (c0740o.f7843O) {
            c0740o.k(c4056d);
        } else {
            c0740o.X();
        }
        c0740o.f7867x = false;
        C0718d.M(c0740o, c0423m, C4054b.f45456e);
        C0718d.M(c0740o, bVar, C4054b.f45455d);
        C0718d.M(c0740o, iVar, C4054b.f45457f);
        wg.b.d(0, dVarY, wg.b.b(c0740o, interfaceC4193p0, C4054b.f45458g, c0740o), c0740o, 2058660585);
        c0740o.M(1142320198);
        c0740o.p(false);
        c0740o.p(false);
        c0740o.p(true);
        c0740o.p(false);
        c0740o.p(false);
    }

    public static final V.d c(Z.d dVar, E.F f10, C0740o c0740o, int i5) {
        c0740o.M(-1318345093);
        if ((i5 & 1) != 0) {
            dVar = Z.a.f16906g;
        }
        if ((i5 & 2) != 0) {
            float f11 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f31057a;
            f10 = new E.F(f11, f11, f11, f11);
        }
        V.d dVarB = V.e.b(c0740o, -903645392, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.r(dVar, f10));
        c0740o.p(false);
        return dVarB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033d  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h r35, final tf.a r36, final Z.k r37, final tf.u r38, final tf.s r39, final tf.t r40, final tf.u r41, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S r42, final tf.a r43, N.C0740o r44, final int r45) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.AbstractC3230e0.e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h, tf.a, Z.k, tf.u, tf.s, tf.t, tf.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S, tf.a, N.o, int):void");
    }

    public static final List f(Throwable th) {
        return AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
    }

    public static N0.m g(Ef.L l10) {
        return com.moloco.sdk.internal.publisher.H.Y(new com.unity3d.services.core.webview.b(l10, 2));
    }

    public static void h(Class cls, Object obj) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static byte[] j(int i5, ArrayDeque arrayDeque) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i5) {
            return bArr;
        }
        int length = i5 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i5);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i5 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final C3179k k(Context context, Class cls, String str) {
        if (Bf.k.y0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new C3179k(context, cls, str);
    }

    public static s9.m l(String str) {
        List list;
        int length = str.length();
        A6.c.z(length >= 2, "Invalid path \"%s\"", str);
        if (length == 2) {
            A6.c.z(str.charAt(0) == 1 && str.charAt(1) == 1, "Non-empty path \"%s\" had length 2", str);
            list = Collections.EMPTY_LIST;
        } else {
            int length2 = str.length() - 2;
            ArrayList arrayList = new ArrayList();
            StringBuilder sb2 = new StringBuilder();
            int i5 = 0;
            while (i5 < length) {
                int iIndexOf = str.indexOf(1, i5);
                if (iIndexOf < 0 || iIndexOf > length2) {
                    throw new IllegalArgumentException(AbstractC0279p0.l("Invalid encoded resource path: \"", str, "\""));
                }
                int i10 = iIndexOf + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt == 1) {
                    String strSubstring = str.substring(i5, iIndexOf);
                    if (sb2.length() != 0) {
                        sb2.append(strSubstring);
                        strSubstring = sb2.toString();
                        sb2.setLength(0);
                    }
                    arrayList.add(strSubstring);
                } else if (cCharAt == 16) {
                    sb2.append(str.substring(i5, iIndexOf));
                    sb2.append((char) 0);
                } else {
                    if (cCharAt != 17) {
                        throw new IllegalArgumentException(AbstractC0279p0.l("Invalid encoded resource path: \"", str, "\""));
                    }
                    sb2.append(str.substring(i5, i10));
                }
                i5 = iIndexOf + 2;
            }
            list = arrayList;
        }
        s9.m mVar = s9.m.f45388b;
        return list.isEmpty() ? s9.m.f45388b : new s9.m(list);
    }

    public static final Z.k m(Z.k kVar, tf.l onDraw) {
        AbstractC3340k.e(kVar, "<this>");
        AbstractC3340k.e(onDraw, "onDraw");
        return kVar.g(new b0.c(onDraw));
    }

    public static String n(s9.e eVar) {
        StringBuilder sb2 = new StringBuilder();
        int size = eVar.f45369a.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (sb2.length() > 0) {
                sb2.append((char) 1);
                sb2.append((char) 1);
            }
            String strG = eVar.g(i5);
            int length = strG.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = strG.charAt(i10);
                if (cCharAt == 0) {
                    sb2.append((char) 1);
                    sb2.append((char) 16);
                } else if (cCharAt != 1) {
                    sb2.append(cCharAt);
                } else {
                    sb2.append((char) 1);
                    sb2.append((char) 17);
                }
            }
        }
        sb2.append((char) 1);
        sb2.append((char) 1);
        return sb2.toString();
    }

    public static int o(Context context, float f10) {
        AbstractC3340k.e(context, "context");
        return (int) ((f10 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void p(p8.p pVar) {
        Fe.e.y(pVar.isDone(), "Future was expected to be done: %s", pVar);
        boolean z2 = false;
        while (true) {
            try {
                pVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    public static Drawable q(Context context, Context context2, int i5, Resources.Theme theme) {
        Context context3;
        try {
            if (f39406f) {
                if (theme != null) {
                    C3623d c3623d = new C3623d(context2);
                    c3623d.f41184b = theme;
                    context3 = c3623d;
                } else {
                    context3 = context2;
                }
                return Fe.g.B(context3, i5);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e7) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e7;
            }
            return Y0.e.getDrawable(context2, i5);
        } catch (NoClassDefFoundError unused2) {
            f39406f = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = a1.l.f17132a;
        return resources.getDrawable(i5, theme);
    }

    public static int r(F4.f fVar, InputStream inputStream, ArrayList arrayList) throws IOException {
        if (inputStream != null) {
            if (!inputStream.markSupported()) {
                inputStream = new L4.t(inputStream, fVar);
            }
            inputStream.mark(5242880);
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                try {
                    int iA = ((B4.c) arrayList.get(i5)).a(inputStream, fVar);
                    if (iA != -1) {
                        return iA;
                    }
                } finally {
                    inputStream.reset();
                }
            }
        }
        return -1;
    }

    public static F6.r s() {
        F6.r rVarD;
        F6.r rVar = f39403c;
        if (rVar != null) {
            return rVar;
        }
        synchronized (AbstractC3230e0.class) {
            try {
                rVarD = f39403c;
                if (rVarD == null) {
                    M.y yVarD = F6.r.d();
                    yVarD.f7229d = md.c0.f40629b;
                    yVarD.f7230e = F6.r.a("google.firestore.v1.Firestore", "RunAggregationQuery");
                    yVarD.f7226a = true;
                    C3276v0 c3276v0D = C3276v0.d();
                    ExtensionRegistryLite extensionRegistryLite = td.c.f46039a;
                    yVarD.f7227b = new td.b(c3276v0D);
                    yVarD.f7228c = new td.b(C3282y0.b());
                    rVarD = yVarD.d();
                    f39403c = rVarD;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVarD;
    }

    public static ImageHeaderParser$ImageType t(F4.f fVar, InputStream inputStream, ArrayList arrayList) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new L4.t(inputStream, fVar);
        }
        inputStream.mark(5242880);
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            try {
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeC = ((B4.c) arrayList.get(i5)).c(inputStream);
                inputStream.reset();
                if (imageHeaderParser$ImageTypeC != ImageHeaderParser$ImageType.UNKNOWN) {
                    return imageHeaderParser$ImageTypeC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static C0672f u(String str) throws Ya.a {
        List list;
        C2527k c2527k;
        if (Bf.k.y0(str)) {
            return C0672f.f6051f;
        }
        InterfaceC2525i interfaceC2525iY = Fe.c.y(EnumC2526j.f34669c, new C0352u(2));
        int i5 = 0;
        while (true) {
            int iS0 = Bf.k.s0(str);
            list = ff.v.f35432a;
            if (i5 > iS0) {
                break;
            }
            InterfaceC2525i interfaceC2525iY2 = Fe.c.y(EnumC2526j.f34669c, new C0352u(3));
            Integer numValueOf = null;
            int i10 = i5;
            while (true) {
                if (i10 <= Bf.k.s0(str)) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt == ',') {
                        ArrayList arrayList = (ArrayList) interfaceC2525iY.getValue();
                        String strO = AbstractC3935e.O(i5, numValueOf != null ? numValueOf.intValue() : i10, str);
                        if (interfaceC2525iY2.isInitialized()) {
                            list = (List) interfaceC2525iY2.getValue();
                        }
                        arrayList.add(new C0675i(strO, list));
                        i10++;
                    } else if (cCharAt != ';') {
                        i10++;
                    } else {
                        if (numValueOf == null) {
                            numValueOf = Integer.valueOf(i10);
                        }
                        int i11 = i10 + 1;
                        int i12 = i11;
                        while (i12 <= Bf.k.s0(str)) {
                            char cCharAt2 = str.charAt(i12);
                            if (cCharAt2 == ',' || cCharAt2 == ';') {
                                AbstractC3935e.J(interfaceC2525iY2, str, i11, i12, "");
                                break;
                            }
                            if (cCharAt2 != '=') {
                                i12++;
                            } else {
                                int i13 = i12 + 1;
                                if (str.length() == i13) {
                                    c2527k = new C2527k(Integer.valueOf(i13), "");
                                } else {
                                    char c10 = '\"';
                                    if (str.charAt(i13) == '\"') {
                                        int i14 = i12 + 2;
                                        StringBuilder sb2 = new StringBuilder();
                                        while (i14 <= Bf.k.s0(str)) {
                                            char cCharAt3 = str.charAt(i14);
                                            if (cCharAt3 == c10) {
                                                int i15 = i14 + 1;
                                                int i16 = i15;
                                                while (i16 < str.length() && str.charAt(i16) == ' ') {
                                                    i16++;
                                                }
                                                if (i16 == str.length() || str.charAt(i16) == ';' || str.charAt(i16) == ',') {
                                                    c2527k = new C2527k(Integer.valueOf(i15), sb2.toString());
                                                    break;
                                                }
                                            }
                                            if (cCharAt3 != '\\' || i14 >= Bf.k.s0(str) - 2) {
                                                sb2.append(cCharAt3);
                                                i14++;
                                            } else {
                                                sb2.append(str.charAt(i14 + 1));
                                                i14 += 2;
                                            }
                                            c10 = '\"';
                                        }
                                        Integer numValueOf2 = Integer.valueOf(i14);
                                        String string = sb2.toString();
                                        AbstractC3340k.d(string, "toString(...)");
                                        c2527k = new C2527k(numValueOf2, "\"".concat(string));
                                    } else {
                                        int i17 = i13;
                                        while (i17 <= Bf.k.s0(str)) {
                                            char cCharAt4 = str.charAt(i17);
                                            if (cCharAt4 == ',' || cCharAt4 == ';') {
                                                c2527k = new C2527k(Integer.valueOf(i17), AbstractC3935e.O(i13, i17, str));
                                                break;
                                            }
                                            i17++;
                                        }
                                        c2527k = new C2527k(Integer.valueOf(i17), AbstractC3935e.O(i13, i17, str));
                                    }
                                }
                                int iIntValue = ((Number) c2527k.f34671a).intValue();
                                AbstractC3935e.J(interfaceC2525iY2, str, i11, i12, (String) c2527k.f34672b);
                                i10 = iIntValue;
                            }
                        }
                        AbstractC3935e.J(interfaceC2525iY2, str, i11, i12, "");
                        i10 = i12;
                    }
                } else {
                    ArrayList arrayList2 = (ArrayList) interfaceC2525iY.getValue();
                    String strO2 = AbstractC3935e.O(i5, numValueOf != null ? numValueOf.intValue() : i10, str);
                    if (interfaceC2525iY2.isInitialized()) {
                        list = (List) interfaceC2525iY2.getValue();
                    }
                    arrayList2.add(new C0675i(strO2, list));
                }
            }
            i5 = i10;
        }
        if (interfaceC2525iY.isInitialized()) {
            list = (List) interfaceC2525iY.getValue();
        }
        C0675i c0675i = (C0675i) ff.o.y0(list);
        String str2 = c0675i.f6056a;
        int iV0 = Bf.k.v0(str2, '/', 0, 6);
        if (iV0 == -1) {
            if (AbstractC3340k.a(Bf.k.V0(str2).toString(), "*")) {
                return C0672f.f6051f;
            }
            throw new Ya.a("Bad Content-Type format: ".concat(str));
        }
        String strSubstring = str2.substring(0, iV0);
        AbstractC3340k.d(strSubstring, "substring(...)");
        String string2 = Bf.k.V0(strSubstring).toString();
        if (string2.length() == 0) {
            throw new Ya.a("Bad Content-Type format: ".concat(str));
        }
        String strSubstring2 = str2.substring(iV0 + 1);
        AbstractC3340k.d(strSubstring2, "substring(...)");
        String string3 = Bf.k.V0(strSubstring2).toString();
        if (Bf.k.o0(string2, ' ') || Bf.k.o0(string3, ' ')) {
            throw new Ya.a("Bad Content-Type format: ".concat(str));
        }
        if (string3.length() == 0 || Bf.k.o0(string3, '/')) {
            throw new Ya.a("Bad Content-Type format: ".concat(str));
        }
        return new C0672f(string2, string3, c0675i.f6057b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(xd.C4511c r4, lf.AbstractC3464c r5) {
        /*
            boolean r0 = r5 instanceof xd.d
            if (r0 == 0) goto L13
            r0 = r5
            xd.d r0 = (xd.d) r0
            int r1 = r0.f47890c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f47890c = r1
            goto L18
        L13:
            xd.d r0 = new xd.d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f47889b
            kf.a r1 = kf.a.f39711a
            int r2 = r0.f47890c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            xd.c r4 = r0.f47888a
            Fe.e.U(r5)
            goto L47
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            Fe.e.U(r5)
            Gd.a r5 = r4.e()
            io.ktor.utils.io.t r5 = r5.d()
            r0.f47888a = r4
            r0.f47890c = r3
            java.lang.Object r5 = io.ktor.utils.io.N.m(r5, r0)
            if (r5 != r1) goto L47
            return r1
        L47:
            Pf.i r5 = (Pf.i) r5
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r5, r0)
            r0 = -1
            byte[] r5 = Pf.j.f(r5, r0)
            xd.e r0 = new xd.e
            wd.c r1 = r4.f47885a
            Fd.b r2 = r4.d()
            Gd.a r4 = r4.e()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.AbstractC3230e0.w(xd.c, lf.c):java.lang.Object");
    }

    public static void x(InterfaceC4269f binaryMessenger, final kd.r rVar) {
        C8.i iVar;
        AbstractC3340k.e(binaryMessenger, "binaryMessenger");
        InterfaceC4277n c3306b = (rVar == null || (iVar = rVar.f39692a) == null) ? new C3306b() : iVar.q();
        Object obj = null;
        X7 x72 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.instance");
        if (rVar != null) {
            final int i5 = 0;
            x72.n(new InterfaceC4265b() { // from class: kd.z
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    r rVar2 = rVar;
                    switch (i5) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                C8.i iVar2 = rVar2.f39692a;
                                ((C3308d) iVar2.f1941d).a(jLongValue, (C3321q) iVar2.f1943f);
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            return;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C3321q c3321q = (C3321q) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                rVar2.getClass();
                                try {
                                    String[] list2 = c3321q.f39690a.list(str);
                                    listD2 = AbstractC3935e.C(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            return;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C3321q c3321q2 = (C3321q) obj6;
                            Object obj7 = list3.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                rVar2.getClass();
                                listD3 = AbstractC3935e.C(((C3665d) c3321q2.f39691b.f26356b).b(str2));
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            return;
                    }
                }
            });
        } else {
            x72.n(null);
        }
        X7 x73 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.list");
        if (rVar != null) {
            final int i10 = 1;
            x73.n(new InterfaceC4265b() { // from class: kd.z
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    r rVar2 = rVar;
                    switch (i10) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                C8.i iVar2 = rVar2.f39692a;
                                ((C3308d) iVar2.f1941d).a(jLongValue, (C3321q) iVar2.f1943f);
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            return;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C3321q c3321q = (C3321q) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                rVar2.getClass();
                                try {
                                    String[] list2 = c3321q.f39690a.list(str);
                                    listD2 = AbstractC3935e.C(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            return;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C3321q c3321q2 = (C3321q) obj6;
                            Object obj7 = list3.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                rVar2.getClass();
                                listD3 = AbstractC3935e.C(((C3665d) c3321q2.f39691b.f26356b).b(str2));
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            return;
                    }
                }
            });
        } else {
            x73.n(null);
        }
        X7 x74 = new X7(binaryMessenger, c3306b, obj, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManager.getAssetFilePathByName");
        if (rVar == null) {
            x74.n(null);
        } else {
            final int i11 = 2;
            x74.n(new InterfaceC4265b() { // from class: kd.z
                @Override // uc.InterfaceC4265b
                public final void e(Object obj2, C1521a c1521a) {
                    List listD;
                    List listD2;
                    List listD3;
                    r rVar2 = rVar;
                    switch (i11) {
                        case 0:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj3 = ((List) obj2).get(0);
                            AbstractC3340k.c(obj3, "null cannot be cast to non-null type kotlin.Long");
                            long jLongValue = ((Long) obj3).longValue();
                            try {
                                C8.i iVar2 = rVar2.f39692a;
                                ((C3308d) iVar2.f1941d).a(jLongValue, (C3321q) iVar2.f1943f);
                                listD = AbstractC3935e.C(null);
                            } catch (Throwable th) {
                                if (th instanceof C3305a) {
                                    C3305a c3305a = th;
                                    listD = AbstractC3935e.D(c3305a.f39637a, c3305a.f39638b, c3305a.f39639c);
                                } else {
                                    listD = AbstractC3935e.D(th.getClass().getSimpleName(), th.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th), th.getCause()));
                                }
                            }
                            c1521a.c(listD);
                            return;
                        case 1:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj2;
                            Object obj4 = list.get(0);
                            AbstractC3340k.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C3321q c3321q = (C3321q) obj4;
                            Object obj5 = list.get(1);
                            AbstractC3340k.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str = (String) obj5;
                            try {
                                rVar2.getClass();
                                try {
                                    String[] list2 = c3321q.f39690a.list(str);
                                    listD2 = AbstractC3935e.C(list2 == null ? new ArrayList() : Arrays.asList(list2));
                                } catch (IOException e7) {
                                    throw new RuntimeException(e7.getMessage());
                                }
                            } catch (Throwable th2) {
                                if (th2 instanceof C3305a) {
                                    C3305a c3305a2 = th2;
                                    listD2 = AbstractC3935e.D(c3305a2.f39637a, c3305a2.f39638b, c3305a2.f39639c);
                                } else {
                                    listD2 = AbstractC3935e.D(th2.getClass().getSimpleName(), th2.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th2), th2.getCause()));
                                }
                            }
                            c1521a.c(listD2);
                            return;
                        default:
                            AbstractC3340k.c(obj2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list3 = (List) obj2;
                            Object obj6 = list3.get(0);
                            AbstractC3340k.c(obj6, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.FlutterAssetManager");
                            C3321q c3321q2 = (C3321q) obj6;
                            Object obj7 = list3.get(1);
                            AbstractC3340k.c(obj7, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj7;
                            try {
                                rVar2.getClass();
                                listD3 = AbstractC3935e.C(((C3665d) c3321q2.f39691b.f26356b).b(str2));
                            } catch (Throwable th3) {
                                if (th3 instanceof C3305a) {
                                    C3305a c3305a3 = th3;
                                    listD3 = AbstractC3935e.D(c3305a3.f39637a, c3305a3.f39638b, c3305a3.f39639c);
                                } else {
                                    listD3 = AbstractC3935e.D(th3.getClass().getSimpleName(), th3.toString(), M6.q("Cause: ", ", Stacktrace: ", Log.getStackTraceString(th3), th3.getCause()));
                                }
                            }
                            c1521a.c(listD3);
                            return;
                    }
                }
            });
        }
    }

    public static byte[] y(C1233d c1233d) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(Segment.SIZE, Math.max(128, Integer.highestOneBit(0) * 2));
        int i5 = 0;
        while (i5 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i5);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i10 = 0;
            while (i10 < iMin2) {
                int i11 = c1233d.read(bArr, i10, iMin2 - i10);
                if (i11 == -1) {
                    return j(i5, arrayDeque);
                }
                i10 += i11;
                i5 += i11;
            }
            long j8 = iMin * (iMin < 4096 ? 4 : 2);
            iMin = j8 > 2147483647L ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : j8 < -2147483648L ? Integer.MIN_VALUE : (int) j8;
        }
        if (c1233d.read() == -1) {
            return j(2147483639, arrayDeque);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final void z(Gf.w wVar, VolumeSettingsChange volumeSettingsChange) {
        Object objC = wVar.c(volumeSettingsChange);
        if (!(objC instanceof Gf.k)) {
        } else {
            Object obj = ((Gf.l) Ef.H.I(C3109i.f38759a, new Gf.n(wVar, volumeSettingsChange, null))).f4827a;
        }
    }

    public abstract void v(String str);
}
