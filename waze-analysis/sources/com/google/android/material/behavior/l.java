package com.google.android.material.behavior;

import androidx.core.view.accessibility.AccessibilityViewCommand;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l implements AccessibilityViewCommand {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ SwipeDismissBehavior f6264a;

    l(SwipeDismissBehavior swipeDismissBehavior) {
        Objects.requireNonNull(swipeDismissBehavior);
        this.f6264a = swipeDismissBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean perform(android.view.View r4, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments r5) {
        /*
            r3 = this;
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r3.f6264a
            boolean r5 = r3.c(r4)
            r0 = 0
            if (r5 == 0) goto L38
            int r5 = r4.getLayoutDirection()
            r1 = 1
            if (r5 != r1) goto L12
            r5 = r1
            goto L13
        L12:
            r5 = r0
        L13:
            int r2 = r3.f6246c
            if (r2 != 0) goto L1a
            if (r5 != 0) goto L1f
            goto L1b
        L1a:
            r0 = r5
        L1b:
            if (r2 != r1) goto L25
            if (r0 != 0) goto L25
        L1f:
            int r5 = r4.getWidth()
            int r5 = -r5
            goto L29
        L25:
            int r5 = r4.getWidth()
        L29:
            androidx.core.view.ViewCompat.offsetLeftAndRight(r4, r5)
            r5 = 0
            r4.setAlpha(r5)
            com.google.android.material.behavior.m r3 = r3.f6245b
            if (r3 == 0) goto L37
            r3.a(r4)
        L37:
            return r1
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.l.perform(android.view.View, androidx.core.view.accessibility.AccessibilityViewCommand$CommandArguments):boolean");
    }
}
