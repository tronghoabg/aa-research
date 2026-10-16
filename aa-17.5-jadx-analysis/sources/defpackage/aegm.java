package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aegm extends aegp implements RandomAccess {
    private static final long serialVersionUID = -107070782945191929L;

    public aegm(aeka aekaVar, int i, int i2) {
        super(aekaVar, i, i2);
    }

    @Override // defpackage.aegp, defpackage.aegq
    /* renamed from: l */
    public final aeka subList(int i, int i2) {
        E(i);
        E(i2);
        if (i <= i2) {
            return new aegm(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aegp, defpackage.aegq, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
