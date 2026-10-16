package org.apache.tika.pipes;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.apache.tika.exception.TikaConfigException;
import org.w3c.dom.DOMException;
import vg.b;
import vg.d;

/* loaded from: classes5.dex */
public class PipesConfig extends PipesConfigBase {
    private static final b LOG = d.b(PipesClient.class);
    private long maxWaitForClientMillis = 60000;

    private PipesConfig() {
    }

    public static PipesConfig load(Path path) throws IOException, TikaConfigException {
        PipesConfig pipesConfig = new PipesConfig();
        InputStream inputStreamNewInputStream = Files.newInputStream(path, new OpenOption[0]);
        try {
            pipesConfig.configure("pipes", inputStreamNewInputStream);
            if (inputStreamNewInputStream != null) {
                inputStreamNewInputStream.close();
            }
            if (pipesConfig.getTikaConfig() == null) {
                LOG.u(path, "A separate tikaConfig was not specified in the <pipes/> element in the  config file; will use {} for pipes");
                pipesConfig.setTikaConfig(path);
            }
            return pipesConfig;
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long getMaxWaitForClientMillis() {
        return this.maxWaitForClientMillis;
    }

    public void setMaxWaitForClientMillis(long j8) {
        this.maxWaitForClientMillis = j8;
    }

    public static PipesConfig load(InputStream inputStream) throws IllegalAccessException, DOMException, SecurityException, ClassNotFoundException, IOException, TikaConfigException, IllegalArgumentException, InvocationTargetException {
        PipesConfig pipesConfig = new PipesConfig();
        pipesConfig.configure("pipes", inputStream);
        return pipesConfig;
    }
}
