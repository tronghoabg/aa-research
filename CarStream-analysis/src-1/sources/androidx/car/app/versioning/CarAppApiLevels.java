package androidx.car.app.versioning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
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
    public static final int UNKNOWN = 0;

    private CarAppApiLevels() {
    }

    public static int getLatest() throws IOException, NumberFormatException {
        ClassLoader classLoader = CarAppApiLevels.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        InputStream resourceAsStream = classLoader.getResourceAsStream(CAR_API_LEVEL_FILE);
        if (resourceAsStream == null) {
            throw new IllegalStateException("Car API level file car-app-api.level not found");
        }
        try {
            String line = new BufferedReader(new InputStreamReader(resourceAsStream)).readLine();
            int i = Integer.parseInt(line);
            if (i >= 1 && i <= 8) {
                return i;
            }
            throw new IllegalStateException("Unrecognized Car API level: " + line);
        } catch (IOException unused) {
            throw new IllegalStateException("Unable to read Car API level file");
        }
    }

    public static int getOldest() {
        return 1;
    }

    public static boolean isValid(int i) {
        return i >= getOldest() && i <= getLatest();
    }
}
