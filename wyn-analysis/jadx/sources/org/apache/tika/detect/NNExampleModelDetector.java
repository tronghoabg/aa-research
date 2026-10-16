package org.apache.tika.detect;

import N0.a;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import org.apache.tika.mime.MediaType;
import vg.b;
import vg.d;

/* loaded from: classes5.dex */
public class NNExampleModelDetector extends TrainedModelDetector {
    private static final String EXAMPLE_NNMODEL_FILE = "tika-example.nnmodel";
    private static final b LOG = d.b(NNExampleModelDetector.class);
    private static final long serialVersionUID = 1;

    public NNExampleModelDetector() {
    }

    private void readDescription(NNTrainedModelBuilder nNTrainedModelBuilder, String str) throws NumberFormatException {
        String[] strArrSplit = str.split("\t");
        try {
            MediaType mediaType = MediaType.parse(strArrSplit[1]);
            int i5 = Integer.parseInt(strArrSplit[2]);
            int i10 = Integer.parseInt(strArrSplit[3]);
            int i11 = Integer.parseInt(strArrSplit[4]);
            nNTrainedModelBuilder.setNumOfInputs(i5);
            nNTrainedModelBuilder.setNumOfHidden(i10);
            nNTrainedModelBuilder.setNumOfOutputs(i11);
            nNTrainedModelBuilder.setType(mediaType);
        } catch (Exception e7) {
            LOG.h("Unable to parse the model configuration", e7);
            throw new RuntimeException("Unable to parse the model configuration", e7);
        }
    }

    private void readNNParams(NNTrainedModelBuilder nNTrainedModelBuilder, String str) {
        String[] strArrSplit = str.split("\t");
        float[] fArr = new float[strArrSplit.length];
        try {
            int i5 = 0;
            for (String str2 : strArrSplit) {
                fArr[i5] = Float.parseFloat(str2);
                i5++;
            }
            nNTrainedModelBuilder.setParams(fArr);
        } catch (Exception e7) {
            LOG.h("Unable to parse the model configuration", e7);
            throw new RuntimeException("Unable to parse the model configuration", e7);
        }
    }

    @Override // org.apache.tika.detect.TrainedModelDetector
    public void loadDefaultModels(InputStream inputStream) throws IOException, NumberFormatException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
        NNTrainedModelBuilder nNTrainedModelBuilder = new NNTrainedModelBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return;
                }
                String strTrim = line.trim();
                if (strTrim.startsWith("#")) {
                    readDescription(nNTrainedModelBuilder, strTrim);
                } else {
                    readNNParams(nNTrainedModelBuilder, strTrim);
                    super.registerModels(nNTrainedModelBuilder.getType(), nNTrainedModelBuilder.build());
                }
            } catch (IOException e7) {
                throw new RuntimeException("Unable to read the default media type registry", e7);
            }
        }
    }

    public NNExampleModelDetector(Path path) throws IOException {
        loadDefaultModels(path);
    }

    public NNExampleModelDetector(File file) throws IOException {
        loadDefaultModels(file);
    }

    @Override // org.apache.tika.detect.TrainedModelDetector
    public void loadDefaultModels(ClassLoader classLoader) throws IOException {
        if (classLoader == null) {
            classLoader = TrainedModelDetector.class.getClassLoader();
        }
        String strF = a.f(TrainedModelDetector.class.getPackage().getName().replace('.', '/'), "/");
        URL resource = classLoader.getResource(strF + EXAMPLE_NNMODEL_FILE);
        Objects.requireNonNull(resource, "required resource " + strF + "tika-example.nnmodel not found");
        try {
            InputStream inputStreamOpenStream = resource.openStream();
            try {
                loadDefaultModels(inputStreamOpenStream);
                if (inputStreamOpenStream != null) {
                    inputStreamOpenStream.close();
                }
            } finally {
            }
        } catch (IOException e7) {
            throw new RuntimeException("Unable to read the default media type registry", e7);
        }
    }
}
