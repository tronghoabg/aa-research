package defpackage;

import j$.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final class aisl extends afam implements Collection, java.util.Collection, afgc {
    final /* synthetic */ aism a;

    public aisl(aism aismVar) {
        this.a = aismVar;
    }

    @Override // defpackage.afam
    public final int a() {
        return this.a.a.groupCount() + 1;
    }

    public final aisi b(int i) {
        Matcher matcher = this.a.a;
        afha afhaVarM = afpt.m(matcher.start(i), matcher.end(i));
        if (afhaVarM.f().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new aisi(strGroup, afhaVarM);
    }

    @Override // defpackage.afam, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null || (obj instanceof aisi)) {
            return super.contains((aisi) obj);
        }
        return false;
    }

    @Override // defpackage.afam, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<aisi> iterator() {
        return new aisc((aisd) afrg.q(woy.cm(woy.bm(this)), new xrr(this, 6)));
    }
}
