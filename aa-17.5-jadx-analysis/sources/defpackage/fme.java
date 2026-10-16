package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: classes2.dex */
final class fme {
    public static final String a = fjo.b("SystemJobInfoConverter");
    public final ComponentName b;

    public fme(Context context) {
        this.b = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
