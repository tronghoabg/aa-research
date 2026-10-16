package android.support.constraint;

/* JADX INFO: loaded from: classes.dex */
public class Guideline extends android.view.View {
    public Guideline(android.content.Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public Guideline(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(android.graphics.Canvas canvas) {
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
    }
}
