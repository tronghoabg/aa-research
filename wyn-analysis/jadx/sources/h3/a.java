package H3;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import k1.v0;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4883a = new a();

    @NotNull
    public final v0 a(@NotNull Context context) {
        AbstractC3340k.e(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        AbstractC3340k.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        return v0.g(null, windowInsets);
    }
}
