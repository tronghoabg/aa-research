package com.b.a.a.a;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum e {
    AUTOMOTIVE("automotive"),
    DEFAULT("default"),
    NAVIGATION("navigation"),
    FITNESS("fitness"),
    WAKE("wake"),
    SLEEP("sleep");


    /* renamed from: g, reason: collision with root package name */
    @JsonProperty(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    @com.google.l.a.b(a = ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY)
    public final String f2530g;

    e(String str) {
        this.f2530g = str;
    }
}
