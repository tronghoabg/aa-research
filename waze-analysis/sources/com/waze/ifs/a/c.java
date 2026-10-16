package com.waze.ifs.a;

import android.os.Handler;
import android.os.Message;
import com.waze.menus.SideMenuAutoCompleteRecycler;
import java.lang.ref.WeakReference;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class c extends Handler {

    /* renamed from: a, reason: collision with root package name */
    WeakReference f24459a;

    public c(SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler) {
        this.f24459a = null;
        this.f24459a = new WeakReference(sideMenuAutoCompleteRecycler);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        SideMenuAutoCompleteRecycler sideMenuAutoCompleteRecycler;
        super.handleMessage(message);
        WeakReference weakReference = this.f24459a;
        if (weakReference == null || (sideMenuAutoCompleteRecycler = (SideMenuAutoCompleteRecycler) weakReference.get()) == null) {
            return;
        }
        sideMenuAutoCompleteRecycler.aR(message);
    }
}
