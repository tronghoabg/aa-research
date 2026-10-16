package v9;

import com.google.protobuf.Internal;
import java.util.List;
import r7.AbstractC3935e;

/* loaded from: classes4.dex */
public final class w extends AbstractC3935e {

    /* renamed from: c, reason: collision with root package name */
    public final List f47124c;

    /* renamed from: d, reason: collision with root package name */
    public final Internal.IntList f47125d;

    /* renamed from: e, reason: collision with root package name */
    public final s9.h f47126e;

    /* renamed from: f, reason: collision with root package name */
    public final s9.k f47127f;

    public w(List list, Internal.IntList intList, s9.h hVar, s9.k kVar) {
        this.f47124c = list;
        this.f47125d = intList;
        this.f47126e = hVar;
        this.f47127f = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.f47124c.equals(wVar.f47124c) || !this.f47125d.equals(wVar.f47125d) || !this.f47126e.equals(wVar.f47126e)) {
            return false;
        }
        s9.k kVar = wVar.f47127f;
        s9.k kVar2 = this.f47127f;
        return kVar2 != null ? kVar2.equals(kVar) : kVar == null;
    }

    public final int hashCode() {
        int iHashCode = (this.f47126e.f45375a.hashCode() + ((this.f47125d.hashCode() + (this.f47124c.hashCode() * 31)) * 31)) * 31;
        s9.k kVar = this.f47127f;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }

    public final String toString() {
        return "DocumentChange{updatedTargetIds=" + this.f47124c + ", removedTargetIds=" + this.f47125d + ", key=" + this.f47126e + ", newDocument=" + this.f47127f + '}';
    }
}
