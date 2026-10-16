package J4;

import I4.o;
import I4.p;
import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f5594b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("http", HttpRequest.DEFAULT_SCHEME)));

    /* renamed from: a, reason: collision with root package name */
    public final p f5595a;

    public b(p pVar) {
        this.f5595a = pVar;
    }

    @Override // I4.p
    public final boolean a(Object obj) {
        return f5594b.contains(((Uri) obj).getScheme());
    }

    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        return this.f5595a.b(new I4.f(((Uri) obj).toString()), i5, i10, gVar);
    }
}
