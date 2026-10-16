package I4;

import java.io.File;

/* loaded from: classes.dex */
public final class A implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final A f5319b = new A(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5320a;

    public /* synthetic */ A(int i5) {
        this.f5320a = i5;
    }

    @Override // I4.p
    public final boolean a(Object obj) {
        switch (this.f5320a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        switch (this.f5320a) {
            case 0:
                return new o(new X4.b(obj), new C0619d(obj, 1));
            case 1:
                File file = (File) obj;
                return new o(new X4.b(file), new C0619d(file, 0));
            default:
                return null;
        }
    }
}
