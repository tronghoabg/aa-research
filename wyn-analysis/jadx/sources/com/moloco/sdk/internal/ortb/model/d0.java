package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.C1909x;
import org.jetbrains.annotations.NotNull;

@Sf.e
/* loaded from: classes4.dex */
public final class d0 {

    @NotNull
    public static final C1909x.b Companion = new C1909x.b();

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f28792a;

    /* renamed from: b, reason: collision with root package name */
    public final U f28793b;

    public /* synthetic */ d0(int i5, Boolean bool, U u10) {
        if ((i5 & 1) == 0) {
            this.f28792a = null;
        } else {
            this.f28792a = bool;
        }
        if ((i5 & 2) == 0) {
            this.f28793b = null;
        } else {
            this.f28793b = u10;
        }
    }
}
