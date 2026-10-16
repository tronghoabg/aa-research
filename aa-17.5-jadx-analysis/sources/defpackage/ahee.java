package defpackage;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class ahee {
    public static final String a(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        str2.getClass();
        return str2;
    }

    public static final void b(Logger logger, ajiu ajiuVar, ajiw ajiwVar, String str) {
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        str2.getClass();
        logger.fine(ajiwVar.b + " " + str2 + ": " + ajiuVar.a);
    }

    public static final String c(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFC);
        strNormalize.getClass();
        return strNormalize;
    }

    public static final ahed createBinaryClassAnnotationAndConstantLoader(agcu agcuVar, agdb agdbVar, aiei aieiVar, ahfc ahfcVar, ahlc ahlcVar) {
        agcuVar.getClass();
        agdbVar.getClass();
        aieiVar.getClass();
        ahfcVar.getClass();
        ahlcVar.getClass();
        ahed ahedVar = new ahed(agcuVar, agdbVar, aieiVar, ahfcVar);
        ahedVar.setMetadataVersion(ahlcVar);
        return ahedVar;
    }
}
