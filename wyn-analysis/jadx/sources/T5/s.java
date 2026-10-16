package T5;

import U1.P;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11685a;

    /* renamed from: b, reason: collision with root package name */
    public int f11686b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11687c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11688d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11689e;

    /* renamed from: f, reason: collision with root package name */
    public int f11690f;

    public s(int i5, int i10) {
        this.f11685a = i10;
        switch (i10) {
            case 1:
                this.f11686b = i5;
                byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
                this.f11689e = bArr;
                bArr[2] = 1;
                break;
            default:
                this.f11686b = i5;
                byte[] bArr2 = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
                this.f11689e = bArr2;
                bArr2[2] = 1;
                break;
        }
    }

    public void a(int i5, int i10, byte[] bArr) {
        switch (this.f11685a) {
            case 0:
                if (this.f11687c) {
                    int i11 = i10 - i5;
                    byte[] bArr2 = (byte[]) this.f11689e;
                    int length = bArr2.length;
                    int i12 = this.f11690f;
                    if (length < i12 + i11) {
                        this.f11689e = Arrays.copyOf(bArr2, (i12 + i11) * 2);
                    }
                    System.arraycopy(bArr, i5, (byte[]) this.f11689e, this.f11690f, i11);
                    this.f11690f += i11;
                    break;
                }
                break;
            default:
                if (this.f11687c) {
                    int i13 = i10 - i5;
                    byte[] bArr3 = (byte[]) this.f11689e;
                    int length2 = bArr3.length;
                    int i14 = this.f11690f;
                    if (length2 < i14 + i13) {
                        this.f11689e = Arrays.copyOf(bArr3, (i14 + i13) * 2);
                    }
                    System.arraycopy(bArr, i5, (byte[]) this.f11689e, this.f11690f, i13);
                    this.f11690f += i13;
                    break;
                }
                break;
        }
    }

    public boolean b(int i5) {
        switch (this.f11685a) {
            case 0:
                if (this.f11687c) {
                    this.f11690f -= i5;
                    this.f11687c = false;
                    this.f11688d = true;
                    break;
                }
                break;
            default:
                if (this.f11687c) {
                    this.f11690f -= i5;
                    this.f11687c = false;
                    this.f11688d = true;
                    break;
                }
                break;
        }
        return true;
    }

    public void c(int i5) {
        this.f11687c |= i5 > 0;
        this.f11686b += i5;
    }

    public void d() {
        switch (this.f11685a) {
            case 0:
                this.f11687c = false;
                this.f11688d = false;
                break;
            default:
                this.f11687c = false;
                this.f11688d = false;
                break;
        }
    }

    public void e(int i5) {
        switch (this.f11685a) {
            case 0:
                AbstractC4256a.i(!this.f11687c);
                boolean z2 = i5 == this.f11686b;
                this.f11687c = z2;
                if (z2) {
                    this.f11690f = 3;
                    this.f11688d = false;
                    break;
                }
                break;
            default:
                Q1.k.g(!this.f11687c);
                boolean z10 = i5 == this.f11686b;
                this.f11687c = z10;
                if (z10) {
                    this.f11690f = 3;
                    this.f11688d = false;
                    break;
                }
                break;
        }
    }

    public s(P p10) {
        this.f11685a = 2;
        this.f11689e = p10;
    }
}
