package i.b;

import androidx.credentials.provider.CredentialEntry;
import com.google.v.dm;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ai extends dm<aj, ai> implements ak {
    /* synthetic */ ai(byte[] bArr) {
        super(aj.DEFAULT_INSTANCE);
    }

    public final void a() {
        copyOnWrite();
        ((aj) this.instance).setKey("uid_enabled");
    }

    public final void b() {
        copyOnWrite();
        ((aj) this.instance).setValue(CredentialEntry.TRUE_STRING);
    }

    private ai() {
        throw null;
    }
}
