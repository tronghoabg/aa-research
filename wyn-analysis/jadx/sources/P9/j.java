package P9;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final long f9287b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f9288c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static j f9289d;

    /* renamed from: a, reason: collision with root package name */
    public final ya.b f9290a;

    public j(ya.b bVar) {
        this.f9290a = bVar;
    }

    public final boolean a(Q9.b bVar) {
        if (TextUtils.isEmpty(bVar.f9921c)) {
            return true;
        }
        long j8 = bVar.f9924f + bVar.f9923e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f9290a.getClass();
        return j8 < timeUnit.toSeconds(System.currentTimeMillis()) + f9287b;
    }
}
