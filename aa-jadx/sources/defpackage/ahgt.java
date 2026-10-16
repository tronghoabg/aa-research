package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahgt {
    public static final defpackage.ahgt INSTANCE = new defpackage.ahgt();

    private ahgt() {
    }

    private final java.lang.String escapeClassName(java.lang.String str) {
        if (str.length() <= 1) {
            return str;
        }
        return "L" + str + ';';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence jvmDescriptor$lambda$0(java.lang.String str) {
        str.getClass();
        return INSTANCE.escapeClassName(str);
    }

    public final java.lang.String[] constructors(java.lang.String... strArr) {
        strArr.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public final java.util.Set<java.lang.String> inClass(java.lang.String str, java.lang.String... strArr) {
        str.getClass();
        strArr.getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public final java.util.Set<java.lang.String> inJavaLang(java.lang.String str, java.lang.String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaLang(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final java.util.Set<java.lang.String> inJavaUtil(java.lang.String str, java.lang.String... strArr) {
        str.getClass();
        strArr.getClass();
        return inClass(javaUtil(str), (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length));
    }

    public final java.lang.String javaFunction(java.lang.String str) {
        str.getClass();
        return "java/util/function/".concat(str);
    }

    public final java.lang.String javaLang(java.lang.String str) {
        str.getClass();
        return "java/lang/".concat(str);
    }

    public final java.lang.String javaUtil(java.lang.String str) {
        str.getClass();
        return "java/util/".concat(str);
    }

    public final java.lang.String javaUtilConcurrentAtomic(java.lang.String str) {
        str.getClass();
        return "java/util/concurrent/atomic/".concat(str);
    }

    public final java.lang.String jvmDescriptor(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        return str + '(' + defpackage.afga.bo(list, "", null, null, defpackage.ahgs.INSTANCE, 30) + ')' + escapeClassName(str2);
    }

    public final java.lang.String signature(java.lang.String str, java.lang.String str2) {
        str.getClass();
        str2.getClass();
        return str + '.' + str2;
    }
}
