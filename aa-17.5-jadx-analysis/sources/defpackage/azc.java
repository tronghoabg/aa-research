package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class azc<T> implements Comparator {
    final /* synthetic */ smv a;
    private final /* synthetic */ int b;

    public azc(smv smvVar, int i) {
        this.b = i;
        this.a = smvVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.b;
        if (i == 0) {
            Object obj3 = ((axk) obj).e;
            smv smvVar = this.a;
            return Integer.valueOf(smvVar.b(obj3)).compareTo(Integer.valueOf(smvVar.b(((axk) obj2).e)));
        }
        if (i == 1) {
            Object obj4 = ((axk) obj).e;
            smv smvVar2 = this.a;
            return Integer.valueOf(smvVar2.b(obj4)).compareTo(Integer.valueOf(smvVar2.b(((axk) obj2).e)));
        }
        if (i != 2) {
            Object obj5 = ((axk) obj2).e;
            smv smvVar3 = this.a;
            return Integer.valueOf(smvVar3.b(obj5)).compareTo(Integer.valueOf(smvVar3.b(((axk) obj).e)));
        }
        Object obj6 = ((axk) obj2).e;
        smv smvVar4 = this.a;
        return Integer.valueOf(smvVar4.b(obj6)).compareTo(Integer.valueOf(smvVar4.b(((axk) obj).e)));
    }
}
