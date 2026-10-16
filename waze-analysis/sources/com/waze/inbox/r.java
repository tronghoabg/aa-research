package com.waze.inbox;

import android.support.v7.widget.RecyclerView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f24680a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f24681b;

    r(InboxRecycler inboxRecycler, int i2) {
        this.f24681b = i2;
        Objects.requireNonNull(inboxRecycler);
        this.f24680a = inboxRecycler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2 = this.f24681b;
        if (i2 == 0) {
            u.openInboxJNI$lambda$0((u) this.f24680a);
            return;
        }
        Object obj = this.f24680a;
        if (i2 != 1) {
            ((RecyclerView) obj).j().notifyDataSetChanged();
        } else {
            u.onMessageRefreshedJNI$lambda$0((u) obj);
        }
    }

    public /* synthetic */ r(u uVar, int i2) {
        this.f24681b = i2;
        this.f24680a = uVar;
    }
}
