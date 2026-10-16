package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bgc extends defpackage.bfw {
    public final android.view.textclassifier.TextClassification b;
    public final int c;
    public final android.graphics.drawable.Drawable d;

    public bgc(java.lang.Object obj, android.view.textclassifier.TextClassification textClassification, int i, android.graphics.drawable.Drawable drawable) {
        super(obj);
        this.b = textClassification;
        this.c = i;
        this.d = drawable;
    }

    public final java.lang.String toString() {
        return "TextContextMenuTextClassificationItem(key=" + this.a + ", textClassification=" + this.b + ", index=" + this.c + ", icon=" + this.d + ")";
    }
}
