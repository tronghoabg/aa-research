package defpackage;

import j$.time.Instant;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class vph implements vpi {
    private final boolean a;
    private final Instant b;
    private final /* synthetic */ int c;
    private final abnv d;

    private vph(abnv abnvVar, boolean z, Instant instant, int i) {
        this.c = i;
        this.d = abnvVar;
        this.a = z;
        this.b = instant;
    }

    public static vph c(ajhb ajhbVar) {
        Instant instant = Instant.EPOCH;
        abpt abptVar = ajhbVar.d;
        if (abptVar == null) {
            abptVar = abpt.a;
        }
        Instant instantAi = wox.ai(abptVar);
        boolean z = false;
        for (ajha ajhaVar : ajhbVar.c) {
            abnf abnfVar = ajhaVar.e;
            if (abnfVar == null) {
                abnfVar = abnf.a;
            }
            Instant instantPlus = instantAi.plus(wox.ah(abnfVar));
            abnf abnfVar2 = ajhaVar.f;
            if (abnfVar2 == null) {
                abnfVar2 = abnf.a;
            }
            Instant instantPlus2 = instantPlus.plus(wox.ah(abnfVar2));
            if (true == instantPlus2.isAfter(instant)) {
                instant = instantPlus2;
            }
            z |= !((ajhaVar.b & 16) != 0);
        }
        return new vph(ajhbVar, z, instant, 0);
    }

    public static vph d(ajfr ajfrVar) {
        Instant instant = Instant.EPOCH;
        abpt abptVar = ajfrVar.e;
        if (abptVar == null) {
            abptVar = abpt.a;
        }
        Instant instantAi = wox.ai(abptVar);
        HashSet hashSet = new HashSet();
        for (ajfv ajfvVar : ajfrVar.f) {
            abnf abnfVar = ajfvVar.d;
            if (abnfVar == null) {
                abnfVar = abnf.a;
            }
            Instant instantPlus = instantAi.plus(wox.ah(abnfVar));
            if (true == instantPlus.isAfter(instant)) {
                instant = instantPlus;
            }
            int i = ajfvVar.b;
            int i2 = i != 0 ? i != 3 ? i != 4 ? i != 5 ? 0 : 3 : 2 : 1 : 4;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                hashSet.add(Long.valueOf(ajfvVar.c));
            } else if (i3 == 1) {
                hashSet.remove(Long.valueOf(ajfvVar.c));
            }
        }
        return new vph(ajfrVar, !hashSet.isEmpty(), instant, 1);
    }

    @Override // defpackage.vpi
    public final long a() {
        int i = this.c;
        abnv abnvVar = this.d;
        return i != 0 ? abnvVar.e(null) : abnvVar.e(null);
    }

    @Override // defpackage.vpi
    public final /* synthetic */ Object b() {
        return this.d;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        if (this.c != 0) {
            vph vphVar = (vph) obj;
            boolean z = vphVar.a;
            boolean z2 = this.a;
            return z2 != z ? !z2 ? 1 : -1 : vphVar.b.compareTo(this.b);
        }
        vph vphVar2 = (vph) obj;
        boolean z3 = vphVar2.a;
        boolean z4 = this.a;
        return z4 != z3 ? !z4 ? 1 : -1 : vphVar2.b.compareTo(this.b);
    }
}
