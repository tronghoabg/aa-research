package defpackage;

/* loaded from: classes2.dex */
public final class fau implements Comparable {
    public final int a;
    public final String b;
    public final String c;
    private final int d;

    public fau(int i, int i2, String str, String str2) {
        this.a = i;
        this.d = i2;
        this.b = str;
        this.c = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fau fauVar = (fau) obj;
        fauVar.getClass();
        int i = this.a - fauVar.a;
        return i == 0 ? this.d - fauVar.d : i;
    }
}
