package com.waze.settings.tree.a;

import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.waze.settings.ds;
import l.a.bcc;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class d {
    public /* synthetic */ d(byte[] bArr) {
    }

    public static /* synthetic */ Intent b() {
        Object value = h.f37470b.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return (Intent) value;
    }

    public static com.waze.settings.tree.d.s c(int i2, ds dsVar, com.waze.main_screen.c.a aVar, h.g.a.l lVar) {
        h.g.b.x.f(dsVar, "settingsRepository");
        h.g.b.x.f(lVar, "showValidationMessage");
        return new b(i2, new c(dsVar, aVar, lVar));
    }

    public static LiveData d(com.waze.settings.tree.c.h hVar) {
        return new MutableLiveData(hVar.b());
    }

    public static /* synthetic */ bcc e(com.waze.share.h hVar) {
        com.waze.share.h hVar2 = com.waze.share.h.f37710a;
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 0) {
            return bcc.CLOSE;
        }
        if (iOrdinal == 1) {
            return bcc.MORE_OPTIONS;
        }
        if (iOrdinal == 2) {
            return bcc.SHARE;
        }
        throw new h.i();
    }

    private d() {
        throw null;
    }
}
