package com.unity3d.ads.core.extensions;

import Bf.a;
import cg.C1621j;
import java.net.URLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"getSHA256Hash", "", "guessMimeType", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class StringExtensionsKt {
    @NotNull
    public static final String getSHA256Hash(@NotNull String str) {
        AbstractC3340k.e(str, "<this>");
        byte[] bytes = str.getBytes(a.f1670a);
        AbstractC3340k.d(bytes, "this as java.lang.String).getBytes(charset)");
        String strE = C1621j.l(Arrays.copyOf(bytes, bytes.length)).c("SHA-256").e();
        AbstractC3340k.d(strE, "bytes.sha256().hex()");
        return strE;
    }

    @Nullable
    public static final String guessMimeType(@NotNull String str) {
        AbstractC3340k.e(str, "<this>");
        return URLConnection.guessContentTypeFromName(str);
    }
}
