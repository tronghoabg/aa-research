package defpackage;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afmy<T> implements Comparator {
    final /* synthetic */ String $memberNameForDebug$inlined;

    public afmy(String str) {
        this.$memberNameForDebug$inlined = str;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String name;
        String name2;
        afhf classifier = ((afib) t).getClassifier();
        if (classifier == null) {
            throw new IllegalStateException("Upper bounds are always denotable. Upper bounds appear non-denotable for member: '" + this.$memberNameForDebug$inlined + '\'');
        }
        if (!(classifier instanceof afhe)) {
            if (classifier instanceof afic) {
                name = ((afic) classifier).getName();
            }
            afhe afheVarB = affw.b(classifier.getClass());
            Objects.toString(afheVarB);
            throw new IllegalStateException("Unknown upper bound classifier: ".concat(String.valueOf(afheVarB)));
        }
        name = affa.h((afhe) classifier).getName();
        afhf classifier2 = ((afib) t2).getClassifier();
        if (classifier2 == null) {
            throw new IllegalStateException("Upper bounds are always denotable. Upper bounds appear non-denotable for member: '" + this.$memberNameForDebug$inlined + '\'');
        }
        if (classifier2 instanceof afhe) {
            name2 = affa.h((afhe) classifier2).getName();
        } else {
            if (!(classifier2 instanceof afic)) {
                classifier = classifier2;
                afhe afheVarB2 = affw.b(classifier.getClass());
                Objects.toString(afheVarB2);
                throw new IllegalStateException("Unknown upper bound classifier: ".concat(String.valueOf(afheVarB2)));
            }
            name2 = ((afic) classifier2).getName();
        }
        return affa.x(name, name2);
    }
}
