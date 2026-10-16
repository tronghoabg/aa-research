package Y1;

import G6.C0555t;
import N1.D;
import Q1.x;
import android.net.Uri;
import android.text.TextUtils;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.AbstractC3437s;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class e extends DefaultHandler implements o2.o {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f16330b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f16331c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f16332d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f16333e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f16334a;

    public e() {
        try {
            this.f16334a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static long a(ArrayList arrayList, long j8, long j10, int i5, long j11) {
        int i10;
        if (i5 >= 0) {
            i10 = i5 + 1;
        } else {
            int i11 = x.f9724a;
            i10 = (int) ((((j11 - j8) + j10) - 1) / j10);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList.add(new q(j8, j10));
            j8 += j10;
        }
        return j8;
    }

    public static void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i5 = 1;
            while (i5 != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i5++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i5--;
                }
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(org.xmlpull.v1.XmlPullParser r12) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.e.c(org.xmlpull.v1.XmlPullParser):int");
    }

    public static long d(XmlPullParser xmlPullParser, long j8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j8;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public static ArrayList e(XmlPullParser xmlPullParser, ArrayList arrayList, boolean z2) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i5 = attributeValue != null ? Integer.parseInt(attributeValue) : z2 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i10 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                b(xmlPullParser);
            }
        } while (!Q1.k.p(xmlPullParser, "BaseURL"));
        if (text != null && Q1.k.n(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return AbstractC3437s.n(new b(text, attributeValue3, i5, i10));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            b bVar = (b) arrayList.get(i11);
            String strT = Q1.k.t(bVar.f16306a, text);
            String str = attributeValue3 == null ? strT : attributeValue3;
            if (z2) {
                i5 = bVar.f16308c;
                i10 = bVar.f16309d;
                str = bVar.f16307b;
            }
            arrayList2.add(new b(strT, str, i5, i10));
        }
        return arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015f  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(org.xmlpull.v1.XmlPullParser r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.e.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public static int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if (MimeTypes.BASE_TYPE_AUDIO.equals(attributeValue)) {
            return 1;
        }
        if (MimeTypes.BASE_TYPE_VIDEO.equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public static f h(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!Q1.k.p(xmlPullParser, str));
        return new f(attributeValue, attributeValue2, str2);
    }

    public static long i(XmlPullParser xmlPullParser, String str, long j8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j8;
        }
        Matcher matcher = x.f9732i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d3 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d5 = d3 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d10 = d5 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d11 = d10 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d12 = d11 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j10 = (long) ((d12 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j10 : j10;
    }

    public static float j(XmlPullParser xmlPullParser, float f10) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = f16330b.matcher(attributeValue);
            if (matcher.matches()) {
                int i5 = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i5 / Integer.parseInt(r2) : i5;
            }
        }
        return f10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x09ae  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a0b  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0a77  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0bda  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0c41 A[LOOP:11: B:244:0x069e->B:499:0x0c41, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0f7d A[LOOP:5: B:161:0x0411->B:603:0x0f7d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:708:0x130b A[LOOP:4: B:129:0x02e0->B:708:0x130b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:728:0x137b A[LOOP:1: B:44:0x00d5->B:728:0x137b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:736:0x1345 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:739:0x12b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0dbc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0896 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0abf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Y1.c k(org.xmlpull.v1.XmlPullParser r157, android.net.Uri r158) throws org.xmlpull.v1.XmlPullParserException, java.lang.IllegalStateException, java.io.IOException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 5058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.e.k(org.xmlpull.v1.XmlPullParser, android.net.Uri):Y1.c");
    }

    public static j l(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j8;
        long j10;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j8 = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j10 = (Long.parseLong(strArrSplit[1]) - j8) + 1;
            }
            return new j(attributeValue, j8, j10);
        }
        j8 = 0;
        j10 = -1;
        return new j(attributeValue, j8, j10);
    }

    public static int m(String str) {
        if (str != null) {
            switch (str) {
                case "subtitle":
                case "forced_subtitle":
                case "forced-subtitle":
                    return 128;
                case "description":
                    return 512;
                case "enhanced-audio-intelligibility":
                    return 2048;
                case "alternate":
                    return 2;
                case "dub":
                    return 16;
                case "main":
                    return 1;
                case "sign":
                    return 256;
                case "caption":
                    return 64;
                case "commentary":
                    return 8;
                case "emergency":
                    return 32;
                case "supplementary":
                    return 4;
            }
        }
        return 0;
    }

    public static int n(ArrayList arrayList) {
        int i5 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (A6.h.v("http://dashif.org/guidelines/trickmode", ((f) arrayList.get(i10)).f16335a)) {
                i5 = Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }
        return i5;
    }

    public static r o(XmlPullParser xmlPullParser, r rVar) throws XmlPullParserException, NumberFormatException, IOException {
        long j8 = rVar != null ? rVar.f16377b : 1L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j8 = Long.parseLong(attributeValue);
        }
        long j10 = j8;
        long j11 = rVar != null ? rVar.f16378c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j11 = Long.parseLong(attributeValue2);
        }
        long j12 = j11;
        long j13 = rVar != null ? rVar.f16374d : 0L;
        long j14 = rVar != null ? rVar.f16375e : 0L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue3 != null) {
            String[] strArrSplit = attributeValue3.split("-");
            j13 = Long.parseLong(strArrSplit[0]);
            j14 = (Long.parseLong(strArrSplit[1]) - j13) + 1;
        }
        long j15 = j14;
        long j16 = j13;
        j jVarL = rVar != null ? rVar.f16376a : null;
        while (true) {
            xmlPullParser.next();
            if (Q1.k.q(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else {
                b(xmlPullParser);
            }
            j jVar = jVarL;
            if (Q1.k.p(xmlPullParser, "SegmentBase")) {
                return new r(jVar, j10, j12, j16, j15);
            }
            jVarL = jVar;
        }
    }

    public static o p(XmlPullParser xmlPullParser, o oVar, long j8, long j10, long j11, long j12, long j13) throws XmlPullParserException, IOException, NumberFormatException {
        long j14 = oVar != null ? oVar.f16377b : 1L;
        List arrayList = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j14 = Long.parseLong(attributeValue);
        }
        long j15 = j14;
        long j16 = oVar != null ? oVar.f16378c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j16 = Long.parseLong(attributeValue2);
        }
        long j17 = j16;
        long j18 = oVar != null ? oVar.f16364e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j18 = Long.parseLong(attributeValue3);
        }
        long j19 = j18;
        long j20 = oVar != null ? oVar.f16363d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j20 = Long.parseLong(attributeValue4);
        }
        long j21 = j20;
        long j22 = j12 == -9223372036854775807L ? j11 : j12;
        long j23 = j22 == Long.MAX_VALUE ? -9223372036854775807L : j22;
        j jVarL = null;
        List listR = null;
        do {
            xmlPullParser.next();
            if (Q1.k.q(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else if (Q1.k.q(xmlPullParser, "SegmentTimeline")) {
                listR = r(xmlPullParser, j15, j10);
            } else if (Q1.k.q(xmlPullParser, "SegmentURL")) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(l(xmlPullParser, "media", "mediaRange"));
            } else {
                b(xmlPullParser);
            }
        } while (!Q1.k.p(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (jVarL == null) {
                jVarL = oVar.f16376a;
            }
            if (listR == null) {
                listR = oVar.f16365f;
            }
            if (arrayList == null) {
                arrayList = oVar.f16369j;
            }
        }
        return new o(jVarL, j15, j17, j21, j19, listR, j23, arrayList, x.K(j13), x.K(j8));
    }

    public static p q(XmlPullParser xmlPullParser, p pVar, List list, long j8, long j10, long j11, long j12, long j13) throws XmlPullParserException, NumberFormatException, IOException {
        long j14;
        long j15 = pVar != null ? pVar.f16377b : 1L;
        j jVarL = null;
        String attributeValue = xmlPullParser.getAttributeValue(null, "timescale");
        if (attributeValue != null) {
            j15 = Long.parseLong(attributeValue);
        }
        long j16 = j15;
        long j17 = pVar != null ? pVar.f16378c : 0L;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "presentationTimeOffset");
        if (attributeValue2 != null) {
            j17 = Long.parseLong(attributeValue2);
        }
        long j18 = j17;
        long j19 = pVar != null ? pVar.f16364e : -9223372036854775807L;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "duration");
        if (attributeValue3 != null) {
            j19 = Long.parseLong(attributeValue3);
        }
        long j20 = j19;
        long j21 = pVar != null ? pVar.f16363d : 1L;
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "startNumber");
        if (attributeValue4 != null) {
            j21 = Long.parseLong(attributeValue4);
        }
        long j22 = j21;
        int i5 = 0;
        while (true) {
            if (i5 >= list.size()) {
                j14 = -1;
                break;
            }
            f fVar = (f) list.get(i5);
            if (A6.h.v("http://dashif.org/guidelines/last-segment-number", fVar.f16335a)) {
                j14 = Long.parseLong(fVar.f16336b);
                break;
            }
            i5++;
        }
        long j23 = j14;
        long j24 = j12 == -9223372036854775807L ? j11 : j12;
        long j25 = j24 == Long.MAX_VALUE ? -9223372036854775807L : j24;
        C0555t c0555tS = s(xmlPullParser, "media", pVar != null ? pVar.k : null);
        C0555t c0555tS2 = s(xmlPullParser, GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, pVar != null ? pVar.f16370j : null);
        List listR = null;
        do {
            xmlPullParser.next();
            if (Q1.k.q(xmlPullParser, "Initialization")) {
                jVarL = l(xmlPullParser, "sourceURL", "range");
            } else if (Q1.k.q(xmlPullParser, "SegmentTimeline")) {
                listR = r(xmlPullParser, j16, j10);
            } else {
                b(xmlPullParser);
            }
        } while (!Q1.k.p(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (jVarL == null) {
                jVarL = pVar.f16376a;
            }
            if (listR == null) {
                listR = pVar.f16365f;
            }
        }
        return new p(jVarL, j16, j18, j22, j23, j20, listR, j25, c0555tS2, c0555tS, x.K(j13), x.K(j8));
    }

    public static ArrayList r(XmlPullParser xmlPullParser, long j8, long j10) throws XmlPullParserException, IOException {
        long j11;
        ArrayList arrayList = new ArrayList();
        long jA = 0;
        long j12 = -9223372036854775807L;
        boolean z2 = false;
        int i5 = 0;
        do {
            xmlPullParser.next();
            if (Q1.k.q(xmlPullParser, "S")) {
                String attributeValue = xmlPullParser.getAttributeValue(null, "t");
                long j13 = attributeValue == null ? -9223372036854775807L : Long.parseLong(attributeValue);
                if (z2) {
                    int i10 = i5;
                    j11 = j13;
                    jA = a(arrayList, jA, j12, i10, j11);
                } else {
                    j11 = j13;
                }
                if (j11 != -9223372036854775807L) {
                    jA = j11;
                }
                String attributeValue2 = xmlPullParser.getAttributeValue(null, "d");
                j12 = attributeValue2 == null ? -9223372036854775807L : Long.parseLong(attributeValue2);
                String attributeValue3 = xmlPullParser.getAttributeValue(null, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
                i5 = attributeValue3 == null ? 0 : Integer.parseInt(attributeValue3);
                z2 = true;
            } else {
                b(xmlPullParser);
            }
        } while (!Q1.k.p(xmlPullParser, "SegmentTimeline"));
        if (z2) {
            int i11 = x.f9724a;
            a(arrayList, jA, j12, i5, x.S(j10, j8, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static G6.C0555t s(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, G6.C0555t r14) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y1.e.s(org.xmlpull.v1.XmlPullParser, java.lang.String, G6.t):G6.t");
    }

    @Override // o2.o
    public final Object t(Uri uri, S1.j jVar) throws XmlPullParserException, D {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f16334a.newPullParser();
            xmlPullParserNewPullParser.setInput(jVar, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return k(xmlPullParserNewPullParser, uri);
            }
            throw D.b("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e7) {
            throw D.b(null, e7);
        }
    }
}
