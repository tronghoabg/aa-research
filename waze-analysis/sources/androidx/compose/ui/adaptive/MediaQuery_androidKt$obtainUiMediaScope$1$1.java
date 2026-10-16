package androidx.compose.ui.adaptive;

import android.content.Context;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class MediaQuery_androidKt$obtainUiMediaScope$1$1 extends g implements p<af, e<? super ab>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ UiMediaScopeImpl $scope;
    int label;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<WindowLayoutInfo, e<? super ab>, Object> {
        final /* synthetic */ UiMediaScopeImpl $scope;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(UiMediaScopeImpl uiMediaScopeImpl, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$scope = uiMediaScopeImpl;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(WindowLayoutInfo windowLayoutInfo, e<? super ab> eVar) {
            return ((AnonymousClass1) create(windowLayoutInfo, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            this.$scope.m7721set_windowPostureInyEWag(MediaQuery_androidKt.resolvePosture((WindowLayoutInfo) this.L$0));
            return ab.f48028a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MediaQuery_androidKt$obtainUiMediaScope$1$1(Context context, UiMediaScopeImpl uiMediaScopeImpl, e<? super MediaQuery_androidKt$obtainUiMediaScope$1$1> eVar) {
        super(2, eVar);
        this.$context = context;
        this.$scope = uiMediaScopeImpl;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new MediaQuery_androidKt$obtainUiMediaScope$1$1(this.$context, this.$scope, eVar);
    }

    @Override // h.g.a.p
    public final Object invoke(af afVar, e<? super ab> eVar) {
        return ((MediaQuery_androidKt$obtainUiMediaScope$1$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f48038a;
        int i2 = this.label;
        if (i2 == 0) {
            c.b(obj);
            Context context = this.$context;
            this.label = 1;
            if (ai.e(WindowInfoTracker.Companion.getOrCreate(context).windowLayoutInfo(this.$context), new AnonymousClass1(this.$scope, null), this) == aVar) {
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
