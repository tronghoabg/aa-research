package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.apps.auto.components.media.compat.AaPlaybackState;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class kfa extends llu {
    final /* synthetic */ kfc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfa(kfc kfcVar) {
        super((byte[]) null);
        this.a = kfcVar;
    }

    @Override // defpackage.llu
    public final void a() {
        kfc kfcVar = this.a;
        Context context = kfcVar.c;
        llu lluVar = kfcVar.e;
        llu lluVar2 = kfcVar.f;
        lmb lmbVar = new lmb(context, lluVar.L());
        lmbVar.W(lluVar2);
        kfcVar.b = lmbVar;
        AaPlaybackState aaPlaybackStateP = kfcVar.b.P();
        llu lluVarV = kfcVar.b.V();
        if (aaPlaybackStateP != null && kfc.b(aaPlaybackStateP.Q())) {
            kfc.d(lluVarV, aaPlaybackStateP);
        }
        new Handler(kfcVar.c.getMainLooper()).postDelayed(new kea(kfcVar, 5), kfc.a.toMillis());
        lluVarV.z("", new Bundle());
    }

    @Override // defpackage.llu
    public final void b() {
        kfc kfcVar = this.a;
        kfcVar.c(1, kfcVar.c.getString(R.string.connection_failed_warning));
    }

    @Override // defpackage.llu
    public final void c() {
        kfc kfcVar = this.a;
        kfcVar.c(1, kfcVar.c.getString(R.string.connection_suspended_warning));
    }
}
