package defpackage;

import j$.util.Objects;
import java.util.Map;

/* loaded from: classes.dex */
final class yer extends yex {
    final /* synthetic */ yey a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yer(yey yeyVar) {
        super(yeyVar);
        this.a = yeyVar;
    }

    @Override // defpackage.yex
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new yep(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            yey yeyVar = this.a;
            int iB = yeyVar.b(key);
            if (iB != -1 && Objects.equals(value, yeyVar.b[iB])) {
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
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        int iX = wub.x(key);
        yey yeyVar = this.a;
        int iC = yeyVar.c(key, iX);
        if (iC == -1 || !Objects.equals(value, yeyVar.b[iC])) {
            return false;
        }
        yeyVar.g(iC, iX);
        return true;
    }
}
