package na;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class j extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f40975b;

    public /* synthetic */ j(l lVar, int i5) {
        this.f40974a = i5;
        this.f40975b = lVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f40974a) {
            case 0:
                this.f40975b.clear();
                break;
            default:
                this.f40975b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        k kVarA;
        switch (this.f40974a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                l lVar = this.f40975b;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                k kVar = null;
                if (key != null) {
                    try {
                        kVarA = lVar.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                } else {
                    kVarA = null;
                }
                if (kVarA != null && Objects.equals(kVarA.f40983h, entry.getValue())) {
                    kVar = kVarA;
                }
                return kVar != null;
            default:
                return this.f40975b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f40974a) {
            case 0:
                return new i(this.f40975b, 0);
            default:
                return new i(this.f40975b, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        k kVarA;
        switch (this.f40974a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    l lVar = this.f40975b;
                    Object key = entry.getKey();
                    k kVar = null;
                    if (key != null) {
                        try {
                            kVarA = lVar.a(key, false);
                        } catch (ClassCastException unused) {
                        }
                    } else {
                        kVarA = null;
                    }
                    if (kVarA != null && Objects.equals(kVarA.f40983h, entry.getValue())) {
                        kVar = kVarA;
                    }
                    if (kVar != null) {
                        lVar.d(kVar, true);
                        break;
                    }
                }
                break;
            default:
                l lVar2 = this.f40975b;
                k kVarA2 = null;
                if (obj != null) {
                    try {
                        kVarA2 = lVar2.a(obj, false);
                    } catch (ClassCastException unused2) {
                    }
                }
                if (kVarA2 != null) {
                    lVar2.d(kVarA2, true);
                }
                if (kVarA2 != null) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f40974a) {
        }
        return this.f40975b.f40989d;
    }
}
