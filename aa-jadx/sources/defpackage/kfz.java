package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kfz {
    public android.content.Intent.ShortcutIconResource a;
    public android.net.Uri b;
    public int c;
    public int d;
    public android.content.Context e;
    private java.lang.String f;

    public final java.lang.String a() {
        java.lang.String string = this.f;
        if (string == null) {
            android.content.Intent.ShortcutIconResource shortcutIconResource = this.a;
            if (shortcutIconResource != null) {
                string = shortcutIconResource.packageName + "/" + this.a.resourceName;
            } else {
                string = this.b.toString();
            }
            this.f = string;
        }
        return string;
    }

    public final java.lang.String toString() {
        android.content.Intent.ShortcutIconResource shortcutIconResource = this.a;
        if (shortcutIconResource == null) {
            return "URI: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(this.b)));
        }
        return "PackageName: " + shortcutIconResource.packageName + " Resource: " + java.lang.String.valueOf(this.a) + " URI: " + java.lang.String.valueOf(this.b);
    }
}
