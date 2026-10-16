package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.View;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class ComposeInputMethodManager_androidKt {
    private static l<? super View, ? extends ComposeInputMethodManager> ComposeInputMethodManagerFactory = new l() { // from class: androidx.compose.foundation.text.input.internal.ComposeInputMethodManager_androidKt$$ExternalSyntheticLambda0
        @Override // h.g.a.l
        public final Object invoke(Object obj) {
            return ComposeInputMethodManager_androidKt.ComposeInputMethodManagerFactory$lambda$0((View) obj);
        }
    };

    public static final ComposeInputMethodManager ComposeInputMethodManager(View view) {
        return ComposeInputMethodManagerFactory.invoke(view);
    }

    static final ComposeInputMethodManager ComposeInputMethodManagerFactory$lambda$0(View view) {
        return Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new ComposeInputMethodManagerImplApi24(view);
    }

    public static final l<View, ComposeInputMethodManager> overrideComposeInputMethodManagerFactoryForTests(l<? super View, ? extends ComposeInputMethodManager> lVar) {
        l lVar2 = ComposeInputMethodManagerFactory;
        ComposeInputMethodManagerFactory = lVar;
        return lVar2;
    }
}
