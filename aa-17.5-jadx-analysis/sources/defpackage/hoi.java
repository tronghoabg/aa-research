package defpackage;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hoi extends hnd {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hnd
    public final /* bridge */ /* synthetic */ hne a(Bundle bundle, Set set) {
        return new hoj((hok) hok.b.get(bundle.getInt("TYPE_KEY")), bundle.getBoolean("DATA_KEY"), set);
    }
}
