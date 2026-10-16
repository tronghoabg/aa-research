package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import Af.f;
import Af.g;
import Af.n;
import ff.AbstractC2641B;
import ff.o;
import ff.p;
import ff.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;

/* loaded from: classes5.dex */
public class ClassDeclaredMemberIndex implements DeclaredMemberIndex {

    @NotNull
    private final Map<Name, JavaRecordComponent> components;

    @NotNull
    private final Map<Name, JavaField> fields;

    @NotNull
    private final JavaClass jClass;

    @NotNull
    private final l memberFilter;

    @NotNull
    private final l methodFilter;

    @NotNull
    private final Map<Name, List<JavaMethod>> methods;

    public ClassDeclaredMemberIndex(@NotNull JavaClass jClass, @NotNull l memberFilter) {
        AbstractC3340k.e(jClass, "jClass");
        AbstractC3340k.e(memberFilter, "memberFilter");
        this.jClass = jClass;
        this.memberFilter = memberFilter;
        ClassDeclaredMemberIndex$methodFilter$1 classDeclaredMemberIndex$methodFilter$1 = new ClassDeclaredMemberIndex$methodFilter$1(this);
        this.methodFilter = classDeclaredMemberIndex$methodFilter$1;
        g gVarV = n.V(o.j0(jClass.getMethods()), classDeclaredMemberIndex$methodFilter$1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f fVar = new f(gVarV);
        while (fVar.hasNext()) {
            Object next = fVar.next();
            Name name = ((JavaMethod) next).getName();
            Object arrayList = linkedHashMap.get(name);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(name, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.methods = linkedHashMap;
        g gVarV2 = n.V(o.j0(this.jClass.getFields()), this.memberFilter);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        f fVar2 = new f(gVarV2);
        while (fVar2.hasNext()) {
            Object next2 = fVar2.next();
            linkedHashMap2.put(((JavaField) next2).getName(), next2);
        }
        this.fields = linkedHashMap2;
        Collection<JavaRecordComponent> recordComponents = this.jClass.getRecordComponents();
        l lVar = this.memberFilter;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : recordComponents) {
            if (((Boolean) lVar.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iD = AbstractC2641B.D(p.a0(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iD < 16 ? 16 : iD);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next3 = it.next();
            linkedHashMap3.put(((JavaRecordComponent) next3).getName(), next3);
        }
        this.components = linkedHashMap3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaField findFieldByName(@NotNull Name name) {
        AbstractC3340k.e(name, "name");
        return this.fields.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Collection<JavaMethod> findMethodsByName(@NotNull Name name) {
        AbstractC3340k.e(name, "name");
        List<JavaMethod> list = this.methods.get(name);
        return list != null ? list : v.f35432a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @Nullable
    public JavaRecordComponent findRecordComponentByName(@NotNull Name name) {
        AbstractC3340k.e(name, "name");
        return this.components.get(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getFieldNames() {
        g gVarV = n.V(o.j0(this.jClass.getFields()), this.memberFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f fVar = new f(gVarV);
        while (fVar.hasNext()) {
            linkedHashSet.add(((JavaField) fVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getMethodNames() {
        g gVarV = n.V(o.j0(this.jClass.getMethods()), this.methodFilter);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f fVar = new f(gVarV);
        while (fVar.hasNext()) {
            linkedHashSet.add(((JavaMethod) fVar.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
    @NotNull
    public Set<Name> getRecordComponentNames() {
        return this.components.keySet();
    }
}
