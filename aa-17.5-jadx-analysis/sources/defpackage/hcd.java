package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hcd {
    public static final hcd a;
    public static final hcd b;
    public static final hcd c;
    public static final hcd d;
    public static final hcd e;
    public static final hcd f;
    public static final hcd g;
    private static final /* synthetic */ hcd[] i;
    public final int h;

    static {
        hcd hcdVar = new hcd("ROW", 0, 3);
        a = hcdVar;
        hcd hcdVar2 = new hcd("GRID_SMALL", 1, 3);
        b = hcdVar2;
        hcd hcdVar3 = new hcd("GRID_MEDIUM", 2, 3);
        c = hcdVar3;
        hcd hcdVar4 = new hcd("GRID_LARGE", 3, 3);
        d = hcdVar4;
        hcd hcdVar5 = new hcd("GRID_EXTRA_LARGE", 4, 1);
        e = hcdVar5;
        hcd hcdVar6 = new hcd("CONDENSED_ITEM", 5, 3);
        f = hcdVar6;
        hcd hcdVar7 = new hcd("BANNER", 6, 3);
        g = hcdVar7;
        hcd[] hcdVarArr = {hcdVar, hcdVar2, hcdVar3, hcdVar4, hcdVar5, hcdVar6, hcdVar7};
        i = hcdVarArr;
        affa.p(hcdVarArr);
    }

    private hcd(String str, int i2, int i3) {
        this.h = i3;
    }

    public static hcd valueOf(String str) {
        return (hcd) Enum.valueOf(hcd.class, str);
    }

    public static hcd[] values() {
        return (hcd[]) i.clone();
    }

    public final float a() {
        return ordinal() != 5 ? BitmapDescriptorFactory.HUE_RED : gjk.b.k;
    }

    public final float b() {
        return ordinal() != 5 ? BitmapDescriptorFactory.HUE_RED : gjk.b.k;
    }
}
