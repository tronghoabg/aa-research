package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class ymx extends ynm {
    final /* synthetic */ ymy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymx(ymy ymyVar, Iterator it) {
        super(it);
        this.a = ymyVar;
    }

    @Override // defpackage.ynm
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return yrm.k((Collection) obj, this.a.g);
    }
}
