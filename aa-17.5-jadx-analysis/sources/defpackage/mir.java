package defpackage;

import com.google.android.gms.car.RadioProgramSelector;
import j$.util.Optional;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class mir {
    public static final yph a = yph.c("GH.Radio.MediaId");

    public static Optional a(String str) {
        ytz ytyVar;
        char cCharAt = ":".charAt(0);
        String string = str.toString();
        int iIndexOf = string.indexOf(cCharAt, 0);
        int i = 1;
        yua yuaVar = iIndexOf >= 0 ? new yua(string, iIndexOf, 1, Math.max(1, 1) + iIndexOf) : null;
        if (yuaVar == null) {
            ytyVar = ytz.a;
        } else {
            int i2 = yuaVar.b;
            String str2 = yuaVar.a;
            String strSubstring = str2.substring(0, i2);
            String strSubstring2 = str2.substring(yuaVar.c);
            ytz ytzVar = ytz.a;
            strSubstring.getClass();
            strSubstring2.getClass();
            ytyVar = new yty(strSubstring, strSubstring2);
        }
        return ytyVar.b().a(new moq(i));
    }

    public static Optional b(RadioProgramSelector radioProgramSelector) {
        RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = radioProgramSelector.a;
        int i = radioProgramIdentifier.a;
        if (i == 0) {
            return Optional.empty();
        }
        if (i == 1 || i == 2) {
            Optional optionalF = lws.f(radioProgramSelector);
            if (true != optionalF.isPresent()) {
                return optionalF;
            }
            Long l = (Long) optionalF.get();
            return lws.i(l.longValue()) ? Optional.of(1) : lws.k(l.longValue()) ? Optional.of(2) : Optional.empty();
        }
        if (i == 3) {
            long j = (radioProgramIdentifier.b >>> 36) & 262143;
            return lws.k(j) ? Optional.of(2) : lws.i(j) ? Optional.of(1) : Optional.empty();
        }
        if (i == 5 || i == 9) {
            return Optional.of(3);
        }
        ((ype) a.l().ai((char) 4985)).w("Unmapped identifier type %d", i);
        return Optional.empty();
    }

    static String c(RadioProgramSelector radioProgramSelector) {
        Object obj;
        RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier = radioProgramSelector.a;
        Optional optionalB = b(radioProgramSelector);
        miq miqVar = new miq(radioProgramIdentifier, 0);
        int i = 2;
        if (true == optionalB.isPresent()) {
            Object obj2 = optionalB.get();
            Object obj3 = miqVar.a;
            int iIntValue = ((Integer) obj2).intValue();
            RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier2 = (RadioProgramSelector.RadioProgramIdentifier) obj3;
            optionalB = Optional.ofNullable(String.format(Locale.ROOT, "%s:%s-%s-%s", iIntValue != 1 ? iIntValue != 2 ? "DAB" : "FM" : "AM", wub.N(Integer.toHexString((byte) radioProgramIdentifier2.a).toUpperCase(Locale.ROOT), 2), wub.N(Long.toHexString(radioProgramIdentifier2.b).toUpperCase(Locale.ROOT), 16), wub.N(Integer.toHexString(radioProgramIdentifier2.hashCode()).toUpperCase(Locale.ROOT), 8)));
        }
        kqe kqeVar = new kqe(radioProgramSelector, i);
        if (true != optionalB.isPresent()) {
            obj = "radio:" + ((RadioProgramSelector) kqeVar.a).hashCode();
        } else {
            obj = optionalB.get();
        }
        return (String) obj;
    }
}
