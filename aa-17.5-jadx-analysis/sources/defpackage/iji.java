package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

/* loaded from: classes2.dex */
public final class iji extends DefaultHandler2 {
    private int d;
    private iip a = null;
    private ihu b = null;
    private boolean c = false;
    private boolean e = false;
    private ijh f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;

    private static final void A(ihk ihkVar, Attributes attributes, String str) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (ijg.a(attributes.getLocalName(i)) == ijg.V) {
                kqf kqfVar = new kqf(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                kqfVar.o();
                while (!kqfVar.r()) {
                    float fG = kqfVar.g();
                    if (Float.isNaN(fG)) {
                        throw new SAXException(a.bq(str, "Invalid <", "> points attribute. Non-coordinate content found in list."));
                    }
                    kqfVar.t();
                    float fG2 = kqfVar.g();
                    if (Float.isNaN(fG2)) {
                        throw new SAXException(a.bq(str, "Invalid <", "> points attribute. There should be an even number of coordinates."));
                    }
                    kqfVar.t();
                    arrayList.add(Float.valueOf(fG));
                    arrayList.add(Float.valueOf(fG2));
                }
                ihkVar.a = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    ihkVar.a[i3] = ((Float) arrayList.get(i2)).floatValue();
                    i2++;
                    i3++;
                }
            }
        }
    }

    private static final void B(ihw ihwVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOrdinal = ijg.a(attributes.getLocalName(i)).ordinal();
                if (iOrdinal == 0) {
                    ArrayList arrayList = null;
                    kqf kqfVar = new kqf(strTrim, null);
                    while (!kqfVar.r()) {
                        String strV = kqfVar.v();
                        if (strV == null) {
                            throw new SAXException("Invalid value for \"class\" attribute: ".concat(String.valueOf(strTrim)));
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(strV);
                        kqfVar.o();
                    }
                    ihwVar.s = arrayList;
                } else if (iOrdinal != 72) {
                    if (ihwVar.q == null) {
                        ihwVar.q = new ihp();
                    }
                    c(ihwVar.q, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    kqf kqfVar2 = new kqf(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strN = kqfVar2.n(':');
                        kqfVar2.o();
                        if (kqfVar2.p(':')) {
                            kqfVar2.o();
                            String strN2 = kqfVar2.n(';');
                            if (strN2 != null) {
                                kqfVar2.o();
                                if (kqfVar2.r() || kqfVar2.p(';')) {
                                    if (ihwVar.r == null) {
                                        ihwVar.r = new ihp();
                                    }
                                    c(ihwVar.r, strN, strN2);
                                    kqfVar2.o();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static final void C(iil iilVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = ijg.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 9) {
                iilVar.d = m(strTrim);
            } else if (iOrdinal == 10) {
                iilVar.e = m(strTrim);
            } else if (iOrdinal == 82) {
                iilVar.b = m(strTrim);
            } else if (iOrdinal == 83) {
                iilVar.c = m(strTrim);
            }
        }
    }

    private static final void D(iic iicVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = ijg.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 48) {
                v(iicVar, strTrim);
            } else if (iOrdinal != 80) {
                continue;
            } else {
                kqf kqfVar = new kqf(strTrim);
                kqfVar.o();
                float fG = kqfVar.g();
                kqfVar.t();
                float fG2 = kqfVar.g();
                kqfVar.t();
                float fG3 = kqfVar.g();
                kqfVar.t();
                float fG4 = kqfVar.g();
                if (Float.isNaN(fG) || Float.isNaN(fG2) || Float.isNaN(fG3) || Float.isNaN(fG4)) {
                    throw new SAXException("Invalid viewBox definition - should have four numbers");
                }
                if (fG3 < BitmapDescriptorFactory.HUE_RED) {
                    throw new SAXException("Invalid viewBox. width cannot be negative");
                }
                if (fG4 < BitmapDescriptorFactory.HUE_RED) {
                    throw new SAXException("Invalid viewBox. height cannot be negative");
                }
                iicVar.w = new igo(fG, fG2, fG3, fG4);
            }
        }
    }

    private static float E(String str, int i) throws SAXException {
        float fA = new igl().a(str, 0, i);
        if (Float.isNaN(fA)) {
            throw new SAXException("Invalid float value: ".concat(String.valueOf(str)));
        }
        return fA;
    }

    private static final Matrix F(String str) throws SAXException {
        Matrix matrix = new Matrix();
        kqf kqfVar = new kqf(str);
        kqfVar.o();
        while (!kqfVar.r()) {
            String strSubstring = null;
            if (!kqfVar.r()) {
                int i = kqfVar.a;
                int iCharAt = ((String) kqfVar.c).charAt(i);
                while (true) {
                    if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                        break;
                    }
                    iCharAt = kqfVar.i();
                }
                int i2 = kqfVar.a;
                while (kqf.w(iCharAt)) {
                    iCharAt = kqfVar.i();
                }
                if (iCharAt == 40) {
                    kqfVar.a++;
                    strSubstring = ((String) kqfVar.c).substring(i, i2);
                } else {
                    kqfVar.a = i;
                }
            }
            if (strSubstring == null) {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
            if (strSubstring.equals("matrix")) {
                kqfVar.o();
                float fG = kqfVar.g();
                kqfVar.t();
                float fG2 = kqfVar.g();
                kqfVar.t();
                float fG3 = kqfVar.g();
                kqfVar.t();
                float fG4 = kqfVar.g();
                kqfVar.t();
                float fG5 = kqfVar.g();
                kqfVar.t();
                float fG6 = kqfVar.g();
                kqfVar.o();
                if (Float.isNaN(fG6) || !kqfVar.p(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{fG, fG3, fG5, fG2, fG4, fG6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f});
                matrix.preConcat(matrix2);
            } else if (strSubstring.equals("translate")) {
                kqfVar.o();
                float fG7 = kqfVar.g();
                float fH = kqfVar.h();
                kqfVar.o();
                if (Float.isNaN(fG7) || !kqfVar.p(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(fH)) {
                    matrix.preTranslate(fG7, BitmapDescriptorFactory.HUE_RED);
                } else {
                    matrix.preTranslate(fG7, fH);
                }
            } else if (strSubstring.equals("scale")) {
                kqfVar.o();
                float fG8 = kqfVar.g();
                float fH2 = kqfVar.h();
                kqfVar.o();
                if (Float.isNaN(fG8) || !kqfVar.p(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(fH2)) {
                    matrix.preScale(fG8, fG8);
                } else {
                    matrix.preScale(fG8, fH2);
                }
            } else if (strSubstring.equals("rotate")) {
                kqfVar.o();
                float fG9 = kqfVar.g();
                float fH3 = kqfVar.h();
                float fH4 = kqfVar.h();
                kqfVar.o();
                if (Float.isNaN(fG9) || !kqfVar.p(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(fH3)) {
                    matrix.preRotate(fG9);
                } else {
                    if (Float.isNaN(fH4)) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    matrix.preRotate(fG9, fH3, fH4);
                }
            } else if (strSubstring.equals("skewX")) {
                kqfVar.o();
                float fG10 = kqfVar.g();
                kqfVar.o();
                if (Float.isNaN(fG10) || !kqfVar.p(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                matrix.preSkew((float) Math.tan(Math.toRadians(fG10)), BitmapDescriptorFactory.HUE_RED);
            } else {
                if (!strSubstring.equals("skewY")) {
                    throw new SAXException(a.bq(strSubstring, "Invalid transform list fn: ", ")"));
                }
                kqfVar.o();
                float fG11 = kqfVar.g();
                kqfVar.o();
                if (Float.isNaN(fG11) || !kqfVar.p(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                matrix.preSkew(BitmapDescriptorFactory.HUE_RED, (float) Math.tan(Math.toRadians(fG11)));
            }
            if (kqfVar.r()) {
                break;
            }
            kqfVar.t();
        }
        return matrix;
    }

    private static final void G(igv igvVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = ijg.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 23) {
                int i2 = 1;
                if (iOrdinal != 24) {
                    if (iOrdinal != 26) {
                        if (iOrdinal != 60) {
                            continue;
                        } else {
                            try {
                                int iHashCode = strTrim.hashCode();
                                if (iHashCode == -934531685) {
                                    if (!strTrim.equals("repeat")) {
                                        throw new IllegalArgumentException();
                                    }
                                    i2 = 3;
                                    igvVar.e = i2;
                                } else if (iHashCode == 110739) {
                                    if (!strTrim.equals("pad")) {
                                        throw new IllegalArgumentException();
                                    }
                                    igvVar.e = i2;
                                } else {
                                    if (iHashCode != 1085265597 || !strTrim.equals("reflect")) {
                                        throw new IllegalArgumentException();
                                    }
                                    i2 = 2;
                                    igvVar.e = i2;
                                }
                            } catch (IllegalArgumentException unused) {
                                throw new SAXException(a.bq(strTrim, "Invalid spreadMethod attribute. \"", "\" is not a valid value."));
                            }
                        }
                    } else if ("http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                        igvVar.d = strTrim;
                    }
                } else if ("objectBoundingBox".equals(strTrim)) {
                    igvVar.b = false;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SAXException("Invalid value for attribute gradientUnits");
                    }
                    igvVar.b = true;
                }
            } else {
                igvVar.c = F(strTrim);
            }
        }
    }

    private static final void H(igy igyVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (ijg.a(attributes.getLocalName(i)) == ijg.ay) {
                igyVar.a(F(attributes.getValue(i)));
            }
        }
    }

    private static iha I(kqf kqfVar) {
        return kqfVar.q("auto") ? new iha(BitmapDescriptorFactory.HUE_RED) : kqfVar.j();
    }

    protected static iha a(String str) throws SAXException {
        int i;
        int iF;
        if (str.length() == 0) {
            throw new SAXException("Invalid length value (empty string)");
        }
        int length = str.length();
        int i2 = length - 1;
        char cCharAt = str.charAt(i2);
        try {
            if (cCharAt != '%') {
                i = 1;
                if (length > 2 && Character.isLetter(cCharAt)) {
                    i2 = length - 2;
                    if (Character.isLetter(str.charAt(i2))) {
                        try {
                            iF = fxy.f(str.substring(i2).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                            throw new SAXException("Invalid length unit specifier: ".concat(String.valueOf(str)));
                        }
                    }
                }
                return new iha(E(str, length), i);
            }
            iF = 9;
            return new iha(E(str, length), i);
        } catch (NumberFormatException e) {
            throw new SAXException("Invalid length value: ".concat(String.valueOf(str)), e);
        }
        i = iF;
        length = i2;
    }

    public static void c(ihp ihpVar, String str, String str2) throws SAXException {
        Boolean bool;
        String strN;
        int i;
        iha ihaVarJ;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = ijg.a(str).ordinal();
        int i2 = 5;
        kzt kztVar = null;
        ihaVarArr = null;
        ihaVarArr = null;
        iha[] ihaVarArr = null;
        String strSubstring = null;
        if (iOrdinal == 1) {
            if (!"auto".equals(str2)) {
                if (!str2.toLowerCase(Locale.US).startsWith("rect(")) {
                    throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
                }
                kqf kqfVar = new kqf(str2.substring(5));
                kqfVar.o();
                iha ihaVarI = I(kqfVar);
                kqfVar.t();
                iha ihaVarI2 = I(kqfVar);
                kqfVar.t();
                iha ihaVarI3 = I(kqfVar);
                kqfVar.t();
                iha ihaVarI4 = I(kqfVar);
                kqfVar.o();
                if (!kqfVar.p(')')) {
                    throw new SAXException("Bad rect() clip definition: ".concat(String.valueOf(str2)));
                }
                kztVar = new kzt(ihaVarI, ihaVarI2, ihaVarI3, ihaVarI4);
            }
            ihpVar.L = kztVar;
            ihpVar.a |= 1048576;
            return;
        }
        if (iOrdinal == 2) {
            ihpVar.w = k(str2, str);
            ihpVar.a |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            ihpVar.J = w(str2);
            ihpVar.a |= 536870912;
            return;
        }
        if (iOrdinal == 5) {
            ihpVar.k = g(str2);
            ihpVar.a |= 4096;
            return;
        }
        if (iOrdinal == 8) {
            if (!"ltr".equals(str2)) {
                if (!"rtl".equals(str2)) {
                    throw new SAXException("Invalid direction property: ".concat(String.valueOf(str2)));
                }
                i = 2;
            }
            ihpVar.H = i;
            ihpVar.a |= 68719476736L;
            return;
        }
        if (iOrdinal == 35) {
            ihpVar.x = k(str2, str);
            ihpVar.a |= 1073741824;
            return;
        }
        if (iOrdinal == 40) {
            ihpVar.j = Float.valueOf(e(str2));
            ihpVar.a |= 2048;
            return;
        }
        if (iOrdinal == 42) {
            if ("visible".equals(str2) || "auto".equals(str2)) {
                bool = Boolean.TRUE;
            } else {
                if (!"hidden".equals(str2) && !"scroll".equals(str2)) {
                    throw new SAXException("Invalid toverflow property: ".concat(String.valueOf(str2)));
                }
                bool = Boolean.FALSE;
            }
            ihpVar.o = bool;
            ihpVar.a |= 524288;
            return;
        }
        if (iOrdinal == 78) {
            if (!"none".equals(str2)) {
                if (!"non-scaling-stroke".equals(str2)) {
                    throw new SAXException("Invalid vector-effect property: ".concat(String.valueOf(str2)));
                }
                i = 2;
            }
            ihpVar.K = i;
            ihpVar.a |= 34359738368L;
            return;
        }
        if (iOrdinal == 58) {
            if (str2.equals("currentColor")) {
                ihpVar.y = igs.a;
            } else {
                ihpVar.y = g(str2);
            }
            ihpVar.a |= 2147483648L;
            return;
        }
        if (iOrdinal == 59) {
            ihpVar.z = Float.valueOf(e(str2));
            ihpVar.a |= 4294967296L;
            return;
        }
        if (iOrdinal == 74) {
            if (!"start".equals(str2)) {
                if ("middle".equals(str2)) {
                    i = 2;
                } else {
                    if (!"end".equals(str2)) {
                        throw new SAXException("Invalid text-anchor property: ".concat(String.valueOf(str2)));
                    }
                    i = 3;
                }
            }
            ihpVar.I = i;
            ihpVar.a |= 262144;
            return;
        }
        if (iOrdinal == 75) {
            if ("none".equals(str2)) {
                i2 = 1;
            } else if ("underline".equals(str2)) {
                i2 = 2;
            } else if ("overline".equals(str2)) {
                i2 = 3;
            } else if ("line-through".equals(str2)) {
                i2 = 4;
            } else if (!"blink".equals(str2)) {
                throw new SAXException("Invalid text-decoration property: ".concat(String.valueOf(str2)));
            }
            ihpVar.G = i2;
            ihpVar.a |= 131072;
            return;
        }
        switch (iOrdinal) {
            case 14:
                if (str2.indexOf(124) >= 0 || "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf(a.bq(str2, "|", "|")) == -1) {
                    throw new SAXException("Invalid value for \"display\" attribute: ".concat(String.valueOf(str2)));
                }
                ihpVar.s = Boolean.valueOf(!str2.equals("none"));
                ihpVar.a |= 16777216;
                return;
            case 15:
                ihpVar.b = j(str2, "fill");
                ihpVar.a |= 1;
                return;
            case 16:
                ihpVar.C = w(str2);
                ihpVar.a |= 2;
                return;
            case 17:
                ihpVar.c = Float.valueOf(e(str2));
                ihpVar.a |= 4;
                return;
            case 18:
                if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf(a.bq(str2, "|", "|")) == -1) {
                    kqf kqfVar2 = new kqf(str2);
                    int iX = 0;
                    Integer numA = null;
                    String str3 = null;
                    while (true) {
                        strN = kqfVar2.n('/');
                        kqfVar2.o();
                        if (strN == null) {
                            throw new SAXException("Invalid font style attribute: missing font size and family");
                        }
                        if (numA == null) {
                            i = iX;
                        } else if (iX == 0) {
                            i = 0;
                        }
                        if (!strN.equals("normal") && (numA != null || (numA = ijf.a(strN)) == null)) {
                            if (i == 0) {
                                iX = x(strN);
                                if (iX != 0) {
                                    continue;
                                }
                            } else {
                                iX = i;
                            }
                            if (str3 == null && strN.equals("small-caps")) {
                                str3 = strN;
                            }
                        }
                    }
                    iha ihaVarH = h(strN);
                    if (kqfVar2.p('/')) {
                        kqfVar2.o();
                        String strN2 = kqfVar2.n(' ');
                        if (strN2 == null) {
                            throw new SAXException("Invalid font style attribute: missing line-height");
                        }
                        a(strN2);
                        kqfVar2.o();
                    }
                    if (!kqfVar2.r()) {
                        int i3 = kqfVar2.a;
                        kqfVar2.a = kqfVar2.b;
                        strSubstring = ((String) kqfVar2.c).substring(i3);
                    }
                    ihpVar.l = l(strSubstring);
                    ihpVar.m = ihaVarH;
                    ihpVar.n = Integer.valueOf(numA == null ? 400 : numA.intValue());
                    ihpVar.F = iX != 0 ? iX : 1;
                    ihpVar.a |= 122880;
                    return;
                }
                return;
            case 19:
                ihpVar.l = l(str2);
                ihpVar.a |= 8192;
                return;
            case 20:
                ihpVar.m = h(str2);
                ihpVar.a |= 16384;
                return;
            case 21:
                Integer numA2 = ijf.a(str2);
                if (numA2 == null) {
                    throw new SAXException("Invalid font-weight property: ".concat(String.valueOf(str2)));
                }
                ihpVar.n = numA2;
                ihpVar.a |= 32768;
                return;
            case 22:
                int iX2 = x(str2);
                if (iX2 == 0) {
                    throw new SAXException("Invalid font-style property: ".concat(String.valueOf(str2)));
                }
                ihpVar.F = iX2;
                ihpVar.a |= 65536;
                return;
            default:
                switch (iOrdinal) {
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        ihpVar.p = k(str2, str);
                        String str4 = ihpVar.p;
                        ihpVar.q = str4;
                        ihpVar.r = str4;
                        ihpVar.a |= 14680064;
                        return;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        ihpVar.p = k(str2, str);
                        ihpVar.a |= 2097152;
                        return;
                    case 30:
                        ihpVar.q = k(str2, str);
                        ihpVar.a |= 4194304;
                        return;
                    case 31:
                        ihpVar.r = k(str2, str);
                        ihpVar.a |= 8388608;
                        return;
                    default:
                        switch (iOrdinal) {
                            case 62:
                                if (str2.equals("currentColor")) {
                                    ihpVar.u = igs.a;
                                } else {
                                    ihpVar.u = g(str2);
                                }
                                ihpVar.a |= 67108864;
                                return;
                            case 63:
                                ihpVar.v = Float.valueOf(e(str2));
                                ihpVar.a |= 134217728;
                                return;
                            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                                ihpVar.d = j(str2, "stroke");
                                ihpVar.a |= 8;
                                return;
                            case 65:
                                if ("none".equals(str2)) {
                                    ihpVar.h = null;
                                } else {
                                    kqf kqfVar3 = new kqf(str2);
                                    kqfVar3.o();
                                    if (!kqfVar3.r() && (ihaVarJ = kqfVar3.j()) != null) {
                                        if (ihaVarJ.e()) {
                                            throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                        }
                                        float f = ihaVarJ.a;
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(ihaVarJ);
                                        while (!kqfVar3.r()) {
                                            kqfVar3.t();
                                            iha ihaVarJ2 = kqfVar3.j();
                                            if (ihaVarJ2 == null) {
                                                throw new SAXException("Invalid stroke-dasharray. Non-Length content found: ".concat(String.valueOf(str2)));
                                            }
                                            if (ihaVarJ2.e()) {
                                                throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                            }
                                            arrayList.add(ihaVarJ2);
                                            f += ihaVarJ2.a;
                                        }
                                        if (f != BitmapDescriptorFactory.HUE_RED) {
                                            ihaVarArr = (iha[]) arrayList.toArray(new iha[arrayList.size()]);
                                        }
                                    }
                                    ihpVar.h = ihaVarArr;
                                }
                                ihpVar.a |= 512;
                                return;
                            case 66:
                                ihpVar.i = a(str2);
                                ihpVar.a |= 1024;
                                return;
                            case 67:
                                if (!"butt".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        i = 2;
                                    } else {
                                        if (!"square".equals(str2)) {
                                            throw new SAXException("Invalid stroke-linecap property: ".concat(String.valueOf(str2)));
                                        }
                                        i = 3;
                                    }
                                }
                                ihpVar.D = i;
                                ihpVar.a |= 64;
                                return;
                            case 68:
                                if (!"miter".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        i = 2;
                                    } else {
                                        if (!"bevel".equals(str2)) {
                                            throw new SAXException("Invalid stroke-linejoin property: ".concat(String.valueOf(str2)));
                                        }
                                        i = 3;
                                    }
                                }
                                ihpVar.E = i;
                                ihpVar.a |= 128;
                                return;
                            case 69:
                                ihpVar.g = Float.valueOf(d(str2));
                                ihpVar.a |= 256;
                                return;
                            case 70:
                                ihpVar.e = Float.valueOf(e(str2));
                                ihpVar.a |= 16;
                                return;
                            case 71:
                                ihpVar.f = a(str2);
                                ihpVar.a |= 32;
                                return;
                            default:
                                switch (iOrdinal) {
                                    case 88:
                                        if (str2.equals("currentColor")) {
                                            ihpVar.A = igs.a;
                                        } else {
                                            ihpVar.A = g(str2);
                                        }
                                        ihpVar.a |= 8589934592L;
                                        return;
                                    case 89:
                                        ihpVar.B = Float.valueOf(e(str2));
                                        ihpVar.a |= 17179869184L;
                                        return;
                                    case 90:
                                        if (str2.indexOf(124) >= 0 || "|visible|hidden|collapse|".indexOf(a.bq(str2, "|", "|")) == -1) {
                                            throw new SAXException("Invalid value for \"visibility\" attribute: ".concat(String.valueOf(str2)));
                                        }
                                        ihpVar.t = Boolean.valueOf(str2.equals("visible"));
                                        ihpVar.a |= 33554432;
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
        }
    }

    private static float d(String str) throws SAXException {
        int length = str.length();
        if (length != 0) {
            return E(str, length);
        }
        throw new SAXException("Invalid float value (empty string)");
    }

    private static float e(String str) throws SAXException {
        float fD = d(str);
        if (fD < BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        if (fD > 1.0f) {
            return 1.0f;
        }
        return fD;
    }

    private static int f(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    private static igr g(String str) throws SAXException {
        long j;
        int i;
        if (str.charAt(0) != '#') {
            if (!str.toLowerCase(Locale.US).startsWith("rgb(")) {
                Integer num = (Integer) ijd.a.get(str.toLowerCase(Locale.US));
                if (num != null) {
                    return new igr(num.intValue());
                }
                throw new SAXException("Invalid colour keyword: ".concat(String.valueOf(str)));
            }
            kqf kqfVar = new kqf(str.substring(4));
            kqfVar.o();
            float fG = kqfVar.g();
            if (!Float.isNaN(fG) && kqfVar.p('%')) {
                fG = (fG * 256.0f) / 100.0f;
            }
            float f = kqfVar.f(fG);
            if (!Float.isNaN(f) && kqfVar.p('%')) {
                f = (f * 256.0f) / 100.0f;
            }
            float f2 = kqfVar.f(f);
            if (!Float.isNaN(f2) && kqfVar.p('%')) {
                f2 = (f2 * 256.0f) / 100.0f;
            }
            kqfVar.o();
            if (Float.isNaN(f2) || !kqfVar.p(')')) {
                throw new SAXException("Bad rgb() colour value: ".concat(String.valueOf(str)));
            }
            return new igr((f(fG) << 16) | (f(f) << 8) | f(f2));
        }
        int length = str.length();
        akdb akdbVar = null;
        if (length > 1) {
            long j2 = 0;
            int i2 = 1;
            while (i2 < length) {
                char cCharAt = str.charAt(i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt >= 'A' && cCharAt <= 'F') {
                        j = j2 * 16;
                        i = cCharAt - 'A';
                    } else {
                        if (cCharAt < 'a' || cCharAt > 'f') {
                            break;
                        }
                        j = j2 * 16;
                        i = cCharAt - 'a';
                    }
                    j2 = j + i + 10;
                } else {
                    j2 = (j2 * 16) + (cCharAt - '0');
                }
                if (j2 > 4294967295L) {
                    break;
                }
                i2++;
            }
            if (i2 != 1) {
                akdbVar = new akdb(j2, i2);
            }
        }
        if (akdbVar == null) {
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        }
        int i3 = akdbVar.a;
        if (i3 == 7) {
            return new igr(akdbVar.a());
        }
        if (i3 != 4) {
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        }
        int iA = akdbVar.a();
        int i4 = iA & 3840;
        int i5 = iA & 240;
        int i6 = iA & 15;
        return new igr(i6 | (i4 << 8) | (i4 << 12) | (-16777216) | (i5 << 8) | (i5 << 4) | (i6 << 4));
    }

    private static iha h(String str) throws SAXException {
        iha ihaVar = (iha) ije.a.get(str);
        return ihaVar == null ? a(str) : ihaVar;
    }

    private static ihz i(String str) throws SAXException {
        if (str.equals("none")) {
            return null;
        }
        return str.equals("currentColor") ? igs.a : g(str);
    }

    private static ihz j(String str, String str2) throws SAXException {
        if (!str.startsWith("url(")) {
            return i(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            throw new SAXException(a.bq(str2, "Bad ", " attribute. Unterminated url() reference"));
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new ihf(strTrim, strTrim2.length() > 0 ? i(strTrim2) : null);
    }

    private static String k(String str, String str2) throws SAXException {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        throw new SAXException(a.bq(str2, "Bad ", " attribute. Expected \"none\" or \"url()\" format"));
    }

    private static List l(String str) throws SAXException {
        kqf kqfVar = new kqf(str);
        ArrayList arrayList = null;
        do {
            String strM = kqfVar.m();
            if (strM == null) {
                strM = kqfVar.n(',');
            }
            if (strM == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strM);
            kqfVar.t();
        } while (!kqfVar.r());
        return arrayList;
    }

    private static List m(String str) throws SAXException {
        if (str.length() == 0) {
            throw new SAXException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        kqf kqfVar = new kqf(str);
        kqfVar.o();
        while (!kqfVar.r()) {
            float fG = kqfVar.g();
            if (Float.isNaN(fG)) {
                int i = kqfVar.a;
                while (!kqfVar.r()) {
                    if (kqf.w(((String) kqfVar.c).charAt(kqfVar.a))) {
                        break;
                    }
                    kqfVar.a++;
                }
                String strSubstring = ((String) kqfVar.c).substring(i, kqfVar.a);
                kqfVar.a = i;
                throw new SAXException("Invalid length list value: ".concat(String.valueOf(strSubstring)));
            }
            int iU = kqfVar.u();
            if (iU == 0) {
                iU = 1;
            }
            arrayList.add(new iha(fG, iU));
            kqfVar.t();
        }
        return arrayList;
    }

    private final void n(Attributes attributes) throws SAXException {
        ihu ihuVar = this.b;
        if (ihuVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        igp igpVar = new igp();
        igpVar.t = this.a;
        igpVar.u = ihuVar;
        z(igpVar, attributes);
        B(igpVar, attributes);
        H(igpVar, attributes);
        y(igpVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = ijg.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                igpVar.a = a(strTrim);
            } else if (iOrdinal == 7) {
                igpVar.b = a(strTrim);
            } else if (iOrdinal != 49) {
                continue;
            } else {
                igpVar.c = a(strTrim);
                if (igpVar.c.e()) {
                    throw new SAXException("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.b.b(igpVar);
    }

    private final void o(Attributes attributes) throws SAXException {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        igq igqVar = new igq();
        igqVar.t = this.a;
        igqVar.u = this.b;
        z(igqVar, attributes);
        B(igqVar, attributes);
        H(igqVar, attributes);
        y(igqVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (ijg.a(attributes.getLocalName(i)).ordinal() == 3) {
                if ("objectBoundingBox".equals(strTrim)) {
                    igqVar.a = false;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SAXException("Invalid value for attribute clipPathUnits");
                    }
                    igqVar.a = true;
                }
            }
        }
        this.b.b(igqVar);
        this.b = igqVar;
    }

    private final void p(Attributes attributes) throws SAXException {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        igt igtVar = new igt();
        igtVar.t = this.a;
        igtVar.u = this.b;
        z(igtVar, attributes);
        B(igtVar, attributes);
        H(igtVar, attributes);
        this.b.b(igtVar);
        this.b = igtVar;
    }

    private final void q(Attributes attributes) throws SAXException {
        ihu ihuVar = this.b;
        if (ihuVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        igu iguVar = new igu();
        iguVar.t = this.a;
        iguVar.u = ihuVar;
        z(iguVar, attributes);
        B(iguVar, attributes);
        H(iguVar, attributes);
        y(iguVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = ijg.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                iguVar.a = a(strTrim);
            } else if (iOrdinal == 7) {
                iguVar.b = a(strTrim);
            } else if (iOrdinal == 56) {
                iguVar.c = a(strTrim);
                if (iguVar.c.e()) {
                    throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (iOrdinal != 57) {
                continue;
            } else {
                iguVar.d = a(strTrim);
                if (iguVar.d.e()) {
                    throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                }
            }
        }
        this.b.b(iguVar);
    }

    private final void r(Attributes attributes) throws SAXException {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        igx igxVar = new igx();
        igxVar.t = this.a;
        igxVar.u = this.b;
        z(igxVar, attributes);
        B(igxVar, attributes);
        H(igxVar, attributes);
        y(igxVar, attributes);
        this.b.b(igxVar);
        this.b = igxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(org.xml.sax.Attributes r6) throws org.xml.sax.SAXException {
        /*
            r5 = this;
            ihu r0 = r5.b
            if (r0 == 0) goto La1
            igz r0 = new igz
            r0.<init>()
            iip r1 = r5.a
            r0.t = r1
            ihu r1 = r5.b
            r0.u = r1
            z(r0, r6)
            B(r0, r6)
            H(r0, r6)
            y(r0, r6)
            r1 = 0
        L1e:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L99
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r6.getLocalName(r1)
            ijg r3 = defpackage.ijg.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L80
            r4 = 26
            if (r3 == r4) goto L71
            r4 = 48
            if (r3 == r4) goto L6d
            switch(r3) {
                case 81: goto L56;
                case 82: goto L4f;
                case 83: goto L48;
                default: goto L47;
            }
        L47:
            goto L8e
        L48:
            iha r2 = a(r2)
            r0.c = r2
            goto L8e
        L4f:
            iha r2 = a(r2)
            r0.b = r2
            goto L8e
        L56:
            iha r2 = a(r2)
            r0.d = r2
            iha r2 = r0.d
            boolean r2 = r2.e()
            if (r2 != 0) goto L65
            goto L8e
        L65:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <use> element. width cannot be negative"
            r5.<init>(r6)
            throw r5
        L6d:
            v(r0, r2)
            goto L8e
        L71:
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L8e
            r0.a = r2
            goto L8e
        L80:
            iha r2 = a(r2)
            r0.e = r2
            iha r2 = r0.e
            boolean r2 = r2.e()
            if (r2 != 0) goto L91
        L8e:
            int r1 = r1 + 1
            goto L1e
        L91:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid <use> element. height cannot be negative"
            r5.<init>(r6)
            throw r5
        L99:
            ihu r6 = r5.b
            r6.b(r0)
            r5.b = r0
            return
        La1:
            org.xml.sax.SAXException r5 = new org.xml.sax.SAXException
            java.lang.String r6 = "Invalid document. Root element must be <svg>"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iji.s(org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t(org.xml.sax.Attributes r7) throws org.xml.sax.SAXException {
        /*
            r6 = this;
            ihu r0 = r6.b
            if (r0 == 0) goto Lcc
            ihc r0 = new ihc
            r0.<init>()
            iip r1 = r6.a
            r0.t = r1
            ihu r1 = r6.b
            r0.u = r1
            z(r0, r7)
            B(r0, r7)
            y(r0, r7)
            D(r0, r7)
            r1 = 0
            r2 = r1
        L1f:
            int r3 = r7.getLength()
            if (r2 >= r3) goto Lc4
            java.lang.String r3 = r7.getValue(r2)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r7.getLocalName(r2)
            ijg r4 = defpackage.ijg.a(r4)
            int r4 = r4.ordinal()
            r5 = 41
            if (r4 == r5) goto La5
            r5 = 50
            if (r4 == r5) goto L9e
            r5 = 51
            if (r4 == r5) goto L97
            switch(r4) {
                case 32: goto L80;
                case 33: goto L61;
                case 34: goto L4a;
                default: goto L48;
            }
        L48:
            goto Lc0
        L4a:
            iha r3 = a(r3)
            r0.d = r3
            iha r3 = r0.d
            boolean r3 = r3.e()
            if (r3 != 0) goto L59
            goto Lc0
        L59:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid <marker> element. markerWidth cannot be negative"
            r6.<init>(r7)
            throw r6
        L61:
            java.lang.String r4 = "strokeWidth"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L6c
            r0.a = r1
            goto Lc0
        L6c:
            java.lang.String r4 = "userSpaceOnUse"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L78
            r3 = 1
            r0.a = r3
            goto Lc0
        L78:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid value for attribute markerUnits"
            r6.<init>(r7)
            throw r6
        L80:
            iha r3 = a(r3)
            r0.e = r3
            iha r3 = r0.e
            boolean r3 = r3.e()
            if (r3 != 0) goto L8f
            goto Lc0
        L8f:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid <marker> element. markerHeight cannot be negative"
            r6.<init>(r7)
            throw r6
        L97:
            iha r3 = a(r3)
            r0.c = r3
            goto Lc0
        L9e:
            iha r3 = a(r3)
            r0.b = r3
            goto Lc0
        La5:
            java.lang.String r4 = "auto"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto Lb6
            r3 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
            goto Lc0
        Lb6:
            float r3 = d(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
        Lc0:
            int r2 = r2 + 1
            goto L1f
        Lc4:
            ihu r7 = r6.b
            r7.b(r0)
            r6.b = r0
            return
        Lcc:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r7 = "Invalid document. Root element must be <svg>"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iji.t(org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(org.xml.sax.Attributes r8) throws org.xml.sax.SAXException {
        /*
            r7 = this;
            ihu r0 = r7.b
            if (r0 == 0) goto Lb4
            ihd r0 = new ihd
            r0.<init>()
            iip r1 = r7.a
            r0.t = r1
            ihu r1 = r7.b
            r0.u = r1
            z(r0, r8)
            B(r0, r8)
            y(r0, r8)
            r1 = 0
        L1b:
            int r2 = r8.getLength()
            if (r1 >= r2) goto Lac
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r8.getLocalName(r1)
            ijg r3 = defpackage.ijg.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L92
            r4 = 36
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            if (r3 == r4) goto L7d
            r4 = 37
            if (r3 == r4) goto L68
            switch(r3) {
                case 81: goto L51;
                case 82: goto L4d;
                case 83: goto L49;
                default: goto L48;
            }
        L48:
            goto La0
        L49:
            a(r2)
            goto La0
        L4d:
            a(r2)
            goto La0
        L51:
            iha r2 = a(r2)
            r0.a = r2
            iha r2 = r0.a
            boolean r2 = r2.e()
            if (r2 != 0) goto L60
            goto La0
        L60:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid <mask> element. width cannot be negative"
            r7.<init>(r8)
            throw r7
        L68:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La0
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L75
            goto La0
        L75:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid value for attribute maskUnits"
            r7.<init>(r8)
            throw r7
        L7d:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La0
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
            goto La0
        L8a:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid value for attribute maskContentUnits"
            r7.<init>(r8)
            throw r7
        L92:
            iha r2 = a(r2)
            r0.b = r2
            iha r2 = r0.b
            boolean r2 = r2.e()
            if (r2 != 0) goto La4
        La0:
            int r1 = r1 + 1
            goto L1b
        La4:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid <mask> element. height cannot be negative"
            r7.<init>(r8)
            throw r7
        Lac:
            ihu r8 = r7.b
            r8.b(r0)
            r7.b = r0
            return
        Lb4:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid document. Root element must be <svg>"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iji.u(org.xml.sax.Attributes):void");
    }

    private static void v(iia iiaVar, String str) throws SAXException {
        int i;
        kqf kqfVar = new kqf(str);
        kqfVar.o();
        String strN = kqfVar.n(' ');
        if ("defer".equals(strN)) {
            kqfVar.o();
            strN = kqfVar.n(' ');
        }
        igm igmVar = (igm) ijc.a.get(strN);
        kqfVar.o();
        if (kqfVar.r()) {
            i = 0;
        } else {
            String strN2 = kqfVar.n(' ');
            if (strN2.equals("meet")) {
                i = 1;
            } else {
                if (!strN2.equals("slice")) {
                    throw new SAXException("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
                }
                i = 2;
            }
        }
        iiaVar.v = new ign(igmVar, i);
    }

    private static int w(String str) throws SAXException {
        if ("nonzero".equals(str)) {
            return 1;
        }
        if ("evenodd".equals(str)) {
            return 2;
        }
        throw new SAXException("Invalid fill-rule property: ".concat(String.valueOf(str)));
    }

    private static int x(String str) {
        if ("italic".equals(str)) {
            return 2;
        }
        if ("normal".equals(str)) {
            return 1;
        }
        return "oblique".equals(str) ? 3 : 0;
    }

    private static final void y(ihr ihrVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = ijg.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 73) {
                switch (iOrdinal) {
                    case 52:
                        kqf kqfVar = new kqf(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!kqfVar.r()) {
                            String strN = kqfVar.n(' ');
                            if (strN.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strN.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            kqfVar.o();
                        }
                        ihrVar.i(hashSet);
                        break;
                    case 53:
                        ihrVar.h(strTrim);
                        break;
                    case 54:
                        kqf kqfVar2 = new kqf(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!kqfVar2.r()) {
                            hashSet2.add(kqfVar2.n(' '));
                            kqfVar2.o();
                        }
                        ihrVar.k(hashSet2);
                        break;
                    case 55:
                        List listL = l(strTrim);
                        ihrVar.j(listL != null ? new HashSet(listL) : new HashSet(0));
                        break;
                }
            } else {
                kqf kqfVar3 = new kqf(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!kqfVar3.r()) {
                    String strN2 = kqfVar3.n(' ');
                    int iIndexOf = strN2.indexOf(45);
                    if (iIndexOf != -1) {
                        strN2 = strN2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strN2, "", "").getLanguage());
                    kqfVar3.o();
                }
                ihrVar.l(hashSet3);
            }
        }
    }

    private static final void z(ihw ihwVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                ihwVar.o = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    ihwVar.p = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SAXException("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(strTrim)));
                    }
                    ihwVar.p = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public final iip b(InputStream inputStream) throws ijb, IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new GZIPInputStream(inputStream);
            }
        } catch (IOException unused) {
        }
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        try {
            try {
                try {
                    try {
                        XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
                        xMLReader.setContentHandler(this);
                        xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
                        xMLReader.parse(new InputSource(inputStream));
                        return this.a;
                    } catch (SAXException e) {
                        throw new ijb("SVG parse error: " + e.getMessage(), e);
                    }
                } catch (ParserConfigurationException e2) {
                    throw new ijb("XML Parser problem", e2);
                }
            } catch (IOException e3) {
                throw new ijb("File error", e3);
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) throws SAXException {
        if (this.c) {
            return;
        }
        if (this.e) {
            StringBuilder sb = this.g;
            if (sb == null) {
                sb = new StringBuilder(i2);
                this.g = sb;
            }
            sb.append(cArr, i, i2);
            return;
        }
        if (this.h) {
            StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(i2);
                this.i = sb2;
            }
            sb2.append(cArr, i, i2);
            return;
        }
        ihu ihuVar = this.b;
        if (ihuVar instanceof iij) {
            ihs ihsVar = (ihs) ihuVar;
            int size = ihsVar.i.size();
            ihy ihyVar = size == 0 ? null : (ihy) ihsVar.i.get(size - 1);
            if (!(ihyVar instanceof iim)) {
                ((ihs) this.b).b(new iim(new String(cArr, i, i2)));
                return;
            }
            iim iimVar = (iim) ihyVar;
            iimVar.a = String.valueOf(iimVar.a).concat(new String(cArr, i, i2));
        }
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) throws SAXException {
        if (!this.c && this.h) {
            StringBuilder sb = this.i;
            if (sb == null) {
                sb = new StringBuilder(i2);
                this.i = sb;
            }
            sb.append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            switch (ijh.a(str2).ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                case 30:
                    this.b = ((ihy) this.b).u;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    ijh ijhVar = this.f;
                    if (ijhVar == ijh.A || ijhVar == ijh.f) {
                        this.g.toString();
                    }
                    this.g.setLength(0);
                    break;
                case 21:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        aaem aaemVar = new aaem(igg.h);
                        iip iipVar = this.a;
                        kqf kqfVar = new kqf(string, null);
                        kqfVar.o();
                        iipVar.c.a(aaemVar.v(kqfVar));
                        this.i.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() throws SAXException {
        this.a = new iip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:447:0x0937, code lost:
    
        android.util.Log.e("SVGParser", defpackage.a.bZ(r14, "Bad path coords for ", " path segment"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x00e9, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0483, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x064a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0aac, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:346:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x093e A[SYNTHETIC] */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startElement(java.lang.String r24, java.lang.String r25, java.lang.String r26, org.xml.sax.Attributes r27) throws org.xml.sax.SAXException {
        /*
            Method dump skipped, instructions count: 2980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iji.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() throws SAXException {
    }
}
