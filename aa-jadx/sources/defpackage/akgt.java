package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akgt {
    final defpackage.akgr a;
    final java.lang.String b;
    final int c;

    public akgt(defpackage.akgr akgrVar, java.lang.String str, int i) {
        this.a = akgrVar;
        this.b = str;
        this.c = i;
    }

    static defpackage.akgt c(java.io.DataInput dataInput) throws java.io.IOException {
        return new defpackage.akgt(new defpackage.akgr((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) defpackage.agxp.a(dataInput)), dataInput.readUTF(), (int) defpackage.agxp.a(dataInput));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final long a(long j, int i, int i2) {
        defpackage.akgr akgrVar = this.a;
        char c = akgrVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        defpackage.aker akerVar = defpackage.aker.o;
        defpackage.akdf akdfVar = akerVar.m;
        int i3 = akgrVar.b;
        long jH = akerVar.i.h(akdfVar.h(j3, i3), 0);
        defpackage.akdf akdfVar2 = akerVar.i;
        int i4 = akgrVar.f;
        long jA = akgrVar.a(akerVar, akdfVar2.e(jH, java.lang.Math.min(i4, 86399999)));
        if (akgrVar.d != 0) {
            jA = akgrVar.c(akerVar, jA);
            if (jA <= j3) {
                jA = akgrVar.c(akerVar, akgrVar.a(akerVar, akerVar.m.h(akerVar.n.e(jA, 1), i3)));
            }
        } else if (jA <= j3) {
            jA = akgrVar.a(akerVar, akerVar.n.e(jA, 1));
        }
        return akerVar.i.e(akerVar.i.h(jA, 0), i4) - j2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final long b(long j, int i, int i2) {
        defpackage.akgr akgrVar = this.a;
        char c = akgrVar.a;
        if (c == 'w') {
            i += i2;
        } else if (c != 's') {
            i = 0;
        }
        long j2 = i;
        long j3 = j + j2;
        defpackage.aker akerVar = defpackage.aker.o;
        defpackage.akdf akdfVar = akerVar.m;
        int i3 = akgrVar.b;
        long jH = akerVar.i.h(akdfVar.h(j3, i3), 0);
        defpackage.akdf akdfVar2 = akerVar.i;
        int i4 = akgrVar.f;
        long jB = akgrVar.b(akerVar, akdfVar2.e(jH, i4));
        if (akgrVar.d != 0) {
            jB = akgrVar.c(akerVar, jB);
            if (jB >= j3) {
                jB = akgrVar.c(akerVar, akgrVar.b(akerVar, akerVar.m.h(akerVar.n.e(jB, -1), i3)));
            }
        } else if (jB >= j3) {
            jB = akgrVar.b(akerVar, akerVar.n.e(jB, -1));
        }
        return akerVar.i.e(akerVar.i.h(jB, 0), i4) - j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.akgt) {
            defpackage.akgt akgtVar = (defpackage.akgt) obj;
            if (this.c == akgtVar.c && this.b.equals(akgtVar.b) && this.a.equals(akgtVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{java.lang.Integer.valueOf(this.c), this.b, this.a});
    }

    public final java.lang.String toString() {
        return this.a.toString() + " named " + this.b + " at " + this.c;
    }
}
