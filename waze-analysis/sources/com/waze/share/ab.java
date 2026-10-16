package com.waze.share;

import com.waze.R;
import com.waze.messages.MessagesNativeManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab implements com.waze.sharedui.g.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.sharedui.g.i f37693a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ViewShareDriveActivity f37694b;

    ab(ViewShareDriveActivity viewShareDriveActivity, com.waze.sharedui.g.i iVar) {
        this.f37693a = iVar;
        Objects.requireNonNull(viewShareDriveActivity);
        this.f37694b = viewShareDriveActivity;
    }

    @Override // com.waze.sharedui.g.b
    public final void a(int i2) {
        if (i2 == 0) {
            ViewShareDriveActivity viewShareDriveActivity = this.f37694b;
            MessagesNativeManager.getInstance().sendMessage(viewShareDriveActivity.o, viewShareDriveActivity.t.c(R.string.SHARE_REPLY_1, new Object[0]));
        } else if (i2 == 1) {
            ViewShareDriveActivity viewShareDriveActivity2 = this.f37694b;
            MessagesNativeManager.getInstance().sendMessage(viewShareDriveActivity2.o, viewShareDriveActivity2.t.c(R.string.SHARE_REPLY_2, new Object[0]));
        }
        this.f37693a.dismiss();
    }

    @Override // com.waze.sharedui.g.b
    public final int b() {
        return 2;
    }

    @Override // com.waze.sharedui.g.b
    public final void c(int i2, com.waze.sharedui.g.e eVar) {
        if (i2 == 0) {
            eVar.f(this.f37694b.t.c(R.string.SHARE_REPLY_1, new Object[0]));
        } else {
            if (i2 != 1) {
                return;
            }
            eVar.f(this.f37694b.t.c(R.string.SHARE_REPLY_2, new Object[0]));
        }
    }
}
