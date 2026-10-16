package com.qonversion.android.sdk.internal;

import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/internal/AppState;", "", "(Ljava/lang/String;I)V", "isBackground", "", "Foreground", "Background", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppState {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ AppState[] $VALUES;
    public static final AppState Foreground = new AppState("Foreground", 0);
    public static final AppState Background = new AppState("Background", 1);

    private static final /* synthetic */ AppState[] $values() {
        return new AppState[]{Foreground, Background};
    }

    static {
        AppState[] appStateArr$values = $values();
        $VALUES = appStateArr$values;
        $ENTRIES = d.t(appStateArr$values);
    }

    private AppState(String str, int i5) {
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static AppState valueOf(String str) {
        return (AppState) Enum.valueOf(AppState.class, str);
    }

    public static AppState[] values() {
        return (AppState[]) $VALUES.clone();
    }

    public final boolean isBackground() {
        return this == Background;
    }
}
