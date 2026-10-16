package I1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f5277a = new b();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5278b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f5279c = new LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f5280d;

    public static void a(AutoCloseable autoCloseable) throws Exception {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e7) {
                throw new RuntimeException(e7);
            }
        }
    }
}
