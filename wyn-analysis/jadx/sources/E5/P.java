package E5;

import java.util.HashSet;

/* loaded from: classes3.dex */
public abstract class P {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f3188a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f3189b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f3188a.add(str)) {
            f3189b += ", " + str;
        }
    }
}
