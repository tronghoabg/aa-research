package j$.util.stream;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public class b4 extends c4 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f50340c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f50341d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(b4 b4Var, m2 m2Var, int i2) {
        super(b4Var, m2Var, i2);
        this.f50340c = 1;
        this.f50341d = (Object[]) b4Var.f50341d;
    }

    @Override // j$.util.stream.c4
    public final void a() {
        switch (this.f50340c) {
            case 0:
                ((l2) this.f50350a).c(this.f50351b, this.f50341d);
                break;
            default:
                this.f50350a.h((Object[]) this.f50341d, this.f50351b);
                break;
        }
    }

    @Override // j$.util.stream.c4
    public final c4 b(int i2, int i3) {
        switch (this.f50340c) {
            case 0:
                return new b4(this, ((l2) this.f50350a).a(i2), i3);
            default:
                return new b4(this, this.f50350a.a(i2), i3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(m2 m2Var, Object obj, int i2) {
        super(m2Var);
        this.f50340c = i2;
        this.f50341d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(b4 b4Var, l2 l2Var, int i2) {
        super(b4Var, l2Var, i2);
        this.f50340c = 0;
        this.f50341d = b4Var.f50341d;
    }
}
