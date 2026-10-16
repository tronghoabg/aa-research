package com.google.android.material.datepicker;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.waze.config.ConfigValues;
import com.waze.config.DebugConfigListActivity;
import com.waze.favorites.AddFavoriteActivity;
import com.waze.favorites.AddHomeWorkActivity;
import com.waze.google_assistant.SpeechRecognizerActivity;
import com.waze.sharedui.views.WazeTextView;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class ac implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6367a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6368b;

    public /* synthetic */ ac(Object obj, int i2) {
        this.f6368b = i2;
        this.f6367a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [h.g.a.l, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6368b) {
            case 0:
                ((ag) this.f6367a).j();
                break;
            case 1:
                ag.h((ag) this.f6367a);
                break;
            case 2:
                ((ag) this.f6367a).c(view);
                break;
            case 3:
                com.waze.sharedui.web.at.f(((WazeTextView) this.f6367a).getContext(), ConfigValues.CONFIG_VALUE_GDPR_PRIVACY_SETTINGS_PRIVACY_POLICY_URL.b());
                break;
            case 4:
                ((ComponentActivity) this.f6367a).onBackPressed();
                break;
            case 5:
                this.f6367a.invoke(com.waze.a.t.f13650a);
                break;
            case 6:
                ((DebugConfigListActivity) this.f6367a).finish();
                break;
            case 7:
                ((ComponentActivity) this.f6367a).onBackPressed();
                break;
            case 8:
                ((com.waze.design_components.cta_bar.b) this.f6367a).i().invoke();
                break;
            case 9:
                ((com.waze.design_components.cta_bar.c) this.f6367a).d().i().invoke();
                break;
            case 10:
                ((com.waze.design_components.cta_bar.c) this.f6367a).e().i().invoke();
                break;
            case 11:
                ((com.waze.destination_cell.view.c) this.f6367a).f23544a.m();
                break;
            case 12:
                ((com.waze.destination_cell.view.c) this.f6367a).f23544a.n();
                break;
            case 13:
                ((com.waze.destination_cell.view.c) this.f6367a).f23544a.f();
                break;
            case 14:
                ((com.waze.destination_cell.view.c) this.f6367a).f23544a.f();
                break;
            case 15:
                ((com.waze.ab.s) this.f6367a).f13821b.d();
                break;
            case 16:
                AddFavoriteActivity addFavoriteActivity = (AddFavoriteActivity) this.f6367a;
                addFavoriteActivity.setResult(-1);
                addFavoriteActivity.finish();
                break;
            case 17:
                ((ComponentActivity) this.f6367a).onBackPressed();
                break;
            case 18:
                Object obj = this.f6367a;
                ((ComponentActivity) obj).startActivityForResult(new Intent((Context) obj, (Class<?>) SpeechRecognizerActivity.class), 4097);
                break;
            case 19:
                ((AddHomeWorkActivity) this.f6367a).o(3);
                break;
            default:
                ((AddHomeWorkActivity) this.f6367a).o(4);
                break;
        }
    }
}
