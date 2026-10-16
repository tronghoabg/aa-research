package I4;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class D implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f5323b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", HttpRequest.DEFAULT_SCHEME)));

    /* renamed from: a, reason: collision with root package name */
    public final p f5324a;

    public D(p pVar) {
        this.f5324a = pVar;
    }

    @Override // I4.p
    public final boolean a(Object obj) {
        return f5323b.contains(((Uri) obj).getScheme());
    }

    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        return this.f5324a.b(new f(((Uri) obj).toString()), i5, i10, gVar);
    }
}
