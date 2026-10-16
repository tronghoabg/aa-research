package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dsk extends defpackage.drt {
    private boolean a;
    private boolean b;

    public dsk(android.content.Context context) {
        super(context);
    }

    @Override // defpackage.drt
    protected void a(android.util.AttributeSet attributeSet) {
        super.a(attributeSet);
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, defpackage.dsj.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.a = true;
                } else if (index == 22) {
                    this.b = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // defpackage.drt
    protected final void g(androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // defpackage.drt, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a || this.b) {
            android.view.ViewParent parent = getParent();
            if (parent instanceof androidx.constraintlayout.widget.ConstraintLayout) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.d; i++) {
                    android.view.View viewA = constraintLayout.a(this.c[i]);
                    if (viewA != null) {
                        if (this.a) {
                            viewA.setVisibility(visibility);
                        }
                        if (this.b && elevation > 0.0f) {
                            viewA.setTranslationZ(viewA.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        e();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        e();
    }

    public dsk(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public dsk(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void b(defpackage.drc drcVar, int i, int i2) {
    }
}
