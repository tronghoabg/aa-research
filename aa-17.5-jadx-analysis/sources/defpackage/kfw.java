package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class kfw {
    public Intent.ShortcutIconResource a;
    public Uri b;
    public int c;
    public int d;
    public Context e;
    private String f;

    public final String a() {
        String string = this.f;
        if (string == null) {
            Intent.ShortcutIconResource shortcutIconResource = this.a;
            if (shortcutIconResource != null) {
                string = shortcutIconResource.packageName + "/" + this.a.resourceName;
            } else {
                string = this.b.toString();
            }
            this.f = string;
        }
        return string;
    }

    public final String toString() {
        Intent.ShortcutIconResource shortcutIconResource = this.a;
        if (shortcutIconResource == null) {
            return "URI: ".concat(String.valueOf(String.valueOf(this.b)));
        }
        return "PackageName: " + shortcutIconResource.packageName + " Resource: " + String.valueOf(this.a) + " URI: " + String.valueOf(this.b);
    }
}
