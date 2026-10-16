package androidx.compose.ui.platform;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.text.input.TextInputService;
import h.ab;
import h.c.a.a;
import h.c.a.h;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.d.b;
import h.g.a.p;
import h.g.b.y;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidPlatformTextInputSession implements PlatformTextInputSessionScope, af {
    public static final int $stable = 8;
    private final af coroutineScope;
    private final AtomicReference<SessionMutex.Session<InputMethodSession>> methodSessionMutex = SessionMutex.m7662constructorimpl();
    private final TextInputService textInputService;
    private final View view;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidPlatformTextInputSession.this.startInputMethod(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass3 extends g implements p<InputMethodSession, e<?>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;

        AnonymousClass3(e<? super AnonymousClass3> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass3 anonymousClass3 = AndroidPlatformTextInputSession.this.new AnonymousClass3(eVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // h.g.a.p
        public final Object invoke(InputMethodSession inputMethodSession, e<?> eVar) {
            return ((AnonymousClass3) create(inputMethodSession, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
                AndroidPlatformTextInputSession androidPlatformTextInputSession = AndroidPlatformTextInputSession.this;
                this.L$0 = inputMethodSession;
                this.L$1 = androidPlatformTextInputSession;
                this.label = 1;
                AnonymousClass3 anonymousClass3 = this;
                l lVar = new l(h.d(anonymousClass3), 1);
                lVar.u();
                androidPlatformTextInputSession.textInputService.startInput();
                lVar.c(new AndroidPlatformTextInputSession$startInputMethod$3$1$1(inputMethodSession, androidPlatformTextInputSession));
                Object objJ = lVar.j();
                if (objJ == aVar) {
                    b.c(anonymousClass3);
                }
                if (objJ == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            throw new h.e();
        }
    }

    public AndroidPlatformTextInputSession(View view, TextInputService textInputService, af afVar) {
        this.view = view;
        this.textInputService = textInputService;
        this.coroutineScope = afVar;
    }

    public final InputConnection createInputConnection(EditorInfo editorInfo) {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m7666getCurrentSessionimpl(this.methodSessionMutex);
        if (inputMethodSession != null) {
            return inputMethodSession.createInputConnection(editorInfo);
        }
        return null;
    }

    @Override // kotlinx.coroutines.af
    public j getCoroutineContext() {
        return this.coroutineScope.getCoroutineContext();
    }

    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    public View getView() {
        return this.view;
    }

    public final boolean isReadyForConnection() {
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.m7666getCurrentSessionimpl(this.methodSessionMutex);
        return inputMethodSession != null && inputMethodSession.isActive();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.PlatformTextInputSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest r6, h.c.e<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.platform.AndroidPlatformTextInputSession.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = (androidx.compose.ui.platform.AndroidPlatformTextInputSession.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1 r0 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            e.b.c.b(r7)
            goto L4c
        L2f:
            e.b.c.b(r7)
            java.util.concurrent.atomic.AtomicReference<androidx.compose.ui.SessionMutex$Session<androidx.compose.ui.platform.InputMethodSession>> r7 = r5.methodSessionMutex
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2 r2 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2
            r2.<init>(r6, r5)
            h.g.a.l r2 = (h.g.a.l) r2
            androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3 r6 = new androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3
            r4 = 0
            r6.<init>(r4)
            h.g.a.p r6 = (h.g.a.p) r6
            r0.label = r3
            java.lang.Object r5 = androidx.compose.ui.SessionMutex.m7669withSessionCancellingPreviousimpl(r7, r2, r6, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            h.e r5 = new h.e
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidPlatformTextInputSession.startInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    final class AnonymousClass2 extends y implements h.g.a.l<af, InputMethodSession> {
        final /* synthetic */ PlatformTextInputMethodRequest $request;
        final /* synthetic */ AndroidPlatformTextInputSession this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PlatformTextInputMethodRequest platformTextInputMethodRequest, AndroidPlatformTextInputSession androidPlatformTextInputSession) {
            super(1);
            this.$request = platformTextInputMethodRequest;
            this.this$0 = androidPlatformTextInputSession;
        }

        @Override // h.g.a.l
        public final InputMethodSession invoke(af afVar) {
            return new InputMethodSession(this.$request, new AnonymousClass1(this.this$0));
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$2$1, reason: invalid class name */
        final class AnonymousClass1 extends y implements h.g.a.a<ab> {
            final /* synthetic */ AndroidPlatformTextInputSession this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AndroidPlatformTextInputSession androidPlatformTextInputSession) {
                super(0);
                this.this$0 = androidPlatformTextInputSession;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                aj.h(this.this$0.coroutineScope, null);
            }

            @Override // h.g.a.a
            public /* bridge */ /* synthetic */ ab invoke() {
                invoke2();
                return ab.f48028a;
            }
        }
    }
}
