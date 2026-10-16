package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nj extends defpackage.ed {
    public int b;

    public nj(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = 0;
        this.leftMargin = marginLayoutParams.leftMargin;
        this.topMargin = marginLayoutParams.topMargin;
        this.rightMargin = marginLayoutParams.rightMargin;
        this.bottomMargin = marginLayoutParams.bottomMargin;
    }

    public nj(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    public nj(defpackage.ed edVar) {
        super(edVar);
        this.b = 0;
    }

    public nj(defpackage.nj njVar) {
        super((defpackage.ed) njVar);
        this.b = 0;
        this.b = njVar.b;
    }

    public nj(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = 0;
    }

    public nj() {
        this.b = 0;
        this.a = 8388627;
    }
}
