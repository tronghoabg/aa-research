package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class arf {
    public final long a;
    public final long b;
    public final boolean c;

    public arf(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final defpackage.arf a(defpackage.arf arfVar) {
        long jAh = defpackage.a.ah(this.a, arfVar.a);
        long jMax = java.lang.Math.max(this.b, arfVar.b);
        boolean z = true;
        if (!this.c && !arfVar.c) {
            z = false;
        }
        return new defpackage.arf(jAh, jMax, z);
    }
}
