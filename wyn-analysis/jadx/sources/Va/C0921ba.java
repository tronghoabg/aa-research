package Va;

import A.C0230x;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* renamed from: Va.ba, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0921ba {

    /* renamed from: f, reason: collision with root package name */
    public static int f14039f = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f14041h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static int f14042i = 1;

    /* renamed from: a, reason: collision with root package name */
    public Object f14043a;

    /* renamed from: b, reason: collision with root package name */
    public Object f14044b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14045c;

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f14038e = {1, 21, -22, 1, -1, 22, -38, 14, 4, -19, 11, 7, 12, 1, 3, -18, -10, 13, 0, -7, -11, 11, -12, 11, -14, 18, 3, -14, 14, 4, 18, -84, 6, 9, -8, -1, -1, -3, 9, -13, 8, 9, 69, -68, -5, -3, 11, -21, 8, 37, 75, 4, -69, 3, -5, 19, -2, -16, -2, 15, 4, 19, -4, 14, 4, 19, -62, 3, -11, -1, 71, -57, -7, 5, -3, 0, 3, 7, 52, -51, -11, -1, -2, 0, -4, 69, -63, -2, 12, 17, -80, 20, -6, 75, -82, 3, 79, -65, -19, 19, -3, 68, -68, -5, -3, 11, -21, 8, 5, 65, 8, -68, -10, -7, 6, 9, 70, -84, 5, 1, 78, -82, 13, 1, 3, -4, 29, 0, 0, 0, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f14037d = {16, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* renamed from: g, reason: collision with root package name */
    public static int f14040g = 59;

    public static /* synthetic */ HashMap b(C0921ba c0921ba) {
        int i5 = (f14041h + 87) % 128;
        f14042i = i5;
        HashMap map = (HashMap) c0921ba.f14044b;
        int i10 = i5 + 99;
        f14041h = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 54 / 0;
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.Class r8, A.C0230x r9, java.util.ArrayList r10) throws java.lang.SecurityException {
        /*
            java.lang.Object r0 = r9.f188c
            Va.ea r0 = (Va.C0960ea) r0
            if (r0 == 0) goto L12
            boolean r1 = r0.f14070K
            if (r1 == 0) goto L12
            int r0 = r0.L
            r2 = 0
            java.lang.reflect.Field[] r8 = i(r8, r1, r0, r2)
            goto L1b
        L12:
            java.lang.reflect.Field[] r8 = r8.getDeclaredFields()     // Catch: java.lang.Error -> L17
            goto L1b
        L17:
            java.lang.reflect.Field[] r8 = r8.getFields()
        L1b:
            int r0 = r8.length
            r1 = 0
            r2 = r1
        L1e:
            if (r2 >= r0) goto L8a
            r3 = r8[r2]
            java.lang.Object r4 = r9.f188c
            Va.ea r4 = (Va.C0960ea) r4
            r5 = 1
            if (r4 == 0) goto L7e
            int r4 = r3.getModifiers()
            java.lang.Object r6 = r9.f188c
            Va.ea r6 = (Va.C0960ea) r6
            int r6 = r6.f14071M
            r4 = r4 & r6
            if (r4 != r6) goto L7e
            int r4 = r3.getModifiers()
            java.lang.Object r6 = r9.f188c
            Va.ea r6 = (Va.C0960ea) r6
            int r7 = r6.f14072N
            r4 = r4 & r7
            if (r4 == 0) goto L44
            goto L7e
        L44:
            java.util.ArrayList r4 = r6.f14143R
            java.lang.Class r6 = r3.getType()
            boolean r4 = r4.contains(r6)
            if (r4 == 0) goto L51
            goto L7e
        L51:
            java.lang.Object r4 = r9.f188c
            Va.ea r4 = (Va.C0960ea) r4
            boolean r6 = r4.f14142Q
            if (r6 == 0) goto L68
            java.lang.Class r4 = r3.getType()
            java.lang.Object r6 = r9.f188c
            Va.ea r6 = (Va.C0960ea) r6
            java.lang.Class r6 = r6.f14140O
            boolean r4 = r4.equals(r6)
            goto L72
        L68:
            java.lang.Class r4 = r4.f14140O
            java.lang.Class r6 = r3.getType()
            boolean r4 = r4.isAssignableFrom(r6)
        L72:
            if (r4 == 0) goto L7e
            int r4 = r9.f187b
            if (r4 != 0) goto L7a
            r4 = r5
            goto L7f
        L7a:
            int r4 = r4 + (-1)
            r9.f187b = r4
        L7e:
            r4 = r1
        L7f:
            if (r4 == 0) goto L87
            r3.setAccessible(r5)
            r10.add(r3)
        L87:
            int r2 = r2 + 1
            goto L1e
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0921ba.c(java.lang.Class, A.x, java.util.ArrayList):void");
    }

    public static String f(JSONObject jSONObject) {
        f14042i = (f14041h + 113) % 128;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jSONObject.optString(n(14 - Drawable.resolveOpacity(0, 0), "味쥢ꃏ䠙뜋\ud972抩\udc58襣噪滖掱귇㨃").intern()));
        sb2.append(n(1 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "䙺솢").intern());
        sb2.append(jSONObject.optString(n(14 - View.MeasureSpec.makeMeasureSpec(0, 0), "ﭬ턚噟㛳낚쫑嚝揗㙯檣볚쾮㟇ચ").intern()));
        sb2.append(jSONObject.optString(n(View.MeasureSpec.getMode(0) + 13, "嚝揗ﺹ쾡ּ脳神㺱䮆蕚䘋쎛詰뽬").intern()));
        sb2.append(jSONObject.optString(n(14 - TextUtils.lastIndexOf("", '0', 0), "ﭬ턚㎆㬸ﺹ쾡ּ脳神㺱䮆蕚䘋쎛詰뽬").intern()));
        String string = sb2.toString();
        int i5 = f14041h + 101;
        int i10 = i5 % 128;
        f14042i = i10;
        if (i5 % 2 == 0) {
            int i11 = 63 / 0;
        }
        int i12 = i10 + 113;
        f14041h = i12 % 128;
        if (i12 % 2 == 0) {
            return string;
        }
        throw null;
    }

    public static Field[] i(Class cls, boolean z2, int i5, List list) throws SecurityException {
        while (cls != null && !AbstractC1168ub.g(cls, list)) {
            cls = cls.getSuperclass();
        }
        Field[] fieldArrF = new Field[0];
        if (cls != null) {
            Field[] declaredFields = new Field[0];
            Field[] fields = new Field[0];
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Error unused) {
            }
            try {
                fields = cls.getFields();
            } catch (Error unused2) {
            }
            fieldArrF = AbstractC1168ub.f(declaredFields, fields);
            if (!z2) {
                return fieldArrF;
            }
            Class superclass = cls.getSuperclass();
            for (int i10 = 0; superclass != null && i10 != i5; i10++) {
                try {
                    fieldArrF = AbstractC1168ub.f(fieldArrF, superclass.getDeclaredFields());
                } catch (Error unused3) {
                }
                try {
                    fieldArrF = AbstractC1168ub.f(fieldArrF, superclass.getFields());
                } catch (Error unused4) {
                }
                superclass = superclass.getSuperclass();
            }
        }
        return fieldArrF;
    }

    public static String l(String str, int i5) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 52663)) ^ ((c11 >>> 5) + 55432)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 42307) ^ ((c12 + i11) ^ ((c12 << 4) + 2643))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static /* synthetic */ HashMap m(C0921ba c0921ba) {
        int i5 = f14042i;
        f14041h = (i5 + 63) % 128;
        HashMap map = (HashMap) c0921ba.f14043a;
        int i10 = i5 + 21;
        f14041h = i10 % 128;
        if (i10 % 2 == 0) {
            return map;
        }
        throw null;
    }

    public static String n(int i5, String str) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13198F) {
            try {
                char[] cArr = new char[charArray.length];
                Ab.f13197E = 0;
                char[] cArr2 = new char[2];
                while (true) {
                    int i10 = Ab.f13197E;
                    if (i10 < charArray.length) {
                        cArr2[0] = charArray[i10];
                        cArr2[1] = charArray[i10 + 1];
                        int i11 = 58224;
                        for (int i12 = 0; i12 < 16; i12++) {
                            char c10 = cArr2[1];
                            char c11 = cArr2[0];
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 39880)) ^ ((c11 >>> 5) + 64686)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 18272) ^ ((c12 + i11) ^ ((c12 << 4) + 62486))));
                            i11 -= 40503;
                        }
                        int i13 = Ab.f13197E;
                        cArr[i13] = cArr2[0];
                        cArr[i13 + 1] = cArr2[1];
                        Ab.f13197E = i13 + 2;
                    } else {
                        str2 = new String(cArr, 0, i5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String o(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 126;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f14038e[2105418398 + i11] + 126);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - (-2105418396)) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 13482510);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f14038e;
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

    public static /* synthetic */ HashMap q(C0921ba c0921ba) {
        int i5 = (f14042i + 93) % 128;
        f14041h = i5;
        HashMap map = (HashMap) c0921ba.f14045c;
        int i10 = i5 + 47;
        f14042i = i10 % 128;
        if (i10 % 2 != 0) {
            return map;
        }
        throw null;
    }

    public Field a(Class cls, Class cls2) {
        Field fieldP;
        synchronized (AbstractC1104pb.class) {
            try {
                if (((C0960ea) this.f14044b) == null) {
                    this.f14044b = new C0960ea();
                }
                C0960ea c0960ea = (C0960ea) this.f14044b;
                c0960ea.f14140O = cls2;
                fieldP = p(cls, c0960ea);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fieldP;
    }

    public void d(JSONObject jSONObject, C1138s7 c1138s7) {
        f14042i = (f14041h + 123) % 128;
        r(jSONObject, c1138s7, null);
        int i5 = f14041h + 97;
        f14042i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public synchronized String e(String str) {
        f14040g = (f14039f + 55) % 128;
        if (TextUtils.isEmpty(str)) {
            int i5 = f14039f + 49;
            f14040g = i5 % 128;
            if (i5 % 2 == 0) {
                int i10 = 87 / 0;
            }
            return null;
        }
        try {
            try {
                try {
                    try {
                        String str2 = new String(((Cipher) this.f14044b).doFinal(AbstractC1104pb.R(str)), l("힌帆𣏕몈\ude7c靋", 4 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                        if (str2.indexOf(o((-13482411) - TextUtils.indexOf("", "", 0, 0), TextUtils.getOffsetBefore("", 0) - 86, (byte) (ViewConfiguration.getEdgeSlop() >> 16), (short) (ViewConfiguration.getWindowTouchSlop() >> 8), (-2105418348) - Drawable.resolveOpacity(0, 0)).intern()) == 0) {
                            return str2.substring(o((-13482412) - TextUtils.indexOf((CharSequence) "", '0'), (-86) - Color.red(0), (byte) Color.red(0), (short) (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) - 2105418348).intern().length(), str2.length());
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(o((-13482438) - (ViewConfiguration.getTouchSlop() >> 8), (-87) - (ViewConfiguration.getTapTimeout() >> 16), (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-2105418309) - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                        sb2.append(str);
                        throw new C1103pa(sb2.toString());
                    } catch (BadPaddingException e7) {
                        g();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e7.getMessage());
                        sb3.append(l("Ď係", -TextUtils.lastIndexOf("", '0')).intern());
                        sb3.append(str);
                        throw new C1103pa(sb3.toString());
                    }
                } catch (IllegalBlockSizeException e10) {
                    g();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(e10.getMessage());
                    sb4.append(l("Ď係", (ViewConfiguration.getLongPressTimeout() >> 16) + 1).intern());
                    sb4.append(str);
                    throw new C1103pa(sb4.toString());
                }
            } catch (C1090oa e11) {
                g();
                StringBuilder sb5 = new StringBuilder();
                sb5.append(e11.getMessage());
                sb5.append(l("Ď係", 1 - ExpandableListView.getPackedPositionType(0L)).intern());
                sb5.append(str);
                throw new C1103pa(sb5.toString());
            }
        } catch (UnsupportedEncodingException e12) {
            throw new RuntimeException(l("ꊀ✲鲽쳱律熹屯\udf03\ue6c5峾ᡭ䌠囝䔦倔\udaf5\ue6c5峾\uea27ᚺ", TextUtils.indexOf("", "") + 19).intern(), e12);
        }
    }

    public void g() {
        SecretKeySpec secretKeySpec = (SecretKeySpec) this.f14045c;
        try {
            Cipher cipher = Cipher.getInstance(l("起◯ё\udd62㨬劉\uf198혱린뜊稜ꁪ螃ꧯ\ueb7f￥⦣笊頰ꋻ", Color.red(0) + 20).intern());
            this.f14043a = cipher;
            byte[] bArr = f14037d;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(l("起◯ё\udd62㨬劉\uf198혱린뜊稜ꁪ螃ꧯ\ueb7f￥⦣笊頰ꋻ", View.getDefaultSize(0, 0) + 20).intern());
            this.f14044b = cipher2;
            cipher2.init(2, secretKeySpec, new IvParameterSpec(bArr));
            int i5 = f14040g + 119;
            f14039f = i5 % 128;
            if (i5 % 2 != 0) {
                throw null;
            }
        } catch (GeneralSecurityException e7) {
            throw new RuntimeException(o(TextUtils.indexOf("", "", 0) - 13482437, TextUtils.lastIndexOf("", '0', 0) - 104, (byte) View.resolveSizeAndState(0, 0, 0), (short) (Process.myPid() >> 22), (-2105418369) - TextUtils.lastIndexOf("", '0')).intern(), e7);
        }
    }

    public void h(Class cls, C0960ea c0960ea, ArrayList arrayList) {
        synchronized (C0921ba.class) {
            try {
                if (((C0230x) this.f14043a) == null) {
                    this.f14043a = new C0230x(11, (char) 0);
                }
                C0230x c0230x = (C0230x) this.f14043a;
                c0230x.f188c = c0960ea;
                c0230x.f187b = c0960ea.f14141P;
                c(cls, c0230x, arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        Nb nb2 = new Nb(2);
        nb2.f13555d = this;
        Cb.g(nb2);
        f14042i = (f14041h + 77) % 128;
    }

    public synchronized String k(String str) {
        f14039f = (f14040g + 35) % 128;
        if (TextUtils.isEmpty(str)) {
            int i5 = f14040g + 7;
            f14039f = i5 % 128;
            if (i5 % 2 != 0) {
                int i10 = 50 / 0;
            }
            return str;
        }
        try {
            try {
                Cipher cipher = (Cipher) this.f14043a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(o((-13482411) - (ViewConfiguration.getMaximumFlingVelocity() >> 16), KeyEvent.keyCodeFromString("") - 86, (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (short) View.MeasureSpec.getMode(0), (-2105418347) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern());
                sb2.append(str);
                return AbstractC1104pb.Z(cipher.doFinal(sb2.toString().getBytes(l("힌帆𣏕몈\ude7c靋", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 5).intern())));
            } catch (UnsupportedEncodingException e7) {
                g();
                throw new RuntimeException(l("ꊀ✲鲽쳱律熹屯\udf03\ue6c5峾ᡭ䌠囝䔦倔\udaf5\ue6c5峾\uea27ᚺ", 19 - TextUtils.getTrimmedLength("")).intern(), e7);
            }
        } catch (GeneralSecurityException e10) {
            g();
            throw new RuntimeException(l("ꊀ✲鲽쳱律熹屯\udf03\ue6c5峾ᡭ䌠囝䔦倔\udaf5\ue6c5峾\uea27ᚺ", 19 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), e10);
        }
    }

    public Field p(Class cls, C0960ea c0960ea) {
        synchronized (AbstractC1104pb.class) {
            try {
                if (((ArrayList) this.f14045c) == null) {
                    this.f14045c = new ArrayList();
                }
                ((ArrayList) this.f14045c).clear();
                h(cls, c0960ea, (ArrayList) this.f14045c);
                if (((ArrayList) this.f14045c).isEmpty()) {
                    return null;
                }
                return (Field) ((ArrayList) this.f14045c).get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(JSONObject jSONObject, C1138s7 c1138s7, C0999ha c0999ha) {
        O o7 = new O(4);
        o7.f13562g = this;
        o7.f13559d = jSONObject;
        o7.f13560e = c0999ha;
        o7.f13561f = c1138s7;
        Cb.g(o7);
        int i5 = f14042i + 15;
        f14041h = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 31 / 0;
        }
    }

    public void s() {
        Nb nb2 = new Nb(0);
        nb2.f13555d = this;
        Cb.g(nb2);
        int i5 = f14041h + 7;
        f14042i = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
