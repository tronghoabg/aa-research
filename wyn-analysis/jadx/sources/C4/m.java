package C4;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class m implements f {

    /* renamed from: a, reason: collision with root package name */
    public final F4.f f1804a;

    public m(F4.f fVar) {
        this.f1804a = fVar;
    }

    @Override // C4.f
    public final g a(Object obj) {
        return new i((InputStream) obj, this.f1804a);
    }

    @Override // C4.f
    public final Class b() {
        return InputStream.class;
    }
}
