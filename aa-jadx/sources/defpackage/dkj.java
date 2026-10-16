package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dkj {
    private android.os.LocaleList a;
    private defpackage.dkl b;
    private final defpackage.dki c = new defpackage.dki(null);

    public final defpackage.dkl a() {
        defpackage.dki dkiVar = this.c;
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (dkiVar) {
            defpackage.dkl dklVar = this.b;
            if (dklVar != null && localeList == this.a) {
                return dklVar;
            }
            int size = localeList.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new defpackage.dkk(localeList.get(i)));
            }
            defpackage.dkl dklVar2 = new defpackage.dkl(arrayList);
            this.a = localeList;
            this.b = dklVar2;
            return dklVar2;
        }
    }
}
