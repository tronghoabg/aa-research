package defpackage;

/* loaded from: classes.dex */
public final class ahnd {
    public static final ahnc Companion = new ahnc(null);
    private final boolean isLocal;
    private final ahnf packageFqName;
    private final ahnf relativeClassName;

    public ahnd(ahnf ahnfVar, ahnf ahnfVar2, boolean z) {
        ahnfVar.getClass();
        ahnfVar2.getClass();
        this.packageFqName = ahnfVar;
        this.relativeClassName = ahnfVar2;
        this.isLocal = z;
        ahnfVar2.isRoot();
    }

    private static final String asString$escapeSlashes(ahnf ahnfVar) {
        String strAsString = ahnfVar.asString();
        if (!afyh.A(strAsString, '/')) {
            return strAsString;
        }
        return "`" + strAsString + '`';
    }

    public static final ahnd topLevel(ahnf ahnfVar) {
        return Companion.topLevel(ahnfVar);
    }

    public final ahnf asSingleFqName() {
        if (this.packageFqName.isRoot()) {
            return this.relativeClassName;
        }
        return new ahnf(this.packageFqName.asString() + '.' + this.relativeClassName.asString());
    }

    public final String asString() {
        if (this.packageFqName.isRoot()) {
            return asString$escapeSlashes(this.relativeClassName);
        }
        return afyh.I(this.packageFqName.asString(), '.', '/') + "/" + asString$escapeSlashes(this.relativeClassName);
    }

    public final ahnd createNestedClassId(ahnj ahnjVar) {
        ahnjVar.getClass();
        return new ahnd(this.packageFqName, this.relativeClassName.child(ahnjVar), this.isLocal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahnd)) {
            return false;
        }
        ahnd ahndVar = (ahnd) obj;
        return affa.f(this.packageFqName, ahndVar.packageFqName) && affa.f(this.relativeClassName, ahndVar.relativeClassName) && this.isLocal == ahndVar.isLocal;
    }

    public final ahnd getOuterClassId() {
        ahnf ahnfVarParent = this.relativeClassName.parent();
        if (ahnfVarParent.isRoot()) {
            return null;
        }
        return new ahnd(this.packageFqName, ahnfVarParent, this.isLocal);
    }

    public final ahnf getPackageFqName() {
        return this.packageFqName;
    }

    public final ahnf getRelativeClassName() {
        return this.relativeClassName;
    }

    public final ahnj getShortClassName() {
        return this.relativeClassName.shortName();
    }

    public int hashCode() {
        return (((this.packageFqName.hashCode() * 31) + this.relativeClassName.hashCode()) * 31) + ahnb.m(this.isLocal);
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    public final boolean isNestedClass() {
        return !this.relativeClassName.parent().isRoot();
    }

    public String toString() {
        if (!this.packageFqName.isRoot()) {
            return asString();
        }
        return "/" + asString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahnd(ahnf ahnfVar, ahnj ahnjVar) {
        this(ahnfVar, ahnf.Companion.topLevel(ahnjVar), false);
        ahnfVar.getClass();
        ahnjVar.getClass();
    }
}
