package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tcq extends tcl {
    final /* synthetic */ tcr a;
    final /* synthetic */ tcs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcq(tcr tcrVar, tcs tcsVar, Iterator it) {
        super(it);
        this.a = tcrVar;
        this.b = tcsVar;
    }

    @Override // defpackage.tcl
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.tcl, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new tcp(this.b, (Map.Entry) super.next());
    }
}
