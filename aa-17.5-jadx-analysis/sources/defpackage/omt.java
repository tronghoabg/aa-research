package defpackage;

import android.content.res.ColorStateList;
import android.util.IntProperty;

/* loaded from: classes2.dex */
public final class omt extends IntProperty {
    public static final omt a = new omt();

    private omt() {
        super("innerFocusRingColor");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        kwi kwiVar = (kwi) obj;
        kwiVar.getClass();
        ColorStateList colorStateListE = kwiVar.b.E();
        return Integer.valueOf(colorStateListE != null ? colorStateListE.getDefaultColor() : 0);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, int i) {
        kwi kwiVar = (kwi) obj;
        kwiVar.getClass();
        kwiVar.c(ColorStateList.valueOf(i));
    }
}
