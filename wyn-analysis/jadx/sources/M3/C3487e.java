package m3;

import java.util.AbstractSet;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: m3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3487e {

    /* renamed from: a, reason: collision with root package name */
    public final String f40349a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f40350b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractSet f40351c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractSet f40352d;

    public C3487e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        AbstractC3340k.e(foreignKeys, "foreignKeys");
        this.f40349a = str;
        this.f40350b = map;
        this.f40351c = foreignKeys;
        this.f40352d = abstractSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01df, code lost:
    
        r9 = tg.b.m(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e3, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m3.C3487e a(o3.InterfaceC3644a r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.C3487e.a(o3.a, java.lang.String):m3.e");
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3487e)) {
            return false;
        }
        C3487e c3487e = (C3487e) obj;
        if (!this.f40349a.equals(c3487e.f40349a) || !this.f40350b.equals(c3487e.f40350b) || !AbstractC3340k.a(this.f40351c, c3487e.f40351c)) {
            return false;
        }
        AbstractSet abstractSet2 = this.f40352d;
        if (abstractSet2 == null || (abstractSet = c3487e.f40352d) == null) {
            return true;
        }
        return abstractSet2.equals(abstractSet);
    }

    public final int hashCode() {
        return this.f40351c.hashCode() + ((this.f40350b.hashCode() + (this.f40349a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.f40349a + "', columns=" + this.f40350b + ", foreignKeys=" + this.f40351c + ", indices=" + this.f40352d + '}';
    }
}
