package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f17731a = new r();

    @NotNull
    public final OnBackInvokedCallback a(@NotNull tf.a onBackInvoked) {
        AbstractC3340k.e(onBackInvoked, "onBackInvoked");
        return new Kb.a(onBackInvoked, 1);
    }

    public final void b(@NotNull Object dispatcher, int i5, @NotNull Object callback) {
        AbstractC3340k.e(dispatcher, "dispatcher");
        AbstractC3340k.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i5, (OnBackInvokedCallback) callback);
    }

    public final void c(@NotNull Object dispatcher, @NotNull Object callback) {
        AbstractC3340k.e(dispatcher, "dispatcher");
        AbstractC3340k.e(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
