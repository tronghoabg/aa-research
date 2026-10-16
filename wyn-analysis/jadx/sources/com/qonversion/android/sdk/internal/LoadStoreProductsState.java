package com.qonversion.android.sdk.internal;

import ic.d;
import kotlin.Metadata;
import mf.InterfaceC3559a;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/qonversion/android/sdk/internal/LoadStoreProductsState;", "", "(Ljava/lang/String;I)V", "NotStartedYet", "Loading", "Loaded", "Failed", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LoadStoreProductsState {
    private static final /* synthetic */ InterfaceC3559a $ENTRIES;
    private static final /* synthetic */ LoadStoreProductsState[] $VALUES;
    public static final LoadStoreProductsState NotStartedYet = new LoadStoreProductsState("NotStartedYet", 0);
    public static final LoadStoreProductsState Loading = new LoadStoreProductsState("Loading", 1);
    public static final LoadStoreProductsState Loaded = new LoadStoreProductsState("Loaded", 2);
    public static final LoadStoreProductsState Failed = new LoadStoreProductsState("Failed", 3);

    private static final /* synthetic */ LoadStoreProductsState[] $values() {
        return new LoadStoreProductsState[]{NotStartedYet, Loading, Loaded, Failed};
    }

    static {
        LoadStoreProductsState[] loadStoreProductsStateArr$values = $values();
        $VALUES = loadStoreProductsStateArr$values;
        $ENTRIES = d.t(loadStoreProductsStateArr$values);
    }

    private LoadStoreProductsState(String str, int i5) {
    }

    @NotNull
    public static InterfaceC3559a getEntries() {
        return $ENTRIES;
    }

    public static LoadStoreProductsState valueOf(String str) {
        return (LoadStoreProductsState) Enum.valueOf(LoadStoreProductsState.class, str);
    }

    public static LoadStoreProductsState[] values() {
        return (LoadStoreProductsState[]) $VALUES.clone();
    }
}
