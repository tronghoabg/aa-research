package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ukt {
    public static final ukt a;
    public static final ukt b;
    public static final ukt c;
    public static final ukt d;
    public static final ukt e;
    public static final ukt f;
    public static final ukt g;
    public static final ukt h;
    private static final /* synthetic */ ukt[] i;

    static {
        ukt uktVar = new ukt("PARSE_ERROR", 0);
        a = uktVar;
        ukt uktVar2 = new ukt("STYLE_TABLES_UNAVAILABLE", 1);
        b = uktVar2;
        ukt uktVar3 = new ukt("UNSUPPORTED_FORMAT", 2);
        c = uktVar3;
        ukt uktVar4 = new ukt("IO_ERROR", 3);
        d = uktVar4;
        ukt uktVar5 = new ukt("UNEXPECTED_EXCEPTION", 4);
        e = uktVar5;
        ukt uktVar6 = new ukt("NO_TILE_UNPACKER_AVAILABLE", 5);
        f = uktVar6;
        ukt uktVar7 = new ukt("NO_DATA", 6);
        g = uktVar7;
        ukt uktVar8 = new ukt(CloudRecognizerProtocolStrings.SUCCESS, 7);
        h = uktVar8;
        i = new ukt[]{uktVar, uktVar2, uktVar3, uktVar4, uktVar5, uktVar6, uktVar7, uktVar8};
    }

    public static ukt valueOf(String str) {
        return (ukt) Enum.valueOf(ukt.class, str);
    }

    public static ukt[] values() {
        return (ukt[]) i.clone();
    }
}
