package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class eos extends ViewGroup.MarginLayoutParams {
    private static final eor c;
    private static final int d;
    public eou a;
    public eou b;

    static {
        eor eorVar = new eor(Integer.MIN_VALUE, -2147483647);
        c = eorVar;
        d = eorVar.a();
        int[] iArr = eob.a;
    }

    public eos(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        eou eouVar = eou.a;
        this.a = eouVar;
        this.b = eouVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eob.b);
        try {
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
            this.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
            this.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
            this.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
            this.bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
            typedArrayObtainStyledAttributes.recycle();
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eob.b);
            try {
                int i = typedArrayObtainStyledAttributes.getInt(10, 0);
                int i2 = typedArrayObtainStyledAttributes.getInt(7, Integer.MIN_VALUE);
                int i3 = d;
                this.b = GridLayout.e(i2, typedArrayObtainStyledAttributes.getInt(8, i3), GridLayout.d(i, true), typedArrayObtainStyledAttributes.getFloat(9, BitmapDescriptorFactory.HUE_RED));
                this.a = GridLayout.e(typedArrayObtainStyledAttributes.getInt(11, Integer.MIN_VALUE), typedArrayObtainStyledAttributes.getInt(12, i3), GridLayout.d(i, false), typedArrayObtainStyledAttributes.getFloat(13, BitmapDescriptorFactory.HUE_RED));
            } finally {
            }
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eos)) {
            return false;
        }
        eos eosVar = (eos) obj;
        return this.b.equals(eosVar.b) && this.a.equals(eosVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    @Override // android.view.ViewGroup.LayoutParams
    protected final void setBaseAttributes(TypedArray typedArray, int i, int i2) {
        this.width = typedArray.getLayoutDimension(i, -2);
        this.height = typedArray.getLayoutDimension(i2, -2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eos() {
        super(-2, -2);
        eou eouVar = eou.a;
        this.a = eouVar;
        this.b = eouVar;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = eouVar;
        this.b = eouVar;
    }

    public eos(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        eou eouVar = eou.a;
        this.a = eouVar;
        this.b = eouVar;
    }

    public eos(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        eou eouVar = eou.a;
        this.a = eouVar;
        this.b = eouVar;
    }

    public eos(eos eosVar) {
        super((ViewGroup.MarginLayoutParams) eosVar);
        eou eouVar = eou.a;
        this.a = eouVar;
        this.b = eouVar;
        this.a = eosVar.a;
        this.b = eosVar.b;
    }
}
