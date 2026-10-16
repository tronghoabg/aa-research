package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes3.dex */
final class yet extends yex {
    @Override // defpackage.yex
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new yeq(this.b, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            yey yeyVar = this.b;
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int iD = yeyVar.d(key);
            if (iD != -1 && Objects.equals(yeyVar.a[iD], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        yey yeyVar = this.b;
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iX = wub.x(key);
        int iE = yeyVar.e(key, iX);
        if (iE == -1 || !Objects.equals(yeyVar.a[iE], value)) {
            return false;
        }
        yeyVar.h(iE, iX);
        return true;
    }
}
