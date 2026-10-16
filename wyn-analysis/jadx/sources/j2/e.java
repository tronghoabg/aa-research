package j2;

import M2.r;
import M2.t;
import android.util.Base64;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class e extends Ca.d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f38603e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f38604f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f38605g;

    @Override // Ca.d
    public final Object e() {
        UUID uuid = this.f38604f;
        byte[] bArrA = r.a(uuid, null, this.f38605g);
        byte[] bArr = this.f38605g;
        StringBuilder sb2 = new StringBuilder();
        for (int i5 = 0; i5 < bArr.length; i5 += 2) {
            sb2.append((char) bArr[i5]);
        }
        String string = sb2.toString();
        byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
        byte b5 = bArrDecode[0];
        bArrDecode[0] = bArrDecode[3];
        bArrDecode[3] = b5;
        byte b10 = bArrDecode[1];
        bArrDecode[1] = bArrDecode[2];
        bArrDecode[2] = b10;
        byte b11 = bArrDecode[4];
        bArrDecode[4] = bArrDecode[5];
        bArrDecode[5] = b11;
        byte b12 = bArrDecode[6];
        bArrDecode[6] = bArrDecode[7];
        bArrDecode[7] = b12;
        return new C3077a(uuid, bArrA, new t[]{new t(true, null, 8, bArrDecode, 0, 0, null)});
    }

    @Override // Ca.d
    public final boolean g(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // Ca.d
    public final void i(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f38603e = false;
        }
    }

    @Override // Ca.d
    public final void m(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f38603e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f38604f = UUID.fromString(attributeValue);
        }
    }

    @Override // Ca.d
    public final void n(XmlPullParser xmlPullParser) {
        if (this.f38603e) {
            this.f38605g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
