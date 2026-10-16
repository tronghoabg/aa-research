package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
abstract class eim extends eip {
    private static final long serialVersionUID = 1;

    @Override // defpackage.eip, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new eij(this);
    }
}
