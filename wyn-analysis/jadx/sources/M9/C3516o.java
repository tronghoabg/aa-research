package m9;

import ba.C1521a;
import com.google.firebase.firestore.FirebaseFirestore;
import java.util.HashMap;
import java.util.Map;

/* renamed from: m9.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3516o {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseFirestore f40502a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.h f40503b;

    /* renamed from: c, reason: collision with root package name */
    public final s9.k f40504c;

    /* renamed from: d, reason: collision with root package name */
    public final b0 f40505d;

    public C3516o(FirebaseFirestore firebaseFirestore, s9.h hVar, s9.k kVar, boolean z2, boolean z10) {
        firebaseFirestore.getClass();
        this.f40502a = firebaseFirestore;
        hVar.getClass();
        this.f40503b = hVar;
        this.f40504c = kVar;
        this.f40505d = new b0(z10, z2);
    }

    public HashMap a(EnumC3515n enumC3515n) {
        Fe.c.l(enumC3515n, "Provided serverTimestampBehavior value must not be null.");
        C1521a c1521a = new C1521a((Object) this.f40502a, false, (Object) enumC3515n, 14);
        s9.k kVar = this.f40504c;
        if (kVar == null) {
            return null;
        }
        return c1521a.n(kVar.f45384e.b().s().getFieldsMap());
    }

    public Map b() {
        return a(EnumC3515n.f40500d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3516o)) {
            return false;
        }
        C3516o c3516o = (C3516o) obj;
        if (this.f40502a.equals(c3516o.f40502a) && this.f40503b.equals(c3516o.f40503b) && this.f40505d.equals(c3516o.f40505d)) {
            s9.k kVar = c3516o.f40504c;
            s9.k kVar2 = this.f40504c;
            if (kVar2 != null ? !(kVar == null || !kVar2.f45384e.equals(kVar.f45384e)) : kVar == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f40503b.f45375a.hashCode() + (this.f40502a.hashCode() * 31)) * 31;
        s9.k kVar = this.f40504c;
        return this.f40505d.hashCode() + ((((iHashCode + (kVar != null ? kVar.f45380a.f45375a.hashCode() : 0)) * 31) + (kVar != null ? kVar.f45384e.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DocumentSnapshot{key=" + this.f40503b + ", metadata=" + this.f40505d + ", doc=" + this.f40504c + '}';
    }
}
