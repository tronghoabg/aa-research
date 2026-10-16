package com.google.android.recaptcha.internal;

import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
final class zzo implements Executor {

    @NotNull
    public static final zzo zza = new zzo();

    private zzo() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NotNull Runnable runnable) {
        runnable.run();
    }
}
