package com.waze.uid.activities;

import android.app.Activity;
import android.support.v4.app.av;
import android.view.View;
import com.waze.ConfigManager;
import com.waze.config.ConfigValues;
import com.waze.settings.hd;
import com.waze.view.popups.a.ag;
import com.waze.web.SimpleWebActivity;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f44083a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f44084b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f44084b = i2;
        this.f44083a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44084b) {
            case 0:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.f());
                break;
            case 1:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.f());
                break;
            case 2:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.c());
                break;
            case 3:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.f());
                break;
            case 4:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.c());
                break;
            case 5:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.f());
                break;
            case 6:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.c());
                break;
            case 7:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.f());
                break;
            case 8:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.c());
                break;
            case 9:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.f());
                break;
            case 10:
                ((UidFragmentActivity) this.f44083a).f().o(new com.waze.uid.b.c());
                break;
            case 11:
                ((ag) this.f44083a).f(true);
                com.waze.settings.c.n.b(hd.f37382a, ConfigManager.getInstance());
                if (ConfigManager.getInstance().getConfigValueBool(ConfigValues.CONFIG_VALUE_CAR_TYPE_IS_FIRST_TIME)) {
                    ConfigManager.getInstance().setConfigValueBool(ConfigValues.CONFIG_VALUE_CAR_TYPE_IS_FIRST_TIME, false);
                    break;
                }
                break;
            case 12:
                Object obj = this.f44083a;
                if (obj instanceof av) {
                    ((av) obj).getOnBackPressedDispatcher().onBackPressed();
                    break;
                }
                break;
            case 13:
                Object obj2 = this.f44083a;
                if (obj2 instanceof Activity) {
                    Activity activity = (Activity) obj2;
                    activity.setResult(-1);
                    activity.finish();
                    break;
                }
                break;
            case 14:
                SimpleWebActivity simpleWebActivity = (SimpleWebActivity) this.f44083a;
                simpleWebActivity.setResult(3);
                simpleWebActivity.finish();
                break;
            case 15:
                com.waze.web.i.s();
                break;
            default:
                com.waze.web.i.j((com.waze.web.i) this.f44083a);
                break;
        }
    }
}
