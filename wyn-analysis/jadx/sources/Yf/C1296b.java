package Yf;

import kotlin.jvm.internal.AbstractC3340k;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.apache.tika.fork.ForkServer;
import za.C4658a;

/* renamed from: Yf.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1296b extends com.moloco.sdk.internal.publisher.H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16847b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f16848c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f16849d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f16850e;

    public C1296b(u uVar, String str) {
        this.f16848c = uVar;
        this.f16849d = str;
        this.f16850e = uVar.f16878b.f16253b;
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public void C(int i5) {
        switch (this.f16847b) {
            case 1:
                z0(Long.toString(i5 & 4294967295L, 10));
                break;
            default:
                super.C(i5);
                break;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public void F(String value) {
        switch (this.f16847b) {
            case 0:
                AbstractC3340k.e(value, "value");
                this.f16848c.N(this.f16849d, new Xf.p(value, false, (SerialDescriptor) this.f16850e));
                break;
            default:
                super.F(value);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final C4658a a() {
        switch (this.f16847b) {
            case 0:
                return this.f16848c.f16878b.f16253b;
            default:
                return (C4658a) this.f16850e;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public void g(byte b5) {
        switch (this.f16847b) {
            case 1:
                z0(String.valueOf(b5 & ForkServer.ERROR));
                break;
            default:
                super.g(b5);
                break;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public void o(long j8) {
        String str;
        switch (this.f16847b) {
            case 1:
                if (j8 == 0) {
                    str = "0";
                } else if (j8 > 0) {
                    str = Long.toString(j8, 10);
                } else {
                    char[] cArr = new char[64];
                    long j10 = (j8 >>> 1) / 5;
                    long j11 = 10;
                    int i5 = 63;
                    cArr[63] = Character.forDigit((int) (j8 - (j10 * j11)), 10);
                    while (j10 > 0) {
                        i5--;
                        cArr[i5] = Character.forDigit((int) (j10 % j11), 10);
                        j10 /= j11;
                    }
                    str = new String(cArr, i5, 64 - i5);
                }
                z0(str);
                break;
            default:
                super.o(j8);
                break;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.H, kotlinx.serialization.encoding.Encoder
    public void q(short s10) {
        switch (this.f16847b) {
            case 1:
                z0(String.valueOf(s10 & 65535));
                break;
            default:
                super.q(s10);
                break;
        }
    }

    public void z0(String s10) {
        AbstractC3340k.e(s10, "s");
        this.f16848c.N(this.f16849d, new Xf.p(s10, false, null));
    }

    public C1296b(u uVar, String str, SerialDescriptor serialDescriptor) {
        this.f16848c = uVar;
        this.f16849d = str;
        this.f16850e = serialDescriptor;
    }
}
