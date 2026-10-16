package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wci {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public wci() {
        this.a = new AtomicBoolean(false);
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
    }

    public static wce a(String str, String str2, byte[] bArr) {
        if (str == null || bArr == null) {
            return null;
        }
        byte[][] bArr2 = ExperimentTokens.a;
        return new wce(new ExperimentTokens(str, bArr, bArr2, bArr2, bArr2, bArr2, null, null, null, null), str2);
    }

    public static final ygr b(String str, AtomicReference atomicReference) {
        if (str == null || atomicReference == null) {
            return yly.a;
        }
        ygp ygpVar = new ygp();
        Object obj = atomicReference.get();
        if (obj instanceof wch) {
            int i = wch.b;
            ((wch) obj).a(str, ygpVar);
        } else {
            for (wch wchVar : (wch[]) obj) {
                int i2 = wch.b;
                wchVar.a(str, ygpVar);
            }
        }
        return ygpVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(defpackage.shr r20, defpackage.xyc r21, defpackage.xwx r22) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wci.c(shr, xyc, xwx):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [aezk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [aezk, java.lang.Object] */
    public final vry d(Executor executor, ackk ackkVar, aezk aezkVar) {
        vrw vrwVar = (vrw) this.d.a();
        vrwVar.getClass();
        vll vllVar = (vll) this.a.a();
        vllVar.getClass();
        Object objA = this.e.a();
        executor.getClass();
        ackkVar.getClass();
        ?? r6 = this.b;
        return new vry(vrwVar, this.c, vllVar, (rdx) objA, r6, executor, ackkVar, aezkVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [bym, din, java.lang.Object] */
    public final bym e(final dik dikVar) {
        afec afecVar = new afec() { // from class: dht
            /* JADX WARN: Removed duplicated region for block: B:142:0x0246  */
            /* JADX WARN: Removed duplicated region for block: B:208:0x035b  */
            /* JADX WARN: Removed duplicated region for block: B:209:0x0361  */
            /* JADX WARN: Removed duplicated region for block: B:227:0x03b4  */
            /* JADX WARN: Removed duplicated region for block: B:228:0x03b6  */
            /* JADX WARN: Removed duplicated region for block: B:246:0x034a A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r0v1, types: [afec, java.lang.Object] */
            @Override // defpackage.afec
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r18) {
                /*
                    Method dump skipped, instructions count: 959
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dht.invoke(java.lang.Object):java.lang.Object");
            }
        };
        Object obj = this.a;
        fbf fbfVar = (fbf) obj;
        synchronized (fbfVar.a) {
            Object obj2 = ((fbf) obj).b;
            din dinVar = (din) ((zu) obj2).b(dikVar);
            if (dinVar != null) {
                if (dinVar.b()) {
                    return dinVar;
                }
            }
            try {
                ?? Invoke = afecVar.invoke(new bee(obj, dikVar, 19));
                synchronized (fbfVar.a) {
                    Object obj3 = ((fbf) obj).b;
                    if (((zu) obj3).b(dikVar) == null && Invoke.b()) {
                        ((zu) obj3).c(dikVar, Invoke);
                    }
                }
                return Invoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final bym f(dhs dhsVar, die dieVar, int i, int i2) {
        int i3 = ((dhh) this.e).a;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            dieVar = new die(afpt.g(dieVar.o + i3, 1, 1000));
        }
        return e(new dik(dhsVar, dieVar, i, i2));
    }

    public wci(String str, yzz yzzVar, yzy yzyVar, String str2, Object... objArr) {
        this.e = str;
        this.d = yzzVar;
        this.b = yzyVar;
        this.c = str2;
        this.a = objArr;
    }

    public wci(lds ldsVar, dhh dhhVar, fbf fbfVar, dhw dhwVar) {
        this.c = ldsVar;
        this.e = dhhVar;
        this.a = fbfVar;
        this.d = dhwVar;
        this.b = new daz(this, 8);
    }

    public wci(aezk aezkVar, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4, aezk aezkVar5) {
        this.d = aezkVar;
        this.c = aezkVar2;
        this.a = aezkVar3;
        this.e = aezkVar4;
        this.b = aezkVar5;
    }

    public wci(afeg afegVar, aitm aitmVar, ehi ehiVar, afco afcoVar, fdf fdfVar) {
        afcoVar.getClass();
        this.a = afegVar;
        this.b = aitmVar;
        this.c = ehiVar;
        this.d = afcoVar;
        this.e = fdfVar;
    }
}
