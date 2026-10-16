package defpackage;

import android.content.Intent;
import j$.util.Collection;

/* loaded from: classes2.dex */
public final class jyx extends jrw {
    @Override // defpackage.jrw
    protected final mqb a(Intent intent) {
        mqb mqbVarB = mqb.b(intent);
        mqbVarB.getClass();
        return mqbVarB;
    }

    @Override // defpackage.mov
    protected final boolean d(Intent intent, qql qqlVar) {
        mqb mqbVarB = mqb.b(intent);
        if (mqbVarB == null) {
            return false;
        }
        if (mqbVarB.a.equals(mkn.g)) {
            return true;
        }
        nyj nyjVarA = nyj.a();
        boolean zAnyMatch = Collection.EL.stream(jza.a().b(kio.b().e(), nyjVarA)).map(new jxe(7)).anyMatch(new ghp(mqbVarB, 13));
        boolean zAnyMatch2 = Collection.EL.stream(jzb.a().b(kio.b().e(), nyjVarA)).map(new jxe(7)).anyMatch(new ghp(mqbVarB, 13));
        if ((!zAnyMatch || zAnyMatch2) && !Collection.EL.stream(juv.a().b(kio.b().e(), nyj.b())).map(new jxe(7)).anyMatch(new ghp(mqbVarB, 13))) {
            return Collection.EL.stream(jzc.a().b(kio.b().e(), nyjVarA)).map(new jxe(7)).anyMatch(new ghp(mqbVarB, 13));
        }
        return true;
    }
}
