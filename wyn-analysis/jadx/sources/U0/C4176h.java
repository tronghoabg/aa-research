package u0;

import android.content.ClipboardManager;
import android.content.Context;

/* renamed from: u0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4176h implements I {

    /* renamed from: a, reason: collision with root package name */
    public final ClipboardManager f46230a;

    public C4176h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        this.f46230a = (ClipboardManager) systemService;
    }
}
