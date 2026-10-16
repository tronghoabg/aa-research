package I4;

import java.io.File;

/* renamed from: I4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5328a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5329b;

    public /* synthetic */ C0618c(Object obj, int i5) {
        this.f5328a = i5;
        this.f5329b = obj;
    }

    @Override // I4.p
    public final boolean a(Object obj) {
        switch (this.f5328a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        switch (this.f5328a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new o(new X4.b(bArr), new k(1, bArr, (z) this.f5329b));
            case 1:
                return new o(new X4.b(obj), new D4.b(1, obj.toString(), (z) this.f5329b));
            default:
                File file = (File) obj;
                return new o(new X4.b(file), new D4.b(2, file, (z) this.f5329b));
        }
    }
}
