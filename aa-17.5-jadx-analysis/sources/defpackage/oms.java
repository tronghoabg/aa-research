package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.util.IntProperty;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class oms extends IntProperty {
    private final qij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oms(Context context) {
        super("foregroundTint");
        context.getClass();
        this.a = new qij(context);
    }

    public static final Integer b(MaterialButton materialButton) {
        materialButton.getClass();
        ColorStateList colorStateList = materialButton.g;
        return Integer.valueOf(colorStateList != null ? colorStateList.getDefaultColor() : 0);
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void setValue(MaterialButton materialButton, int i) {
        materialButton.getClass();
        materialButton.k(ColorStateList.valueOf(i));
        qij qijVar = this.a;
        ColorStateList colorStateListI = thg.i(new fof(i, qijVar, (Context) qijVar.d, 5));
        if (materialButton.r()) {
            wmk wmkVar = materialButton.e;
            if (wmkVar.m != colorStateListI) {
                wmkVar.m = colorStateListI;
                MaterialButton materialButton2 = wmkVar.a;
                if (materialButton2.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton2.getBackground()).setColor(wtg.b(colorStateListI));
                }
            }
        }
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return b((MaterialButton) obj);
    }
}
