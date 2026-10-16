package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
final class ski extends skj {
    private final Callable e;

    public ski(Callable callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // defpackage.skj
    public final String a() {
        try {
            return (String) this.e.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
