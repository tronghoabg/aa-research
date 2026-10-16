package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class bez implements PointerInputEventHandler {
    final /* synthetic */ aitx a;
    final /* synthetic */ bwq b;
    final /* synthetic */ bym c;

    public bez(aitx aitxVar, bwq bwqVar, bym bymVar) {
        this.a = aitxVar;
        this.b = bwqVar;
        this.c = bymVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(cqz cqzVar, afck<? super afak> afckVar) {
        bey beyVar = new bey(this.a, this.b, null);
        bbn bbnVar = new bbn(this.c, 19);
        afeh afehVar = aqx.a;
        Object objA = ahni.a(new aqp(cqzVar, beyVar, bbnVar, new apl(cqzVar), null), afckVar);
        afcr afcrVar = afcr.a;
        if (objA != afcrVar) {
            objA = afak.a;
        }
        return objA == afcrVar ? objA : afak.a;
    }
}
