package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.q;
import h.g.b.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class WorkConstraintsTracker {
    private final List<ConstraintController> controllers;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTracker(Trackers trackers) {
        this((List<? extends ConstraintController>) WorkConstraintsTrackerKt.createControllers(trackers));
        x.f(trackers, "trackers");
    }

    static final CharSequence areAllConstraintsMet$lambda$1(ConstraintController constraintController) {
        x.f(constraintController, "it");
        String simpleName = constraintController.getClass().getSimpleName();
        x.e(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final boolean areAllConstraintsMet(WorkSpec workSpec) throws IOException {
        x.f(workSpec, "workSpec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).isCurrentlyConstrained(workSpec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            Logger.get().debug(WorkConstraintsTrackerKt.TAG, "Work " + workSpec.id + " constrained by " + i.aM(arrayList2, null, null, null, 0, new l() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$$ExternalSyntheticLambda0
                @Override // h.g.a.l
                public final Object invoke(Object obj2) {
                    return WorkConstraintsTracker.areAllConstraintsMet$lambda$1((ConstraintController) obj2);
                }
            }, 31));
        }
        return arrayList2.isEmpty();
    }

    public final k<ConstraintsState> track(WorkSpec workSpec) {
        x.f(workSpec, "spec");
        List<ConstraintController> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ConstraintController) obj).hasConstraint(workSpec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(i.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((ConstraintController) it.next()).track(workSpec.constraints));
        }
        final k[] kVarArr = (k[]) i.ao(arrayList3).toArray(new k[0]);
        return ai.y(new k<ConstraintsState>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            public final class AnonymousClass3 extends g implements q<kotlinx.coroutines.b.l<? super ConstraintsState>, ConstraintsState[], e<? super ab>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(e eVar) {
                    super(3, eVar);
                }

                @Override // h.g.a.q
                public final Object invoke(kotlinx.coroutines.b.l<? super ConstraintsState> lVar, ConstraintsState[] constraintsStateArr, e<? super ab> eVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(eVar);
                    anonymousClass3.L$0 = lVar;
                    anonymousClass3.L$1 = constraintsStateArr;
                    return anonymousClass3.invokeSuspend(ab.f48028a);
                }

                @Override // h.c.b.a.a
                public final Object invokeSuspend(Object obj) {
                    ConstraintsState.ConstraintsMet constraintsMet;
                    a aVar = a.f48038a;
                    int i2 = this.label;
                    if (i2 == 0) {
                        c.b(obj);
                        kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.L$0;
                        AnonymousClass3 anonymousClass3 = this;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) ((Object[]) this.L$1);
                        int length = constraintsStateArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                constraintsMet = null;
                                break;
                            }
                            constraintsMet = constraintsStateArr[i3];
                            if (!x.n(constraintsMet, ConstraintsState.ConstraintsMet.INSTANCE)) {
                                break;
                            }
                            i3++;
                        }
                        if (constraintsMet == null) {
                            constraintsMet = ConstraintsState.ConstraintsMet.INSTANCE;
                        }
                        this.label = 1;
                        if (lVar.emit(constraintsMet, anonymousClass3) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c.b(obj);
                    }
                    return ab.f48028a;
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(kotlinx.coroutines.b.l<? super ConstraintsState> lVar, e eVar) {
                final k[] kVarArr2 = kVarArr;
                Object objC = kotlinx.coroutines.b.a.x.c(lVar, kVarArr2, new h.g.a.a<ConstraintsState[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    @Override // h.g.a.a
                    public final ConstraintsState[] invoke() {
                        return new ConstraintsState[kVarArr2.length];
                    }
                }, new AnonymousClass3(null), eVar);
                return objC == a.f48038a ? objC : ab.f48028a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WorkConstraintsTracker(List<? extends ConstraintController> list) {
        x.f(list, "controllers");
        this.controllers = list;
    }
}
