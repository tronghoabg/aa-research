package Va;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: Va.ha, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0999ha implements InterfaceC1026jb {

    /* renamed from: c, reason: collision with root package name */
    public static C0999ha f14259c = null;

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f14260d = {14, 11, 44, -42, -15, 29, -5, 38, -41, -16, 112, 124, -116, 116, -114, -127, -100, 80, 113, -99, 123, -90, 87, 112, 14, -65, 69, -69, 67, -77, -72, -81, 107, 76, -96, 70, -101, 100, -78, -99, 0, 0, 0};

    /* renamed from: e, reason: collision with root package name */
    public static int f14261e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f14262f = 1;

    /* renamed from: a, reason: collision with root package name */
    public Object f14263a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14264b;

    public /* synthetic */ C0999ha(Object obj, Object obj2) {
        this.f14264b = obj;
        this.f14263a = obj2;
    }

    public static synchronized void e() {
        f14259c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[EDGE_INSN: B:63:0x007c->B:25:0x007c BREAK  A[LOOP:1: B:37:0x0098->B:42:0x00ad], PHI: r0
  0x007c: PHI (r0v2 int) = (r0v1 int), (r0v1 int), (r0v1 int), (r0v1 int), (r0v4 int), (r0v1 int), (r0v1 int), (r0v1 int) binds: [B:19:0x0064, B:21:0x006d, B:24:0x007a, B:50:0x00ce, B:53:0x00d3, B:34:0x0094, B:63:0x007c, B:29:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[PHI: r0
  0x007c: PHI (r0v2 int) = (r0v1 int), (r0v1 int), (r0v1 int), (r0v1 int), (r0v4 int), (r0v1 int), (r0v1 int), (r0v1 int) binds: [B:19:0x0064, B:21:0x006d, B:24:0x007a, B:50:0x00ce, B:53:0x00d3, B:34:0x0094, B:63:0x007c, B:29:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(java.lang.Class r8, Va.C1012ia r9, java.util.ArrayList r10) {
        /*
            int r0 = r9.f14290O
            boolean r1 = r9.f14070K
            r2 = 0
            if (r1 == 0) goto L45
            int r3 = r9.L
            java.lang.reflect.Method[] r4 = new java.lang.reflect.Method[r2]
            if (r8 == 0) goto L40
            java.lang.reflect.Method[] r4 = r8.getDeclaredMethods()
            java.lang.reflect.Method[] r5 = r8.getMethods()
            java.lang.reflect.Method[] r4 = Va.AbstractC1168ub.l(r4, r5)
            if (r1 != 0) goto L20
            java.util.List r8 = java.util.Arrays.asList(r4)
            goto L4d
        L20:
            java.lang.Class r8 = r8.getSuperclass()
            r1 = r2
        L25:
            if (r8 == 0) goto L40
            if (r1 == r3) goto L40
            java.lang.reflect.Method[] r5 = r8.getDeclaredMethods()
            java.lang.reflect.Method[] r4 = Va.AbstractC1168ub.l(r4, r5)
            java.lang.reflect.Method[] r5 = r8.getMethods()
            java.lang.reflect.Method[] r4 = Va.AbstractC1168ub.l(r4, r5)
            java.lang.Class r8 = r8.getSuperclass()
            int r1 = r1 + 1
            goto L25
        L40:
            java.util.List r8 = java.util.Arrays.asList(r4)
            goto L4d
        L45:
            java.lang.reflect.Method[] r8 = r8.getDeclaredMethods()
            java.util.List r8 = java.util.Arrays.asList(r8)
        L4d:
            java.util.Iterator r8 = r8.iterator()
        L51:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Ldd
            java.lang.Object r1 = r8.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            int r3 = r1.getModifiers()
            int r4 = r9.f14071M
            r3 = r3 & r4
            if (r3 != r4) goto L7c
            int r3 = r1.getModifiers()
            int r4 = r9.f14072N
            r3 = r3 & r4
            if (r3 == 0) goto L70
            goto L7c
        L70:
            java.util.ArrayList r3 = r9.f14293R
            java.lang.Class r4 = r1.getReturnType()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L7e
        L7c:
            r4 = r2
            goto Ld6
        L7e:
            java.lang.Class[] r3 = r1.getParameterTypes()
            int r4 = r9.f14295T
            r5 = -1
            if (r4 == r5) goto L8b
            int r5 = r3.length
            if (r4 == r5) goto L8b
            goto L7c
        L8b:
            java.util.List r4 = r9.f14294S
            if (r4 == 0) goto Lb0
            int r5 = r4.size()
            int r6 = r3.length
            if (r5 == r6) goto L97
            goto L7c
        L97:
            r5 = r2
        L98:
            int r6 = r4.size()
            if (r5 >= r6) goto Lb0
            java.lang.Object r6 = r4.get(r5)
            java.lang.Class r6 = (java.lang.Class) r6
            r7 = r3[r5]
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto Lad
            goto L7c
        Lad:
            int r5 = r5 + 1
            goto L98
        Lb0:
            java.lang.Class r3 = r9.f14291P
            r4 = 1
            if (r3 == 0) goto Lcd
            boolean r5 = r9.f14292Q
            if (r5 == 0) goto Lc4
            java.lang.Class r3 = r1.getReturnType()
            java.lang.Class r5 = r9.f14291P
            boolean r3 = r3.equals(r5)
            goto Lce
        Lc4:
            java.lang.Class r5 = r1.getReturnType()
            boolean r3 = r3.isAssignableFrom(r5)
            goto Lce
        Lcd:
            r3 = r4
        Lce:
            if (r3 == 0) goto L7c
            if (r0 != 0) goto Ld3
            goto Ld6
        Ld3:
            int r0 = r0 + (-1)
            goto L7c
        Ld6:
            if (r4 == 0) goto L51
            r10.add(r1)
            goto L51
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0999ha.h(java.lang.Class, Va.ia, java.util.ArrayList):void");
    }

    public static synchronized C0999ha j() {
        try {
            if (f14259c == null) {
                C0999ha c0999ha = new C0999ha();
                c0999ha.f14263a = new C0921ba();
                C1051la c1051la = new C1051la();
                C1051la.m(127 - (ViewConfiguration.getLongPressTimeout() >> 16), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
                c1051la.f14368a = new HashMap();
                c0999ha.f14264b = c1051la;
                f14259c = c0999ha;
            }
        } catch (Throwable th) {
            throw th;
        }
        return f14259c;
    }

    public static String l(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 95;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14260d[(-1315880136) + i11] + 95);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 1315880138) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 - 187770579);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14260d;
                        int i14 = AbstractC1104pb.f14486F;
                        AbstractC1104pb.f14486F = i14 - 1;
                        char c11 = (char) (AbstractC1104pb.f14489I + (((byte) (bArr[i14] + s10)) ^ AbstractC1104pb.f14487G));
                        AbstractC1104pb.f14488H = c11;
                        sb2.append(c11);
                        AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                        AbstractC1104pb.f14485E++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    @Override // Va.InterfaceC1026jb
    public void a(Activity activity) {
        f14261e = (f14262f + 111) % 128;
        short capsMode = (short) TextUtils.getCapsMode("", 0, 0);
        i(l(187770690 - (ViewConfiguration.getScrollBarSize() >> 8), (-84) - TextUtils.indexOf("", "", 0), (byte) (14 - TextUtils.indexOf((CharSequence) "", '0')), capsMode, 1315880135 - MotionEvent.axisFromString("")).intern(), activity, (ArrayList) this.f14263a);
        int i5 = f14261e + 79;
        f14262f = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 42 / 0;
        }
    }

    public String b() {
        C0984g8 c0984g8 = (C0984g8) this.f14263a;
        c0984g8.getClass();
        C0984g8.f14189j = (C0984g8.f14188i + 97) % 128;
        return c0984g8.f14190a;
    }

    public boolean c(C1077na c1077na, C1203x8 c1203x8, C1214y7 c1214y7, List list) {
        A7.B0 b02 = (A7.B0) this.f14263a;
        if (b02 != null && !b02.d0(c1077na)) {
            return false;
        }
        if (((C1126r8) this.f14264b) == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(0, c1077na);
        return ((C1126r8) this.f14264b).c(c1203x8, c1214y7, arrayList).e();
    }

    @Override // Va.InterfaceC1026jb
    public void d(Activity activity) {
        f14262f = (f14261e + 55) % 128;
        short sResolveSizeAndState = (short) View.resolveSizeAndState(0, 0, 0);
        i(l((ViewConfiguration.getJumpTapTimeout() >> 16) + 187770690, (-79) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (byte) ((-113) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), sResolveSizeAndState, (ViewConfiguration.getScrollBarSize() >> 8) + 1315880146).intern(), activity, (ArrayList) this.f14263a);
        f14262f = (f14261e + 31) % 128;
    }

    public C1126r8 f(String str) {
        C1126r8 c1126r8;
        C0999ha c0999ha = this;
        do {
            C0984g8 c0984g8 = (C0984g8) c0999ha.f14263a;
            c0984g8.getClass();
            C0984g8.f14189j = (C0984g8.f14188i + 23) % 128;
            c1126r8 = (C1126r8) c0984g8.f14196g.get(str);
            if (c1126r8 != null) {
                break;
            }
            c0999ha = (C0999ha) c0999ha.f14264b;
        } while (c0999ha != null);
        return c1126r8;
    }

    public ArrayList g() {
        C0984g8 c0984g8 = (C0984g8) this.f14263a;
        int i5 = (C0984g8.f14188i + 89) % 128;
        C0984g8.f14189j = i5;
        int i10 = i5 + 97;
        C0984g8.f14188i = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        ArrayList arrayList = new ArrayList(c0984g8.f14193d);
        C0999ha c0999ha = (C0999ha) this.f14264b;
        if (c0999ha != null) {
            arrayList.addAll(c0999ha.g());
        }
        return arrayList;
    }

    public void i(String str, Activity activity, ArrayList arrayList) {
        f14262f = (f14261e + 13) % 128;
        if (C1214y7.k(activity, arrayList)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l(187770644 - (ViewConfiguration.getFadingEdgeLength() >> 16), View.combineMeasuredStates(0, 0) - 78, (byte) (Color.blue(0) - 78), (short) View.MeasureSpec.getSize(0), 1315880160 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            sb2.append(str);
            String string = sb2.toString();
            C1214y7.s((C1214y7) this.f14264b, string, true, false, Collections.singletonList(activity));
            Da da2 = new Da(10);
            da2.f13291f = this;
            da2.f13289d = string;
            da2.f13290e = activity;
            Cb.j(da2);
            f14262f = (f14261e + 29) % 128;
        }
    }

    public C1052lb k() {
        JSONObject jSONObject = (JSONObject) this.f14263a;
        String str = (String) this.f14264b;
        AbstractC1104pb.f14500j = (AbstractC1104pb.k + 105) % 128;
        try {
            HttpURLConnection httpURLConnectionG = AbstractC1104pb.g(str);
            byte[] bArrP0 = AbstractC1104pb.p0(httpURLConnectionG, jSONObject);
            long jS = AbstractC1104pb.S();
            httpURLConnectionG.connect();
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnectionG.getOutputStream());
            dataOutputStream.write(bArrP0);
            dataOutputStream.flush();
            AbstractC1104pb.b0(dataOutputStream);
            int i5 = AbstractC1104pb.f14500j + 79;
            AbstractC1104pb.k = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            String strF = AbstractC1104pb.f(httpURLConnectionG);
            int responseCode = httpURLConnectionG.getResponseCode();
            String responseMessage = httpURLConnectionG.getResponseMessage();
            if (responseCode >= 400) {
                int i10 = AbstractC1104pb.k + 75;
                AbstractC1104pb.f14500j = i10 % 128;
                if (i10 % 2 != 0) {
                    httpURLConnectionG.disconnect();
                    throw null;
                }
                httpURLConnectionG.disconnect();
            }
            return new C1052lb(AbstractC1104pb.S() - jS, strF, responseMessage, responseCode);
        } catch (Throwable th) {
            String strIntern = AbstractC1104pb.p(Color.green(0) + 8, new int[]{-1105117575, -117190742, -749102689, -168875190}).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC1104pb.p(ImageFormat.getBitsPerPixel(0) + 29, new int[]{1344010352, 851014278, -392582271, 1445729723, -494616156, -1722518642, -200229056, 1173463651, -426848904, -1027675916, -2127600604, -1097679383, -1823480511, -948758980}).intern());
            sb2.append(th.getLocalizedMessage());
            Ab.R(strIntern, sb2.toString(), th);
            return null;
        }
    }

    public ArrayList m() {
        C0984g8 c0984g8 = (C0984g8) this.f14263a;
        int i5 = C0984g8.f14189j + 41;
        C0984g8.f14188i = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        ArrayList arrayList = new ArrayList(c0984g8.f14194e);
        C0999ha c0999ha = (C0999ha) this.f14264b;
        if (c0999ha != null) {
            arrayList.addAll(c0999ha.m());
        }
        return arrayList;
    }
}
