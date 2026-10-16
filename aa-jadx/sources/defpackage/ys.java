package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ys {
    public static final /* synthetic */ int a = 0;
    private static volatile int b;
    private static final java.lang.Object c = new java.lang.Object();

    private ys() {
    }

    public static int a() {
        synchronized (c) {
            if (b == 0) {
                java.lang.ClassLoader classLoader = defpackage.ys.class.getClassLoader();
                classLoader.getClass();
                java.io.InputStream resourceAsStream = classLoader.getResourceAsStream("car-app-api.level");
                if (resourceAsStream == null) {
                    throw new java.lang.IllegalStateException(java.lang.String.format("Car API level file %s not found", "car-app-api.level"));
                }
                try {
                    java.lang.String line = new java.io.BufferedReader(new java.io.InputStreamReader(resourceAsStream)).readLine();
                    int i = java.lang.Integer.parseInt(line);
                    if (i <= 0 || i > 9) {
                        throw new java.lang.IllegalStateException(defpackage.a.bA(line, "Unrecognized Car API level: "));
                    }
                    b = i;
                } catch (java.io.IOException unused) {
                    throw new java.lang.IllegalStateException("Unable to read Car API level file");
                }
            }
        }
        return b;
    }
}
