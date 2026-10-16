package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kea extends android.widget.FrameLayout {
    public kea(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.projection.gearhead.R.attr.markerAppearance);
    }

    public abstract defpackage.hin a();

    public abstract void c(boolean z, boolean z2);

    public abstract void d(defpackage.gfa gfaVar, java.util.List list, int i, defpackage.him himVar);

    public abstract void e();

    public abstract boolean f();

    public kea(android.content.Context context) {
        this(context, null);
    }

    public kea(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public kea(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }
}
