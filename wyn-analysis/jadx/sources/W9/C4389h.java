package w9;

import R8.v;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import m9.C3514m;
import m9.InterfaceC3511j;
import m9.U;
import m9.Z;
import org.apache.tika.utils.StringUtils;
import s8.q;

/* renamed from: w9.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4389h {

    /* renamed from: a, reason: collision with root package name */
    public final Class f47432a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f47433b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f47434c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f47435d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f47436e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f47437f;

    /* renamed from: g, reason: collision with root package name */
    public final HashSet f47438g;

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0381, code lost:
    
        if (r20.f47433b.isEmpty() != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0383, code lost:
    
        r1 = r20.f47438g.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x038d, code lost:
    
        if (r1.hasNext() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x038f, code lost:
    
        r2 = (java.lang.String) r1.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x039b, code lost:
    
        if (r20.f47435d.containsKey(r2) != false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03a3, code lost:
    
        if (r20.f47436e.containsKey(r2) == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03a6, code lost:
    
        r2 = com.google.android.gms.internal.consent_sdk.a.w("@DocumentId is annotated on property ", r2, " of class ");
        r2.append(r21.getName());
        r2.append(" but no field or public setter was found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03c3, code lost:
    
        throw new java.lang.RuntimeException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x03d4, code lost:
    
        throw new java.lang.RuntimeException("No properties to serialize found on class ".concat(r21.getName()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C4389h(java.lang.Class r21) throws java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.C4389h.<init>(java.lang.Class):void");
    }

    public static String b(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(U.class)) {
            return ((U) accessibleObject.getAnnotation(U.class)).value();
        }
        return null;
    }

    public static void d(String str, String str2, Class cls) {
        if (cls == String.class || cls == C3514m.class) {
            return;
        }
        throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + StringUtils.SPACE + cls + " instead of String or DocumentReference.");
    }

    public static boolean e(Method method, Method method2) {
        AbstractC4391j.a("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        AbstractC4391j.a("Expected void return type", returnType.equals(cls));
        AbstractC4391j.a("Expected void return type", method2.getReturnType().equals(cls));
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        AbstractC4391j.a("Expected exactly one parameter", parameterTypes.length == 1);
        AbstractC4391j.a("Expected exactly one parameter", parameterTypes2.length == 1);
        return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
    }

    public static String f(Method method) {
        String strB = b(method);
        if (strB != null) {
            return strB;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        for (int i5 = 0; i5 < 3; i5++) {
            String str2 = strArr[i5];
            if (name.startsWith(str2)) {
                str = str2;
            }
        }
        if (str == null) {
            throw new IllegalArgumentException(v.f("Unknown Bean prefix for method: ", name));
        }
        char[] charArray = name.substring(str.length()).toCharArray();
        for (int i10 = 0; i10 < charArray.length && Character.isUpperCase(charArray[i10]); i10++) {
            charArray[i10] = Character.toLowerCase(charArray[i10]);
        }
        return new String(charArray);
    }

    public final void a(String str) {
        Locale locale = Locale.US;
        String str2 = (String) this.f47433b.put(str.toLowerCase(locale), str);
        if (str2 == null || str.equals(str2)) {
            return;
        }
        throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
    }

    public final void c(Field field) {
        if (field.isAnnotationPresent(Z.class)) {
            Class<?> type = field.getType();
            if (type != Date.class && type != q.class) {
                throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
            }
            String strB = b(field);
            if (strB == null) {
                strB = field.getName();
            }
            this.f47437f.add(strB);
        }
        if (field.isAnnotationPresent(InterfaceC3511j.class)) {
            d("Field", "is", field.getType());
            String strB2 = b(field);
            if (strB2 == null) {
                strB2 = field.getName();
            }
            this.f47438g.add(strB2);
        }
    }
}
