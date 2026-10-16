package kotlinx.b.d.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u implements kotlinx.b.e.g {

    /* renamed from: a, reason: collision with root package name */
    private final String f51176a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f51177b;

    public u(kotlinx.b.d.h hVar) {
        h.g.b.x.f(hVar, "configuration");
        this.f51176a = hVar.a();
        this.f51177b = hVar.c() != kotlinx.b.d.a.f51104a;
    }

    @Override // kotlinx.b.e.g
    public final void a(h.l.c cVar, h.g.a.l lVar) {
        h.g.b.x.f(cVar, "kClass");
        h.g.b.x.f(lVar, "provider");
    }

    @Override // kotlinx.b.e.g
    public final /* synthetic */ void b(h.l.c cVar, kotlinx.b.b bVar) {
        h.g.b.x.f(cVar, "kClass");
        h.g.b.x.f(bVar, "serializer");
        a(cVar, new com.waze.uid.b(bVar, 13));
    }

    @Override // kotlinx.b.e.g
    public final void c(h.l.c cVar, h.l.c cVar2, kotlinx.b.b bVar) {
        h.g.b.x.f(cVar, "baseClass");
        h.g.b.x.f(cVar2, "actualClass");
        h.g.b.x.f(bVar, "actualSerializer");
        kotlinx.b.a.q descriptor = bVar.getDescriptor();
        kotlinx.b.a.x xVarH = descriptor.h();
        if ((xVarH instanceof kotlinx.b.a.f) || h.g.b.x.n(xVarH, kotlinx.b.a.v.f50938a)) {
            throw new IllegalArgumentException("Serializer for " + cVar2.c() + " can't be registered as a subclass for polymorphic serialization because its kind " + xVarH + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        if (this.f51177b) {
            if (h.g.b.x.n(xVarH, kotlinx.b.a.z.f50941a) || h.g.b.x.n(xVarH, kotlinx.b.a.aa.f50902a) || (xVarH instanceof kotlinx.b.a.p) || (xVarH instanceof kotlinx.b.a.w)) {
                throw new IllegalArgumentException("Serializer for " + cVar2.c() + " of kind " + xVarH + " cannot be serialized polymorphically with class discriminator.");
            }
            int iB = descriptor.b();
            for (int i2 = 0; i2 < iB; i2++) {
                String strC = descriptor.c(i2);
                if (h.g.b.x.n(strC, this.f51176a)) {
                    throw new IllegalArgumentException("Polymorphic serializer for " + cVar2 + " has property '" + strC + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                }
            }
        }
    }

    @Override // kotlinx.b.e.g
    public final void d(h.l.c cVar, h.g.a.l lVar) {
        h.g.b.x.f(cVar, "baseClass");
        h.g.b.x.f(lVar, "defaultDeserializerProvider");
    }

    @Override // kotlinx.b.e.g
    public final void e(h.l.c cVar, h.g.a.l lVar) {
        h.g.b.x.f(cVar, "baseClass");
        h.g.b.x.f(lVar, "defaultSerializerProvider");
    }
}
