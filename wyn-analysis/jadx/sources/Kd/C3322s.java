package kd;

import android.content.Context;
import android.hardware.display.DisplayManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: kd.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3322s {

    /* renamed from: a, reason: collision with root package name */
    public final C8.i f39693a;

    public C3322s(C8.i pigeonRegistrar, int i5) {
        switch (i5) {
            case 1:
                AbstractC3340k.e(pigeonRegistrar, "pigeonRegistrar");
                this.f39693a = pigeonRegistrar;
                break;
            case 2:
                AbstractC3340k.e(pigeonRegistrar, "pigeonRegistrar");
                this.f39693a = pigeonRegistrar;
                break;
            default:
                AbstractC3340k.e(pigeonRegistrar, "pigeonRegistrar");
                this.f39693a = pigeonRegistrar;
                break;
        }
    }

    public a0 a() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        DisplayManager displayManager = (DisplayManager) ((Context) this.f39693a.f1939b).getSystemService("display");
        ArrayList arrayListV0 = com.moloco.sdk.internal.publisher.H.v0(displayManager);
        a0 a0Var = new a0(this);
        ArrayList arrayListV02 = com.moloco.sdk.internal.publisher.H.v0(displayManager);
        arrayListV02.removeAll(arrayListV0);
        if (!arrayListV02.isEmpty()) {
            Iterator it = arrayListV02.iterator();
            while (it.hasNext()) {
                displayManager.unregisterDisplayListener((DisplayManager.DisplayListener) it.next());
                displayManager.registerDisplayListener(new io.flutter.view.s(arrayListV02, displayManager, 1), null);
            }
        }
        return a0Var;
    }
}
