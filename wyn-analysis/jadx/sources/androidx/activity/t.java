package androidx.activity;

import android.window.OnBackInvokedCallback;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f17736a = new t();

    @NotNull
    public final OnBackInvokedCallback a(@NotNull tf.l onBackStarted, @NotNull tf.l onBackProgressed, @NotNull tf.a onBackInvoked, @NotNull tf.a onBackCancelled) {
        AbstractC3340k.e(onBackStarted, "onBackStarted");
        AbstractC3340k.e(onBackProgressed, "onBackProgressed");
        AbstractC3340k.e(onBackInvoked, "onBackInvoked");
        AbstractC3340k.e(onBackCancelled, "onBackCancelled");
        return new s(onBackStarted, onBackProgressed, onBackInvoked, onBackCancelled);
    }
}
