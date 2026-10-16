package com.vungle.ads.internal.model;

import Wf.C1241c;
import Wf.C1244d0;
import Wf.J;
import android.util.Base64;
import com.applovin.shadow.okio.Segment;
import com.moloco.sdk.internal.publisher.H;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* renamed from: a, reason: collision with root package name */
    public final Integer f33278a;

    /* renamed from: b, reason: collision with root package name */
    public final String f33279b;

    /* renamed from: c, reason: collision with root package name */
    public final List f33280c;

    /* renamed from: d, reason: collision with root package name */
    public final Xf.c f33281d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f33282e;

    public p0(int i5, Integer num, String str, List list, h0 h0Var) {
        String strB;
        h0 h0Var2 = null;
        if ((i5 & 1) == 0) {
            this.f33278a = null;
        } else {
            this.f33278a = num;
        }
        if ((i5 & 2) == 0) {
            this.f33279b = null;
        } else {
            this.f33279b = str;
        }
        if ((i5 & 4) == 0) {
            this.f33280c = null;
        } else {
            this.f33280c = list;
        }
        Xf.o oVarA = Fe.e.a(n0.f33263a);
        this.f33281d = oVarA;
        if ((i5 & 8) != 0) {
            this.f33282e = h0Var;
            return;
        }
        if (this.f33279b != null && (strB = b()) != null) {
            h0Var2 = (h0) oVarA.a(strB, H.n0(oVarA.f16253b, kotlin.jvm.internal.H.b(h0.class)));
        }
        this.f33282e = h0Var2;
    }

    public static final void a(p0 self, Vf.b output, C1244d0 serialDesc) {
        h0 h0Var;
        String strB;
        AbstractC3340k.e(self, "self");
        AbstractC3340k.e(output, "output");
        AbstractC3340k.e(serialDesc, "serialDesc");
        if (output.A(serialDesc, 0) || self.f33278a != null) {
            output.i(serialDesc, 0, J.f15549a, self.f33278a);
        }
        if (output.A(serialDesc, 1) || self.f33279b != null) {
            output.i(serialDesc, 1, Wf.q0.f15625a, self.f33279b);
        }
        if (output.A(serialDesc, 2) || self.f33280c != null) {
            output.i(serialDesc, 2, new C1241c(Wf.q0.f15625a, 0), self.f33280c);
        }
        if (!output.A(serialDesc, 3)) {
            h0 h0Var2 = self.f33282e;
            if (self.f33279b == null || (strB = self.b()) == null) {
                h0Var = null;
            } else {
                Xf.c cVar = self.f33281d;
                h0Var = (h0) cVar.a(strB, H.n0(cVar.f16253b, kotlin.jvm.internal.H.b(h0.class)));
            }
            if (AbstractC3340k.a(h0Var2, h0Var)) {
                return;
            }
        }
        output.i(serialDesc, 3, c.f33135a, self.f33282e);
    }

    public final String b() throws IOException {
        byte[] bArrDecode = Base64.decode(this.f33279b, 0);
        if (bArrDecode == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrDecode);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream, Segment.SHARE_MINIMUM);
            try {
                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
                while (true) {
                    int i5 = gZIPInputStream.read(bArr);
                    if (i5 == -1) {
                        gZIPInputStream.close();
                        byteArrayInputStream.close();
                        String string = byteArrayOutputStream.toString();
                        AbstractC3340k.d(string, "result.toString()");
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i5);
                }
            } finally {
            }
        } finally {
        }
    }

    public final Integer c() {
        return this.f33278a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return AbstractC3340k.a(this.f33278a, p0Var.f33278a) && AbstractC3340k.a(this.f33279b, p0Var.f33279b) && AbstractC3340k.a(this.f33280c, p0Var.f33280c);
    }

    public final int hashCode() {
        Integer num = this.f33278a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f33279b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f33280c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("BidPayload(version=");
        sbA.append(this.f33278a);
        sbA.append(", adunit=");
        sbA.append(this.f33279b);
        sbA.append(", impression=");
        sbA.append(this.f33280c);
        sbA.append(')');
        return sbA.toString();
    }

    public final h0 a() {
        return this.f33282e;
    }
}
