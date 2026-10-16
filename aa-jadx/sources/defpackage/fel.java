package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fel extends android.util.Property {
    public fel(java.lang.Class cls) {
        super(cls, "nonTranslations");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.fep fepVar = (defpackage.fep) obj;
        float[] fArr = (float[]) obj2;
        java.lang.System.arraycopy(fArr, 0, fepVar.b, 0, fArr.length);
        fepVar.a();
    }
}
