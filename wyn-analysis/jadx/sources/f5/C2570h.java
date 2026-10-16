package f5;

import E5.Q;
import G5.RunnableC0534o;
import X0.AbstractC1274b;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.G;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q.s1;
import qc.C3884a;
import qc.InterfaceC3885b;
import rc.InterfaceC3964a;
import rc.InterfaceC3965b;
import uc.C4281r;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4285v;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0010\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010?\u001a\u00020@2\b\b\u0001\u0010A\u001a\u00020BH\u0016J\u0018\u0010?\u001a\u00020@2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020EH\u0002J\u0012\u0010F\u001a\u00020@2\b\b\u0001\u0010G\u001a\u00020BH\u0016J\b\u0010H\u001a\u00020@H\u0016J\u0010\u0010I\u001a\u00020@2\u0006\u0010G\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020@2\u0006\u0010G\u001a\u00020JH\u0016J\b\u0010L\u001a\u00020@H\u0016J\u001c\u0010M\u001a\u00020@2\b\b\u0001\u0010N\u001a\u00020O2\b\b\u0001\u0010P\u001a\u00020\u001bH\u0016J\u0010\u0010Q\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010S\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\b\u0010T\u001a\u00020\u0017H\u0002J\b\u0010U\u001a\u00020\u0017H\u0002J\b\u0010V\u001a\u00020\u0017H\u0002J\b\u0010W\u001a\u00020\u0017H\u0002J0\u0010X\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001b2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00172\u0006\u0010[\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\u0017H\u0002J\b\u0010]\u001a\u00020@H\u0002J\u0010\u0010^\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010_\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010`\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010a\u001a\u00020@2\u0006\u0010b\u001a\u00020\u0017H\u0002J\b\u0010c\u001a\u00020@H\u0002J\u001a\u0010d\u001a\u00020@2\b\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010g\u001a\u00020\u0017H\u0002J\u0010\u0010h\u001a\u00020\u00172\u0006\u0010g\u001a\u00020\u0017H\u0002J\u0012\u0010i\u001a\u00020@2\b\u0010j\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010k\u001a\u00020@H\u0002J\b\u0010l\u001a\u00020@H\u0002J\u000e\u0010m\u001a\u0004\u0018\u00010n*\u00020\tH\u0002J\u0010\u0010o\u001a\u00020@2\u0006\u0010\\\u001a\u00020\u0017H\u0002J(\u0010p\u001a\u00020@2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00172\u0006\u0010q\u001a\u0002052\u0006\u0010\\\u001a\u00020\u0017H\u0002J\b\u0010r\u001a\u00020@H\u0002J-\u0010s\u001a\u00020\u00172\u0006\u0010t\u001a\u00020\r2\u000e\u0010u\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150v2\u0006\u0010w\u001a\u00020xH\u0016¢\u0006\u0002\u0010yJ\u0012\u0010z\u001a\u00020@2\b\u0010{\u001a\u0004\u0018\u00010fH\u0016J\u0012\u0010|\u001a\u00020@2\b\u0010{\u001a\u0004\u0018\u00010fH\u0016J\b\u0010}\u001a\u00020@H\u0016J\u0010\u0010~\u001a\u00020@2\u0006\u0010\u007f\u001a\u00020\rH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020@2\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u0082\u0001\u001a\u00020@2\u0007\u0010\u0083\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u0084\u0001\u001a\u00020@2\u0007\u0010\u0085\u0001\u001a\u00020:H\u0016J\u0014\u0010\u0086\u0001\u001a\u00020@2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010fH\u0016J\u0015\u0010\u0088\u0001\u001a\u00020@2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016J\u001d\u0010\u008a\u0001\u001a\u00020@2\u0007\u0010\u0087\u0001\u001a\u00020\r2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010fH\u0016J\t\u0010\u008c\u0001\u001a\u00020@H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020:X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u008d\u0001"}, d2 = {"Lcom/csdcorp/speech_to_text/SpeechToTextPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Landroid/speech/RecognitionListener;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;", "<init>", "()V", "pluginContext", "Landroid/content/Context;", "channel", "Lio/flutter/plugin/common/MethodChannel;", "minSdkForSpeechSupport", "", "brokenStopSdk", "minSdkForOnDeviceSpeechSupport", "speechToTextPermissionCode", "missingConfidence", "", "speechThresholdRms", "logTag", "", "recognizerStops", "", "currentActivity", "Landroid/app/Activity;", "activeResult", "Lio/flutter/plugin/common/MethodChannel$Result;", "initializedSuccessfully", "permissionToRecordAudio", "listening", "debugLogging", "alwaysUseStop", "intentLookup", "noBluetoothOpt", "bluetoothDisabled", "resultSent", "lastOnDevice", "speechRecognizer", "Landroid/speech/SpeechRecognizer;", "recognizerIntent", "Landroid/content/Intent;", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "pairedDevices", "", "Landroid/bluetooth/BluetoothDevice;", "activeBluetooth", "bluetoothHeadset", "Landroid/bluetooth/BluetoothHeadset;", "previousRecognizerLang", "previousPartialResults", "previousListenMode", "Lcom/csdcorp/speech_to_text/ListenMode;", "lastFinalTime", "", "speechStartTime", "minRms", "", "maxRms", "handler", "Landroid/os/Handler;", "defaultLanguageTag", "onAttachedToEngine", "", "flutterPluginBinding", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "applicationContext", "messenger", "Lio/flutter/plugin/common/BinaryMessenger;", "onDetachedFromEngine", "binding", "onDetachedFromActivity", "onReattachedToActivityForConfigChanges", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "onMethodCall", "call", "Lio/flutter/plugin/common/MethodCall;", "rawrResult", "hasPermission", "result", MobileAdsBridgeBase.initializeMethodName, "sdkVersionTooLow", "isNotInitialized", "isListening", "isNotListening", "startListening", "languageTag", "partialResults", "listenModeIndex", "onDevice", "optionallyStartBluetooth", "stopListening", "cancelListening", "locales", "notifyListening", "isRecording", "optionallyStopBluetooth", "updateResults", "speechBundle", "Landroid/os/Bundle;", "isFinal", "isDuplicateFinal", "initializeIfPermitted", "context", "completeInitialize", "setupBluetooth", "findComponentName", "Landroid/content/ComponentName;", "createRecognizer", "setupRecognizerIntent", "listenMode", "destroyRecognizer", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)Z", "onPartialResults", "results", "onResults", "onEndOfSpeech", "onError", "errorCode", "debugLog", "msg", "sendError", "errorMsg", "onRmsChanged", "rmsdB", "onReadyForSpeech", "p0", "onBufferReceived", "", "onEvent", "p1", "onBeginningOfSpeech", "speech_to_text_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* renamed from: f5.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2570h implements InterfaceC4279p, RecognitionListener, InterfaceC4285v, InterfaceC3885b, InterfaceC3964a {

    /* renamed from: D, reason: collision with root package name */
    public final String f34843D;

    /* renamed from: a, reason: collision with root package name */
    public Context f34844a;

    /* renamed from: b, reason: collision with root package name */
    public C4281r f34845b;

    /* renamed from: d, reason: collision with root package name */
    public Activity f34847d;

    /* renamed from: e, reason: collision with root package name */
    public Wa.h f34848e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f34849f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f34850g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f34851h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f34852i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f34853j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f34854l;

    /* renamed from: n, reason: collision with root package name */
    public boolean f34856n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34857o;

    /* renamed from: p, reason: collision with root package name */
    public SpeechRecognizer f34858p;

    /* renamed from: q, reason: collision with root package name */
    public Intent f34859q;

    /* renamed from: r, reason: collision with root package name */
    public BluetoothAdapter f34860r;

    /* renamed from: s, reason: collision with root package name */
    public Set f34861s;

    /* renamed from: t, reason: collision with root package name */
    public BluetoothDevice f34862t;

    /* renamed from: u, reason: collision with root package name */
    public BluetoothHeadset f34863u;

    /* renamed from: v, reason: collision with root package name */
    public String f34864v;

    /* renamed from: y, reason: collision with root package name */
    public long f34867y;

    /* renamed from: z, reason: collision with root package name */
    public long f34868z;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34846c = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f34855m = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f34865w = true;

    /* renamed from: x, reason: collision with root package name */
    public EnumC2564b f34866x = EnumC2564b.f34825a;

    /* renamed from: A, reason: collision with root package name */
    public float f34840A = 1000.0f;

    /* renamed from: B, reason: collision with root package name */
    public float f34841B = -100.0f;

    /* renamed from: C, reason: collision with root package name */
    public final Handler f34842C = new Handler(Looper.getMainLooper());

    public C2570h() {
        String languageTag = Locale.getDefault().toLanguageTag();
        AbstractC3340k.d(languageTag, "toLanguageTag(...)");
        this.f34843D = languageTag;
    }

    public final void a(Wa.h hVar) {
        if (!this.f34849f || !this.f34851h) {
            hVar.a(Boolean.FALSE);
            return;
        }
        c("Cancel listening");
        Handler handler = this.f34842C;
        handler.post(new RunnableC2565c(this, 2));
        if (!this.f34846c) {
            handler.postDelayed(new RunnableC2565c(this, 0), 50L);
        }
        f(false);
        hVar.a(Boolean.TRUE);
        c("Cancel listening done");
    }

    public final void b() {
        c("completeInitialize");
        if (this.f34850g) {
            c("Testing recognition availability");
            Context context = this.f34844a;
            if (context == null) {
                c("null context during initialization");
                Wa.h hVar = this.f34848e;
                if (hVar != null) {
                    hVar.a(Boolean.FALSE);
                }
                Wa.h hVar2 = this.f34848e;
                if (hVar2 != null) {
                    hVar2.b("missingContext", "context unexpectedly null, initialization failed", "");
                }
                this.f34848e = null;
                return;
            }
            if (Build.VERSION.SDK_INT >= 31) {
                if (!SpeechRecognizer.isRecognitionAvailable(context) && !SpeechRecognizer.isOnDeviceRecognitionAvailable(context)) {
                    Log.e("SpeechToTextPlugin", "Speech recognition not available on this device");
                    Wa.h hVar3 = this.f34848e;
                    if (hVar3 != null) {
                        hVar3.b("recognizerNotAvailable", "Speech recognition not available on this device", "");
                    }
                    this.f34848e = null;
                    return;
                }
            } else if (!SpeechRecognizer.isRecognitionAvailable(context)) {
                Log.e("SpeechToTextPlugin", "Speech recognition not available on this device");
                Wa.h hVar4 = this.f34848e;
                if (hVar4 != null) {
                    hVar4.b("recognizerNotAvailable", "Speech recognition not available on this device", "");
                }
                this.f34848e = null;
                return;
            }
            if (!this.f34855m) {
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                this.f34860r = defaultAdapter;
                this.f34861s = defaultAdapter != null ? defaultAdapter.getBondedDevices() : null;
                C2569g c2569g = new C2569g(this);
                BluetoothAdapter bluetoothAdapter = this.f34860r;
                if (bluetoothAdapter != null) {
                    bluetoothAdapter.getProfileProxy(this.f34844a, c2569g, 1);
                }
            }
        }
        this.f34849f = this.f34850g;
        c("sending result");
        Wa.h hVar5 = this.f34848e;
        if (hVar5 != null) {
            hVar5.a(Boolean.valueOf(this.f34850g));
        }
        c("leaving complete");
        this.f34848e = null;
    }

    public final void c(String str) {
        if (this.f34852i) {
            Log.d("SpeechToTextPlugin", str);
        }
    }

    public final void d(Wa.h hVar) {
        this.f34846c = Build.VERSION.SDK_INT != 29 || this.f34853j;
        c("Start initialize");
        if (this.f34848e != null) {
            hVar.b("multipleRequests", "Only one initialize at a time", null);
            return;
        }
        this.f34848e = hVar;
        Context context = this.f34844a;
        if (context == null) {
            b();
            return;
        }
        this.f34850g = Y0.e.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
        this.f34855m = Y0.e.checkSelfPermission(context, "android.permission.BLUETOOTH_CONNECT") != 0 || this.f34854l;
        c("Checked permission");
        if (this.f34850g) {
            c("has permission, completing");
            b();
        } else {
            Activity activity = this.f34847d;
            if (activity != null) {
                c("Requesting permission");
                String[] strArr = {"android.permission.RECORD_AUDIO"};
                if (!this.f34854l) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, 2);
                    objArrCopyOf[1] = "android.permission.BLUETOOTH_CONNECT";
                    strArr = (String[]) objArrCopyOf;
                }
                AbstractC1274b.a(activity, strArr, 28521);
            } else {
                c("no permission, no activity, completing");
                b();
            }
        }
        c("leaving initializeIfPermitted");
    }

    public final void e(Wa.h hVar) {
        Context context = this.f34844a;
        AbstractC3340k.b(context);
        boolean z2 = Y0.e.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
        if (Build.VERSION.SDK_INT < 33 || !z2) {
            Intent voiceDetailsIntent = RecognizerIntent.getVoiceDetailsIntent(this.f34844a);
            if (voiceDetailsIntent == null) {
                voiceDetailsIntent = new Intent("android.speech.action.GET_LANGUAGE_DETAILS");
                voiceDetailsIntent.setPackage("com.google.android.googlequicksearchbox");
            }
            Intent intent = voiceDetailsIntent;
            Context context2 = this.f34844a;
            if (context2 != null) {
                context2.sendOrderedBroadcast(intent, null, new C2563a(hVar, this.f34852i), null, -1, null, null);
                return;
            }
            return;
        }
        Context context3 = this.f34844a;
        AbstractC3340k.b(context3);
        if (SpeechRecognizer.isOnDeviceRecognitionAvailable(context3)) {
            G g9 = new G();
            Context context4 = this.f34844a;
            AbstractC3340k.b(context4);
            SpeechRecognizer speechRecognizerCreateOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(context4);
            AbstractC3340k.d(speechRecognizerCreateOnDeviceSpeechRecognizer, "createOnDeviceSpeechRecognizer(...)");
            g9.f39740a = speechRecognizerCreateOnDeviceSpeechRecognizer;
            Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
            SpeechRecognizer speechRecognizer = (SpeechRecognizer) g9.f39740a;
            if (speechRecognizer != null) {
                speechRecognizer.checkRecognitionSupport(intent2, Executors.newSingleThreadExecutor(), new C2568f(hVar, this, g9));
            }
        }
    }

    public final void f(boolean z2) {
        String str;
        if (this.f34851h == z2) {
            return;
        }
        this.f34851h = z2;
        if (z2) {
            str = "listening";
        } else {
            if (z2) {
                throw new Q((byte) 0, 9);
            }
            str = "notListening";
        }
        c("Notify status:".concat(str));
        C4281r c4281r = this.f34845b;
        if (c4281r != null) {
            c4281r.a("notifyStatus", str, null);
        }
        if (z2) {
            return;
        }
        String str2 = !this.f34856n ? "doneNoResult" : "done";
        c("Notify status:".concat(str2));
        if (!this.f34855m) {
            BluetoothDevice bluetoothDevice = this.f34862t;
            BluetoothHeadset bluetoothHeadset = this.f34863u;
            if (bluetoothDevice != null && bluetoothHeadset != null) {
                c("Stopping bluetooth voice recognition");
                bluetoothHeadset.stopVoiceRecognition(bluetoothDevice);
                this.f34862t = null;
            }
        }
        C4281r c4281r2 = this.f34845b;
        if (c4281r2 != null) {
            c4281r2.a("notifyStatus", str2, null);
        }
    }

    public final void g(final String str, final boolean z2, EnumC2564b enumC2564b, final boolean z10) {
        c("setupRecognizerIntent");
        String str2 = this.f34864v;
        if (str2 != null && str2.equals(str) && z2 == this.f34865w && this.f34866x == enumC2564b) {
            return;
        }
        this.f34864v = str;
        this.f34865w = z2;
        this.f34866x = enumC2564b;
        this.f34842C.post(new Runnable() { // from class: f5.e
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
                C2570h c2570h = this.f34832a;
                c2570h.c("In RecognizerIntent apply");
                intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
                c2570h.c("put model");
                Context context = c2570h.f34844a;
                if (context != null) {
                    intent.putExtra("calling_package", context.getApplicationInfo().packageName);
                }
                c2570h.c("put package");
                intent.putExtra("android.speech.extra.PARTIAL_RESULTS", z2);
                c2570h.c("put partial");
                String languageTag = Locale.getDefault().toLanguageTag();
                String str3 = str;
                if (!AbstractC3340k.a(str3, languageTag)) {
                    intent.putExtra("android.speech.extra.LANGUAGE", str3);
                    c2570h.c("put languageTag");
                }
                boolean z11 = z10;
                if (z11) {
                    intent.putExtra("android.speech.extra.PREFER_OFFLINE", z11);
                }
                intent.putExtra("android.speech.extra.MAX_RESULTS", 10);
                c2570h.f34859q = intent;
            }
        });
    }

    public final void h(Wa.h hVar, String str, boolean z2, int i5, boolean z10) {
        if (!this.f34849f || this.f34851h) {
            hVar.a(Boolean.FALSE);
            return;
        }
        this.f34856n = false;
        SpeechRecognizer speechRecognizer = this.f34858p;
        Handler handler = this.f34842C;
        if (speechRecognizer == null || z10 != this.f34857o) {
            this.f34857o = z10;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            }
            this.f34858p = null;
            handler.post(new RunnableC0534o(4, this, z10));
            c("before setup intent");
            g(this.f34843D, true, EnumC2564b.f34825a, false);
            c("after setup intent");
        }
        this.f34840A = 1000.0f;
        this.f34841B = -100.0f;
        c("Start listening");
        EnumC2564b enumC2564b = EnumC2564b.f34825a;
        EnumC2564b enumC2564b2 = EnumC2564b.f34826b;
        if (i5 == 1) {
            enumC2564b = enumC2564b2;
        }
        if (!this.f34855m) {
            BluetoothAdapter bluetoothAdapter = this.f34860r;
            Set set = this.f34861s;
            BluetoothHeadset bluetoothHeadset = this.f34863u;
            if (bluetoothAdapter != null && bluetoothHeadset != null && set != null && bluetoothAdapter.isEnabled()) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) it.next();
                    if (bluetoothHeadset.startVoiceRecognition(bluetoothDevice)) {
                        c("Starting bluetooth voice recognition");
                        this.f34862t = bluetoothDevice;
                        break;
                    }
                }
            }
        }
        g(str, z2, enumC2564b, z10);
        handler.post(new RunnableC2565c(this, 1));
        this.f34868z = System.currentTimeMillis();
        f(true);
        hVar.a(Boolean.TRUE);
        c("Start listening done");
    }

    public final void i(Wa.h hVar) {
        if (!this.f34849f || !this.f34851h) {
            hVar.a(Boolean.FALSE);
            return;
        }
        c("Stop listening");
        Handler handler = this.f34842C;
        handler.post(new RunnableC2565c(this, 3));
        if (!this.f34846c) {
            handler.postDelayed(new RunnableC2565c(this, 0), 50L);
        }
        f(false);
        hVar.a(Boolean.TRUE);
        c("Stop listening done");
    }

    public final void j(Bundle bundle, boolean z2) throws JSONException {
        if (z2) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f34867y;
            this.f34867y = System.currentTimeMillis();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis < 100) {
                c("Discarding duplicate final");
                return;
            }
        }
        ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            c("Results null or empty");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("finalResult", z2);
        float[] floatArray = bundle.getFloatArray("confidence_scores");
        JSONArray jSONArray = new JSONArray();
        int size = stringArrayList.size() - 1;
        if (size >= 0) {
            int i5 = 0;
            while (true) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("recognizedWords", stringArrayList.get(i5));
                if (floatArray == null || floatArray.length < stringArrayList.size()) {
                    jSONObject2.put("confidence", -1.0d);
                } else {
                    jSONObject2.put("confidence", Float.valueOf(floatArray[i5]));
                }
                jSONArray.put(jSONObject2);
                if (i5 == size) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        jSONObject.put("alternates", jSONArray);
        String string = jSONObject.toString();
        AbstractC3340k.d(string, "toString(...)");
        c("Calling results callback");
        this.f34856n = true;
        C4281r c4281r = this.f34845b;
        if (c4281r != null) {
            c4281r.a("textRecognition", string, null);
        }
    }

    @Override // rc.InterfaceC3964a
    public final void onAttachedToActivity(InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        s1 s1Var = (s1) binding;
        this.f34847d = (Activity) s1Var.f43896a;
        s1Var.d(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a flutterPluginBinding) {
        AbstractC3340k.e(flutterPluginBinding, "flutterPluginBinding");
        Context context = flutterPluginBinding.f44186a;
        AbstractC3340k.d(context, "getApplicationContext(...)");
        InterfaceC4269f interfaceC4269f = flutterPluginBinding.f44188c;
        AbstractC3340k.d(interfaceC4269f, "getBinaryMessenger(...)");
        this.f34844a = context;
        C4281r c4281r = new C4281r(interfaceC4269f, "plugin.csdcorp.com/speech_to_text");
        this.f34845b = c4281r;
        c4281r.b(this);
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivity() {
        this.f34847d = null;
    }

    @Override // rc.InterfaceC3964a
    public final void onDetachedFromActivityForConfigChanges() {
        this.f34847d = null;
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a binding) {
        AbstractC3340k.e(binding, "binding");
        this.f34844a = null;
        C4281r c4281r = this.f34845b;
        if (c4281r != null) {
            c4281r.b(null);
        }
        this.f34845b = null;
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        f(false);
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int errorCode) throws JSONException {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f34868z;
        int i5 = (7 != errorCode || this.f34841B >= ((float) 9)) ? errorCode : 6;
        c("Error " + errorCode + " after start at " + jCurrentTimeMillis + ' ' + this.f34840A + " / " + this.f34841B);
        switch (i5) {
            case 1:
                str = "error_network_timeout";
                break;
            case 2:
                str = "error_network";
                break;
            case 3:
                str = "error_audio_error";
                break;
            case 4:
                str = "error_server";
                break;
            case 5:
                str = "error_client";
                break;
            case 6:
                str = "error_speech_timeout";
                break;
            case 7:
                str = "error_no_match";
                break;
            case 8:
                str = "error_busy";
                break;
            case 9:
                str = "error_permission";
                break;
            case 10:
                str = "error_too_many_requests";
                break;
            case 11:
                str = "error_server_disconnected";
                break;
            case 12:
                str = "error_language_not_supported";
                break;
            case 13:
                str = "error_language_unavailable";
                break;
            default:
                str = "error_unknown (" + errorCode + ')';
                break;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", str);
        jSONObject.put("permanent", true);
        this.f34842C.post(new com.applovin.impl.sdk.nativeAd.e(16, this, jSONObject));
        if (this.f34851h) {
            f(false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // uc.InterfaceC4279p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(uc.C4278o r8, uc.InterfaceC4280q r9) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.C2570h.onMethodCall(uc.o, uc.q):void");
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle results) throws JSONException {
        j(results, false);
    }

    @Override // rc.InterfaceC3964a
    public final void onReattachedToActivityForConfigChanges(InterfaceC3965b binding) {
        AbstractC3340k.e(binding, "binding");
        s1 s1Var = (s1) binding;
        this.f34847d = (Activity) s1Var.f43896a;
        s1Var.d(this);
    }

    @Override // uc.InterfaceC4285v
    public final boolean onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        AbstractC3340k.e(permissions, "permissions");
        AbstractC3340k.e(grantResults, "grantResults");
        if (requestCode != 28521) {
            return false;
        }
        this.f34850g = grantResults.length != 0 && grantResults[0] == 0;
        this.f34855m = grantResults.length == 0 || grantResults.length == 1 || grantResults[1] != 0 || this.f34854l;
        b();
        return true;
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle results) throws JSONException {
        j(results, true);
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(final float rmsdB) {
        if (rmsdB < this.f34840A) {
            this.f34840A = rmsdB;
        }
        if (rmsdB > this.f34841B) {
            this.f34841B = rmsdB;
        }
        c("rmsDB " + this.f34840A + " / " + this.f34841B);
        this.f34842C.post(new Runnable() { // from class: f5.d
            @Override // java.lang.Runnable
            public final void run() {
                C4281r c4281r = this.f34830a.f34845b;
                if (c4281r != null) {
                    c4281r.a("soundLevelChange", Float.valueOf(rmsdB), null);
                }
            }
        });
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] p02) {
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle p02) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int p02, Bundle p12) {
    }
}
