package com.waze.settings;

import com.waze.NativeManager;
import j$.util.Objects;
import java.util.Comparator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bz implements Comparator {
    bz(SettingsHOVSearchActivity settingsHOVSearchActivity) {
        Objects.requireNonNull(settingsHOVSearchActivity);
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((NativeManager.HOVPermitDescriptor) obj).name.compareTo(((NativeManager.HOVPermitDescriptor) obj2).name);
    }
}
