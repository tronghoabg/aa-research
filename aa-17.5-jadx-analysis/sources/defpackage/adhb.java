package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class adhb implements xyc {
    private static final adhb a = new adhb();
    private final xyc b = new xyf(new adhd());

    public static boolean c(Context context) {
        return a.gu().a(context);
    }

    public static boolean d(Context context) {
        return a.gu().b(context);
    }

    @Override // defpackage.xyc
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final adhc gu() {
        return (adhc) ((xyf) this.b).a;
    }
}
