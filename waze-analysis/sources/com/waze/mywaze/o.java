package com.waze.mywaze;

import com.waze.inbox.InboxNativeManager;
import com.waze.sharedui.profile.ProfileBasicInfo;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o extends com.waze.ifs.a.a {

    /* renamed from: a, reason: collision with root package name */
    a f30617a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f30618b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MyWazeNativeManager f30619c;

    o(MyWazeNativeManager myWazeNativeManager, s sVar) {
        this.f30618b = sVar;
        Objects.requireNonNull(myWazeNativeManager);
        this.f30619c = myWazeNativeManager;
    }

    @Override // com.waze.ifs.a.a
    public final void a() {
        this.f30618b.y(this.f30617a);
    }

    @Override // com.waze.ifs.a.a
    public final void b() {
        com.waze.shared_infra.i.h.a("getMyWazeData - event");
        a aVar = new a();
        this.f30617a = aVar;
        MyWazeNativeManager myWazeNativeManager = this.f30619c;
        aVar.f30529c = myWazeNativeManager.getUserImageUrlNTV();
        this.f30617a.f30530d = myWazeNativeManager.getPointsNTV();
        this.f30617a.f30527a = myWazeNativeManager.getUserNameNTV();
        this.f30617a.f30528b = myWazeNativeManager.getNickNameNTV();
        this.f30617a.f30531e = myWazeNativeManager.getFirstNameNTV();
        this.f30617a.f30532f = myWazeNativeManager.getLastNameNTV();
        this.f30617a.f30533g = myWazeNativeManager.getSocialMoodNTV();
        this.f30617a.f30534h = myWazeNativeManager.getPasswordNTV();
        ProfileBasicInfo basicInfo = com.waze.sharedui.profile.b.a().b().getBasicInfo();
        this.f30617a.f30535i = basicInfo.getEmail();
        this.f30617a.f30536j = basicInfo.getEmailVerified();
        this.f30617a.f30537k = basicInfo.getEmailVerifier().getIconId();
        this.f30617a.f30538l = InboxNativeManager.getInstance().getInboxUnreadNTV();
        this.f30617a.m = InboxNativeManager.getInstance().getInboxBadgeNTV();
    }
}
