package defpackage;

import android.icu.text.Collator;
import android.icu.text.RuleBasedCollator;
import com.google.android.gms.car.RadioProgramInfo;
import j$.util.Comparator;
import java.util.Comparator;
import java.util.Locale;

/* loaded from: classes2.dex */
final class mjq implements Comparator {
    private final Comparator a = new miz();

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compare(RadioProgramInfo radioProgramInfo, RadioProgramInfo radioProgramInfo2) {
        miw miwVar = new miw(10);
        final Collator collator = Collator.getInstance(Locale.getDefault());
        if (lk$$ExternalSyntheticApiModelOutline0.m357m((Object) collator)) {
            RuleBasedCollator ruleBasedCollatorM343m = lk$$ExternalSyntheticApiModelOutline0.m343m((Object) collator);
            ruleBasedCollatorM343m.setNumericCollation(true);
            ruleBasedCollatorM343m.setUpperCaseFirst(true);
        }
        collator.setStrength(2);
        collator.getClass();
        return Comparator.EL.thenComparing(Comparator.CC.comparing(miwVar, Comparator.CC.nullsLast(new java.util.Comparator() { // from class: mjp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return collator.compare((String) obj, (String) obj2);
            }
        })), this.a).compare(radioProgramInfo, radioProgramInfo2);
    }
}
