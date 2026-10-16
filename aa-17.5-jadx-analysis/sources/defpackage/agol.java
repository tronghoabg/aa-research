package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class agol {
    private agol abbreviatedType;
    private final List<agop> arguments;
    public agnu classifier;
    private final List<agqa> extensions;
    private int flags;
    private agof flexibleTypeUpperBound;
    private agol outerType;

    public agol(int i) {
        this.flags = i;
        this.arguments = new ArrayList(0);
        List<agqf> iNSTANCES$org_jetbrains_kotlin_kotlin_metadata = agqf.Companion.getINSTANCES$org_jetbrains_kotlin_kotlin_metadata();
        ArrayList arrayList = new ArrayList(woy.bp(iNSTANCES$org_jetbrains_kotlin_kotlin_metadata, 10));
        Iterator<T> it = iNSTANCES$org_jetbrains_kotlin_kotlin_metadata.iterator();
        while (it.hasNext()) {
            arrayList.add(((agqf) it.next()).createTypeExtension());
        }
        this.extensions = arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!affa.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        agol agolVar = (agol) obj;
        return this.flags == agolVar.flags && affa.f(getClassifier(), agolVar.getClassifier()) && affa.f(this.arguments, agolVar.arguments) && affa.f(this.outerType, agolVar.outerType) && affa.f(this.abbreviatedType, agolVar.abbreviatedType) && affa.f(this.flexibleTypeUpperBound, agolVar.flexibleTypeUpperBound) && affa.f(this.extensions, agolVar.extensions);
    }

    public final agol getAbbreviatedType() {
        return this.abbreviatedType;
    }

    public final List<agop> getArguments() {
        return this.arguments;
    }

    public final agnu getClassifier() {
        agnu agnuVar = this.classifier;
        if (agnuVar != null) {
            return agnuVar;
        }
        affa.d("classifier");
        return null;
    }

    public final List<agqa> getExtensions$org_jetbrains_kotlin_kotlin_metadata() {
        return this.extensions;
    }

    public final int getFlags$org_jetbrains_kotlin_kotlin_metadata() {
        return this.flags;
    }

    public final agof getFlexibleTypeUpperBound() {
        return this.flexibleTypeUpperBound;
    }

    public final agol getOuterType() {
        return this.outerType;
    }

    public int hashCode() {
        return (((this.flags * 31) + getClassifier().hashCode()) * 31) + this.arguments.hashCode();
    }

    public final void setAbbreviatedType(agol agolVar) {
        this.abbreviatedType = agolVar;
    }

    public final void setClassifier(agnu agnuVar) {
        agnuVar.getClass();
        this.classifier = agnuVar;
    }

    public final void setFlags$org_jetbrains_kotlin_kotlin_metadata(int i) {
        this.flags = i;
    }

    public final void setFlexibleTypeUpperBound(agof agofVar) {
        this.flexibleTypeUpperBound = agofVar;
    }

    public final void setOuterType(agol agolVar) {
        this.outerType = agolVar;
    }

    public agol() {
        this(0);
    }
}
