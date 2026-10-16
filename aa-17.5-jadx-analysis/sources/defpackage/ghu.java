package defpackage;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class ghu {
    public static final ghu a;
    public static final ghu b;
    public static final ghu c;
    public static final ghu d;
    private static final ghu i;
    public final int e;
    public final int f;
    public final Set g;
    public final Set h;

    static {
        ght ghtVar = new ght();
        ghtVar.a = 2;
        ghu ghuVar = new ghu(ghtVar);
        i = ghuVar;
        ght ghtVar2 = new ght();
        ghtVar2.a = 1;
        new ghu(ghtVar2);
        ght ghtVar3 = new ght(ghuVar);
        ghtVar3.b = 1;
        a = new ghu(ghtVar3);
        ght ghtVar4 = new ght(ghuVar);
        ghtVar4.a = 4;
        ghtVar4.b = 4;
        b = new ghu(ghtVar4);
        ght ghtVar5 = new ght(ghuVar);
        ghtVar5.a = 4;
        c = new ghu(ghtVar5);
        ght ghtVar6 = new ght(ghuVar);
        ghtVar6.a = 2;
        d = new ghu(ghtVar6);
    }

    private ghu(ght ghtVar) {
        int i2 = ghtVar.a;
        this.e = i2;
        this.f = ghtVar.b;
        HashSet hashSet = new HashSet(ghtVar.c);
        this.g = hashSet;
        if (!ghtVar.d.isEmpty()) {
            HashSet hashSet2 = new HashSet(ghtVar.d);
            hashSet2.retainAll(hashSet);
            if (!hashSet2.isEmpty()) {
                throw new IllegalArgumentException("Disallowed action types cannot also be in the required set.");
            }
        }
        this.h = new HashSet(ghtVar.d);
        if (hashSet.size() > i2) {
            throw new IllegalArgumentException("Required action types exceeded max allowed actions.");
        }
    }
}
