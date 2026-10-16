package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class mdx implements mdq {
    private final mdr a = new mdr(0);
    private final mdr b;
    private final mdr c;

    public mdx(Context context) {
        this.b = new mdr(context, 1);
        this.c = new mdr(context, 2);
    }

    @Override // defpackage.mdq
    public final mdp a() {
        return this.b;
    }

    @Override // defpackage.mdq
    public final mdp b() {
        return this.a;
    }

    @Override // defpackage.mdq
    public final mdp c() {
        return this.c;
    }
}
