package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/* loaded from: classes3.dex */
public final class wkg extends wjz {
    private final abxu c;

    public wkg(abxu abxuVar) {
        this.c = abxuVar;
        this.b = 5;
    }

    @Override // defpackage.wjz
    public final Fragment a(Integer num, int i) {
        wki wkiVar = new wki();
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("DisplayLogoResId", num.intValue());
        }
        bundle.putByteArray("Completion", this.c.h());
        wkiVar.setArguments(bundle);
        return wkiVar;
    }
}
