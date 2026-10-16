package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hzr implements hzh {
    private static final Set a = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    private final hzq b;

    public hzr(hzq hzqVar) {
        this.b = hzqVar;
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return a.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.hzh
    public final /* bridge */ /* synthetic */ ncp b(Object obj, int i, int i2, hum humVar) {
        Uri uri = (Uri) obj;
        return new ncp(new ifj(uri), this.b.a(uri));
    }
}
