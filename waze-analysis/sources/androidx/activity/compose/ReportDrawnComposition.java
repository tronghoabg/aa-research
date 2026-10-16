package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ReportDrawnComposition implements a<ab> {
    private final l<a<Boolean>, ab> checkReporter;
    private final FullyDrawnReporter fullyDrawnReporter;
    private final a<Boolean> predicate;
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, a<Boolean> aVar) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = aVar;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(new l() { // from class: androidx.activity.compose.ReportDrawnComposition$$ExternalSyntheticLambda0
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return ReportDrawnComposition.snapshotStateObserver$lambda$0((a) obj);
            }
        });
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return;
        }
        fullyDrawnReporter.addReporter();
        observeReporter(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(final a<Boolean> aVar) {
        final am amVar = new am();
        a<ab> aVar2 = new a() { // from class: androidx.activity.compose.ReportDrawnComposition$$ExternalSyntheticLambda1
            @Override // h.g.a.a
            public final Object invoke() {
                return ReportDrawnComposition.observeReporter$lambda$0(amVar, aVar);
            }
        };
        this.snapshotStateObserver.observeReads(aVar, this.checkReporter, aVar2);
        if (amVar.f48101a) {
            removeReporter();
        }
    }

    static final ab observeReporter$lambda$0(am amVar, a aVar) {
        amVar.f48101a = ((Boolean) aVar.invoke()).booleanValue();
        return ab.f48028a;
    }

    static final ab snapshotStateObserver$lambda$0(a aVar) {
        aVar.invoke();
        return ab.f48028a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public void invoke2() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        invoke2();
    }

    @Override // h.g.a.a
    public /* bridge */ /* synthetic */ ab invoke() {
        invoke2();
        return ab.f48028a;
    }
}
