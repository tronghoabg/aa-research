package defpackage;

import android.content.res.ColorStateList;
import android.util.IntProperty;

/* loaded from: classes2.dex */
public final class omr extends IntProperty {
    public static final omr a = new omr();

    private omr() {
        super("focusRingColor");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        kwi kwiVar = (kwi) obj;
        kwiVar.getClass();
        ColorStateList colorStateListE = kwiVar.a.E();
        return Integer.valueOf(colorStateListE != null ? colorStateListE.getDefaultColor() : 0);
    }

    public final /* bridge */ /* synthetic */ void setValue(Object obj, int i) {
        kwi kwiVar = (kwi) obj;
        kwiVar.getClass();
        kwiVar.b(ColorStateList.valueOf(i));
    }
}
