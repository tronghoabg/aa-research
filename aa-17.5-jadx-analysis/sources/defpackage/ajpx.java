package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ajpx {
    public static final ajpx a;
    public static final ajpx b;
    public static final ajpx c;
    public static final ajpx d;
    public static final ajpx e;
    private static final /* synthetic */ ajpx[] f;

    static {
        ajpx ajpxVar = new ajpx("UNCHALLENGED", 0);
        a = ajpxVar;
        ajpx ajpxVar2 = new ajpx("CHALLENGED", 1);
        b = ajpxVar2;
        ajpx ajpxVar3 = new ajpx("HANDSHAKE", 2);
        c = ajpxVar3;
        ajpx ajpxVar4 = new ajpx("FAILURE", 3);
        d = ajpxVar4;
        ajpx ajpxVar5 = new ajpx(CloudRecognizerProtocolStrings.SUCCESS, 4);
        e = ajpxVar5;
        f = new ajpx[]{ajpxVar, ajpxVar2, ajpxVar3, ajpxVar4, ajpxVar5};
    }

    public static ajpx valueOf(String str) {
        return (ajpx) Enum.valueOf(ajpx.class, str);
    }

    public static ajpx[] values() {
        return (ajpx[]) f.clone();
    }
}
