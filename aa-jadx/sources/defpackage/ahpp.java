package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahpp<ContainingType extends defpackage.ahqg, Type> {
    final ContainingType containingTypeDefaultInstance;
    final Type defaultValue;
    final defpackage.ahpo descriptor;
    final java.lang.reflect.Method enumValueOf;
    final defpackage.ahqg messageDefaultInstance;
    final java.lang.Class singularType;

    public ahpp(ContainingType containingtype, Type type, defpackage.ahqg ahqgVar, defpackage.ahpo ahpoVar, java.lang.Class cls) {
        if (containingtype == null) {
            throw new java.lang.IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (ahpoVar.getLiteType() == defpackage.ahri.MESSAGE && ahqgVar == null) {
            throw new java.lang.IllegalArgumentException("Null messageDefaultInstance");
        }
        this.containingTypeDefaultInstance = containingtype;
        this.defaultValue = type;
        this.messageDefaultInstance = ahqgVar;
        this.descriptor = ahpoVar;
        this.singularType = cls;
        if (defpackage.ahpr.class.isAssignableFrom(cls)) {
            this.enumValueOf = defpackage.ahpq.getMethodOrDie(cls, "valueOf", java.lang.Integer.TYPE);
        } else {
            this.enumValueOf = null;
        }
    }

    public java.lang.Object fromFieldSetType(java.lang.Object obj) {
        if (!this.descriptor.isRepeated()) {
            return singularFromFieldSetType(obj);
        }
        if (this.descriptor.getLiteJavaType() != defpackage.ahrj.ENUM) {
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(singularFromFieldSetType(it.next()));
        }
        return arrayList;
    }

    public ContainingType getContainingTypeDefaultInstance() {
        return this.containingTypeDefaultInstance;
    }

    public defpackage.ahqg getMessageDefaultInstance() {
        return this.messageDefaultInstance;
    }

    public int getNumber() {
        return this.descriptor.getNumber();
    }

    public java.lang.Object singularFromFieldSetType(java.lang.Object obj) {
        return this.descriptor.getLiteJavaType() == defpackage.ahrj.ENUM ? defpackage.ahpq.invokeOrDie(this.enumValueOf, null, (java.lang.Integer) obj) : obj;
    }

    public java.lang.Object singularToFieldSetType(java.lang.Object obj) {
        return this.descriptor.getLiteJavaType() == defpackage.ahrj.ENUM ? java.lang.Integer.valueOf(((defpackage.ahpr) obj).getNumber()) : obj;
    }

    public java.lang.Object toFieldSetType(java.lang.Object obj) {
        if (!this.descriptor.isRepeated()) {
            return singularToFieldSetType(obj);
        }
        if (this.descriptor.getLiteJavaType() != defpackage.ahrj.ENUM) {
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(singularToFieldSetType(it.next()));
        }
        return arrayList;
    }
}
