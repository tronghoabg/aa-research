package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes2.dex */
public final class oou implements PointerInputEventHandler {
    final /* synthetic */ bym a;
    final /* synthetic */ bym b;
    final /* synthetic */ bym c;
    final /* synthetic */ bym d;
    final /* synthetic */ axr e;
    final /* synthetic */ bym f;
    final /* synthetic */ bym g;
    final /* synthetic */ bym h;
    final /* synthetic */ bym i;
    final /* synthetic */ bym j;
    final /* synthetic */ kwp k;

    public oou(kwp kwpVar, bym bymVar, bym bymVar2, bym bymVar3, bym bymVar4, axr axrVar, bym bymVar5, bym bymVar6, bym bymVar7, bym bymVar8, bym bymVar9) {
        this.k = kwpVar;
        this.a = bymVar;
        this.b = bymVar2;
        this.c = bymVar3;
        this.d = bymVar4;
        this.e = axrVar;
        this.f = bymVar5;
        this.g = bymVar6;
        this.h = bymVar7;
        this.i = bymVar8;
        this.j = bymVar9;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(cqz cqzVar, afck<? super afak> afckVar) {
        kwp kwpVar = this.k;
        bym bymVar = this.a;
        bym bymVar2 = this.b;
        bym bymVar3 = this.c;
        bym bymVar4 = this.d;
        nze nzeVar = new nze(kwpVar, bymVar, bymVar2, bymVar3, bymVar4, 4);
        oot ootVar = new oot(bymVar4, bymVar3, 1);
        oot ootVar2 = new oot(bymVar4, bymVar3, 0);
        bym bymVar5 = this.j;
        bym bymVar6 = this.g;
        bym bymVar7 = this.h;
        bym bymVar8 = this.i;
        return ca.aN(cqzVar, nzeVar, ootVar, ootVar2, new ooz(this.e, kwpVar, this.f, bymVar3, bymVar6, bymVar7, bymVar8, bymVar2, bymVar5, bymVar, 1), afckVar);
    }
}
