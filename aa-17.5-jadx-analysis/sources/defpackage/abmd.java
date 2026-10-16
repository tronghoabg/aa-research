package defpackage;

import defpackage.abmc;
import defpackage.abmd;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public abstract class abmd<MessageType extends abmd<MessageType, BuilderType>, BuilderType extends abmc<MessageType, BuilderType>> implements abow {
    protected transient int ak = 0;

    private final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int e(abpl abplVar) {
        throw null;
    }

    @Override // defpackage.abow
    public final abms f() {
        try {
            int iM = m();
            abms abmsVar = abms.d;
            byte[] bArr = new byte[iM];
            abmy abmyVar = new abmy(bArr, 0, iM, null);
            R(abmyVar);
            abmyVar.I();
            return new abmq(bArr);
        } catch (IOException e) {
            throw new RuntimeException(a("ByteString"), e);
        }
    }

    @Override // defpackage.abow
    public final void g(OutputStream outputStream) throws IOException {
        int iM = m();
        if (iM > 4096) {
            iM = 4096;
        }
        abnc abncVar = new abnc(outputStream, iM);
        R(abncVar);
        abncVar.c();
    }

    @Override // defpackage.abow
    public final byte[] h() {
        try {
            int iM = m();
            byte[] bArr = new byte[iM];
            abmy abmyVar = new abmy(bArr, 0, iM, null);
            R(abmyVar);
            abmyVar.I();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(a("byte array"), e);
        }
    }
}
