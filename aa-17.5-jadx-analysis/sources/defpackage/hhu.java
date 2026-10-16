package defpackage;

import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final class hhu extends gej {
    final /* synthetic */ gnj f;
    public final /* synthetic */ hhz g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhu(hhz hhzVar, geu geuVar, glf glfVar, gnj gnjVar) {
        super(geuVar, glfVar);
        this.f = gnjVar;
        this.g = hhzVar;
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onFailure(Bundleable bundleable) {
        super.onFailure(bundleable);
        gnj gnjVar = this.f;
        gnjVar.b.a();
        gnjVar.a.a();
        this.g.g.set(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2 A[Catch: RuntimeException -> 0x0160, ghj -> 0x018b, ghh -> 0x01a0, SecurityException -> 0x01d4, xr -> 0x0200, TryCatch #2 {ghh -> 0x01a0, ghj -> 0x018b, SecurityException -> 0x01d4, RuntimeException -> 0x0160, xr -> 0x0200, blocks: (B:3:0x0021, B:5:0x0060, B:8:0x006b, B:9:0x0091, B:10:0x0092, B:12:0x00a4, B:14:0x00ae, B:16:0x00b5, B:18:0x00c9, B:20:0x00cf, B:22:0x00da, B:24:0x00e0, B:27:0x00f7, B:29:0x0105, B:30:0x0141, B:31:0x014f, B:32:0x0150, B:33:0x015f, B:15:0x00b2), top: B:54:0x0021 }] */
    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess(androidx.car.app.serialization.Bundleable r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hhu.onSuccess(androidx.car.app.serialization.Bundleable):void");
    }
}
