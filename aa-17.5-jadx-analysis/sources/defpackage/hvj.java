package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class hvj extends hus {
    @Override // defpackage.huv
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.hus
    protected final /* synthetic */ Object f(AssetManager assetManager, String str) throws IOException {
        return assetManager.open(str);
    }

    @Override // defpackage.hus
    protected final /* synthetic */ void g(Object obj) throws IOException {
        ((InputStream) obj).close();
    }
}
