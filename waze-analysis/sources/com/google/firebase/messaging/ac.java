package com.google.firebase.messaging;

import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ac extends Exception {
    ac(String str) {
        super(str);
        if (str == null) {
            return;
        }
        str.toLowerCase(Locale.US).hashCode();
    }
}
