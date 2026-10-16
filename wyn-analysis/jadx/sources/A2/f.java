package A2;

import Q1.k;
import java.io.IOException;
import l8.AbstractC3409K;
import l8.C3406H;
import l8.e0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f275a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f276b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f277c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c6, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static A2.c a(java.lang.String r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            r0 = 1
            org.xmlpull.v1.XmlPullParserFactory r1 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r1 = r1.newPullParser()
            java.io.StringReader r2 = new java.io.StringReader
            r3 = r21
            r2.<init>(r3)
            r1.setInput(r2)
            r1.next()
            java.lang.String r2 = "x:xmpmeta"
            boolean r3 = Q1.k.q(r1, r2)
            r4 = 0
            if (r3 == 0) goto Lcd
            l8.I r3 = l8.AbstractC3409K.f40056b
            l8.e0 r3 = l8.e0.f40101e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r5
        L29:
            r1.next()
            java.lang.String r9 = "rdf:Description"
            boolean r9 = Q1.k.q(r1, r9)
            if (r9 == 0) goto L99
            java.lang.String[] r3 = A2.f.f275a
            r7 = 0
            r8 = r7
        L38:
            r9 = 4
            if (r8 >= r9) goto Lc6
            r10 = r3[r8]
            java.lang.String r10 = Q1.k.m(r1, r10)
            if (r10 == 0) goto L97
            int r3 = java.lang.Integer.parseInt(r10)
            if (r3 != r0) goto Lc6
            java.lang.String[] r3 = A2.f.f276b
            r8 = r7
        L4c:
            if (r8 >= r9) goto L60
            r10 = r3[r8]
            java.lang.String r10 = Q1.k.m(r1, r10)
            if (r10 == 0) goto L62
            long r8 = java.lang.Long.parseLong(r10)
            r10 = -1
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 != 0) goto L64
        L60:
            r8 = r5
            goto L64
        L62:
            int r8 = r8 + r0
            goto L4c
        L64:
            java.lang.String[] r3 = A2.f.f277c
        L66:
            r10 = 2
            if (r7 >= r10) goto L91
            r10 = r3[r7]
            java.lang.String r10 = Q1.k.m(r1, r10)
            if (r10 == 0) goto L8f
            long r13 = java.lang.Long.parseLong(r10)
            A2.b r15 = new A2.b
            r17 = 0
            r19 = 0
            java.lang.String r16 = "image/jpeg"
            r15.<init>(r16, r17, r19)
            r3 = r15
            A2.b r11 = new A2.b
            r15 = 0
            java.lang.String r12 = "video/mp4"
            r11.<init>(r12, r13, r15)
            l8.e0 r3 = l8.AbstractC3409K.o(r3, r11)
            goto L95
        L8f:
            int r7 = r7 + r0
            goto L66
        L91:
            l8.I r3 = l8.AbstractC3409K.f40056b
            l8.e0 r3 = l8.e0.f40101e
        L95:
            r7 = r8
            goto Lba
        L97:
            int r8 = r8 + r0
            goto L38
        L99:
            java.lang.String r9 = "Container:Directory"
            boolean r9 = Q1.k.q(r1, r9)
            if (r9 == 0) goto Laa
            java.lang.String r3 = "Container"
            java.lang.String r9 = "Item"
            l8.e0 r3 = b(r1, r3, r9)
            goto Lba
        Laa:
            java.lang.String r9 = "GContainer:Directory"
            boolean r9 = Q1.k.q(r1, r9)
            if (r9 == 0) goto Lba
            java.lang.String r3 = "GContainer"
            java.lang.String r9 = "GContainerItem"
            l8.e0 r3 = b(r1, r3, r9)
        Lba:
            boolean r9 = Q1.k.p(r1, r2)
            if (r9 == 0) goto L29
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto Lc7
        Lc6:
            return r4
        Lc7:
            A2.c r0 = new A2.c
            r0.<init>(r7, r3)
            return r0
        Lcd:
            java.lang.String r0 = "Couldn't find xmp metadata"
            N1.D r0 = N1.D.a(r4, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.f.a(java.lang.String):A2.c");
    }

    public static e0 b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C3406H c3406hI = AbstractC3409K.i();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (k.q(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM = k.m(xmlPullParser, strConcat3);
                String strM2 = k.m(xmlPullParser, strConcat4);
                String strM3 = k.m(xmlPullParser, strConcat5);
                String strM4 = k.m(xmlPullParser, strConcat6);
                if (strM == null || strM2 == null) {
                    return e0.f40101e;
                }
                c3406hI.a(new b(strM, strM3 != null ? Long.parseLong(strM3) : 0L, strM4 != null ? Long.parseLong(strM4) : 0L));
            }
        } while (!k.p(xmlPullParser, strConcat2));
        return c3406hI.g();
    }
}
