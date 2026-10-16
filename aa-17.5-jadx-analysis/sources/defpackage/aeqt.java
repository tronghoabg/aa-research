package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aeqt extends aequ implements RandomAccess {
    private static final long serialVersionUID = -107070782945191929L;

    public aeqt(aeuh aeuhVar, int i, int i2) {
        super(aeuhVar, i, i2);
    }

    @Override // defpackage.aequ, defpackage.aeqv
    /* renamed from: c */
    public final aeuh subList(int i, int i2) {
        k(i);
        k(i2);
        if (i <= i2) {
            return new aeqt(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aequ, defpackage.aeqv, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
