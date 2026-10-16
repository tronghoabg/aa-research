package com.waze.design_components.c;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.ar;
import android.view.View;
import androidx.activity.ComponentActivity;
import com.waze.favorites.AddHomeWorkActivity;
import com.waze.favorites.FavoritesActivity;
import com.waze.favorites.v;
import com.waze.install.SelectCountryActivity;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23388a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23389b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f23389b = i2;
        this.f23388a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23389b) {
            case 0:
                i.e((i) this.f23388a);
                break;
            case 1:
                AddHomeWorkActivity addHomeWorkActivity = (AddHomeWorkActivity) this.f23388a;
                addHomeWorkActivity.setResult(-1);
                addHomeWorkActivity.finish();
                break;
            case 2:
                ((ComponentActivity) this.f23388a).onBackPressed();
                break;
            case 3:
                ((ComponentActivity) this.f23388a).onBackPressed();
                break;
            case 4:
                FavoritesActivity.A((FavoritesActivity) this.f23388a);
                break;
            case 5:
                ((ComponentActivity) this.f23388a).onBackPressed();
                break;
            case 6:
                ((v) this.f23388a).k();
                break;
            case 7:
                ((v) this.f23388a).l();
                break;
            case 8:
                ((v) this.f23388a).f23831b.setText("");
                break;
            case 9:
                ((ComponentActivity) this.f23388a).onBackPressed();
                break;
            case 10:
                ((ar) this.f23388a).requireActivity().onBackPressed();
                break;
            case 11:
                ((ar) this.f23388a).requireActivity().onBackPressed();
                break;
            case 12:
                com.waze.inbox.i.p();
                break;
            case 13:
                com.waze.inbox.i.k((com.waze.inbox.i) this.f23388a);
                break;
            case 14:
                com.waze.inbox.i.i((com.waze.inbox.i) this.f23388a);
                break;
            case 15:
                ((com.waze.inbox.i) this.f23388a).f24645a.aN();
                break;
            case 16:
                ((com.waze.inbox.j) this.f23388a).c();
                break;
            case 17:
                com.waze.inbox.j.e((com.waze.inbox.j) this.f23388a);
                break;
            case 18:
                Object obj = this.f23388a;
                ((ComponentActivity) obj).startActivityForResult(new Intent((Context) obj, (Class<?>) SelectCountryActivity.class), 1);
                break;
            case 19:
                SelectCountryActivity selectCountryActivity = (SelectCountryActivity) this.f23388a;
                selectCountryActivity.setResult(-1);
                selectCountryActivity.finish();
                break;
            default:
                ((ComponentActivity) this.f23388a).onBackPressed();
                break;
        }
    }
}
