package com.google.android.libraries.assistant.appintegration.shared.util;

import com.google.android.libraries.assistant.appintegration.shared.proto.AssistantConversationStateChangedEvent;
import com.google.android.libraries.assistant.appintegration.shared.proto.VoicePlateStateChangedEvent;
import com.google.v.de;
import e.a.g.a.c;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ExtensionRegistryUtils {
    private static final AtomicBoolean isRegistered = new AtomicBoolean(false);

    private ExtensionRegistryUtils() {
    }

    public static de getRegistry() {
        de deVarC = de.c();
        AssistantConversationStateChangedEvent.registerAllExtensions(deVarC);
        VoicePlateStateChangedEvent.registerAllExtensions(deVarC);
        return deVarC;
    }

    public static void setRegistry() {
        if (isRegistered.compareAndSet(false, true)) {
            c.b(getRegistry());
        }
    }
}
