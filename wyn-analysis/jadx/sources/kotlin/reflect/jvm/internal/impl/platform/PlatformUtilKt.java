package kotlin.reflect.jvm.internal.impl.platform;

import ff.o;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class PlatformUtilKt {
    @NotNull
    public static final String getPresentableDescription(@NotNull TargetPlatform targetPlatform) {
        AbstractC3340k.e(targetPlatform, "<this>");
        return o.w0(targetPlatform.getComponentPlatforms(), "/", null, null, null, 62);
    }
}
