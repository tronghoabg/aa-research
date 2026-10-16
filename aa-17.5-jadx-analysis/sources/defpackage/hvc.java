package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class hvc extends hus {
    @Override // defpackage.huv
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.hus
    protected final /* synthetic */ Object f(AssetManager assetManager, String str) throws IOException {
        return assetManager.openFd(str);
    }

    @Override // defpackage.hus
    protected final /* synthetic */ void g(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }
}
