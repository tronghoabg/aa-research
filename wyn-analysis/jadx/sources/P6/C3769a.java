package p6;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import h6.AbstractC2786e;
import java.util.List;
import k8.AbstractC3198g;
import org.apache.tika.fork.ForkServer;
import u6.v;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3769a extends AbstractC2786e {

    /* renamed from: m, reason: collision with root package name */
    public final Y4.b f43254m = new Y4.b();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f43255n;

    /* renamed from: o, reason: collision with root package name */
    public final int f43256o;

    /* renamed from: p, reason: collision with root package name */
    public final int f43257p;

    /* renamed from: q, reason: collision with root package name */
    public final String f43258q;

    /* renamed from: r, reason: collision with root package name */
    public final float f43259r;

    /* renamed from: s, reason: collision with root package name */
    public final int f43260s;

    public C3769a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f43256o = 0;
            this.f43257p = -1;
            this.f43258q = "sans-serif";
            this.f43255n = false;
            this.f43259r = 0.85f;
            this.f43260s = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f43256o = bArr[24];
        this.f43257p = ((bArr[26] & ForkServer.ERROR) << 24) | ((bArr[27] & ForkServer.ERROR) << 16) | ((bArr[28] & ForkServer.ERROR) << 8) | (bArr[29] & ForkServer.ERROR);
        this.f43258q = "Serif".equals(new String(bArr, 43, bArr.length - 43, AbstractC3198g.f39301c)) ? "serif" : "sans-serif";
        int i5 = bArr[25] * 20;
        this.f43260s = i5;
        boolean z2 = (bArr[0] & 32) != 0;
        this.f43255n = z2;
        if (z2) {
            this.f43259r = v.g(((bArr[11] & ForkServer.ERROR) | ((bArr[10] & ForkServer.ERROR) << 8)) / i5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.95f);
        } else {
            this.f43259r = 0.85f;
        }
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i5, int i10, int i11, int i12, int i13) {
        if (i5 != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i5 >>> 8) | ((i5 & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, int i5, int i10, int i11, int i12, int i13) {
        if (i5 != i10) {
            int i14 = i13 | 33;
            boolean z2 = (i5 & 1) != 0;
            boolean z10 = (i5 & 2) != 0;
            if (z2) {
                if (z10) {
                    N0.a.m(3, spannableStringBuilder, i11, i12, i14);
                } else {
                    N0.a.m(1, spannableStringBuilder, i11, i12, i14);
                }
            } else if (z10) {
                N0.a.m(2, spannableStringBuilder, i11, i12, i14);
            }
            boolean z11 = (i5 & 4) != 0;
            if (z11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            }
            if (z11 || z2 || z10) {
                return;
            }
            N0.a.m(0, spannableStringBuilder, i11, i12, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    @Override // h6.AbstractC2786e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final h6.InterfaceC2787f e(byte[] r21, int r22, boolean r23) throws h6.C2789h {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p6.C3769a.e(byte[], int, boolean):h6.f");
    }
}
