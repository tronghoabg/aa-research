package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class eui extends eud {
    public static final List g(String str) {
        str.getClass();
        return woy.bg(etz.a(str));
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
        return woy.dd(fbb.i(bundle, str));
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
        return "List<Int>";
    }

    @Override // defpackage.evm
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            bundle.putIntArray(str, woy.cp(list));
        }
    }
}
