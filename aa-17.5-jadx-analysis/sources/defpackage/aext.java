package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class aext extends aexw implements RandomAccess {
    private static final long serialVersionUID = -107070782945191929L;

    public aext(aeyx aeyxVar, int i, int i2) {
        super(aeyxVar, i, i2);
    }

    @Override // defpackage.aexw, defpackage.aexx
    /* renamed from: j */
    public final aeyx subList(int i, int i2) {
        C(i);
        C(i2);
        if (i <= i2) {
            return new aext(this, i, i2);
        }
        throw new IllegalArgumentException(a.bB(i2, i, "Start index (", ") is greater than end index (", ")"));
    }

    @Override // defpackage.aexw, defpackage.aexx, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }
}
