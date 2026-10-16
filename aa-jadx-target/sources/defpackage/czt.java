package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class czt {
    private final android.content.Context a;
    private android.content.ClipboardManager b;

    public czt(android.content.Context context) {
        this.a = context;
    }

    public final android.content.ClipboardManager a() {
        android.content.ClipboardManager clipboardManager = this.b;
        if (clipboardManager != null) {
            return clipboardManager;
        }
        java.lang.Object systemService = this.a.getSystemService("clipboard");
        systemService.getClass();
        android.content.ClipboardManager clipboardManager2 = (android.content.ClipboardManager) systemService;
        this.b = clipboardManager2;
        return clipboardManager2;
    }
}
