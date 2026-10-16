package com.waze.copilot.presentation;

import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final /* synthetic */ class t extends h.g.b.u implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f23160a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(Object obj, int i2) {
        super(0, obj, CopilotMarketplaceViewModel.class, "onFTEDialogDismiss", "onFTEDialogDismiss()V", 0);
        this.f23160a = i2;
    }

    @Override // h.g.a.a
    public final /* synthetic */ Object invoke() {
        int i2 = this.f23160a;
        if (i2 == 0) {
            ((CopilotMarketplaceViewModel) this.receiver).onFTEDialogDismiss();
            return ab.f48028a;
        }
        if (i2 == 1) {
            ((CopilotMarketplaceViewModel) this.receiver).onFTEDialogClick();
            return ab.f48028a;
        }
        Object obj = this.receiver;
        if (i2 != 2) {
            ((CopilotMarketplaceViewModel) obj).dismissDialog();
            return ab.f48028a;
        }
        ((CopilotMarketplaceViewModel) obj).dismissDialog();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(Object obj, int i2, byte[] bArr) {
        super(0, obj, CopilotMarketplaceViewModel.class, "onFTEDialogClick", "onFTEDialogClick()V", 0);
        this.f23160a = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(Object obj, int i2, char[] cArr) {
        super(0, obj, CopilotMarketplaceViewModel.class, "dismissDialog", "dismissDialog()V", 0);
        this.f23160a = i2;
    }
}
