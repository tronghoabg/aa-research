package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aerh extends aerk implements RandomAccess {
    private static final long serialVersionUID = -107070782945191929L;

    public aerh(aexm aexmVar, int i, int i2) {
        super(aexmVar, i, i2);
    }

    @Override // defpackage.aerk, defpackage.aerl
    /* renamed from: c */
    public final aexm subList(int i, int i2) {
        i(i);
        i(i2);
        if (i <= i2) {
            return new aerh(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aerk, defpackage.aerl, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
