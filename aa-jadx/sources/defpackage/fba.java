package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fba implements java.lang.Comparable {
    public final int a;
    public final java.lang.String b;
    public final java.lang.String c;
    private final int d;

    public fba(int i, int i2, java.lang.String str, java.lang.String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        defpackage.fba fbaVar = (defpackage.fba) obj;
        fbaVar.getClass();
        int i = this.a - fbaVar.a;
        return i == 0 ? this.d - fbaVar.d : i;
    }
}
