package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hnh {
    public static final hnh a;
    public static final hnh b;
    public static final hnh c;
    public static final hnh d;
    public static final hnh e;
    public static final hnh f;
    public static final hnh g;
    public static final hnh h;
    public static final hnh i;
    public static final hnh j;
    public static final hnh k;
    public static final hnh l;
    public static final hnh m;
    public static final hnh n;
    public static final hnh o;
    public static final hnh p;
    public static final hnh q;
    public static final hnh r;
    public static final hnh s;
    public static final hnh t;
    public static final hnh u;
    public static final /* synthetic */ afdf v;
    private static final /* synthetic */ hnh[] y;
    public final int w;
    public final String x;

    static {
        hnh hnhVar = new hnh("ExampleEmbeddedHintId", 0, 1, "ExampleEmbeddedHint");
        a = hnhVar;
        hnh hnhVar2 = new hnh("WeatherHintId", 1, 2, "WeatherHint");
        b = hnhVar2;
        hnh hnhVar3 = new hnh("AaCardMetadataHintId", 2, 3, "AaCardMetadataHint");
        c = hnhVar3;
        hnh hnhVar4 = new hnh("DialerClickEventHintId", 3, 4, "DialerClickEventHint");
        d = hnhVar4;
        hnh hnhVar5 = new hnh("CrossDeviceIntentHintId", 4, 5, "CrossDeviceIntentHint");
        e = hnhVar5;
        hnh hnhVar6 = new hnh("RichCardHintId", 5, 6, "RichCardHint");
        f = hnhVar6;
        hnh hnhVar7 = new hnh("RichCardLiveDataHintId", 6, 7, "RichCardLiveDataHint");
        g = hnhVar7;
        hnh hnhVar8 = new hnh("ContactHintId", 7, 8, "ContactHint");
        h = hnhVar8;
        hnh hnhVar9 = new hnh("EntityTypeHintId", 8, 9, "EntityTypeHint");
        i = hnhVar9;
        hnh hnhVar10 = new hnh("ClientSignalHintId", 9, 10, "ClientSignalHint");
        j = hnhVar10;
        hnh hnhVar11 = new hnh("VisualMetadataHintId", 10, 11, "VisualMetadataHint");
        k = hnhVar11;
        hnh hnhVar12 = new hnh("RenderTokenHintId", 11, 12, "RenderTokenHint");
        l = hnhVar12;
        hnh hnhVar13 = new hnh("DoNotRepublishHintId", 12, 13, "DoNotRepublishHint");
        m = hnhVar13;
        hnh hnhVar14 = new hnh("LookupHintId", 13, 14, "LookupHint");
        n = hnhVar14;
        hnh hnhVar15 = new hnh("ThemeHintId", 14, 15, "ThemeHint");
        o = hnhVar15;
        hnh hnhVar16 = new hnh("DialerMetadataHintId", 15, 16, "DialerMetadataHint");
        p = hnhVar16;
        hnh hnhVar17 = new hnh("MessageMetadataHintId", 16, 17, "MessageMetadataHint");
        q = hnhVar17;
        hnh hnhVar18 = new hnh("GboardHintId", 17, 18, "GboardHint");
        r = hnhVar18;
        hnh hnhVar19 = new hnh("RichCardErrorHintId", 18, 19, "RichCardErrorHint");
        s = hnhVar19;
        hnh hnhVar20 = new hnh("BlueflaxMetadataHintId", 19, 20, "BlueflaxMetadataHint");
        t = hnhVar20;
        hnh hnhVar21 = new hnh("KeyEventHintId", 20, 21, "KeyEventHint");
        u = hnhVar21;
        hnh[] hnhVarArr = {hnhVar, hnhVar2, hnhVar3, hnhVar4, hnhVar5, hnhVar6, hnhVar7, hnhVar8, hnhVar9, hnhVar10, hnhVar11, hnhVar12, hnhVar13, hnhVar14, hnhVar15, hnhVar16, hnhVar17, hnhVar18, hnhVar19, hnhVar20, hnhVar21};
        y = hnhVarArr;
        v = affa.p(hnhVarArr);
    }

    private hnh(String str, int i2, int i3, String str2) {
        this.w = i3;
        this.x = str2;
    }

    public static hnh valueOf(String str) {
        return (hnh) Enum.valueOf(hnh.class, str);
    }

    public static hnh[] values() {
        return (hnh[]) y.clone();
    }
}
