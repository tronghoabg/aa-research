package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* loaded from: classes2.dex */
public final class bsu implements dnt {
    private final long b;
    private final dlg c;
    private final boi d;
    private final int e;
    private final afeg g;
    private final int f = 0;
    public final bwq a = new ParcelableSnapshotMutableState(new cla(roc.aA(0.5f, 0.5f)), bxp.c);

    public bsu(long j, dlg dlgVar, boi boiVar, int i, afeg afegVar) {
        this.b = j;
        this.c = dlgVar;
        this.d = boiVar;
        this.e = i;
        this.g = afegVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[LOOP:1: B:26:0x00ae->B:38:0x00e5, LOOP_START, PHI: r7
  0x00ae: PHI (r7v11 int) = (r7v1 int), (r7v16 int) binds: [B:25:0x00ac, B:38:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[EDGE_INSN: B:66:0x00e8->B:39:0x00e8 BREAK  A[LOOP:1: B:26:0x00ae->B:38:0x00e5]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    @Override // defpackage.dnt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(defpackage.dlp r22, long r23, defpackage.dlr r25, long r26) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsu.a(dlp, long, dlr, long):long");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsu)) {
            return false;
        }
        bsu bsuVar = (bsu) obj;
        if (!a.j(this.b, bsuVar.b) || !affa.f(this.c, bsuVar.c) || !affa.f(this.d, bsuVar.d) || this.e != bsuVar.e) {
            return false;
        }
        int i = bsuVar.f;
        return affa.f(this.g, bsuVar.g);
    }

    public final int hashCode() {
        return (((((((a.g(this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e) * 961) + this.g.hashCode();
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + dlk.a(this.b) + ", density=" + this.c + ", dropdownMenuAnchorPosition=" + this.d + ", verticalMargin=" + this.e + ", horizontalMargin=0, onPositionCalculated=" + this.g + ")";
    }
}
