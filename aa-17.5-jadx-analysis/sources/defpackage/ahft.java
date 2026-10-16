package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ahft {
    public static final ahft INSTANCE = new ahft();

    private ahft() {
    }

    private final String escapeClassName(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return "L" + str + ';';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence jvmDescriptor$lambda$0(String str) {
        str.getClass();
        return INSTANCE.escapeClassName(str);
    }

    public final String[] constructors(String... strArr) {
        strArr.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final Set<String> inClass(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final Set<String> inJavaLang(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaLang(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final Set<String> inJavaUtil(String str, String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaUtil(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final String javaFunction(String str) {
        str.getClass();
        return "java/util/function/".concat(str);
    }

    public final String javaLang(String str) {
        str.getClass();
        return "java/lang/".concat(str);
    }

    public final String javaUtil(String str) {
        str.getClass();
        return "java/util/".concat(str);
    }

    public final String javaUtilConcurrentAtomic(String str) {
        str.getClass();
        return "java/util/concurrent/atomic/".concat(str);
    }

    public final String jvmDescriptor(String str, List<String> list, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        return str + '(' + woy.cu(list, "", null, null, ahfs.INSTANCE, 30) + ')' + escapeClassName(str2);
    }

    public final String signature(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + '.' + str2;
    }
}
