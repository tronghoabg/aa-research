package defpackage;

import android.os.DeadObjectException;
import android.view.View;

/* loaded from: classes2.dex */
public final class dad implements dbz {
    private final View a;

    public dad(View view) {
        this.a = view;
    }

    @Override // defpackage.dbz
    public final void a() {
        try {
            this.a.playSoundEffect(0);
        } catch (DeadObjectException unused) {
        }
    }
}
