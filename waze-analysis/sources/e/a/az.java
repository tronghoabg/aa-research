package e.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class az {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f46298a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    private final String f46299b;

    /* renamed from: c, reason: collision with root package name */
    private final String f46300c;

    /* renamed from: d, reason: collision with root package name */
    private final long f46301d;

    az(String str, String str2, long j2) {
        com.google.d.b.an.C(str, "typeName");
        com.google.d.b.an.m(!str.isEmpty(), "empty type");
        this.f46299b = str;
        this.f46300c = str2;
        this.f46301d = j2;
    }

    public static az b(Class cls, String str) {
        com.google.d.b.an.C(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return c(simpleName, str);
    }

    public static az c(String str, String str2) {
        return new az(str, str2, f46298a.incrementAndGet());
    }

    public final long a() {
        return this.f46301d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f46299b + "<" + this.f46301d + ">");
        String str = this.f46300c;
        if (str != null) {
            sb.append(": (");
            sb.append(str);
            sb.append(')');
        }
        return sb.toString();
    }
}
