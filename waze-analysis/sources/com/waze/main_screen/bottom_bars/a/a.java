package com.waze.main_screen.bottom_bars.a;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ap;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.waze.ConfigManager;
import com.waze.bb.c;
import com.waze.config.ConfigValues;
import com.waze.google_assistant.SpeechRecognizerActivity;
import com.waze.menus.SideMenuSearchBar;
import com.waze.mywaze.l;
import com.waze.navbar.f;
import com.waze.navbar.p;
import com.waze.navigate.AutocompleteSearchActivity;
import com.waze.navigate.HistoryActivity;
import com.waze.navigate.social.ShareHelpActivity;
import com.waze.sharedui.web.at;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f25919a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f25920b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f25920b = i2;
        this.f25919a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f25920b) {
            case 0:
                b.i((b) this.f25919a);
                break;
            case 1:
                SideMenuSearchBar.o((SideMenuSearchBar) this.f25919a);
                break;
            case 2:
                l.n((l) this.f25919a);
                break;
            case 3:
                l.o((l) this.f25919a);
                break;
            case 4:
                l.p((l) this.f25919a);
                break;
            case 5:
                l.k((l) this.f25919a);
                break;
            case 6:
                ((f) this.f25919a).A.c();
                break;
            case 7:
                ((p) this.f25919a).r.a();
                break;
            case 8:
                p.E((p) this.f25919a);
                break;
            case 9:
                p.H((p) this.f25919a);
                break;
            case 10:
                p.k((p) this.f25919a, view);
                break;
            case 11:
                ((ComponentActivity) this.f25919a).onBackPressed();
                break;
            case 12:
                AutocompleteSearchActivity autocompleteSearchActivity = (AutocompleteSearchActivity) this.f25919a;
                autocompleteSearchActivity.setResult(-1);
                autocompleteSearchActivity.finish();
                break;
            case 13:
                Object obj = this.f25919a;
                ((ComponentActivity) obj).startActivityForResult(new Intent((Context) obj, (Class<?>) SpeechRecognizerActivity.class), 4097);
                break;
            case 14:
                ((ComponentActivity) this.f25919a).onBackPressed();
                break;
            case 15:
                HistoryActivity historyActivity = (HistoryActivity) this.f25919a;
                historyActivity.setResult(-1);
                historyActivity.finish();
                break;
            case 16:
                ((ComponentActivity) this.f25919a).onBackPressed();
                break;
            case 17:
                ShareHelpActivity shareHelpActivity = (ShareHelpActivity) this.f25919a;
                shareHelpActivity.setResult(-1);
                shareHelpActivity.finish();
                break;
            case 18:
                c.a((c) this.f25919a);
                break;
            case 19:
                at.f(((c) this.f25919a).getContext(), ConfigManager.getInstance().getConfigValueString(ConfigValues.CONFIG_VALUE_SOCIAL_CONTACTS_APPROVE_CONTACTS_INFO_URL));
                break;
            default:
                ((ap) this.f25919a).dismiss();
                break;
        }
    }
}
