package defpackage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class aebq {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public aebq(roj rojVar) throws qrz {
        this.c = new CopyOnWriteArrayList();
        this.a = -1;
        ljb ljbVar = new ljb(this, 2);
        this.d = ljbVar;
        this.b = rojVar;
        rojVar.f(ljbVar, 7, 0);
        qsf qsfVarA = rojVar.a(7);
        if (qsfVarA != null) {
            ljbVar.d(qsfVarA.a, qsfVarA.b, qsfVarA.c, qsfVarA.d);
        }
    }

    public final void a(boolean z, aebo aeboVar, ajmy ajmyVar, boolean z2) {
        ajmyVar.getClass();
        int iB = aeboVar.b();
        boolean zD = aeboVar.d();
        int i = (int) ajmyVar.b;
        if (zD || iB < i) {
            if (!zD && iB > 0) {
                aeboVar.c(ajmyVar, iB, false);
            }
            aeboVar.a.a(ajmyVar, (int) ajmyVar.b);
            aeboVar.d = z | aeboVar.d;
        } else {
            aeboVar.c(ajmyVar, i, z);
        }
        if (z2) {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [aecf, java.lang.Object] */
    public final void b() {
        try {
            this.c.c();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aebp, java.lang.Object] */
    public final void c() {
        ?? r0 = this.b;
        aebo[] aeboVarArrR = r0.r();
        Collections.shuffle(Arrays.asList(aeboVarArrR));
        int length = aeboVarArrR.length;
        int i = ((aebo) this.d).b;
        while (true) {
            int i2 = 0;
            if (length <= 0 || i <= 0) {
                break;
            }
            int iCeil = (int) Math.ceil(i / length);
            for (int i3 = 0; i3 < length && i > 0; i3++) {
                aebo aeboVar = aeboVarArrR[i3];
                int iMin = Math.min(i, Math.min(aeboVar.a(), iCeil));
                if (iMin > 0) {
                    aeboVar.c += iMin;
                    i -= iMin;
                }
                if (aeboVar.a() > 0) {
                    aeboVarArrR[i2] = aeboVar;
                    i2++;
                }
            }
            length = i2;
        }
        uk ukVar = new uk((short[]) null);
        for (aebo aeboVar2 : r0.r()) {
            aeboVar2.f(aeboVar2.c, ukVar);
            aeboVar2.c = 0;
        }
        if (ukVar.e()) {
            b();
        }
    }

    public final void d(aebo aeboVar, int i) {
        if (aeboVar == null) {
            ((aebo) this.d).e(i);
            c();
            return;
        }
        aeboVar.e(i);
        uk ukVar = new uk((short[]) null);
        aeboVar.f(aeboVar.b(), ukVar);
        if (ukVar.e()) {
            b();
        }
    }

    public aebq(aebp aebpVar, aecf aecfVar) {
        this.b = aebpVar;
        aecfVar.getClass();
        this.c = aecfVar;
        this.a = 65535;
        this.d = new aebo(this, 0, 65535, null);
    }
}
