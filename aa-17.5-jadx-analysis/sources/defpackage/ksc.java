package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ksc {
    public static final ksc a;
    public static final ksc b;
    public static final ksc c;
    public static final ksc d;
    public static final ksc e;
    public static final ksc f;
    private static final /* synthetic */ ksc[] h;
    public final float g;

    static {
        ksc kscVar = new ksc("L0", 0, BitmapDescriptorFactory.HUE_RED);
        a = kscVar;
        ksc kscVar2 = new ksc("L1", 1, 1.0f);
        b = kscVar2;
        ksc kscVar3 = new ksc("L2", 2, 3.0f);
        c = kscVar3;
        ksc kscVar4 = new ksc("L3", 3, 6.0f);
        d = kscVar4;
        ksc kscVar5 = new ksc("L4", 4, 8.0f);
        e = kscVar5;
        ksc kscVar6 = new ksc("L5", 5, 12.0f);
        f = kscVar6;
        ksc[] kscVarArr = {kscVar, kscVar2, kscVar3, kscVar4, kscVar5, kscVar6};
        h = kscVarArr;
        affa.p(kscVarArr);
    }

    private ksc(String str, int i, float f2) {
        this.g = f2;
    }

    public static ksc valueOf(String str) {
        return (ksc) Enum.valueOf(ksc.class, str);
    }

    public static ksc[] values() {
        return (ksc[]) h.clone();
    }
}
