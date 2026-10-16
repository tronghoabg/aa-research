package Ag;

import cg.C1618g;
import hb.r;
import hb.y;
import java.io.EOFException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import zg.InterfaceC4671j;

/* loaded from: classes5.dex */
public final class b implements InterfaceC4671j {

    /* renamed from: b, reason: collision with root package name */
    public static final MediaType f1344b;

    /* renamed from: a, reason: collision with root package name */
    public final r f1345a;

    static {
        MediaType.f42292d.getClass();
        f1344b = MediaType.Companion.a("application/json; charset=UTF-8");
    }

    public b(r rVar) {
        this.f1345a = rVar;
    }

    @Override // zg.InterfaceC4671j
    public final Object convert(Object obj) throws EOFException {
        C1618g c1618g = new C1618g();
        this.f1345a.toJson(new y(c1618g), obj);
        return RequestBody.create(f1344b, c1618g.z(c1618g.f19902b));
    }
}
