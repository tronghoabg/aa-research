package com.qonversion.android.sdk.automations;

import com.qonversion.android.sdk.automations.dto.AutomationsEvent;
import com.qonversion.android.sdk.automations.dto.QActionResult;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public interface AutomationsDelegate {
    void automationsDidFailExecuting(@NotNull QActionResult qActionResult);

    void automationsDidFinishExecuting(@NotNull QActionResult qActionResult);

    void automationsDidShowScreen(@NotNull String str);

    void automationsDidStartExecuting(@NotNull QActionResult qActionResult);

    void automationsFinished();

    Boolean shouldHandleEvent(@NotNull AutomationsEvent automationsEvent, @NotNull Map<String, String> map);
}
