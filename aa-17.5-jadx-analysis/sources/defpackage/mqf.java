package defpackage;

import android.content.ComponentName;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class mqf implements Comparator {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public mqf(Comparator comparator, Comparator comparator2, int i) {
        this.c = i;
        this.a = comparator;
        this.b = comparator2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.Comparator] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this.c != 0) {
            int iCompare = this.a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : this.b.compare(((ddu) obj).a, ((ddu) obj2).a);
        }
        mqz mqzVar = (mqz) obj;
        mqz mqzVar2 = (mqz) obj2;
        nrz nrzVar = (nrz) this.a;
        if (nrzVar.j()) {
            int iA = nrzVar.a(mqzVar.c.a());
            int iA2 = nrzVar.a(mqzVar2.c.a());
            if (iA != Integer.MAX_VALUE || iA2 != Integer.MAX_VALUE) {
                return Integer.compare(iA, iA2);
            }
        }
        mqc mqcVar = mqzVar.c;
        ComponentName componentName = mkn.e;
        if (componentName.equals(mqcVar.a())) {
            return -1;
        }
        if (componentName.equals(mqzVar2.c.a())) {
            return 1;
        }
        mqz mqzVar3 = (mqz) this.b;
        if (mqzVar3.equals(mqzVar)) {
            return 1;
        }
        if (mqzVar3.equals(mqzVar2)) {
            return -1;
        }
        return mqzVar.compareTo(mqzVar2);
    }

    public /* synthetic */ mqf(nrz nrzVar, mqz mqzVar, int i) {
        this.c = i;
        this.a = nrzVar;
        this.b = mqzVar;
    }
}
