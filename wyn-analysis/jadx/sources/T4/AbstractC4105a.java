package t4;

import ad.r;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4105a {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f45741a = DesugarCollections.synchronizedSet(new HashSet());

    /* renamed from: b, reason: collision with root package name */
    public static final Set f45742b = DesugarCollections.synchronizedSet(new HashSet());

    /* renamed from: c, reason: collision with root package name */
    public static final Set f45743c = DesugarCollections.synchronizedSet(new HashSet());

    /* renamed from: d, reason: collision with root package name */
    public static final Set f45744d = DesugarCollections.synchronizedSet(new HashSet());

    /* renamed from: e, reason: collision with root package name */
    public static r f45745e;

    public static void a(StringBuilder sb2, String str, int i5, StackTraceElement stackTraceElement) {
        if (i5 > 0) {
            if (f45745e == null) {
                throw new IllegalArgumentException("Stack trace element serializer not initialized.");
            }
            if (i5 == 1) {
                sb2.append(r.k(stackTraceElement));
            } else {
                sb2.append(String.format("%s%s ... %d more", "", str, Integer.valueOf(i5 - 1)));
            }
        }
    }

    public static String b(Throwable th, boolean z2, Set set, Set set2, Set set3) {
        String str;
        String str2;
        String str3;
        StringBuilder sb2 = new StringBuilder();
        String name = th.getClass().getName();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i5 = 0;
        while (true) {
            str = null;
            if (i5 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i5];
            String className = stackTraceElement.getClassName();
            if (!c(className)) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str3 = null;
                        break;
                    }
                    str3 = (String) it.next();
                    if (className.startsWith(str3)) {
                        break;
                    }
                }
                if (str3 != null) {
                    arrayList.addAll(arrayList2);
                    arrayList.add(stackTraceElement);
                } else {
                    Iterator it2 = set3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str4 = (String) it2.next();
                        if (className.startsWith(str4)) {
                            str = str4;
                            break;
                        }
                    }
                    if (str == null) {
                        arrayList2.add(stackTraceElement);
                    }
                }
            }
            i5++;
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(arrayList2);
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]);
        String localizedMessage = th.getLocalizedMessage();
        if (c(localizedMessage)) {
            localizedMessage = th.getMessage();
        }
        if (z2) {
            sb2.append(System.lineSeparator());
            sb2.append("Caused by: ");
            sb2.append(name);
            if (!c(localizedMessage)) {
                sb2.append(": ");
                sb2.append(localizedMessage);
            }
        } else {
            sb2.append(System.lineSeparator());
            sb2.append(name);
            if (!c(localizedMessage)) {
                sb2.append(": ");
                sb2.append(localizedMessage);
            }
        }
        int i10 = 0;
        String str5 = null;
        StackTraceElement stackTraceElement2 = null;
        for (StackTraceElement stackTraceElement3 : stackTraceElementArr) {
            String className2 = stackTraceElement3.getClassName();
            Iterator it3 = set2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    str2 = null;
                    break;
                }
                str2 = (String) it3.next();
                if (className2.startsWith(str2)) {
                    break;
                }
            }
            if (str2 == null) {
                a(sb2, str5, i10, stackTraceElement2);
                sb2.append(System.lineSeparator());
                sb2.append("\tat ");
                if (f45745e == null) {
                    throw new IllegalArgumentException("Stack trace element serializer not initialized.");
                }
                sb2.append(r.k(stackTraceElement3));
                i10 = 0;
                str5 = null;
            } else if (str2.equals(str5)) {
                i10++;
            } else {
                a(sb2, str5, i10, stackTraceElement2);
                sb2.append(System.lineSeparator());
                sb2.append("\tat ");
                i10 = 1;
                stackTraceElement2 = stackTraceElement3;
                str5 = str2;
            }
        }
        a(sb2, str5, i10, stackTraceElement2);
        Throwable cause = th.getCause();
        if (cause != null) {
            Iterator it4 = f45744d.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                String str6 = (String) it4.next();
                if (name.startsWith(str6)) {
                    str = str6;
                    break;
                }
            }
            if (str == null) {
                sb2.append(b(cause, true, set, set2, set3));
            }
        }
        return sb2.toString();
    }

    public static boolean c(String str) {
        return str == null || str.trim().length() == 0;
    }
}
