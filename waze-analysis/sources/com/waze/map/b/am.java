package com.waze.map.b;

import android.app.Dialog;
import androidx.activity.OnBackPressedCallback;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class am implements com.waze.shared_infra.s.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f28006a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f28007b;

    public /* synthetic */ am(Object obj, int i2) {
        this.f28007b = i2;
        this.f28006a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlinx.coroutines.af] */
    @Override // com.waze.shared_infra.s.d
    public final void a() throws Exception {
        switch (this.f28007b) {
            case 0:
                int i2 = bd.f28054a;
                ((kotlinx.coroutines.br) this.f28006a).s(null);
                break;
            case 1:
                ((OnBackPressedCallback) this.f28006a).remove();
                break;
            case 2:
                kotlinx.coroutines.aj.h(this.f28006a, null);
                break;
            case 3:
                ((Dialog) this.f28006a).dismiss();
                break;
            case 4:
                ((android.support.v7.app.ap) this.f28006a).dismiss();
                break;
            case 5:
                ((android.support.v7.app.ap) this.f28006a).dismiss();
                break;
            case 6:
                ((android.support.v7.app.ap) this.f28006a).dismiss();
                break;
            case 7:
                ((android.support.v7.app.ap) this.f28006a).dismiss();
                break;
            default:
                Object obj = this.f28006a;
                if (((com.waze.bb.c) obj).isShowing()) {
                    ((android.support.v7.app.ap) obj).dismiss();
                    break;
                }
                break;
        }
    }
}
