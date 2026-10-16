package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class syd extends sxt {
    public syd() {
        super(qnl.COMPONENT_ENABLED_SETTING_FIX, 0L);
    }

    private static ComponentName c(Context context, String str) {
        return new ComponentName(context.getPackageName(), str);
    }

    private static int d(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 == 3) {
            return 1;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sxt
    public final sxy a(sxy sxyVar, xxh xxhVar) {
        if (!xxhVar.f() || ((qnz) xxhVar.b()).b != 8) {
            throw new IllegalArgumentException();
        }
        qnz qnzVar = (qnz) xxhVar.b();
        qnn qnnVar = qnzVar.b == 8 ? (qnn) qnzVar.c : qnn.a;
        HashSet hashSet = new HashSet();
        Iterator<E> it = qnnVar.b.iterator();
        while (it.hasNext()) {
            if (!hashSet.add(((qnm) it.next()).b)) {
                throw new IllegalArgumentException("Duplicate componentName in config");
            }
        }
        Context context = sxyVar.b;
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList = new ArrayList();
            for (qnm qnmVar : qnnVar.b) {
                ComponentName componentNameC = c(context, qnmVar.b);
                int iAz = a.az(qnmVar.c);
                if (iAz == 0) {
                    iAz = 1;
                }
                arrayList.add(new PackageManager.ComponentEnabledSetting(componentNameC, d(iAz), 1));
            }
            context.getPackageManager().setComponentEnabledSettings(arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < qnnVar.b.size()) {
                try {
                    qnm qnmVar2 = (qnm) qnnVar.b.get(i);
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentNameC2 = c(context, qnmVar2.b);
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentNameC2);
                    int iAz2 = a.az(qnmVar2.c);
                    if (iAz2 == 0) {
                        iAz2 = 1;
                    }
                    packageManager.setComponentEnabledSetting(componentNameC2, d(iAz2), 1);
                    arrayList2.add(Integer.valueOf(componentEnabledSetting));
                    i++;
                } catch (IllegalArgumentException e) {
                    PackageManager packageManager2 = context.getPackageManager();
                    while (true) {
                        i--;
                        if (i < 0) {
                            throw new IllegalArgumentException("Failed to set componentEnabled state.", e);
                        }
                        packageManager2.setComponentEnabledSetting(c(context, ((qnm) qnnVar.b.get(i)).b), ((Integer) arrayList2.get(i)).intValue(), 1);
                    }
                }
            }
        }
        if (qnnVar.c) {
            return sxyVar;
        }
        sxx sxxVar = new sxx(sxyVar);
        sxxVar.c();
        return sxxVar.a();
    }

    @Override // defpackage.sxt
    public final String b() {
        return "COMPONENT_ENABLED_SETTING_FIX";
    }
}
