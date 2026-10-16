package defpackage;

import android.content.res.AssetManager;

/* loaded from: classes2.dex */
public final class hyg implements hzi, hyf {
    private final AssetManager a;
    private final /* synthetic */ int b;

    public hyg(AssetManager assetManager, int i) {
        this.b = i;
        this.a = assetManager;
    }

    @Override // defpackage.hyf
    public final huv a(AssetManager assetManager, String str) {
        return this.b != 0 ? new hvc(assetManager, str) : new hvj(assetManager, str);
    }

    @Override // defpackage.hzi
    public final hzh b(hzm hzmVar) {
        return this.b != 0 ? new hyr(this.a, this, 1) : new hyr(this.a, this, 1);
    }
}
