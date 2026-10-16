package T8;

import java.io.IOException;
import za.C4658a;

/* loaded from: classes4.dex */
public final class e implements j {

    /* renamed from: c, reason: collision with root package name */
    public static final C4658a f11790c = new C4658a(26);

    /* renamed from: a, reason: collision with root package name */
    public final Object f11791a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11792b;

    public e(X8.c cVar) {
        this.f11791a = cVar;
        this.f11792b = f11790c;
    }

    @Override // T8.j
    public void a(i iVar, int i5) throws IOException {
        int[] iArr = (int[]) this.f11792b;
        try {
            iVar.read((byte[]) this.f11791a, iArr[0], i5);
            iArr[0] = iArr[0] + i5;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f11791a = bArr;
        this.f11792b = iArr;
    }
}
