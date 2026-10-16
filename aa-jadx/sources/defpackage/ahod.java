package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ahod {
    public static final defpackage.ahoc Companion = new defpackage.ahoc(null);
    private final boolean isLocal;
    private final defpackage.ahof packageFqName;
    private final defpackage.ahof relativeClassName;

    public ahod(defpackage.ahof ahofVar, defpackage.ahof ahofVar2, boolean z) {
        ahofVar.getClass();
        ahofVar2.getClass();
        this.packageFqName = ahofVar;
        this.relativeClassName = ahofVar2;
        this.isLocal = z;
        ahofVar2.isRoot();
    }

    private static final java.lang.String asString$escapeSlashes(defpackage.ahof ahofVar) {
        java.lang.String strAsString = ahofVar.asString();
        if (!defpackage.afzh.A(strAsString, '/')) {
            return strAsString;
        }
        return "`" + strAsString + '`';
    }

    public static final defpackage.ahod topLevel(defpackage.ahof ahofVar) {
        return Companion.topLevel(ahofVar);
    }

    public final defpackage.ahof asSingleFqName() {
        if (this.packageFqName.isRoot()) {
            return this.relativeClassName;
        }
        return new defpackage.ahof(this.packageFqName.asString() + '.' + this.relativeClassName.asString());
    }

    public final java.lang.String asString() {
        if (this.packageFqName.isRoot()) {
            return asString$escapeSlashes(this.relativeClassName);
        }
        return defpackage.afzh.I(this.packageFqName.asString(), '.', '/') + "/" + asString$escapeSlashes(this.relativeClassName);
    }

    public final defpackage.ahod createNestedClassId(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return new defpackage.ahod(this.packageFqName, this.relativeClassName.child(ahojVar), this.isLocal);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahod)) {
            return false;
        }
        defpackage.ahod ahodVar = (defpackage.ahod) obj;
        return defpackage.afga.f(this.packageFqName, ahodVar.packageFqName) && defpackage.afga.f(this.relativeClassName, ahodVar.relativeClassName) && this.isLocal == ahodVar.isLocal;
    }

    public final defpackage.ahod getOuterClassId() {
        defpackage.ahof ahofVarParent = this.relativeClassName.parent();
        if (ahofVarParent.isRoot()) {
            return null;
        }
        return new defpackage.ahod(this.packageFqName, ahofVarParent, this.isLocal);
    }

    public final defpackage.ahof getPackageFqName() {
        return this.packageFqName;
    }

    public final defpackage.ahof getRelativeClassName() {
        return this.relativeClassName;
    }

    public final defpackage.ahoj getShortClassName() {
        return this.relativeClassName.shortName();
    }

    public int hashCode() {
        return (((this.packageFqName.hashCode() * 31) + this.relativeClassName.hashCode()) * 31) + defpackage.ahob.m(this.isLocal);
    }

    public final boolean isLocal() {
        return this.isLocal;
    }

    public final boolean isNestedClass() {
        return !this.relativeClassName.parent().isRoot();
    }

    public java.lang.String toString() {
        if (!this.packageFqName.isRoot()) {
            return asString();
        }
        return "/" + asString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ahod(defpackage.ahof ahofVar, defpackage.ahoj ahojVar) {
        this(ahofVar, defpackage.ahof.Companion.topLevel(ahojVar), false);
        ahofVar.getClass();
        ahojVar.getClass();
    }
}
