package T3;

import android.net.ConnectivityManager;
import android.net.Network;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public abstract class i {
    @Nullable
    public static final Network a(@NotNull ConnectivityManager connectivityManager) {
        AbstractC3340k.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
