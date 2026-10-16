package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aeei extends aeel implements RandomAccess {
    private static final long serialVersionUID = -107070782945191929L;

    public aeei(aefo aefoVar, int i, int i2) {
        super(aefoVar, i, i2);
    }

    @Override // defpackage.aeel, defpackage.aeen
    /* renamed from: k */
    public final aefo subList(int i, int i2) {
        D(i);
        D(i2);
        if (i <= i2) {
            return new aeei(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aeel, defpackage.aeen, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
