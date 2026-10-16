package defpackage;

import android.app.PendingIntent;
import j$.util.Optional;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class mjt implements Closeable {
    public final /* synthetic */ String a;

    public mjt(String str) {
        this.a = str;
    }

    public static /* synthetic */ void a(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        try {
            pendingIntent.send();
        } catch (PendingIntent.CanceledException e) {
            ((ynz) ((ynz) ((ynz) mju.a.h()).p(e)).ai(5039)).t(e);
        }
    }

    public static final Optional b(nul nulVar) {
        Optional optionalOfNullable = Optional.ofNullable(nulVar);
        return true != optionalOfNullable.isPresent() ? optionalOfNullable : Optional.ofNullable(((nul) optionalOfNullable.get()).c);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
