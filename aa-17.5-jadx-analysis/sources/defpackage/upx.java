package defpackage;

import android.graphics.Picture;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

/* loaded from: classes3.dex */
final class upx extends upv {
    private final byte[] a;

    public upx(byte[] bArr) {
        this.a = bArr;
    }

    @Override // defpackage.upv
    protected final /* bridge */ /* synthetic */ Object a() throws SAXException, IOException {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                Picture picture = new Picture();
                ackj ackjVar = new ackj(picture);
                ackjVar.p = 72.0f;
                xMLReader.setContentHandler(ackjVar);
                xMLReader.parse(new InputSource(byteArrayInputStream));
                Log.i("SVG", "Parsing complete in " + (System.currentTimeMillis() - jCurrentTimeMillis) + " millis.");
                Float.isInfinite(ackjVar.o.top);
                try {
                    byteArrayInputStream.close();
                    return picture;
                } catch (IOException e) {
                    Log.w("SVG", "parsing svg", e);
                    e.printStackTrace();
                    return picture;
                }
            } catch (Exception e2) {
                Log.w("SVG", "Parse error: ".concat(e2.toString()));
                throw new ackf(e2);
            }
        } catch (ackf e3) {
            ((ynz) ((ynz) upy.a.a(uys.a).p(e3)).ai((char) 9599)).u("Cannot parse SVG.");
            return null;
        }
    }
}
