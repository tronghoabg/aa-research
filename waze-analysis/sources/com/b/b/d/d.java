package com.b.b.d;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @JsonProperty(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    @com.google.l.a.b(a = ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    public final String f2631a;

    public d(String str) {
        this.f2631a = str;
    }
}
