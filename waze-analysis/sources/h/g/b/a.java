package h.g.b;

import com.waze.strings.DisplayStrings;
import java.io.Serializable;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public class a implements Serializable, s {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public a(int i2, Object obj, Class cls, String str, String str2, int i3) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = 1 == (i3 & 1);
        this.arity = i2;
        this.flags = i3 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.isTopLevel == aVar.isTopLevel && this.arity == aVar.arity && this.flags == aVar.flags && x.n(this.receiver, aVar.receiver) && x.n(this.owner, aVar.owner) && this.name.equals(aVar.name) && this.signature.equals(aVar.signature);
    }

    @Override // h.g.b.s
    public int getArity() {
        return this.arity;
    }

    public h.l.e getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            int i2 = ar.f48106a;
            return new af(cls);
        }
        int i3 = ar.f48106a;
        return new m(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Class cls = this.owner;
        return (((((((((((iHashCode * 31) + (cls != null ? cls.hashCode() : 0)) * 31) + this.name.hashCode()) * 31) + this.signature.hashCode()) * 31) + (true != this.isTopLevel ? DisplayStrings.DS_SEARCH_RESULTS_PARKING_POPULAR_HEADER : DisplayStrings.DS_SEARCH_RESULTS_NO_RESULTS)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        int i2 = ar.f48106a;
        return w.a(this);
    }

    public a(int i2, Class cls, String str, String str2, int i3) {
        this(i2, j.NO_RECEIVER, cls, str, str2, i3);
    }
}
