package e.a;

import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public abstract class bv extends bj {

    /* renamed from: a, reason: collision with root package name */
    private static final cy f46508a = cy.a(new bu());

    public cy b(Map map) {
        return f46508a;
    }

    public abstract String c();

    public abstract void d();

    public abstract void e();

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d("policy", c());
        zVarH.b("priority", 5);
        zVarH.e("available", true);
        return zVarH.toString();
    }
}
