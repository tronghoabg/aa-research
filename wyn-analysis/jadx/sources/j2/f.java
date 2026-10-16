package j2;

import N1.C;
import N1.C0764m;
import N1.C0765n;
import com.applovin.shadow.okio.Segment;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import org.xmlpull.v1.XmlPullParser;
import s2.AbstractC3991a;

/* loaded from: classes.dex */
public final class f extends Ca.d {

    /* renamed from: e, reason: collision with root package name */
    public C0765n f38606e;

    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList q(java.lang.String r10) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L98
            byte[] r10 = Q1.x.r(r10)
            byte[] r1 = Q1.a.f9659a
            int r1 = r10.length
            r2 = 4
            if (r1 > r2) goto L16
            goto L22
        L16:
            r1 = 0
            r3 = r1
        L18:
            if (r3 >= r2) goto L28
            r4 = r10[r3]
            byte[] r5 = Q1.a.f9659a
            r5 = r5[r3]
            if (r4 == r5) goto L25
        L22:
            r1 = 0
            goto L8f
        L25:
            int r3 = r3 + 1
            goto L18
        L28:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = r1
        L2e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.add(r5)
            int r4 = r4 + r2
            int r5 = r10.length
            int r5 = r5 - r2
        L38:
            r6 = -1
            if (r4 > r5) goto L53
            int r7 = r10.length
            int r7 = r7 - r4
            if (r7 > r2) goto L40
            goto L4d
        L40:
            r7 = r1
        L41:
            if (r7 >= r2) goto L54
            int r8 = r4 + r7
            r8 = r10[r8]
            byte[] r9 = Q1.a.f9659a
            r9 = r9[r7]
            if (r8 == r9) goto L50
        L4d:
            int r4 = r4 + 1
            goto L38
        L50:
            int r7 = r7 + 1
            goto L41
        L53:
            r4 = r6
        L54:
            if (r4 != r6) goto L2e
            int r2 = r3.size()
            byte[][] r2 = new byte[r2][]
            r4 = r1
        L5d:
            int r5 = r3.size()
            if (r4 >= r5) goto L8e
            java.lang.Object r5 = r3.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r6 = r3.size()
            int r6 = r6 + (-1)
            if (r4 >= r6) goto L82
            int r6 = r4 + 1
            java.lang.Object r6 = r3.get(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto L83
        L82:
            int r6 = r10.length
        L83:
            int r6 = r6 - r5
            byte[] r7 = new byte[r6]
            java.lang.System.arraycopy(r10, r5, r7, r1, r6)
            r2[r4] = r7
            int r4 = r4 + 1
            goto L5d
        L8e:
            r1 = r2
        L8f:
            if (r1 != 0) goto L95
            r0.add(r10)
            return r0
        L95:
            java.util.Collections.addAll(r0, r1)
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.f.q(java.lang.String):java.util.ArrayList");
    }

    @Override // Ca.d
    public final Object e() {
        return this.f38606e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List] */
    @Override // Ca.d
    public final void m(XmlPullParser xmlPullParser) throws d {
        int i5 = 0;
        C0764m c0764m = new C0764m();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue == null) {
            throw new d("FourCC", 0);
        }
        String str = (attributeValue.equalsIgnoreCase("H264") || attributeValue.equalsIgnoreCase("X264") || attributeValue.equalsIgnoreCase("AVC1") || attributeValue.equalsIgnoreCase("DAVC")) ? MimeTypes.VIDEO_H264 : (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (attributeValue.equalsIgnoreCase("TTML") || attributeValue.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (attributeValue.equalsIgnoreCase("ac-3") || attributeValue.equalsIgnoreCase("dac3")) ? "audio/ac3" : (attributeValue.equalsIgnoreCase("ec-3") || attributeValue.equalsIgnoreCase("dec3")) ? "audio/eac3" : attributeValue.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (attributeValue.equalsIgnoreCase("dtsh") || attributeValue.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : attributeValue.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : attributeValue.equalsIgnoreCase("opus") ? "audio/opus" : null;
        int iIntValue = ((Integer) f("Type")).intValue();
        if (iIntValue == 2) {
            ArrayList arrayListQ = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            c0764m.f8193l = C.m("video/mp4");
            c0764m.f8201t = Ca.d.l(xmlPullParser, "MaxWidth");
            c0764m.f8202u = Ca.d.l(xmlPullParser, "MaxHeight");
            c0764m.f8197p = arrayListQ;
        } else if (iIntValue == 1) {
            if (str == null) {
                str = "audio/mp4a-latm";
            }
            int iL = Ca.d.l(xmlPullParser, "Channels");
            int iL2 = Ca.d.l(xmlPullParser, "SamplingRate");
            ArrayList arrayListQ2 = q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
            boolean zIsEmpty = arrayListQ2.isEmpty();
            ArrayList arrayListSingletonList = arrayListQ2;
            if (zIsEmpty) {
                arrayListSingletonList = arrayListQ2;
                if ("audio/mp4a-latm".equals(str)) {
                    arrayListSingletonList = Collections.singletonList(AbstractC3991a.a(iL2, iL));
                }
            }
            c0764m.f8193l = C.m("audio/mp4");
            c0764m.f8173B = iL;
            c0764m.f8174C = iL2;
            c0764m.f8197p = arrayListSingletonList;
        } else if (iIntValue == 3) {
            String str2 = (String) f("Subtype");
            if (str2 != null) {
                if (str2.equals("CAPT")) {
                    i5 = 64;
                } else if (str2.equals("DESC")) {
                    i5 = Segment.SHARE_MINIMUM;
                }
            }
            c0764m.f8193l = C.m("application/mp4");
            c0764m.f8188f = i5;
        } else {
            c0764m.f8193l = C.m("application/mp4");
        }
        c0764m.f8183a = xmlPullParser.getAttributeValue(null, "Index");
        c0764m.f8184b = (String) f("Name");
        c0764m.f8194m = C.m(str);
        c0764m.f8190h = Ca.d.l(xmlPullParser, "Bitrate");
        c0764m.f8186d = (String) f("Language");
        this.f38606e = new C0765n(c0764m);
    }
}
