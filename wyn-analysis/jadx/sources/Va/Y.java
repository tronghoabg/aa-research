package Va;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.DesugarCollections;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class Y {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f13863b;

    /* renamed from: d, reason: collision with root package name */
    public static int f13865d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static int f13866e = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final char[] f13864c = {'e', 192, 181, 189, 181, 189, 210, 205, 209, 199, 191, 199, 206, 204, '4', 'd', 'i', 'k', 'd', 'W', 'N', 'J', 'R', 'Z', 'R', 'q', 209, 209, 236, 219, 218, 244, 218, 209, 217, 209, 220, 227, 232, 234, '9', 'k', 'R', ']', 'v', 'n', 'k', 'a', ' ', 'R', 'X', '^', 'h', 'D', 137, 'q', 'p', 132, 136, 139, 'v', 'n', 234, 249, 251, 250, 255, 262, 260, '6', 'f', 'i', 'l', 'f', 'l', 'q', 'k', '[', 'F', 149, 151, 150, 147, 138, 145, 147, 145, 150, 131, '3', 'i', 'h', ']', 'e', 'q', '&', '^', 'm', 'm', 'i', 'i', 134, 267, 265, 263, 256, 259, 267, 257, 252, 237, '1', 'e', 'Y', '[', ']', '^', '?', 'y', 'q', 'r', 'm', '_', '!', 'U', 'f', 'X', 'W', 'b', 'e', 'h', 'k', 'i', '2', 'm', 'o', 'W', 'U', 'R', 'p', 238, 245, 239, 248, 255, 's', 235, 236, 223, 231, 244, 236, 'X', 180, 190, 192, 187, 197};

    /* renamed from: a, reason: collision with root package name */
    public static final List f13862a = Arrays.asList(b("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{0, 14, 99, 5}, true).intern(), b("\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{14, 11, 0, 7}, false).intern(), b("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{25, 15, 127, 7}, false).intern());

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(a(TextUtils.getCapsMode("", 0, 0) + 10, "㥷퓕\ue61c焬䑼陼⭫偣〄\udaf6").intern(), d(new C1166u9()));
        linkedHashMap.put(b("\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{40, 8, 0, 0}, true).intern(), d(new C0985g9(8), new C0985g9(4)));
        linkedHashMap.put(b("\u0001\u0001\u0001\u0000\u0001", new int[]{48, 5, 0, 0}, false).intern(), d(new C0985g9(2)));
        linkedHashMap.put(b("\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{53, 8, 25, 3}, true).intern(), d(new C0985g9(5)));
        linkedHashMap.put(b("\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000", new int[]{61, 8, 151, 8}, false).intern(), d(new C1089o9()));
        linkedHashMap.put(b("\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", new int[]{69, 9, 0, 0}, true).intern(), d(new C1216y9(), new C1204x9()));
        linkedHashMap.put(a(7 - Color.argb(0, 0, 0, 0), "钅需\uf2a6㰍푫ꃄ\uef42鎧").intern(), d(new C1076n9()));
        linkedHashMap.put(b("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001", new int[]{78, 11, 40, 0}, true).intern(), d(new C1115q9()));
        linkedHashMap.put(b("\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{89, 6, 0, 3}, false).intern(), d(new K9(1), new J9(1)));
        linkedHashMap.put(a(TextUtils.lastIndexOf("", '0', 0) + 10, "ᑖ븸✾石\ue2c8젿\ue629祝걵厌").intern(), d(new C1050l9(0), new C1037k9(0)));
        linkedHashMap.put(b("\u0001\u0000\u0001\u0001\u0000\u0000", new int[]{95, 6, 0, 0}, false).intern(), d(new C0985g9(7)));
        linkedHashMap.put(b("\u0000\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0001", new int[]{101, 10, 152, 0}, true).intern(), d(new C1102p9()));
        linkedHashMap.put(b("\u0000\u0001\u0000\u0001\u0001\u0000", new int[]{111, 6, 0, 2}, false).intern(), d(new C1140s9()));
        linkedHashMap.put(b("\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{117, 6, 5, 0}, true).intern(), d(new E9()));
        linkedHashMap.put(a(ExpandableListView.getPackedPositionGroup(0L) + 9, "늄慢鹝Ո\ue61c焬챴媾೮皾").intern(), d(new C1011i9()));
        linkedHashMap.put(b("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", new int[]{123, 10, 0, 0}, false).intern(), d(new C0998h9()));
        linkedHashMap.put(b("\u0001\u0001\u0001\u0001\u0000\u0001", new int[]{Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, 6, 0, 4}, true).intern(), d(new C1024j9()));
        linkedHashMap.put(a(TextUtils.lastIndexOf("", '0') + 7, "婭䒿﹚嫗跳刕").intern(), d(new C1153t9()));
        linkedHashMap.put(a(4 - (KeyEvent.getMaxKeyCode() >> 16), "ᯋ\ud874ꤰ㵿").intern(), d(new C1179v9()));
        linkedHashMap.put(a(8 - TextUtils.indexOf("", "", 0), "脄鴵㑩軏ᇺ哚풏䒁").intern(), d(new C1192w9()));
        linkedHashMap.put(a(5 - View.resolveSize(0, 0), "䌷䞫⭫偣و㏨").intern(), d(new A9(), new C1228z9()));
        linkedHashMap.put(a(9 - Color.blue(0), "⾌⍺汀隿琂긑菡\u2064걵厌").intern(), d(new C9()));
        linkedHashMap.put(b("\u0001\u0000\u0000\u0000\u0001\u0001", new int[]{139, 6, 142, 0}, false).intern(), d(new D9()));
        linkedHashMap.put(a(ExpandableListView.getPackedPositionGroup(0L) + 12, "㵟\ufdda䖏纯릹꒞菬뻩蛯뛃ꓠᠩ").intern(), d(new B9()));
        linkedHashMap.put(b("\u0000\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{145, 7, Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE, 4}, true).intern(), d(new F9()));
        linkedHashMap.put(b("\u0000\u0000\u0001\u0000\u0001\u0001", new int[]{152, 6, 87, 0}, false).intern(), d(new I9()));
        f13863b = DesugarCollections.unmodifiableMap(linkedHashMap);
        f13865d = (f13866e + 79) % 128;
    }

    public static String a(int i5, String str) {
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
                            char c12 = (char) (c10 - (((c11 + i11) ^ ((c11 << 4) + 35467)) ^ ((c11 >>> 5) + 51185)));
                            cArr2[1] = c12;
                            cArr2[0] = (char) (c11 - (((c12 >>> 5) + 3390) ^ ((c12 + i11) ^ ((c12 << 4) + 46625))));
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

    public static String b(String str, int[] iArr, boolean z2) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (Ab.f13223z) {
            try {
                int i5 = iArr[0];
                int i10 = iArr[1];
                int i11 = iArr[2];
                int i12 = iArr[3];
                char[] cArr = new char[i10];
                System.arraycopy(f13864c, i5, cArr, 0, i10);
                if (bytes != null) {
                    char[] cArr2 = new char[i10];
                    Ab.f13222y = 0;
                    char c10 = 0;
                    while (true) {
                        int i13 = Ab.f13222y;
                        if (i13 >= i10) {
                            break;
                        }
                        if (bytes[i13] == 1) {
                            cArr2[i13] = (char) (((cArr[i13] << 1) + 1) - c10);
                        } else {
                            cArr2[i13] = (char) ((cArr[i13] << 1) - c10);
                        }
                        c10 = cArr2[i13];
                        Ab.f13222y = i13 + 1;
                    }
                    cArr = cArr2;
                }
                if (i12 > 0) {
                    char[] cArr3 = new char[i10];
                    System.arraycopy(cArr, 0, cArr3, 0, i10);
                    int i14 = i10 - i12;
                    System.arraycopy(cArr3, 0, cArr, i14, i12);
                    System.arraycopy(cArr3, i12, cArr, 0, i14);
                }
                if (z2) {
                    char[] cArr4 = new char[i10];
                    Ab.f13222y = 0;
                    while (true) {
                        int i15 = Ab.f13222y;
                        if (i15 >= i10) {
                            break;
                        }
                        cArr4[i15] = cArr[(i10 - i15) - 1];
                        Ab.f13222y = i15 + 1;
                    }
                    cArr = cArr4;
                }
                if (i11 > 0) {
                    Ab.f13222y = 0;
                    while (true) {
                        int i16 = Ab.f13222y;
                        if (i16 >= i10) {
                            break;
                        }
                        cArr[i16] = (char) (cArr[i16] - iArr[2]);
                        Ab.f13222y = i16 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static List c() {
        int i5 = f13866e + 89;
        int i10 = i5 % 128;
        f13865d = i10;
        if (i5 % 2 != 0) {
            throw null;
        }
        int i11 = i10 + 99;
        f13866e = i11 % 128;
        if (i11 % 2 != 0) {
            return f13862a;
        }
        throw null;
    }

    public static List d(AbstractC1127r9... abstractC1127r9Arr) {
        int i5 = f13865d + 49;
        f13866e = i5 % 128;
        int i10 = i5 % 2;
        List listAsList = Arrays.asList(abstractC1127r9Arr);
        if (i10 == 0) {
            int i11 = 40 / 0;
        }
        return listAsList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.LinkedHashMap e() {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Map r1 = Va.Y.f13863b
            java.util.Set r2 = r1.keySet()
            r0.<init>(r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L84
            int r3 = Va.Y.f13866e
            int r3 = r3 + 77
            int r4 = r3 % 128
            Va.Y.f13865d = r4
            int r3 = r3 % 2
            if (r3 == 0) goto L39
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            java.util.List r4 = (java.util.List) r4
            r5 = 13
            int r5 = r5 / 0
            if (r4 == 0) goto L14
            goto L47
        L39:
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L14
        L47:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L50:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L80
            java.lang.Object r6 = r4.next()
            Va.r9 r6 = (Va.AbstractC1127r9) r6
            boolean r7 = g(r6)
            if (r7 == 0) goto L77
            int r7 = Va.Y.f13865d
            int r7 = r7 + 45
            int r8 = r7 % 128
            Va.Y.f13866e = r8
            int r7 = r7 % 2
            if (r7 == 0) goto L72
            r5.add(r6)
            goto L77
        L72:
            r5.add(r6)
            r0 = 0
            throw r0
        L77:
            int r6 = Va.Y.f13865d
            int r6 = r6 + 59
            int r6 = r6 % 128
            Va.Y.f13866e = r6
            goto L50
        L80:
            r2.put(r3, r5)
            goto L14
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.Y.e():java.util.LinkedHashMap");
    }

    public static String f() {
        f13865d = (f13866e + 41) % 128;
        String strIntern = a(KeyEvent.normalizeMetaState(0) + 15, "ꗾ\uf04b☼︣\ue05e䘸䢃ꩢޯ斶䟪⎋⢑涂\uef42鎧").intern();
        f13865d = (f13866e + 107) % 128;
        return strIntern;
    }

    public static boolean g(AbstractC1127r9 abstractC1127r9) {
        try {
            if (!AbstractC0897a.p()) {
                Class.forName(abstractC1127r9.d());
                f13866e = (f13865d + 23) % 128;
                return true;
            }
            int i5 = f13865d + 81;
            f13866e = i5 % 128;
            if (i5 % 2 != 0) {
                abstractC1127r9.e();
                return true;
            }
            abstractC1127r9.e();
            throw null;
        } catch (Throwable unused) {
            return false;
        }
    }
}
