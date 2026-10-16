package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes2.dex */
final class aa extends ad {
    private final boolean b;
    private boolean c;
    private rz d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(cp cpVar, boolean z) {
        super(cpVar);
        cpVar.getClass();
        this.b = z;
    }

    public final rz a(Context context) throws Resources.NotFoundException {
        if (this.c) {
            return this.d;
        }
        cp cpVar = this.a;
        rz rzVarAY = a.aY(context, cpVar.a, cpVar.h == 2, this.b);
        this.d = rzVarAY;
        this.c = true;
        return rzVarAY;
    }
}
