package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agas {
    private static final Set<String> DEPRECATED_LIST_METHODS;
    private static final Set<String> DROP_LIST_METHOD_SIGNATURES;
    private static final Set<String> HIDDEN_CONSTRUCTOR_SIGNATURES;
    private static final Set<String> HIDDEN_METHOD_SIGNATURES;
    public static final agas INSTANCE;
    private static final Set<String> MUTABLE_METHOD_SIGNATURES;
    private static final Set<String> VISIBLE_CONSTRUCTOR_SIGNATURES;
    private static final Set<String> VISIBLE_METHOD_SIGNATURES;

    static {
        agas agasVar = new agas();
        INSTANCE = agasVar;
        DROP_LIST_METHOD_SIGNATURES = woy.aT(ahft.INSTANCE.inJavaUtil("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        ahft ahftVar = ahft.INSTANCE;
        HIDDEN_METHOD_SIGNATURES = woy.aS(woy.aS(woy.aS(woy.aS(woy.aS(woy.aS(agasVar.buildPrimitiveValueMethodsSet(), ahftVar.inJavaUtil("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), ahftVar.inJavaLang("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), ahftVar.inJavaLang("Double", "isInfinite()Z", "isNaN()Z")), ahftVar.inJavaLang("Float", "isInfinite()Z", "isNaN()Z")), ahftVar.inJavaLang("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), ahftVar.inJavaLang("CharSequence", "isEmpty()Z"));
        DEPRECATED_LIST_METHODS = ahft.INSTANCE.inJavaUtil("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        ahft ahftVar2 = ahft.INSTANCE;
        VISIBLE_METHOD_SIGNATURES = woy.aS(woy.aS(woy.aS(woy.aS(woy.aS(woy.aS(ahftVar2.inJavaLang("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), ahftVar2.inJavaUtil("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), ahftVar2.inJavaLang("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), ahftVar2.inJavaLang("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), ahftVar2.inJavaUtil("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), ahftVar2.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), ahftVar2.inJavaUtil("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        ahft ahftVar3 = ahft.INSTANCE;
        MUTABLE_METHOD_SIGNATURES = woy.aS(woy.aS(ahftVar3.inJavaUtil("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), ahftVar3.inJavaUtil("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), ahftVar3.inJavaUtil("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        ahft ahftVar4 = ahft.INSTANCE;
        Set<String> setBuildPrimitiveStringConstructorsSet = agasVar.buildPrimitiveStringConstructorsSet();
        String[] strArrConstructors = ahftVar4.constructors("D");
        Set setAS = woy.aS(setBuildPrimitiveStringConstructorsSet, ahftVar4.inJavaLang("Float", (String[]) Arrays.copyOf(strArrConstructors, strArrConstructors.length)));
        String[] strArrConstructors2 = ahftVar4.constructors("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        HIDDEN_CONSTRUCTOR_SIGNATURES = woy.aS(setAS, ahftVar4.inJavaLang("String", (String[]) Arrays.copyOf(strArrConstructors2, strArrConstructors2.length)));
        ahft ahftVar5 = ahft.INSTANCE;
        String[] strArrConstructors3 = ahftVar5.constructors("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        VISIBLE_CONSTRUCTOR_SIGNATURES = ahftVar5.inJavaLang("Throwable", (String[]) Arrays.copyOf(strArrConstructors3, strArrConstructors3.length));
    }

    private agas() {
    }

    private final Set<String> buildPrimitiveStringConstructorsSet() {
        ahft ahftVar = ahft.INSTANCE;
        ahwe ahweVar = ahwe.BYTE;
        List listBi = woy.bi(ahwe.BOOLEAN, ahweVar, ahwe.DOUBLE, ahwe.FLOAT, ahweVar, ahwe.INT, ahwe.LONG, ahwe.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listBi.iterator();
        while (it.hasNext()) {
            String strAsString = ((ahwe) it.next()).getWrapperFqName().shortName().asString();
            strAsString.getClass();
            String[] strArrConstructors = ahftVar.constructors("Ljava/lang/String;");
            woy.cq(linkedHashSet, ahftVar.inJavaLang(strAsString, (String[]) Arrays.copyOf(strArrConstructors, strArrConstructors.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> buildPrimitiveValueMethodsSet() {
        ahft ahftVar = ahft.INSTANCE;
        List<ahwe> listBi = woy.bi(ahwe.BOOLEAN, ahwe.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (ahwe ahweVar : listBi) {
            String strAsString = ahweVar.getWrapperFqName().shortName().asString();
            strAsString.getClass();
            woy.cq(linkedHashSet, ahftVar.inJavaLang(strAsString, ahweVar.getJavaKeywordName() + "Value()" + ahweVar.getDesc()));
        }
        return linkedHashSet;
    }

    public final Set<String> getDEPRECATED_LIST_METHODS() {
        return DEPRECATED_LIST_METHODS;
    }

    public final Set<String> getDROP_LIST_METHOD_SIGNATURES() {
        return DROP_LIST_METHOD_SIGNATURES;
    }

    public final Set<String> getHIDDEN_CONSTRUCTOR_SIGNATURES() {
        return HIDDEN_CONSTRUCTOR_SIGNATURES;
    }

    public final Set<String> getHIDDEN_METHOD_SIGNATURES() {
        return HIDDEN_METHOD_SIGNATURES;
    }

    public final Set<String> getMUTABLE_METHOD_SIGNATURES() {
        return MUTABLE_METHOD_SIGNATURES;
    }

    public final Set<String> getVISIBLE_CONSTRUCTOR_SIGNATURES() {
        return VISIBLE_CONSTRUCTOR_SIGNATURES;
    }

    public final Set<String> getVISIBLE_METHOD_SIGNATURES() {
        return VISIBLE_METHOD_SIGNATURES;
    }

    public final boolean isArrayOrPrimitiveArray(ahnh ahnhVar) {
        ahnhVar.getClass();
        return affa.f(ahnhVar, afyn.array) || afyo.isPrimitiveArray(ahnhVar);
    }

    public final boolean isSerializableInJava(ahnh ahnhVar) {
        ahnhVar.getClass();
        if (isArrayOrPrimitiveArray(ahnhVar)) {
            return true;
        }
        ahnd ahndVarMapKotlinToJava = afzq.INSTANCE.mapKotlinToJava(ahnhVar);
        if (ahndVarMapKotlinToJava != null) {
            try {
                return Serializable.class.isAssignableFrom(Class.forName(ahndVarMapKotlinToJava.asSingleFqName().asString()));
            } catch (ClassNotFoundException unused) {
            }
        }
        return false;
    }
}
