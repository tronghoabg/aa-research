package lb;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.util.Log;
import cb.AbstractC1593a;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import ff.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import qc.C3884a;
import qc.InterfaceC3885b;
import tc.g;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 {2\u00020\u00012\u00020\u0002:\u0001{B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u00104\u001a\u0002012\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002012\u0006\u00105\u001a\u000206H\u0016J\u000e\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020!J\u000e\u0010<\u001a\u0002012\u0006\u0010;\u001a\u00020!J\u0018\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\nH\u0016J\u0010\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020FH\u0002J\u0012\u0010G\u001a\u00020\r2\b\u0010H\u001a\u0004\u0018\u00010IH\u0002J&\u0010J\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\r0K2\u000e\u0010L\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160MH\u0002J\u0012\u0010N\u001a\u00020\r2\b\u0010O\u001a\u0004\u0018\u00010\u0016H\u0002J\u001a\u0010P\u001a\u0002012\b\u0010Q\u001a\u0004\u0018\u00010\u00162\u0006\u0010C\u001a\u00020\nH\u0002J\u001a\u0010R\u001a\u0002012\b\u0010O\u001a\u0004\u0018\u00010\u00162\u0006\u0010C\u001a\u00020\nH\u0002J8\u0010S\u001a\u0002012&\u0010T\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u00160\u001cj\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0004\u0012\u00020\u0016`\u001d2\u0006\u0010C\u001a\u00020\nH\u0002J\u0010\u0010U\u001a\u0002012\u0006\u0010C\u001a\u00020\nH\u0002J\u0018\u0010V\u001a\u0002012\u0006\u0010W\u001a\u00020F2\u0006\u0010C\u001a\u00020\nH\u0002J\u0018\u0010X\u001a\u0002012\u0006\u0010Y\u001a\u00020F2\u0006\u0010C\u001a\u00020\nH\u0002J\u0010\u0010Z\u001a\u0002012\u0006\u0010C\u001a\u00020\nH\u0002J\u0010\u0010[\u001a\u0002012\u0006\u0010C\u001a\u00020\nH\u0002J\u0010\u0010\\\u001a\u0002012\u0006\u0010C\u001a\u00020\nH\u0002J\u0010\u0010]\u001a\u0002012\u0006\u0010C\u001a\u00020\nH\u0002J\u0010\u0010^\u001a\u0002012\u0006\u0010C\u001a\u00020\nH\u0002J\"\u0010_\u001a\u0002012\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160a2\u0006\u0010T\u001a\u00020bJ\u000e\u0010c\u001a\u00020\u00162\u0006\u0010d\u001a\u00020!J\u000e\u0010e\u001a\u00020\u00162\u0006\u0010d\u001a\u00020!J\u0010\u0010f\u001a\u0002012\u0006\u0010C\u001a\u00020\nH\u0002J\u0018\u0010g\u001a\u00020\r2\u0006\u0010h\u001a\u00020\u00162\u0006\u0010i\u001a\u00020\rH\u0002J\b\u0010j\u001a\u000201H\u0002J\u0010\u0010n\u001a\u0002012\u0006\u0010o\u001a\u00020\rH\u0002J \u0010p\u001a\u0002012\u0006\u0010h\u001a\u00020\u00162\u0006\u0010q\u001a\u00020\u00162\u0006\u0010r\u001a\u00020\rH\u0002J\u0018\u0010s\u001a\u0002012\u0006\u0010t\u001a\u00020\u00162\u0006\u0010u\u001a\u00020vH\u0002J\u0012\u0010w\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\b\u0010x\u001a\u000201H\u0002J\b\u0010y\u001a\u000201H\u0002J\b\u0010z\u001a\u000201H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082D¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001cj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0004\n\u0002\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010k\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010m¨\u0006|"}, d2 = {"Lcom/tundralabs/fluttertts/FlutterTtsPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "<init>", "()V", "handler", "Landroid/os/Handler;", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "speakResult", "Lio/flutter/plugin/common/MethodChannel$Result;", "synthResult", "awaitSpeakCompletion", "", "speaking", "awaitSynthCompletion", "synth", "context", "Landroid/content/Context;", "tts", "Landroid/speech/tts/TextToSpeech;", "tag", "", "pendingMethodCalls", "Ljava/util/ArrayList;", "Ljava/lang/Runnable;", "Lkotlin/collections/ArrayList;", "utterances", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "bundle", "Landroid/os/Bundle;", "silencems", "", "lastProgress", "currentText", "pauseText", "isPaused", "queueMode", "ttsStatus", "Ljava/lang/Integer;", "engineResult", "parcelFileDescriptor", "Landroid/os/ParcelFileDescriptor;", "audioManager", "Landroid/media/AudioManager;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "initInstance", "", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "onAttachedToEngine", "binding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "onDetachedFromEngine", "utteranceProgressListener", "Landroid/speech/tts/UtteranceProgressListener;", "speakCompletion", "success", "synthCompletion", "onInitListener", "Landroid/speech/tts/TextToSpeech$OnInitListener;", "firstTimeOnInitListener", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "result", "setSpeechRate", "rate", "", "isLanguageAvailable", "locale", "Ljava/util/Locale;", "areLanguagesInstalled", "", "languages", "", "isLanguageInstalled", "language", "setEngine", "engine", "setLanguage", "setVoice", "voice", "clearVoice", "setVolume", "volume", "setPitch", "pitch", "getVoices", "getLanguages", "getEngines", "getDefaultEngine", "getDefaultVoice", "readVoiceProperties", "map", "", "Landroid/speech/tts/Voice;", "qualityToString", "quality", "latencyToString", "getSpeechRateValidRange", "speak", "text", "focus", "stop", "maxSpeechInputLength", "getMaxSpeechInputLength", "()I", "closeParcelFileDescriptor", "isError", "synthesizeToFile", "fileName", "isFullPath", "invokeMethod", "method", "arguments", "", "ismServiceConnectionUsable", "setAudioAttributesForNavigation", "requestAudioFocus", "releaseAudioFocus", "Companion", "flutter_tts_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* renamed from: lb.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3456f implements InterfaceC4279p, InterfaceC3885b {

    /* renamed from: A, reason: collision with root package name */
    public final C3453c f40223A;

    /* renamed from: a, reason: collision with root package name */
    public Handler f40224a;

    /* renamed from: b, reason: collision with root package name */
    public C4281r f40225b;

    /* renamed from: c, reason: collision with root package name */
    public g f40226c;

    /* renamed from: d, reason: collision with root package name */
    public g f40227d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f40228e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f40229f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f40230g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f40231h;

    /* renamed from: i, reason: collision with root package name */
    public Context f40232i;

    /* renamed from: j, reason: collision with root package name */
    public TextToSpeech f40233j;

    /* renamed from: m, reason: collision with root package name */
    public Bundle f40235m;

    /* renamed from: n, reason: collision with root package name */
    public int f40236n;

    /* renamed from: o, reason: collision with root package name */
    public int f40237o;

    /* renamed from: p, reason: collision with root package name */
    public String f40238p;

    /* renamed from: q, reason: collision with root package name */
    public String f40239q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f40240r;

    /* renamed from: s, reason: collision with root package name */
    public int f40241s;

    /* renamed from: t, reason: collision with root package name */
    public Integer f40242t;

    /* renamed from: u, reason: collision with root package name */
    public g f40243u;

    /* renamed from: v, reason: collision with root package name */
    public ParcelFileDescriptor f40244v;

    /* renamed from: w, reason: collision with root package name */
    public AudioManager f40245w;

    /* renamed from: x, reason: collision with root package name */
    public AudioFocusRequest f40246x;

    /* renamed from: z, reason: collision with root package name */
    public final C3453c f40248z;
    public final ArrayList k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f40234l = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public final C3455e f40247y = new C3455e(this);

    /* JADX WARN: Type inference failed for: r0v3, types: [lb.c] */
    /* JADX WARN: Type inference failed for: r0v4, types: [lb.c] */
    public C3456f() {
        final int i5 = 0;
        this.f40248z = new TextToSpeech.OnInitListener(this) { // from class: lb.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3456f f40217b;

            {
                this.f40217b = this;
            }

            private final void a(int i10) {
                C3456f c3456f = this.f40217b;
                synchronized (c3456f) {
                    try {
                        c3456f.f40242t = Integer.valueOf(i10);
                        Iterator it = c3456f.k.iterator();
                        AbstractC3340k.d(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3340k.d(next, "next(...)");
                            ((Runnable) next).run();
                        }
                        c3456f.k.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i10 != 0) {
                    g gVar = c3456f.f40243u;
                    AbstractC3340k.b(gVar);
                    gVar.b("TtsError", "Failed to initialize TextToSpeech with status: " + i10, null);
                    return;
                }
                TextToSpeech textToSpeech = c3456f.f40233j;
                AbstractC3340k.b(textToSpeech);
                textToSpeech.setOnUtteranceProgressListener(c3456f.f40247y);
                try {
                    TextToSpeech textToSpeech2 = c3456f.f40233j;
                    AbstractC3340k.b(textToSpeech2);
                    Locale locale = textToSpeech2.getDefaultVoice().getLocale();
                    AbstractC3340k.d(locale, "getLocale(...)");
                    if (c3456f.c(locale)) {
                        TextToSpeech textToSpeech3 = c3456f.f40233j;
                        AbstractC3340k.b(textToSpeech3);
                        textToSpeech3.setLanguage(locale);
                    }
                } catch (IllegalArgumentException e7) {
                    Log.e("TTS", "getDefaultLocale: " + e7.getMessage());
                } catch (NullPointerException e10) {
                    Log.e("TTS", "getDefaultLocale: " + e10.getMessage());
                }
                g gVar2 = c3456f.f40243u;
                AbstractC3340k.b(gVar2);
                gVar2.a(1);
            }

            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i10) {
                switch (i5) {
                    case 0:
                        a(i10);
                        return;
                    default:
                        C3456f c3456f = this.f40217b;
                        synchronized (c3456f) {
                            try {
                                c3456f.f40242t = Integer.valueOf(i10);
                                Iterator it = c3456f.k.iterator();
                                AbstractC3340k.d(it, "iterator(...)");
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    AbstractC3340k.d(next, "next(...)");
                                    ((Runnable) next).run();
                                }
                                c3456f.k.clear();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i10 != 0) {
                            AbstractC1593a.q(i10, "Failed to initialize TextToSpeech with status: ", "TTS");
                            return;
                        }
                        TextToSpeech textToSpeech = c3456f.f40233j;
                        AbstractC3340k.b(textToSpeech);
                        textToSpeech.setOnUtteranceProgressListener(c3456f.f40247y);
                        try {
                            TextToSpeech textToSpeech2 = c3456f.f40233j;
                            AbstractC3340k.b(textToSpeech2);
                            Locale locale = textToSpeech2.getDefaultVoice().getLocale();
                            AbstractC3340k.d(locale, "getLocale(...)");
                            if (c3456f.c(locale)) {
                                TextToSpeech textToSpeech3 = c3456f.f40233j;
                                AbstractC3340k.b(textToSpeech3);
                                textToSpeech3.setLanguage(locale);
                                return;
                            }
                            return;
                        } catch (IllegalArgumentException e7) {
                            Log.e("TTS", "getDefaultLocale: " + e7.getMessage());
                            return;
                        } catch (NullPointerException e10) {
                            Log.e("TTS", "getDefaultLocale: " + e10.getMessage());
                            return;
                        }
                }
            }
        };
        final int i10 = 1;
        this.f40223A = new TextToSpeech.OnInitListener(this) { // from class: lb.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3456f f40217b;

            {
                this.f40217b = this;
            }

            private final void a(int i102) {
                C3456f c3456f = this.f40217b;
                synchronized (c3456f) {
                    try {
                        c3456f.f40242t = Integer.valueOf(i102);
                        Iterator it = c3456f.k.iterator();
                        AbstractC3340k.d(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3340k.d(next, "next(...)");
                            ((Runnable) next).run();
                        }
                        c3456f.k.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i102 != 0) {
                    g gVar = c3456f.f40243u;
                    AbstractC3340k.b(gVar);
                    gVar.b("TtsError", "Failed to initialize TextToSpeech with status: " + i102, null);
                    return;
                }
                TextToSpeech textToSpeech = c3456f.f40233j;
                AbstractC3340k.b(textToSpeech);
                textToSpeech.setOnUtteranceProgressListener(c3456f.f40247y);
                try {
                    TextToSpeech textToSpeech2 = c3456f.f40233j;
                    AbstractC3340k.b(textToSpeech2);
                    Locale locale = textToSpeech2.getDefaultVoice().getLocale();
                    AbstractC3340k.d(locale, "getLocale(...)");
                    if (c3456f.c(locale)) {
                        TextToSpeech textToSpeech3 = c3456f.f40233j;
                        AbstractC3340k.b(textToSpeech3);
                        textToSpeech3.setLanguage(locale);
                    }
                } catch (IllegalArgumentException e7) {
                    Log.e("TTS", "getDefaultLocale: " + e7.getMessage());
                } catch (NullPointerException e10) {
                    Log.e("TTS", "getDefaultLocale: " + e10.getMessage());
                }
                g gVar2 = c3456f.f40243u;
                AbstractC3340k.b(gVar2);
                gVar2.a(1);
            }

            @Override // android.speech.tts.TextToSpeech.OnInitListener
            public final void onInit(int i102) {
                switch (i10) {
                    case 0:
                        a(i102);
                        return;
                    default:
                        C3456f c3456f = this.f40217b;
                        synchronized (c3456f) {
                            try {
                                c3456f.f40242t = Integer.valueOf(i102);
                                Iterator it = c3456f.k.iterator();
                                AbstractC3340k.d(it, "iterator(...)");
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    AbstractC3340k.d(next, "next(...)");
                                    ((Runnable) next).run();
                                }
                                c3456f.k.clear();
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i102 != 0) {
                            AbstractC1593a.q(i102, "Failed to initialize TextToSpeech with status: ", "TTS");
                            return;
                        }
                        TextToSpeech textToSpeech = c3456f.f40233j;
                        AbstractC3340k.b(textToSpeech);
                        textToSpeech.setOnUtteranceProgressListener(c3456f.f40247y);
                        try {
                            TextToSpeech textToSpeech2 = c3456f.f40233j;
                            AbstractC3340k.b(textToSpeech2);
                            Locale locale = textToSpeech2.getDefaultVoice().getLocale();
                            AbstractC3340k.d(locale, "getLocale(...)");
                            if (c3456f.c(locale)) {
                                TextToSpeech textToSpeech3 = c3456f.f40233j;
                                AbstractC3340k.b(textToSpeech3);
                                textToSpeech3.setLanguage(locale);
                                return;
                            }
                            return;
                        } catch (IllegalArgumentException e7) {
                            Log.e("TTS", "getDefaultLocale: " + e7.getMessage());
                            return;
                        } catch (NullPointerException e10) {
                            Log.e("TTS", "getDefaultLocale: " + e10.getMessage());
                            return;
                        }
                }
            }
        };
    }

    public static final void a(C3456f c3456f, String str, Serializable serializable) {
        Handler handler = c3456f.f40224a;
        AbstractC3340k.b(handler);
        handler.post(new com.applovin.impl.mediation.ads.f(c3456f, str, serializable, 23));
    }

    public static final void b(C3456f c3456f) {
        AudioManager audioManager;
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManager2 = c3456f.f40245w;
            if (audioManager2 != null) {
                audioManager2.abandonAudioFocus(null);
                return;
            }
            return;
        }
        AudioFocusRequest audioFocusRequest = c3456f.f40246x;
        if (audioFocusRequest == null || (audioManager = c3456f.f40245w) == null) {
            return;
        }
        audioManager.abandonAudioFocusRequest(audioFocusRequest);
    }

    public static void e(HashMap map, Voice voice) {
        map.put(MediationMetaData.KEY_NAME, voice.getName());
        map.put("locale", voice.getLocale().toLanguageTag());
        int quality = voice.getQuality();
        map.put("quality", quality != 100 ? quality != 200 ? quality != 300 ? quality != 400 ? quality != 500 ? "unknown" : "very high" : "high" : "normal" : "low" : "very low");
        int latency = voice.getLatency();
        map.put("latency", latency != 100 ? latency != 200 ? latency != 300 ? latency != 400 ? latency != 500 ? "unknown" : "very high" : "high" : "normal" : "low" : "very low");
        map.put("network_required", voice.isNetworkConnectionRequired() ? UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION : "0");
        Set<String> features = voice.getFeatures();
        AbstractC3340k.d(features, "getFeatures(...)");
        map.put("features", o.w0(features, "\t", null, null, null, 62));
    }

    public final boolean c(Locale locale) {
        TextToSpeech textToSpeech = this.f40233j;
        AbstractC3340k.b(textToSpeech);
        return textToSpeech.isLanguageAvailable(locale) >= 0;
    }

    public final boolean d(String str) {
        Voice next;
        AbstractC3340k.b(str);
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        AbstractC3340k.d(localeForLanguageTag, "forLanguageTag(...)");
        if (!c(localeForLanguageTag)) {
            return false;
        }
        TextToSpeech textToSpeech = this.f40233j;
        AbstractC3340k.b(textToSpeech);
        Iterator<Voice> it = textToSpeech.getVoices().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC3340k.a(next.getLocale(), localeForLanguageTag) && !next.isNetworkConnectionRequired()) {
                break;
            }
        }
        if (next == null) {
            return false;
        }
        AbstractC3340k.d(next.getFeatures(), "getFeatures(...)");
        return !r4.contains("notInstalled");
    }

    public final void f() {
        if (this.f40230g) {
            this.f40231h = false;
        }
        if (this.f40228e) {
            this.f40229f = false;
        }
        TextToSpeech textToSpeech = this.f40233j;
        AbstractC3340k.b(textToSpeech);
        textToSpeech.stop();
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        InterfaceC4269f interfaceC4269f = binding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        Context context = binding.f44186a;
        AbstractC3340k.d(context, "getApplicationContext(...)");
        this.f40232i = context;
        C4281r c4281r = new C4281r(interfaceC4269f, "flutter_tts");
        this.f40225b = c4281r;
        c4281r.b(this);
        this.f40224a = new Handler(Looper.getMainLooper());
        this.f40235m = new Bundle();
        this.f40233j = new TextToSpeech(context, this.f40223A);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        f();
        TextToSpeech textToSpeech = this.f40233j;
        AbstractC3340k.b(textToSpeech);
        textToSpeech.shutdown();
        this.f40232i = null;
        C4281r c4281r = this.f40225b;
        AbstractC3340k.b(c4281r);
        c4281r.b(null);
        this.f40225b = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x0553, code lost:
    
        if (r0.speak(r3, 1, r13.f40235m, r6) == 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0563, code lost:
    
        if (r0.speak(r3, r13.f40241s, r13.f40235m, r6) == 0) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0567, code lost:
    
        if (r13.f40228e == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x056b, code lost:
    
        if (r13.f40241s != 0) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x056d, code lost:
    
        r13.f40229f = true;
        r13.f40226c = (tc.g) r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0576, code lost:
    
        ((tc.g) r15).a(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:?, code lost:
    
        return;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // uc.InterfaceC4279p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(final uc.C4278o r14, uc.InterfaceC4280q r15) throws java.lang.NumberFormatException, java.lang.SecurityException, java.io.FileNotFoundException {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lb.C3456f.onMethodCall(uc.o, uc.q):void");
    }
}
