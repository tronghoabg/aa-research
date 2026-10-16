package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aelg extends aelj implements RandomAccess {
    private static final long serialVersionUID = -107070782945191929L;

    public aelg(aeps aepsVar, int i, int i2) {
        super(aepsVar, i, i2);
    }

    @Override // defpackage.aelj, defpackage.aelk
    /* renamed from: l */
    public final aeps subList(int i, int i2) {
        E(i);
        E(i2);
        if (i <= i2) {
            return new aelg(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aelj, defpackage.aelk, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
