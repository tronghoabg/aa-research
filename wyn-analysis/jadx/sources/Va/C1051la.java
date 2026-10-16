package Va;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: Va.la, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1051la {

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f14365b = {'T', 'g', 'o', 'j', 'h', 'y', 'K', 'n', 's', 'i', 'w', '%', '~', 'u', 'k', 't', 'r', 'q', 'f', 'x', 'z', 'm', 'J', 'l', '}', 'H', 'R', '1', '{', '?'};

    /* renamed from: c, reason: collision with root package name */
    public static int f14366c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14367d = 1;

    /* renamed from: a, reason: collision with root package name */
    public HashMap f14368a;

    public static boolean a(InterfaceC1064ma interfaceC1064ma, C1077na c1077na) {
        int i5 = f14366c + 15;
        f14367d = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                interfaceC1064ma.e(c1077na);
                throw null;
            }
            boolean zE = interfaceC1064ma.e(c1077na);
            int i10 = f14367d + 9;
            f14366c = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 30 / 0;
            }
            return zE;
        } catch (Exception unused) {
            return false;
        }
    }

    public static C1077na b(Object obj, Object obj2, C1077na c1077na) {
        if (obj == null) {
            return null;
        }
        int i5 = f14366c;
        int i10 = (i5 + 103) % 128;
        f14367d = i10;
        if (obj instanceof Collection) {
            C1077na c1077na2 = new C1077na((Collection) obj, obj2, c1077na);
            int i11 = i10 + 83;
            f14366c = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 94 / 0;
            }
            return c1077na2;
        }
        if (!(obj instanceof Map)) {
            if (obj.getClass().isArray()) {
                return new C1077na(new ArrayList(Arrays.asList(obj)), obj2, c1077na);
            }
            return null;
        }
        C1077na c1077na3 = new C1077na();
        c1077na3.f14435M = (Map) obj;
        c1077na3.f14436N = obj2;
        c1077na3.f14437O = c1077na;
        int i13 = i5 + 125;
        f14367d = i13 % 128;
        if (i13 % 2 != 0) {
            return c1077na3;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        r9 = Va.C1051la.f14367d + 57;
        Va.C1051la.f14366c = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if ((r9 % 2) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r9 = 88 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(java.lang.Object r9, java.lang.Class r10, java.lang.String r11) throws java.lang.SecurityException {
        /*
        L0:
            r0 = 0
            r1 = 0
            if (r10 == 0) goto L8d
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r10.equals(r2)
            if (r2 != 0) goto L8d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.reflect.Field[] r3 = r10.getDeclaredFields()
            int r4 = r3.length
            r5 = r1
        L17:
            if (r5 >= r4) goto L45
            int r6 = Va.C1051la.f14366c
            int r6 = r6 + 105
            int r6 = r6 % 128
            Va.C1051la.f14367d = r6
            r6 = r3[r5]
            java.lang.Class r7 = r6.getType()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L3a
            int r7 = Va.C1051la.f14367d
            int r7 = r7 + 101
            int r7 = r7 % 128
            Va.C1051la.f14366c = r7
            r2.add(r6)
        L3a:
            int r5 = r5 + 1
            int r6 = Va.C1051la.f14366c
            int r6 = r6 + 87
            int r6 = r6 % 128
            Va.C1051la.f14367d = r6
            goto L17
        L45:
            java.lang.reflect.Field[] r3 = new java.lang.reflect.Field[r1]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.reflect.Field[] r2 = (java.lang.reflect.Field[]) r2
            int r3 = r2.length
        L4e:
            if (r1 >= r3) goto L87
            r4 = r2[r1]
            r5 = 1
            r4.setAccessible(r5)
            java.lang.Object r4 = r4.get(r9)     // Catch: java.lang.Exception -> L84
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L84
            if (r4 == 0) goto L7c
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r11)     // Catch: java.lang.Exception -> L84
            java.util.regex.Matcher r5 = r5.matcher(r4)     // Catch: java.lang.Exception -> L84
            boolean r5 = r5.matches()     // Catch: java.lang.Exception -> L84
            if (r5 == 0) goto L7c
            int r5 = Va.C1051la.f14367d
            int r5 = r5 + 57
            int r6 = r5 % 128
            Va.C1051la.f14366c = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L79
            return r4
        L79:
            throw r0     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L84
        L7a:
            r9 = move-exception
            throw r9
        L7c:
            int r4 = Va.C1051la.f14366c
            int r4 = r4 + 61
            int r4 = r4 % 128
            Va.C1051la.f14367d = r4
        L84:
            int r1 = r1 + 1
            goto L4e
        L87:
            java.lang.Class r10 = r10.getSuperclass()
            goto L0
        L8d:
            int r9 = Va.C1051la.f14367d
            int r9 = r9 + 57
            int r10 = r9 % 128
            Va.C1051la.f14366c = r10
            int r9 = r9 % 2
            if (r9 == 0) goto L9c
            r9 = 88
            int r9 = r9 / r1
        L9c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1051la.c(java.lang.Object, java.lang.Class, java.lang.String):java.lang.String");
    }

    public static String d(String str, int i5, int i10, int i11, boolean z2) {
        String str2;
        char[] charArray = str.toCharArray();
        synchronized (Ab.f13221x) {
            try {
                char[] cArr = new char[i5];
                Ab.f13219v = 0;
                while (true) {
                    int i12 = Ab.f13219v;
                    if (i12 >= i5) {
                        break;
                    }
                    char c10 = (char) (charArray[i12] + i10);
                    cArr[i12] = c10;
                    cArr[i12] = (char) (c10 - 'c');
                    Ab.f13219v = i12 + 1;
                }
                if (i11 > 0) {
                    Ab.f13220w = i11;
                    char[] cArr2 = new char[i5];
                    System.arraycopy(cArr, 0, cArr2, 0, i5);
                    int i13 = Ab.f13220w;
                    System.arraycopy(cArr2, 0, cArr, i5 - i13, i13);
                    int i14 = Ab.f13220w;
                    System.arraycopy(cArr2, i14, cArr, 0, i5 - i14);
                }
                if (z2) {
                    char[] cArr3 = new char[i5];
                    Ab.f13219v = 0;
                    while (true) {
                        int i15 = Ab.f13219v;
                        if (i15 >= i5) {
                            break;
                        }
                        cArr3[i15] = cArr[(i5 - i15) - 1];
                        Ab.f13219v = i15 + 1;
                    }
                    cArr = cArr3;
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String e(JSONArray jSONArray, Object obj) throws SecurityException {
        if (jSONArray != null) {
            f14366c = (f14367d + 65) % 128;
            for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                int i10 = f14367d + 55;
                f14366c = i10 % 128;
                if (i10 % 2 != 0) {
                    j(obj, jSONArray.optString(i5));
                    throw null;
                }
                String strJ = j(obj, jSONArray.optString(i5));
                if (strJ != null) {
                    f14367d = (f14366c + 119) % 128;
                    return strJ;
                }
            }
        }
        return null;
    }

    public static boolean f(Object obj, List list) {
        int i5 = f14366c;
        f14367d = (i5 + 35) % 128;
        if (obj == null) {
            return false;
        }
        f14367d = (i5 + 87) % 128;
        boolean zG = AbstractC1168ub.g(obj.getClass(), list);
        f14366c = (f14367d + 65) % 128;
        return zG;
    }

    public static C1077na g(C1077na c1077na, F6.r rVar, int i5) {
        Object objS0 = c1077na.s0();
        C1077na c1077naG = null;
        if (!((HashSet) rVar.f4014e).contains(objS0)) {
            HashSet hashSet = (HashSet) rVar.f4015f;
            if (!hashSet.contains(objS0)) {
                C0921ba c0921ba = (C0921ba) rVar.f4012c;
                if (!(!(i5 >= ((C1025ja) c0921ba.f14043a).f14324f)) && a((InterfaceC1064ma) c0921ba.f14044b, c1077na)) {
                    if (rVar.f4011b) {
                        ((HashSet) rVar.f4016g).add(c1077na);
                        hashSet.add(objS0);
                    }
                    return c1077na;
                }
                if (objS0 instanceof WeakReference) {
                    WeakReference weakReference = (WeakReference) objS0;
                    if (weakReference.get() != null) {
                        f14366c = (f14367d + 1) % 128;
                        if (!(!(i5 >= ((C1025ja) c0921ba.f14043a).f14327i)) && f(weakReference.get(), ((C1025ja) c0921ba.f14043a).f14322d)) {
                            return l(weakReference.get(), rVar, i5 + 1, c1077na);
                        }
                    }
                }
                if (f(objS0, ((C1025ja) c0921ba.f14043a).f14322d)) {
                    int i10 = f14367d + 97;
                    f14366c = i10 % 128;
                    return i10 % 2 != 0 ? l(objS0, rVar, i5, c1077na) : l(objS0, rVar, i5 + 1, c1077na);
                }
                if (((C1025ja) c0921ba.f14043a).f14330m && objS0 != null) {
                    ((HashSet) rVar.f4014e).add(objS0);
                }
                f14367d = (f14366c + 97) % 128;
                C1025ja c1025ja = (C1025ja) c0921ba.f14043a;
                ArrayList arrayListO = o(objS0, i5 >= c1025ja.f14328j, i5 >= c1025ja.k, i5 >= c1025ja.f14329l);
                f14366c = (f14367d + 87) % 128;
                if (arrayListO != null) {
                    Iterator it = arrayListO.iterator();
                    while (it.hasNext()) {
                        C1077na c1077naB = b(objS0, it.next(), c1077na);
                        C0986ga c0986ga = (C0986ga) rVar.f4013d;
                        int i11 = c0986ga.f14221b + 1;
                        c0986ga.f14221b = i11;
                        ArrayList arrayList = c0986ga.f14220a;
                        arrayList.add(i11, new ArrayList());
                        c1077naG = g(c1077naB, rVar, i5);
                        if (c1077naG != null && !rVar.f4011b) {
                            return c1077naG;
                        }
                        arrayList.remove(c0986ga.f14221b);
                        c0986ga.f14221b--;
                    }
                }
                return c1077naG;
            }
        }
        f14367d = (f14366c + 77) % 128;
        return null;
    }

    public static C1077na h(C1077na c1077na, C0986ga c0986ga, int i5) {
        C1077na c1077naK;
        int i10 = f14367d + 119;
        f14366c = i10 % 128;
        if (i10 % 2 != 0) {
            c0986ga.f14220a.size();
            throw null;
        }
        if (i5 >= c0986ga.f14220a.size()) {
            return c1077na;
        }
        List list = (List) c0986ga.f14220a.get(i5);
        Object objS0 = c1077na.s0();
        int i11 = f14366c + 115;
        f14367d = i11 % 128;
        ArrayList arrayListO = i11 % 2 == 0 ? o(objS0, true, true, false) : o(objS0, true, true, true);
        int i12 = f14367d + 57;
        f14366c = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 93 / 0;
        }
        if (arrayListO == null) {
            String strIntern = m(126 - TextUtils.lastIndexOf("", '0', 0, 0), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 126, "\u008c\u008a\u0084\u009d\u0088\u0084\u0085\u0084\u008b\u008c\u009c\u008e\u0093\u009b\u008c\u008b\u0090\u008c\u0089\u0090\u0088\u0086\u0085\u0084\u0092\u0092\u0090\u009a\u008c\u008a\u0084\u0086\u0085\u0084\u008e\u0099\u0097").intern());
            sb2.append(objS0.getClass());
            Ab.x(strIntern, sb2.toString());
            return null;
        }
        Iterator it = arrayListO.iterator();
        f14366c = (f14367d + 115) % 128;
        while (it.hasNext()) {
            int i14 = f14366c + 19;
            f14367d = i14 % 128;
            if (i14 % 2 == 0) {
                Object next = it.next();
                k(next, list, b(objS0, next, c1077na));
                throw null;
            }
            Object next2 = it.next();
            try {
                c1077naK = k(next2, list, b(objS0, next2, c1077na));
            } catch (Exception unused) {
            }
            if (c1077naK != null) {
                f14367d = (f14366c + 61) % 128;
                C1077na c1077naH = h(c1077naK, c0986ga, i5 + 1);
                int i15 = f14366c + 5;
                f14367d = i15 % 128;
                if (i15 % 2 != 0) {
                    return c1077naH;
                }
                throw null;
            }
        }
        return null;
    }

    public static String j(Object obj, String str) throws SecurityException {
        int i5 = f14367d + 17;
        f14366c = i5 % 128;
        if (i5 % 2 != 0) {
            c(obj, obj.getClass(), str);
            throw null;
        }
        String strC = c(obj, obj.getClass(), str);
        int i10 = f14367d + 49;
        f14366c = i10 % 128;
        if (i10 % 2 == 0) {
            return strC;
        }
        throw null;
    }

    public static C1077na k(Object obj, List list, C1077na c1077na) throws IllegalAccessException, IllegalArgumentException {
        Object obj2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if (WeakReference.class.isAssignableFrom(field.getType())) {
                int i5 = f14367d + 13;
                f14366c = i5 % 128;
                if (i5 % 2 != 0) {
                    obj2 = ((WeakReference) field.get(obj)).get();
                    int i10 = 1 / 0;
                } else {
                    obj2 = ((WeakReference) field.get(obj)).get();
                }
            } else {
                obj2 = field.get(obj);
                f14367d = (f14366c + 39) % 128;
            }
            C1077na c1077na2 = new C1077na();
            c1077na2.f14434K = field;
            c1077na2.f14436N = obj;
            c1077na2.f14437O = c1077na;
            f14367d = (f14366c + 7) % 128;
            obj = obj2;
            c1077na = c1077na2;
        }
        return c1077na;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Va.C1077na l(java.lang.Object r10, F6.r r11, int r12, Va.C1077na r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1051la.l(java.lang.Object, F6.r, int, Va.na):Va.na");
    }

    public static String m(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14365b;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 5);
                        AbstractC0897a.f13938v = i10 + 1;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    public static String n(Class cls, String str) {
        int i5 = f14366c + 71;
        f14367d = i5 % 128;
        if (i5 % 2 == 0) {
            c(null, cls, str);
            throw null;
        }
        String strC = c(null, cls, str);
        f14367d = (f14366c + 101) % 128;
        return strC;
    }

    public static ArrayList o(Object obj, boolean z2, boolean z10, boolean z11) {
        int i5 = f14367d;
        int i10 = i5 + 91;
        f14366c = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (obj != null) {
            f14366c = (i5 + 89) % 128;
            if (obj instanceof Collection) {
                f14366c = (i5 + 3) % 128;
                if (z2) {
                    return new ArrayList((Collection) obj);
                }
            }
            if (obj.getClass().isArray() && z11) {
                ArrayList arrayList = new ArrayList(Arrays.asList(obj));
                f14367d = (f14366c + 89) % 128;
                return arrayList;
            }
            if ((obj instanceof Map) && z10) {
                Map map = (Map) obj;
                ArrayList arrayList2 = new ArrayList(map.values());
                arrayList2.addAll(map.keySet());
                f14366c = (f14367d + 7) % 128;
                return arrayList2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007c, code lost:
    
        r5 = m(127 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        r0 = new java.lang.StringBuilder();
        r0.append(r6);
        r0.append(m((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 127, "\u008c\u009e").intern());
        r0.append(r7);
        Va.Ab.b(r5, r0.toString());
        Va.C1051la.f14366c = (Va.C1051la.f14367d + 59) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r5 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        r0 = m(127 - android.graphics.Color.blue(0), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        r2 = new java.lang.StringBuilder();
        r2.append(r6);
        r2.append(m(127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u008c\u009e").intern());
        r2.append(r7);
        r2.append(d("\u0014$\u001b\u0010%ￏￛￏ", android.graphics.Color.rgb(0, 0, 0) + 16777224, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 180, 6 - android.text.TextUtils.lastIndexOf("", '0', 0), true).intern());
        r2.append(r5.s0());
        Va.Ab.b(r0, r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void p(Va.C1077na r5, java.lang.Object r6, java.lang.String r7) {
        /*
            int r0 = Va.C1051la.f14366c
            int r0 = r0 + 47
            int r1 = r0 % 128
            Va.C1051la.f14367d = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\u008c\u009e"
            java.lang.String r2 = "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081"
            r3 = 0
            if (r0 != 0) goto L17
            r0 = 83
            int r0 = r0 / r3
            if (r5 == 0) goto L7c
            goto L19
        L17:
            if (r5 == 0) goto L7c
        L19:
            int r0 = android.graphics.Color.blue(r3)
            int r0 = 127 - r0
            java.lang.String r0 = m(r0, r2)
            java.lang.String r0 = r0.intern()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            int r6 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r6 = r6 >> 16
            int r6 = 127 - r6
            java.lang.String r6 = m(r6, r1)
            java.lang.String r6 = r6.intern()
            r2.append(r6)
            r2.append(r7)
            r6 = 16777224(0x1000008, float:2.350991E-38)
            int r7 = android.graphics.Color.rgb(r3, r3, r3)
            int r7 = r7 + r6
            int r6 = android.view.ViewConfiguration.getKeyRepeatTimeout()
            int r6 = r6 >> 16
            int r6 = r6 + 180
            java.lang.String r1 = ""
            r4 = 48
            int r1 = android.text.TextUtils.lastIndexOf(r1, r4, r3)
            int r1 = 6 - r1
            r3 = 1
            java.lang.String r4 = "\u0014$\u001b\u0010%ￏￛￏ"
            java.lang.String r6 = d(r4, r7, r6, r1, r3)
            java.lang.String r6 = r6.intern()
            r2.append(r6)
            java.lang.Object r5 = r5.s0()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            Va.Ab.b(r0, r5)
            return
        L7c:
            int r5 = android.view.ViewConfiguration.getKeyRepeatDelay()
            int r5 = r5 >> 16
            int r5 = 127 - r5
            java.lang.String r5 = m(r5, r2)
            java.lang.String r5 = r5.intern()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            int r6 = android.view.ViewConfiguration.getMaximumFlingVelocity()
            int r6 = r6 >> 16
            int r6 = r6 + 127
            java.lang.String r6 = m(r6, r1)
            java.lang.String r6 = r6.intern()
            r0.append(r6)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            Va.Ab.b(r5, r6)
            int r5 = Va.C1051la.f14367d
            int r5 = r5 + 59
            int r5 = r5 % 128
            Va.C1051la.f14366c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1051la.p(Va.na, java.lang.Object, java.lang.String):void");
    }

    public C1077na i(Object obj, C0921ba c0921ba) {
        C1077na c1077naH;
        int i5 = f14367d + 109;
        f14366c = i5 % 128;
        int i10 = i5 % 2;
        HashMap map = this.f14368a;
        if (i10 != 0) {
            System.currentTimeMillis();
            Class<?> cls = obj.getClass();
            C1025ja c1025ja = (C1025ja) c0921ba.f14043a;
            c1025ja.f14319a = cls;
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Class<?> cls2 = obj.getClass();
        C1025ja c1025ja2 = (C1025ja) c0921ba.f14043a;
        c1025ja2.f14319a = cls2;
        C0986ga c0986ga = (C0986ga) map.get(c1025ja2);
        if (c0986ga != null) {
            int i11 = f14366c + 109;
            f14367d = i11 % 128;
            int i12 = i11 % 2;
            ArrayList arrayList = c0986ga.f14220a;
            try {
                c1077naH = h(i12 == 0 ? k(obj, (List) arrayList.get(0), null) : k(obj, (List) arrayList.get(0), null), c0986ga, 1);
                int i13 = f14366c + 85;
                f14367d = i13 % 128;
                if (i13 % 2 == 0) {
                    int i14 = 45 / 0;
                }
            } catch (Exception e7) {
                Ab.R(m(126 - MotionEvent.axisFromString(""), "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m(127 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0096\u0086\u0093\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0092\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081\u008c\u0098\u0089\u0088\u0086\u0086\u0084\u0098\u008c\u008b\u0090\u008b\u008b\u0097").intern(), e7);
                c1077naH = null;
            }
            if (c1077naH != null) {
                int i15 = f14367d + 41;
                f14366c = i15 % 128;
                if (i15 % 2 != 0) {
                    a((InterfaceC1064ma) c0921ba.f14044b, c1077naH);
                    throw null;
                }
                if (a((InterfaceC1064ma) c0921ba.f14044b, c1077naH)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m(127 - KeyEvent.normalizeMetaState(0), "\u008c\u0089\u0088\u008c\u0096\u0086\u0093\u008e\u008c\u0091\u0090\u008b\u008f\u008c\u008a\u0089\u0095\u0090\u008f").intern());
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    sb2.append(d("�\u0003", 2 - View.resolveSizeAndState(0, 0, 0), 211 - TextUtils.indexOf("", "", 0), KeyEvent.normalizeMetaState(0) + 1, true).intern());
                    p(c1077naH, obj, sb2.toString());
                    return c1077naH;
                }
            }
            String strIntern = m(Gravity.getAbsoluteGravity(0, 0) + 127, "\u008b\u0084\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(d("￠ￆ\u0016\u0007\u001a\u000eￆ\u0013\u000f\u0019\u0019", Gravity.getAbsoluteGravity(0, 0) + 11, TextUtils.indexOf("", "", 0) + 189, 10 - Process.getGidForName(""), false).intern());
            Ab.x(strIntern, sb3.toString());
            map.remove(c1025ja2);
        }
        F6.r rVar = new F6.r(c0921ba);
        C1077na c1077naL = l(obj, rVar, 0, null);
        if (c1077naL == null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(d("\u0019\u0014\u0013ￅ\u0013\u000eￅ\t\u0013\u001a\u0014\u000bￅ", 13 - Drawable.resolveOpacity(0, 0), 190 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 3, true).intern());
            sb4.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sb4.append(d("\"(￡ￕ", 4 - View.MeasureSpec.makeMeasureSpec(0, 0), 174 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 3 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), false).intern());
            sb4.append(((HashSet) rVar.f4014e).size());
            sb4.append(d("\u0013ￄ\u0018\t\u0017ￄ\u0012\rￄ\u0017\u0018\u0007\t\u000e\u0006", 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 191 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 2 - TextUtils.getOffsetAfter("", 0), true).intern());
            p(null, obj, sb4.toString());
            return null;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(d("ￅ\t\u0013\u001a\u0014\u000bￅ\u0013\u000e", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 8, (ViewConfiguration.getFadingEdgeLength() >> 16) + 190, Color.red(0) + 6, true).intern());
        sb5.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sb5.append(d("\"(￡ￕ", 4 - View.MeasureSpec.makeMeasureSpec(0, 0), 175 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 5 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), false).intern());
        sb5.append(((HashSet) rVar.f4014e).size());
        sb5.append(d("\u0013ￄ\u0018\t\u0017ￄ\u0012\rￄ\u0017\u0018\u0007\t\u000e\u0006", 14 - TextUtils.lastIndexOf("", '0', 0), 191 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 2 - (KeyEvent.getMaxKeyCode() >> 16), true).intern());
        p(c1077naL, obj, sb5.toString());
        map.put(c1025ja2, (C0986ga) rVar.f4013d);
        return c1077naL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        r5 = r4.f14368a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r5 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r5.isEmpty() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        r1 = r5.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r1.hasNext() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        r2 = (java.lang.String) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if (r0.contains(r2) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
    
        r2 = (Va.C0924c0) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r2 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        r3 = Va.C0924c0.f14054l;
        r2 = r2.f14061g;
        Va.C0924c0.k = (r3 + 53) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r2 != Va.EnumC0898a0.f13945d) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean q(boolean r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L27
            java.util.List r5 = Va.Y.c()     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L24
        L10:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L32
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = r1.toLowerCase()     // Catch: java.lang.Throwable -> L24
            r0.add(r1)     // Catch: java.lang.Throwable -> L24
            goto L10
        L24:
            r5 = move-exception
            goto La0
        L27:
            java.lang.String r5 = Va.Y.f()     // Catch: java.lang.Throwable -> L24
            java.lang.String r5 = r5.toLowerCase()     // Catch: java.lang.Throwable -> L24
            r0.add(r5)     // Catch: java.lang.Throwable -> L24
        L32:
            java.util.Iterator r5 = r0.iterator()     // Catch: java.lang.Throwable -> L24
        L36:
            boolean r1 = r5.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L5f
            java.lang.Object r1 = r5.next()     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L24
            java.util.HashMap r2 = r4.f14368a     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L4d
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L24
            Va.c0 r1 = (Va.C0924c0) r1     // Catch: java.lang.Throwable -> L24
            goto L4e
        L4d:
            r1 = 0
        L4e:
            if (r1 == 0) goto L9d
            int r2 = Va.C0924c0.f14054l     // Catch: java.lang.Throwable -> L24
            Va.a0 r1 = r1.f14061g     // Catch: java.lang.Throwable -> L24
            int r2 = r2 + 53
            int r2 = r2 % 128
            Va.C0924c0.k = r2     // Catch: java.lang.Throwable -> L24
            Va.a0 r2 = Va.EnumC0898a0.f13945d     // Catch: java.lang.Throwable -> L24
            if (r1 == r2) goto L36
            goto L9d
        L5f:
            java.util.HashMap r5 = r4.f14368a     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L9d
            boolean r1 = r5.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L6a
            goto L9d
        L6a:
            java.util.Set r1 = r5.keySet()     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L24
        L72:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L9d
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L24
            boolean r3 = r0.contains(r2)     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L72
            java.lang.Object r2 = r5.get(r2)     // Catch: java.lang.Throwable -> L24
            Va.c0 r2 = (Va.C0924c0) r2     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L72
            int r3 = Va.C0924c0.f14054l     // Catch: java.lang.Throwable -> L24
            Va.a0 r2 = r2.f14061g     // Catch: java.lang.Throwable -> L24
            int r3 = r3 + 53
            int r3 = r3 % 128
            Va.C0924c0.k = r3     // Catch: java.lang.Throwable -> L24
            Va.a0 r3 = Va.EnumC0898a0.f13945d     // Catch: java.lang.Throwable -> L24
            if (r2 != r3) goto L72
            monitor-exit(r4)
            r5 = 1
            return r5
        L9d:
            monitor-exit(r4)
            r5 = 0
            return r5
        La0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L24
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C1051la.q(boolean):boolean");
    }
}
