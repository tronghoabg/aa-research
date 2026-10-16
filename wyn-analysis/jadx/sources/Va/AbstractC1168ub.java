package Va;

import android.os.Process;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.unity3d.services.UnityAdsConstants;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Va.ub, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1168ub {

    /* renamed from: c, reason: collision with root package name */
    public static int f14681c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f14682d = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final char[] f14680b = {157, 176, 177, 183, 174, 191, 180, 186, 185, 160, 190, 142, 172, 'k', 192, 175, 144, 189, 178, 179, 184, 153, 'r', 'y', 188, 196};

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f14679a = new ConcurrentHashMap();

    static {
        int i5 = f14682d + 37;
        f14681c = i5 % 128;
        if (i5 % 2 != 0) {
            int i10 = 57 / 0;
        }
    }

    public static Class a(String str, boolean z2) {
        f14682d = (f14681c + 1) % 128;
        try {
            Class<?> cls = Class.forName(str);
            int i5 = f14681c + 13;
            f14682d = i5 % 128;
            if (i5 % 2 != 0) {
                return cls;
            }
            throw null;
        } catch (Throwable th) {
            if (z2) {
                String strIntern = c((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(c((ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 126, "\u008e\u008b\u008b\u008d\u0084\u008c").intern());
                sb2.append(str);
                sb2.append(c((Process.myTid() >> 22) + 127, "\u0090\u0089\u008f\u0088\u0083\u008e\u0086\u0088\u0089\u008e").intern());
                AbstractC0897a.f(strIntern, sb2.toString(), th);
            }
            return null;
        }
    }

    public static Method b(Object obj, String str, ArrayList arrayList) throws NoSuchMethodException, SecurityException {
        int i5 = f14681c + 75;
        f14682d = i5 % 128;
        try {
            if (i5 % 2 == 0) {
                h(arrayList);
                boolean z2 = obj instanceof Class;
                throw null;
            }
            Class<?>[] clsArrH = h(arrayList);
            if (!(obj instanceof Class)) {
                return obj.getClass().getMethod(str, clsArrH);
            }
            int i10 = f14681c + 95;
            f14682d = i10 % 128;
            try {
                if (i10 % 2 != 0) {
                    return ((Class) obj).getMethod(str, clsArrH);
                }
                ((Class) obj).getMethod(str, clsArrH);
                throw null;
            } catch (NoSuchMethodException unused) {
                return Class.class.getMethod(str, clsArrH);
            }
        } catch (NoSuchMethodException e7) {
            String strIntern = c(ExpandableListView.getPackedPositionChild(0L) + 128, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c(127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), "\u0097\u008e\u0088\u0096").intern());
            sb2.append(str);
            sb2.append(c(127 - View.combineMeasuredStates(0, 0), "\u008e\u0092\u0088\u0083\u008e\u0090\u0089\u008f\u0088\u0083\u008e\u0090\u0088\u0094\u0086\u0082\u0095\u008e\u0097").intern());
            sb2.append(obj);
            AbstractC0897a.f(strIntern, sb2.toString(), e7);
            return null;
        }
    }

    public static String c(int i5, String str) throws UnsupportedEncodingException {
        String str2;
        byte[] bytes = str.getBytes("ISO-8859-1");
        synchronized (AbstractC0897a.f13940x) {
            try {
                char[] cArr = f14680b;
                int length = bytes.length;
                AbstractC0897a.f13939w = length;
                char[] cArr2 = new char[length];
                AbstractC0897a.f13938v = 0;
                while (true) {
                    int i10 = AbstractC0897a.f13938v;
                    if (i10 < AbstractC0897a.f13939w) {
                        cArr2[i10] = (char) (cArr[bytes[(r4 - 1) - i10] + i5] - 'K');
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

    public static Method d(Object obj, String str, List list) throws SecurityException {
        f14682d = (f14681c + 27) % 128;
        Method methodJ = j(obj.getClass(), str, list, false);
        int i5 = f14682d + 85;
        f14681c = i5 % 128;
        if (i5 % 2 == 0) {
            return methodJ;
        }
        throw null;
    }

    public static boolean e(Class[] clsArr, List list) {
        int i5 = f14682d + 27;
        f14681c = i5 % 128;
        for (int i10 = i5 % 2 != 0 ? 1 : 0; i10 < clsArr.length; i10++) {
            int i11 = f14681c + 89;
            f14682d = i11 % 128;
            if (i11 % 2 == 0) {
                list.get(i10);
                throw null;
            }
            Object obj = list.get(i10);
            if (obj != null || Object.class.isAssignableFrom(clsArr[i10])) {
                if (obj != null) {
                    Class cls = clsArr[i10];
                    Class<?> cls2 = obj.getClass();
                    if (cls.isAssignableFrom(Byte.TYPE)) {
                        f14682d = (f14681c + 111) % 128;
                        if (cls2.isAssignableFrom(Byte.class)) {
                            continue;
                        }
                    }
                    Class<?> cls3 = Short.TYPE;
                    if (cls.isAssignableFrom(cls3)) {
                        f14682d = (f14681c + 51) % 128;
                        if (cls2.isAssignableFrom(Short.class)) {
                            continue;
                        }
                    }
                    if (cls.isAssignableFrom(cls3)) {
                        f14681c = (f14682d + 115) % 128;
                        if (cls2.isAssignableFrom(Byte.class)) {
                            continue;
                        }
                    }
                    Class<?> cls4 = Integer.TYPE;
                    if (cls.isAssignableFrom(cls4)) {
                        int i12 = f14681c + 125;
                        f14682d = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 81 / 0;
                            if (cls2.isAssignableFrom(Integer.class)) {
                                continue;
                            }
                        } else if (cls2.isAssignableFrom(Integer.class)) {
                            continue;
                        }
                    }
                    if (cls.isAssignableFrom(cls4)) {
                        int i14 = f14681c + 59;
                        f14682d = i14 % 128;
                        if (i14 % 2 == 0) {
                            cls2.isAssignableFrom(Short.class);
                            throw null;
                        }
                        if (cls2.isAssignableFrom(Short.class)) {
                            continue;
                        }
                    }
                    if (!cls.isAssignableFrom(cls4) || !cls2.isAssignableFrom(Byte.class)) {
                        Class<?> cls5 = Long.TYPE;
                        if ((!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Long.class)) && (!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Integer.class))) {
                            if (cls.isAssignableFrom(cls5)) {
                                f14681c = (f14682d + 25) % 128;
                                if (cls2.isAssignableFrom(Short.class)) {
                                    continue;
                                }
                            }
                            if (!cls.isAssignableFrom(cls5) || !cls2.isAssignableFrom(Byte.class)) {
                                Class<?> cls6 = Float.TYPE;
                                if (cls.isAssignableFrom(cls6)) {
                                    f14682d = (f14681c + 89) % 128;
                                    if (cls2.isAssignableFrom(Float.class)) {
                                        continue;
                                    }
                                }
                                if ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Integer.class)) && ((!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Short.class)) && (!cls.isAssignableFrom(cls6) || !cls2.isAssignableFrom(Byte.class))))) {
                                    Class<?> cls7 = Double.TYPE;
                                    if (cls.isAssignableFrom(cls7)) {
                                        f14681c = (f14682d + 49) % 128;
                                        if (!(!cls2.isAssignableFrom(Double.class))) {
                                            continue;
                                        }
                                    }
                                    if ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Float.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Long.class)) && ((!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Integer.class)) && (!cls.isAssignableFrom(cls7) || !cls2.isAssignableFrom(Short.class))))) {
                                        if (cls.isAssignableFrom(cls7)) {
                                            f14682d = (f14681c + 25) % 128;
                                            if (cls2.isAssignableFrom(Byte.class)) {
                                                continue;
                                            }
                                        }
                                        if (cls.isAssignableFrom(Boolean.TYPE)) {
                                            int i15 = f14682d + 31;
                                            f14681c = i15 % 128;
                                            if (i15 % 2 != 0) {
                                                cls2.isAssignableFrom(Boolean.class);
                                                throw null;
                                            }
                                            if (cls2.isAssignableFrom(Boolean.class)) {
                                                continue;
                                            }
                                        }
                                        if (cls.isAssignableFrom(cls2)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static Field[] f(Field[] fieldArr, Field[] fieldArr2) {
        int i5 = f14681c + 23;
        f14682d = i5 % 128;
        if (i5 % 2 == 0) {
            int length = fieldArr.length;
            int length2 = fieldArr2.length;
            Field[] fieldArr3 = new Field[length >> length2];
            System.arraycopy(fieldArr, 1, fieldArr3, 1, length);
            System.arraycopy(fieldArr2, 1, fieldArr3, length, length2);
            return fieldArr3;
        }
        int length3 = fieldArr.length;
        int length4 = fieldArr2.length;
        Field[] fieldArr4 = new Field[length3 + length4];
        System.arraycopy(fieldArr, 0, fieldArr4, 0, length3);
        System.arraycopy(fieldArr2, 0, fieldArr4, length3, length4);
        return fieldArr4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        if (Va.AbstractC1168ub.class.getPackage() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        if (Va.AbstractC1168ub.class.getPackage() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bc, code lost:
    
        Va.AbstractC1168ub.f14681c = (Va.AbstractC1168ub.f14682d + 85) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c8, code lost:
    
        if (r6.getPackage() == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        if (Va.AbstractC1168ub.class.getPackage() == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dc, code lost:
    
        if (Va.AbstractC1168ub.class.getPackage().equals(r6.getPackage()) == false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean g(java.lang.Class r6, java.util.List r7) {
        /*
            r0 = 0
            if (r6 == 0) goto Ldf
            r1 = 1
            if (r7 == 0) goto Lde
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto Le
            goto Lde
        Le:
            java.util.Iterator r7 = r7.iterator()
            int r2 = Va.AbstractC1168ub.f14681c
            int r2 = r2 + 121
            int r2 = r2 % 128
            Va.AbstractC1168ub.f14682d = r2
        L1a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = ""
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L64
            int r4 = Va.AbstractC1168ub.f14682d
            int r4 = r4 + 21
            int r4 = r4 % 128
            Va.AbstractC1168ub.f14681c = r4
            java.lang.Package r4 = r6.getPackage()
            if (r4 == 0) goto L74
            int r4 = Va.AbstractC1168ub.f14681c
            int r4 = r4 + 19
            int r5 = r4 % 128
            Va.AbstractC1168ub.f14682d = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L57
            java.lang.Package r4 = r6.getPackage()
            java.lang.String r4 = r4.getName()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L74
            goto L64
        L57:
            java.lang.Package r6 = r6.getPackage()
            java.lang.String r6 = r6.getName()
            r6.equals(r3)
            r6 = 0
            throw r6
        L64:
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L1a
            java.lang.String r3 = r6.getName()
            boolean r2 = r3.startsWith(r2)
            if (r2 == 0) goto L1a
        L74:
            int r6 = Va.AbstractC1168ub.f14682d
            int r6 = r6 + 21
            int r7 = r6 % 128
            Va.AbstractC1168ub.f14681c = r7
            int r6 = r6 % 2
            if (r6 == 0) goto Lde
            r6 = 11
            int r6 = r6 / r0
            return r1
        L84:
            java.lang.Class<Va.ub> r7 = Va.AbstractC1168ub.class
            java.lang.String r2 = r7.getName()
            int r3 = android.view.KeyEvent.getDeadChar(r0, r0)
            int r3 = 127 - r3
            java.lang.String r4 = "\u009a\u0086\u0087\u0084\u008d\u008f\u0099\u0090\u008d\u0098\u0082\u0085\u0092\u008f\u0088\u008b\u0089\u0088\u0092\u0087\u0098\u0095\u0088\u0085"
            java.lang.String r3 = c(r3, r4)
            java.lang.String r3 = r3.intern()
            boolean r2 = r2.startsWith(r3)
            if (r2 != 0) goto Ldf
            int r2 = Va.AbstractC1168ub.f14682d
            int r2 = r2 + 75
            int r3 = r2 % 128
            Va.AbstractC1168ub.f14681c = r3
            int r2 = r2 % 2
            if (r2 == 0) goto Lb6
            java.lang.Package r2 = r7.getPackage()
            r3 = 79
            int r3 = r3 / r0
            if (r2 != 0) goto Lca
            goto Lbc
        Lb6:
            java.lang.Package r2 = r7.getPackage()
            if (r2 != 0) goto Lca
        Lbc:
            int r2 = Va.AbstractC1168ub.f14682d
            int r2 = r2 + 85
            int r2 = r2 % 128
            Va.AbstractC1168ub.f14681c = r2
            java.lang.Package r2 = r6.getPackage()
            if (r2 == 0) goto Lde
        Lca:
            java.lang.Package r2 = r7.getPackage()
            if (r2 == 0) goto Ldf
            java.lang.Package r7 = r7.getPackage()
            java.lang.Package r6 = r6.getPackage()
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto Ldf
        Lde:
            return r1
        Ldf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.AbstractC1168ub.g(java.lang.Class, java.util.List):boolean");
    }

    public static Class[] h(ArrayList arrayList) {
        Class[] clsArr = new Class[arrayList.size()];
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            f14682d = (f14681c + 23) % 128;
            clsArr[i5] = (Class) arrayList.get(i5);
        }
        int i10 = f14681c + 59;
        f14682d = i10 % 128;
        if (i10 % 2 != 0) {
            return clsArr;
        }
        throw null;
    }

    public static Object i(Class cls, List list) throws IllegalAccessException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor<?> constructor;
        f14681c = (f14682d + 69) % 128;
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i5 = 0;
        while (true) {
            constructor = null;
            if (i5 >= length) {
                f14681c = (f14682d + 57) % 128;
                break;
            }
            int i10 = f14682d + 69;
            f14681c = i10 % 128;
            if (i10 % 2 != 0) {
                int length2 = constructors[i5].getParameterTypes().length;
                list.size();
                throw null;
            }
            Constructor<?> constructor2 = constructors[i5];
            if (constructor2.getParameterTypes().length == list.size()) {
                int i11 = f14681c + 117;
                f14682d = i11 % 128;
                if (i11 % 2 == 0) {
                    e(constructor2.getParameterTypes(), list);
                    throw null;
                }
                boolean zE = e(constructor2.getParameterTypes(), list);
                int i12 = f14682d;
                f14681c = (i12 + 27) % 128;
                if (zE) {
                    f14681c = (i12 + 29) % 128;
                    constructor = constructor2;
                    break;
                }
            }
            i5++;
        }
        Object objNewInstance = constructor.newInstance(list.toArray());
        int i13 = f14681c + 81;
        f14682d = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 37 / 0;
        }
        return objNewInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[PHI: r4
  0x003a: PHI (r4v4 java.lang.reflect.Method) = (r4v3 java.lang.reflect.Method), (r4v5 java.lang.reflect.Method) binds: [B:11:0x0038, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Method j(java.lang.Class r7, java.lang.String r8, java.util.List r9, boolean r10) throws java.lang.SecurityException {
        /*
            java.lang.reflect.Method[] r7 = r7.getMethods()
            int r0 = r7.length
            int r1 = Va.AbstractC1168ub.f14682d
            int r1 = r1 + 23
            int r1 = r1 % 128
            Va.AbstractC1168ub.f14681c = r1
            r1 = 0
            r2 = r1
        Lf:
            r3 = 0
            if (r2 >= r0) goto L7b
            int r4 = Va.AbstractC1168ub.f14681c
            int r4 = r4 + 63
            int r5 = r4 % 128
            Va.AbstractC1168ub.f14682d = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L2e
            r4 = r7[r2]
            java.lang.String r5 = r4.getName()
            boolean r5 = r5.equals(r8)
            r6 = 90
            int r6 = r6 / r1
            if (r5 == 0) goto L78
            goto L3a
        L2e:
            r4 = r7[r2]
            java.lang.String r5 = r4.getName()
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L78
        L3a:
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            int r6 = r9.size()
            if (r5 != r6) goto L78
            int r5 = Va.AbstractC1168ub.f14681c
            int r5 = r5 + 11
            int r5 = r5 % 128
            Va.AbstractC1168ub.f14682d = r5
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != r10) goto L78
            int r5 = Va.AbstractC1168ub.f14682d
            int r5 = r5 + 123
            int r6 = r5 % 128
            Va.AbstractC1168ub.f14681c = r6
            int r5 = r5 % 2
            if (r5 != 0) goto L70
            java.lang.Class[] r3 = r4.getParameterTypes()
            boolean r3 = e(r3, r9)
            r5 = 1
            if (r3 == r5) goto L6f
            goto L78
        L6f:
            return r4
        L70:
            java.lang.Class[] r7 = r4.getParameterTypes()
            e(r7, r9)
            throw r3
        L78:
            int r2 = r2 + 1
            goto Lf
        L7b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.AbstractC1168ub.j(java.lang.Class, java.lang.String, java.util.List, boolean):java.lang.reflect.Method");
    }

    public static Method k(Object obj, String str, List list) {
        Method methodD;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            f14681c = (f14682d + 119) % 128;
            if (obj2 != null) {
                f14681c = (f14682d + 97) % 128;
                arrayList.add(obj2.getClass());
            } else {
                arrayList.add(Object.class);
            }
        }
        C1155tb c1155tb = new C1155tb();
        boolean z2 = obj instanceof Class;
        if (z2) {
            c1155tb.f14652a = (Class) obj;
        } else {
            c1155tb.f14652a = obj.getClass();
        }
        c1155tb.f14653b = str;
        c1155tb.f14654c = arrayList;
        ConcurrentHashMap concurrentHashMap = f14679a;
        Method method = (Method) concurrentHashMap.get(c1155tb);
        if (method != null) {
            if (e(method.getParameterTypes(), list)) {
                return method;
            }
            String strIntern = c((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, "\u008b\u0084\u0087\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0082\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c(127 - ((Process.getThreadPriority(0) + 20) >> 6), "\u008e\u0090\u0088\u0094\u0086\u0082\u0095\u008e\u0090\u0082\u0094\u0085\u008d\u0085\u008e\u0093\u0089\u0087\u0086\u0086\u0082\u0093\u008e\u0092\u0088\u0092\u0092\u0091").intern());
            sb2.append(c1155tb);
            AbstractC0897a.e(strIntern, sb2.toString());
        }
        if (z2) {
            methodD = j((Class) obj, str, list, true);
            if (methodD == null) {
                methodD = d(Class.class, str, list);
                f14681c = (f14682d + 25) % 128;
            }
        } else {
            methodD = d(obj, str, list);
        }
        if (methodD != null) {
            f14682d = (f14681c + 89) % 128;
            concurrentHashMap.put(c1155tb, methodD);
        }
        f14682d = (f14681c + 65) % 128;
        return methodD;
    }

    public static Method[] l(Method[] methodArr, Method[] methodArr2) {
        f14681c = (f14682d + 7) % 128;
        int length = methodArr.length;
        int length2 = methodArr2.length;
        Method[] methodArr3 = new Method[length + length2];
        System.arraycopy(methodArr, 0, methodArr3, 0, length);
        System.arraycopy(methodArr2, 0, methodArr3, length, length2);
        f14682d = (f14681c + 89) % 128;
        return methodArr3;
    }
}
