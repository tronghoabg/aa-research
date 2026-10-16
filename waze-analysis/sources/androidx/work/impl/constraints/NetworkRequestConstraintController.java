package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.car.app.CarContext;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkRequestConstraintController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkTypeCompatKt;
import e.b.c;
import h.ab;
import h.c.b.a.g;
import h.c.e;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class NetworkRequestConstraintController implements ConstraintController {
    private final ConnectivityManager connManager;
    private final long timeoutMs;

    /* compiled from: WazeSource */
    /* renamed from: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<ad<? super ConstraintsState>, e<? super ab>, Object> {
        final /* synthetic */ Constraints $constraints;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ NetworkRequestConstraintController this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$constraints = constraints;
            this.this$0 = networkRequestConstraintController;
        }

        static final ab invokeSuspend$lambda$0(br brVar, ad adVar, ConstraintsState constraintsState) {
            brVar.s(null);
            adVar.i(constraintsState);
            return ab.f48028a;
        }

        static final ab invokeSuspend$lambda$1(a aVar) {
            aVar.invoke();
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$constraints, this.this$0, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(ad<? super ConstraintsState> adVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final ad adVar = (ad) this.L$0;
                NetworkRequest requiredNetworkRequest = this.$constraints.getRequiredNetworkRequest();
                if (requiredNetworkRequest == null) {
                    requiredNetworkRequest = NetworkTypeCompatKt.toNetworkRequest(this.$constraints.getRequiredNetworkType());
                }
                if (requiredNetworkRequest == null) {
                    adVar.U().v(null);
                    return ab.f48028a;
                }
                final br brVarZ = aj.z(adVar, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.this$0, adVar, null), 3);
                l<? super ConstraintsState, ab> lVar = new l() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return NetworkRequestConstraintController.AnonymousClass1.invokeSuspend$lambda$0(brVarZ, adVar, (ConstraintsState) obj2);
                    }
                };
                int i3 = Build.VERSION.SDK_INT;
                NetworkRequestConstraintController networkRequestConstraintController = this.this$0;
                final a<ab> aVarAddCallback = i3 >= 30 ? SharedNetworkCallback.INSTANCE.addCallback(networkRequestConstraintController.connManager, requiredNetworkRequest, lVar) : IndividualNetworkCallback.Companion.addCallback(networkRequestConstraintController.connManager, requiredNetworkRequest, lVar);
                this.label = 1;
                if (kotlinx.coroutines.a.ab.a(adVar, new a() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return NetworkRequestConstraintController.AnonymousClass1.invokeSuspend$lambda$1(aVarAddCallback);
                    }
                }, this) == aVar) {
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

    public NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j2) {
        x.f(connectivityManager, "connManager");
        this.connManager = connectivityManager;
        this.timeoutMs = j2;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(WorkSpec workSpec) {
        x.f(workSpec, "workSpec");
        return (workSpec.constraints.getRequiredNetworkRequest() == null && workSpec.constraints.getRequiredNetworkType() == NetworkType.NOT_REQUIRED) ? false : true;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isCurrentlyConstrained(WorkSpec workSpec) {
        x.f(workSpec, "workSpec");
        if (hasConstraint(workSpec)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public k<ConstraintsState> track(Constraints constraints) {
        x.f(constraints, CarContext.CONSTRAINT_SERVICE);
        return ai.n(new AnonymousClass1(constraints, this, null));
    }

    public /* synthetic */ NetworkRequestConstraintController(ConnectivityManager connectivityManager, long j2, int i2, o oVar) {
        this(connectivityManager, (i2 & 2) != 0 ? 1000L : j2);
    }
}
