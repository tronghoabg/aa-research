package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agpl {
    private defpackage.agpl abbreviatedType;
    private final java.util.List<defpackage.agpp> arguments;
    public defpackage.agou classifier;
    private final java.util.List<defpackage.agra> extensions;
    private int flags;
    private defpackage.agpf flexibleTypeUpperBound;
    private defpackage.agpl outerType;

    public agpl(int i) {
        this.flags = i;
        this.arguments = new java.util.ArrayList(0);
        java.util.List<defpackage.agrf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = defpackage.agrf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(iNSTANCES$org_jetbrains_kotlin_kotlin_metadata, 10));
        java.util.Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.agrf) it.next()).createTypeExtension());
        }
        this.extensions = arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.afga.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.agpl agplVar = (defpackage.agpl) obj;
        return this.flags == agplVar.flags && defpackage.afga.f(getClassifier(), agplVar.getClassifier()) && defpackage.afga.f(this.arguments, agplVar.arguments) && defpackage.afga.f(this.outerType, agplVar.outerType) && defpackage.afga.f(this.abbreviatedType, agplVar.abbreviatedType) && defpackage.afga.f(this.flexibleTypeUpperBound, agplVar.flexibleTypeUpperBound) && defpackage.afga.f(this.extensions, agplVar.extensions);
    }

    public final defpackage.agpl getAbbreviatedType() {
        return this.abbreviatedType;
    }

    public final java.util.List<defpackage.agpp> getArguments() {
        return this.arguments;
    }

    public final defpackage.agou getClassifier() {
        defpackage.agou agouVar = this.classifier;
        if (agouVar != null) {
            return agouVar;
        }
        defpackage.afga.d("classifier");
        return null;
    }

    public final java.util.List<defpackage.agra> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final defpackage.agpf getFlexibleTypeUpperBound() {
        return this.flexibleTypeUpperBound;
    }

    public final defpackage.agpl getOuterType() {
        return this.outerType;
    }

    public int hashCode() {
        return (((this.flags * 31) + getClassifier().hashCode()) * 31) + this.arguments.hashCode();
    }

    public final void setAbbreviatedType(defpackage.agpl agplVar) {
        this.abbreviatedType = agplVar;
    }

    public final void setClassifier(defpackage.agou agouVar) {
        agouVar.getClass();
        this.classifier = agouVar;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setFlexibleTypeUpperBound(defpackage.agpf agpfVar) {
        this.flexibleTypeUpperBound = agpfVar;
    }

    public final void setOuterType(defpackage.agpl agplVar) {
        this.outerType = agplVar;
    }

    public agpl() {
        this(0);
    }
}
