package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class oqi {
    static final /* synthetic */ defpackage.afja[] a = {new defpackage.afgn(defpackage.oqi.class, "instance", "getInstance()Lcom/google/android/apps/auto/components/widgets/WidgetManager;", 0)};

    public static /* synthetic */ java.util.List b(absq absqVar) {
        java.lang.Object next;
        defpackage.abpj abpjVar;
        java.lang.String str = android.os.Build.MANUFACTURER;
        str.getClass();
        str.getClass();
        java.util.Locale locale = java.util.Locale.ROOT;
        locale.getClass();
        java.lang.String lowerCase = str.toLowerCase(locale);
        lowerCase.getClass();
        defpackage.abpj abpjVar2 = absqVar.b;
        abpjVar2.getClass();
        java.util.Iterator<E> it = abpjVar2.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            defpackage.abpj<java.lang.String> abpjVar3 = ((absm) next).b;
            abpjVar3.getClass();
            if (!abpjVar3.isEmpty()) {
                for (java.lang.String str2 : abpjVar3) {
                    str2.getClass();
                    java.util.Locale locale2 = java.util.Locale.ROOT;
                    locale2.getClass();
                    java.lang.String lowerCase2 = str2.toLowerCase(locale2);
                    lowerCase2.getClass();
                    if (defpackage.afga.f(lowerCase2, lowerCase)) {
                        break loop0;
                    }
                }
            }
        }
        absm absmVar = (absm) next;
        if (absmVar != null && (abpjVar = absmVar.c) != null) {
            return abpjVar;
        }
        defpackage.abpj abpjVar4 = absqVar.c;
        abpjVar4.getClass();
        return abpjVar4;
    }

    public final defpackage.oqk a() {
        return (defpackage.oqk) defpackage.oqk.b.getValue(this, a[0]);
    }
}
