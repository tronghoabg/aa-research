package org.apache.tika.sax;

import A7.AbstractC0279p0;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.Writer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class RichTextContentHandler extends WriteOutContentHandler {
    public RichTextContentHandler(Writer writer) {
        super(writer);
    }

    @Override // org.apache.tika.sax.ContentHandlerDecorator, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        super.startElement(str, str2, str3, attributes);
        if ("img".equals(str2) && attributes.getValue("alt") != null) {
            String strL = AbstractC0279p0.l("[image: ", attributes.getValue("alt"), "]");
            characters(strL.toCharArray(), 0, strL.length());
        }
        if (!"a".equals(str2) || attributes.getValue(MediationMetaData.KEY_NAME) == null) {
            return;
        }
        String strL2 = AbstractC0279p0.l("[bookmark: ", attributes.getValue(MediationMetaData.KEY_NAME), "]");
        characters(strL2.toCharArray(), 0, strL2.length());
    }
}
