package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahdn {
    private static final defpackage.ahbr NOT_NULLABLE;
    private static final defpackage.ahbr NOT_PLATFORM;
    private static final defpackage.ahbr NULLABLE = new defpackage.ahbr(defpackage.ahbu.NULLABLE, null, false, false, false, 24, null);
    private static final java.util.Map<java.lang.String, defpackage.ahdo> PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;

    static {
        defpackage.ahbu ahbuVar = defpackage.ahbu.NOT_NULL;
        NOT_PLATFORM = new defpackage.ahbr(ahbuVar, null, false, false, false, 24, null);
        NOT_NULLABLE = new defpackage.ahbr(ahbuVar, null, true, false, false, 24, null);
        defpackage.ahgt ahgtVar = defpackage.ahgt.INSTANCE;
        java.lang.String strJavaLang = ahgtVar.javaLang("Object");
        java.lang.String strJavaFunction = ahgtVar.javaFunction("Predicate");
        java.lang.String strJavaFunction2 = ahgtVar.javaFunction("Function");
        java.lang.String strJavaFunction3 = ahgtVar.javaFunction("Consumer");
        java.lang.String strJavaFunction4 = ahgtVar.javaFunction("BiFunction");
        java.lang.String strJavaFunction5 = ahgtVar.javaFunction("BiConsumer");
        java.lang.String strJavaFunction6 = ahgtVar.javaFunction("UnaryOperator");
        java.lang.String strJavaUtil = ahgtVar.javaUtil("stream/Stream");
        java.lang.String strJavaUtil2 = ahgtVar.javaUtil("Optional");
        defpackage.ahdx ahdxVar = new defpackage.ahdx();
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, ahgtVar.javaUtil("Iterator")), "forEachRemaining", null, new defpackage.ahbv(strJavaFunction3), 2, null);
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, ahgtVar.javaLang("Iterable")), "spliterator", null, new defpackage.ahcg(ahgtVar), 2, null);
        defpackage.ahdw ahdwVar = new defpackage.ahdw(ahdxVar, ahgtVar.javaUtil("Collection"));
        defpackage.ahdw.function$default(ahdwVar, "removeIf", null, new defpackage.ahcr(strJavaFunction), 2, null);
        defpackage.ahdw.function$default(ahdwVar, "stream", null, new defpackage.ahdc(strJavaUtil), 2, null);
        defpackage.ahdw.function$default(ahdwVar, "parallelStream", null, new defpackage.ahdh(strJavaUtil), 2, null);
        defpackage.ahdw ahdwVar2 = new defpackage.ahdw(ahdxVar, ahgtVar.javaUtil("List"));
        defpackage.ahdw.function$default(ahdwVar2, "replaceAll", null, new defpackage.ahdi(strJavaFunction6), 2, null);
        ahdwVar2.function("addFirst", "2.1", new defpackage.ahdj(strJavaLang));
        ahdwVar2.function("addLast", "2.1", new defpackage.ahdk(strJavaLang));
        ahdwVar2.function("removeFirst", "2.1", new defpackage.ahdl(strJavaLang));
        ahdwVar2.function("removeLast", "2.1", new defpackage.ahdm(strJavaLang));
        defpackage.ahdw ahdwVar3 = new defpackage.ahdw(ahdxVar, ahgtVar.javaUtil("LinkedList"));
        ahdwVar3.function("addFirst", "2.1", new defpackage.ahbw(strJavaLang));
        ahdwVar3.function("addLast", "2.1", new defpackage.ahbx(strJavaLang));
        ahdwVar3.function("removeFirst", "2.1", new defpackage.ahby(strJavaLang));
        ahdwVar3.function("removeLast", "2.1", new defpackage.ahbz(strJavaLang));
        defpackage.ahdw ahdwVar4 = new defpackage.ahdw(ahdxVar, ahgtVar.javaUtil("LinkedHashSet"));
        ahdwVar4.function("addFirst", "2.2", new defpackage.ahca(strJavaLang));
        ahdwVar4.function("addLast", "2.2", new defpackage.ahcb(strJavaLang));
        ahdwVar4.function("removeFirst", "2.2", new defpackage.ahcc(strJavaLang));
        ahdwVar4.function("removeLast", "2.2", new defpackage.ahcd(strJavaLang));
        ahdwVar4.function("getFirst", "2.2", new defpackage.ahce(strJavaLang));
        ahdwVar4.function("getLast", "2.2", new defpackage.ahcf(strJavaLang));
        defpackage.ahdw ahdwVar5 = new defpackage.ahdw(ahdxVar, ahgtVar.javaUtil("Map"));
        defpackage.ahdw.function$default(ahdwVar5, "forEach", null, new defpackage.ahch(strJavaFunction5), 2, null);
        defpackage.ahdw.function$default(ahdwVar5, "putIfAbsent", null, new defpackage.ahci(strJavaLang), 2, null);
        defpackage.ahdw.function$default(ahdwVar5, "replace", null, new defpackage.ahcj(strJavaLang), 2, null);
        defpackage.ahdw.function$default(ahdwVar5, "replace", null, new defpackage.ahck(strJavaLang), 2, null);
        defpackage.ahdw.function$default(ahdwVar5, "replaceAll", null, new defpackage.ahcl(strJavaFunction4), 2, null);
        defpackage.ahdw.function$default(ahdwVar5, "compute", null, new defpackage.ahcm(strJavaLang, strJavaFunction4), 2, null);
        defpackage.ahdw.function$default(ahdwVar5, "computeIfAbsent", null, new defpackage.ahcn(strJavaLang, strJavaFunction2), 2, null);
        defpackage.ahdw.function$default(ahdwVar5, "computeIfPresent", null, new defpackage.ahco(strJavaLang, strJavaFunction4), 2, null);
        defpackage.ahdw.function$default(ahdwVar5, "merge", null, new defpackage.ahcp(strJavaLang, strJavaFunction4), 2, null);
        defpackage.ahdw ahdwVar6 = new defpackage.ahdw(ahdxVar, ahgtVar.javaUtil("LinkedHashMap"));
        ahdwVar6.function("putFirst", "2.2", new defpackage.ahcq(strJavaLang));
        ahdwVar6.function("putLast", "2.2", new defpackage.ahcs(strJavaLang));
        defpackage.ahdw ahdwVar7 = new defpackage.ahdw(ahdxVar, strJavaUtil2);
        defpackage.ahdw.function$default(ahdwVar7, "empty", null, new defpackage.ahct(strJavaUtil2), 2, null);
        defpackage.ahdw.function$default(ahdwVar7, "of", null, new defpackage.ahcu(strJavaLang, strJavaUtil2), 2, null);
        defpackage.ahdw.function$default(ahdwVar7, "ofNullable", null, new defpackage.ahcv(strJavaLang, strJavaUtil2), 2, null);
        defpackage.ahdw.function$default(ahdwVar7, "get", null, new defpackage.ahcw(strJavaLang), 2, null);
        defpackage.ahdw.function$default(ahdwVar7, "ifPresent", null, new defpackage.ahcx(strJavaFunction3), 2, null);
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, ahgtVar.javaLang("ref/Reference")), "get", null, new defpackage.ahcy(strJavaLang), 2, null);
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, strJavaFunction), "test", null, new defpackage.ahcz(strJavaLang), 2, null);
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, ahgtVar.javaFunction("BiPredicate")), "test", null, new defpackage.ahda(strJavaLang), 2, null);
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, strJavaFunction3), "accept", null, new defpackage.ahdb(strJavaLang), 2, null);
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, strJavaFunction5), "accept", null, new defpackage.ahdd(strJavaLang), 2, null);
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, strJavaFunction2), "apply", null, new defpackage.ahde(strJavaLang), 2, null);
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, strJavaFunction4), "apply", null, new defpackage.ahdf(strJavaLang), 2, null);
        defpackage.ahdw.function$default(new defpackage.ahdw(ahdxVar, ahgtVar.javaFunction("Supplier")), "get", null, new defpackage.ahdg(strJavaLang), 2, null);
        PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE = ahdxVar.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$0$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar, ahbrVar);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$1$0(defpackage.ahgt ahgtVar, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        java.lang.String strJavaUtil = ahgtVar.javaUtil("Spliterator");
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.returns(strJavaUtil, ahbrVar, ahbrVar);
        ahdvVar.mustUseReturnValue();
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$10$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NOT_PLATFORM);
        ahdvVar.returns(defpackage.ahxe.BOOLEAN);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$11$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.returns(defpackage.ahxe.BOOLEAN);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$12$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$13$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str, ahbrVar);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$14$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.returns(str, ahbrVar);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$15$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.returns(str, ahbrVar);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$16$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$2$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar, ahbrVar);
        ahdvVar.returns(defpackage.ahxe.BOOLEAN);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$2$1(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.returns(str, ahbrVar, ahbrVar);
        ahdvVar.mustUseReturnValue();
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$2$2(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.returns(str, ahbrVar, ahbrVar);
        ahdvVar.mustUseReturnValue();
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar, ahbrVar);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$1(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$2(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$3(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$3$4(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$4$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$4$1(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$4$2(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$4$3(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$1(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$2(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$3(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$4(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM);
        ahdvVar.mustUseReturnValue();
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$5$5(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM);
        ahdvVar.mustUseReturnValue();
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar, ahbrVar, ahbrVar);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$1(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.returns(str, NULLABLE);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$2(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.returns(str, NULLABLE);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$3(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.returns(defpackage.ahxe.BOOLEAN);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$4(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar, ahbrVar, ahbrVar, ahbrVar);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$5(java.lang.String str, java.lang.String str2, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        defpackage.ahbr ahbrVar2 = NULLABLE;
        ahdvVar.parameter(str2, ahbrVar, ahbrVar, ahbrVar2, ahbrVar2);
        ahdvVar.returns(str, ahbrVar2);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$6(java.lang.String str, java.lang.String str2, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str2, ahbrVar, ahbrVar, ahbrVar);
        ahdvVar.returns(str, ahbrVar);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$7(java.lang.String str, java.lang.String str2, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        defpackage.ahbr ahbrVar2 = NULLABLE;
        ahdvVar.parameter(str2, ahbrVar, ahbrVar, NOT_NULLABLE, ahbrVar2);
        ahdvVar.returns(str, ahbrVar2);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$6$8(java.lang.String str, java.lang.String str2, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        defpackage.ahbr ahbrVar2 = NOT_NULLABLE;
        ahdvVar.parameter(str, ahbrVar2);
        defpackage.ahbr ahbrVar3 = NULLABLE;
        ahdvVar.parameter(str2, ahbrVar, ahbrVar2, ahbrVar2, ahbrVar3);
        ahdvVar.returns(str, ahbrVar3);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$7$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.returns(str, NULLABLE);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$7$1(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_PLATFORM;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.returns(str, NULLABLE);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_PLATFORM, NOT_NULLABLE);
        ahdvVar.mustUseReturnValue();
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$1(java.lang.String str, java.lang.String str2, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        defpackage.ahbr ahbrVar = NOT_NULLABLE;
        ahdvVar.parameter(str, ahbrVar);
        ahdvVar.returns(str2, NOT_PLATFORM, ahbrVar);
        ahdvVar.mustUseReturnValue();
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$2(java.lang.String str, java.lang.String str2, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NULLABLE);
        ahdvVar.returns(str2, NOT_PLATFORM, NOT_NULLABLE);
        ahdvVar.mustUseReturnValue();
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$3(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NOT_NULLABLE);
        ahdvVar.mustUseReturnValue();
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$8$4(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.parameter(str, NOT_PLATFORM, NOT_NULLABLE);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$lambda$0$0$9$0(java.lang.String str, defpackage.ahdv ahdvVar) {
        ahdvVar.getClass();
        ahdvVar.returns(str, NULLABLE);
        return defpackage.afbk.a;
    }

    public static final java.util.Map<java.lang.String, defpackage.ahdo> getPREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE() {
        return PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE;
    }
}
