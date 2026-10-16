package com.waze.favorites;

import android.view.KeyEvent;
import android.widget.TextView;
import com.waze.menus.SideMenuSearchBar;
import com.waze.navigate.AutocompleteSearchActivity;
import com.waze.rtalerts.RtAlertsComments;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class s implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23822a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23823b;

    s(AddFavoriteActivity addFavoriteActivity, int i2) {
        this.f23823b = i2;
        Objects.requireNonNull(addFavoriteActivity);
        this.f23822a = addFavoriteActivity;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
        int i3 = this.f23823b;
        if (i3 == 0) {
            return v.i((v) this.f23822a, i2, keyEvent);
        }
        if (i3 == 1) {
            if (i2 == 3) {
                ((AddFavoriteActivity) this.f23822a).l();
            }
            if (keyEvent != null && keyEvent.getAction() == 1) {
                ((AddFavoriteActivity) this.f23822a).l();
            }
            return true;
        }
        if (i3 == 2) {
            SideMenuSearchBar.m((SideMenuSearchBar) this.f23822a, i2, keyEvent);
            return true;
        }
        Object obj = this.f23822a;
        if (i3 != 3) {
            return RtAlertsComments.q((RtAlertsComments) obj, i2);
        }
        AutocompleteSearchActivity.q((AutocompleteSearchActivity) obj, i2, keyEvent);
        return true;
    }

    public /* synthetic */ s(Object obj, int i2) {
        this.f23823b = i2;
        this.f23822a = obj;
    }
}
