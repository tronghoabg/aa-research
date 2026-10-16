package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahxt {
    public static final defpackage.ahxt ALL;
    private static final int ALL_KINDS_MASK;
    public static final defpackage.ahxt CALLABLES;
    private static final int CALLABLES_MASK;
    public static final defpackage.ahxt CLASSIFIERS;
    private static final int CLASSIFIERS_MASK;
    public static final defpackage.ahxs Companion;
    private static final defpackage.afar<java.util.List<defpackage.ahxr>> DEBUG_MASK_BIT_NAMES$delegate;
    private static final defpackage.afar<java.util.List<defpackage.ahxr>> DEBUG_PREDEFINED_FILTERS_MASK_NAMES$delegate;
    public static final defpackage.ahxt FUNCTIONS;
    private static final int FUNCTIONS_MASK;
    public static final defpackage.ahxt NON_SINGLETON_CLASSIFIERS;
    private static final int NON_SINGLETON_CLASSIFIERS_MASK;
    public static final defpackage.ahxt PACKAGES;
    private static final int PACKAGES_MASK;
    public static final defpackage.ahxt SINGLETON_CLASSIFIERS;
    private static final int SINGLETON_CLASSIFIERS_MASK;
    public static final defpackage.ahxt TYPE_ALIASES;
    private static final int TYPE_ALIASES_MASK;
    public static final defpackage.ahxt VALUES;
    private static final int VALUES_MASK;
    public static final defpackage.ahxt VARIABLES;
    private static final int VARIABLES_MASK;
    private static int nextMaskValue;
    private final java.util.List<defpackage.ahxo> excludes;
    private final int kindMask;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        defpackage.ahxs ahxsVar = new defpackage.ahxs(null);
        Companion = ahxsVar;
        nextMaskValue = 1;
        int iNextMask = ahxsVar.nextMask();
        NON_SINGLETON_CLASSIFIERS_MASK = iNextMask;
        int iNextMask2 = ahxsVar.nextMask();
        SINGLETON_CLASSIFIERS_MASK = iNextMask2;
        int iNextMask3 = ahxsVar.nextMask();
        TYPE_ALIASES_MASK = iNextMask3;
        int iNextMask4 = ahxsVar.nextMask();
        PACKAGES_MASK = iNextMask4;
        int iNextMask5 = ahxsVar.nextMask();
        FUNCTIONS_MASK = iNextMask5;
        int iNextMask6 = ahxsVar.nextMask();
        VARIABLES_MASK = iNextMask6;
        int iNextMask7 = ahxsVar.nextMask() - 1;
        ALL_KINDS_MASK = iNextMask7;
        int i = iNextMask | iNextMask2 | iNextMask3;
        CLASSIFIERS_MASK = i;
        int i2 = iNextMask2 | iNextMask5 | iNextMask6;
        VALUES_MASK = i2;
        int i3 = iNextMask5 | iNextMask6;
        CALLABLES_MASK = i3;
        int i4 = 2;
        ALL = new defpackage.ahxt(iNextMask7, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        CALLABLES = new defpackage.ahxt(i3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        NON_SINGLETON_CLASSIFIERS = new defpackage.ahxt(iNextMask, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        SINGLETON_CLASSIFIERS = new defpackage.ahxt(iNextMask2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        TYPE_ALIASES = new defpackage.ahxt(iNextMask3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        CLASSIFIERS = new defpackage.ahxt(i, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        PACKAGES = new defpackage.ahxt(iNextMask4, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        FUNCTIONS = new defpackage.ahxt(iNextMask5, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        VARIABLES = new defpackage.ahxt(iNextMask6, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        VALUES = new defpackage.ahxt(i2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        DEBUG_PREDEFINED_FILTERS_MASK_NAMES$delegate = defpackage.afga.cA(defpackage.ahxp.INSTANCE);
        DEBUG_MASK_BIT_NAMES$delegate = defpackage.afga.cA(defpackage.ahxq.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ahxt(int i, java.util.List<? extends defpackage.ahxo> list) {
        list.getClass();
        this.excludes = list;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((defpackage.ahxo) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.kindMask = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List DEBUG_MASK_BIT_NAMES_delegate$lambda$0() throws java.lang.IllegalAccessException {
        java.lang.reflect.Field[] fields = defpackage.ahxt.class.getFields();
        fields.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Field field : fields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        java.util.ArrayList<java.lang.reflect.Field> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (defpackage.afga.f(((java.lang.reflect.Field) obj).getType(), java.lang.Integer.TYPE)) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.reflect.Field field2 : arrayList2) {
            defpackage.ahxr ahxrVar = null;
            java.lang.Object obj2 = field2.get(null);
            obj2.getClass();
            int iIntValue = ((java.lang.Integer) obj2).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                java.lang.String name = field2.getName();
                name.getClass();
                ahxrVar = new defpackage.ahxr(iIntValue, name);
            }
            if (ahxrVar != null) {
                arrayList3.add(ahxrVar);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List DEBUG_PREDEFINED_FILTERS_MASK_NAMES_delegate$lambda$0() throws java.lang.IllegalAccessException {
        java.lang.reflect.Field[] fields = defpackage.ahxt.class.getFields();
        fields.getClass();
        java.util.ArrayList<java.lang.reflect.Field> arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Field field : fields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.reflect.Field field2 : arrayList) {
            defpackage.ahxr ahxrVar = null;
            java.lang.Object obj = field2.get(null);
            defpackage.ahxt ahxtVar = obj instanceof defpackage.ahxt ? (defpackage.ahxt) obj : null;
            if (ahxtVar != null) {
                java.lang.String name = field2.getName();
                name.getClass();
                ahxrVar = new defpackage.ahxr(ahxtVar.kindMask, name);
            }
            if (ahxrVar != null) {
                arrayList2.add(ahxrVar);
            }
        }
        return arrayList2;
    }

    public final boolean acceptsKinds(int i) {
        return (this.kindMask & i) != 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.afga.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.ahxt ahxtVar = (defpackage.ahxt) obj;
        return defpackage.afga.f(this.excludes, ahxtVar.excludes) && this.kindMask == ahxtVar.kindMask;
    }

    public final java.util.List<defpackage.ahxo> getExcludes() {
        return this.excludes;
    }

    public final int getKindMask() {
        return this.kindMask;
    }

    public int hashCode() {
        return (this.excludes.hashCode() * 31) + this.kindMask;
    }

    public final defpackage.ahxt restrictedToKindsOrNull(int i) {
        int i2 = i & this.kindMask;
        if (i2 == 0) {
            return null;
        }
        return new defpackage.ahxt(i2, this.excludes);
    }

    public java.lang.String toString() throws java.io.IOException {
        java.lang.Object next;
        java.util.Iterator it = Companion.getDEBUG_PREDEFINED_FILTERS_MASK_NAMES().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((defpackage.ahxr) next).getMask() != this.kindMask);
        defpackage.ahxr ahxrVar = (defpackage.ahxr) next;
        java.lang.String name = ahxrVar != null ? ahxrVar.getName() : null;
        if (name == null) {
            java.util.List<defpackage.ahxr> debug_mask_bit_names = Companion.getDEBUG_MASK_BIT_NAMES();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (defpackage.ahxr ahxrVar2 : debug_mask_bit_names) {
                java.lang.String name2 = acceptsKinds(ahxrVar2.getMask()) ? ahxrVar2.getName() : null;
                if (name2 != null) {
                    arrayList.add(name2);
                }
            }
            name = defpackage.afga.bo(arrayList, " | ", null, null, null, 62);
        }
        return "DescriptorKindFilter(" + name + ", " + this.excludes + ')';
    }

    public /* synthetic */ ahxt(int i, java.util.List list, int i2, defpackage.affu affuVar) {
        this(i, (i2 & 2) != 0 ? defpackage.afce.a : list);
    }
}
