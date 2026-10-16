package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public final class aiat {
    private aiat() {
    }

    public final aiau create(ahnf ahnfVar, aiei aieiVar, agcu agcuVar, InputStream inputStream, boolean z) throws IOException {
        ahnfVar.getClass();
        aieiVar.getClass();
        agcuVar.getClass();
        inputStream.getClass();
        aezu<ahip, ahkq> builtinsPackageFragment = ahkt.readBuiltinsPackageFragment(inputStream);
        ahip ahipVar = (ahip) builtinsPackageFragment.a;
        ahkq ahkqVar = (ahkq) builtinsPackageFragment.b;
        if (ahipVar != null) {
            return new aiau(ahnfVar, aieiVar, agcuVar, ahipVar, ahkqVar, z, null);
        }
        throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ahkq.INSTANCE + ", actual " + ahkqVar + ". Please update Kotlin");
    }

    public /* synthetic */ aiat(afeu afeuVar) {
        this();
    }
}
