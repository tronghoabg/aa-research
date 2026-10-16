package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class erz {
    public final java.util.Map a = new java.util.LinkedHashMap();

    public final void a() {
        java.util.Map map = this.a;
        java.util.Map mapX = defpackage.afga.X(map);
        map.clear();
        java.util.Iterator it = mapX.values().iterator();
        while (it.hasNext()) {
            ((defpackage.ers) it.next()).g();
        }
    }

    public final java.lang.String toString() {
        java.lang.String simpleName = defpackage.afgw.b(getClass()).getSimpleName();
        if (simpleName == null) {
            simpleName = "ViewModelStore";
        }
        java.lang.String string = java.lang.Integer.toString(hashCode(), 16);
        string.getClass();
        return simpleName + "@" + string + "(keys=" + defpackage.afga.bf(this.a.keySet()) + ")";
    }
}
