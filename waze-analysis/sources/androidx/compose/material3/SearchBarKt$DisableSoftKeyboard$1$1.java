package androidx.compose.material3;

import androidx.compose.ui.platform.PlatformTextInputInterceptor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class SearchBarKt$DisableSoftKeyboard$1$1 implements PlatformTextInputInterceptor {
    public static final SearchBarKt$DisableSoftKeyboard$1$1 INSTANCE = new SearchBarKt$DisableSoftKeyboard$1$1();

    SearchBarKt$DisableSoftKeyboard$1$1() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.ui.platform.PlatformTextInputInterceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object interceptStartInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest r3, androidx.compose.ui.platform.PlatformTextInputSession r4, h.c.e<?> r5) {
        /*
            r2 = this;
            boolean r3 = r5 instanceof androidx.compose.material3.SearchBarKt$DisableSoftKeyboard$1$1$interceptStartInputMethod$1
            if (r3 == 0) goto L13
            r3 = r5
            androidx.compose.material3.SearchBarKt$DisableSoftKeyboard$1$1$interceptStartInputMethod$1 r3 = (androidx.compose.material3.SearchBarKt$DisableSoftKeyboard$1$1$interceptStartInputMethod$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.material3.SearchBarKt$DisableSoftKeyboard$1$1$interceptStartInputMethod$1 r3 = new androidx.compose.material3.SearchBarKt$DisableSoftKeyboard$1$1$interceptStartInputMethod$1
            r3.<init>(r2, r5)
        L18:
            java.lang.Object r2 = r3.result
            h.c.a.a r4 = h.c.a.a.f48038a
            int r5 = r3.label
            r0 = 1
            if (r5 == 0) goto L2f
            if (r5 == r0) goto L2b
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L2b:
            e.b.c.b(r2)
            goto L3b
        L2f:
            e.b.c.b(r2)
            r3.label = r0
            java.lang.Object r2 = kotlinx.coroutines.aj.p(r3)
            if (r2 != r4) goto L3b
            return r4
        L3b:
            h.e r2 = new h.e
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarKt$DisableSoftKeyboard$1$1.interceptStartInputMethod(androidx.compose.ui.platform.PlatformTextInputMethodRequest, androidx.compose.ui.platform.PlatformTextInputSession, h.c.e):java.lang.Object");
    }
}
