package com.bytedance.sdk.openadsdk.core.dz.uef.uef;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.dz.oa.yo;
import com.bytedance.sdk.openadsdk.core.dz.uef.oa;
import com.bytedance.sdk.openadsdk.core.dz.yo.uef;
import com.bytedance.sdk.openadsdk.core.model.gzw;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class lw extends com.bytedance.sdk.openadsdk.core.dz.uef.oa {
    public static final String xs = null;

    public lw(Context context, int i5, int i10) {
        super(context, i5, i10);
    }

    public static int oa(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return Integer.MIN_VALUE;
        }
    }

    private void yo(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef(com.bytedance.sdk.openadsdk.core.dz.oa.yo.uef((gzw) null, (List<com.bytedance.sdk.openadsdk.core.dz.oa.yo>) Collections.singletonList(new yo.uef(str).uef()), this.uef > 0 ? com.bytedance.sdk.openadsdk.core.dz.uef.uef.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.dz.uef.uef.UNDEFINED_ERROR, -1L, (String) null, (String) null), (yo.oa) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.dz.uef.oa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.openadsdk.core.dz.uef uef(java.lang.String r5, java.io.File r6, java.util.List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> r7) throws java.lang.Throwable {
        /*
            r4 = this;
            r0 = 0
            r4.lw = r0
            android.content.Context r1 = r4.f25595oa
            r2 = 0
            if (r1 != 0) goto Lc
            r5 = -1
            r4.lw = r5
            return r2
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L18
            if (r6 != 0) goto L18
            r5 = -2
            r4.lw = r5
            return r2
        L18:
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            java.lang.String r3 = "UTF-8"
            if (r1 != 0) goto L2c
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            byte[] r5 = r5.getBytes(r3)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            goto L32
        L2a:
            r5 = move-exception
            goto L5c
        L2c:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L4f
            r6 = r5
        L32:
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r5.setFeature(r1, r0)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r5.setInput(r6, r3)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r5.nextTag()     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            com.bytedance.sdk.openadsdk.core.dz.uef r5 = r4.uef(r5, r7)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r4.uef(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L50
            r6.close()     // Catch: java.io.IOException -> L4b
        L4b:
            return r5
        L4c:
            r5 = move-exception
            r2 = r6
            goto L5c
        L4f:
            r6 = r2
        L50:
            r5 = -3
            r4.lw = r5     // Catch: java.lang.Throwable -> L4c
            r4.uef(r2)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L5b
            r6.close()     // Catch: java.io.IOException -> L5b
        L5b:
            return r2
        L5c:
            if (r2 == 0) goto L61
            r2.close()     // Catch: java.io.IOException -> L61
        L61:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.dz.uef.uef.lw.uef(java.lang.String, java.io.File, java.util.List):com.bytedance.sdk.openadsdk.core.dz.uef");
    }

    public static class uef {
        String moa;

        /* renamed from: oa, reason: collision with root package name */
        uef.EnumC0097uef f25598oa;
        String uef;
        uef.oa yo;
        final List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> lw = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> ivm = new ArrayList();
        float xs = Float.MIN_VALUE;

        public uef() {
        }

        public void oa(String str) {
            this.ivm.add(new yo.uef(str).uef());
        }

        public void uef(String str, uef.EnumC0097uef enumC0097uef, uef.oa oaVar) {
            this.uef = str;
            this.f25598oa = enumC0097uef;
            this.yo = oaVar;
        }

        public void uef(String str) {
            this.lw.add(new yo.uef(str).uef());
        }

        public uef(String str, uef.EnumC0097uef enumC0097uef, uef.oa oaVar) {
            uef(str, enumC0097uef, oaVar);
        }
    }

    public static String oa(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String strTrim;
        String str2 = xs;
        xmlPullParser.require(2, str2, str);
        if (xmlPullParser.next() == 4) {
            strTrim = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            strTrim = "";
        }
        xmlPullParser.require(3, str2, str);
        return strTrim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x00e1, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10, types: [com.bytedance.sdk.openadsdk.core.dz.uef] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r17v15 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r17v23 */
    /* JADX WARN: Type inference failed for: r17v24 */
    /* JADX WARN: Type inference failed for: r17v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.bytedance.sdk.openadsdk.core.dz.uef oa(org.xmlpull.v1.XmlPullParser r19, java.util.List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.dz.uef.uef.lw.oa(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.dz.uef");
    }

    private void uef(com.bytedance.sdk.openadsdk.core.dz.uef uefVar) {
        if (this.ivm == null) {
            this.ivm = new oa.uef();
        }
        oa.uef uefVar2 = this.ivm;
        uefVar2.uef = this.lw;
        uefVar2.f25596oa = this.uef;
        if (uefVar != null) {
            uefVar2.yo = uefVar.uef().f25583oa.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.dz.uef uef(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list) throws Throwable {
        XmlPullParser xmlPullParser2;
        List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list2;
        XmlPullParser xmlPullParser3;
        List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> list3;
        xmlPullParser.require(2, xs, "VAST");
        boolean z2 = false;
        String strOa = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    strOa = oa(xmlPullParser, name);
                } else {
                    if ("Ad".equals(name)) {
                        if (uef(xmlPullParser.getAttributeValue(xs, "sequence"))) {
                            while (true) {
                                if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                    xmlPullParser2 = xmlPullParser;
                                    list2 = list;
                                    z2 = true;
                                    break;
                                }
                                if (xmlPullParser.getEventType() == 2) {
                                    String name2 = xmlPullParser.getName();
                                    if ("InLine".equals(name2)) {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        com.bytedance.sdk.openadsdk.core.dz.uef uefVarUef = oa.uef(this.f25595oa, xmlPullParser3, list3, this.yo, this.moa);
                                        if (uefVarUef != null) {
                                            if (!TextUtils.isEmpty(uefVarUef.xs())) {
                                                return uefVarUef;
                                            }
                                            this.lw = -6;
                                            return null;
                                        }
                                    } else {
                                        xmlPullParser3 = xmlPullParser;
                                        list3 = list;
                                        if ("Wrapper".equals(name2)) {
                                            com.bytedance.sdk.openadsdk.core.dz.uef uefVarOa = oa(xmlPullParser3, list3);
                                            if (uefVarOa != null) {
                                                return uefVarOa;
                                            }
                                        } else {
                                            uef(xmlPullParser3);
                                        }
                                    }
                                    xmlPullParser = xmlPullParser3;
                                    list = list3;
                                }
                            }
                        } else {
                            uef(xmlPullParser);
                            z2 = true;
                        }
                    } else {
                        xmlPullParser2 = xmlPullParser;
                        list2 = list;
                        uef(xmlPullParser2);
                    }
                    xmlPullParser = xmlPullParser2;
                    list = list2;
                }
            }
        }
        if (!z2) {
            this.lw = -4;
            yo(strOa);
        }
        if (this.lw == 0) {
            this.lw = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> uef(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        return uef(xmlPullParser, str, false);
    }

    public static List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> uef(XmlPullParser xmlPullParser, String str, boolean z2) throws XmlPullParserException, IOException {
        return uef(oa(xmlPullParser, str), z2);
    }

    public static void uef(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i5 = 1;
        while (i5 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i5++;
            } else if (next == 3) {
                i5--;
            }
        }
    }

    public static void uef(XmlPullParser xmlPullParser, String str, int i5) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i5) {
                return;
            } else {
                xmlPullParser.next();
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.dz.oa.yo> uef(String str, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new yo.uef(str).uef(z2).uef());
    }
}
