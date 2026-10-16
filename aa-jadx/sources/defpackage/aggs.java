package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aggs implements defpackage.aggk {
    private final defpackage.aggk delegate;
    private final defpackage.affc<defpackage.ahof, java.lang.Boolean> fqNameFilter;
    private final boolean isDefinitelyNewInference;

    /* JADX WARN: Multi-variable type inference failed */
    public aggs(defpackage.aggk aggkVar, boolean z, defpackage.affc<? super defpackage.ahof, java.lang.Boolean> affcVar) {
        aggkVar.getClass();
        affcVar.getClass();
        this.delegate = aggkVar;
        this.isDefinitelyNewInference = z;
        this.fqNameFilter = affcVar;
    }

    private final boolean shouldBeReturned(defpackage.aggc aggcVar) {
        defpackage.ahof fqName = aggcVar.getFqName();
        return fqName != null && this.fqNameFilter.invoke(fqName).booleanValue();
    }

    @Override // defpackage.aggk
    public defpackage.aggc findAnnotation(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        if (this.fqNameFilter.invoke(ahofVar).booleanValue()) {
            return this.delegate.findAnnotation(ahofVar);
        }
        return null;
    }

    @Override // defpackage.aggk
    public boolean hasAnnotation(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        if (this.fqNameFilter.invoke(ahofVar).booleanValue()) {
            return this.delegate.hasAnnotation(ahofVar);
        }
        return false;
    }

    @Override // defpackage.aggk
    public boolean isEmpty() {
        boolean z;
        defpackage.aggk aggkVar = this.delegate;
        if (!(aggkVar instanceof java.util.Collection) || !((java.util.Collection) aggkVar).isEmpty()) {
            java.util.Iterator<defpackage.aggc> it = aggkVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (shouldBeReturned(it.next())) {
                    z = true;
                    break;
                }
            }
        } else {
            z = false;
            break;
        }
        if (this.isDefinitelyNewInference) {
            return !z;
        }
        return z;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<defpackage.aggc> iterator() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (defpackage.aggc aggcVar : this.delegate) {
            if (shouldBeReturned(aggcVar)) {
                arrayList.add(aggcVar);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aggs(defpackage.aggk aggkVar, defpackage.affc<? super defpackage.ahof, java.lang.Boolean> affcVar) {
        this(aggkVar, false, affcVar);
        aggkVar.getClass();
        affcVar.getClass();
    }
}
