package com.google.e.a.j;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final v f8758a = new v(new w(1));

    /* renamed from: b, reason: collision with root package name */
    public static final v f8759b = new v(new w(4));

    /* renamed from: c, reason: collision with root package name */
    private final u f8760c;

    static {
        new v(new w(6));
        new v(new w(5));
        new v(new w(0));
        new v(new w(3));
        new v(new w(2));
    }

    public v(x xVar) {
        if (com.google.e.a.b.a.b.b()) {
            this.f8760c = new t(xVar, 2);
        } else if (com.google.firebase.a.b()) {
            this.f8760c = new t(xVar, 1);
        } else {
            this.f8760c = new t(xVar, 0);
        }
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.f8760c.a(str);
    }
}
