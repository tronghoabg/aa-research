package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@java.lang.Deprecated
public final class epg {
    public final int a;
    public final java.lang.reflect.Method b;

    public epg(int i, java.lang.reflect.Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.epg)) {
            return false;
        }
        defpackage.epg epgVar = (defpackage.epg) obj;
        return this.a == epgVar.a && this.b.getName().equals(epgVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
