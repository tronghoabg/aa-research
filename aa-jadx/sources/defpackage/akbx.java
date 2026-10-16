package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class akbx implements java.lang.Cloneable, defpackage.akcc {
    public final java.util.List a = new java.util.ArrayList();
    public final java.util.List b = new java.util.ArrayList();

    @Override // defpackage.ajqi
    public final void a(defpackage.ajqh ajqhVar, defpackage.akca akcaVar) throws defpackage.ajqd, java.io.IOException {
        java.util.Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((defpackage.ajqi) it.next()).a(ajqhVar, akcaVar);
        }
    }

    @Override // defpackage.ajql
    public final void b(defpackage.ajqj ajqjVar, defpackage.akca akcaVar) throws defpackage.ajqd, java.io.IOException {
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((defpackage.ajql) it.next()).b(ajqjVar, akcaVar);
        }
    }

    public final int c() {
        return this.a.size();
    }

    public final java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        defpackage.akbx akbxVar = (defpackage.akbx) super.clone();
        java.util.List list = akbxVar.a;
        list.clear();
        list.addAll(this.a);
        java.util.List list2 = akbxVar.b;
        list2.clear();
        list2.addAll(this.b);
        return akbxVar;
    }

    public final int d() {
        return this.b.size();
    }

    public final defpackage.ajqi e(int i) {
        if (i < 0) {
            return null;
        }
        java.util.List list = this.a;
        if (i >= list.size()) {
            return null;
        }
        return (defpackage.ajqi) list.get(i);
    }

    public final defpackage.ajql f(int i) {
        if (i < 0) {
            return null;
        }
        java.util.List list = this.b;
        if (i >= list.size()) {
            return null;
        }
        return (defpackage.ajql) list.get(i);
    }

    public final void g(defpackage.ajqi ajqiVar) {
        if (ajqiVar == null) {
            return;
        }
        this.a.add(ajqiVar);
    }

    public final void h(defpackage.ajql ajqlVar) {
        if (ajqlVar == null) {
            return;
        }
        this.b.add(ajqlVar);
    }
}
