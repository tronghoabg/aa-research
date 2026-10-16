package com.google.d.f.b.a;

import com.google.d.b.an;
import com.google.d.f.b.r;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends a {

    /* renamed from: a, reason: collision with root package name */
    private final Level f7718a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f7719b;

    /* renamed from: c, reason: collision with root package name */
    private final r f7720c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7721d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(String str, int i2) {
        super(str);
        Level level = Level.ALL;
        Set set = n.f7722a;
        r rVar = n.f7723b;
        this.f7721d = 2;
        this.f7718a = level;
        this.f7719b = set;
        this.f7720c = rVar;
    }

    @Override // com.google.d.f.b.g
    public final void c(com.google.d.f.b.f fVar) {
        String strB = (String) fVar.j().c(com.google.d.f.a.a.f7667a);
        if (strB == null) {
            strB = a();
        }
        if (strB == null) {
            strB = fVar.f().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        n.i(fVar, an.h(strB), 2, this.f7718a, this.f7719b, this.f7720c);
    }

    @Override // com.google.d.f.b.g
    public final boolean d(Level level) {
        return true;
    }
}
