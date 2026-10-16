package hb;

/* renamed from: hb.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2813p extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36344a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f36345b;

    public /* synthetic */ C2813p(r rVar, int i5) {
        this.f36344a = i5;
        this.f36345b = rVar;
    }

    @Override // hb.r
    public final Object fromJson(w wVar) {
        switch (this.f36344a) {
            case 0:
                return this.f36345b.fromJson(wVar);
            case 1:
                boolean z2 = wVar.f36362e;
                wVar.f36362e = true;
                try {
                    return this.f36345b.fromJson(wVar);
                } finally {
                    wVar.f36362e = z2;
                }
            default:
                boolean z10 = wVar.f36363f;
                wVar.f36363f = true;
                try {
                    return this.f36345b.fromJson(wVar);
                } finally {
                    wVar.f36363f = z10;
                }
        }
    }

    @Override // hb.r
    public final boolean isLenient() {
        switch (this.f36344a) {
        }
        return this.f36345b.isLenient();
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) {
        switch (this.f36344a) {
            case 0:
                boolean z2 = abstractC2797C.f36239g;
                abstractC2797C.f36239g = true;
                try {
                    this.f36345b.toJson(abstractC2797C, obj);
                    return;
                } finally {
                    abstractC2797C.f36239g = z2;
                }
            case 1:
                boolean z10 = abstractC2797C.f36238f;
                abstractC2797C.f36238f = true;
                try {
                    this.f36345b.toJson(abstractC2797C, obj);
                    return;
                } finally {
                    abstractC2797C.f36238f = z10;
                }
            default:
                this.f36345b.toJson(abstractC2797C, obj);
                return;
        }
    }

    public final String toString() {
        switch (this.f36344a) {
            case 0:
                return this.f36345b + ".serializeNulls()";
            case 1:
                return this.f36345b + ".lenient()";
            default:
                return this.f36345b + ".failOnUnknown()";
        }
    }
}
