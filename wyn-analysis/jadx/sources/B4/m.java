package b4;

import A.AbstractC0213f;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class m extends AbstractC1509e {

    /* renamed from: a, reason: collision with root package name */
    public final Z3.k f19323a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19324b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19325c;

    public m(Z3.k kVar, String str, int i5) {
        this.f19323a = kVar;
        this.f19324b = str;
        this.f19325c = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f19323a.equals(mVar.f19323a) && AbstractC3340k.a(this.f19324b, mVar.f19324b) && this.f19325c == mVar.f19325c;
    }

    public final int hashCode() {
        int iHashCode = this.f19323a.hashCode() * 31;
        String str = this.f19324b;
        return AbstractC0213f.f(this.f19325c) + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
