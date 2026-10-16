package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ahof {
    public static final defpackage.ahoe Companion = new defpackage.ahoe(null);
    public static final defpackage.ahof ROOT = new defpackage.ahof("");
    private final defpackage.ahoh fqName;
    private transient defpackage.ahof parent;

    public ahof(java.lang.String str) {
        str.getClass();
        this.fqName = new defpackage.ahoh(str, this);
    }

    public final java.lang.String asString() {
        return this.fqName.asString();
    }

    public final defpackage.ahof child(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return new defpackage.ahof(this.fqName.child(ahojVar), this);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.ahof) && defpackage.afga.f(this.fqName, ((defpackage.ahof) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.isRoot();
    }

    public final defpackage.ahof parent() {
        defpackage.ahof ahofVar = this.parent;
        if (ahofVar != null) {
            return ahofVar;
        }
        if (isRoot()) {
            throw new java.lang.IllegalStateException("root");
        }
        defpackage.ahof ahofVar2 = new defpackage.ahof(this.fqName.parent());
        this.parent = ahofVar2;
        return ahofVar2;
    }

    public final java.util.List<defpackage.ahoj> pathSegments() {
        return this.fqName.pathSegments();
    }

    public final defpackage.ahoj shortName() {
        return this.fqName.shortName();
    }

    public final defpackage.ahoj shortNameOrSpecial() {
        return this.fqName.shortNameOrSpecial();
    }

    public final boolean startsWith(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return this.fqName.startsWith(ahojVar);
    }

    public java.lang.String toString() {
        return this.fqName.toString();
    }

    public final defpackage.ahoh toUnsafe() {
        return this.fqName;
    }

    private ahof(defpackage.ahoh ahohVar, defpackage.ahof ahofVar) {
        this.fqName = ahohVar;
        this.parent = ahofVar;
    }

    public ahof(defpackage.ahoh ahohVar) {
        ahohVar.getClass();
        this.fqName = ahohVar;
    }
}
