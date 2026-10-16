package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class ahnf {
    public static final ahne Companion = new ahne(null);
    public static final ahnf ROOT = new ahnf("");
    private final ahnh fqName;
    private transient ahnf parent;

    public ahnf(String str) {
        str.getClass();
        this.fqName = new ahnh(str, this);
    }

    public final String asString() {
        return this.fqName.asString();
    }

    public final ahnf child(ahnj ahnjVar) {
        ahnjVar.getClass();
        return new ahnf(this.fqName.child(ahnjVar), this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahnf) && affa.f(this.fqName, ((ahnf) obj).fqName);
    }

    public int hashCode() {
        return this.fqName.hashCode();
    }

    public final boolean isRoot() {
        return this.fqName.isRoot();
    }

    public final ahnf parent() {
        ahnf ahnfVar = this.parent;
        if (ahnfVar != null) {
            return ahnfVar;
        }
        if (isRoot()) {
            throw new IllegalStateException("root");
        }
        ahnf ahnfVar2 = new ahnf(this.fqName.parent());
        this.parent = ahnfVar2;
        return ahnfVar2;
    }

    public final List<ahnj> pathSegments() {
        return this.fqName.pathSegments();
    }

    public final ahnj shortName() {
        return this.fqName.shortName();
    }

    public final ahnj shortNameOrSpecial() {
        return this.fqName.shortNameOrSpecial();
    }

    public final boolean startsWith(ahnj ahnjVar) {
        ahnjVar.getClass();
        return this.fqName.startsWith(ahnjVar);
    }

    public String toString() {
        return this.fqName.toString();
    }

    public final ahnh toUnsafe() {
        return this.fqName;
    }

    private ahnf(ahnh ahnhVar, ahnf ahnfVar) {
        this.fqName = ahnhVar;
        this.parent = ahnfVar;
    }

    public ahnf(ahnh ahnhVar) {
        ahnhVar.getClass();
        this.fqName = ahnhVar;
    }
}
