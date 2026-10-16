package defpackage;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahet {
    private ahet() {
    }

    public static final boolean a() {
        ajly ajlyVar = ajly.c;
        return Build.VERSION.SDK_INT >= 29;
    }

    public static final List b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ajib) obj) != ajib.a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ajib) it.next()).h);
        }
        return arrayList2;
    }

    public final ahev getBOOLEAN$org_jetbrains_kotlin_descriptors_jvm() {
        return ahew.BOOLEAN;
    }

    public final ahev getBYTE$org_jetbrains_kotlin_descriptors_jvm() {
        return ahew.BYTE;
    }

    public final ahev getCHAR$org_jetbrains_kotlin_descriptors_jvm() {
        return ahew.CHAR;
    }

    public final ahev getDOUBLE$org_jetbrains_kotlin_descriptors_jvm() {
        return ahew.DOUBLE;
    }

    public final ahev getFLOAT$org_jetbrains_kotlin_descriptors_jvm() {
        return ahew.FLOAT;
    }

    public final ahev getINT$org_jetbrains_kotlin_descriptors_jvm() {
        return ahew.INT;
    }

    public final ahev getLONG$org_jetbrains_kotlin_descriptors_jvm() {
        return ahew.LONG;
    }

    public final ahev getSHORT$org_jetbrains_kotlin_descriptors_jvm() {
        return ahew.SHORT;
    }

    public /* synthetic */ ahet(afeu afeuVar) {
        this();
    }
}
