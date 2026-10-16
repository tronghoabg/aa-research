package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class VoiceSessionConfig extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.VoiceSessionConfig> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.VoiceSessionConfig.class);
    public int a;
    public com.google.android.gearhead.sdk.assistant.MessagingInfo b;
    public java.lang.String c;
    public android.net.Uri d;
    public int e;
    public int f;
    public long g;
    public android.os.Bundle h;
    public boolean i;
    public boolean j;
    public java.lang.String k;
    public defpackage.qkc l;
    public java.lang.String m;
    public boolean n;
    public boolean o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        defpackage.qkc qkaVar;
        this.a = bundle.getInt("VOICE_SESSION_TYPE");
        android.os.Bundle bundle2 = bundle.getBundle("MESSAGING_INFO");
        if (bundle2 != null) {
            com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo = new com.google.android.gearhead.sdk.assistant.MessagingInfo();
            this.b = messagingInfo;
            messagingInfo.a(bundle2);
        }
        this.c = bundle.getString("QUERY_STRING");
        this.d = (android.net.Uri) bundle.getParcelable("AUDIO_INPUT_URI");
        this.e = bundle.getInt("AUDIO_INPUT_SAMPLING_RATE");
        this.f = bundle.getInt("VOICE_SESSION_TRIGGER");
        this.g = bundle.getLong("STARTED_MILLIS");
        this.h = bundle.getBundle("CUSTOM_PAYLOAD");
        this.i = bundle.getBoolean("FUSION_REQUESTED");
        this.n = bundle.getBoolean("MESSAGE_SUMMARY_ENABLED");
        this.j = bundle.getBoolean("IS_SENDING_ORIGINAL_SBN");
        this.k = bundle.getString("GEARHEAD_VERSION_NAME");
        android.os.IBinder binder = bundle.getBinder("TRANSCRIPTION_CALLBACK");
        if (binder == null) {
            qkaVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.gearhead.sdk.assistant.ITranscriptionCallback");
            qkaVar = iInterfaceQueryLocalInterface instanceof defpackage.qkc ? (defpackage.qkc) iInterfaceQueryLocalInterface : new defpackage.qka(binder);
        }
        this.l = qkaVar;
        this.m = bundle.getString("SUGGESTION_ACTION_ID");
        this.o = bundle.getBoolean("barge_in_enabled");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putInt("VOICE_SESSION_TYPE", this.a);
        if (this.b != null) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            this.b.b(bundle2);
            bundle.putBundle("MESSAGING_INFO", bundle2);
        }
        bundle.putString("QUERY_STRING", this.c);
        bundle.putParcelable("AUDIO_INPUT_URI", this.d);
        bundle.putInt("AUDIO_INPUT_SAMPLING_RATE", this.e);
        bundle.putInt("VOICE_SESSION_TRIGGER", this.f);
        bundle.putLong("STARTED_MILLIS", this.g);
        bundle.putBundle("CUSTOM_PAYLOAD", this.h);
        bundle.putBoolean("FUSION_REQUESTED", this.i);
        bundle.putBoolean("MESSAGE_SUMMARY_ENABLED", this.n);
        bundle.putBoolean("IS_SENDING_ORIGINAL_SBN", this.j);
        bundle.putString("GEARHEAD_VERSION_NAME", this.k);
        defpackage.qkc qkcVar = this.l;
        if (qkcVar != null) {
            bundle.putBinder("TRANSCRIPTION_CALLBACK", qkcVar.asBinder());
        }
        bundle.putString("SUGGESTION_ACTION_ID", this.m);
        bundle.putBoolean("barge_in_enabled", this.o);
    }
}
