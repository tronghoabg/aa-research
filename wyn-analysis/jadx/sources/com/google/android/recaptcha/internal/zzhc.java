package com.google.android.recaptcha.internal;

import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class zzhc implements Iterable {
    public final String toString() {
        Iterator it = iterator();
        StringBuilder sb2 = new StringBuilder("[");
        boolean z2 = true;
        while (it.hasNext()) {
            if (!z2) {
                sb2.append(", ");
            }
            sb2.append(it.next());
            z2 = false;
        }
        sb2.append(']');
        return sb2.toString();
    }
}
