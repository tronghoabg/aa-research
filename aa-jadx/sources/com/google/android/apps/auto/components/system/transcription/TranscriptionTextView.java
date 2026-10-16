package com.google.android.apps.auto.components.system.transcription;

/* JADX INFO: loaded from: classes2.dex */
public final class TranscriptionTextView extends defpackage.kb {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.TranscriptionTxtV");
    public final defpackage.oec b;
    public final android.animation.ObjectAnimator c;
    public final defpackage.tmy d;
    public long e;
    public java.lang.String f;
    private final android.util.Property g;

    public TranscriptionTextView(android.content.Context context, android.util.AttributeSet attributeSet, defpackage.tmy tmyVar) {
        super(context, attributeSet);
        defpackage.oeb oebVar = new defpackage.oeb(this, java.lang.Integer.class);
        this.g = oebVar;
        defpackage.oec oecVar = new defpackage.oec();
        this.b = oecVar;
        this.c = android.animation.ObjectAnimator.ofInt(oecVar, oebVar, 0, 255).setDuration(150L);
        this.f = "";
        this.d = tmyVar;
    }

    public final void a(java.lang.CharSequence charSequence) {
        ((defpackage.yqj) ((defpackage.yqj) a.e()).ai((char) 5597)).y("#setFinalRecognizedText [finalText: %s]", charSequence);
        setText(charSequence);
    }

    public TranscriptionTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, new defpackage.tnc());
    }
}
