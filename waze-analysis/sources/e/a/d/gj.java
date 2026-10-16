package e.a.d;

import j$.util.Objects;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gj extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gm f47027a;

    /* renamed from: b, reason: collision with root package name */
    private final List f47028b;

    /* renamed from: c, reason: collision with root package name */
    private kg f47029c;

    /* synthetic */ gj(gm gmVar) {
        Objects.requireNonNull(gmVar);
        this.f47027a = gmVar;
        this.f47028b = new ArrayList();
    }

    static /* bridge */ /* synthetic */ int a(gj gjVar) {
        Iterator it = gjVar.f47028b.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((kg) it.next()).a();
        }
        return iA;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        if (this.f47029c == null) {
            kg kgVarA = this.f47027a.f47038h.a(Math.max(4096, i3));
            this.f47029c = kgVarA;
            this.f47028b.add(kgVarA);
        }
        while (i3 > 0) {
            int iMin = Math.min(i3, this.f47029c.b());
            kg kgVar = this.f47029c;
            if (iMin == 0) {
                int iA = kgVar.a();
                kg kgVarA2 = this.f47027a.f47038h.a(Math.max(i3, iA + iA));
                this.f47029c = kgVarA2;
                this.f47028b.add(kgVarA2);
            } else {
                kgVar.d(bArr, i2, iMin);
                i2 += iMin;
                i3 -= iMin;
            }
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        kg kgVar = this.f47029c;
        byte b2 = (byte) i2;
        if (kgVar == null || kgVar.b() <= 0) {
            write(new byte[]{b2}, 0, 1);
        } else {
            kgVar.c(b2);
        }
    }
}
