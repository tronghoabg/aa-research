package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dkj {
    private android.os.LocaleList a;
    private defpackage.dkl b;
    private final defpackage.dki c = new defpackage.dki(null);

    public final defpackage.dkl a() {
        defpackage.dki dkiVar = this.c;
        android.os.LocaleList localeListM = a$.ExternalSyntheticApiModelOutline2.m();
        synchronized (dkiVar) {
            defpackage.dkl dklVar = this.b;
            if (dklVar != null && localeListM == this.a) {
                return dklVar;
            }
            int iM = a$.ExternalSyntheticApiModelOutline2.m(localeListM);
            java.util.ArrayList arrayList = new java.util.ArrayList(iM);
            for (int i = 0; i < iM; i++) {
                arrayList.add(new defpackage.dkk(a$.ExternalSyntheticApiModelOutline2.m(localeListM, i)));
            }
            defpackage.dkl dklVar2 = new defpackage.dkl(arrayList);
            this.a = localeListM;
            this.b = dklVar2;
            return dklVar2;
        }
    }
}
