package M3;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g.C2658f;
import g.InterfaceC2654b;

/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7487a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7488b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7489c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f7490d;

    public /* synthetic */ i(Object obj, int i5, Object obj2, int i10) {
        this.f7487a = i10;
        this.f7490d = obj;
        this.f7488b = i5;
        this.f7489c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2654b interfaceC2654b;
        switch (this.f7487a) {
            case 0:
                ((j) this.f7489c).a((Intent) this.f7490d, this.f7488b);
                break;
            case 1:
                ((BottomSheetBehavior) this.f7490d).C((View) this.f7489c, this.f7488b, false);
                break;
            case 2:
                ((SystemForegroundService) this.f7490d).f19088e.notify(this.f7488b, (Notification) this.f7489c);
                break;
            case 3:
                Object obj = ((R.e) this.f7489c).f10014a;
                androidx.activity.f fVar = (androidx.activity.f) this.f7490d;
                String str = (String) fVar.f35468a.get(Integer.valueOf(this.f7488b));
                if (str != null) {
                    C2658f c2658f = (C2658f) fVar.f35472e.get(str);
                    if (c2658f != null && (interfaceC2654b = c2658f.f35464a) != null) {
                        if (fVar.f35471d.remove(str)) {
                            interfaceC2654b.onActivityResult(obj);
                            break;
                        }
                    } else {
                        fVar.f35474g.remove(str);
                        fVar.f35473f.put(str, obj);
                        break;
                    }
                }
                break;
            case 4:
                ((androidx.activity.f) this.f7490d).a(this.f7488b, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f7489c));
                break;
            case 5:
                ((TextView) this.f7489c).setTypeface((Typeface) this.f7490d, this.f7488b);
                break;
            default:
                ((u.f) this.f7490d).f46068b.onNavigationEvent(this.f7488b, (Bundle) this.f7489c);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, int i5, int i10) {
        this.f7487a = i10;
        this.f7489c = obj;
        this.f7490d = obj2;
        this.f7488b = i5;
    }

    public i(BottomSheetBehavior bottomSheetBehavior, View view, int i5) {
        this.f7487a = 1;
        this.f7490d = bottomSheetBehavior;
        this.f7489c = view;
        this.f7488b = i5;
    }
}
