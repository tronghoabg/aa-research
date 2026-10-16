package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aain implements java.util.Comparator {
    public static final defpackage.aain a = new defpackage.aain();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.aaim aaimVar = (defpackage.aaim) obj;
        defpackage.aaim aaimVar2 = (defpackage.aaim) obj2;
        if (aaimVar == null && aaimVar2 == null) {
            return 0;
        }
        if (aaimVar == null) {
            return -1;
        }
        if (aaimVar2 == null) {
            return 1;
        }
        long j = aaimVar2.c;
        long j2 = aaimVar.c;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        return aaimVar.b.compareTo(aaimVar2.b);
    }
}
