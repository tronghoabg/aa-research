package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gvl {
    public static final gvl a;
    public static final gvl b;
    public static final gvl c;
    public static final gvl d;
    public static final gvl e;
    private static final /* synthetic */ gvl[] h;
    public final gvk f;
    public final boolean g;

    static {
        gvl gvlVar = new gvl("NONE", 0, new gvk(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15), false);
        a = gvlVar;
        gvl gvlVar2 = new gvl("HORIZONTAL_BAR_STICKY", 1, new gvk(120.0f, BitmapDescriptorFactory.HUE_RED, 13), false);
        b = gvlVar2;
        gvl gvlVar3 = new gvl("HORIZONTAL_BAR_FLOATING", 2, new gvk(gjk.c.k + 120.0f + BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), true);
        c = gvlVar3;
        gvl gvlVar4 = new gvl("WIDE_CARD", 3, new gvk(BitmapDescriptorFactory.HUE_RED, gjk.d.k + 420.0f + BitmapDescriptorFactory.HUE_RED, 7), false);
        d = gvlVar4;
        gvl gvlVar5 = new gvl("VERTICAL_STACKED", 4, new gvk(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 15), false);
        e = gvlVar5;
        gvl[] gvlVarArr = {gvlVar, gvlVar2, gvlVar3, gvlVar4, gvlVar5};
        h = gvlVarArr;
        affa.p(gvlVarArr);
    }

    private gvl(String str, int i, gvk gvkVar, boolean z) {
        this.f = gvkVar;
        this.g = z;
    }

    public static gvl valueOf(String str) {
        return (gvl) Enum.valueOf(gvl.class, str);
    }

    public static gvl[] values() {
        return (gvl[]) h.clone();
    }
}
