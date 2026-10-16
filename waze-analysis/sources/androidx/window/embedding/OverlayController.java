package androidx.window.embedding;

import android.content.Context;
import android.os.Bundle;
import androidx.core.util.Consumer;
import androidx.window.embedding.OverlayController;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.util.concurrent.Executor;
import kotlinx.coroutines.a.ad;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class OverlayController {
    public static final Companion Companion = new Companion(null);
    public static final int OVERLAY_FEATURE_VERSION = 8;
    private final EmbeddingBackend backend;

    /* compiled from: WazeSource */
    /* renamed from: androidx.window.embedding.OverlayController$overlayInfo$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<ad<? super OverlayInfo>, e<? super ab>, Object> {
        final /* synthetic */ String $overlayTag;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$overlayTag = str;
        }

        static final ab invokeSuspend$lambda$1(OverlayController overlayController, Consumer consumer) {
            overlayController.backend.removeOverlayInfoCallback(consumer);
            return ab.f48028a;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = OverlayController.this.new AnonymousClass1(this.$overlayTag, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(ad<? super OverlayInfo> adVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(adVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                final ad adVar = (ad) this.L$0;
                final Consumer<OverlayInfo> consumer = new Consumer() { // from class: androidx.window.embedding.OverlayController$overlayInfo$1$$ExternalSyntheticLambda0
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj2) {
                        adVar.i((OverlayInfo) obj2);
                    }
                };
                OverlayController overlayController = OverlayController.this;
                overlayController.backend.addOverlayInfoCallback(this.$overlayTag, new Executor() { // from class: androidx.window.embedding.OverlayController$overlayInfo$1$$ExternalSyntheticLambda1
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        runnable.run();
                    }
                }, consumer);
                final OverlayController overlayController2 = OverlayController.this;
                this.label = 1;
                if (kotlinx.coroutines.a.ab.a(adVar, new h.g.a.a() { // from class: androidx.window.embedding.OverlayController$overlayInfo$1$$ExternalSyntheticLambda2
                    @Override // h.g.a.a
                    public final Object invoke() {
                        return OverlayController.AnonymousClass1.invokeSuspend$lambda$1(overlayController2, consumer);
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

    public OverlayController(EmbeddingBackend embeddingBackend) {
        x.f(embeddingBackend, "backend");
        this.backend = embeddingBackend;
    }

    public static final OverlayController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public final void clearOverlayAttributesCalculator() {
        this.backend.clearOverlayAttributesCalculator();
    }

    public final k<OverlayInfo> overlayInfo(String str) {
        x.f(str, "overlayTag");
        return ai.n(new AnonymousClass1(str, null));
    }

    public final void setOverlayAttributesCalculator(l<? super OverlayAttributesCalculatorParams, OverlayAttributes> lVar) {
        x.f(lVar, "calculator");
        this.backend.setOverlayAttributesCalculator(lVar);
    }

    public final Bundle setOverlayCreateParams$window(Bundle bundle, OverlayCreateParams overlayCreateParams) {
        x.f(bundle, "options");
        x.f(overlayCreateParams, "overlayCreateParams");
        return this.backend.setOverlayCreateParams(bundle, overlayCreateParams);
    }

    public final void updateOverlayAttributes(String str, OverlayAttributes overlayAttributes) {
        x.f(str, "overlayTag");
        x.f(overlayAttributes, "overlayAttributes");
        this.backend.updateOverlayAttributes(str, overlayAttributes);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final OverlayController getInstance(Context context) {
            x.f(context, "context");
            return new OverlayController(EmbeddingBackend.Companion.getInstance(context));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
