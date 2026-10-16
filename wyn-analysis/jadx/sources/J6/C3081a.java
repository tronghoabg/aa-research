package j6;

import h6.AbstractC2786e;
import java.util.List;
import org.apache.tika.fork.ForkServer;

/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3081a extends AbstractC2786e {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f38634m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f38635n;

    public C3081a(List list) {
        this.f38634m = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        this.f38635n = new C3087g(((bArr[0] & ForkServer.ERROR) << 8) | (bArr[1] & ForkServer.ERROR), (bArr[3] & ForkServer.ERROR) | ((bArr[2] & ForkServer.ERROR) << 8));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    @Override // h6.AbstractC2786e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h6.InterfaceC2787f e(byte[] r36, int r37, boolean r38) throws h6.C2789h {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.C3081a.e(byte[], int, boolean):h6.f");
    }

    public C3081a() {
        this.f38634m = 1;
        this.f38635n = new Y4.b();
    }
}
