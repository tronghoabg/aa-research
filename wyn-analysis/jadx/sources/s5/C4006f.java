package s5;

/* renamed from: s5.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4006f implements h9.e {

    /* renamed from: a, reason: collision with root package name */
    public static final C4006f f44986a = new C4006f();

    /* renamed from: b, reason: collision with root package name */
    public static final h9.d f44987b = h9.d.c("clearBlob");

    /* renamed from: c, reason: collision with root package name */
    public static final h9.d f44988c = h9.d.c("encryptedBlob");

    @Override // h9.InterfaceC2794a
    public final void encode(Object obj, Object obj2) {
        h9.f fVar = (h9.f) obj2;
        q qVar = (q) ((AbstractC3997C) obj);
        fVar.add(f44987b, qVar.f45029a);
        fVar.add(f44988c, qVar.f45030b);
    }
}
