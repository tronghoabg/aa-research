package defpackage;

import android.content.SharedPreferences;
import android.os.StrictMode;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class zsz extends zsm {
    private final zss b;

    public zsz(zss zssVar) {
        this.b = zssVar;
    }

    @Override // defpackage.zsm, defpackage.zsr
    public final boolean e() {
        return false;
    }

    @Override // defpackage.zsr
    public final int h() {
        return 15;
    }

    @Override // defpackage.zsr
    public final void j(DataInputStream dataInputStream) throws IOException {
        long j = dataInputStream.readLong();
        String str = zss.a;
        if (zrn.e(str, 4)) {
            Log.i(str, "New GMM Server Cookie: ".concat(String.valueOf(Long.toHexString(j))));
        }
        zss zssVar = this.b;
        synchronized (zssVar) {
            zssVar.c = Long.valueOf(j);
        }
        SharedPreferences.Editor editorEdit = zssVar.e.edit();
        editorEdit.putLong("SessionID", j);
        StrictMode.ThreadPolicy threadPolicyB = zrr.a.b();
        try {
            editorEdit.commit();
        } finally {
            zrr.a.d(threadPolicyB);
        }
    }

    @Override // defpackage.zsr
    public final void i(DataOutputStream dataOutputStream) throws IOException {
    }
}
