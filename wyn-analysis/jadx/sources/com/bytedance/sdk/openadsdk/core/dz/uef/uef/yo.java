package com.bytedance.sdk.openadsdk.core.dz.uef.uef;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.dz.oa.yo;
import com.bytedance.sdk.openadsdk.core.dz.uef.uef.lw;
import com.bytedance.sdk.openadsdk.core.dz.yo.uef;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class yo {
    public static double oa(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (lw.oa(xmlPullParser, "Duration").split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER).length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(r2[1].trim()) * 60) + (Integer.parseInt(r2[0].trim()) * 3600) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    public static void uef(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.dz.uef uefVar, int i5, double d3) throws XmlPullParserException, IOException {
        boolean z2 = false;
        while (true) {
            if (xmlPullParser.next() != 3 || !xmlPullParser.getName().equals("Linear")) {
                if (xmlPullParser.getEventType() == 2) {
                    if (z2 && TextUtils.isEmpty(uefVar.xs())) {
                        lw.uef(xmlPullParser);
                    }
                    String name = xmlPullParser.getName();
                    name.getClass();
                    switch (name) {
                        case "VideoClicks":
                            uef(xmlPullParser, uefVar);
                            break;
                        case "Duration":
                            uefVar.uef(oa(xmlPullParser));
                            break;
                        case "MediaFiles":
                            uef(xmlPullParser, i5, d3, uefVar);
                            z2 = true;
                            break;
                        case "Icons":
                            com.bytedance.sdk.openadsdk.core.dz.oa oaVarUef = uef(xmlPullParser);
                            if (oaVarUef != null && uefVar.oa() == null) {
                                uefVar.uef(oaVarUef);
                                break;
                            } else {
                                break;
                            }
                            break;
                        case "TrackingEvents":
                            uef(xmlPullParser, uefVar.uef());
                            break;
                        default:
                            lw.uef(xmlPullParser);
                            break;
                    }
                }
            } else {
                return;
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> yo(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return uef(xmlPullParser, false);
    }

    private static String uef(XmlPullParser xmlPullParser, int i5, double d3, com.bytedance.sdk.openadsdk.core.dz.uef uefVar) throws XmlPullParserException, IOException {
        double d5 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = lw.xs;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int iOa = lw.oa(xmlPullParser.getAttributeValue(str2, "width"));
                int iOa2 = lw.oa(xmlPullParser.getAttributeValue(str2, "height"));
                int iOa3 = lw.oa(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String strOa = lw.oa(xmlPullParser, "MediaFile");
                if (iOa > 0 && iOa2 > 0 && com.bytedance.sdk.openadsdk.core.dz.yo.moa.uef.contains(attributeValue) && !TextUtils.isEmpty(strOa)) {
                    double dUef = com.bytedance.sdk.openadsdk.core.dz.yo.moa.uef(i5, d3, iOa, iOa2, iOa3, attributeValue);
                    if (dUef > d5) {
                        str = strOa;
                        d5 = dUef;
                        i10 = iOa;
                        i11 = iOa2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            uefVar.moa(str);
            uefVar.uef(i10);
            uefVar.oa(i11);
        }
        return str;
    }

    public static com.bytedance.sdk.openadsdk.core.dz.oa uef(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str;
        String str2;
        uef.EnumC0097uef enumC0097uef;
        char c10;
        String str3 = "HTMLResource";
        int i5 = 2;
        int i10 = 3;
        com.bytedance.sdk.openadsdk.core.dz.oa oaVar = null;
        while (true) {
            if (xmlPullParser.getEventType() == i10 && xmlPullParser.getName().equals("Icons")) {
                return oaVar;
            }
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == i5 && xmlPullParser.getName().equals("Icon")) {
                String str4 = lw.xs;
                int iOa = lw.oa(xmlPullParser.getAttributeValue(str4, "width"));
                int iOa2 = lw.oa(xmlPullParser.getAttributeValue(str4, "height"));
                if (iOa > 0 && iOa <= 300 && iOa2 > 0 && iOa2 <= 300) {
                    int iUef = com.bytedance.sdk.openadsdk.core.dz.oa.uef.uef(xmlPullParser.getAttributeValue(str4, MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR));
                    int iUef2 = com.bytedance.sdk.openadsdk.core.dz.oa.uef.uef(xmlPullParser.getAttributeValue(str4, "duration"));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    lw.uef uefVar = null;
                    String strOa = null;
                    while (true) {
                        if (xmlPullParser.next() == i10 && xmlPullParser.getName().equals("Icon")) {
                            if (uefVar != null && (oaVar == null || TextUtils.isEmpty(oaVar.lw()))) {
                                com.bytedance.sdk.openadsdk.core.dz.oa oaVar2 = new com.bytedance.sdk.openadsdk.core.dz.oa(iOa, iOa2, iUef, iUef2, uefVar.f25598oa, uefVar.yo, uefVar.uef, arrayList, arrayList2, strOa);
                                lw.uef(xmlPullParser, "Icons", 3);
                                oaVar = oaVar2;
                            }
                            i5 = 2;
                            i10 = 3;
                        } else {
                            int i11 = iOa2;
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            int i12 = iUef2;
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                char c11 = 65535;
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        if (name.equals("IconViewTracking")) {
                                            c10 = 0;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c10 = 1;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c11 = 2;
                                            break;
                                        }
                                        break;
                                    case 1030746596:
                                        if (name.equals("IconClicks")) {
                                            c11 = 3;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals(str3)) {
                                            c10 = 4;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                }
                                switch (c11) {
                                    case 0:
                                        str2 = str3;
                                        arrayList4.add(new yo.uef(lw.oa(xmlPullParser, "IconViewTracking")).uef());
                                        break;
                                    case 1:
                                        str2 = str3;
                                        if (uefVar == null) {
                                            uefVar = new lw.uef(lw.oa(xmlPullParser, "IFrameResource"), uef.EnumC0097uef.NONE, uef.oa.IFRAME_RESOURCE);
                                            break;
                                        } else {
                                            lw.uef(xmlPullParser);
                                            break;
                                        }
                                    case 2:
                                        str2 = str3;
                                        uef.EnumC0097uef enumC0097uef2 = uef.EnumC0097uef.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(lw.xs, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.dz.yo.uef.uef;
                                        String strOa2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.dz.yo.uef.f25607oa.contains(lowerCase)) ? lw.oa(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0097uef = uef.EnumC0097uef.IMAGE;
                                        } else {
                                            enumC0097uef = uef.EnumC0097uef.JAVASCRIPT;
                                        }
                                        arrayList = arrayList3;
                                        arrayList2 = arrayList4;
                                        uefVar = new lw.uef(strOa2, enumC0097uef, uef.oa.STATIC_RESOURCE);
                                        break;
                                    case 3:
                                        str2 = str3;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    strOa = lw.oa(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList3.add(new yo.uef(lw.oa(xmlPullParser, "IconClickTracking")).uef());
                                                }
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (uefVar == null || uefVar.yo == uef.oa.IFRAME_RESOURCE) {
                                            str2 = str3;
                                            uefVar = new lw.uef(lw.oa(xmlPullParser, str3), uef.EnumC0097uef.NONE, uef.oa.HTML_RESOURCE);
                                            break;
                                        }
                                        break;
                                    default:
                                        str2 = str3;
                                        lw.uef(xmlPullParser);
                                        break;
                                }
                                iOa2 = i11;
                                iUef2 = i12;
                                str3 = str2;
                                i10 = 3;
                            } else {
                                str2 = str3;
                            }
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                            iOa2 = i11;
                            iUef2 = i12;
                            str3 = str2;
                            i10 = 3;
                        }
                    }
                } else {
                    str = str3;
                    lw.uef(xmlPullParser);
                }
            } else {
                str = str3;
            }
            str3 = str;
            i5 = 2;
            i10 = 3;
        }
    }

    public static void uef(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.dz.moa moaVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                if ("Tracking".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(lw.xs, "event");
                    if (TextUtils.isEmpty(attributeValue)) {
                        lw.uef(xmlPullParser, "Tracking", 3);
                    } else {
                        attributeValue.getClass();
                        switch (attributeValue) {
                            case "midpoint":
                                moaVar.uef(lw.oa(xmlPullParser, "Tracking"), 0.5f);
                                break;
                            case "thirdQuartile":
                                moaVar.uef(lw.oa(xmlPullParser, "Tracking"), 0.75f);
                                break;
                            case "resume":
                                moaVar.yo(uef(xmlPullParser, true));
                                break;
                            case "unmute":
                                moaVar.wrv(uef(xmlPullParser, true));
                                break;
                            case "complete":
                                moaVar.moa(yo(xmlPullParser));
                                break;
                            case "mute":
                                moaVar.dj(uef(xmlPullParser, true));
                                break;
                            case "skip":
                                moaVar.ivm(yo(xmlPullParser));
                                break;
                            case "close":
                                moaVar.lw(yo(xmlPullParser));
                                break;
                            case "pause":
                                moaVar.oa(uef(xmlPullParser, true));
                                break;
                            case "start":
                            case "creativeView":
                                moaVar.uef(lw.oa(xmlPullParser, "Tracking"), 0L);
                                break;
                            case "firstQuartile":
                                moaVar.uef(lw.oa(xmlPullParser, "Tracking"), 0.25f);
                                break;
                        }
                    }
                } else if (xmlPullParser.getEventType() == 4) {
                    xmlPullParser.nextTag();
                } else {
                    lw.uef(xmlPullParser);
                }
            }
        }
    }

    private static void uef(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.dz.uef uefVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (!name.equals("ClickThrough")) {
                    if (name.equals("ClickTracking")) {
                        uefVar.uef().xs(lw.uef(xmlPullParser, "ClickTracking"));
                    } else {
                        lw.uef(xmlPullParser);
                    }
                } else {
                    uefVar.yo(lw.oa(xmlPullParser, "ClickThrough"));
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> uef(XmlPullParser xmlPullParser, boolean z2) throws XmlPullParserException, IOException {
        return lw.uef(xmlPullParser, "Tracking", z2);
    }
}
