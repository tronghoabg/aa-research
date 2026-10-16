package defpackage;

import android.content.ComponentName;

/* loaded from: classes2.dex */
public final class lse extends lsd {
    private final lok c;

    public lse(ComponentName componentName, lok lokVar) {
        super(componentName);
        this.c = lokVar;
    }

    @Override // defpackage.lsd
    protected final String a() {
        return "CONNECTION_STATUS ".concat(String.valueOf(this.c.name()));
    }
}
