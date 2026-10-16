package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final /* synthetic */ class qec implements tgr {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ qec(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, xyc] */
    @Override // defpackage.tgr
    public final Object a() {
        int i = this.b;
        if (i == 0) {
            int i2 = qer.g;
            return new lao((Context) this.a);
        }
        if (i == 1) {
            return this.a.a();
        }
        if (i == 2) {
            int i3 = qer.g;
            return new qhx((Context) this.a);
        }
        if (i != 3) {
            return this.a.a();
        }
        int i4 = qer.g;
        return (ltw) this.a.gu();
    }
}
