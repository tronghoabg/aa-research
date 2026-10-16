package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class ahem {
    private ahem() {
    }

    public static final int a(String str, int i) {
        return (str.charAt(i) << 7) + str.charAt(i + 1);
    }

    public static final int b(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(a.bo(i, i3, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public final ahlc getKOTLIN_1_3_RC_METADATA_VERSION$org_jetbrains_kotlin_descriptors_jvm() {
        return ahen.KOTLIN_1_3_RC_METADATA_VERSION;
    }

    public /* synthetic */ ahem(afeu afeuVar) {
        this();
    }
}
