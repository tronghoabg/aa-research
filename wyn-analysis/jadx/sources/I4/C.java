package I4;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class C implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f5321b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f5322a;

    public C(B b5) {
        this.f5322a = b5;
    }

    @Override // I4.p
    public final boolean a(Object obj) {
        return f5321b.contains(((Uri) obj).getScheme());
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [I4.B, java.lang.Object] */
    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        Uri uri = (Uri) obj;
        return new o(new X4.b(uri), this.f5322a.j(uri));
    }
}
