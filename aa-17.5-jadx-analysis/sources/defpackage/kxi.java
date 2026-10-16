package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class kxi implements kxe {
    private static final yph c = yph.c("GH.Assistant.Recorder");
    private final lah d = lah.a();

    public kxi() {
        ((ype) ((ype) c.f()).ai((char) 3487)).u("Microphone permission isn't granted");
    }

    @Override // defpackage.kxe
    public final ParcelFileDescriptor a() throws IOException {
        lah lahVar = this.d;
        lahVar.h(401, null);
        ((ype) ((ype) c.h()).ai((char) 3489)).u("Can't start a new recording, permission isn't granted.");
        lahVar.h(402, null);
        return null;
    }

    @Override // defpackage.kxe
    public final void b() {
        lah lahVar = this.d;
        lahVar.h(405, null);
        ((ype) ((ype) c.h()).ai((char) 3490)).u("Didn't start a recording, permission isn't granted.");
        lahVar.h(406, null);
    }

    @Override // defpackage.kxe
    public final boolean d() {
        ((ype) ((ype) ((ype) c.h()).l(2, TimeUnit.SECONDS)).ai(3488)).u("Not recording, permission isn't granted.");
        return false;
    }

    @Override // defpackage.kxe
    public final void c() {
    }
}
