package o6;

import A7.AbstractC0279p0;
import D9.n;
import R1.i;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import h6.AbstractC2786e;
import h6.C2789h;
import h6.InterfaceC2787f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import u6.AbstractC4256a;
import u6.v;

/* renamed from: o6.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3652c extends AbstractC2786e {

    /* renamed from: n, reason: collision with root package name */
    public static final Pattern f41374n = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f41375o = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f41376p = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f41377q = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f41378r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: s, reason: collision with root package name */
    public static final Pattern f41379s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: t, reason: collision with root package name */
    public static final Pattern f41380t = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: u, reason: collision with root package name */
    public static final V2.d f41381u = new V2.d(30.0f, 1, 1);

    /* renamed from: v, reason: collision with root package name */
    public static final i f41382v = new i(15, 3, (byte) 0);

    /* renamed from: m, reason: collision with root package name */
    public final XmlPullParserFactory f41383m;

    public C3652c() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f41383m = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e7) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e7);
        }
    }

    public static f h(f fVar) {
        return fVar == null ? new f() : fVar;
    }

    public static boolean i(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals(ExternalParsersConfigReaderMetKeys.METADATA_TAG) || str.equals("image") || str.equals(JsonStorageKeyNames.DATA_KEY) || str.equals("information");
    }

    public static i j(XmlPullParser xmlPullParser, i iVar) throws C2789h, NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return iVar;
        }
        Matcher matcher = f41380t.matcher(attributeValue);
        if (!matcher.matches()) {
            AbstractC4256a.E("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return iVar;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i5 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            int i10 = Integer.parseInt(strGroup2);
            if (i5 != 0 && i10 != 0) {
                return new i(i10, 3, (byte) 0);
            }
            throw new C2789h("Invalid cell resolution " + i5 + StringUtils.SPACE + i10);
        } catch (NumberFormatException unused) {
            AbstractC4256a.E("TtmlDecoder", "Ignoring malformed cell resolution: ".concat(attributeValue));
            return iVar;
        }
    }

    public static void k(String str, f fVar) throws C2789h {
        Matcher matcher;
        String strGroup;
        int i5 = v.f46721a;
        String[] strArrSplit = str.split("\\s+", -1);
        int length = strArrSplit.length;
        Pattern pattern = f41376p;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (strArrSplit.length != 2) {
                throw new C2789h(AbstractC0279p0.j(strArrSplit.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(strArrSplit[1]);
            AbstractC4256a.E("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C2789h(AbstractC0279p0.l("Invalid expression for fontSize: '", str, "'."));
        }
        strGroup = matcher.group(3);
        strGroup.getClass();
        switch (strGroup) {
            case "%":
                fVar.f41415j = 3;
                break;
            case "em":
                fVar.f41415j = 2;
                break;
            case "px":
                fVar.f41415j = 1;
                break;
            default:
                throw new C2789h(AbstractC0279p0.l("Invalid unit for fontSize: '", strGroup, "'."));
        }
        String strGroup2 = matcher.group(1);
        strGroup2.getClass();
        fVar.k = Float.parseFloat(strGroup2);
    }

    public static V2.d l(XmlPullParser xmlPullParser) throws C2789h, NumberFormatException {
        float f10;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int i5 = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i10 = v.f46721a;
            if (attributeValue2.split(StringUtils.SPACE, -1).length != 2) {
                throw new C2789h("frameRateMultiplier doesn't have 2 parts");
            }
            f10 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f10 = 1.0f;
        }
        V2.d dVar = f41381u;
        int i11 = dVar.f12976b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        return new V2.d(i5 * f10, i11, attributeValue4 != null ? Integer.parseInt(attributeValue4) : dVar.f12977c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0264 A[LOOP:0: B:3:0x000a->B:106:0x0264, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0263 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(org.xmlpull.v1.XmlPullParser r20, java.util.HashMap r21, R1.i r22, D9.n r23, java.util.HashMap r24, java.util.HashMap r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C3652c.m(org.xmlpull.v1.XmlPullParser, java.util.HashMap, R1.i, D9.n, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o6.C3653d n(org.xmlpull.v1.XmlPullParser r23, o6.C3653d r24, java.util.HashMap r25, V2.d r26) throws h6.C2789h, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C3652c.n(org.xmlpull.v1.XmlPullParser, o6.d, java.util.HashMap, V2.d):o6.d");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o6.f o(org.xmlpull.v1.XmlPullParser r21, o6.f r22) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C3652c.o(org.xmlpull.v1.XmlPullParser, o6.f):o6.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long p(java.lang.String r13, V2.d r14) throws h6.C2789h, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C3652c.p(java.lang.String, V2.d):long");
    }

    public static n q(XmlPullParser xmlPullParser) throws NumberFormatException {
        String strT = AbstractC4256a.t(xmlPullParser, "extent");
        if (strT == null) {
            return null;
        }
        Matcher matcher = f41379s.matcher(strT);
        if (!matcher.matches()) {
            AbstractC4256a.E("TtmlDecoder", "Ignoring non-pixel tts extent: ".concat(strT));
            return null;
        }
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int i5 = Integer.parseInt(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            return new n(i5, Integer.parseInt(strGroup2), 10);
        } catch (NumberFormatException unused) {
            AbstractC4256a.E("TtmlDecoder", "Ignoring malformed tts extent: ".concat(strT));
            return null;
        }
    }

    @Override // h6.AbstractC2786e
    public final InterfaceC2787f e(byte[] bArr, int i5, boolean z2) throws XmlPullParserException, C2789h, NumberFormatException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f41383m.newPullParser();
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            map2.put("", new C3654e("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            n nVarQ = null;
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr, 0, i5), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            V2.d dVar = f41381u;
            i iVar = f41382v;
            int i10 = 0;
            V2.d dVarL = dVar;
            C8.i iVar2 = null;
            i iVarJ = iVar;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.getEventType()) {
                C3653d c3653d = (C3653d) arrayDeque.peek();
                if (i10 == 0) {
                    String name = xmlPullParserNewPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            dVarL = l(xmlPullParserNewPullParser);
                            iVarJ = j(xmlPullParserNewPullParser, iVar);
                            nVarQ = q(xmlPullParserNewPullParser);
                        }
                        V2.d dVar2 = dVarL;
                        i iVar3 = iVarJ;
                        if (i(name)) {
                            if ("head".equals(name)) {
                                m(xmlPullParserNewPullParser, map, iVar3, nVarQ, map2, map3);
                            } else {
                                try {
                                    C3653d c3653dN = n(xmlPullParserNewPullParser, c3653d, map2, dVar2);
                                    arrayDeque.push(c3653dN);
                                    if (c3653d != null) {
                                        if (c3653d.f41395m == null) {
                                            c3653d.f41395m = new ArrayList();
                                        }
                                        c3653d.f41395m.add(c3653dN);
                                    }
                                } catch (C2789h e7) {
                                    AbstractC4256a.D(e7, "TtmlDecoder", "Suppressing parser error");
                                }
                            }
                            iVarJ = iVar3;
                            dVarL = dVar2;
                        } else {
                            AbstractC4256a.u("TtmlDecoder", "Ignoring unsupported tag: " + xmlPullParserNewPullParser.getName());
                        }
                        i10++;
                        iVarJ = iVar3;
                        dVarL = dVar2;
                    } else if (eventType == 4) {
                        c3653d.getClass();
                        C3653d c3653dA = C3653d.a(xmlPullParserNewPullParser.getText());
                        if (c3653d.f41395m == null) {
                            c3653d.f41395m = new ArrayList();
                        }
                        c3653d.f41395m.add(c3653dA);
                    } else if (eventType == 3) {
                        if (xmlPullParserNewPullParser.getName().equals("tt")) {
                            C3653d c3653d2 = (C3653d) arrayDeque.peek();
                            c3653d2.getClass();
                            iVar2 = new C8.i(c3653d2, map, map2, map3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i10++;
                } else if (eventType == 3) {
                    i10--;
                }
                xmlPullParserNewPullParser.next();
            }
            if (iVar2 != null) {
                return iVar2;
            }
            throw new C2789h("No TTML subtitles found");
        } catch (IOException e10) {
            throw new IllegalStateException("Unexpected error when reading input.", e10);
        } catch (XmlPullParserException e11) {
            throw new C2789h("Unable to decode source", e11);
        }
    }
}
