package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahwt {
    public static final ahwt ALL;
    private static final int ALL_KINDS_MASK;
    public static final ahwt CALLABLES;
    private static final int CALLABLES_MASK;
    public static final ahwt CLASSIFIERS;
    private static final int CLASSIFIERS_MASK;
    public static final ahws Companion;
    private static final aezr<List<ahwr>> DEBUG_MASK_BIT_NAMES$delegate;
    private static final aezr<List<ahwr>> DEBUG_PREDEFINED_FILTERS_MASK_NAMES$delegate;
    public static final ahwt FUNCTIONS;
    private static final int FUNCTIONS_MASK;
    public static final ahwt NON_SINGLETON_CLASSIFIERS;
    private static final int NON_SINGLETON_CLASSIFIERS_MASK;
    public static final ahwt PACKAGES;
    private static final int PACKAGES_MASK;
    public static final ahwt SINGLETON_CLASSIFIERS;
    private static final int SINGLETON_CLASSIFIERS_MASK;
    public static final ahwt TYPE_ALIASES;
    private static final int TYPE_ALIASES_MASK;
    public static final ahwt VALUES;
    private static final int VALUES_MASK;
    public static final ahwt VARIABLES;
    private static final int VARIABLES_MASK;
    private static int nextMaskValue;
    private final List<ahwo> excludes;
    private final int kindMask;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ahws ahwsVar = new ahws(null);
        Companion = ahwsVar;
        nextMaskValue = 1;
        int iNextMask = ahwsVar.nextMask();
        NON_SINGLETON_CLASSIFIERS_MASK = iNextMask;
        int iNextMask2 = ahwsVar.nextMask();
        SINGLETON_CLASSIFIERS_MASK = iNextMask2;
        int iNextMask3 = ahwsVar.nextMask();
        TYPE_ALIASES_MASK = iNextMask3;
        int iNextMask4 = ahwsVar.nextMask();
        PACKAGES_MASK = iNextMask4;
        int iNextMask5 = ahwsVar.nextMask();
        FUNCTIONS_MASK = iNextMask5;
        int iNextMask6 = ahwsVar.nextMask();
        VARIABLES_MASK = iNextMask6;
        int iNextMask7 = ahwsVar.nextMask() - 1;
        ALL_KINDS_MASK = iNextMask7;
        int i = iNextMask | iNextMask2 | iNextMask3;
        CLASSIFIERS_MASK = i;
        int i2 = iNextMask2 | iNextMask5 | iNextMask6;
        VALUES_MASK = i2;
        int i3 = iNextMask5 | iNextMask6;
        CALLABLES_MASK = i3;
        int i4 = 2;
        ALL = new ahwt(iNextMask7, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        CALLABLES = new ahwt(i3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        NON_SINGLETON_CLASSIFIERS = new ahwt(iNextMask, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        SINGLETON_CLASSIFIERS = new ahwt(iNextMask2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        TYPE_ALIASES = new ahwt(iNextMask3, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        CLASSIFIERS = new ahwt(i, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        PACKAGES = new ahwt(iNextMask4, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        FUNCTIONS = new ahwt(iNextMask5, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        VARIABLES = new ahwt(iNextMask6, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        VALUES = new ahwt(i2, 0 == true ? 1 : 0, i4, 0 == true ? 1 : 0);
        DEBUG_PREDEFINED_FILTERS_MASK_NAMES$delegate = woy.dG(ahwp.INSTANCE);
        DEBUG_MASK_BIT_NAMES$delegate = woy.dG(ahwq.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ahwt(int i, List<? extends ahwo> list) {
        list.getClass();
        this.excludes = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i &= ~((ahwo) it.next()).getFullyExcludedDescriptorKinds();
        }
        this.kindMask = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List DEBUG_MASK_BIT_NAMES_delegate$lambda$0() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Field[] fields = ahwt.class.getFields();
        fields.getClass();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList<Field> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (affa.f(((Field) obj).getType(), Integer.TYPE)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Field field2 : arrayList2) {
            ahwr ahwrVar = null;
            Object obj2 = field2.get(null);
            obj2.getClass();
            int iIntValue = ((Integer) obj2).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name = field2.getName();
                name.getClass();
                ahwrVar = new ahwr(iIntValue, name);
            }
            if (ahwrVar != null) {
                arrayList3.add(ahwrVar);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List DEBUG_PREDEFINED_FILTERS_MASK_NAMES_delegate$lambda$0() throws IllegalAccessException, SecurityException, IllegalArgumentException {
        Field[] fields = ahwt.class.getFields();
        fields.getClass();
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            ahwr ahwrVar = null;
            Object obj = field2.get(null);
            ahwt ahwtVar = obj instanceof ahwt ? (ahwt) obj : null;
            if (ahwtVar != null) {
                String name = field2.getName();
                name.getClass();
                ahwrVar = new ahwr(ahwtVar.kindMask, name);
            }
            if (ahwrVar != null) {
                arrayList2.add(ahwrVar);
            }
        }
        return arrayList2;
    }

    public final boolean acceptsKinds(int i) {
        return (this.kindMask & i) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ahwt ahwtVar = (ahwt) obj;
        return affa.f(this.excludes, ahwtVar.excludes) && this.kindMask == ahwtVar.kindMask;
    }

    public final List<ahwo> getExcludes() {
        return this.excludes;
    }

    public final int getKindMask() {
        return this.kindMask;
    }

    public int hashCode() {
        return (this.excludes.hashCode() * 31) + this.kindMask;
    }

    public final ahwt restrictedToKindsOrNull(int i) {
        int i2 = i & this.kindMask;
        if (i2 == 0) {
            return null;
        }
        return new ahwt(i2, this.excludes);
    }

    public String toString() throws IOException {
        Object next;
        Iterator it = Companion.getDEBUG_PREDEFINED_FILTERS_MASK_NAMES().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ahwr) next).getMask() == this.kindMask) {
                break;
            }
        }
        ahwr ahwrVar = (ahwr) next;
        String name = ahwrVar != null ? ahwrVar.getName() : null;
        if (name == null) {
            List<ahwr> debug_mask_bit_names = Companion.getDEBUG_MASK_BIT_NAMES();
            ArrayList arrayList = new ArrayList();
            for (ahwr ahwrVar2 : debug_mask_bit_names) {
                String name2 = acceptsKinds(ahwrVar2.getMask()) ? ahwrVar2.getName() : null;
                if (name2 != null) {
                    arrayList.add(name2);
                }
            }
            name = woy.cu(arrayList, " | ", null, null, null, 62);
        }
        return "DescriptorKindFilter(" + name + ", " + this.excludes + ')';
    }

    public /* synthetic */ ahwt(int i, List list, int i2, afeu afeuVar) {
        this(i, (i2 & 2) != 0 ? afbe.a : list);
    }
}
