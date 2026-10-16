package org.apache.tika.detect;

import com.applovin.shadow.okio.Segment;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: classes5.dex */
public class TextDetector implements Detector {
    private static final int DEFAULT_NUMBER_OF_BYTES_TO_TEST = 512;
    private static final boolean[] IS_CONTROL_BYTE;
    private static final long serialVersionUID = 4774601079503507765L;
    private final int bytesToTest;

    static {
        boolean[] zArr = new boolean[32];
        IS_CONTROL_BYTE = zArr;
        Arrays.fill(zArr, true);
        zArr[9] = false;
        zArr[10] = false;
        zArr[12] = false;
        zArr[13] = false;
        zArr[27] = false;
    }

    public TextDetector() {
        this(DEFAULT_NUMBER_OF_BYTES_TO_TEST);
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream == null) {
            return MediaType.OCTET_STREAM;
        }
        inputStream.mark(this.bytesToTest);
        try {
            TextStatistics textStatistics = new TextStatistics();
            byte[] bArr = new byte[Segment.SHARE_MINIMUM];
            int i5 = inputStream.read(bArr, 0, Math.min(this.bytesToTest, Segment.SHARE_MINIMUM));
            int i10 = 0;
            while (i5 != -1 && i10 < this.bytesToTest) {
                textStatistics.addData(bArr, 0, i5);
                i10 += i5;
                i5 = inputStream.read(bArr, 0, Math.min(this.bytesToTest - i10, Segment.SHARE_MINIMUM));
            }
            if (!textStatistics.isMostlyAscii() && !textStatistics.looksLikeUTF8()) {
                MediaType mediaType = MediaType.OCTET_STREAM;
                inputStream.reset();
                return mediaType;
            }
            MediaType mediaType2 = MediaType.TEXT_PLAIN;
            inputStream.reset();
            return mediaType2;
        } catch (Throwable th) {
            inputStream.reset();
            throw th;
        }
    }

    public TextDetector(int i5) {
        this.bytesToTest = i5;
    }
}
