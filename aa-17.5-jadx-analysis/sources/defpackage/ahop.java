package defpackage;

import defpackage.ahpg;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahop<ContainingType extends ahpg, Type> {
    final ContainingType containingTypeDefaultInstance;
    final Type defaultValue;
    final ahoo descriptor;
    final Method enumValueOf;
    final ahpg messageDefaultInstance;
    final Class singularType;

    public ahop(ContainingType containingtype, Type type, ahpg ahpgVar, ahoo ahooVar, Class cls) {
        if (containingtype == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (ahooVar.getLiteType() == ahqi.MESSAGE && ahpgVar == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.containingTypeDefaultInstance = containingtype;
        this.defaultValue = type;
        this.messageDefaultInstance = ahpgVar;
        this.descriptor = ahooVar;
        this.singularType = cls;
        if (ahor.class.isAssignableFrom(cls)) {
            this.enumValueOf = ahoq.getMethodOrDie(cls, "valueOf", Integer.TYPE);
        } else {
            this.enumValueOf = null;
        }
    }

    public Object fromFieldSetType(Object obj) {
        if (!this.descriptor.isRepeated()) {
            return singularFromFieldSetType(obj);
        }
        if (this.descriptor.getLiteJavaType() != ahqj.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(singularFromFieldSetType(it.next()));
        }
        return arrayList;
    }

    public ContainingType getContainingTypeDefaultInstance() {
        return this.containingTypeDefaultInstance;
    }

    public ahpg getMessageDefaultInstance() {
        return this.messageDefaultInstance;
    }

    public int getNumber() {
        return this.descriptor.getNumber();
    }

    public Object singularFromFieldSetType(Object obj) {
        return this.descriptor.getLiteJavaType() == ahqj.ENUM ? ahoq.invokeOrDie(this.enumValueOf, null, (Integer) obj) : obj;
    }

    public Object singularToFieldSetType(Object obj) {
        return this.descriptor.getLiteJavaType() == ahqj.ENUM ? Integer.valueOf(((ahor) obj).getNumber()) : obj;
    }

    public Object toFieldSetType(Object obj) {
        if (!this.descriptor.isRepeated()) {
            return singularToFieldSetType(obj);
        }
        if (this.descriptor.getLiteJavaType() != ahqj.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(singularToFieldSetType(it.next()));
        }
        return arrayList;
    }
}
