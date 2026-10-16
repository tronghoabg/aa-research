package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class adwq {
    public aeag b;
    public int c;
    public final aeah g;
    public final adzv h;
    public boolean i;
    public int j;
    public long l;
    private final adwp m;
    public int a = -1;
    public adje d = adjc.a;
    public final adwo e = new adwo(this);
    public final ByteBuffer f = ByteBuffer.allocate(5);
    public int k = -1;

    public adwq(adwp adwpVar, aeah aeahVar, adzv adzvVar) {
        this.m = adwpVar;
        this.g = aeahVar;
        this.h = adzvVar;
    }

    public final void a(boolean z, boolean z2) {
        aeag aeagVar = this.b;
        this.b = null;
        this.m.u(aeagVar, z, z2, this.j);
        this.j = 0;
    }

    public final void b(adwn adwnVar, boolean z) {
        List list = adwnVar.a;
        Iterator it = list.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((aeag) it.next()).a();
        }
        int i = this.a;
        if (i >= 0 && iA > i) {
            throw new adnt(adnq.i.e(String.format(Locale.US, "message too large %d > %d", Integer.valueOf(iA), Integer.valueOf(this.a))), null);
        }
        ByteBuffer byteBuffer = this.f;
        byteBuffer.clear();
        byteBuffer.put(z ? (byte) 1 : (byte) 0).putInt(iA);
        aeag aeagVarA = this.g.a(5);
        aeagVarA.d(byteBuffer.array(), 0, byteBuffer.position());
        if (iA == 0) {
            this.b = aeagVarA;
            return;
        }
        adwp adwpVar = this.m;
        adwpVar.u(aeagVarA, false, false, this.j - 1);
        this.j = 1;
        for (int i2 = 0; i2 < list.size() - 1; i2++) {
            adwpVar.u((aeag) list.get(i2), false, false, 0);
        }
        this.b = (aeag) list.get(list.size() - 1);
        this.l = iA;
    }

    public final void c(byte[] bArr, int i, int i2) {
        while (i2 > 0) {
            aeag aeagVar = this.b;
            if (aeagVar != null && aeagVar.b() == 0) {
                a(false, false);
            }
            if (this.b == null) {
                woy.aa(this.c > 0, "knownLengthPendingAllocation reached 0");
                aeag aeagVarA = this.g.a(this.c);
                this.b = aeagVarA;
                int i3 = this.c;
                this.c = i3 - Math.min(i3, aeagVarA.b());
            }
            int iMin = Math.min(i2, this.b.b());
            this.b.d(bArr, i, iMin);
            i += iMin;
            i2 -= iMin;
        }
    }
}
