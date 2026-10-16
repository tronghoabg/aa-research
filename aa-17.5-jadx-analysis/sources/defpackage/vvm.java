package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class vvm implements aezk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ vvm(aezk aezkVar, xyc xycVar, aezk aezkVar2, int i) {
        this.d = i;
        this.a = aezkVar;
        this.b = xycVar;
        this.c = aezkVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, mkf] */
    /* JADX WARN: Type inference failed for: r7v1, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, xyc] */
    @Override // defpackage.aezk, defpackage.aezj
    public final Object a() {
        if (this.d == 0) {
            int i = vvp.f;
            return (vuz) (((Boolean) this.a.a()).booleanValue() ? this.b.gu() : this.c.a());
        }
        int i2 = qew.g;
        jri jriVar = jri.a;
        ?? r5 = this.a;
        return new ohz((Context) this.b, this.c, jriVar, r5, Optional.empty());
    }

    public /* synthetic */ vvm(Context context, Executor executor, mkf mkfVar, int i) {
        this.d = i;
        this.b = context;
        this.c = executor;
        this.a = mkfVar;
    }
}
