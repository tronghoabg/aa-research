package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hci {
    public static final hci a;
    public static final hci b;
    private static final /* synthetic */ hci[] g;
    public final avp c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    static {
        hci hciVar = new hci("FULL_SCREEN", 0, asl.L(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, gjk.d.k, 7), true, true, false);
        a = hciVar;
        hci hciVar2 = new hci("CARD", 1, asl.K(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3), false, false, true);
        b = hciVar2;
        hci[] hciVarArr = {hciVar, hciVar2};
        g = hciVarArr;
        affa.p(hciVarArr);
    }

    private hci(String str, int i, avp avpVar, boolean z, boolean z2, boolean z3) {
        this.c = avpVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static hci valueOf(String str) {
        return (hci) Enum.valueOf(hci.class, str);
    }

    public static hci[] values() {
        return (hci[]) g.clone();
    }
}
