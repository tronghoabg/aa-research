package com.google.android.recaptcha.internal;

import Ef.E;
import Ef.H;
import android.webkit.WebView;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzed {

    @NotNull
    private final WebView zza;

    @NotNull
    private final E zzb;

    public zzed(@NotNull WebView webView, @NotNull E e7) {
        this.zza = webView;
        this.zzb = e7;
    }

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        H.D(this.zzb, null, new zzec((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
