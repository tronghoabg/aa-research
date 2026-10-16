package org.apache.tika.detect;

import com.google.android.gms.common.api.f;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.mime.MediaType;

/* loaded from: classes5.dex */
public abstract class TrainedModelDetector implements Detector {
    private static final long serialVersionUID = 1;
    private final Map<MediaType, TrainedModel> MODEL_MAP = new HashMap();

    public TrainedModelDetector() {
        loadDefaultModels(getClass().getClassLoader());
    }

    private void writeHisto(float[] fArr) throws IOException {
        Path pathCreateTempFile = new TemporaryResources().createTempFile();
        Charset charset = StandardCharsets.UTF_8;
        BufferedWriter bufferedWriterNewBufferedWriter = Files.newBufferedWriter(pathCreateTempFile, StandardCharsets.UTF_8, new OpenOption[0]);
        try {
            for (float f10 : fArr) {
                bufferedWriterNewBufferedWriter.write(f10 + "\t");
            }
            bufferedWriterNewBufferedWriter.write("\r\n");
            bufferedWriterNewBufferedWriter.close();
        } catch (Throwable th) {
            if (bufferedWriterNewBufferedWriter != null) {
                try {
                    bufferedWriterNewBufferedWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // org.apache.tika.detect.Detector
    public MediaType detect(InputStream inputStream, Metadata metadata) throws IOException {
        if (inputStream == null) {
            return null;
        }
        inputStream.mark(getMinLength());
        float[] byteFrequencies = readByteFrequencies(inputStream);
        MediaType mediaType = MediaType.OCTET_STREAM;
        float f10 = 0.5f;
        for (Map.Entry<MediaType, TrainedModel> entry : this.MODEL_MAP.entrySet()) {
            MediaType key = entry.getKey();
            float fPredict = entry.getValue().predict(byteFrequencies);
            if (f10 < fPredict) {
                f10 = fPredict;
                mediaType = key;
            }
        }
        inputStream.reset();
        return mediaType;
    }

    public int getMinLength() {
        return f.API_PRIORITY_OTHER;
    }

    public abstract void loadDefaultModels(InputStream inputStream);

    public abstract void loadDefaultModels(ClassLoader classLoader);

    public void loadDefaultModels(Path path) throws IOException {
        try {
            InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
            try {
                loadDefaultModels(inputStreamNewInputStream);
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } finally {
            }
        } catch (IOException e7) {
            throw new RuntimeException("Unable to read the default media type registry", e7);
        }
    }

    public float[] readByteFrequencies(InputStream inputStream) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(inputStream);
        float[] fArr = new float[257];
        fArr[0] = 1.0f;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5120);
        float fMax = -1.0f;
        for (int i5 = readableByteChannelNewChannel.read(byteBufferAllocate); i5 != -1; i5 = readableByteChannelNewChannel.read(byteBufferAllocate)) {
            byteBufferAllocate.flip();
            while (byteBufferAllocate.hasRemaining()) {
                byte b5 = byteBufferAllocate.get();
                int i10 = b5 + 1;
                if (b5 < 0) {
                    i10 = b5 + 257;
                    fArr[i10] = fArr[i10] + 1.0f;
                } else {
                    fArr[i10] = fArr[i10] + 1.0f;
                }
                fMax = Math.max(fMax, fArr[i10]);
            }
        }
        for (int i11 = 1; i11 < 257; i11++) {
            float f10 = fArr[i11] / fMax;
            fArr[i11] = f10;
            fArr[i11] = (float) Math.sqrt(f10);
        }
        return fArr;
    }

    public void registerModels(MediaType mediaType, TrainedModel trainedModel) {
        this.MODEL_MAP.put(mediaType, trainedModel);
    }

    public void loadDefaultModels(File file) throws IOException {
        loadDefaultModels(file.toPath());
    }
}
