package org.apache.tika.extractor;

import com.applovin.impl.Z0;
import com.applovin.shadow.okio.Segment;
import gg.c;
import hg.a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import kg.e;
import kg.f;
import lg.b;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;

/* loaded from: classes5.dex */
public class BasicEmbeddedDocumentBytesHandler extends AbstractEmbeddedDocumentBytesHandler {
    private final EmbeddedDocumentBytesConfig config;
    Map<Integer, byte[]> docBytes = new HashMap();

    public BasicEmbeddedDocumentBytesHandler(EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig) {
        this.config = embeddedDocumentBytesConfig;
    }

    @Override // org.apache.tika.extractor.AbstractEmbeddedDocumentBytesHandler, org.apache.tika.extractor.EmbeddedDocumentBytesHandler
    public void add(int i5, Metadata metadata, InputStream inputStream) throws IOException {
        super.add(i5, metadata, inputStream);
        Map<Integer, byte[]> map = this.docBytes;
        Integer numValueOf = Integer.valueOf(i5);
        byte[] bArr = c.f35914a;
        int i10 = lg.c.f40290f;
        new e();
        lg.c cVar = new lg.c();
        b bVar = new b(new Z0(24), new com.unity3d.services.core.webview.b(cVar, 8));
        try {
            c.b(inputStream, bVar);
            byte[] bArrB = cVar.b();
            bVar.close();
            map.put(numValueOf, bArrB);
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public InputStream getDocument(int i5) throws IOException {
        e eVar = new e();
        eVar.f36434b = new a(this.docBytes.get(Integer.valueOf(i5)));
        a aVar = eVar.f36434b;
        if (aVar == null) {
            throw new IllegalStateException("origin == null");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) aVar.f36433b);
        f fVar = new f();
        fVar.f39724a = byteArrayInputStream;
        fVar.f39728e = -1;
        fVar.f39725b = new byte[Segment.SIZE];
        return fVar;
    }
}
