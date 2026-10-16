package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oeb extends android.util.Property {
    final /* synthetic */ com.google.android.apps.auto.components.system.transcription.TranscriptionTextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oeb(com.google.android.apps.auto.components.system.transcription.TranscriptionTextView transcriptionTextView, java.lang.Class cls) {
        super(cls, "mAlphaSpanProperty");
        this.a = transcriptionTextView;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return java.lang.Integer.valueOf(((defpackage.oec) obj).a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(java.lang.Object obj, java.lang.Object obj2) {
        ((defpackage.oec) obj).a = ((java.lang.Integer) obj2).intValue();
        this.a.invalidate();
    }
}
