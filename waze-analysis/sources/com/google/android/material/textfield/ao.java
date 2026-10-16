package com.google.android.material.textfield;

import android.app.Activity;
import com.waze.inbox.InboxNativeManager;
import com.waze.inbox.InboxRecycler;
import com.waze.location.LocationSensorListener;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class ao implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6875a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6876b;

    ao(TextInputLayout textInputLayout, int i2, byte[] bArr) {
        this.f6876b = i2;
        Objects.requireNonNull(textInputLayout);
        this.f6875a = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6876b) {
            case 0:
                ((TextInputLayout) this.f6875a).f6797a.requestLayout();
                break;
            case 1:
                ((TextInputLayout) this.f6875a).f6803h.p();
                break;
            case 2:
                com.waze.google_assistant.aa aaVar = (com.waze.google_assistant.aa) this.f6875a;
                aaVar.f24063d.connect(aaVar.n);
                break;
            case 3:
                ((Activity) this.f6875a).finish();
                break;
            case 4:
                ((com.waze.ifs.a.a) this.f6875a).a();
                break;
            case 5:
                com.waze.ifs.ui.at.d((com.waze.ifs.ui.at) this.f6875a);
                break;
            case 6:
                ((com.waze.inbox.i) this.f6875a).h();
                break;
            case 7:
                ((com.waze.inbox.i) this.f6875a).f24651g.setVisibility(8);
                break;
            case 8:
                com.waze.inbox.i.c((com.waze.inbox.i) this.f6875a);
                break;
            case 9:
                ((com.waze.inbox.i) this.f6875a).n();
                break;
            case 10:
                ((InboxNativeManager) this.f6875a).registerDataListenerNTV();
                break;
            case 11:
                InboxRecycler.aI((InboxRecycler) this.f6875a);
                break;
            case 12:
                ((InboxRecycler) this.f6875a).aQ();
                break;
            case 13:
                InboxRecycler.aK((InboxRecycler) this.f6875a);
                break;
            case 14:
                ((LocationSensorListener) this.f6875a).lambda$setLocationAfterAppServiceStart$0();
                break;
            case 15:
                ((LocationSensorListener) this.f6875a).lambda$initRotationVectors$0();
                break;
            case 16:
                com.waze.main.navigate.e.h((com.waze.main.navigate.e) this.f6875a);
                break;
            case 17:
                com.waze.main_screen.bottom_bars.b.a.c((com.waze.main_screen.bottom_bars.b.a) this.f6875a);
                break;
            case 18:
                com.waze.main_screen.bottom_bars.b.a.d((com.waze.main_screen.bottom_bars.b.a) this.f6875a);
                break;
            case 19:
                com.waze.main_screen.bottom_bars.scrollable_eta.d.c((com.waze.main_screen.bottom_bars.scrollable_eta.d) this.f6875a);
                break;
            default:
                com.waze.main_screen.g.d.d((com.waze.main_screen.g.d) this.f6875a);
                break;
        }
    }

    public /* synthetic */ ao(Object obj, int i2) {
        this.f6876b = i2;
        this.f6875a = obj;
    }
}
