package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* loaded from: classes.dex */
public final class czl {
    private final Context a;
    private ClipboardManager b;

    public czl(Context context) {
        this.a = context;
    }

    public final ClipboardManager a() {
        ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        Object systemService = this.a.getSystemService("clipboard");
        systemService.getClass();
        ClipboardManager clipboardManager2 = (ClipboardManager) systemService;
        this.b = clipboardManager2;
        return clipboardManager2;
    }
}
