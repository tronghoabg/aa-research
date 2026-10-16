package com.bytedance.sdk.openadsdk.core.dz.uef.uef;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class oa {
    public static com.bytedance.sdk.openadsdk.core.dz.uef uef(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list, int i5, double d3) throws XmlPullParserException, IOException {
        String name;
        xmlPullParser.require(2, lw.xs, "InLine");
        com.bytedance.sdk.openadsdk.core.dz.uef uefVar = new com.bytedance.sdk.openadsdk.core.dz.uef();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                uefVar.uef().zjm(list);
                return uefVar;
            }
            if (xmlPullParser.getEventType() == 2) {
                name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "AdVerifications":
                        uefVar.uef(moa.uef(xmlPullParser));
                        continue;
                    case "Creatives":
                        if (!TextUtils.isEmpty(uefVar.xs()) && uefVar.yo() != null) {
                            break;
                        } else {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        uef(context, xmlPullParser, uefVar, i5, d3);
                                    } else {
                                        lw.uef(xmlPullParser);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case "Description":
                        uefVar.oa(lw.oa(xmlPullParser, name));
                        continue;
                    case "Error":
                        list.addAll(lw.uef(xmlPullParser, name));
                        continue;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                continue;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    uefVar.uef(moa.uef(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        uefVar.uef(lw.oa(xmlPullParser, name));
                        continue;
                    case "Impression":
                        uefVar.uef().uef(lw.uef(xmlPullParser, name));
                        continue;
                }
                lw.uef(xmlPullParser);
            }
        }
    }

    public static void uef(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.dz.uef uefVar, int i5, double d3) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(uefVar.xs())) {
                    yo.uef(xmlPullParser, uefVar, i5, d3);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && uefVar.yo() == null) {
                    uefVar.uef(uef.uef(context, xmlPullParser));
                } else {
                    lw.uef(xmlPullParser);
                }
            }
        }
    }
}
