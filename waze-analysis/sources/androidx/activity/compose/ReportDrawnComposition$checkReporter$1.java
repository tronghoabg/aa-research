package androidx.activity.compose;

import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.u;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final /* synthetic */ class ReportDrawnComposition$checkReporter$1 extends u implements l<a<? extends Boolean>, ab> {
    ReportDrawnComposition$checkReporter$1(Object obj) {
        super(1, obj, ReportDrawnComposition.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ ab invoke(a<? extends Boolean> aVar) {
        invoke2((a<Boolean>) aVar);
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a<Boolean> aVar) {
        ((ReportDrawnComposition) this.receiver).observeReporter(aVar);
    }
}
