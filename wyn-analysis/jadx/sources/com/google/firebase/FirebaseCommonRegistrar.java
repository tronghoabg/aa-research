package com.google.firebase;

import L8.a;
import L8.b;
import L8.l;
import L8.t;
import V1.c;
import W9.m;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import ef.C2524h;
import ic.d;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import m9.B;
import s8.g;
import x9.C4503c;
import x9.C4504d;
import x9.InterfaceC4505e;
import x9.f;
import y8.InterfaceC4566a;

/* loaded from: classes4.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        a aVarB = b.b(Y9.b.class);
        aVarB.c(new l(2, 0, Y9.a.class));
        aVarB.f6989g = new c(12);
        arrayList.add(aVarB.d());
        t tVar = new t(InterfaceC4566a.class, Executor.class);
        a aVar = new a(C4503c.class, new Class[]{InterfaceC4505e.class, f.class});
        aVar.c(l.d(Context.class));
        aVar.c(l.d(g.class));
        aVar.c(new l(2, 0, C4504d.class));
        aVar.c(new l(1, 1, Y9.b.class));
        aVar.c(new l(tVar, 1, 0));
        aVar.f6989g = new m(tVar, 2);
        arrayList.add(aVar.d());
        arrayList.add(d.m("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(d.m("fire-core", "21.0.0"));
        arrayList.add(d.m("device-name", a(Build.PRODUCT)));
        arrayList.add(d.m("device-model", a(Build.DEVICE)));
        arrayList.add(d.m("device-brand", a(Build.BRAND)));
        arrayList.add(d.u("android-target-sdk", new B(19)));
        arrayList.add(d.u("android-min-sdk", new B(20)));
        arrayList.add(d.u("android-platform", new B(21)));
        arrayList.add(d.u("android-installer", new B(22)));
        try {
            string = C2524h.f34662e.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(d.m("kotlin", string));
        }
        return arrayList;
    }
}
