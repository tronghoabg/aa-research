package e.a.b.a;

import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    final InputStream f46432a = null;

    /* renamed from: b, reason: collision with root package name */
    final byte[] f46433b;

    /* renamed from: c, reason: collision with root package name */
    final int f46434c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f46435d;

    q(byte[] bArr, int i2, boolean z) {
        this.f46433b = bArr;
        this.f46434c = i2;
        this.f46435d = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransactionData[");
        sb.append(this.f46434c);
        sb.append("b array");
        sb.append(true != this.f46435d ? "]" : "(last)]");
        return sb.toString();
    }
}
