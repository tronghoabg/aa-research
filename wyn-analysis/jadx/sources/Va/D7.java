package Va;

import android.R;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.VideoView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.zip.GZIPInputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class D7 extends AbstractC1104pb {

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f13270K = {-87, 18, -9, 78, -71, -7, 5, -11, 19, -4, -13, 15, 67, -82, 3, -3, 0, 45, -83, 12, -11, 17, 65, -72, -12, 11, -14, 87, -83, 14, -14, 0, 18, -11, 9, 67, -68, -10, 13, 65, 0, 0, 0};
    public static int L = 0;

    /* renamed from: M, reason: collision with root package name */
    public static int f13271M = 1;

    public static int A0(ArrayList arrayList) {
        return AbstractC1104pb.b((String) AbstractC1104pb.U(arrayList, 0, String.class), (String) AbstractC1104pb.U(arrayList, 1, String.class));
    }

    public static C0947da B0() {
        C0999ha.j().getClass();
        C0947da c0947da = new C0947da(0);
        c0947da.f14118O = new C0960ea();
        return c0947da;
    }

    public static View C0(ArrayList arrayList) {
        View view = (View) AbstractC1104pb.U(arrayList, 0, View.class);
        Class cls = (Class) AbstractC1104pb.U(arrayList, 1, Class.class);
        boolean zBooleanValue = ((Boolean) AbstractC1104pb.U(arrayList, 2, Boolean.class)).booleanValue();
        Rect rect = Bb.f13245a;
        ArrayList arrayList2 = new ArrayList();
        Bb.d(view, cls, null, true, zBooleanValue, null, null, arrayList2);
        if (arrayList2.isEmpty()) {
            return null;
        }
        return (View) arrayList2.get(0);
    }

    public static Object D0(ArrayList arrayList) {
        return ((Pair) AbstractC1104pb.U(arrayList, 0, Pair.class)).first;
    }

    public static String E0(int i5, int i10, byte b5, short s10, int i11) {
        String string;
        synchronized (AbstractC1104pb.f14490J) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i12 = i10 + 83;
                int i13 = i12 == -1 ? 1 : 0;
                if (i13 != 0) {
                    i12 = (byte) (f13270K[(-2015728714) + i11] + 83);
                }
                if (i12 > 0) {
                    AbstractC1104pb.f14486F = ((i11 + i12) - 2015728716) + i13;
                    AbstractC1104pb.f14487G = b5;
                    char c10 = (char) (i5 + 1455264499);
                    AbstractC1104pb.f14488H = c10;
                    sb2.append(c10);
                    AbstractC1104pb.f14489I = AbstractC1104pb.f14488H;
                    AbstractC1104pb.f14485E = 1;
                    while (AbstractC1104pb.f14485E < i12) {
                        byte[] bArr = f13270K;
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

    public static Method F0(ArrayList arrayList) {
        C1012ia c1012ia = (C1012ia) AbstractC1104pb.U(arrayList, 1, C1012ia.class);
        if (arrayList.get(0) instanceof Class) {
            Class cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
            ArrayList arrayList2 = new ArrayList();
            C0999ha.h(cls, c1012ia, arrayList2);
            if (arrayList2.isEmpty()) {
                return null;
            }
            return (Method) arrayList2.get(0);
        }
        Class<?> cls2 = AbstractC1104pb.U(arrayList, 0, Object.class).getClass();
        ArrayList arrayList3 = new ArrayList();
        C0999ha.h(cls2, c1012ia, arrayList3);
        if (arrayList3.isEmpty()) {
            return null;
        }
        return (Method) arrayList3.get(0);
    }

    public static C0947da G0() {
        C0947da c0947da = new C0947da(1);
        C1012ia c1012ia = new C1012ia();
        c1012ia.f14293R = new ArrayList();
        c1012ia.q0();
        c0947da.f14118O = c1012ia;
        return c0947da;
    }

    public static Object H0(ArrayList arrayList) {
        return AbstractC1104pb.T((Context) AbstractC1104pb.U(arrayList, 0, Context.class));
    }

    public static Field I0(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object objU = AbstractC1104pb.U(arrayList, 0, Object.class);
            return ((C0921ba) C0999ha.j().f14263a).a(objU.getClass(), (Class) AbstractC1104pb.U(arrayList, 1, Class.class));
        }
        Class cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
        if (arrayList.get(1) instanceof Class) {
            return ((C0921ba) C0999ha.j().f14263a).a(cls, (Class) AbstractC1104pb.U(arrayList, 1, Class.class));
        }
        return ((C0921ba) C0999ha.j().f14263a).p(cls, (C0960ea) AbstractC1104pb.U(arrayList, 1, C0960ea.class));
    }

    public static ArrayList J0(ArrayList arrayList) {
        String str = (String) AbstractC1104pb.U(arrayList, 0, String.class);
        if (arrayList.get(1) instanceof String) {
            String str2 = (String) AbstractC1104pb.U(arrayList, 1, String.class);
            int i5 = AbstractC1104pb.f14513x + 31;
            AbstractC1104pb.f14512w = i5 % 128;
            return i5 % 2 != 0 ? AbstractC1104pb.F(str, str2, true) : AbstractC1104pb.F(str, str2, false);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC1104pb.U(arrayList, 1, List.class));
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            int i11 = AbstractC1104pb.f14513x + 119;
            AbstractC1104pb.f14512w = i11 % 128;
            if (i11 % 2 != 0) {
                arrayList2.addAll(AbstractC1104pb.F(str, jSONArray.optString(i10), true));
                i10 += 105;
            } else {
                arrayList2.addAll(AbstractC1104pb.F(str, jSONArray.optString(i10), false));
                i10++;
            }
        }
        int i12 = AbstractC1104pb.f14513x + 49;
        AbstractC1104pb.f14512w = i12 % 128;
        if (i12 % 2 == 0) {
            return arrayList2;
        }
        throw null;
    }

    public static JSONObject K0(ArrayList arrayList) {
        return Ab.X((JSONObject) AbstractC1104pb.U(arrayList, 0, JSONObject.class), arrayList.size() > 1 ? ((Boolean) AbstractC1104pb.U(arrayList, 1, Boolean.class)).booleanValue() : true);
    }

    public static void L0(C1214y7 c1214y7, ArrayList arrayList) {
        String str;
        JSONObject jSONObject;
        boolean zBooleanValue = false;
        String str2 = (String) AbstractC1104pb.U(arrayList, 0, String.class);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c1214y7.f());
        char c10 = (char) (24957 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
        int packedPositionType = ExpandableListView.getPackedPositionType(0L) - 1556844405;
        char[] charArray = "｀".toCharArray();
        char[] charArray2 = "诌㑰纣ୡ".toCharArray();
        char[] charArray3 = "\u0000\u0000\u0000\u0000".toCharArray();
        synchronized (AbstractC0897a.f13934r) {
            try {
                char[] cArr = (char[]) charArray2.clone();
                char[] cArr2 = (char[]) charArray3.clone();
                cArr[0] = (char) (c10 ^ cArr[0]);
                cArr2[2] = (char) (cArr2[2] + ((char) packedPositionType));
                int length = charArray.length;
                char[] cArr3 = new char[length];
                AbstractC0897a.f13933q = 0;
                while (true) {
                    int i5 = AbstractC0897a.f13933q;
                    if (i5 >= length) {
                        break;
                    }
                    int i10 = (i5 + 3) % 4;
                    int i11 = cArr[i5 % 4] * 32718;
                    char c11 = cArr2[(i5 + 2) % 4];
                    char c12 = (char) ((i11 + c11) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    cArr2[i10] = (char) (((cArr[i10] * 32718) + c11) / Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    cArr[i10] = c12;
                    cArr3[i5] = (char) (((charArray[i5] ^ c12) ^ 0) ^ 61833);
                    AbstractC0897a.f13933q = i5 + 1;
                }
                str = new String(cArr3);
            } catch (Throwable th) {
                throw th;
            }
        }
        sb2.append(str.intern());
        sb2.append(Integer.toHexString(str2.hashCode()));
        String string = sb2.toString();
        Throwable th2 = (Throwable) AbstractC1104pb.U(arrayList, 1, Throwable.class);
        if (arrayList.size() <= 2) {
            Ab.Q(c1214y7.f(), str2, string, th2, null, false);
            return;
        }
        if (AbstractC1104pb.P(arrayList, 2, JSONObject.class)) {
            JSONObject jSONObject2 = (JSONObject) AbstractC1104pb.U(arrayList, 2, JSONObject.class);
            if (arrayList.size() > 3 && AbstractC1104pb.P(arrayList, 3, Boolean.class)) {
                zBooleanValue = ((Boolean) AbstractC1104pb.U(arrayList, 3, Boolean.class)).booleanValue();
            }
            jSONObject = jSONObject2;
        } else {
            jSONObject = null;
            if (AbstractC1104pb.P(arrayList, 2, Boolean.class)) {
                zBooleanValue = ((Boolean) AbstractC1104pb.U(arrayList, 2, Boolean.class)).booleanValue();
            }
        }
        Ab.Q(c1214y7.f(), str2, string, th2, jSONObject, zBooleanValue);
    }

    public static boolean M0(ArrayList arrayList) {
        L = (f13271M + 99) % 128;
        if (AbstractC1168ub.k(AbstractC1104pb.U(arrayList, 0, Object.class), (String) AbstractC1104pb.U(arrayList, 1, String.class), (List) AbstractC1104pb.U(arrayList, 2, List.class)) != null) {
            int i5 = L + 23;
            f13271M = i5 % 128;
            if (i5 % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    public static void N0(C1214y7 c1214y7, ArrayList arrayList) {
        JSONObject jSONObject = (JSONObject) AbstractC1104pb.U(arrayList, 0, JSONObject.class);
        c1214y7.getClass();
        C1214y7.f14802l = (C1214y7.f14803m + 45) % 128;
        c1214y7.f14812i = Ab.X(jSONObject, true);
        int i5 = C1214y7.f14802l + 15;
        C1214y7.f14803m = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.webkit.WebView O0(java.util.ArrayList r12) {
        /*
            r0 = 0
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.Object r1 = Va.AbstractC1104pb.U(r12, r0, r1)
            r2 = r1
            android.app.Activity r2 = (android.app.Activity) r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r12.size()
            r11 = 0
            r4 = 1
            if (r3 <= r4) goto L4a
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            java.lang.Object r3 = Va.AbstractC1104pb.U(r12, r4, r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r4 = r12.size()
            r5 = 2
            if (r4 <= r5) goto L46
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Object r4 = Va.AbstractC1104pb.U(r12, r5, r4)
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r12.size()
            r6 = 3
            if (r5 <= r6) goto L42
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Object r12 = Va.AbstractC1104pb.U(r12, r6, r1)
            r1 = r12
            java.util.List r1 = (java.util.List) r1
        L42:
            r9 = r1
            r5 = r4
            r4 = r3
            goto L4c
        L46:
            r9 = r1
            r4 = r3
            r5 = r11
            goto L4c
        L4a:
            r3 = -1
            goto L46
        L4c:
            android.graphics.Rect r12 = Va.Bb.f13245a
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Class<android.webkit.WebView> r3 = android.webkit.WebView.class
            r7 = 0
            r6 = 1
            r8 = 0
            Va.Bb.c(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            int r12 = r10.size()
            if (r12 <= 0) goto L68
            java.lang.Object r12 = r10.get(r0)
            r11 = r12
            android.view.View r11 = (android.view.View) r11
        L68:
            android.webkit.WebView r11 = (android.webkit.WebView) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.D7.O0(java.util.ArrayList):android.webkit.WebView");
    }

    public static String P0(ArrayList arrayList) {
        String str = (String) AbstractC1104pb.U(arrayList, 0, String.class);
        boolean zBooleanValue = arrayList.size() > 2 ? ((Boolean) AbstractC1104pb.U(arrayList, 2, Boolean.class)).booleanValue() : true;
        if (arrayList.get(1) instanceof String) {
            return AbstractC1104pb.q(str, (String) AbstractC1104pb.U(arrayList, 1, String.class), zBooleanValue);
        }
        JSONArray jSONArray = new JSONArray((Collection) AbstractC1104pb.U(arrayList, 1, List.class));
        int i5 = AbstractC1104pb.f14512w + 59;
        AbstractC1104pb.f14513x = i5 % 128;
        for (int i10 = i5 % 2 == 0 ? 1 : 0; i10 < jSONArray.length(); i10++) {
            AbstractC1104pb.f14513x = (AbstractC1104pb.f14512w + 89) % 128;
            String strQ = AbstractC1104pb.q(str, jSONArray.optString(i10), zBooleanValue);
            if (strQ != null) {
                return strQ;
            }
        }
        return null;
    }

    public static List Q0(ArrayList arrayList) {
        if (!(arrayList.get(0) instanceof Class)) {
            Object objU = AbstractC1104pb.U(arrayList, 0, Object.class);
            boolean zBooleanValue = arrayList.size() > 1 ? ((Boolean) AbstractC1104pb.U(arrayList, 1, Boolean.class)).booleanValue() : false;
            C0999ha.j().getClass();
            return Arrays.asList(C0921ba.i(objU.getClass(), zBooleanValue, -1, null));
        }
        if (arrayList.size() <= 1) {
            return new ArrayList();
        }
        Class cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
        C0960ea c0960ea = (C0960ea) AbstractC1104pb.U(arrayList, 1, C0960ea.class);
        C0921ba c0921ba = (C0921ba) C0999ha.j().f14263a;
        ArrayList arrayList2 = new ArrayList();
        c0921ba.h(cls, c0960ea, arrayList2);
        return arrayList2;
    }

    public static void R0(ArrayList arrayList) {
        Context context = (Context) AbstractC1104pb.U(arrayList, 0, Context.class);
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) AbstractC1104pb.U(arrayList, 1, BroadcastReceiver.class);
        IntentFilter intentFilter = (IntentFilter) AbstractC1104pb.U(arrayList, 2, IntentFilter.class);
        Object objT = AbstractC1104pb.T(context);
        AbstractC1104pb.f14515z = (AbstractC1104pb.f14514y + 69) % 128;
        try {
            AbstractC1168ub.k(objT, AbstractC1104pb.f0(22229 - (ViewConfiguration.getLongPressTimeout() >> 16), "⭏綍蛰⼫瀚饠⎦璜鷇☥伌避㪨䎚链㴴").intern(), Arrays.asList(broadcastReceiver, intentFilter)).invoke(objT, broadcastReceiver, intentFilter);
            AbstractC1104pb.f14514y = (AbstractC1104pb.f14515z + 51) % 128;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public static void S0(ArrayList arrayList) {
        Ab.S((JSONObject) AbstractC1104pb.U(arrayList, 0, JSONObject.class), (JSONObject) AbstractC1104pb.U(arrayList, 1, JSONObject.class), arrayList.size() > 2 ? ((Boolean) AbstractC1104pb.U(arrayList, 2, Boolean.class)).booleanValue() : true);
    }

    public static Class T0(ArrayList arrayList) {
        int i5 = L + 11;
        f13271M = i5 % 128;
        return Array.newInstance((Class<?>) (i5 % 2 == 0 ? AbstractC1104pb.U(arrayList, 1, Class.class) : AbstractC1104pb.U(arrayList, 0, Class.class)), 0).getClass();
    }

    public static Object U0(C1214y7 c1214y7, ArrayList arrayList) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Class cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 1) {
            arrayList2 = (List) AbstractC1104pb.U(arrayList, 1, List.class);
            L = (f13271M + 125) % 128;
        }
        List list = arrayList.size() > 2 ? (List) AbstractC1104pb.U(arrayList, 2, List.class) : null;
        try {
            if (list == null) {
                Object objI = AbstractC1168ub.i(cls, arrayList2);
                L = (f13271M + 117) % 128;
                return objI;
            }
            L = (f13271M + 49) % 128;
            Class<?>[] clsArr = new Class[list.size()];
            list.toArray(clsArr);
            AbstractC1168ub.f14681c = (AbstractC1168ub.f14682d + 75) % 128;
            Object objNewInstance = cls.getConstructor(clsArr).newInstance(arrayList2.toArray());
            int i5 = AbstractC1168ub.f14682d + 119;
            AbstractC1168ub.f14681c = i5 % 128;
            if (i5 % 2 == 0) {
                return objNewInstance;
            }
            throw null;
        } catch (Exception e7) {
            String strJ = c1214y7.u().j();
            StringBuilder sb2 = new StringBuilder();
            String string = "";
            sb2.append(E0(TextUtils.indexOf("", "") - 1455264430, TextUtils.indexOf("", "", 0) - 64, (byte) (Process.myTid() >> 22), (short) (ViewConfiguration.getTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) + 2015728715).intern());
            sb2.append(cls.getName());
            sb2.append(E0(TextUtils.lastIndexOf("", '0') - 1455264466, (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 72, (byte) KeyEvent.keyCodeFromString(""), (short) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0') + 2015728733).intern());
            sb2.append(arrayList2);
            if (list != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(E0(TextUtils.indexOf((CharSequence) "", '0') - 1455264466, (-70) - KeyEvent.keyCodeFromString(""), (byte) (AndroidCharacter.getMirror('0') - '0'), (short) TextUtils.getTrimmedLength(""), 2015728742 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern());
                sb3.append(list);
                string = sb3.toString();
            }
            sb2.append(string);
            AbstractC0897a.f(strJ, sb2.toString(), e7);
            return null;
        }
    }

    public static Field V0(ArrayList arrayList) {
        Field[] fields;
        Class cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
        String str = (String) AbstractC1104pb.U(arrayList, 1, String.class);
        C0921ba c0921ba = (C0921ba) C0999ha.j().f14263a;
        synchronized (C0921ba.class) {
            try {
                if (((ArrayList) c0921ba.f14045c) == null) {
                    c0921ba.f14045c = new ArrayList();
                }
                ((ArrayList) c0921ba.f14045c).clear();
                ArrayList arrayList2 = (ArrayList) c0921ba.f14045c;
                try {
                    fields = cls.getDeclaredFields();
                } catch (Error unused) {
                    fields = cls.getFields();
                }
                for (Field field : fields) {
                    if (field.getType().getName().toLowerCase().startsWith(str.toLowerCase())) {
                        field.setAccessible(true);
                        arrayList2.add(field);
                    }
                }
                if (((ArrayList) c0921ba.f14045c).isEmpty()) {
                    return null;
                }
                return (Field) ((ArrayList) c0921ba.f14045c).get(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void W0(ArrayList arrayList) {
        Context context = (Context) AbstractC1104pb.U(arrayList, 0, Context.class);
        BroadcastReceiver broadcastReceiver = (BroadcastReceiver) AbstractC1104pb.U(arrayList, 1, BroadcastReceiver.class);
        Object objT = AbstractC1104pb.T(context);
        int i5 = AbstractC1104pb.f14514y + 115;
        AbstractC1104pb.f14515z = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                String strIntern = AbstractC1104pb.f0(32868 % (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)), "⭈ꬶ⮅꩷⫎ꪭ⤐ꦊ⡰ꣂ⢝꼏\u2fe2깹⻒꺠ⴈ귺").intern();
                Object[] objArr = new Object[0];
                objArr[1] = broadcastReceiver;
                AbstractC1168ub.k(objT, strIntern, Arrays.asList(objArr)).invoke(objT, broadcastReceiver);
            } else {
                AbstractC1168ub.k(objT, AbstractC1104pb.f0((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32868, "⭈ꬶ⮅꩷⫎ꪭ⤐ꦊ⡰ꣂ⢝꼏\u2fe2깹⻒꺠ⴈ귺").intern(), Arrays.asList(broadcastReceiver)).invoke(objT, broadcastReceiver);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public static boolean X0(ArrayList arrayList) {
        return AbstractC1104pb.O((String) AbstractC1104pb.U(arrayList, 0, String.class));
    }

    public static boolean Y0(ArrayList arrayList) {
        View view = (View) AbstractC1104pb.U(arrayList, 0, View.class);
        Rect rect = Bb.f13245a;
        view.getHitRect(rect);
        return view.getGlobalVisibleRect(rect);
    }

    public static String q0(ArrayList arrayList) {
        int i5 = 0;
        String str = (String) AbstractC1104pb.U(arrayList, 0, String.class);
        int i10 = AbstractC1104pb.f14512w + 91;
        AbstractC1104pb.f14513x = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (str != null && !Cb.h() && AbstractC1104pb.O(str)) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str, 0));
                GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                new ByteArrayOutputStream();
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i11 = gZIPInputStream.read(bArr, i5, 8192 - i5);
                    if (i11 == -1) {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        return new String(bArr, AbstractC1104pb.Y("\u0001\u0000\u0001\u0001\u0001", new int[]{40, 5, 83, 3}, true).intern());
                    }
                    i5 += i11;
                    AbstractC1104pb.f14513x = (AbstractC1104pb.f14512w + 53) % 128;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static MediaPlayer r0(ArrayList arrayList) {
        VideoView videoView = (VideoView) AbstractC1104pb.U(arrayList, 0, VideoView.class);
        try {
            Field fieldE = AbstractC1104pb.E(VideoView.class, AbstractC1104pb.A((byte) (92 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 12 - KeyEvent.normalizeMetaState(0), "\u0017\u0014\u0003\u0007\u0012\f\u001a\u000f\n\u0018\u0004\u0007").intern());
            if (fieldE != null) {
                int i5 = AbstractC1104pb.f14509t + 81;
                AbstractC1104pb.f14510u = i5 % 128;
                if (i5 % 2 != 0) {
                    return (MediaPlayer) fieldE.get(videoView);
                }
                throw null;
            }
        } catch (Exception e7) {
            Ab.a0(AbstractC1104pb.A((byte) (AndroidCharacter.getMirror('0') + '-'), TextUtils.getOffsetAfter("", 0) + 12, "\n\u0002\n\u000b\u0006\u0011\u0007\u000f\u0000\u000e\u0011\u0002").intern(), AbstractC1104pb.W(127 - View.MeasureSpec.getSize(0), "\u0084\u0089 \u0081\u0091\u009f\u0081\u0086\u0083\u0089\u008c\u0092\u0089\u008d\u009e\u0082\u0086\u009e\u0084\u0085\u0084\u0084\u0089").intern(), e7, false);
        }
        AbstractC1104pb.f14509t = (AbstractC1104pb.f14510u + 85) % 128;
        return null;
    }

    public static long s0() {
        return AbstractC1104pb.S();
    }

    public static View t0(ArrayList arrayList) {
        Activity activity = (Activity) AbstractC1104pb.U(arrayList, 0, Activity.class);
        Rect rect = Bb.f13245a;
        return activity.findViewById(R.id.content);
    }

    public static Object u0(ArrayList arrayList) {
        return ((Pair) AbstractC1104pb.U(arrayList, 0, Pair.class)).second;
    }

    public static Field v0(ArrayList arrayList) {
        return ((C0921ba) C0999ha.j().f14263a).p((Class) AbstractC1104pb.U(arrayList, 0, Class.class), (C0960ea) AbstractC1104pb.U(arrayList, 1, C0960ea.class));
    }

    public static ArrayList w0(ArrayList arrayList) {
        C1012ia c1012ia = (C1012ia) AbstractC1104pb.U(arrayList, 1, C1012ia.class);
        if (arrayList.get(0) instanceof Class) {
            Class cls = (Class) AbstractC1104pb.U(arrayList, 0, Class.class);
            ArrayList arrayList2 = new ArrayList();
            C0999ha.h(cls, c1012ia, arrayList2);
            return arrayList2;
        }
        Class<?> cls2 = AbstractC1104pb.U(arrayList, 0, Object.class).getClass();
        ArrayList arrayList3 = new ArrayList();
        C0999ha.h(cls2, c1012ia, arrayList3);
        return arrayList3;
    }

    public static JSONObject x0(C1214y7 c1214y7) {
        int i5 = C1214y7.f14802l;
        JSONObject jSONObject = c1214y7.f14812i;
        C1214y7.f14803m = (i5 + 49) % 128;
        return jSONObject;
    }

    public static ArrayList y0(ArrayList arrayList) {
        Object objU = AbstractC1104pb.U(arrayList, 0, Object.class);
        List list = (List) AbstractC1104pb.U(arrayList, 1, List.class);
        int iIntValue = ((Integer) AbstractC1104pb.U(arrayList, 2, Integer.class)).intValue();
        ((C1051la) C0999ha.j().f14264b).getClass();
        C1038ka c1038ka = new C1038ka(0);
        C0921ba c0921ba = new C0921ba();
        C1025ja c1025ja = new C1025ja();
        c1025ja.f14324f = -1;
        c1025ja.f14325g = -1;
        c1025ja.f14327i = -1;
        c1025ja.f14330m = true;
        c0921ba.f14043a = c1025ja;
        c1025ja.f14328j = -1;
        c1025ja.k = -1;
        c1025ja.f14329l = -1;
        c1025ja.f14326h = -1;
        c0921ba.f14044b = c1038ka;
        c0921ba.f14045c = null;
        c1025ja.f14322d = list;
        c1025ja.f14323e = iIntValue;
        c1025ja.f14320b = C1038ka.class;
        c1025ja.f14321c = null;
        F6.r rVar = new F6.r(c0921ba);
        rVar.f4011b = true;
        C1051la.l(objU, rVar, 0, null);
        ArrayList arrayList2 = new ArrayList((HashSet) rVar.f4015f);
        int i5 = C1051la.f14366c + 45;
        C1051la.f14367d = i5 % 128;
        if (i5 % 2 != 0) {
            return arrayList2;
        }
        throw null;
    }

    public static char z0(ArrayList arrayList) {
        f13271M = (L + 59) % 128;
        char cIntValue = (char) ((Number) AbstractC1104pb.U(arrayList, 0, Number.class)).intValue();
        int i5 = f13271M + 51;
        L = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 16 / 0;
        }
        return cIntValue;
    }
}
