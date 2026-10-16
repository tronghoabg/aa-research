package androidx.activity.compose;

import androidx.activity.compose.internal.BackHandlerCompat;
import h.ab;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ComposeBackHandler extends BackHandlerCompat {
    private a<ab> currentOnBackCompleted;

    public ComposeBackHandler(BackHandlerInfo backHandlerInfo) {
        super(backHandlerInfo);
        this.currentOnBackCompleted = new a() { // from class: androidx.activity.compose.ComposeBackHandler$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return ab.f48028a;
            }
        };
    }

    public final a<ab> getCurrentOnBackCompleted() {
        return this.currentOnBackCompleted;
    }

    @Override // androidx.activity.compose.internal.BackHandlerCompat
    public void onBackCompleted() {
        this.currentOnBackCompleted.invoke();
    }

    public final void setCurrentOnBackCompleted(a<ab> aVar) {
        this.currentOnBackCompleted = aVar;
    }
}
