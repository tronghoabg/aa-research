package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gip {
    public static final gip a;
    public static final gip b;
    public static final gip c;
    public static final gip d;
    public static final gip e;
    public static final gip f;
    private static final /* synthetic */ gip[] h;
    public final float g;

    static {
        gip gipVar = new gip("L0", 0, BitmapDescriptorFactory.HUE_RED);
        a = gipVar;
        gip gipVar2 = new gip("L1", 1, 1.0f);
        b = gipVar2;
        gip gipVar3 = new gip("L2", 2, 3.0f);
        c = gipVar3;
        gip gipVar4 = new gip("L3", 3, 6.0f);
        d = gipVar4;
        gip gipVar5 = new gip("L4", 4, 8.0f);
        e = gipVar5;
        gip gipVar6 = new gip("L5", 5, 12.0f);
        f = gipVar6;
        gip[] gipVarArr = {gipVar, gipVar2, gipVar3, gipVar4, gipVar5, gipVar6};
        h = gipVarArr;
        affa.p(gipVarArr);
    }

    private gip(String str, int i, float f2) {
        this.g = f2;
    }

    public static gip valueOf(String str) {
        return (gip) Enum.valueOf(gip.class, str);
    }

    public static gip[] values() {
        return (gip[]) h.clone();
    }
}
