package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ConstraintSetForInlineDsl implements ConstraintSet, RememberObserver {
    public static final int $stable = 0;
    private Handler handler;
    private final ConstraintLayoutScope scope;
    private final SnapshotStateObserver observer = new SnapshotStateObserver(new l() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ConstraintSetForInlineDsl.observer$lambda$0(this.f$0, (a) obj);
        }
    });
    private boolean knownDirty = true;
    private final l<ab, ab> onCommitAffectingConstrainLambdas = new l() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$$ExternalSyntheticLambda1
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ConstraintSetForInlineDsl.onCommitAffectingConstrainLambdas$lambda$0(this.f$0, (ab) obj);
        }
    };
    private final List<ConstraintLayoutParentData> previousDatas = new ArrayList();

    public ConstraintSetForInlineDsl(ConstraintLayoutScope constraintLayoutScope) {
        this.scope = constraintLayoutScope;
    }

    static final ab applyTo$lambda$0(List list, ConstraintSetForInlineDsl constraintSetForInlineDsl, State state) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object parentData = ((Measurable) list.get(i2)).getParentData();
            ConstraintLayoutParentData constraintLayoutParentData = parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null;
            if (constraintLayoutParentData != null) {
                ConstrainedLayoutReference ref = constraintLayoutParentData.getRef();
                constraintLayoutParentData.getConstrain().invoke(new ConstrainScope(ref.getId$constraintlayout_compose(), constraintSetForInlineDsl.scope.asCLContainer$constraintlayout_compose(ref)));
            }
            constraintSetForInlineDsl.previousDatas.add(constraintLayoutParentData);
        }
        constraintSetForInlineDsl.scope.applyTo(state);
        return ab.f48028a;
    }

    static final ab observer$lambda$0(ConstraintSetForInlineDsl constraintSetForInlineDsl, final a aVar) {
        if (x.n(Looper.myLooper(), Looper.getMainLooper())) {
            aVar.invoke();
        } else {
            Handler handler = constraintSetForInlineDsl.handler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                constraintSetForInlineDsl.handler = handler;
            }
            handler.post(new Runnable() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.invoke();
                }
            });
        }
        return ab.f48028a;
    }

    static final ab onCommitAffectingConstrainLambdas$lambda$0(ConstraintSetForInlineDsl constraintSetForInlineDsl, ab abVar) {
        constraintSetForInlineDsl.knownDirty = true;
        return ab.f48028a;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public void applyTo(final State state, final List<? extends Measurable> list) {
        this.previousDatas.clear();
        ab abVar = ab.f48028a;
        a<ab> aVar = new a() { // from class: androidx.constraintlayout.compose.ConstraintSetForInlineDsl$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return ConstraintSetForInlineDsl.applyTo$lambda$0(list, this, state);
            }
        };
        this.observer.observeReads(abVar, this.onCommitAffectingConstrainLambdas, aVar);
        this.knownDirty = false;
    }

    public final boolean getKnownDirty() {
        return this.knownDirty;
    }

    public final ConstraintLayoutScope getScope() {
        return this.scope;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public boolean isDirty(List<? extends Measurable> list) {
        if (this.knownDirty || list.size() != this.previousDatas.size()) {
            return true;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object parentData = list.get(i2).getParentData();
            if (!x.n(parentData instanceof ConstraintLayoutParentData ? (ConstraintLayoutParentData) parentData : null, this.previousDatas.get(i2))) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        this.observer.stop();
        this.observer.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.observer.start();
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public /* synthetic */ ConstraintSet override(String str, float f2) {
        return this;
    }

    public final void setKnownDirty(boolean z) {
        this.knownDirty = z;
    }

    @Override // androidx.constraintlayout.compose.ConstraintSet
    public /* synthetic */ void applyTo(androidx.constraintlayout.core.state.Transition transition, int i2) {
    }
}
