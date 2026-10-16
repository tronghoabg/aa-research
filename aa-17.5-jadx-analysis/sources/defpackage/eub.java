package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class eub extends eud {
    public static final List g(String str) {
        str.getClass();
        return woy.bg(evm.k.c(str));
    }

    @Override // defpackage.eud
    public final /* synthetic */ Object a() {
        return afbe.a;
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!fbb.f(bundle, str) || fbb.g(bundle, str)) {
            return null;
        }
        return woy.dg(fbb.l(bundle, str));
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        List list = (List) obj;
        return list != null ? woy.bY(list, g(str)) : g(str);
    }

    @Override // defpackage.evm
    public final String e() {
        return "List<Boolean>";
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list == null) {
            bundle.putString(str, null);
            return;
        }
        boolean[] zArr = new boolean[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        bundle.putBooleanArray(str, zArr);
    }
}
