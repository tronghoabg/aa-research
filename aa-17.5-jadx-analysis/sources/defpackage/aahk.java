package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class aahk implements Comparator {
    public static final aahk a = new aahk();

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        aahj aahjVar = (aahj) obj;
        aahj aahjVar2 = (aahj) obj2;
        if (aahjVar == null && aahjVar2 == null) {
            return 0;
        }
        if (aahjVar == null) {
            return -1;
        }
        if (aahjVar2 == null) {
            return 1;
        }
        long j = aahjVar2.c;
        long j2 = aahjVar.c;
        if (j2 < j) {
            return -1;
        }
        if (j2 > j) {
            return 1;
        }
        return aahjVar.b.compareTo(aahjVar2.b);
    }
}
