package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import r5.C3925b;
import u5.AbstractC4252c;
import u5.C4251b;
import u5.InterfaceC4255f;

@Keep
/* loaded from: classes3.dex */
public class CctBackendFactory {
    public InterfaceC4255f create(AbstractC4252c abstractC4252c) {
        C4251b c4251b = (C4251b) abstractC4252c;
        return new C3925b(c4251b.f46649a, c4251b.f46650b, c4251b.f46651c);
    }
}
