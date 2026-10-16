package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class ahcn {
    private static final ahar NOT_NULLABLE;
    private static final ahar NOT_PLATFORM;
    private static final ahar NULLABLE = new ahar(ahau.NULLABLE, null, false, false, false, 24, null);
    private static final Map<String, ahco> PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;

    static {
        ahau ahauVar = ahau.NOT_NULL;
        NOT_PLATFORM = new ahar(ahauVar, null, false, false, false, 24, null);
        NOT_NULLABLE = new ahar(ahauVar, null, true, false, false, 24, null);
        ahft ahftVar = ahft.INSTANCE;
        String strJavaLang = ahftVar.javaLang("Object");
        String strJavaFunction = ahftVar.javaFunction("Predicate");
        String strJavaFunction2 = ahftVar.javaFunction("Function");
        String strJavaFunction3 = ahftVar.javaFunction("Consumer");
        String strJavaFunction4 = ahftVar.javaFunction("BiFunction");
        String strJavaFunction5 = ahftVar.javaFunction("BiConsumer");
        String strJavaFunction6 = ahftVar.javaFunction("UnaryOperator");
        String strJavaUtil = ahftVar.javaUtil("stream/Stream");
        String strJavaUtil2 = ahftVar.javaUtil("Optional");
        ahcx ahcxVar = new ahcx();
        ahcw.function$default(new ahcw(ahcxVar, ahftVar.javaUtil("Iterator")), "forEachRemaining", null, new ahav(strJavaFunction3), 2, null);
        ahcw.function$default(new ahcw(ahcxVar, ahftVar.javaLang("Iterable")), "spliterator", null, new ahbg(ahftVar), 2, null);
        ahcw ahcwVar = new ahcw(ahcxVar, ahftVar.javaUtil("Collection"));
        ahcw.function$default(ahcwVar, "removeIf", null, new ahbr(strJavaFunction), 2, null);
        ahcw.function$default(ahcwVar, "stream", null, new ahcc(strJavaUtil), 2, null);
        ahcw.function$default(ahcwVar, "parallelStream", null, new ahch(strJavaUtil), 2, null);
        ahcw ahcwVar2 = new ahcw(ahcxVar, ahftVar.javaUtil("List"));
        ahcw.function$default(ahcwVar2, "replaceAll", null, new ahci(strJavaFunction6), 2, null);
        ahcwVar2.function("addFirst", "2.1", new ahcj(strJavaLang));
        ahcwVar2.function("addLast", "2.1", new ahck(strJavaLang));
        ahcwVar2.function("removeFirst", "2.1", new ahcl(strJavaLang));
        ahcwVar2.function("removeLast", "2.1", new ahcm(strJavaLang));
        ahcw ahcwVar3 = new ahcw(ahcxVar, ahftVar.javaUtil("LinkedList"));
        ahcwVar3.function("addFirst", "2.1", new ahaw(strJavaLang));
        ahcwVar3.function("addLast", "2.1", new ahax(strJavaLang));
        ahcwVar3.function("removeFirst", "2.1", new ahay(strJavaLang));
        ahcwVar3.function("removeLast", "2.1", new ahaz(strJavaLang));
        ahcw ahcwVar4 = new ahcw(ahcxVar, ahftVar.javaUtil("LinkedHashSet"));
        ahcwVar4.function("addFirst", "2.2", new ahba(strJavaLang));
        ahcwVar4.function("addLast", "2.2", new ahbb(strJavaLang));
        ahcwVar4.function("removeFirst", "2.2", new ahbc(strJavaLang));
        ahcwVar4.function("removeLast", "2.2", new ahbd(strJavaLang));
        ahcwVar4.function("getFirst", "2.2", new ahbe(strJavaLang));
        ahcwVar4.function("getLast", "2.2", new ahbf(strJavaLang));
        ahcw ahcwVar5 = new ahcw(ahcxVar, ahftVar.javaUtil("Map"));
        ahcw.function$default(ahcwVar5, "forEach", null, new ahbh(strJavaFunction5), 2, null);
        ahcw.function$default(ahcwVar5, "putIfAbsent", null, new ahbi(strJavaLang), 2, null);
        ahcw.function$default(ahcwVar5, "replace", null, new ahbj(strJavaLang), 2, null);
        ahcw.function$default(ahcwVar5, "replace", null, new ahbk(strJavaLang), 2, null);
        ahcw.function$default(ahcwVar5, "replaceAll", null, new ahbl(strJavaFunction4), 2, null);
        ahcw.function$default(ahcwVar5, "compute", null, new ahbm(strJavaLang, strJavaFunction4), 2, null);
        ahcw.function$default(ahcwVar5, "computeIfAbsent", null, new ahbn(strJavaLang, strJavaFunction2), 2, null);
        ahcw.function$default(ahcwVar5, "computeIfPresent", null, new ahbo(strJavaLang, strJavaFunction4), 2, null);
        ahcw.function$default(ahcwVar5, "merge", null, new ahbp(strJavaLang, strJavaFunction4), 2, null);
        ahcw ahcwVar6 = new ahcw(ahcxVar, ahftVar.javaUtil("LinkedHashMap"));
        ahcwVar6.function("putFirst", "2.2", new ahbq(strJavaLang));
        ahcwVar6.function("putLast", "2.2", new ahbs(strJavaLang));
        ahcw ahcwVar7 = new ahcw(ahcxVar, strJavaUtil2);
        ahcw.function$default(ahcwVar7, "empty", null, new ahbt(strJavaUtil2), 2, null);
        ahcw.function$default(ahcwVar7, "of", null, new ahbu(strJavaLang, strJavaUtil2), 2, null);
        ahcw.function$default(ahcwVar7, "ofNullable", null, new ahbv(strJavaLang, strJavaUtil2), 2, null);
        ahcw.function$default(ahcwVar7, "get", null, new ahbw(strJavaLang), 2, null);
        ahcw.function$default(ahcwVar7, "ifPresent", null, new ahbx(strJavaFunction3), 2, null);
        ahcw.function$default(new ahcw(ahcxVar, ahftVar.javaLang("ref/Reference")), "get", null, new ahby(strJavaLang), 2, null);
        ahcw.function$default(new ahcw(ahcxVar, strJavaFunction), "test", null, new ahbz(strJavaLang), 2, null);
        ahcw.function$default(new ahcw(ahcxVar, ahftVar.javaFunction("BiPredicate")), "test", null, new ahca(strJavaLang), 2, null);
        ahcw.function$default(new ahcw(ahcxVar, strJavaFunction3), "accept", null, new ahcb(strJavaLang), 2, null);
        ahcw.function$default(new ahcw(ahcxVar, strJavaFunction5), "accept", null, new ahcd(strJavaLang), 2, null);
        ahcw.function$default(new ahcw(ahcxVar, strJavaFunction2), "apply", null, new ahce(strJavaLang), 2, null);
        ahcw.function$default(new ahcw(ahcxVar, strJavaFunction4), "apply", null, new ahcf(strJavaLang), 2, null);
        ahcw.function$default(new ahcw(ahcxVar, ahftVar.javaFunction("Supplier")), "get", null, new ahcg(strJavaLang), 2, null);
        PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE = ahcxVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$0$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar, aharVar);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$1$0(ahft ahftVar, ahcv ahcvVar) {
        ahcvVar.getClass();
        String strJavaUtil = ahftVar.javaUtil("Spliterator");
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.returns(strJavaUtil, aharVar, aharVar);
        ahcvVar.mustUseReturnValue();
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$10$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NOT_PLATFORM);
        ahcvVar.returns(ahwe.BOOLEAN);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$11$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str, aharVar);
        ahcvVar.returns(ahwe.BOOLEAN);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$12$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$13$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str, aharVar);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$14$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.returns(str, aharVar);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$15$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str, aharVar);
        ahcvVar.returns(str, aharVar);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$16$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$2$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar, aharVar);
        ahcvVar.returns(ahwe.BOOLEAN);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$2$1(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.returns(str, aharVar, aharVar);
        ahcvVar.mustUseReturnValue();
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$2$2(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.returns(str, aharVar, aharVar);
        ahcvVar.mustUseReturnValue();
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar, aharVar);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$1(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$2(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$3(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$4(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$4$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$4$1(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$4$2(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$4$3(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$1(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$2(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$3(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$4(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM);
        ahcvVar.mustUseReturnValue();
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$5(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM);
        ahcvVar.mustUseReturnValue();
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar, aharVar, aharVar);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$1(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str, aharVar);
        ahcvVar.returns(str, NULLABLE);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$2(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str, aharVar);
        ahcvVar.returns(str, NULLABLE);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$3(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str, aharVar);
        ahcvVar.returns(ahwe.BOOLEAN);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$4(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar, aharVar, aharVar, aharVar);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$5(String str, String str2, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahar aharVar2 = NULLABLE;
        ahcvVar.parameter(str2, aharVar, aharVar, aharVar2, aharVar2);
        ahcvVar.returns(str, aharVar2);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$6(String str, String str2, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str2, aharVar, aharVar, aharVar);
        ahcvVar.returns(str, aharVar);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$7(String str, String str2, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahar aharVar2 = NULLABLE;
        ahcvVar.parameter(str2, aharVar, aharVar, NOT_NULLABLE, aharVar2);
        ahcvVar.returns(str, aharVar2);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$8(String str, String str2, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahar aharVar2 = NOT_NULLABLE;
        ahcvVar.parameter(str, aharVar2);
        ahar aharVar3 = NULLABLE;
        ahcvVar.parameter(str2, aharVar, aharVar2, aharVar2, aharVar3);
        ahcvVar.returns(str, aharVar3);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$7$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str, aharVar);
        ahcvVar.returns(str, NULLABLE);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$7$1(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_PLATFORM;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.parameter(str, aharVar);
        ahcvVar.returns(str, NULLABLE);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_PLATFORM, NOT_NULLABLE);
        ahcvVar.mustUseReturnValue();
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$1(String str, String str2, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahar aharVar = NOT_NULLABLE;
        ahcvVar.parameter(str, aharVar);
        ahcvVar.returns(str2, NOT_PLATFORM, aharVar);
        ahcvVar.mustUseReturnValue();
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$2(String str, String str2, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NULLABLE);
        ahcvVar.returns(str2, NOT_PLATFORM, NOT_NULLABLE);
        ahcvVar.mustUseReturnValue();
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$3(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NOT_NULLABLE);
        ahcvVar.mustUseReturnValue();
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$4(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.parameter(str, NOT_PLATFORM, NOT_NULLABLE);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$9$0(String str, ahcv ahcvVar) {
        ahcvVar.getClass();
        ahcvVar.returns(str, NULLABLE);
        return afak.a;
    }

    public static final Map<String, ahco> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;
    }
}
