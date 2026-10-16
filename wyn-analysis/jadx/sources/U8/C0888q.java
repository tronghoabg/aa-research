package U8;

import org.apache.tika.mime.MimeTypesReaderMetKeys;

/* renamed from: U8.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0888q implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C0888q f12665a = new C0888q();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f12666b = h9.d.c("pc");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f12667c = h9.d.c("symbol");

    /* renamed from: d, reason: collision with root package name */
    public static final h9.d f12668d = h9.d.c("file");

    /* renamed from: e, reason: collision with root package name */
    public static final h9.d f12669e = h9.d.c(MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR);

    /* renamed from: f, reason: collision with root package name */
    public static final h9.d f12670f = h9.d.c("importance");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        Z z2 = (Z) ((B0) obj);
        fVar.add(f12666b, z2.f12500a);
        fVar.add(f12667c, z2.f12501b);
        fVar.add(f12668d, z2.f12502c);
        fVar.add(f12669e, z2.f12503d);
        fVar.add(f12670f, z2.f12504e);
    }
}
