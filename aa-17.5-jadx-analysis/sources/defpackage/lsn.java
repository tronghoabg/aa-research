package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class lsn extends lsd {
    private final boolean c;

    public lsn(ComponentName componentName, boolean z) {
        super(componentName);
        this.c = z;
    }

    @Override // defpackage.lsd
    protected final String a() {
        return "REMOTE_STATUS " + this.c;
    }
}
