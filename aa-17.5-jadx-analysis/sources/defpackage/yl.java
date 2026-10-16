package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public final class yl {
    public static final /* synthetic */ int a = 0;
    private static volatile int b;
    private static final Object c = new Object();

    private yl() {
    }

    public static int a() {
        synchronized (c) {
            if (b == 0) {
                ClassLoader classLoader = yl.class.getClassLoader();
                classLoader.getClass();
                InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
                if (resourceAsStream == null) {
                    throw new IllegalStateException(String.format("Car API level file %s not found", "car-app-api.level"));
                }
                try {
                    String line = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
                    int i = Integer.parseInt(line);
                    if (i <= 0 || i > 9) {
                        throw new IllegalStateException(a.bz(line, "Unrecognized Car API level: "));
                    }
                    b = i;
                } catch (IOException unused) {
                    throw new IllegalStateException("Unable to read Car API level file");
                }
            }
        }
        return b;
    }
}
