package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class aja {
    private final android.content.Context a;
    private final defpackage.dlo b;
    private final defpackage.avv c;

    public aja(android.content.Context context, defpackage.dlo dloVar, defpackage.avv avvVar) {
        this.a = context;
        this.b = dloVar;
        this.c = avvVar;
    }

    public final defpackage.aiz a() {
        return new defpackage.aiz(this.a, this.b, this.c);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.afga.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.aja ajaVar = (defpackage.aja) obj;
        return defpackage.afga.f(this.a, ajaVar.a) && defpackage.afga.f(this.b, ajaVar.b) && defpackage.afga.f(this.c, ajaVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) - 10066330) * 31) + this.c.hashCode();
    }
}
