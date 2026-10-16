package defpackage;

import android.content.ComponentName;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;

/* loaded from: classes2.dex */
abstract class lsd {
    public final ZonedDateTime a = ZonedDateTime.now(ZoneId.systemDefault());
    public final ComponentName b;

    protected lsd(ComponentName componentName) {
        this.b = componentName;
    }

    protected abstract String a();
}
