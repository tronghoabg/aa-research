package defpackage;

import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class rsf {
    public static final rsf a;
    public static final rsf b;
    public static final rsf c;
    public static final rsf d;
    private static final /* synthetic */ rsf[] e;

    static {
        rsf rsfVar = new rsf(CloudRecognizerProtocolStrings.SUCCESS, 0);
        a = rsfVar;
        rsf rsfVar2 = new rsf("INVALID_PAIRING_METHOD", 1);
        b = rsfVar2;
        rsf rsfVar3 = new rsf("INVALID_AUTH_DATA", 2);
        c = rsfVar3;
        rsf rsfVar4 = new rsf("AUTH_DATA_MISMATCH", 3);
        d = rsfVar4;
        e = new rsf[]{rsfVar, rsfVar2, rsfVar3, rsfVar4};
    }

    public static rsf valueOf(String str) {
        return (rsf) Enum.valueOf(rsf.class, str);
    }

    public static rsf[] values() {
        return (rsf[]) e.clone();
    }
}
