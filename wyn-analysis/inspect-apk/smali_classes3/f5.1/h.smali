.class public final Lf5/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/p;
.implements Landroid/speech/RecognitionListener;
.implements Luc/v;
.implements Lqc/b;
.implements Lrc/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0010\n\u0002\u0010\u0012\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0012\u0010?\u001a\u00020@2\u0008\u0008\u0001\u0010A\u001a\u00020BH\u0016J\u0018\u0010?\u001a\u00020@2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020EH\u0002J\u0012\u0010F\u001a\u00020@2\u0008\u0008\u0001\u0010G\u001a\u00020BH\u0016J\u0008\u0010H\u001a\u00020@H\u0016J\u0010\u0010I\u001a\u00020@2\u0006\u0010G\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020@2\u0006\u0010G\u001a\u00020JH\u0016J\u0008\u0010L\u001a\u00020@H\u0016J\u001c\u0010M\u001a\u00020@2\u0008\u0008\u0001\u0010N\u001a\u00020O2\u0008\u0008\u0001\u0010P\u001a\u00020\u001bH\u0016J\u0010\u0010Q\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010S\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0008\u0010T\u001a\u00020\u0017H\u0002J\u0008\u0010U\u001a\u00020\u0017H\u0002J\u0008\u0010V\u001a\u00020\u0017H\u0002J\u0008\u0010W\u001a\u00020\u0017H\u0002J0\u0010X\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001b2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00172\u0006\u0010[\u001a\u00020\r2\u0006\u0010\\\u001a\u00020\u0017H\u0002J\u0008\u0010]\u001a\u00020@H\u0002J\u0010\u0010^\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010_\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010`\u001a\u00020@2\u0006\u0010R\u001a\u00020\u001bH\u0002J\u0010\u0010a\u001a\u00020@2\u0006\u0010b\u001a\u00020\u0017H\u0002J\u0008\u0010c\u001a\u00020@H\u0002J\u001a\u0010d\u001a\u00020@2\u0008\u0010e\u001a\u0004\u0018\u00010f2\u0006\u0010g\u001a\u00020\u0017H\u0002J\u0010\u0010h\u001a\u00020\u00172\u0006\u0010g\u001a\u00020\u0017H\u0002J\u0012\u0010i\u001a\u00020@2\u0008\u0010j\u001a\u0004\u0018\u00010\tH\u0002J\u0008\u0010k\u001a\u00020@H\u0002J\u0008\u0010l\u001a\u00020@H\u0002J\u000e\u0010m\u001a\u0004\u0018\u00010n*\u00020\tH\u0002J\u0010\u0010o\u001a\u00020@2\u0006\u0010\\\u001a\u00020\u0017H\u0002J(\u0010p\u001a\u00020@2\u0006\u0010Y\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020\u00172\u0006\u0010q\u001a\u0002052\u0006\u0010\\\u001a\u00020\u0017H\u0002J\u0008\u0010r\u001a\u00020@H\u0002J-\u0010s\u001a\u00020\u00172\u0006\u0010t\u001a\u00020\r2\u000e\u0010u\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00150v2\u0006\u0010w\u001a\u00020xH\u0016\u00a2\u0006\u0002\u0010yJ\u0012\u0010z\u001a\u00020@2\u0008\u0010{\u001a\u0004\u0018\u00010fH\u0016J\u0012\u0010|\u001a\u00020@2\u0008\u0010{\u001a\u0004\u0018\u00010fH\u0016J\u0008\u0010}\u001a\u00020@H\u0016J\u0010\u0010~\u001a\u00020@2\u0006\u0010\u007f\u001a\u00020\rH\u0016J\u0012\u0010\u0080\u0001\u001a\u00020@2\u0007\u0010\u0081\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u0082\u0001\u001a\u00020@2\u0007\u0010\u0083\u0001\u001a\u00020\u0015H\u0002J\u0012\u0010\u0084\u0001\u001a\u00020@2\u0007\u0010\u0085\u0001\u001a\u00020:H\u0016J\u0014\u0010\u0086\u0001\u001a\u00020@2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010fH\u0016J\u0015\u0010\u0088\u0001\u001a\u00020@2\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016J\u001d\u0010\u008a\u0001\u001a\u00020@2\u0007\u0010\u0087\u0001\u001a\u00020\r2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010fH\u0016J\t\u0010\u008c\u0001\u001a\u00020@H\u0016R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010,\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010.X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000207X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020:X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020=X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u008d\u0001"
    }
    d2 = {
        "Lcom/csdcorp/speech_to_text/SpeechToTextPlugin;",
        "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;",
        "Landroid/speech/RecognitionListener;",
        "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin;",
        "Lio/flutter/embedding/engine/plugins/activity/ActivityAware;",
        "<init>",
        "()V",
        "pluginContext",
        "Landroid/content/Context;",
        "channel",
        "Lio/flutter/plugin/common/MethodChannel;",
        "minSdkForSpeechSupport",
        "",
        "brokenStopSdk",
        "minSdkForOnDeviceSpeechSupport",
        "speechToTextPermissionCode",
        "missingConfidence",
        "",
        "speechThresholdRms",
        "logTag",
        "",
        "recognizerStops",
        "",
        "currentActivity",
        "Landroid/app/Activity;",
        "activeResult",
        "Lio/flutter/plugin/common/MethodChannel$Result;",
        "initializedSuccessfully",
        "permissionToRecordAudio",
        "listening",
        "debugLogging",
        "alwaysUseStop",
        "intentLookup",
        "noBluetoothOpt",
        "bluetoothDisabled",
        "resultSent",
        "lastOnDevice",
        "speechRecognizer",
        "Landroid/speech/SpeechRecognizer;",
        "recognizerIntent",
        "Landroid/content/Intent;",
        "bluetoothAdapter",
        "Landroid/bluetooth/BluetoothAdapter;",
        "pairedDevices",
        "",
        "Landroid/bluetooth/BluetoothDevice;",
        "activeBluetooth",
        "bluetoothHeadset",
        "Landroid/bluetooth/BluetoothHeadset;",
        "previousRecognizerLang",
        "previousPartialResults",
        "previousListenMode",
        "Lcom/csdcorp/speech_to_text/ListenMode;",
        "lastFinalTime",
        "",
        "speechStartTime",
        "minRms",
        "",
        "maxRms",
        "handler",
        "Landroid/os/Handler;",
        "defaultLanguageTag",
        "onAttachedToEngine",
        "",
        "flutterPluginBinding",
        "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;",
        "applicationContext",
        "messenger",
        "Lio/flutter/plugin/common/BinaryMessenger;",
        "onDetachedFromEngine",
        "binding",
        "onDetachedFromActivity",
        "onReattachedToActivityForConfigChanges",
        "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;",
        "onAttachedToActivity",
        "onDetachedFromActivityForConfigChanges",
        "onMethodCall",
        "call",
        "Lio/flutter/plugin/common/MethodCall;",
        "rawrResult",
        "hasPermission",
        "result",
        "initialize",
        "sdkVersionTooLow",
        "isNotInitialized",
        "isListening",
        "isNotListening",
        "startListening",
        "languageTag",
        "partialResults",
        "listenModeIndex",
        "onDevice",
        "optionallyStartBluetooth",
        "stopListening",
        "cancelListening",
        "locales",
        "notifyListening",
        "isRecording",
        "optionallyStopBluetooth",
        "updateResults",
        "speechBundle",
        "Landroid/os/Bundle;",
        "isFinal",
        "isDuplicateFinal",
        "initializeIfPermitted",
        "context",
        "completeInitialize",
        "setupBluetooth",
        "findComponentName",
        "Landroid/content/ComponentName;",
        "createRecognizer",
        "setupRecognizerIntent",
        "listenMode",
        "destroyRecognizer",
        "onRequestPermissionsResult",
        "requestCode",
        "permissions",
        "",
        "grantResults",
        "",
        "(I[Ljava/lang/String;[I)Z",
        "onPartialResults",
        "results",
        "onResults",
        "onEndOfSpeech",
        "onError",
        "errorCode",
        "debugLog",
        "msg",
        "sendError",
        "errorMsg",
        "onRmsChanged",
        "rmsdB",
        "onReadyForSpeech",
        "p0",
        "onBufferReceived",
        "",
        "onEvent",
        "p1",
        "onBeginningOfSpeech",
        "speech_to_text_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public A:F

.field public B:F

.field public final C:Landroid/os/Handler;

.field public final D:Ljava/lang/String;

.field public a:Landroid/content/Context;

.field public b:Luc/r;

.field public c:Z

.field public d:Landroid/app/Activity;

.field public e:LWa/h;

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:Z

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Landroid/speech/SpeechRecognizer;

.field public q:Landroid/content/Intent;

.field public r:Landroid/bluetooth/BluetoothAdapter;

.field public s:Ljava/util/Set;

.field public t:Landroid/bluetooth/BluetoothDevice;

.field public u:Landroid/bluetooth/BluetoothHeadset;

.field public v:Ljava/lang/String;

.field public w:Z

.field public x:Lf5/b;

.field public y:J

.field public z:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lf5/h;->c:Z

    .line 6
    .line 7
    iput-boolean v0, p0, Lf5/h;->m:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Lf5/h;->w:Z

    .line 10
    .line 11
    sget-object v0, Lf5/b;->a:Lf5/b;

    .line 12
    .line 13
    iput-object v0, p0, Lf5/h;->x:Lf5/b;

    .line 14
    .line 15
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 16
    .line 17
    iput v0, p0, Lf5/h;->A:F

    .line 18
    .line 19
    const/high16 v0, -0x3d380000    # -100.0f

    .line 20
    .line 21
    iput v0, p0, Lf5/h;->B:F

    .line 22
    .line 23
    new-instance v0, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lf5/h;->C:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "toLanguageTag(...)"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lf5/h;->D:Ljava/lang/String;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final a(LWa/h;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lf5/h;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lf5/h;->h:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "Cancel listening"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lf5/h;->C:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v1, Lf5/c;

    .line 18
    .line 19
    const/4 v2, 0x2

    .line 20
    invoke-direct {v1, p0, v2}, Lf5/c;-><init>(Lf5/h;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    iget-boolean v1, p0, Lf5/h;->c:Z

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    new-instance v1, Lf5/c;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, p0, v2}, Lf5/c;-><init>(Lf5/h;I)V

    .line 34
    .line 35
    .line 36
    const-wide/16 v2, 0x32

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0, v0}, Lf5/h;->f(Z)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, LWa/h;->a(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const-string p1, "Cancel listening done"

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, LWa/h;->a(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final b()V
    .locals 8

    .line 1
    const-string v0, "completeInitialize"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lf5/h;->g:Z

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_9

    .line 10
    .line 11
    const-string v0, "Testing recognition availability"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lf5/h;->a:Landroid/content/Context;

    .line 17
    .line 18
    const-string v2, ""

    .line 19
    .line 20
    if-eqz v0, :cond_6

    .line 21
    .line 22
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v4, 0x1f

    .line 25
    .line 26
    const-string v5, "recognizerNotAvailable"

    .line 27
    .line 28
    const-string v6, "SpeechToTextPlugin"

    .line 29
    .line 30
    const-string v7, "Speech recognition not available on this device"

    .line 31
    .line 32
    if-lt v3, v4, :cond_1

    .line 33
    .line 34
    invoke-static {v0}, Landroid/speech/SpeechRecognizer;->isRecognitionAvailable(Landroid/content/Context;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-nez v3, :cond_3

    .line 39
    .line 40
    invoke-static {v0}, Le1/c;->y(Landroid/content/Context;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lf5/h;->e:LWa/h;

    .line 50
    .line 51
    if-eqz v0, :cond_0

    .line 52
    .line 53
    invoke-virtual {v0, v5, v7, v2}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iput-object v1, p0, Lf5/h;->e:LWa/h;

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-static {v0}, Landroid/speech/SpeechRecognizer;->isRecognitionAvailable(Landroid/content/Context;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_3

    .line 64
    .line 65
    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lf5/h;->e:LWa/h;

    .line 69
    .line 70
    if-eqz v0, :cond_2

    .line 71
    .line 72
    invoke-virtual {v0, v5, v7, v2}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    :cond_2
    iput-object v1, p0, Lf5/h;->e:LWa/h;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_3
    iget-boolean v0, p0, Lf5/h;->m:Z

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, Lf5/h;->r:Landroid/bluetooth/BluetoothAdapter;

    .line 88
    .line 89
    if-eqz v0, :cond_5

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    goto :goto_0

    .line 96
    :cond_5
    move-object v0, v1

    .line 97
    :goto_0
    iput-object v0, p0, Lf5/h;->s:Ljava/util/Set;

    .line 98
    .line 99
    new-instance v0, Lf5/g;

    .line 100
    .line 101
    invoke-direct {v0, p0}, Lf5/g;-><init>(Lf5/h;)V

    .line 102
    .line 103
    .line 104
    iget-object v2, p0, Lf5/h;->r:Landroid/bluetooth/BluetoothAdapter;

    .line 105
    .line 106
    if-eqz v2, :cond_9

    .line 107
    .line 108
    iget-object v3, p0, Lf5/h;->a:Landroid/content/Context;

    .line 109
    .line 110
    const/4 v4, 0x1

    .line 111
    invoke-virtual {v2, v3, v0, v4}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_6
    const-string v0, "null context during initialization"

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, p0, Lf5/h;->e:LWa/h;

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 125
    .line 126
    invoke-virtual {v0, v3}, LWa/h;->a(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    :cond_7
    iget-object v0, p0, Lf5/h;->e:LWa/h;

    .line 130
    .line 131
    if-eqz v0, :cond_8

    .line 132
    .line 133
    const-string v3, "missingContext"

    .line 134
    .line 135
    const-string v4, "context unexpectedly null, initialization failed"

    .line 136
    .line 137
    invoke-virtual {v0, v3, v4, v2}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    :cond_8
    iput-object v1, p0, Lf5/h;->e:LWa/h;

    .line 141
    .line 142
    return-void

    .line 143
    :cond_9
    :goto_1
    iget-boolean v0, p0, Lf5/h;->g:Z

    .line 144
    .line 145
    iput-boolean v0, p0, Lf5/h;->f:Z

    .line 146
    .line 147
    const-string v0, "sending result"

    .line 148
    .line 149
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Lf5/h;->e:LWa/h;

    .line 153
    .line 154
    if-eqz v0, :cond_a

    .line 155
    .line 156
    iget-boolean v2, p0, Lf5/h;->g:Z

    .line 157
    .line 158
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-virtual {v0, v2}, LWa/h;->a(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_a
    const-string v0, "leaving complete"

    .line 166
    .line 167
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    iput-object v1, p0, Lf5/h;->e:LWa/h;

    .line 171
    .line 172
    return-void
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lf5/h;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "SpeechToTextPlugin"

    .line 6
    .line 7
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final d(LWa/h;)V
    .locals 5

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, Lf5/h;->j:Z

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v0, v3

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    move v0, v2

    .line 17
    :goto_1
    iput-boolean v0, p0, Lf5/h;->c:Z

    .line 18
    .line 19
    const-string v0, "Start initialize"

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v0, p0, Lf5/h;->e:LWa/h;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    const-string v1, "multipleRequests"

    .line 30
    .line 31
    const-string v2, "Only one initialize at a time"

    .line 32
    .line 33
    invoke-virtual {p1, v1, v2, v0}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    iput-object p1, p0, Lf5/h;->e:LWa/h;

    .line 38
    .line 39
    iget-object p1, p0, Lf5/h;->a:Landroid/content/Context;

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0}, Lf5/h;->b()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    const-string v0, "android.permission.RECORD_AUDIO"

    .line 48
    .line 49
    invoke-static {p1, v0}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-nez v1, :cond_4

    .line 54
    .line 55
    move v1, v2

    .line 56
    goto :goto_2

    .line 57
    :cond_4
    move v1, v3

    .line 58
    :goto_2
    iput-boolean v1, p0, Lf5/h;->g:Z

    .line 59
    .line 60
    const-string v1, "android.permission.BLUETOOTH_CONNECT"

    .line 61
    .line 62
    invoke-static {p1, v1}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-nez p1, :cond_6

    .line 67
    .line 68
    iget-boolean p1, p0, Lf5/h;->l:Z

    .line 69
    .line 70
    if-eqz p1, :cond_5

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    move p1, v3

    .line 74
    goto :goto_4

    .line 75
    :cond_6
    :goto_3
    move p1, v2

    .line 76
    :goto_4
    iput-boolean p1, p0, Lf5/h;->m:Z

    .line 77
    .line 78
    const-string p1, "Checked permission"

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iget-boolean p1, p0, Lf5/h;->g:Z

    .line 84
    .line 85
    if-nez p1, :cond_9

    .line 86
    .line 87
    iget-object p1, p0, Lf5/h;->d:Landroid/app/Activity;

    .line 88
    .line 89
    if-eqz p1, :cond_8

    .line 90
    .line 91
    const-string v4, "Requesting permission"

    .line 92
    .line 93
    invoke-virtual {p0, v4}, Lf5/h;->c(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    new-array v4, v2, [Ljava/lang/String;

    .line 97
    .line 98
    aput-object v0, v4, v3

    .line 99
    .line 100
    iget-boolean v0, p0, Lf5/h;->l:Z

    .line 101
    .line 102
    if-nez v0, :cond_7

    .line 103
    .line 104
    const/4 v0, 0x2

    .line 105
    invoke-static {v4, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    aput-object v1, v0, v2

    .line 110
    .line 111
    move-object v4, v0

    .line 112
    check-cast v4, [Ljava/lang/String;

    .line 113
    .line 114
    :cond_7
    const/16 v0, 0x6f69

    .line 115
    .line 116
    invoke-static {p1, v4, v0}, LX0/b;->a(Landroid/app/Activity;[Ljava/lang/String;I)V

    .line 117
    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_8
    const-string p1, "no permission, no activity, completing"

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Lf5/h;->b()V

    .line 126
    .line 127
    .line 128
    goto :goto_5

    .line 129
    :cond_9
    const-string p1, "has permission, completing"

    .line 130
    .line 131
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p0}, Lf5/h;->b()V

    .line 135
    .line 136
    .line 137
    :goto_5
    const-string p1, "leaving initializeIfPermitted"

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final e(LWa/h;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lf5/h;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.permission.RECORD_AUDIO"

    .line 7
    .line 8
    invoke-static {v0, v1}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 18
    .line 19
    const/16 v2, 0x21

    .line 20
    .line 21
    if-lt v1, v2, :cond_1

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lf5/h;->a:Landroid/content/Context;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Le1/c;->y(Landroid/content/Context;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    new-instance v0, Lkotlin/jvm/internal/G;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lf5/h;->a:Landroid/content/Context;

    .line 42
    .line 43
    invoke-static {v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1}, Le1/c;->g(Landroid/content/Context;)Landroid/speech/SpeechRecognizer;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    const-string v2, "createOnDeviceSpeechRecognizer(...)"

    .line 51
    .line 52
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 56
    .line 57
    new-instance v1, Landroid/content/Intent;

    .line 58
    .line 59
    const-string v2, "android.speech.action.RECOGNIZE_SPEECH"

    .line 60
    .line 61
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, v0, Lkotlin/jvm/internal/G;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Landroid/speech/SpeechRecognizer;

    .line 67
    .line 68
    if-eqz v2, :cond_3

    .line 69
    .line 70
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    new-instance v4, Lf5/f;

    .line 75
    .line 76
    invoke-direct {v4, p1, p0, v0}, Lf5/f;-><init>(LWa/h;Lf5/h;Lkotlin/jvm/internal/G;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v1, v3, v4}, Lea/T;->s(Landroid/speech/SpeechRecognizer;Landroid/content/Intent;Ljava/util/concurrent/ExecutorService;Landroid/speech/RecognitionSupportCallback;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    iget-object v0, p0, Lf5/h;->a:Landroid/content/Context;

    .line 84
    .line 85
    invoke-static {v0}, Landroid/speech/RecognizerIntent;->getVoiceDetailsIntent(Landroid/content/Context;)Landroid/content/Intent;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    if-nez v0, :cond_2

    .line 90
    .line 91
    new-instance v0, Landroid/content/Intent;

    .line 92
    .line 93
    const-string v1, "android.speech.action.GET_LANGUAGE_DETAILS"

    .line 94
    .line 95
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    const-string v1, "com.google.android.googlequicksearchbox"

    .line 99
    .line 100
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 101
    .line 102
    .line 103
    :cond_2
    move-object v3, v0

    .line 104
    iget-object v2, p0, Lf5/h;->a:Landroid/content/Context;

    .line 105
    .line 106
    if-eqz v2, :cond_3

    .line 107
    .line 108
    new-instance v5, Lf5/a;

    .line 109
    .line 110
    iget-boolean v0, p0, Lf5/h;->i:Z

    .line 111
    .line 112
    invoke-direct {v5, p1, v0}, Lf5/a;-><init>(LWa/h;Z)V

    .line 113
    .line 114
    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, -0x1

    .line 117
    const/4 v4, 0x0

    .line 118
    const/4 v8, 0x0

    .line 119
    const/4 v9, 0x0

    .line 120
    invoke-virtual/range {v2 .. v9}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V

    .line 121
    .line 122
    .line 123
    :cond_3
    return-void
.end method

.method public final f(Z)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lf5/h;->h:Z

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_3

    .line 6
    :cond_0
    iput-boolean p1, p0, Lf5/h;->h:Z

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    if-ne p1, v0, :cond_1

    .line 10
    .line 11
    const-string v0, "listening"

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_1
    if-nez p1, :cond_7

    .line 15
    .line 16
    const-string v0, "notListening"

    .line 17
    .line 18
    :goto_0
    const-string v1, "Notify status:"

    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0, v2}, Lf5/h;->c(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object v2, p0, Lf5/h;->b:Luc/r;

    .line 28
    .line 29
    const-string v3, "notifyStatus"

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {v2, v3, v0, v4}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    if-nez p1, :cond_6

    .line 38
    .line 39
    iget-boolean p1, p0, Lf5/h;->n:Z

    .line 40
    .line 41
    if-nez p1, :cond_3

    .line 42
    .line 43
    const-string p1, "doneNoResult"

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    const-string p1, "done"

    .line 47
    .line 48
    :goto_1
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-boolean v0, p0, Lf5/h;->m:Z

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_4
    iget-object v0, p0, Lf5/h;->t:Landroid/bluetooth/BluetoothDevice;

    .line 61
    .line 62
    iget-object v1, p0, Lf5/h;->u:Landroid/bluetooth/BluetoothHeadset;

    .line 63
    .line 64
    if-eqz v0, :cond_5

    .line 65
    .line 66
    if-eqz v1, :cond_5

    .line 67
    .line 68
    const-string v2, "Stopping bluetooth voice recognition"

    .line 69
    .line 70
    invoke-virtual {p0, v2}, Lf5/h;->c(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v0}, Landroid/bluetooth/BluetoothHeadset;->stopVoiceRecognition(Landroid/bluetooth/BluetoothDevice;)Z

    .line 74
    .line 75
    .line 76
    iput-object v4, p0, Lf5/h;->t:Landroid/bluetooth/BluetoothDevice;

    .line 77
    .line 78
    :cond_5
    :goto_2
    iget-object v0, p0, Lf5/h;->b:Luc/r;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    invoke-virtual {v0, v3, p1, v4}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 83
    .line 84
    .line 85
    :cond_6
    :goto_3
    return-void

    .line 86
    :cond_7
    new-instance p1, LE5/Q;

    .line 87
    .line 88
    const/16 v0, 0x9

    .line 89
    .line 90
    const/4 v1, 0x0

    .line 91
    invoke-direct {p1, v1, v0}, LE5/Q;-><init>(BI)V

    .line 92
    .line 93
    .line 94
    throw p1
.end method

.method public final g(Ljava/lang/String;ZLf5/b;Z)V
    .locals 1

    .line 1
    const-string v0, "setupRecognizerIntent"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lf5/h;->v:Ljava/lang/String;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    iget-boolean v0, p0, Lf5/h;->w:Z

    .line 17
    .line 18
    if-ne p2, v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lf5/h;->x:Lf5/b;

    .line 21
    .line 22
    if-eq v0, p3, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void

    .line 26
    :cond_1
    :goto_0
    iput-object p1, p0, Lf5/h;->v:Ljava/lang/String;

    .line 27
    .line 28
    iput-boolean p2, p0, Lf5/h;->w:Z

    .line 29
    .line 30
    iput-object p3, p0, Lf5/h;->x:Lf5/b;

    .line 31
    .line 32
    iget-object p3, p0, Lf5/h;->C:Landroid/os/Handler;

    .line 33
    .line 34
    new-instance v0, Lf5/e;

    .line 35
    .line 36
    invoke-direct {v0, p0, p2, p1, p4}, Lf5/e;-><init>(Lf5/h;ZLjava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final h(LWa/h;Ljava/lang/String;ZIZ)V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lf5/h;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    iget-boolean v0, p0, Lf5/h;->h:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lf5/h;->n:Z

    .line 13
    .line 14
    iget-object v1, p0, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 15
    .line 16
    iget-object v2, p0, Lf5/h;->C:Landroid/os/Handler;

    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget-boolean v4, p0, Lf5/h;->o:Z

    .line 22
    .line 23
    if-ne p5, v4, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    iput-boolean p5, p0, Lf5/h;->o:Z

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/speech/SpeechRecognizer;->destroy()V

    .line 31
    .line 32
    .line 33
    :cond_2
    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lf5/h;->p:Landroid/speech/SpeechRecognizer;

    .line 35
    .line 36
    new-instance v1, LG5/o;

    .line 37
    .line 38
    const/4 v4, 0x4

    .line 39
    invoke-direct {v1, v4, p0, p5}, LG5/o;-><init>(ILjava/lang/Object;Z)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 43
    .line 44
    .line 45
    const-string v1, "before setup intent"

    .line 46
    .line 47
    invoke-virtual {p0, v1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, Lf5/b;->a:Lf5/b;

    .line 51
    .line 52
    iget-object v4, p0, Lf5/h;->D:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {p0, v4, v3, v1, v0}, Lf5/h;->g(Ljava/lang/String;ZLf5/b;Z)V

    .line 55
    .line 56
    .line 57
    const-string v0, "after setup intent"

    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 63
    .line 64
    iput v0, p0, Lf5/h;->A:F

    .line 65
    .line 66
    const/high16 v0, -0x3d380000    # -100.0f

    .line 67
    .line 68
    iput v0, p0, Lf5/h;->B:F

    .line 69
    .line 70
    const-string v0, "Start listening"

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lf5/b;->a:Lf5/b;

    .line 76
    .line 77
    sget-object v1, Lf5/b;->b:Lf5/b;

    .line 78
    .line 79
    if-ne p4, v3, :cond_3

    .line 80
    .line 81
    move-object v0, v1

    .line 82
    :cond_3
    iget-boolean p4, p0, Lf5/h;->m:Z

    .line 83
    .line 84
    if-eqz p4, :cond_4

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_4
    iget-object p4, p0, Lf5/h;->r:Landroid/bluetooth/BluetoothAdapter;

    .line 88
    .line 89
    iget-object v1, p0, Lf5/h;->s:Ljava/util/Set;

    .line 90
    .line 91
    iget-object v4, p0, Lf5/h;->u:Landroid/bluetooth/BluetoothHeadset;

    .line 92
    .line 93
    if-eqz p4, :cond_6

    .line 94
    .line 95
    if-eqz v4, :cond_6

    .line 96
    .line 97
    if-eqz v1, :cond_6

    .line 98
    .line 99
    invoke-virtual {p4}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    .line 100
    .line 101
    .line 102
    move-result p4

    .line 103
    if-eqz p4, :cond_6

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object p4

    .line 109
    :cond_5
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-eqz v1, :cond_6

    .line 114
    .line 115
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    .line 120
    .line 121
    invoke-virtual {v4, v1}, Landroid/bluetooth/BluetoothHeadset;->startVoiceRecognition(Landroid/bluetooth/BluetoothDevice;)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_5

    .line 126
    .line 127
    const-string p4, "Starting bluetooth voice recognition"

    .line 128
    .line 129
    invoke-virtual {p0, p4}, Lf5/h;->c(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    iput-object v1, p0, Lf5/h;->t:Landroid/bluetooth/BluetoothDevice;

    .line 133
    .line 134
    :cond_6
    :goto_1
    invoke-virtual {p0, p2, p3, v0, p5}, Lf5/h;->g(Ljava/lang/String;ZLf5/b;Z)V

    .line 135
    .line 136
    .line 137
    new-instance p2, Lf5/c;

    .line 138
    .line 139
    const/4 p3, 0x1

    .line 140
    invoke-direct {p2, p0, p3}, Lf5/c;-><init>(Lf5/h;I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, p2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 144
    .line 145
    .line 146
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 147
    .line 148
    .line 149
    move-result-wide p2

    .line 150
    iput-wide p2, p0, Lf5/h;->z:J

    .line 151
    .line 152
    invoke-virtual {p0, v3}, Lf5/h;->f(Z)V

    .line 153
    .line 154
    .line 155
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-virtual {p1, p2}, LWa/h;->a(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    const-string p1, "Start listening done"

    .line 161
    .line 162
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :cond_7
    :goto_2
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 167
    .line 168
    invoke-virtual {p1, p2}, LWa/h;->a(Ljava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    return-void
.end method

.method public final i(LWa/h;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lf5/h;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    iget-boolean v0, p0, Lf5/h;->h:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, "Stop listening"

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lf5/h;->C:Landroid/os/Handler;

    .line 16
    .line 17
    new-instance v1, Lf5/c;

    .line 18
    .line 19
    const/4 v2, 0x3

    .line 20
    invoke-direct {v1, p0, v2}, Lf5/c;-><init>(Lf5/h;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    iget-boolean v1, p0, Lf5/h;->c:Z

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    new-instance v1, Lf5/c;

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {v1, p0, v2}, Lf5/c;-><init>(Lf5/h;I)V

    .line 34
    .line 35
    .line 36
    const-wide/16 v2, 0x32

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 39
    .line 40
    .line 41
    :cond_1
    const/4 v0, 0x0

    .line 42
    invoke-virtual {p0, v0}, Lf5/h;->f(Z)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, LWa/h;->a(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    const-string p1, "Stop listening done"

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 57
    .line 58
    invoke-virtual {p1, v0}, LWa/h;->a(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final j(Landroid/os/Bundle;Z)V
    .locals 10

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    iget-wide v2, p0, Lf5/h;->y:J

    .line 9
    .line 10
    sub-long/2addr v0, v2

    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    iput-wide v2, p0, Lf5/h;->y:J

    .line 16
    .line 17
    const-wide/16 v2, 0x0

    .line 18
    .line 19
    cmp-long v2, v0, v2

    .line 20
    .line 21
    if-ltz v2, :cond_1

    .line 22
    .line 23
    const-wide/16 v2, 0x64

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-gez v0, :cond_1

    .line 28
    .line 29
    const-string p1, "Discarding duplicate final"

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 36
    if-eqz p1, :cond_2

    .line 37
    .line 38
    const-string v1, "results_recognition"

    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move-object v1, v0

    .line 46
    :goto_1
    if-eqz v1, :cond_6

    .line 47
    .line 48
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_6

    .line 53
    .line 54
    new-instance v2, Lorg/json/JSONObject;

    .line 55
    .line 56
    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v3, "finalResult"

    .line 60
    .line 61
    invoke-virtual {v2, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    const-string p2, "confidence_scores"

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getFloatArray(Ljava/lang/String;)[F

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    new-instance p2, Lorg/json/JSONArray;

    .line 71
    .line 72
    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    const/4 v4, 0x1

    .line 80
    sub-int/2addr v3, v4

    .line 81
    if-ltz v3, :cond_4

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    :goto_2
    new-instance v6, Lorg/json/JSONObject;

    .line 85
    .line 86
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 87
    .line 88
    .line 89
    const-string v7, "recognizedWords"

    .line 90
    .line 91
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    .line 98
    const-string v7, "confidence"

    .line 99
    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    array-length v8, p1

    .line 103
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v9

    .line 107
    if-lt v8, v9, :cond_3

    .line 108
    .line 109
    aget v8, p1, v5

    .line 110
    .line 111
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    const-wide/high16 v8, -0x4010000000000000L    # -1.0

    .line 120
    .line 121
    invoke-virtual {v6, v7, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    .line 122
    .line 123
    .line 124
    :goto_3
    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 125
    .line 126
    .line 127
    if-eq v5, v3, :cond_4

    .line 128
    .line 129
    add-int/lit8 v5, v5, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_4
    const-string p1, "alternates"

    .line 133
    .line 134
    invoke-virtual {v2, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    const-string p2, "toString(...)"

    .line 142
    .line 143
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    const-string p2, "Calling results callback"

    .line 147
    .line 148
    invoke-virtual {p0, p2}, Lf5/h;->c(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iput-boolean v4, p0, Lf5/h;->n:Z

    .line 152
    .line 153
    iget-object p2, p0, Lf5/h;->b:Luc/r;

    .line 154
    .line 155
    if-eqz p2, :cond_5

    .line 156
    .line 157
    const-string v1, "textRecognition"

    .line 158
    .line 159
    invoke-virtual {p2, v1, p1, v0}, Luc/r;->a(Ljava/lang/String;Ljava/lang/Object;Luc/q;)V

    .line 160
    .line 161
    .line 162
    :cond_5
    return-void

    .line 163
    :cond_6
    const-string p1, "Results null or empty"

    .line 164
    .line 165
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return-void
.end method

.method public final onAttachedToActivity(Lrc/b;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lq/s1;

    .line 7
    .line 8
    iget-object v0, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/app/Activity;

    .line 11
    .line 12
    iput-object v0, p0, Lf5/h;->d:Landroid/app/Activity;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lq/s1;->d(Luc/v;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onAttachedToEngine(Lqc/a;)V
    .locals 2

    .line 1
    const-string v0, "flutterPluginBinding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, Lqc/a;->a:Landroid/content/Context;

    .line 7
    .line 8
    const-string v1, "getApplicationContext(...)"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p1, Lqc/a;->c:Luc/f;

    .line 14
    .line 15
    const-string v1, "getBinaryMessenger(...)"

    .line 16
    .line 17
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lf5/h;->a:Landroid/content/Context;

    .line 21
    .line 22
    new-instance v0, Luc/r;

    .line 23
    .line 24
    const-string v1, "plugin.csdcorp.com/speech_to_text"

    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Luc/r;-><init>(Luc/f;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lf5/h;->b:Luc/r;

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Luc/r;->b(Luc/p;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public final onBeginningOfSpeech()V
    .locals 0

    .line 1
    return-void
.end method

.method public final onBufferReceived([B)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onDetachedFromActivity()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lf5/h;->d:Landroid/app/Activity;

    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromActivityForConfigChanges()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lf5/h;->d:Landroid/app/Activity;

    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromEngine(Lqc/a;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Lf5/h;->a:Landroid/content/Context;

    .line 8
    .line 9
    iget-object v0, p0, Lf5/h;->b:Luc/r;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Luc/r;->b(Luc/p;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-object p1, p0, Lf5/h;->b:Luc/r;

    .line 17
    .line 18
    return-void
.end method

.method public final onEndOfSpeech()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lf5/h;->f(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onError(I)V
    .locals 5

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lf5/h;->z:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const/4 v2, 0x7

    .line 9
    if-ne v2, p1, :cond_0

    .line 10
    .line 11
    iget v2, p0, Lf5/h;->B:F

    .line 12
    .line 13
    const/16 v3, 0x9

    .line 14
    .line 15
    int-to-float v3, v3

    .line 16
    cmpg-float v2, v2, v3

    .line 17
    .line 18
    if-gez v2, :cond_0

    .line 19
    .line 20
    const/4 v2, 0x6

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, p1

    .line 23
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v4, "Error "

    .line 26
    .line 27
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v4, " after start at "

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const/16 v0, 0x20

    .line 42
    .line 43
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget v0, p0, Lf5/h;->A:F

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, " / "

    .line 52
    .line 53
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    iget v0, p0, Lf5/h;->B:F

    .line 57
    .line 58
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    packed-switch v2, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v1, "error_unknown ("

    .line 74
    .line 75
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 p1, 0x29

    .line 82
    .line 83
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    goto :goto_1

    .line 91
    :pswitch_0
    const-string p1, "error_language_unavailable"

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :pswitch_1
    const-string p1, "error_language_not_supported"

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :pswitch_2
    const-string p1, "error_server_disconnected"

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :pswitch_3
    const-string p1, "error_too_many_requests"

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :pswitch_4
    const-string p1, "error_permission"

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :pswitch_5
    const-string p1, "error_busy"

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_6
    const-string p1, "error_no_match"

    .line 110
    .line 111
    goto :goto_1

    .line 112
    :pswitch_7
    const-string p1, "error_speech_timeout"

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :pswitch_8
    const-string p1, "error_client"

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :pswitch_9
    const-string p1, "error_server"

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :pswitch_a
    const-string p1, "error_audio_error"

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_b
    const-string p1, "error_network"

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :pswitch_c
    const-string p1, "error_network_timeout"

    .line 128
    .line 129
    :goto_1
    new-instance v0, Lorg/json/JSONObject;

    .line 130
    .line 131
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 132
    .line 133
    .line 134
    const-string v1, "errorMsg"

    .line 135
    .line 136
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    .line 138
    .line 139
    const-string p1, "permanent"

    .line 140
    .line 141
    const/4 v1, 0x1

    .line 142
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lf5/h;->C:Landroid/os/Handler;

    .line 146
    .line 147
    new-instance v1, Lcom/applovin/impl/sdk/nativeAd/e;

    .line 148
    .line 149
    const/16 v2, 0x10

    .line 150
    .line 151
    invoke-direct {v1, v2, p0, v0}, Lcom/applovin/impl/sdk/nativeAd/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 155
    .line 156
    .line 157
    iget-boolean p1, p0, Lf5/h;->h:Z

    .line 158
    .line 159
    if-eqz p1, :cond_1

    .line 160
    .line 161
    const/4 p1, 0x0

    .line 162
    invoke-virtual {p0, p1}, Lf5/h;->f(Z)V

    .line 163
    .line 164
    .line 165
    :cond_1
    return-void

    .line 166
    nop

    .line 167
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final onEvent(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onMethodCall(Luc/o;Luc/q;)V
    .locals 7

    .line 1
    const-string v0, "call"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v2, LWa/h;

    .line 7
    .line 8
    check-cast p2, Ltc/g;

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-direct {v2, p2, v0}, LWa/h;-><init>(Ltc/g;I)V

    .line 12
    .line 13
    .line 14
    :try_start_0
    iget-object p2, p1, Luc/o;->a:Ljava/lang/String;

    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 22
    sparse-switch v0, :sswitch_data_0

    .line 23
    .line 24
    .line 25
    :cond_0
    :goto_0
    move-object v1, p0

    .line 26
    goto/16 :goto_4

    .line 27
    .line 28
    :sswitch_0
    :try_start_1
    const-string v0, "initialize"

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    if-nez p2, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const-string p2, "debugLogging"

    .line 38
    .line 39
    invoke-virtual {p1, p2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    check-cast p2, Ljava/lang/Boolean;

    .line 44
    .line 45
    if-eqz p2, :cond_2

    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 48
    .line 49
    .line 50
    move-result p2

    .line 51
    iput-boolean p2, p0, Lf5/h;->i:Z

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :catch_0
    move-exception v0

    .line 55
    move-object p1, v0

    .line 56
    move-object v1, p0

    .line 57
    goto/16 :goto_5

    .line 58
    .line 59
    :cond_2
    :goto_1
    const-string p2, "alwaysUseStop"

    .line 60
    .line 61
    invoke-virtual {p1, p2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p2, Ljava/lang/Boolean;

    .line 66
    .line 67
    if-eqz p2, :cond_3

    .line 68
    .line 69
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    iput-boolean p2, p0, Lf5/h;->j:Z

    .line 76
    .line 77
    :cond_3
    const-string p2, "intentLookup"

    .line 78
    .line 79
    invoke-virtual {p1, p2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    check-cast p2, Ljava/lang/Boolean;

    .line 84
    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    iput-boolean p2, p0, Lf5/h;->k:Z

    .line 94
    .line 95
    :cond_4
    const-string p2, "noBluetooth"

    .line 96
    .line 97
    invoke-virtual {p1, p2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, Ljava/lang/Boolean;

    .line 102
    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    iput-boolean p1, p0, Lf5/h;->l:Z

    .line 112
    .line 113
    :cond_5
    invoke-virtual {p0, v2}, Lf5/h;->d(LWa/h;)V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :sswitch_1
    const-string p1, "locales"

    .line 118
    .line 119
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    if-nez p1, :cond_6

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_6
    invoke-virtual {p0, v2}, Lf5/h;->e(LWa/h;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :sswitch_2
    const-string p1, "stop"

    .line 131
    .line 132
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_7

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_7
    invoke-virtual {p0, v2}, Lf5/h;->i(LWa/h;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :sswitch_3
    :try_start_2
    const-string v0, "listen"

    .line 144
    .line 145
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    if-nez p2, :cond_8

    .line 150
    .line 151
    goto :goto_0

    .line 152
    :cond_8
    const-string p2, "localeId"

    .line 153
    .line 154
    invoke-virtual {p1, p2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p2

    .line 158
    check-cast p2, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 159
    .line 160
    if-nez p2, :cond_9

    .line 161
    .line 162
    :try_start_3
    iget-object p2, p0, Lf5/h;->D:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 163
    .line 164
    :cond_9
    const/16 v0, 0x5f

    .line 165
    .line 166
    const/16 v1, 0x2d

    .line 167
    .line 168
    :try_start_4
    invoke-static {p2, v0, v1}, LBf/r;->i0(Ljava/lang/String;CC)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    const-string p2, "partialResults"

    .line 173
    .line 174
    invoke-virtual {p1, p2}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object p2

    .line 178
    check-cast p2, Ljava/lang/Boolean;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    .line 179
    .line 180
    if-nez p2, :cond_a

    .line 181
    .line 182
    :try_start_5
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 183
    .line 184
    :cond_a
    :try_start_6
    const-string v0, "onDevice"

    .line 185
    .line 186
    invoke-virtual {p1, v0}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, Ljava/lang/Boolean;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    .line 191
    .line 192
    if-nez v0, :cond_b

    .line 193
    .line 194
    :try_start_7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    .line 195
    .line 196
    :cond_b
    :try_start_8
    const-string v1, "listenMode"

    .line 197
    .line 198
    invoke-virtual {p1, v1}, Luc/o;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    check-cast p1, Ljava/lang/Integer;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 203
    .line 204
    if-nez p1, :cond_c

    .line 205
    .line 206
    :try_start_9
    const-string p1, "missingOrInvalidArg"

    .line 207
    .line 208
    const-string p2, "listenMode is required"

    .line 209
    .line 210
    const/4 v0, 0x0

    .line 211
    invoke-virtual {v2, p1, p2, v0}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_c
    :try_start_a
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 224
    .line 225
    .line 226
    move-result v6
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_1

    .line 227
    move-object v1, p0

    .line 228
    :try_start_b
    invoke-virtual/range {v1 .. v6}, Lf5/h;->h(LWa/h;Ljava/lang/String;ZIZ)V

    .line 229
    .line 230
    .line 231
    return-void

    .line 232
    :catch_1
    move-exception v0

    .line 233
    move-object v1, p0

    .line 234
    :goto_2
    move-object p1, v0

    .line 235
    goto :goto_5

    .line 236
    :sswitch_4
    move-object v1, p0

    .line 237
    const-string p1, "has_permission"

    .line 238
    .line 239
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result p1

    .line 243
    if-nez p1, :cond_d

    .line 244
    .line 245
    goto :goto_4

    .line 246
    :cond_d
    const-string p1, "Start has_permission"

    .line 247
    .line 248
    invoke-virtual {p0, p1}, Lf5/h;->c(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    iget-object p1, v1, Lf5/h;->a:Landroid/content/Context;

    .line 252
    .line 253
    if-eqz p1, :cond_10

    .line 254
    .line 255
    const-string p2, "android.permission.RECORD_AUDIO"

    .line 256
    .line 257
    invoke-static {p1, p2}, LY0/e;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 258
    .line 259
    .line 260
    move-result p1

    .line 261
    if-nez p1, :cond_e

    .line 262
    .line 263
    const/4 p1, 0x1

    .line 264
    goto :goto_3

    .line 265
    :cond_e
    const/4 p1, 0x0

    .line 266
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-virtual {v2, p1}, LWa/h;->a(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :catch_2
    move-exception v0

    .line 275
    goto :goto_2

    .line 276
    :sswitch_5
    move-object v1, p0

    .line 277
    const-string p1, "cancel"

    .line 278
    .line 279
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result p1

    .line 283
    if-nez p1, :cond_f

    .line 284
    .line 285
    goto :goto_4

    .line 286
    :cond_f
    invoke-virtual {p0, v2}, Lf5/h;->a(LWa/h;)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    :goto_4
    invoke-virtual {v2}, LWa/h;->c()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_2

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :goto_5
    const-string p2, "SpeechToTextPlugin"

    .line 295
    .line 296
    const-string v0, "Unexpected exception"

    .line 297
    .line 298
    invoke-static {p2, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 299
    .line 300
    .line 301
    const-string p2, "unknown"

    .line 302
    .line 303
    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object p1

    .line 307
    invoke-virtual {v2, p2, v0, p1}, LWa/h;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    :cond_10
    return-void

    .line 311
    :sswitch_data_0
    .sparse-switch
        -0x5185d186 -> :sswitch_5
        -0x476f3b6c -> :sswitch_4
        -0x41b6f239 -> :sswitch_3
        0x360802 -> :sswitch_2
        0x142bbd59 -> :sswitch_1
        0x33ebcb90 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onPartialResults(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lf5/h;->j(Landroid/os/Bundle;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onReadyForSpeech(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onReattachedToActivityForConfigChanges(Lrc/b;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lq/s1;

    .line 7
    .line 8
    iget-object v0, p1, Lq/s1;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Landroid/app/Activity;

    .line 11
    .line 12
    iput-object v0, p0, Lf5/h;->d:Landroid/app/Activity;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Lq/s1;->d(Luc/v;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    .line 1
    const-string v0, "permissions"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "grantResults"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/16 p2, 0x6f69

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    if-ne p1, p2, :cond_5

    .line 15
    .line 16
    array-length p1, p3

    .line 17
    const/4 p2, 0x1

    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    aget p1, p3, v0

    .line 22
    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    move p1, p2

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    :goto_0
    move p1, v0

    .line 28
    :goto_1
    iput-boolean p1, p0, Lf5/h;->g:Z

    .line 29
    .line 30
    array-length p1, p3

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :cond_2
    array-length p1, p3

    .line 35
    if-eq p1, p2, :cond_3

    .line 36
    .line 37
    aget p1, p3, p2

    .line 38
    .line 39
    if-nez p1, :cond_3

    .line 40
    .line 41
    iget-boolean p1, p0, Lf5/h;->l:Z

    .line 42
    .line 43
    if-eqz p1, :cond_4

    .line 44
    .line 45
    :cond_3
    :goto_2
    move v0, p2

    .line 46
    :cond_4
    iput-boolean v0, p0, Lf5/h;->m:Z

    .line 47
    .line 48
    invoke-virtual {p0}, Lf5/h;->b()V

    .line 49
    .line 50
    .line 51
    return p2

    .line 52
    :cond_5
    return v0
.end method

.method public final onResults(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, v0}, Lf5/h;->j(Landroid/os/Bundle;Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final onRmsChanged(F)V
    .locals 2

    .line 1
    iget v0, p0, Lf5/h;->A:F

    .line 2
    .line 3
    cmpg-float v0, p1, v0

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lf5/h;->A:F

    .line 8
    .line 9
    :cond_0
    iget v0, p0, Lf5/h;->B:F

    .line 10
    .line 11
    cmpl-float v0, p1, v0

    .line 12
    .line 13
    if-lez v0, :cond_1

    .line 14
    .line 15
    iput p1, p0, Lf5/h;->B:F

    .line 16
    .line 17
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string v1, "rmsDB "

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget v1, p0, Lf5/h;->A:F

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v1, " / "

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget v1, p0, Lf5/h;->B:F

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p0, v0}, Lf5/h;->c(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lf5/h;->C:Landroid/os/Handler;

    .line 47
    .line 48
    new-instance v1, Lf5/d;

    .line 49
    .line 50
    invoke-direct {v1, p0, p1}, Lf5/d;-><init>(Lf5/h;F)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method
