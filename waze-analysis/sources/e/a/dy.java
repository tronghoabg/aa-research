package e.a;

import androidx.autofill.HintConstants;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dy {

    /* renamed from: a, reason: collision with root package name */
    private final String f47351a;

    /* renamed from: b, reason: collision with root package name */
    private final Collection f47352b;

    /* synthetic */ dy(dx dxVar) {
        String strB = dx.b(dxVar);
        this.f47351a = strB;
        List<cq> list = dxVar.f47350b;
        HashSet hashSet = new HashSet(list.size());
        for (cq cqVar : list) {
            com.google.d.b.an.C(cqVar, "method");
            String strG = cqVar.g();
            com.google.d.b.an.s(strB.equals(strG), "service names %s != %s", strG, strB);
            com.google.d.b.an.q(hashSet.add(cqVar.f()), "duplicate name %s", cqVar.f());
        }
        this.f47352b = DesugarCollections.unmodifiableList(new ArrayList(dxVar.f47350b));
    }

    public static dx c() {
        return new dx();
    }

    public final String a() {
        return this.f47351a;
    }

    public final Collection b() {
        return this.f47352b;
    }

    public final String toString() {
        com.google.d.b.z zVarH = com.google.d.b.an.H(this);
        zVarH.d(HintConstants.AUTOFILL_HINT_NAME, this.f47351a);
        zVarH.d("schemaDescriptor", null);
        zVarH.d("methods", this.f47352b);
        zVarH.a();
        return zVarH.toString();
    }
}
