package defpackage;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class akbr extends defpackage.akbq implements java.io.Serializable, java.lang.Cloneable {
    private static final long serialVersionUID = -7086398485908701455L;
    private final java.util.Map a = new j$.util.concurrent.ConcurrentHashMap();

    @Override // defpackage.akbs
    public java.lang.Object a(java.lang.String str) {
        return this.a.get(str);
    }

    @Override // defpackage.akbs
    public void b(java.lang.String str, java.lang.Object obj) {
        if (str == null) {
            return;
        }
        java.util.Map map = this.a;
        if (obj != null) {
            map.put(str, obj);
        } else {
            map.remove(str);
        }
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        defpackage.akbr akbrVar = (defpackage.akbr) super.clone();
        for (java.util.Map.Entry entry : this.a.entrySet()) {
            akbrVar.b((java.lang.String) entry.getKey(), entry.getValue());
        }
        return akbrVar;
    }

    public final java.lang.String toString() {
        return "[parameters=" + this.a.toString() + "]";
    }
}
