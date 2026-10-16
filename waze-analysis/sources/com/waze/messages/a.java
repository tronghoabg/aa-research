package com.waze.messages;

import com.waze.user.UserData;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ UserData f29762a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f29763b;

    a(MessagesNativeManager messagesNativeManager, UserData userData, String str) {
        this.f29762a = userData;
        this.f29763b = str;
        Objects.requireNonNull(messagesNativeManager);
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessagesNativeManager.getInstance().onSendMessageNTV(this.f29762a, this.f29763b);
    }
}
