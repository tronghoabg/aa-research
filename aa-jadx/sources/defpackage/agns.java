package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agns {
    private final java.util.Map<java.lang.String, defpackage.agop> arguments;
    private final java.lang.String className;

    /* JADX WARN: Multi-variable type inference failed */
    public agns(java.lang.String str, java.util.Map<java.lang.String, ? extends defpackage.agop> map) {
        str.getClass();
        map.getClass();
        this.className = str;
        this.arguments = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence toString$lambda$0(defpackage.afau afauVar) {
        afauVar.getClass();
        java.lang.Object obj = afauVar.b;
        return ((java.lang.String) afauVar.a) + " = " + ((defpackage.agop) obj);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agns) {
            defpackage.agns agnsVar = (defpackage.agns) obj;
            if (defpackage.afga.f(this.className, agnsVar.className) && defpackage.afga.f(this.arguments, agnsVar.arguments)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.Map<java.lang.String, defpackage.agop> getArguments() {
        return this.arguments;
    }

    public final java.lang.String getClassName() {
        return this.className;
    }

    public int hashCode() {
        return (this.className.hashCode() * 31) + this.arguments.hashCode();
    }

    public java.lang.String toString() throws java.io.IOException {
        java.lang.Iterable iterable;
        java.lang.Iterable iterableAa;
        java.util.Map<java.lang.String, defpackage.agop> map = this.arguments;
        map.getClass();
        if (map.size() == 0) {
            iterableAa = defpackage.afce.a;
        } else {
            java.util.Iterator<java.util.Map.Entry<java.lang.String, defpackage.agop>> it = map.entrySet().iterator();
            if (it.hasNext()) {
                java.util.Map.Entry<java.lang.String, defpackage.agop> next = it.next();
                if (it.hasNext()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
                    arrayList.add(new defpackage.afau(next.getKey(), next.getValue()));
                    do {
                        java.util.Map.Entry<java.lang.String, defpackage.agop> next2 = it.next();
                        arrayList.add(new defpackage.afau(next2.getKey(), next2.getValue()));
                    } while (it.hasNext());
                    iterable = arrayList;
                } else {
                    iterableAa = defpackage.afga.aa(new defpackage.afau(next.getKey(), next.getValue()));
                }
                return "@" + this.className + '(' + defpackage.afga.bo(iterable, null, null, null, defpackage.agnr.INSTANCE, 31) + ')';
            }
            iterableAa = defpackage.afce.a;
        }
        iterable = iterableAa;
        return "@" + this.className + '(' + defpackage.afga.bo(iterable, null, null, null, defpackage.agnr.INSTANCE, 31) + ')';
    }
}
