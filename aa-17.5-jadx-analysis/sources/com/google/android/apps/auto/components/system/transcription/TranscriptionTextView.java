package com.google.android.apps.auto.components.system.transcription;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import defpackage.ka;
import defpackage.odh;
import defpackage.odi;
import defpackage.tmb;
import defpackage.tme;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public final class TranscriptionTextView extends ka {
    public static final yph a = yph.c("GH.TranscriptionTxtV");
    public final odi b;
    public final ObjectAnimator c;
    public final tmb d;
    public long e;
    public String f;
    private final Property g;

    public TranscriptionTextView(Context context, AttributeSet attributeSet, tmb tmbVar) {
        super(context, attributeSet);
        odh odhVar = new odh(this, Integer.class);
        this.g = odhVar;
        odi odiVar = new odi();
        this.b = odiVar;
        this.c = ObjectAnimator.ofInt(odiVar, odhVar, 0, 255).setDuration(150L);
        this.f = "";
        this.d = tmbVar;
    }

    public final void a(CharSequence charSequence) {
        ((ype) ((ype) a.e()).ai((char) 5571)).y("#setFinalRecognizedText [finalText: %s]", charSequence);
        setText(charSequence);
    }

    public TranscriptionTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new tme());
    }
}
