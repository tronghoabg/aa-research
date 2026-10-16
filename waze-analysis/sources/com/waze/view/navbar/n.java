package com.waze.view.navbar;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class n extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f45100a;

    /* synthetic */ n(p pVar) {
        Objects.requireNonNull(pVar);
        this.f45100a = pVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        if (message.what == o.f45101a) {
            p.n(this.f45100a);
            return;
        }
        if (message.what == o.f45102b) {
            p pVar = this.f45100a;
            pVar.f45114i.post(new l(pVar, 0));
        } else if (message.what == o.f45103c) {
            p.l(this.f45100a);
        }
    }
}
