package com.bytedance.sdk.openadsdk.core.dz.uef.uef;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.dz.zjm;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class moa {
    public static Set<zjm> uef(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        zjm zjmVarUef;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(lw.xs, "vendor");
                    String strOa = null;
                    String strOa2 = null;
                    String strOa3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(lw.xs, "event"))) {
                                            break;
                                        } else {
                                            strOa3 = lw.oa(xmlPullParser, "Tracking");
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!"omid".equals(xmlPullParser.getAttributeValue(lw.xs, "apiFramework"))) {
                                            break;
                                        } else {
                                            strOa = lw.oa(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case "VerificationParameters":
                                        strOa2 = lw.oa(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strOa) && (zjmVarUef = zjm.uef(strOa, attributeValue, strOa2, strOa3)) != null) {
                            hashSet.add(zjmVarUef);
                        }
                    }
                } else {
                    lw.uef(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
