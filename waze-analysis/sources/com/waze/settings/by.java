package com.waze.settings;

import android.text.Editable;
import android.text.TextWatcher;
import com.waze.NativeManager;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class by implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SettingsHOVSearchActivity f36921a;

    by(SettingsHOVSearchActivity settingsHOVSearchActivity) {
        Objects.requireNonNull(settingsHOVSearchActivity);
        this.f36921a = settingsHOVSearchActivity;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        SettingsHOVSearchActivity settingsHOVSearchActivity = this.f36921a;
        settingsHOVSearchActivity.f36688h.clear();
        String lowerCase = editable.toString().toLowerCase();
        for (NativeManager.HOVPermitDescriptor hOVPermitDescriptor : settingsHOVSearchActivity.f36687g) {
            if (hOVPermitDescriptor.name.toLowerCase().contains(lowerCase)) {
                settingsHOVSearchActivity.f36688h.add(hOVPermitDescriptor);
            }
        }
        settingsHOVSearchActivity.f36690l.notifyDataSetChanged();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
