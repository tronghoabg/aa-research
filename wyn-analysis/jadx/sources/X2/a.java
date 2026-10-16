package X2;

import N1.B;
import P2.l;
import Q1.o;
import Q1.x;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final o f16026a;

    public a(int i5) {
        switch (i5) {
            case 1:
                this.f16026a = new o(10);
                break;
            default:
                this.f16026a = new o();
                break;
        }
    }

    @Override // P2.l
    public void E(byte[] bArr, int i5, int i10, P2.k kVar, Q1.c cVar) {
        P1.b bVarA;
        o oVar = this.f16026a;
        oVar.E(i5 + i10, bArr);
        oVar.G(i5);
        ArrayList arrayList = new ArrayList();
        while (oVar.a() > 0) {
            Q1.k.b("Incomplete Mp4Webvtt Top Level box header found.", oVar.a() >= 8);
            int iH = oVar.h();
            if (oVar.h() == 1987343459) {
                int i11 = iH - 8;
                CharSequence charSequenceF = null;
                P1.a aVarA = null;
                while (i11 > 0) {
                    Q1.k.b("Incomplete vtt cue box header found.", i11 >= 8);
                    int iH2 = oVar.h();
                    int iH3 = oVar.h();
                    int i12 = iH2 - 8;
                    byte[] bArr2 = oVar.f9702a;
                    int i13 = oVar.f9703b;
                    int i14 = x.f9724a;
                    String str = new String(bArr2, i13, i12, StandardCharsets.UTF_8);
                    oVar.H(i12);
                    i11 = (i11 - 8) - i12;
                    if (iH3 == 1937011815) {
                        h hVar = new h();
                        i.e(str, hVar);
                        aVarA = hVar.a();
                    } else if (iH3 == 1885436268) {
                        charSequenceF = i.f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (aVarA != null) {
                    aVarA.f8985a = charSequenceF;
                    bVarA = aVarA.a();
                } else {
                    Pattern pattern = i.f16069a;
                    h hVar2 = new h();
                    hVar2.f16061c = charSequenceF;
                    bVarA = hVar2.a().a();
                }
                arrayList.add(bVarA);
            } else {
                oVar.H(iH - 8);
            }
        }
        cVar.accept(new P2.a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // P2.l
    public /* synthetic */ P2.d H(int i5, int i10, byte[] bArr) {
        return N0.a.a(this, bArr, i10);
    }

    @Override // P2.l
    public int P() {
        return 2;
    }

    public B a(s2.j jVar, G2.g gVar) throws EOFException, InterruptedIOException {
        o oVar = this.f16026a;
        B bO = null;
        int i5 = 0;
        while (true) {
            try {
                jVar.c(oVar.f9702a, 0, 10, false);
                oVar.G(0);
                if (oVar.x() != 4801587) {
                    break;
                }
                oVar.H(3);
                int iT = oVar.t();
                int i10 = iT + 10;
                if (bO == null) {
                    byte[] bArr = new byte[i10];
                    System.arraycopy(oVar.f9702a, 0, bArr, 0, 10);
                    jVar.c(bArr, 10, iT, false);
                    bO = new G2.i(gVar).O(i10, bArr);
                } else {
                    jVar.b(iT, false);
                }
                i5 += i10;
            } catch (EOFException unused) {
            }
        }
        jVar.f44900f = 0;
        jVar.b(i5, false);
        return bO;
    }

    @Override // P2.l
    public /* synthetic */ void reset() {
    }
}
