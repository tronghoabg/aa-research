package androidx.window.embedding;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.core.util.Consumer;
import androidx.window.embedding.ActivityEmbeddingController;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.Set;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ActivityEmbeddingController {
    public static final Companion Companion = new Companion(null);
    private final EmbeddingBackend backend;

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<ad<? super EmbeddedActivityWindowInfo>, e<? super ab>, Object> {
        final /* synthetic */ Activity $activity;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Activity activity, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$activity = activity;
        }

        static final ab invokeSuspend$lambda$1(ActivityEmbeddingController activityEmbeddingController, Consumer consumer) {
            activityEmbeddingController.backend.removeEmbeddedActivityWindowInfoCallbackForActivity(consumer);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = ActivityEmbeddingController.this.new AnonymousClass1(this.$activity, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(ad<? super EmbeddedActivityWindowInfo> adVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final ad adVar = (ad) this.L$0;
                final Consumer<EmbeddedActivityWindowInfo> consumer = new Consumer() { // from class: androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        adVar.i((EmbeddedActivityWindowInfo) obj2);
                    }
                };
                ActivityEmbeddingController activityEmbeddingController = ActivityEmbeddingController.this;
                activityEmbeddingController.backend.addEmbeddedActivityWindowInfoCallbackForActivity(this.$activity, consumer);
                final ActivityEmbeddingController activityEmbeddingController2 = ActivityEmbeddingController.this;
                this.label = 1;
                if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1$$ExternalSyntheticLambda1
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return ActivityEmbeddingController.AnonymousClass1.invokeSuspend$lambda$1(activityEmbeddingController2, consumer);
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

    public ActivityEmbeddingController(EmbeddingBackend embeddingBackend) {
        x.f(embeddingBackend, "backend");
        this.backend = embeddingBackend;
    }

    public static final ActivityEmbeddingController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final k<EmbeddedActivityWindowInfo> embeddedActivityWindowInfo(Activity activity) {
        x.f(activity, "activity");
        return ai.n(new AnonymousClass1(activity, null));
    }

    public final void finishActivityStacks(Set<ActivityStack> set) {
        x.f(set, "activityStacks");
        this.backend.finishActivityStacks(set);
    }

    public final ActivityStack getActivityStack(Activity activity) {
        x.f(activity, "activity");
        return this.backend.getActivityStack(activity);
    }

    public final void invalidateVisibleActivityStacks() {
        this.backend.invalidateVisibleActivityStacks();
    }

    public final boolean isActivityEmbedded(Activity activity) {
        x.f(activity, "activity");
        return this.backend.isActivityEmbedded(activity);
    }

    public final void setEmbeddingConfiguration(EmbeddingConfiguration embeddingConfiguration) {
        x.f(embeddingConfiguration, "embeddingConfiguration");
        this.backend.setEmbeddingConfiguration(embeddingConfiguration);
    }

    public final Bundle setLaunchingActivityStack$window(Bundle bundle, ActivityStack activityStack) {
        x.f(bundle, "options");
        x.f(activityStack, "activityStack");
        return this.backend.setLaunchingActivityStack(bundle, activityStack);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ActivityEmbeddingController getInstance(Context context) {
            x.f(context, "context");
            return new ActivityEmbeddingController(EmbeddingBackend.Companion.getInstance(context));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
