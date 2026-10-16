package U8;

import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;

/* renamed from: U8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0860c implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0860c f12528a = new C0860c();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12529b = h9.d.c(ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR);

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12530c = h9.d.c(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        G g9 = (G) ((s0) obj);
        fVar.add(f12529b, g9.f12399a);
        fVar.add(f12530c, g9.f12400b);
    }
}
