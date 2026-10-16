package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ageg implements defpackage.agei {
    private final java.util.Collection<defpackage.agec> packageFragments;

    /* JADX WARN: Multi-variable type inference failed */
    public ageg(java.util.Collection<? extends defpackage.agec> collection) {
        collection.getClass();
        this.packageFragments = collection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ahof getSubPackagesOf$lambda$0(defpackage.agec agecVar) {
        agecVar.getClass();
        return agecVar.getFqName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getSubPackagesOf$lambda$1(defpackage.ahof ahofVar, defpackage.ahof ahofVar2) {
        ahofVar2.getClass();
        return !ahofVar2.isRoot() && defpackage.afga.f(ahofVar2.parent(), ahofVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agei
    public void collectPackageFragments(defpackage.ahof ahofVar, java.util.Collection<defpackage.agec> collection) {
        ahofVar.getClass();
        collection.getClass();
        for (java.lang.Object obj : this.packageFragments) {
            if (defpackage.afga.f(((defpackage.agec) obj).getFqName(), ahofVar)) {
                collection.add(obj);
            }
        }
    }

    @Override // defpackage.aged
    public java.util.List<defpackage.agec> getPackageFragments(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : this.packageFragments) {
            if (defpackage.afga.f(((defpackage.agec) obj).getFqName(), ahofVar)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.aged
    public java.util.Collection<defpackage.ahof> getSubPackagesOf(defpackage.ahof ahofVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar) {
        ahofVar.getClass();
        affcVar.getClass();
        return defpackage.afsg.j(defpackage.afsg.l(defpackage.afsg.q(defpackage.afga.bg(this.packageFragments), defpackage.agee.INSTANCE), new defpackage.agef(ahofVar)));
    }

    @Override // defpackage.agei
    public boolean isEmpty(defpackage.ahof ahofVar) {
        ahofVar.getClass();
        java.util.Collection<defpackage.agec> collection = this.packageFragments;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (defpackage.afga.f(((defpackage.agec) it.next()).getFqName(), ahofVar)) {
                return false;
            }
        }
        return true;
    }
}
