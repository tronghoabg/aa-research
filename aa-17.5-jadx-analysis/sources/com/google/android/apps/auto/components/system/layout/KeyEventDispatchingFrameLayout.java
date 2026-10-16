package com.google.android.apps.auto.components.system.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.ajmd;
import defpackage.mcd;
import defpackage.nwf;
import defpackage.nwr;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;

/* loaded from: classes2.dex */
public class KeyEventDispatchingFrameLayout extends FadePaddingFrameLayout {
    public static final yph a = yph.c("GH.KeyUpListenFrame");
    public ajmd b;

    public KeyEventDispatchingFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    @ResultIgnorabilityUnspecified
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ((ype) a.l().ai((char) 5418)).y("dispatchKeyEvent %s", keyEvent);
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        ajmd ajmdVar = this.b;
        if (ajmdVar != null && keyEvent.getAction() == 1 && keyEvent.getSource() != 1048584) {
            nwf nwfVar = (nwf) ajmdVar.a;
            nwr nwrVar = nwfVar.c;
            if (!nwrVar.c) {
                return true;
            }
            mcd.J(nwrVar, yzy.oo);
            nwfVar.c.g.run();
        }
        return false;
    }

    public KeyEventDispatchingFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeyEventDispatchingFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
