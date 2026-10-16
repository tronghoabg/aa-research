package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hzt implements hzh {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    private final hzh b;

    public hzt(hzh hzhVar) {
        this.b = hzhVar;
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ ncp b(Object obj, int i, int i2, hum humVar) {
        return this.b.b(new hyx(((Uri) obj).toString()), i, i2, humVar);
    }
}
