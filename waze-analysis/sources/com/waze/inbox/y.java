package com.waze.inbox;

import android.support.v7.widget.eb;
import android.support.v7.widget.fe;
import android.view.ViewGroup;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class y extends eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InboxRecycler f24694a;

    /* synthetic */ y(InboxRecycler inboxRecycler) {
        Objects.requireNonNull(inboxRecycler);
        this.f24694a = inboxRecycler;
    }

    @Override // android.support.v7.widget.eb
    public final int getItemCount() {
        return this.f24694a.Q.size();
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ void onBindViewHolder(fe feVar, int i2) {
        InboxRecycler inboxRecycler = this.f24694a;
        ((z) feVar).a((n) inboxRecycler.Q.get(i2), i2 == 0, i2 == inboxRecycler.Q.size() + (-1));
        if (i2 < inboxRecycler.Q.size() - 1 || !inboxRecycler.S) {
            return;
        }
        InboxRecycler.aL(inboxRecycler);
    }

    @Override // android.support.v7.widget.eb
    public final /* bridge */ /* synthetic */ fe onCreateViewHolder(ViewGroup viewGroup, int i2) {
        InboxRecycler inboxRecycler = this.f24694a;
        return new z(inboxRecycler, new j(inboxRecycler.getContext()));
    }
}
