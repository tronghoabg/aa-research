package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.i;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final a mutex = i.c();
    private final MutableState currentSnackbarData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* compiled from: WazeSource */
    final class SnackbarDataImpl implements SnackbarData {
        private final k<SnackbarResult> continuation;
        private final SnackbarVisuals visuals;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(SnackbarVisuals snackbarVisuals, k<? super SnackbarResult> kVar) {
            this.visuals = snackbarVisuals;
            this.continuation = kVar;
        }

        @Override // androidx.compose.material3.SnackbarData
        public void dismiss() {
            if (this.continuation.g()) {
                this.continuation.resumeWith(SnackbarResult.Dismissed);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SnackbarDataImpl snackbarDataImpl = (SnackbarDataImpl) obj;
            return x.n(getVisuals(), snackbarDataImpl.getVisuals()) && x.n(this.continuation, snackbarDataImpl.continuation);
        }

        @Override // androidx.compose.material3.SnackbarData
        public SnackbarVisuals getVisuals() {
            return this.visuals;
        }

        public int hashCode() {
            return (getVisuals().hashCode() * 31) + this.continuation.hashCode();
        }

        @Override // androidx.compose.material3.SnackbarData
        public void performAction() {
            if (this.continuation.g()) {
                this.continuation.resumeWith(SnackbarResult.ActionPerformed);
            }
        }
    }

    /* compiled from: WazeSource */
    final class SnackbarVisualsImpl implements SnackbarVisuals {
        private final String actionLabel;
        private final SnackbarDuration duration;
        private final String message;
        private final boolean withDismissAction;

        public SnackbarVisualsImpl(String str, String str2, boolean z, SnackbarDuration snackbarDuration) {
            this.message = str;
            this.actionLabel = str2;
            this.withDismissAction = z;
            this.duration = snackbarDuration;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            SnackbarVisualsImpl snackbarVisualsImpl = (SnackbarVisualsImpl) obj;
            return x.n(getMessage(), snackbarVisualsImpl.getMessage()) && x.n(getActionLabel(), snackbarVisualsImpl.getActionLabel()) && getWithDismissAction() == snackbarVisualsImpl.getWithDismissAction() && getDuration() == snackbarVisualsImpl.getDuration();
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material3.SnackbarVisuals
        public boolean getWithDismissAction() {
            return this.withDismissAction;
        }

        public int hashCode() {
            int iHashCode = getMessage().hashCode() * 31;
            String actionLabel = getActionLabel();
            return ((((iHashCode + (actionLabel != null ? actionLabel.hashCode() : 0)) * 31) + SnackbarHostState$SnackbarVisualsImpl$$ExternalSyntheticBackport0.m(getWithDismissAction())) * 31) + getDuration().hashCode();
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material3.SnackbarHostState$showSnackbar$2, reason: invalid class name */
    final class AnonymousClass2 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnackbarHostState.this.showSnackbar(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, boolean z, SnackbarDuration snackbarDuration, e eVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            snackbarDuration = str3 == null ? SnackbarDuration.Short : SnackbarDuration.Indefinite;
        }
        return snackbarHostState.showSnackbar(str, str3, ((i2 & 4) == 0) & z, snackbarDuration, eVar);
    }

    public final SnackbarData getCurrentSnackbarData() {
        return (SnackbarData) this.currentSnackbarData$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showSnackbar(androidx.compose.material3.SnackbarVisuals r8, h.c.e<? super androidx.compose.material3.SnackbarResult> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.material3.SnackbarHostState.AnonymousClass2
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = (androidx.compose.material3.SnackbarHostState.AnonymousClass2) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r0 = new androidx.compose.material3.SnackbarHostState$showSnackbar$2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4f
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r8 = r0.L$2
            androidx.compose.material3.SnackbarHostState$showSnackbar$2 r8 = (androidx.compose.material3.SnackbarHostState.AnonymousClass2) r8
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.h.a r8 = (kotlinx.coroutines.h.a) r8
            java.lang.Object r0 = r0.L$0
            androidx.compose.material3.SnackbarVisuals r0 = (androidx.compose.material3.SnackbarVisuals) r0
            e.b.c.b(r9)     // Catch: java.lang.Throwable -> L37
            goto L91
        L37:
            r9 = move-exception
            goto L9e
        L39:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L41:
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.h.a r8 = (kotlinx.coroutines.h.a) r8
            java.lang.Object r2 = r0.L$0
            androidx.compose.material3.SnackbarVisuals r2 = (androidx.compose.material3.SnackbarVisuals) r2
            e.b.c.b(r9)
            r9 = r8
            r8 = r2
            goto L60
        L4f:
            e.b.c.b(r9)
            kotlinx.coroutines.h.a r9 = r7.mutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 == r1) goto La6
        L60:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L9a
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L9a
            r0.L$2 = r0     // Catch: java.lang.Throwable -> L9a
            r0.label = r3     // Catch: java.lang.Throwable -> L9a
            h.c.e r0 = (h.c.e) r0     // Catch: java.lang.Throwable -> L9a
            kotlinx.coroutines.l r2 = new kotlinx.coroutines.l     // Catch: java.lang.Throwable -> L9a
            h.c.e r3 = h.c.a.h.d(r0)     // Catch: java.lang.Throwable -> L9a
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L9a
            r2.u()     // Catch: java.lang.Throwable -> L9a
            r3 = r2
            kotlinx.coroutines.k r3 = (kotlinx.coroutines.k) r3     // Catch: java.lang.Throwable -> L9a
            androidx.compose.material3.SnackbarHostState$SnackbarDataImpl r4 = new androidx.compose.material3.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> L9a
            r4.<init>(r8, r3)     // Catch: java.lang.Throwable -> L9a
            androidx.compose.material3.SnackbarData r4 = (androidx.compose.material3.SnackbarData) r4     // Catch: java.lang.Throwable -> L9a
            access$setCurrentSnackbarData(r7, r4)     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r8 = r2.j()     // Catch: java.lang.Throwable -> L9a
            if (r8 != r1) goto L8c
            h.d.b.c(r0)     // Catch: java.lang.Throwable -> L9a
        L8c:
            if (r8 == r1) goto La6
            r6 = r9
            r9 = r8
            r8 = r6
        L91:
            r7.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> L98
            r8.unlock(r5)
            return r9
        L98:
            r7 = move-exception
            goto La2
        L9a:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L9e:
            r7.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> L98
            throw r9     // Catch: java.lang.Throwable -> L98
        La2:
            r8.unlock(r5)
            throw r7
        La6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarHostState.showSnackbar(androidx.compose.material3.SnackbarVisuals, h.c.e):java.lang.Object");
    }

    public final Object showSnackbar(String str, String str2, boolean z, SnackbarDuration snackbarDuration, e<? super SnackbarResult> eVar) {
        return showSnackbar(new SnackbarVisualsImpl(str, str2, z, snackbarDuration), eVar);
    }
}
