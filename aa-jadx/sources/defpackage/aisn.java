package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aisn implements java.util.Iterator, defpackage.afhc {
    final /* synthetic */ defpackage.aiso a;
    private java.lang.Object b;
    private int c = -2;

    public aisn(defpackage.aiso aisoVar) {
        this.a = aisoVar;
    }

    private final void a() {
        java.lang.Object objInvoke;
        int i = this.c;
        defpackage.aiso aisoVar = this.a;
        if (i == -2) {
            objInvoke = aisoVar.a.invoke();
        } else {
            java.lang.Object obj = this.b;
            obj.getClass();
            objInvoke = aisoVar.b.invoke(obj);
        }
        this.b = objInvoke;
        this.c = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < 0) {
            a();
        }
        return this.c == 1;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        if (this.c < 0) {
            a();
        }
        if (this.c == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.b;
        obj.getClass();
        this.c = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
