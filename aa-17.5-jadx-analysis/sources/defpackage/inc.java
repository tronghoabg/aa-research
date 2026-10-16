package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class inc {
    private static final yph b = yph.c("CAR.CAM.SPT");
    private final yfs c;
    private final yfs d;
    private final ygu e;
    private final String g;
    final ymf a = new yez(null);
    private final Set f = new HashSet();

    public inc(yfs yfsVar, yfs yfsVar2, ygu yguVar, String str) {
        this.c = yfsVar;
        this.d = yfsVar2;
        this.e = yguVar;
        this.g = str;
    }

    private final synchronized yfs d(int i) {
        Set set = this.f;
        Integer numValueOf = Integer.valueOf(i);
        if (set.contains(numValueOf)) {
            return this.d;
        }
        set.add(numValueOf);
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void a(int i) {
        yfs yfsVarD = d(i);
        Integer numValueOf = Integer.valueOf(i);
        if (yfsVarD.s(numValueOf)) {
            yfq yfqVarC = yfsVarD.c(numValueOf);
            int size = yfqVarC.size();
            for (int i2 = 0; i2 < size; i2++) {
                tfk.a.b((tfj) yfqVarC.get(i2));
            }
            this.a.D(Integer.valueOf(i), yfqVarC);
        }
    }

    public final synchronized void b(int i, boolean z) {
        ymf ymfVar = this.a;
        Integer numValueOf = Integer.valueOf(i);
        if (ymfVar.s(numValueOf)) {
            for (tfj tfjVar : ymfVar.c(numValueOf)) {
                ((ype) b.l().ai(594)).N("Stopping remaining sub-phase timer: %s, successful completion: %s", tfjVar.name(), z);
                int i2 = 1;
                if (true != z) {
                    i2 = 2;
                }
                tfk.a.d(tfjVar, i2);
            }
            ymfVar.E(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c(int i, int i2) {
        ygu yguVar = this.e;
        Integer numValueOf = Integer.valueOf(i2);
        if (yguVar.s(numValueOf)) {
            ymf ymfVar = this.a;
            Integer numValueOf2 = Integer.valueOf(i);
            if (!ymfVar.s(numValueOf2)) {
                ((ype) ((ype) b.h()).ai(596)).D("No timer for super-phase:%s, component:%s is currently running. Ignoring stopping it", i, this.g);
                return;
            }
            ygr ygrVarC = yguVar.c(numValueOf);
            Set setC = ymfVar.c(numValueOf2);
            yno it = ygrVarC.iterator();
            while (it.hasNext()) {
                tfj tfjVar = (tfj) it.next();
                if (setC.contains(tfjVar)) {
                    ((ype) ((ype) b.f()).ai((char) 595)).y("Stopping subphase timer: %s", tfjVar.name());
                    setC.remove(tfjVar);
                    tfk.a.d(tfjVar, 1);
                }
            }
        }
    }
}
