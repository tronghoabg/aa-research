package com.vungle.ads.internal.network;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public enum g {
    GET,
    POST;


    @NotNull
    public static final f Companion = new Object() { // from class: com.vungle.ads.internal.network.f
        @NotNull
        public final KSerializer serializer() {
            return e.f33406a;
        }
    };
}
