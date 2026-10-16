package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import h.c.b.a.c;
import h.c.e;
import kotlinx.coroutines.h.a;
import kotlinx.coroutines.h.i;
import kotlinx.coroutines.k;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class SnackbarHostState {
    public static final int $stable = 0;
    private final a mutex = i.c();
    private final MutableState currentSnackbarData$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* compiled from: WazeSource */
    final class SnackbarDataImpl implements SnackbarData {
        private final String actionLabel;
        private final k<SnackbarResult> continuation;
        private final SnackbarDuration duration;
        private final String message;

        /* JADX WARN: Multi-variable type inference failed */
        public SnackbarDataImpl(String str, String str2, SnackbarDuration snackbarDuration, k<? super SnackbarResult> kVar) {
            this.message = str;
            this.actionLabel = str2;
            this.duration = snackbarDuration;
            this.continuation = kVar;
        }

        @Override // androidx.compose.material.SnackbarData
        public void dismiss() {
            if (this.continuation.g()) {
                this.continuation.resumeWith(SnackbarResult.Dismissed);
            }
        }

        @Override // androidx.compose.material.SnackbarData
        public String getActionLabel() {
            return this.actionLabel;
        }

        @Override // androidx.compose.material.SnackbarData
        public SnackbarDuration getDuration() {
            return this.duration;
        }

        @Override // androidx.compose.material.SnackbarData
        public String getMessage() {
            return this.message;
        }

        @Override // androidx.compose.material.SnackbarData
        public void performAction() {
            if (this.continuation.g()) {
                this.continuation.resumeWith(SnackbarResult.ActionPerformed);
            }
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.material.SnackbarHostState$showSnackbar$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SnackbarHostState.this.showSnackbar(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentSnackbarData(SnackbarData snackbarData) {
        this.currentSnackbarData$delegate.setValue(snackbarData);
    }

    public static /* synthetic */ Object showSnackbar$default(SnackbarHostState snackbarHostState, String str, String str2, SnackbarDuration snackbarDuration, e eVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            snackbarDuration = SnackbarDuration.Short;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return snackbarHostState.showSnackbar(str, str2, snackbarDuration, eVar);
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
    public final java.lang.Object showSnackbar(java.lang.String r8, java.lang.String r9, androidx.compose.material.SnackbarDuration r10, h.c.e<? super androidx.compose.material.SnackbarResult> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof androidx.compose.material.SnackbarHostState.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r11
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = (androidx.compose.material.SnackbarHostState.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r0 = new androidx.compose.material.SnackbarHostState$showSnackbar$1
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L61
            if (r2 == r4) goto L4a
            if (r2 != r3) goto L42
            java.lang.Object r8 = r0.L$4
            androidx.compose.material.SnackbarHostState$showSnackbar$1 r8 = (androidx.compose.material.SnackbarHostState.AnonymousClass1) r8
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.h.a r8 = (kotlinx.coroutines.h.a) r8
            java.lang.Object r9 = r0.L$2
            androidx.compose.material.SnackbarDuration r9 = (androidx.compose.material.SnackbarDuration) r9
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.L$0
            java.lang.String r9 = (java.lang.String) r9
            e.b.c.b(r11)     // Catch: java.lang.Throwable -> L3f
            goto Lab
        L3f:
            r9 = move-exception
            goto Lb7
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L4a:
            java.lang.Object r8 = r0.L$3
            kotlinx.coroutines.h.a r8 = (kotlinx.coroutines.h.a) r8
            java.lang.Object r9 = r0.L$2
            r10 = r9
            androidx.compose.material.SnackbarDuration r10 = (androidx.compose.material.SnackbarDuration) r10
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            java.lang.String r2 = (java.lang.String) r2
            e.b.c.b(r11)
            r11 = r8
            r8 = r2
            goto L76
        L61:
            e.b.c.b(r11)
            kotlinx.coroutines.h.a r11 = r7.mutex
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.label = r4
            java.lang.Object r2 = r11.lock(r5, r0)
            if (r2 == r1) goto Lbf
        L76:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> Lb4
            r0.L$1 = r9     // Catch: java.lang.Throwable -> Lb4
            r0.L$2 = r10     // Catch: java.lang.Throwable -> Lb4
            r0.L$3 = r11     // Catch: java.lang.Throwable -> Lb4
            r0.L$4 = r0     // Catch: java.lang.Throwable -> Lb4
            r0.label = r3     // Catch: java.lang.Throwable -> Lb4
            h.c.e r0 = (h.c.e) r0     // Catch: java.lang.Throwable -> Lb4
            kotlinx.coroutines.l r2 = new kotlinx.coroutines.l     // Catch: java.lang.Throwable -> Lb4
            h.c.e r3 = h.c.a.h.d(r0)     // Catch: java.lang.Throwable -> Lb4
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Lb4
            r2.u()     // Catch: java.lang.Throwable -> Lb4
            r3 = r2
            kotlinx.coroutines.k r3 = (kotlinx.coroutines.k) r3     // Catch: java.lang.Throwable -> Lb4
            androidx.compose.material.SnackbarHostState$SnackbarDataImpl r4 = new androidx.compose.material.SnackbarHostState$SnackbarDataImpl     // Catch: java.lang.Throwable -> Lb4
            r4.<init>(r8, r9, r10, r3)     // Catch: java.lang.Throwable -> Lb4
            androidx.compose.material.SnackbarData r4 = (androidx.compose.material.SnackbarData) r4     // Catch: java.lang.Throwable -> Lb4
            access$setCurrentSnackbarData(r7, r4)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r8 = r2.j()     // Catch: java.lang.Throwable -> Lb4
            if (r8 != r1) goto La6
            h.d.b.c(r0)     // Catch: java.lang.Throwable -> Lb4
        La6:
            if (r8 == r1) goto Lbf
            r6 = r11
            r11 = r8
            r8 = r6
        Lab:
            r7.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb2
            r8.unlock(r5)
            return r11
        Lb2:
            r7 = move-exception
            goto Lbb
        Lb4:
            r8 = move-exception
            r9 = r8
            r8 = r11
        Lb7:
            r7.setCurrentSnackbarData(r5)     // Catch: java.lang.Throwable -> Lb2
            throw r9     // Catch: java.lang.Throwable -> Lb2
        Lbb:
            r8.unlock(r5)
            throw r7
        Lbf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SnackbarHostState.showSnackbar(java.lang.String, java.lang.String, androidx.compose.material.SnackbarDuration, h.c.e):java.lang.Object");
    }
}
