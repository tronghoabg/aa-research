package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class ymv extends ynm {
    final /* synthetic */ ymw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymv(ymw ymwVar, Iterator it) {
        super(it);
        this.a = ymwVar;
    }

    @Override // defpackage.ynm
    public final /* synthetic */ Object a(Object obj) {
        return new ymu(this, (Map.Entry) obj);
    }
}
