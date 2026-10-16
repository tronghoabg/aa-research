package okhttp3;

import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import e.a.dx;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class af {

    /* renamed from: a, reason: collision with root package name */
    private final k.k f55836a;

    /* renamed from: b, reason: collision with root package name */
    private ae f55837b;

    /* renamed from: c, reason: collision with root package name */
    private final List f55838c;

    public af(String str) {
        h.g.b.x.f(str, "boundary");
        k.k kVar = k.k.f50843a;
        this.f55836a = okhttp3.internal.publicsuffix.a.d(str);
        this.f55837b = ag.f55839a;
        this.f55838c = new ArrayList();
    }

    public final af a(z zVar, ao aoVar) {
        h.g.b.x.f(aoVar, TtmlNode.TAG_BODY);
        h.g.b.x.f(aoVar, TtmlNode.TAG_BODY);
        if (zVar.b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (zVar.b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        dx dxVar = new dx(zVar, aoVar);
        h.g.b.x.f(dxVar, "part");
        this.f55838c.add(dxVar);
        return this;
    }

    public final af b(ae aeVar) {
        h.g.b.x.f(aeVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        if (h.g.b.x.n(aeVar.a(), "multipart")) {
            this.f55837b = aeVar;
            return this;
        }
        Objects.toString(aeVar);
        throw new IllegalArgumentException("multipart != ".concat(String.valueOf(aeVar)));
    }

    public final ag c() {
        List list = this.f55838c;
        if (list.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new ag(this.f55836a, this.f55837b, okhttp3.internal.b.p(list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public af() {
        String string = UUID.randomUUID().toString();
        h.g.b.x.e(string, "toString(...)");
        this(string);
    }
}
