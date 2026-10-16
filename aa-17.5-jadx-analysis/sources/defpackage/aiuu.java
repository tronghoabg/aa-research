package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
final class aiuu extends aiuv {
    private final Runnable a;

    public aiuu(long j, Runnable runnable) {
        super(j);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    @Override // defpackage.aiuv
    public final String toString() {
        String string = super.toString();
        Runnable runnable = this.a;
        Objects.toString(runnable);
        return string.concat(runnable.toString());
    }
}
