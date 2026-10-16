package defpackage;

import android.content.ComponentName;
import android.content.Intent;

/* loaded from: classes.dex */
public final class nrk extends mov {
    public static final nrk a = new nrk();

    private nrk() {
        super("Phone");
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        ComponentName component = intent.getComponent();
        return (component == null) & ("android.intent.action.CALL".equals(intent.getAction()) || "android.intent.action.DIAL".equals(intent.getAction()));
    }

    @Override // defpackage.mov
    protected final void i(Intent intent, qql qqlVar) {
        mpl.b(mkn.b).d(intent);
    }
}
