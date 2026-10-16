package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class aigj<T> implements Comparator {
    final /* synthetic */ afec $getProperTypeRelatedToStringify$inlined;

    public aigj(afec afecVar) {
        this.$getProperTypeRelatedToStringify$inlined = afecVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        aigl aiglVar = (aigl) t;
        aiglVar.getClass();
        String string = this.$getProperTypeRelatedToStringify$inlined.invoke(aiglVar).toString();
        aigl aiglVar2 = (aigl) t2;
        aiglVar2.getClass();
        return affa.x(string, this.$getProperTypeRelatedToStringify$inlined.invoke(aiglVar2).toString());
    }
}
