package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afjk {
    public static final java.lang.String a(java.lang.reflect.Type type) {
        if (!(type instanceof java.lang.Class)) {
            return type.toString();
        }
        java.lang.Class cls = (java.lang.Class) type;
        if (!cls.isArray()) {
            java.lang.String name = cls.getName();
            name.getClass();
            return name;
        }
        defpackage.aisp aispVarF = defpackage.afsg.f(type, defpackage.afjj.a);
        java.lang.String name2 = ((java.lang.Class) defpackage.afsg.i(aispVarF)).getName();
        return java.lang.String.valueOf(name2).concat(defpackage.afzh.d("[]", defpackage.afsg.g(aispVarF)));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    public static final java.lang.reflect.Type b(defpackage.afjb afjbVar, boolean z) {
        java.lang.reflect.Type typeB;
        defpackage.afif classifier = afjbVar.getClassifier();
        if (classifier instanceof defpackage.afjc) {
            if (!(classifier instanceof defpackage.afgc)) {
                return new defpackage.afjg((defpackage.afjc) classifier);
            }
            defpackage.afgc afgcVar = (defpackage.afgc) classifier;
            java.lang.reflect.GenericDeclaration javaContainingDeclaration$kotlin_stdlib = afgcVar.getJavaContainingDeclaration$kotlin_stdlib();
            if (javaContainingDeclaration$kotlin_stdlib == null) {
                java.util.Objects.toString(afjbVar);
                throw new java.lang.UnsupportedOperationException("javaType is not supported for this type: ".concat(java.lang.String.valueOf(afjbVar)));
            }
            java.lang.reflect.TypeVariable<?>[] typeParameters = javaContainingDeclaration$kotlin_stdlib.getTypeParameters();
            typeParameters.getClass();
            java.lang.reflect.TypeVariable<?> typeVariable = null;
            boolean z2 = false;
            for (java.lang.reflect.TypeVariable<?> typeVariable2 : typeParameters) {
                if (defpackage.afga.f(typeVariable2.getName(), afgcVar.getName())) {
                    if (z2) {
                        throw new java.lang.IllegalArgumentException("Array contains more than one matching element.");
                    }
                    z2 = true;
                    typeVariable = typeVariable2;
                }
            }
            if (!z2) {
                throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
            }
            typeVariable.getClass();
            return typeVariable;
        }
        if (!(classifier instanceof defpackage.afie)) {
            java.util.Objects.toString(afjbVar);
            throw new java.lang.UnsupportedOperationException("Unsupported type classifier: ".concat(java.lang.String.valueOf(afjbVar)));
        }
        java.lang.Class clsI = z ? defpackage.afga.i((defpackage.afie) classifier) : defpackage.afga.h((defpackage.afie) classifier);
        java.util.List<defpackage.afjd> arguments = afjbVar.getArguments();
        if (!arguments.isEmpty()) {
            if (!clsI.isArray()) {
                return i(clsI, arguments);
            }
            if (!clsI.getComponentType().isPrimitive()) {
                defpackage.afjd afjdVar = (defpackage.afjd) defpackage.afga.aJ(arguments);
                if (afjdVar == null) {
                    java.util.Objects.toString(afjbVar);
                    throw new java.lang.IllegalArgumentException("kotlin.Array must have exactly one type argument: ".concat(java.lang.String.valueOf(afjbVar)));
                }
                defpackage.afje afjeVar = afjdVar.b;
                if (afjeVar != null) {
                    int iOrdinal = afjeVar.ordinal();
                    if (iOrdinal == 0) {
                        defpackage.afjb afjbVar2 = afjdVar.c;
                        afjbVar2.getClass();
                        typeB = b(afjbVar2, false);
                        if (!(typeB instanceof java.lang.Class)) {
                            return new defpackage.afib(typeB);
                        }
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new defpackage.afas();
                        }
                        defpackage.afjb afjbVar3 = afjdVar.c;
                        afjbVar3.getClass();
                        typeB = b(afjbVar3, false);
                        if (!(typeB instanceof java.lang.Class)) {
                            return new defpackage.afib(typeB);
                        }
                    }
                }
            }
        }
        return clsI;
    }

    public static final java.lang.reflect.Type c(defpackage.afjb afjbVar) {
        java.lang.reflect.Type javaType;
        afjbVar.getClass();
        return (!(afjbVar instanceof defpackage.afgb) || (javaType = ((defpackage.afgb) afjbVar).getJavaType()) == null) ? b(afjbVar, false) : javaType;
    }

    public static final java.util.List d(defpackage.afid afidVar) {
        afidVar.getClass();
        java.util.List<defpackage.afir> parameters = afidVar.getParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : parameters) {
            if (((defpackage.afir) obj).getKind() == defpackage.afiq.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final defpackage.afjd e(defpackage.afjb afjbVar) {
        afjbVar.getClass();
        return new defpackage.afjd(defpackage.afje.b, afjbVar);
    }

    public static final defpackage.afjd f(defpackage.afjb afjbVar) {
        afjbVar.getClass();
        return new defpackage.afjd(defpackage.afje.c, afjbVar);
    }

    public static final defpackage.afjd g(defpackage.afjb afjbVar) {
        afjbVar.getClass();
        return new defpackage.afjd(defpackage.afje.a, afjbVar);
    }

    public static final java.lang.reflect.GenericDeclaration h(defpackage.afig afigVar, java.lang.String str) throws java.io.IOException {
        str.getClass();
        if (!(afigVar instanceof defpackage.affr)) {
            return null;
        }
        java.lang.String strQ = defpackage.afzh.q(str, '(', str);
        if (defpackage.afga.f(strQ, "<init>")) {
            throw new java.lang.UnsupportedOperationException("Generic Java constructors are not supported: " + afigVar + "/" + str);
        }
        java.lang.reflect.Method[] declaredMethods = ((defpackage.affr) afigVar).getJClass().getDeclaredMethods();
        declaredMethods.getClass();
        for (java.lang.reflect.Method method : declaredMethods) {
            if (defpackage.afga.f(method.getName(), strQ)) {
                method.getClass();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(method.getName());
                sb.append("(");
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (java.lang.Class<?> cls : parameterTypes) {
                    cls.getClass();
                    k(sb, cls);
                }
                sb.append(")");
                java.lang.Class<?> returnType = method.getReturnType();
                returnType.getClass();
                k(sb, returnType);
                if (defpackage.afga.f(sb.toString(), str)) {
                    return method;
                }
            }
        }
        return null;
    }

    private static final java.lang.reflect.Type i(java.lang.Class cls, java.util.List list) {
        java.lang.Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(j((defpackage.afjd) it.next()));
            }
            return new defpackage.afji(cls, null, arrayList);
        }
        if (java.lang.reflect.Modifier.isStatic(cls.getModifiers())) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(j((defpackage.afjd) it2.next()));
            }
            return new defpackage.afji(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        java.lang.reflect.Type typeI = i(declaringClass, list.subList(length, list.size()));
        java.util.List listSubList = list.subList(0, length);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.afga.aj(listSubList, 10));
        java.util.Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(j((defpackage.afjd) it3.next()));
        }
        return new defpackage.afji(cls, typeI, arrayList3);
    }

    private static final java.lang.reflect.Type j(defpackage.afjd afjdVar) {
        defpackage.afje afjeVar = afjdVar.b;
        if (afjeVar == null) {
            return defpackage.afjl.a;
        }
        defpackage.afjb afjbVar = afjdVar.c;
        afjbVar.getClass();
        int iOrdinal = afjeVar.ordinal();
        if (iOrdinal == 0) {
            return b(afjbVar, true);
        }
        if (iOrdinal == 1) {
            return new defpackage.afjl(null, b(afjbVar, true));
        }
        if (iOrdinal == 2) {
            return new defpackage.afjl(b(afjbVar, true), null);
        }
        throw new defpackage.afas();
    }

    private static final void k(java.lang.Appendable appendable, java.lang.Class cls) throws java.io.IOException {
        while (cls.isArray()) {
            appendable.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (defpackage.afga.f(cls, java.lang.Void.TYPE)) {
            appendable.append("V");
            return;
        }
        if (defpackage.afga.f(cls, java.lang.Integer.TYPE)) {
            appendable.append("I");
            return;
        }
        if (defpackage.afga.f(cls, java.lang.Long.TYPE)) {
            appendable.append("J");
            return;
        }
        if (defpackage.afga.f(cls, java.lang.Short.TYPE)) {
            appendable.append("S");
            return;
        }
        if (defpackage.afga.f(cls, java.lang.Byte.TYPE)) {
            appendable.append("B");
            return;
        }
        if (defpackage.afga.f(cls, java.lang.Boolean.TYPE)) {
            appendable.append("Z");
            return;
        }
        if (defpackage.afga.f(cls, java.lang.Character.TYPE)) {
            appendable.append("C");
            return;
        }
        if (defpackage.afga.f(cls, java.lang.Float.TYPE)) {
            appendable.append("F");
            return;
        }
        if (defpackage.afga.f(cls, java.lang.Double.TYPE)) {
            appendable.append("D");
            return;
        }
        appendable.append("L");
        java.lang.String name = cls.getName();
        name.getClass();
        appendable.append(defpackage.afzh.I(name, '.', '/'));
        appendable.append(";");
    }
}
