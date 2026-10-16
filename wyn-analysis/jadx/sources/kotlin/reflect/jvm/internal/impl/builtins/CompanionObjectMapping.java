package kotlin.reflect.jvm.internal.impl.builtins;

import ff.o;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class CompanionObjectMapping {

    @NotNull
    public static final CompanionObjectMapping INSTANCE = new CompanionObjectMapping();

    @NotNull
    private static final Set<ClassId> classIds;

    static {
        Set<PrimitiveType> set = PrimitiveType.NUMBER_TYPES;
        ArrayList arrayList = new ArrayList(p.a0(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(StandardNames.getPrimitiveFqName((PrimitiveType) it.next()));
        }
        FqName safe = StandardNames.FqNames.string.toSafe();
        AbstractC3340k.d(safe, "toSafe(...)");
        ArrayList arrayListF0 = o.F0(arrayList, safe);
        FqName safe2 = StandardNames.FqNames._boolean.toSafe();
        AbstractC3340k.d(safe2, "toSafe(...)");
        ArrayList arrayListF02 = o.F0(arrayListF0, safe2);
        FqName safe3 = StandardNames.FqNames._enum.toSafe();
        AbstractC3340k.d(safe3, "toSafe(...)");
        ArrayList arrayListF03 = o.F0(arrayListF02, safe3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = arrayListF03.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(ClassId.topLevel((FqName) it2.next()));
        }
        classIds = linkedHashSet;
    }

    private CompanionObjectMapping() {
    }

    @NotNull
    public final Set<ClassId> allClassesWithIntrinsicCompanions() {
        return classIds;
    }

    @NotNull
    public final Set<ClassId> getClassIds() {
        return classIds;
    }
}
