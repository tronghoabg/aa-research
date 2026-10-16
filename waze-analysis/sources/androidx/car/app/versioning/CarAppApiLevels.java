package androidx.car.app.versioning;

import j$.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CarAppApiLevels {
    private static final String CAR_API_LEVEL_FILE = "car-app-api.level";
    public static final int LEVEL_1 = 1;
    public static final int LEVEL_2 = 2;
    public static final int LEVEL_3 = 3;
    public static final int LEVEL_4 = 4;
    public static final int LEVEL_5 = 5;
    public static final int LEVEL_6 = 6;
    public static final int LEVEL_7 = 7;
    public static final int LEVEL_8 = 8;
    public static final int LEVEL_9 = 9;
    public static final int UNKNOWN = 0;
    private static volatile int sLatestCached;
    private static final Object sLock = new Object();

    private CarAppApiLevels() {
    }

    public static int getLatest() {
        synchronized (sLock) {
            if (sLatestCached == 0) {
                sLatestCached = readLatestFromResource();
            }
        }
        return sLatestCached;
    }

    public static int getOldest() {
        return 1;
    }

    public static boolean isValid(int i2) {
        return i2 > 0 && i2 <= getLatest();
    }

    private static int readLatestFromResource() throws IOException, NumberFormatException {
        InputStream resourceAsStream = ((ClassLoader) Objects.requireNonNull(CarAppApiLevels.class.getClassLoader())).getResourceAsStream(CAR_API_LEVEL_FILE);
        if (resourceAsStream == null) {
            throw new IllegalStateException(String.format("Car API level file %s not found", CAR_API_LEVEL_FILE));
        }
        try {
            String line = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int i2 = Integer.parseInt(line);
            if (i2 > 0 && i2 <= 9) {
                return i2;
            }
            throw new IllegalStateException("Unrecognized Car API level: " + line);
        } catch (IOException unused) {
            throw new IllegalStateException("Unable to read Car API level file");
        }
    }
}
