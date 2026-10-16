package N3;

import J3.r;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final String f8388b = r.f("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f8389a;

    public a(Context context) {
        this.f8389a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
