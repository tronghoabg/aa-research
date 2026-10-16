package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioRecord;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.lang.ref.Cleaner;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class gjs {
    private static Cleaner a;

    public static final gjn a(boolean z) {
        return new gjn(new ieb((short[]) null), new ConcurrentHashMap(), z);
    }

    public static final hjw b(fwd fwdVar) {
        return new hjw(cjn.i(fwdVar.a), cjn.i(fwdVar.b));
    }

    public static final fwd c(fwd fwdVar, bux buxVar) {
        long jI = cjn.i(fwdVar.b);
        agl aglVarF = ca.F(500, 0, null, 6);
        return new fwd(cjn.h(((cjv) adc.a(cjn.i(fwdVar.a), aglVarF, buxVar, 48, 12).a()).a), cjn.h(((cjv) adc.a(jI, aglVarF, buxVar, 48, 12).a()).a));
    }

    public static final hjw d(hjw hjwVar, bux buxVar) {
        bvv bvvVar;
        buxVar.v(-156954969);
        hjw hjwVar2 = null;
        if (hjwVar == null) {
            bvvVar = (bvv) buxVar;
        } else {
            agl aglVarF = ca.F(500, 0, null, 6);
            hjwVar2 = new hjw(((cjv) adc.a(hjwVar.e, aglVarF, buxVar, 48, 12).a()).a, ((cjv) adc.a(hjwVar.f, aglVarF, buxVar, 48, 12).a()).a);
            bvvVar = (bvv) buxVar;
        }
        bvvVar.Y(false);
        return hjwVar2;
    }

    public static final goz e(gor gorVar, geu geuVar, boolean z, boolean z2) {
        boolean zF = ((ggk) geuVar.F(ggk.class)).f();
        List list = gorVar.a;
        List listJ = j(geuVar, list, z);
        List list2 = gorVar.b;
        List listJ2 = j(geuVar, list2, z);
        hju gowVar = zF ? new gow(listJ, 1) : new fxz(listJ, false, 1, cfl.l, 2);
        boolean zK = k(list);
        hju gowVar2 = zF ? new gow(listJ2, 2) : new fxj(listJ2, 1);
        fvu fvuVar = gorVar.c;
        return new goz(gowVar, zK, gowVar2, k(list2), fvuVar != null ? gmn.a(fvuVar, geuVar, false, z2, 238) : null);
    }

    public static final boolean f(long j, int i, int i2) {
        return j >= 10 && j < 101 && i == 1 && i2 == 2;
    }

    public static boolean g(File file) {
        boolean zG = true;
        if (file == null) {
            return true;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                zG &= g(file2);
            }
        }
        return file.delete() & zG;
    }

    public static synchronized Cleaner h() {
        Cleaner cleaner = a;
        if (cleaner != null) {
            return cleaner;
        }
        Cleaner cleanerCreate = Cleaner.create();
        a = cleanerCreate;
        return cleanerCreate;
    }

    public static itj i(AudioAttributes audioAttributes, AudioFormat audioFormat, int i) throws NoSuchMethodException, SecurityException {
        try {
            try {
                Class cls = Integer.TYPE;
                Constructor constructor = AudioRecord.class.getConstructor(AudioAttributes.class, AudioFormat.class, cls, cls);
                constructor.setAccessible(true);
                return new itj((AudioRecord) constructor.newInstance(audioAttributes, audioFormat, Integer.valueOf(i), 0));
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                e = e;
                ((ype) ((ype) ((ype) itj.a.g()).p(e)).ai((char) 1334)).u("AudioRecord construction failed");
                return null;
            }
        } catch (IllegalAccessException e2) {
            e = e2;
            ((ype) ((ype) ((ype) itj.a.g()).p(e)).ai((char) 1334)).u("AudioRecord construction failed");
            return null;
        } catch (InstantiationException e3) {
            e = e3;
            ((ype) ((ype) ((ype) itj.a.g()).p(e)).ai((char) 1334)).u("AudioRecord construction failed");
            return null;
        } catch (InvocationTargetException e4) {
            e = e4;
            ((ype) ((ype) ((ype) itj.a.g()).p(e)).ai((char) 1334)).u("AudioRecord construction failed");
            return null;
        }
    }

    private static final List j(geu geuVar, List list, boolean z) {
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fvu fvuVar = (fvu) it.next();
            boolean z2 = true;
            if (z && !fvuVar.b()) {
                z2 = false;
            }
            arrayList.add(gmn.a(fvuVar, geuVar, z2, false, 246));
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean k(java.util.List r4) {
        /*
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            goto L29
        L8:
            java.util.Iterator r0 = r4.iterator()
            r2 = r1
        Ld:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L27
            java.lang.Object r3 = r0.next()
            fvu r3 = (defpackage.fvu) r3
            boolean r3 = r3.b()
            if (r3 == 0) goto Ld
            int r2 = r2 + 1
            if (r2 >= 0) goto Ld
            defpackage.woy.bn()
            goto Ld
        L27:
            if (r2 != 0) goto L31
        L29:
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L31
            r4 = 1
            return r4
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjs.k(java.util.List):boolean");
    }
}
