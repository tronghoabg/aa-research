package com.google.android.gearhead.sdk.assistant;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import defpackage.qiz;
import defpackage.qje;
import defpackage.qjg;

/* loaded from: classes2.dex */
public class VoiceSessionConfig extends AbstractBundleable {
    public static final Parcelable.Creator<VoiceSessionConfig> CREATOR = new qiz(VoiceSessionConfig.class);
    public int a;
    public MessagingInfo b;
    public String c;
    public Uri d;
    public int e;
    public int f;
    public long g;
    public Bundle h;
    public boolean i;
    public boolean j;
    public String k;
    public qjg l;
    public String m;
    public boolean n;
    public boolean o;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        qjg qjeVar;
        this.a = bundle.getInt("VOICE_SESSION_TYPE");
        Bundle bundle2 = bundle.getBundle("MESSAGING_INFO");
        if (bundle2 != null) {
            MessagingInfo messagingInfo = new MessagingInfo();
            this.b = messagingInfo;
            messagingInfo.a(bundle2);
        }
        this.c = bundle.getString("QUERY_STRING");
        this.d = (Uri) bundle.getParcelable("AUDIO_INPUT_URI");
        this.e = bundle.getInt("AUDIO_INPUT_SAMPLING_RATE");
        this.f = bundle.getInt("VOICE_SESSION_TRIGGER");
        this.g = bundle.getLong("STARTED_MILLIS");
        this.h = bundle.getBundle("CUSTOM_PAYLOAD");
        this.i = bundle.getBoolean("FUSION_REQUESTED");
        this.n = bundle.getBoolean("MESSAGE_SUMMARY_ENABLED");
        this.j = bundle.getBoolean("IS_SENDING_ORIGINAL_SBN");
        this.k = bundle.getString("GEARHEAD_VERSION_NAME");
        IBinder binder = bundle.getBinder("TRANSCRIPTION_CALLBACK");
        if (binder == null) {
            qjeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("com.google.android.gearhead.sdk.assistant.ITranscriptionCallback");
            qjeVar = iInterfaceQueryLocalInterface instanceof qjg ? (qjg) iInterfaceQueryLocalInterface : new qje(binder);
        }
        this.l = qjeVar;
        this.m = bundle.getString("SUGGESTION_ACTION_ID");
        this.o = bundle.getBoolean("barge_in_enabled");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putInt("VOICE_SESSION_TYPE", this.a);
        if (this.b != null) {
            Bundle bundle2 = new Bundle();
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
        qjg qjgVar = this.l;
        if (qjgVar != null) {
            bundle.putBinder("TRANSCRIPTION_CALLBACK", qjgVar.asBinder());
        }
        bundle.putString("SUGGESTION_ACTION_ID", this.m);
        bundle.putBoolean("barge_in_enabled", this.o);
    }
}
