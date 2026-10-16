package com.waze.settings.tree.views;

import android.content.res.Resources;
import android.view.View;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class w implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WazeSettingsView f37648a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f37649b;

    w(WazeSettingsView wazeSettingsView, int i2, byte[] bArr) {
        this.f37649b = i2;
        Objects.requireNonNull(wazeSettingsView);
        this.f37648a = wazeSettingsView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        int i2 = this.f37649b;
        if (i2 == 0) {
            this.f37648a.f37602f.d();
            return;
        }
        if (i2 != 1) {
            WazeSettingsView wazeSettingsView = this.f37648a;
            if (i2 != 2) {
                wazeSettingsView.P("");
                return;
            } else {
                wazeSettingsView.f37605i.d();
                return;
            }
        }
        WazeSettingsView wazeSettingsView2 = this.f37648a;
        if (wazeSettingsView2.u.a(!wazeSettingsView2.f37601e.isChecked())) {
            wazeSettingsView2.f37601e.toggle();
        }
    }

    w(WazeSettingsView wazeSettingsView, int i2) {
        this.f37649b = i2;
        Objects.requireNonNull(wazeSettingsView);
        this.f37648a = wazeSettingsView;
    }

    w(WazeSettingsView wazeSettingsView, int i2, char[] cArr) {
        this.f37649b = i2;
        Objects.requireNonNull(wazeSettingsView);
        this.f37648a = wazeSettingsView;
    }

    w(WazeSettingsView wazeSettingsView, int i2, short[] sArr) {
        this.f37649b = i2;
        Objects.requireNonNull(wazeSettingsView);
        this.f37648a = wazeSettingsView;
    }
}
