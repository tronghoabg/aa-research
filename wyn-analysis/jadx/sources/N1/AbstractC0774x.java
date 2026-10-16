package N1;

import java.util.HashSet;

/* renamed from: N1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0774x {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f8277a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f8278b = "media3.common";

    public static synchronized void a(String str) {
        if (f8277a.add(str)) {
            f8278b += ", " + str;
        }
    }
}
