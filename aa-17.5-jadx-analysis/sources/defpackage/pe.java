package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;

/* loaded from: classes2.dex */
public final class pe {
    public Intent a;
    private final IntentSender b;
    private int c;
    private int d;

    public pe(IntentSender intentSender) {
        intentSender.getClass();
        this.b = intentSender;
    }

    public final IntentSenderRequest a() {
        return new IntentSenderRequest(this.b, this.a, this.c, this.d);
    }

    public final void b(int i, int i2) {
        this.d = i;
        this.c = i2;
    }
}
