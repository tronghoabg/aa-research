package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tuu implements java.util.Comparator {
    public int a;
    public int b;

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ulk ulkVar = (defpackage.ulk) obj;
        int i = ulkVar.a;
        defpackage.ulk ulkVar2 = (defpackage.ulk) obj2;
        int i2 = ulkVar2.a;
        if (i != i2) {
            return i2 - i;
        }
        int i3 = 536870912 >> i;
        return (java.lang.Math.abs((ulkVar.e + i3) - this.a) + java.lang.Math.abs((ulkVar.f + i3) - this.b)) - (java.lang.Math.abs((ulkVar2.e + i3) - this.a) + java.lang.Math.abs((ulkVar2.f + i3) - this.b));
    }
}
