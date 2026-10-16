package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class dsc extends drl {
    private boolean a;
    private boolean b;

    public dsc(Context context) {
        super(context);
    }

    @Override // defpackage.drl
    protected void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dsb.b);
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

    @Override // defpackage.drl
    protected final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // defpackage.drl, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a || this.b) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.d; i++) {
                    View viewA = constraintLayout.a(this.c[i]);
                    if (viewA != null) {
                        if (this.a) {
                            viewA.setVisibility(visibility);
                        }
                        if (this.b && elevation > BitmapDescriptorFactory.HUE_RED) {
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

    public dsc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public dsc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void b(dqu dquVar, int i, int i2) {
    }
}
