package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hxe {
    public final defpackage.dzr a;
    public final java.util.List b;
    public final java.lang.String c;

    public hxe(java.lang.Class cls, java.lang.Class cls2, java.lang.Class cls3, java.util.List list, defpackage.dzr dzrVar) {
        this.a = dzrVar;
        defpackage.fyh.h(list);
        this.b = list;
        this.c = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final java.lang.String toString() {
        return "LoadPath{decodePaths=" + java.util.Arrays.toString(this.b.toArray()) + "}";
    }
}
