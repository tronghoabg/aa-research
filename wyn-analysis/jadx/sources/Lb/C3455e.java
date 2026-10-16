package lb;

import Bf.r;
import android.os.Build;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.speech.tts.UtteranceProgressListener;
import cb.AbstractC1593a;
import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC3340k;
import tc.g;

/* renamed from: lb.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3455e extends UtteranceProgressListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3456f f40222a;

    public C3455e(C3456f c3456f) {
        this.f40222a = c3456f;
    }

    public final void a(int i5, int i10, String str) {
        if (r.k0(str, "STF_", false)) {
            return;
        }
        C3456f c3456f = this.f40222a;
        String str2 = (String) c3456f.f40234l.get(str);
        HashMap mapL = AbstractC1593a.l("text", str2);
        mapL.put("start", String.valueOf(i5));
        mapL.put("end", String.valueOf(i10));
        AbstractC3340k.b(str2);
        String strSubstring = str2.substring(i5, i10);
        AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        mapL.put("word", strSubstring);
        C3456f.a(c3456f, "speak.onProgress", mapL);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String utteranceId) throws IOException {
        AbstractC3340k.e(utteranceId, "utteranceId");
        if (r.k0(utteranceId, "SIL_", false)) {
            return;
        }
        boolean zK0 = r.k0(utteranceId, "STF_", false);
        final C3456f c3456f = this.f40222a;
        if (zK0) {
            ParcelFileDescriptor parcelFileDescriptor = c3456f.f40244v;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            if (c3456f.f40230g) {
                c3456f.f40231h = false;
                Handler handler = c3456f.f40224a;
                AbstractC3340k.b(handler);
                final int i5 = 1;
                handler.post(new Runnable() { // from class: lb.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i5) {
                            case 0:
                                C3456f c3456f2 = c3456f;
                                g gVar = c3456f2.f40226c;
                                if (gVar != null) {
                                    gVar.a(1);
                                }
                                c3456f2.f40226c = null;
                                break;
                            default:
                                C3456f c3456f3 = c3456f;
                                g gVar2 = c3456f3.f40227d;
                                if (gVar2 != null) {
                                    gVar2.a(1);
                                }
                                c3456f3.f40227d = null;
                                break;
                        }
                    }
                });
            }
            C3456f.a(c3456f, "synth.onComplete", Boolean.TRUE);
        } else {
            if (c3456f.f40228e && c3456f.f40241s == 0) {
                c3456f.f40229f = false;
                Handler handler2 = c3456f.f40224a;
                AbstractC3340k.b(handler2);
                final int i10 = 0;
                handler2.post(new Runnable() { // from class: lb.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                C3456f c3456f2 = c3456f;
                                g gVar = c3456f2.f40226c;
                                if (gVar != null) {
                                    gVar.a(1);
                                }
                                c3456f2.f40226c = null;
                                break;
                            default:
                                C3456f c3456f3 = c3456f;
                                g gVar2 = c3456f3.f40227d;
                                if (gVar2 != null) {
                                    gVar2.a(1);
                                }
                                c3456f3.f40227d = null;
                                break;
                        }
                    }
                });
            }
            C3456f.a(c3456f, "speak.onComplete", Boolean.TRUE);
        }
        c3456f.f40237o = 0;
        c3456f.f40239q = null;
        c3456f.f40234l.remove(utteranceId);
        C3456f.b(c3456f);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String utteranceId) throws IOException {
        AbstractC3340k.e(utteranceId, "utteranceId");
        boolean zK0 = r.k0(utteranceId, "STF_", false);
        C3456f c3456f = this.f40222a;
        if (zK0) {
            ParcelFileDescriptor parcelFileDescriptor = c3456f.f40244v;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.closeWithError("Error synthesizing TTS to file");
            }
            if (c3456f.f40230g) {
                c3456f.f40231h = false;
            }
            C3456f.a(c3456f, "synth.onError", "Error from TextToSpeech (synth)");
        } else {
            if (c3456f.f40228e) {
                c3456f.f40229f = false;
            }
            C3456f.a(c3456f, "speak.onError", "Error from TextToSpeech (speak)");
        }
        C3456f.b(c3456f);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onRangeStart(String utteranceId, int i5, int i10, int i11) {
        AbstractC3340k.e(utteranceId, "utteranceId");
        if (r.k0(utteranceId, "STF_", false)) {
            return;
        }
        this.f40222a.f40237o = i5;
        super.onRangeStart(utteranceId, i5, i10, i11);
        a(i5, i10, utteranceId);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String utteranceId) {
        AbstractC3340k.e(utteranceId, "utteranceId");
        boolean zK0 = r.k0(utteranceId, "STF_", false);
        C3456f c3456f = this.f40222a;
        if (zK0) {
            C3456f.a(c3456f, "synth.onStart", Boolean.TRUE);
        } else if (c3456f.f40240r) {
            C3456f.a(c3456f, "speak.onContinue", Boolean.TRUE);
            c3456f.f40240r = false;
        } else {
            C3456f.a(c3456f, "speak.onStart", Boolean.TRUE);
        }
        if (Build.VERSION.SDK_INT < 26) {
            Object obj = c3456f.f40234l.get(utteranceId);
            AbstractC3340k.b(obj);
            a(0, ((String) obj).length(), utteranceId);
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStop(String utteranceId, boolean z2) {
        AbstractC3340k.e(utteranceId, "utteranceId");
        C3456f c3456f = this.f40222a;
        if (c3456f.f40228e) {
            c3456f.f40229f = false;
        }
        if (c3456f.f40240r) {
            C3456f.a(c3456f, "speak.onPause", Boolean.TRUE);
        } else {
            C3456f.a(c3456f, "speak.onCancel", Boolean.TRUE);
        }
        C3456f.b(c3456f);
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String utteranceId, int i5) throws IOException {
        AbstractC3340k.e(utteranceId, "utteranceId");
        boolean zK0 = r.k0(utteranceId, "STF_", false);
        C3456f c3456f = this.f40222a;
        if (zK0) {
            ParcelFileDescriptor parcelFileDescriptor = c3456f.f40244v;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.closeWithError("Error synthesizing TTS to file");
            }
            if (c3456f.f40230g) {
                c3456f.f40231h = false;
            }
            C3456f.a(c3456f, "synth.onError", "Error from TextToSpeech (synth) - " + i5);
            return;
        }
        if (c3456f.f40228e) {
            c3456f.f40229f = false;
        }
        C3456f.a(c3456f, "speak.onError", "Error from TextToSpeech (speak) - " + i5);
    }
}
