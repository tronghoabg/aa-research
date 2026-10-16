package androidx.navigation;

import android.net.Uri;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavUriKt {
    public static final Uri NavUri(String str) {
        x.f(str, "uriString");
        return NavUriUtils.INSTANCE.parse(str);
    }
}
